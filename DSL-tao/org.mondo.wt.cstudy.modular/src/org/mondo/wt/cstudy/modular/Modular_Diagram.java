
package org.mondo.wt.cstudy.modular;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.mondo.wt.cstudy.modular.wizard.WTNewProjectInfo;
import org.mondo.wt.cstudy.modular.wizard.WTProjectFeatures;
import org.osgi.service.prefs.BackingStoreException;


import WTSpec4M.WT;
import WTSpec4M.impl.WTSpec4MFactoryImpl;
import WTSpec4M.impl.CollectionInputOutputImpl;
import WTSpec4M.impl.MainSubsystemImpl;

public class Modular_Diagram {
	
	public Modular_Diagram(){}

	private String projectName;	
	
	public void Create_Modular_Diagram(IProject pro, org.eclipse.emf.common.util.URI uri_diagram) throws CoreException, IOException
	{
		//Create Resource and ResourceSet
		ResourceSet reset = new ResourceSetImpl();
		ResourceSet newreset = new ResourceSetImpl();
		
		//Search the root
		IFile file = pro.getFile(pro.getName().concat(".xmi"));
		PerformantXMIResourceImpl file_xmi = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
										createResource(URI.createFileURI(file.getFullPath().toString()));
		
		reset.getResources().add(file_xmi);
		Copier copier = new Copier();
		
		PerformantXMIResourceImpl diagram = (PerformantXMIResourceImpl)new PerformantXMIResourceFactoryImpl().
												createResource(uri_diagram);	
		newreset.getResources().add(diagram);
		
		file_xmi.load(null);		
		diagram.getContents().addAll(copier.copyAll(file_xmi.getContents()));
		copier.copyReferences();
		//diagram.save(null);
		
		//If the root use extrinsic Id
		//Use Extrinsic ID
		/*
		String id = file_xmi.getID(file_xmi.Get_Root());
		if(id!=null)
		{		
			for (EObject oldObject : copier.keySet()) {
				 EObject newObject = copier.get(oldObject);
				 String idObject = file_xmi.getID(oldObject);
				 if (idObject == null) {
					URI uri = EcoreUtil.getURI(oldObject);				
					idObject = uri.fragment();				 
				 }    
				 diagram.setID(newObject,idObject);
			}
		}
		*/
		diagram.save(null);			
	}
	
	private EObject eObject_root = null;
	private PerformantXMIResourceImpl filemodel;
	private EObject eObject;
	private WTNewProjectInfo project = null;
	
	public void Reverse_Engineering(URI fileURI) throws IOException, CoreException, BackingStoreException
	{
		//Cambie
		//String plugin_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getAbsolutePath();
		
		
		//Create Performant Resource
				filemodel = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
															createResource(fileURI);
				filemodel.load(null); 
				WT root = (WT) filemodel.Get_Root();
				WTProjectFeatures feat = new WTProjectFeatures(
						root.getSysId(),
						root.getModel(),
						root.getVersion()
						);
				project = new WTNewProjectInfo(feat);
				String id = filemodel.getID(root);
				//if(id!=null)
				//	project.setIdObjectroot(id);
				project.Create_Project();
				//Get the Project Name
				projectName = project.getProject().getName();
				
				//Folders & Files
				TreeIterator<EObject> model_tree = filemodel.getAllContents();
				
				String path = "";
				URI path_uri = null;
				URI parent_uri = null;
				IFolder fol = null;
				IContainer parent = null;
				PerformantXMIResourceImpl xmi_file = null;	
				PerformantXMIResourceImpl xmi_parent = null;
				eObject = null;	
				eObject_root = null;
				String name_folder = null;
				String ext_file = null;
				
				model_tree.next();//The first element(Root) was added already
				int borrar = 1;
				Copier copier = null;
				while (model_tree.hasNext()) {
						
					eObject = (EObject) model_tree.next();
							
					//Parent path
					path = GetObjectPath(eObject);

					//Folders
					name_folder = IsFolder(eObject);	
					if(name_folder!=null)			
					{
						//Create Folder
						fol = project.Create_Folder(path);
						parent = fol.getParent();
						//Path to Create XMI File
						path = path.concat(name_folder.concat(".xmi"));//concat("/")
						//Create File for Folder
						//cambie!
						path_uri = URI.createPlatformResourceURI(project.getProject().getFullPath().toString().concat(path),true);
						//path_uri = URI.createFileURI(new File(plugin_path.concat("/" + projectName ).concat(path)).getAbsolutePath());
						eObject_root = GetObjectRoot(filemodel,root,eObject);	
						//System.out.println("Test");	
					}	
					else
					{	
						//Files
						parent = project.Create_Folder(path);
						ext_file = IsFile(eObject); 				
						/*
						if(eObject instanceof MainSubsystemImpl)
							path = path.concat(((MainSubsystemImpl)eObject).getSysId().toString().concat(".subsystem"));
						if(eObject instanceof SystemInputImpl)
							path = path.concat(((SystemInputImpl)eObject).getSysId().toString()).concat(".input");
						if(eObject instanceof SystemOutputImpl)
							path = path.concat(((SystemOutputImpl)eObject).getSysId().toString().concat(".output"));
						if(eObject instanceof SystemVariableImpl)
							path = path.concat(((SystemVariableImpl)eObject).getSysId().toString().concat(".variable"));
						*/
						
						if(ext_file!=null)
							path = path.concat(ext_file);				
						//Create File
						//Cambie!
						path_uri = URI.createPlatformResourceURI(project.getProject().getFullPath().toString().concat(path),true);
						//path_uri = URI.createFileURI(new File(plugin_path.concat("/" + projectName ).concat(path)).getAbsolutePath());
						//File
						//If use Extrinsic ID change copy references
						if(ext_file!=null){
							copier = new Copier(true,true){

								@Override
								protected void copyReference(EReference eReference,
										EObject eObject, EObject copyEObject) {
									// TODO Auto-generated method stub
									//super.copyReference(eReference, eObject, copyEObject);
									Object aux = eObject.eGet(eReference);
									if(aux instanceof EObject)
									{
										EObject aux_eobject = (EObject) aux;
										String path = UpdateCrossReferenceFile(aux_eobject);
										//First Option
										EObject  neweObject = WTSpec4MFactoryImpl.eINSTANCE.create(((EObject) aux).eClass());
										((InternalEObject)neweObject).eSetProxyURI(URI.createURI(path));
										//EStore asd = ((InternalEObject)neweObject).eStore();
										//Second Option
										//Resource res = new ResourceImpl(URI.createURI(path));
										//EObject obj = res.getContents().get(0);
										
											copyEObject.eSet(eReference, neweObject);
											//System.out.println(path);
																			
									}
									//System.out.println("Copiando las referencias!!");/**/
								}
								
							};
							eObject_root = copier.copy(eObject);
							//if(borrar==1){
							copier.copyReferences();//inputi_input1
							//borrar = borrar +1;
							//}
							
							model_tree.prune();
						}
					}
					
					if(ext_file==null && name_folder==null)
					{
						//System.out.println(eObject.toString());
						//Copy the eobject
						copier = new Copier(true,true);
						EObject eObject_object = copier.copy(eObject);
						copier.copyReferences();
						//Include Parent
						//Cambie!
						//parent_uri = URI.createPlatformResourceURI(parent.getFullPath().toString().concat("/"+parent.getName().concat(".xmi")),true);
						//parent.getFullPath();
						parent_uri = URI.createPlatformResourceURI(parent.getName().toString().concat("/"+parent.getName().concat(".xmi")),true);
						//parent_uri = URI.createFileURI(parent.getFullPath().toString().concat("/"+parent.getName().concat(".xmi")));
						xmi_parent = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
											createResource(parent_uri);
						xmi_parent.load(null);
						String aux = eObject.eContainingFeature().toString();
						((EList<EObject>)xmi_parent.Get_Root().eGet(eObject.eContainingFeature())).add(eObject_object);
						xmi_parent.save(null);
						xmi_parent.unload();
					}
					else
					{
						//Create XMI File
						xmi_file = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
											Get_Create_XMI(path_uri, eObject_root);
						//if(copier!=null){
						//	 for (EObject oldObject : copier.keySet()) {
						//		 EObject newObject = copier.get(oldObject);
						//		 String idObject = filemodel.getID(oldObject);
								 /*if (idObject == null)      System.out.println("Se ha perdido un id" + newObject.toString());*/
						//		 xmi_file.setID(newObject,idObject);
						//	 }
						//	 xmi_file.save(null);
						//}
						//else
						//{
						//	String idFile = filemodel.getID(eObject);
						//	xmi_file.setID(eObject_root,idFile);
						//	xmi_file.save(null);
						//}
			
						//Include Parent
						//Cambie1
						//parent_uri = URI.createFileURI(parent.getName().toString().concat("/"+parent.getName().concat(".xmi")));
						//String ausd = parent.getProjectRelativePath().lastSegment()
						parent_uri = URI.createPlatformResourceURI(parent.getName().toString().concat("/"+parent.getName().concat(".xmi")),true);
						
						xmi_parent = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
											createResourceResourceSet(parent_uri, xmi_file.getResourceSet());
						xmi_parent.load(null);
						xmi_file.load(null);
						//((EList<EObject>)xmi_parent.Get_Root().eGet(eObject.eContainingFeature())).add(xmi_file.Get_Root());
						Object obj = xmi_parent.Get_Root().eGet(eObject.eContainingFeature());
						if(obj instanceof EList<?>)
						{
							EList<EObject> eobj = (EList<EObject>)obj;
							eobj.add(xmi_file.Get_Root());
						}
						
						//xmi_parent.getContents().add(xmi_file.Get_Root());
						xmi_parent.save(null);
						//xmi_parent.unload();
						xmi_file.save(null);
						//xmi_file.unload();
					}			
					path = "";
					path_uri = null;
					fol = null;
					copier = null;
					name_folder = null;	
														
				}		
				//System.out.println("Reverse_Engineering_Create_Project_Complete");

	}

	public String IsFolder(EObject eObject){
		
		return null;
	}
	
	//Return extension if is a file, if not return null
	public String IsFile(EObject eObject){
		
		if(eObject instanceof MainSubsystemImpl)
			 return ((MainSubsystemImpl)eObject).getSysId().toString().concat(".subsytem");
		if(eObject instanceof CollectionInputOutputImpl)
			return ((CollectionInputOutputImpl)eObject).getSysId().toString().concat(".inputoutput");
			
		return null;
	}
	
	public String GetObjectPath(EObject obj){
		
		String cad = "/"; 
		EObject parent = obj;
		String name_folder = null;
		while(parent!=null){
			name_folder = IsFolder(parent);
			if(name_folder!=null)
				cad = "/".concat(name_folder).concat(cad);//Attribute annotated as name
			parent = parent.eContainer();						
		}						
		return cad;
	}	
	
	public EObject GetObjectRoot(XMIResource res,EObject root, EObject param_obj){
		
		//EObject result = CoreFactoryImpl.eINSTANCE.create(param_obj.eClass());
		  EObject result = WTSpec4MFactoryImpl.eINSTANCE.create(param_obj.eClass());
		EList<EAttribute> result_attr = result.eClass().getEAllAttributes();
			
		for (EAttribute eAttribute : result_attr) {
			result.eSet(eAttribute, param_obj.eGet(eAttribute));
		}	
		
		Update_CrossReferences(result,res,root,param_obj);
				
		return result;
	}	
	
	private void Update_CrossReferences(EObject result, XMIResource res,
			EObject root, EObject param_obj) {
		EList<EObject> listECrossReferences = param_obj.eCrossReferences();
		//Copier copy = new Copier();	
		EList<EObject> listobjects = new BasicEList<>();
		EReference previous = null;
		for (EContentsEList.FeatureIterator featureIterator = (EContentsEList.FeatureIterator)
				listECrossReferences.iterator(); featureIterator.hasNext();) {
			 EObject eObject = (EObject)featureIterator.next();
			 EReference eReference = (EReference)featureIterator.feature();	
			 if(previous==null)
				 previous = eReference;
			 else
			 {
				 if(previous.equals(eReference)==Boolean.FALSE)
				 {
					 //Add Cross References
					 EStructuralFeature struct = result.eClass().getEStructuralFeature(previous.getName());
					 result.eSet(struct, listobjects);					 
					 listobjects.clear();
					 previous = eReference;
				 }
			 }			 
			 
			 //EObject r = CoreFactoryImpl.eINSTANCE.create(eObject.eClass());
			   EObject r = WTSpec4MFactoryImpl.eINSTANCE.create(eObject.eClass());	 
					
			 String proxy = "";
			 if(IsFolder(eObject)!=null)
				 proxy = IsFolder(eObject) + "//" + IsFolder(eObject).concat(".xmi#".concat(res.getID(eObject)));
			
			 while (eObject.eContainer()!=null) {
				 
				 eObject = eObject.eContainer();
				 if(IsFolder(eObject)!=null)
					 proxy =  IsFolder(eObject).concat("/") + proxy;
				
				 if(eObject.equals(root))
					 proxy = "/" + getProjectName().concat("/") + proxy;	
				 
				 
			}
			 
			 //if(IsFile(eObject)!=null)
			//	 proxy =  proxy + ".xmi";
			 
			 
			InternalEObject inte = (InternalEObject)r;
			inte.eSetProxyURI(URI.createURI(proxy));
			listobjects.add(r);			
		}
		
		//Add Cross References
		if(previous!=null){
			EStructuralFeature struct = result.eClass().getEStructuralFeature(previous.getName());
			result.eSet(struct, listobjects);
		}
		
	}
	
	public String UpdateCrossReferenceFile(EObject source)
	{

		//Resource res = source.eResource();
		//String faf = filemodel.getContents().
		//EObject r = res.getEObject(EcoreUtil.getURI(eObject_root).fragment());
		String cad = "#/";
		String fragment = "";
		String current_uri = EcoreUtil.getURI(source).fragment();
		String[] split_fragment = current_uri.split("/");
		int last_pos = split_fragment.length;
		//String object_uri = current_uri.substring(current_uri.lastIndexOf("/"), current_uri.length());
		//String object_uri = "/".concat(split_fragment[last_pos-1]);
		//last_pos = last_pos - 1;
		//cad = object_uri;
		EObject parent = source;
		while(parent!=null)
		{
			String name_file = IsFile(parent);
			if(name_file!=null)
			{
				cad = ("/"+name_file).concat(cad);		
			}
			else
			{
				String name_folder = IsFolder(parent);
				if(name_folder==null)
				{
					String name_project = IsProject(parent);
					if(name_project==null)
					{
						if(fragment=="")
							fragment = split_fragment[last_pos-1];
						else
							fragment = split_fragment[last_pos-1].concat("/").concat(fragment);
						last_pos = last_pos - 1;
					}else
					{
					//cad = "platform:/resource/"+
					if(cad.equals("#/"))
						cad = "/" + name_project + ".xmi#/";
					cad = "platform:/resource/" + name_project.concat(cad);
					if(fragment.equals(""))
						return cad;
					else
						return cad.concat("/"+fragment);
					}
				}
				else{
					if(cad.equals("#/"))
						cad = ("/"+name_folder +"/"+name_folder+".xmi").concat(cad);//Si el primero es folder añadir extension xmi y doble name_folder
					else
						cad = ("/"+name_folder).concat(cad);
					//System.out.println(cad);
				}
			}
			parent = parent.eContainer();
			
			if(parent.equals(eObject))//eObject_root quitar private
			{
				if(fragment.equals(""))
					return cad;
				else
					return cad.concat(fragment);				
			}
		}
		return cad;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	private String IsProject(EObject eObject)//Add Acceleo
	{
		if(eObject instanceof WT)
			 return ((WT)eObject).getSysId().toString();
		return null;
	}
}


