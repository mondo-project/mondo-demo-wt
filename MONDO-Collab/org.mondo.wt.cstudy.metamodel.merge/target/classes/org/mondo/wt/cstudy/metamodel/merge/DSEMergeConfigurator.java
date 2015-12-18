package org.mondo.wt.cstudy.metamodel.merge;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.merge.DSEMergeIdMapper;
import org.mondo.wt.cstudy.metamodel.merge.util.Id2objectQuerySpecification;
import org.mondo.wt.cstudy.metamodel.merge.util.ContainmentPatternQuerySpecification;
import org.mondo.wt.cstudy.metamodel.merge.Helper;

public class DSEMergeConfigurator extends org.eclipse.viatra.dse.merge.DSEMergeConfigurator {

	URI uri = URI.createURI("http://WTSpec4M/5.0M");
	
    @Override
    public EPackage getMetamodel() {
        return (EPackage) new ResourceSetImpl().getResource(uri, true).getContents().get(0);
    }

    @Override
    public IQuerySpecification<?> getId2EObject() throws IncQueryException {
        return Id2objectQuerySpecification.instance();
    }
    
   	@Override
    public IQuerySpecification<?> getContainmentPattern() throws IncQueryException {
        return ContainmentPatternQuerySpecification.instance();
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
            	return Helper.isDeterminativeFeature(feature);
            }

            @Override
            public EStructuralFeature getIdFeature(EObject object) {
                return Helper.getIdFeature(object);
            }
        };
    }

}