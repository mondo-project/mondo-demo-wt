package org.mondo.wt.cstudy.modular.editors;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import org.mondo.wt.cstudy.modular.Activator;
import org.mondo.wt.cstudy.modular.preferences.PreferenceOptions;

public class CustomPropertyDescriptor extends PropertyDescriptor{

	public CustomPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		// TODO Auto-generated method stub
		CellEditor result =  super.createPropertyEditor(composite);
		if(result instanceof ExtendedDialogCellEditor){
			
			String IdExtension = Activator.getDefault().getPreferenceStore().getString(PreferenceOptions.FeatureEditor_CHOICE);
			if(IdExtension.equals(PreferenceOptions.DefaultFeatureEditorDialog))
				return result;
			else
			{
				
			Object genericFeature = itemPropertyDescriptor.getFeature(object);
			final EStructuralFeature feature = (EStructuralFeature)genericFeature;						
			return new ExtendedDialogCellEditor(composite, getEditLabelProvider()){

				@Override
				protected Object openDialogBox(Control cellEditorWindow) {
					// TODO Auto-generated method stub
					ModularFeatureEditorDialog dialog = new ModularFeatureEditorDialog(
							cellEditorWindow.getShell(), 
							(EObject) object, 
							feature, IdExtension,
							getEditLabelProvider());
					
					dialog.open();
					return dialog.getResult();
					}			
				};				
			}
		}			
		else
			return result;
		
	}

}

