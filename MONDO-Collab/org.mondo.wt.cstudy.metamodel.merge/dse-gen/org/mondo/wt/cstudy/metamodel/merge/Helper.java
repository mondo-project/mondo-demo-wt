package org.mondo.wt.cstudy.metamodel.merge;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Helper {
	
	public static EAttribute getIdFeature(EObject object) {
		EClass eClass = object.eClass();
		return (EAttribute) eClass.getEStructuralFeature("sysId");
	}
	public static boolean isDeterminativeFeature(EStructuralFeature feature) {
		if(feature.getName().equals("sysId")) 
			return true;
		return false;
	}
}
