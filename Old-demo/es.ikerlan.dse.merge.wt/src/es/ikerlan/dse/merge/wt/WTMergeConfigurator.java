package es.ikerlan.dse.merge.wt;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.merge.DSEMergeConfigurator;
import org.eclipse.viatra.dse.merge.DSEMergeIdMapper;

import es.ikerlan.WTSpec4M.WTSpec4MPackage;
import es.ikerlan.dse.merge.wt.util.Id2objectQuerySpecification;

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
                EClass eClass = object.eClass();
                EStructuralFeature id = eClass.getEStructuralFeature("id");
                return object.eGet(id);
            }

            @Override
            public boolean isDeterminativeFeature(EStructuralFeature feature) {
                if (feature.getName().equals("id"))
                    return true;
                return false;
            }
        };
    }
}
