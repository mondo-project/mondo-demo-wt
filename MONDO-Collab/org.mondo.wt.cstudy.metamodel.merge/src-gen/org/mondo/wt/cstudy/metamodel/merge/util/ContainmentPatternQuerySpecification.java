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
import org.mondo.wt.cstudy.metamodel.merge.ContainmentPatternMatch;
import org.mondo.wt.cstudy.metamodel.merge.ContainmentPatternMatcher;

/**
 * A pattern-specific query specification that can instantiate ContainmentPatternMatcher in a type-safe way.
 * 
 * @see ContainmentPatternMatcher
 * @see ContainmentPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class ContainmentPatternQuerySpecification extends BaseGeneratedEMFQuerySpecification<ContainmentPatternMatcher> {
  private ContainmentPatternQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ContainmentPatternQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ContainmentPatternMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ContainmentPatternMatcher.on(engine);
  }
  
  @Override
  public ContainmentPatternMatch newEmptyMatch() {
    return ContainmentPatternMatch.newEmptyMatch();
  }
  
  @Override
  public ContainmentPatternMatch newMatch(final Object... parameters) {
    return ContainmentPatternMatch.newMatch((org.eclipse.emf.ecore.EObject) parameters[0], (org.eclipse.emf.ecore.EObject) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ContainmentPatternQuerySpecification INSTANCE = make();
    
    public static ContainmentPatternQuerySpecification make() {
      return new ContainmentPatternQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ContainmentPatternQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "org.mondo.wt.cstudy.metamodel.merge.containmentPattern";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parent","child");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("parent", "org.eclipse.emf.ecore.EObject"),new PParameter("child", "org.eclipse.emf.ecore.EObject"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	Subsystem.itsWTCs(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "Subsystem")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "Subsystem", "itsWTCs")));
      		new Equality(body, var__virtual_0_, var_child);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	Subsystem.itsSubsystems(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "Subsystem")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "Subsystem", "itsSubsystems")));
      		new Equality(body, var__virtual_0_, var_child);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	WT.itsSubsystems(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsSubsystems")));
      		new Equality(body, var__virtual_0_, var_child);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	WT.itsInputs(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsInputs")));
      		new Equality(body, var__virtual_0_, var_child);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	WT.itsOutputs(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsOutputs")));
      		new Equality(body, var__virtual_0_, var_child);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	WT.itsParams(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsParams")));
      		new Equality(body, var__virtual_0_, var_child);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	WT.itsTimers(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsTimers")));
      		new Equality(body, var__virtual_0_, var_child);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	WT.itsFaults(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsFaults")));
      		new Equality(body, var__virtual_0_, var_child);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_parent = body.getOrCreateVariableByName("parent");
      		PVariable var_child = body.getOrCreateVariableByName("child");
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		new TypeConstraint(body, new FlatTuple(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_parent, "parent"),
      		   new ExportedParameter(body, var_child, "child")
      		));
      		// 	WT.itsVariables(parent,child)
      		new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://WTSpec4M/5.0M", "WT")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://WTSpec4M/5.0M", "WT", "itsVariables")));
      		new Equality(body, var__virtual_0_, var_child);
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
