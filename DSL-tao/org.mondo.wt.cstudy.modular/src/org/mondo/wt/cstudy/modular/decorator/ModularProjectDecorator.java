
package org.mondo.wt.cstudy.modular.decorator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.mondo.wt.cstudy.modular.XMI_File;
import org.mondo.wt.cstudy.modular.wizard.WTNewProjectNature;
import org.eclipse.ui.plugin.AbstractUIPlugin;


public class ModularProjectDecorator implements ILightweightLabelDecorator {

	@Override
	public void addListener(ILabelProviderListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object arg0, String arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}
	
	static {  
	}  	
	
	
	@Override
	public void decorate(Object element, IDecoration decoration) {
		// TODO Auto-generated method stub
		if(element instanceof IFolder)
		{
			try{
				IFolder folder = (IFolder)element;
				IProjectNature nature = folder.getProject().getNature(WTNewProjectNature.ID);
				if(nature!=null){
					//Search XMI
					IFile file = folder.getFile(folder.getName().concat(".xmi"));
					if(file.exists()){
						XMI_File file_xmi = new XMI_File(URI.createFileURI(file.getFullPath().toString()));
						EObject root = file_xmi.Get_Root();
					}						
				}
				
			}catch(Throwable th){/*Ignore if file is not found*/ }
		}
		
	}
}
