package org.mondo.wt.cstudy.merge.util;

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
import org.mondo.wt.cstudy.merge.Id2objectMatch;
import org.mondo.wt.cstudy.merge.Id2objectMatcher;

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
    return Id2objectMatch.newMatch((java.lang.Object) parameters[0], (java.lang.String) parameters[1]);
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
      return "org.mondo.wt.cstudy.merge.id2object";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("eobject","id");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("eobject", "java.lang.Object"),new PParameter("id", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		//  	WT.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "WT", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		// 	wtc.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "wtc")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "wtc", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		// 	Subsystem.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "Subsystem")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "Subsystem", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		// 	SystemFault.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "SystemFault")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "SystemFault", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		// 	SystemInput.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "SystemInput")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "SystemInput", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		// 	SystemOutput.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "SystemOutput")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "SystemOutput", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		// 	SystemParam.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "SystemParam")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "SystemParam", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		// 	SystemTimer.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "SystemTimer")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "SystemTimer", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		// 	SystemVariable.sysId(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0", "SystemVariable")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0", "SystemVariable", "sysId")));
      		new Equality(body, var__virtual_0_, var_id);
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
