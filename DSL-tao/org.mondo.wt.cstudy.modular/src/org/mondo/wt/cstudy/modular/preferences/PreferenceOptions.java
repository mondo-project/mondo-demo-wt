package org.mondo.wt.cstudy.modular.preferences;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.mondo.modular.references.ext.EvaluateCrossReferencesContributor;
import org.mondo.wt.cstudy.modular.wizard.WTNewProjectNature;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceOptions {

	public static final String FeatureEditor_CHOICE = "choiceFeatureEditor";
	public static final String DefaultFeatureEditorDialog = "DefaultFeatureEditorDialog";
	
	public static final EList<String> GetTreeEditorFeatureOptions()
	{
		EvaluateCrossReferencesContributor eval = new EvaluateCrossReferencesContributor();
		EList<String> listOfValues = eval.ListNames(Platform.getExtensionRegistry());
		listOfValues.add(DefaultFeatureEditorDialog);
		return listOfValues;
	}
	
}

