
package org.mondo.wt.cstudy.modular.propertysource;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.mondo.wt.cstudy.modular.XMI_File;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import WTSpec4M.CollectionInputOutput;
import WTSpec4M.MainSubsystem;

public class AllElementsPropertySource implements IPropertySourceProvider {

	public AllElementsPropertySource() {
		super();		
		// TODO Auto-generated constructor stub
	}

	@Override
	public IPropertySource getPropertySource(Object object) {
		// TODO Auto-generated method stub
		URI fileURI = null;
		//Select a Project
		if(object instanceof IProject){
			IProject pro = (IProject)object;
			if(!isProject(pro))
				return null;
			//Get project address
			fileURI = URI.createPlatformResourceURI(((IProject)object).getFullPath().toString().concat("/"+((IProject)object).getFullPath().lastSegment().toString()).concat(".xmi"),true);
			IResource resource = pro.findMember(pro.getName()+".xmi");
			if(resource!=null){						
				try {
						return new WTItemPropertiesSource(new XMI_File(fileURI));
					} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			}	
			else	
				return null;				
		}	
		//Select a Folder
		if(object instanceof IFolder){
			IFolder fol = (IFolder)object;
			//Get folder address
			if(!isProject(fol.getProject()))
				return null;
			fileURI = URI.createPlatformResourceURI(((IFolder)object).getFullPath().toString().concat("/"+fol.getName()+".xmi"),true);
			IResource resource = fol.findMember(fol.getName()+".xmi");
			if(resource!=null){
				XMI_File folder_file = new XMI_File(fileURI);
				EObject root = null;
				try {
					root = folder_file.Get_Root();
				} catch (IOException e1) {
				// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//For with all folders
						
				}
				else 
					return null;
				}
		//Select a File
		if(object instanceof IFile){
			IFile fil = (IFile)object;
			//Get folder address
			if(!isProject(fil.getProject()))
				return null;
			fileURI = URI.createPlatformResourceURI(((IFile)object).getFullPath().toString(),true);
			if(fil.exists()){
				XMI_File file = new XMI_File(fileURI);
				EObject root = null;
				try {
					root = file.Get_Root();
				} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}
				//For with all folders
				if(root instanceof CollectionInputOutput){	
				try {
					return new CollectionInputOutputItemPropertiesSource(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				if(root instanceof MainSubsystem){	
				try {
					return new MainSubsystemItemPropertiesSource(file);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
					
			}
			else 
				return null;
			}

		return null;	
	}

	public static boolean isProject(IProject pro) 
	{
		IProjectNature nature_modular = null;
		try {
			nature_modular = pro.getNature(Project_Nature);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(nature_modular==null)
			return false;
		else
			return true;		
	}
	
	public static String Project_Nature = "org.mondo.wt.cstudy.modular.ModularNature";

}

