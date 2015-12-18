package org.mondo.wt.cstudy.metamodel.merge.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.mondo.wt.cstudy.metamodel.merge.Id2objectMatch;
import org.mondo.wt.cstudy.metamodel.merge.Id2objectMatcher;

/**
 * A pattern-specific query specification that can instantiate Id2objectMatcher in a type-safe way.
 * 
 * @see Id2objectMatcher
 * @see Id2objectMatch
 * 
 */
@SuppressWarnings("all")
public final class Id2objectQuerySpecification extends BaseGeneratedEMFQuerySpecification<Id2objectMatcher> {
  private Id2objectQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static Id2objectQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected Id2objectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return Id2objectMatcher.on(engine);
  }
  
  @Override
  public Id2objectMatch newEmptyMatch() {
    return Id2objectMatch.newEmptyMatch();
  }
  
  @Override
  public Id2objectMatch newMatch(final Object... parameters) {
    return Id2objectMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static Id2objectQuerySpecification INSTANCE = make();
    
    public static Id2objectQuerySpecification make() {
      return new Id2objectQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Id2objectQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.wt.cstudy.metamodel.merge.id2object";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("object","key");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("object", "org.eclipse.emf.ecore.EObject"),new PParameter("key", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	SystemTimer.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemTimer")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "SystemTimer", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	SystemParam.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemParam")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "SystemParam", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	SystemVariable.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemVariable")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "SystemVariable", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	SystemFault.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemFault")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "SystemFault", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	Subsystem.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "Subsystem")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "Subsystem", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	wtc.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "wtc")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "wtc", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	SystemOutput.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemOutput")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "SystemOutput", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	SystemInput.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "SystemInput")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "SystemInput", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_key = body.getOrCreateVariableByName("key");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_key, "key")
      		));
      		// 	WT.sysId(object,key)
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_object, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "sysId")));
      		new Equality(body, var__virtual_0_, var_key);
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
