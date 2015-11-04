package org.mondo.wt.cstudy.modular.preferences;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.mondo.modular.references.ext.EvaluateCrossReferencesContributor;

import org.eclipse.ui.IWorkbench;
import org.mondo.wt.cstudy.modular.Activator;
import org.mondo.wt.cstudy.modular.wizard.WTNewProjectNature;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class WTPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public WTPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("");
	}

	protected RadioGroupFieldEditor TreeEditorWizard;
	protected String previously;
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */

	public void createFieldEditors() {
		
		EList<String> listOfValues = PreferenceOptions.GetTreeEditorFeatureOptions();
		int count = listOfValues.size();
		previously = Activator.getDefault().getPreferenceStore().getString(PreferenceOptions.FeatureEditor_CHOICE);		
		
		String[][] labelAndvalues = new String[count][2];
		for (int i = 0; i < count; i++)
			for (int j = 0; j < 2; j++) 
				labelAndvalues[i][j] = listOfValues.get(i);			
		
		addField(new RadioGroupFieldEditor(
				PreferenceOptions.FeatureEditor_CHOICE,
				"Tree Editor Feature Wizard",
				1,
				labelAndvalues, 
				getFieldEditorParent()));		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
	@Override
	public boolean performOk() {
		// TODO Auto-generated method stub
		boolean performOk =  super.performOk();
		String current = Activator.getDefault().getPreferenceStore().getString(PreferenceOptions.FeatureEditor_CHOICE);
		
		if(!current.equals(previously)){
			
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			EvaluateCrossReferencesContributor eval = new EvaluateCrossReferencesContributor();
			
			if(!previously.equals(PreferenceOptions.DefaultFeatureEditorDialog)){
				eval.executeFinish(registry, previously, WTNewProjectNature.ID);
			}
			
			if(!current.equals(PreferenceOptions.DefaultFeatureEditorDialog)){
				eval.executeInit(registry, current, WTNewProjectNature.ID);
			}			
		}		
		return performOk;
	}

}	
