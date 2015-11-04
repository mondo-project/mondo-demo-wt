
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
		diagram.save(null);			
	}
	
	public void Reverse_Engineering(URI fileURI) throws IOException, CoreException, BackingStoreException
	{
		//Create Performant Resource
		PerformantXMIResourceImpl filemodel = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
													createResource(fileURI);
		filemodel.load(null); 
		WT root = (WT) filemodel.Get_Root();
		WTProjectFeatures feat = new WTProjectFeatures(
		root.getSysId(),
		root.getModel(),
		root.getVersion()
		);
		WTNewProjectInfo project = new WTNewProjectInfo(feat);
		String id = filemodel.getID(root);
		if(id!=null)
			project.setIdObjectroot(id);
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
		EObject eObject = null;	
		EObject eObject_root = null;
		
		model_tree.next();//The first element(Root) was added already
		
		Copier copier = null;
		while (model_tree.hasNext()) {
				
			eObject = (EObject) model_tree.next();
					
			//Parent path
			path = GetObjectPath(eObject);

				//Files
				parent = project.Create_Folder(path);
				if(eObject instanceof CollectionInputOutputImpl)
					path = path.concat(((CollectionInputOutputImpl)eObject).getSysId().toString());
				if(eObject instanceof MainSubsystemImpl)
					path = path.concat(((MainSubsystemImpl)eObject).getSysId().toString());
				//Create File
				path_uri = URI.createFileURI(project.getProject().getFullPath().toString().concat(path));						
						
			//Create XMI File
			xmi_file = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
								Get_Create_XMI(path_uri, eObject_root);
			if(copier!=null){
				 for (EObject oldObject : copier.keySet()) {
					 EObject newObject = copier.get(oldObject);
					 String idObject = filemodel.getID(oldObject);
					 if (idObject == null)      System.out.println("Se ha perdido un id" + newObject.toString());
					 xmi_file.setID(newObject,idObject);
				 }
				 xmi_file.save(null);
			}
			else
			{
				String idFile = filemodel.getID(eObject);
				xmi_file.setID(eObject_root,idFile);
				xmi_file.save(null);
			}

			//Include Parent
			parent_uri = URI.createURI(parent.getFullPath().toString().concat("/"+parent.getName().concat(".xmi")));
			xmi_parent = (PerformantXMIResourceImpl) new PerformantXMIResourceFactoryImpl().
								createResourceResourceSet(parent_uri, xmi_file.getResourceSet());
			xmi_parent.load(null);
			((EList<EObject>)xmi_parent.Get_Root().eGet(eObject.eContainingFeature())).add(xmi_file.Get_Root());
			xmi_parent.save(null);
			
			xmi_parent.unload();
			xmi_file.unload();
			path = "";
			path_uri = null;
			fol = null;
			copier = null;
												
		}		
		System.out.println("Reverse_Engineering_Create_Project_Complete");

	}

	public String IsFolder(EObject eObject){
		
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
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}


