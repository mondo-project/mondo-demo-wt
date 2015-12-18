package org.mondo.wt.cstudy.metamodel.merge;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import org.mondo.wt.cstudy.metamodel.merge.Id2objectMatch;
import org.mondo.wt.cstudy.metamodel.merge.util.Id2objectQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.wt.cstudy.metamodel.merge.id2object pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Id2objectMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern id2object(object:EObject,key)
 * {	SystemTimer.sysId(object,key); }
 * or {	SystemParam.sysId(object,key); }
 * or {	SystemVariable.sysId(object,key); }
 * or {	SystemFault.sysId(object,key); }
 * or {	Subsystem.sysId(object,key); }
 * or {	wtc.sysId(object,key); }
 * or {	SystemOutput.sysId(object,key); }
 * or {	SystemInput.sysId(object,key); }
 * or {	WT.sysId(object,key); }
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
  
  private final static int POSITION_OBJECT = 0;
  
  private final static int POSITION_KEY = 1;
  
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
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pKey the fixed value of pattern parameter key, or null if not bound.
   * @return matches represented as a Id2objectMatch object.
   * 
   */
  public Collection<Id2objectMatch> getAllMatches(final EObject pObject, final String pKey) {
    return rawGetAllMatches(new Object[]{pObject, pKey});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pKey the fixed value of pattern parameter key, or null if not bound.
   * @return a match represented as a Id2objectMatch object, or null if no match is found.
   * 
   */
  public Id2objectMatch getOneArbitraryMatch(final EObject pObject, final String pKey) {
    return rawGetOneArbitraryMatch(new Object[]{pObject, pKey});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pKey the fixed value of pattern parameter key, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EObject pObject, final String pKey) {
    return rawHasMatch(new Object[]{pObject, pKey});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pKey the fixed value of pattern parameter key, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EObject pObject, final String pKey) {
    return rawCountMatches(new Object[]{pObject, pKey});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pKey the fixed value of pattern parameter key, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EObject pObject, final String pKey, final IMatchProcessor<? super Id2objectMatch> processor) {
    rawForEachMatch(new Object[]{pObject, pKey}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pKey the fixed value of pattern parameter key, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EObject pObject, final String pKey, final IMatchProcessor<? super Id2objectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pObject, pKey}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pKey the fixed value of pattern parameter key, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Id2objectMatch newMatch(final EObject pObject, final String pKey) {
    return Id2objectMatch.newMatch(pObject, pKey);
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfobject(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_OBJECT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject() {
    return rawAccumulateAllValuesOfobject(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject(final Id2objectMatch partialMatch) {
    return rawAccumulateAllValuesOfobject(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfobject(final String pKey) {
    return rawAccumulateAllValuesOfobject(new Object[]{
    null, 
    pKey
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for key.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfkey(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_KEY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for key.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfkey() {
    return rawAccumulateAllValuesOfkey(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for key.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfkey(final Id2objectMatch partialMatch) {
    return rawAccumulateAllValuesOfkey(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for key.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfkey(final EObject pObject) {
    return rawAccumulateAllValuesOfkey(new Object[]{
    pObject, 
    null
    });
  }
  
  @Override
  protected Id2objectMatch tupleToMatch(final Tuple t) {
    try {
    	return Id2objectMatch.newMatch((org.eclipse.emf.ecore.EObject) t.get(POSITION_OBJECT), (java.lang.String) t.get(POSITION_KEY));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Id2objectMatch arrayToMatch(final Object[] match) {
    try {
    	return Id2objectMatch.newMatch((org.eclipse.emf.ecore.EObject) match[POSITION_OBJECT], (java.lang.String) match[POSITION_KEY]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected Id2objectMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return Id2objectMatch.newMutableMatch((org.eclipse.emf.ecore.EObject) match[POSITION_OBJECT], (java.lang.String) match[POSITION_KEY]);
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
