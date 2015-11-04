
package org.mondo.wt.cstudy.modular;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;

import org.mondo.wt.cstudy.modular.propertysource.*;

public class Package_Explorer_Selection extends ViewerFilter {
	
	public Package_Explorer_Selection() throws PartInitException {
		// TODO Auto-generated constructor stub		
		AddElementsPropertySource();
	}

	private void AddElementsPropertySource() throws PartInitException {
		// TODO Auto-generated method stub
		IViewPart view_proper = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.eclipse.ui.views.PropertySheet");
		if(view_proper==null){
			view_proper = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.eclipse.ui.views.PropertySheet");			
		}
		PropertySheet sheet_proper = (PropertySheet)view_proper;
		PropertySheetPage curr = (PropertySheetPage)sheet_proper.getCurrentPage();
		
		curr.setPropertySourceProvider(new AllElementsPropertySource());		
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		// TODO Auto-generated method stub
		if(element instanceof IFile){
			IFile file = (IFile)element;
			if(AllElementsPropertySource.isProject(file.getProject()))
				return Parent_Filter_XMI(file);
			else
				return true;
		}		
		return true;
	}	
	
	public boolean Parent_Filter_XMI(IFile fil){
		
		IResource res_parent = fil.getParent();
		if(fil.getName().equals(res_parent.getName()+".xmi")){
			return false;				
		}
		return true;
	}

}

