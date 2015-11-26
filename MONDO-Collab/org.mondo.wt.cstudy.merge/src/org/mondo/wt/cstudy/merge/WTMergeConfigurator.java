package org.mondo.wt.cstudy.merge;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.merge.DSEMergeConfigurator;
import org.eclipse.viatra.dse.merge.DSEMergeIdMapper;
import org.mondo.wt.cstudy.merge.util.Id2objectQuerySpecification;

import WTSpec4M.WTSpec4MPackage;

public class WTMergeConfigurator extends DSEMergeConfigurator {

    @Override
    public EPackage getMetamodel() {
        return WTSpec4MPackage.eINSTANCE;
    }

    @Override
    public IQuerySpecification<?> getId2EObject() throws IncQueryException {
        return Id2objectQuerySpecification.instance();
    }
    
    @Override
    public DSEMergeIdMapper getIdMapper() {
        return new DSEMergeIdMapper() {
            
            @Override
            public Object getId(EObject object) {
                return object.eGet(getIdFeature(object));
            }

            @Override
            public boolean isDeterminativeFeature(EStructuralFeature feature) {
                if (feature.getName().equals("sysId"))
                    return true;
                return false;
            }

            @Override
            public EStructuralFeature getIdFeature(EObject object) {
                EClass eClass = object.eClass();
                return eClass.getEStructuralFeature("sysId");
            }
        };
    }

}
