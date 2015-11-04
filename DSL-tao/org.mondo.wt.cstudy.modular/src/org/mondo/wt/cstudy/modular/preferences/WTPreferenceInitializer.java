package org.mondo.wt.cstudy.modular.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.preference.IPreferenceStore;

import org.mondo.wt.cstudy.modular.Activator;

/**
 * Class used to initialize default preference values.
 */

public class WTPreferenceInitializer extends AbstractPreferenceInitializer {

/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		EList<String> listvalues = PreferenceOptions.GetTreeEditorFeatureOptions();
		String defId = null;
		
		Integer num = listvalues.indexOf("Hawk");
		if(num.equals(-1))
		{
			num = listvalues.indexOf("WTModularCrossReferences");
			if(num.equals(-1))
				defId = PreferenceOptions.DefaultFeatureEditorDialog;
			else
				defId = "WTModularCrossReferences";
		}
		else
			defId = "Hawk";		
		
		store.setDefault(PreferenceOptions.FeatureEditor_CHOICE, defId);				
	}

}

