
package org.mondo.wt.cstudy.modular.editors;

import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.mondo.modular.filterui.ext.EvaluateFilterUIContributor;
import org.mondo.modular.filterui.ext.FilterAttribute;
import org.mondo.modular.filterui.ext.IFilterTabItem;

import WTSpec4M.presentation.WTSpec4MEditor;

public class MultiPageEditor extends WTSpec4MEditor implements IFilterTabItem{

	@Override
	public void createPages() {
		// TODO Auto-generated method stub
		super.createPages();
		
		if (!getEditingDomain().getResourceSet().getResources().isEmpty())
		// Create a page for the Filter view.
		{
			FilterAttribute anFilterAttribute = new FilterAttribute(getSite().getPage(),
												MultiPageEditor.this, getSite().getShell().getDisplay(),
												selectionViewer,editingDomain.getResourceSet().getResources().get(0),
												getContainer());			
			new EvaluateFilterUIContributor().execute(Platform.getExtensionRegistry(),anFilterAttribute);			
		}	
	}

	@Override
	public int AddItemPage(Control control) {
		// TODO Auto-generated method stub
		return addPage(control);		
	}

	@Override
	public void SetPageItemText(int pageCount, String name) {
		// TODO Auto-generated method stub
		setPageText(pageCount, name);
	}

	@Override
	public IPropertySheetPage getPropertySheetPage() {
		// TODO Auto-generated method stub
		//return super.getPropertySheetPage();
		PropertySheetPage propertySheetPage =
				new ExtendedPropertySheetPage(editingDomain) {					

					@Override
					public void setSelectionToViewer(List<?> selection) {
						setSelectionToViewer(selection);
						setFocus();
						
					}

					@Override
					public void setActionBars(IActionBars actionBars) {
						super.setActionBars(actionBars);
						getActionBarContributor().shareGlobalActions(this, actionBars);
					}
					
					
				};

		propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory) {

			@Override
			protected IPropertySource createPropertySource(final Object object, final IItemPropertySource itemPropertySource) {
				// TODO Auto-generated method stub
				IItemPropertySource wrappedSource = new IItemPropertySource() {					
					
					@Override
					public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
						// TODO Auto-generated method stub
						return itemPropertySource.getPropertyDescriptors(object);
					}
					
					@Override
					public IItemPropertyDescriptor getPropertyDescriptor(Object object, Object propertyID) {
						// TODO Auto-generated method stub
						IItemPropertyDescriptor item = itemPropertySource.getPropertyDescriptor(object, propertyID);
						return item;					
					}					
					
					@Override
					public Object getEditableValue(Object object) {
						// TODO Auto-generated method stub
						return itemPropertySource.getEditableValue(object);
					}				
				};
								
				return new ModularPropertySource(object, wrappedSource);
			}
			
		});
		
		propertySheetPages.add(propertySheetPage);	
		

		return propertySheetPage;
	}
	
}

