package org.mondo.wt.cstudy.merge;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import org.mondo.wt.cstudy.merge.Id2objectMatch;
import org.mondo.wt.cstudy.merge.util.Id2objectQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.wt.cstudy.merge.id2object pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Id2objectMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern id2object(eobject, id) { 
 * 	WT.sysId(eobject, id); 
 * } or {
 * 	wtc.sysId(eobject, id); 
 * } or {
 * 	Subsystem.sysId(eobject, id); 
 * } or {
 * 	SystemFault.sysId(eobject, id); 
 * } or {
 * 	SystemInput.sysId(eobject, id); 
 * } or {
 * 	SystemOutput.sysId(eobject, id); 
 * } or {
 * 	SystemParam.sysId(eobject, id); 
 * } or {
 * 	SystemTimer.sysId(eobject, id); 
 * } or {
 * 	SystemVariable.sysId(eobject, id); 
 * }
 * </pre></code>
 * 
 * @see Id2objectMatch
 * @see Id2objectProcessor
 * @see Id2objectQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Id2objectMatcher extends BaseMatcher<Id2objectMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Id2objectMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    Id2objectMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new Id2objectMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_EOBJECT = 0;
  
  private final static int POSITION_ID = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(Id2objectMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public Id2objectMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public Id2objectMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEobject the fixed value of pattern parameter eobject, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return matches represented as a Id2objectMatch object.
   * 
   */
  public Collection<Id2objectMatch> getAllMatches(final Object pEobject, final String pId) {
    return rawGetAllMatches(new Object[]{pEobject, pId});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEobject the fixed value of pattern parameter eobject, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return a match represented as a Id2objectMatch object, or null if no match is found.
   * 
   */
  public Id2objectMatch getOneArbitraryMatch(final Object pEobject, final String pId) {
    return rawGetOneArbitraryMatch(new Object[]{pEobject, pId});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEobject the fixed value of pattern parameter eobject, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pEobject, final String pId) {
    return rawHasMatch(new Object[]{pEobject, pId});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEobject the fixed value of pattern parameter eobject, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pEobject, final String pId) {
    return rawCountMatches(new Object[]{pEobject, pId});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEobject the fixed value of pattern parameter eobject, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pEobject, final String pId, final IMatchProcessor<? super Id2objectMatch> processor) {
    rawForEachMatch(new Object[]{pEobject, pId}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEobject the fixed value of pattern parameter eobject, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pEobject, final String pId, final IMatchProcessor<? super Id2objectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEobject, pId}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEobject the fixed value of pattern parameter eobject, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Id2objectMatch newMatch(final Object pEobject, final String pId) {
    return Id2objectMatch.newMatch(pEobject, pId);
  }
  
  /**
   * Retrieve the set of values that occur in matches for eobject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfeobject(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_EOBJECT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for eobject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfeobject() {
    return rawAccumulateAllValuesOfeobject(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for eobject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfeobject(final Id2objectMatch partialMatch) {
    return rawAccumulateAllValuesOfeobject(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for eobject.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfeobject(final String pId) {
    return rawAccumulateAllValuesOfeobject(new Object[]{
    null, 
    pId
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfid(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_ID, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid() {
    return rawAccumulateAllValuesOfid(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid(final Id2objectMatch partialMatch) {
    return rawAccumulateAllValuesOfid(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for id.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfid(final Object pEobject) {
    return rawAccumulateAllValuesOfid(new Object[]{
    pEobject, 
    null
    });
  }
  
  @Override
  protected Id2objectMatch tupleToMatch(final Tuple t) {
    try {
    	return Id2objectMatch.newMatch((java.lang.Object) t.get(POSITION_EOBJECT), (java.lang.String) t.get(POSITION_ID));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Id2objectMatch arrayToMatch(final Object[] match) {
    try {
    	return Id2objectMatch.newMatch((java.lang.Object) match[POSITION_EOBJECT], (java.lang.String) match[POSITION_ID]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Id2objectMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Id2objectMatch.newMutableMatch((java.lang.Object) match[POSITION_EOBJECT], (java.lang.String) match[POSITION_ID]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<Id2objectMatcher> querySpecification() throws IncQueryException {
    return Id2objectQuerySpecification.instance();
  }
}
