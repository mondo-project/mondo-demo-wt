package es.ikerlan.dse.merge.wt.util;

import com.google.common.collect.Sets;
import es.ikerlan.dse.merge.wt.Id2objectMatch;
import es.ikerlan.dse.merge.wt.Id2objectMatcher;
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
    return Id2objectMatch.newMatch((es.ikerlan.WTSpec4M.WTElement) parameters[0], (java.lang.String) parameters[1]);
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
      return "es.ikerlan.dse.merge.wt.id2object";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("eobject","id");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("eobject", "es.ikerlan.WTSpec4M.WTElement"),new PParameter("id", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_eobject = body.getOrCreateVariableByName("eobject");
      		PVariable var_id = body.getOrCreateVariableByName("id");
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ikerlan.es/domains/WTSpec4M/benchmark", "WTElement")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_eobject, "eobject"),
      		   new ExportedParameter(body, var_id, "id")
      		));
      		//  	WTElement.id(eobject, id)
      		new TypeConstraint(body, new FlatTuple(var_eobject), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ikerlan.es/domains/WTSpec4M/benchmark", "WTElement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_eobject, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ikerlan.es/domains/WTSpec4M/benchmark", "WTElement", "id")));
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
