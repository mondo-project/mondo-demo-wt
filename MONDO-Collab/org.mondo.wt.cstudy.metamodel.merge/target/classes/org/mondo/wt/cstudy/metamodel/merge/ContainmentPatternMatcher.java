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
import org.mondo.wt.cstudy.metamodel.merge.ContainmentPatternMatch;
import org.mondo.wt.cstudy.metamodel.merge.util.ContainmentPatternQuerySpecification;

/**
 * Generated pattern matcher API of the org.mondo.wt.cstudy.metamodel.merge.containmentPattern pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ContainmentPatternMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern containmentPattern(parent:EObject,child:EObject)
 * {	Subsystem.itsWTCs(parent,child); }
 * or {	Subsystem.itsSubsystems(parent,child); }
 * or {	WT.itsSubsystems(parent,child); }
 * or {	WT.itsInputs(parent,child); }
 * or {	WT.itsOutputs(parent,child); }
 * or {	WT.itsParams(parent,child); }
 * or {	WT.itsTimers(parent,child); }
 * or {	WT.itsFaults(parent,child); }
 * or {	WT.itsVariables(parent,child); }
 * </pre></code>
 * 
 * @see ContainmentPatternMatch
 * @see ContainmentPatternProcessor
 * @see ContainmentPatternQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ContainmentPatternMatcher extends BaseMatcher<ContainmentPatternMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ContainmentPatternMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ContainmentPatternMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ContainmentPatternMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PARENT = 0;
  
  private final static int POSITION_CHILD = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ContainmentPatternMatcher.class);
  
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
  public ContainmentPatternMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ContainmentPatternMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @return matches represented as a ContainmentPatternMatch object.
   * 
   */
  public Collection<ContainmentPatternMatch> getAllMatches(final EObject pParent, final EObject pChild) {
    return rawGetAllMatches(new Object[]{pParent, pChild});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @return a match represented as a ContainmentPatternMatch object, or null if no match is found.
   * 
   */
  public ContainmentPatternMatch getOneArbitraryMatch(final EObject pParent, final EObject pChild) {
    return rawGetOneArbitraryMatch(new Object[]{pParent, pChild});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EObject pParent, final EObject pChild) {
    return rawHasMatch(new Object[]{pParent, pChild});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EObject pParent, final EObject pChild) {
    return rawCountMatches(new Object[]{pParent, pChild});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EObject pParent, final EObject pChild, final IMatchProcessor<? super ContainmentPatternMatch> processor) {
    rawForEachMatch(new Object[]{pParent, pChild}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EObject pParent, final EObject pChild, final IMatchProcessor<? super ContainmentPatternMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pParent, pChild}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild the fixed value of pattern parameter child, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ContainmentPatternMatch newMatch(final EObject pParent, final EObject pChild) {
    return ContainmentPatternMatch.newMatch(pParent, pChild);
  }
  
  /**
   * Retrieve the set of values that occur in matches for parent.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfparent(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_PARENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for parent.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfparent() {
    return rawAccumulateAllValuesOfparent(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parent.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfparent(final ContainmentPatternMatch partialMatch) {
    return rawAccumulateAllValuesOfparent(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parent.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfparent(final EObject pChild) {
    return rawAccumulateAllValuesOfparent(new Object[]{
    null, 
    pChild
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for child.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<EObject> rawAccumulateAllValuesOfchild(final Object[] parameters) {
    Set<EObject> results = new HashSet<EObject>();
    rawAccumulateAllValues(POSITION_CHILD, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for child.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfchild() {
    return rawAccumulateAllValuesOfchild(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for child.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfchild(final ContainmentPatternMatch partialMatch) {
    return rawAccumulateAllValuesOfchild(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for child.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<EObject> getAllValuesOfchild(final EObject pParent) {
    return rawAccumulateAllValuesOfchild(new Object[]{
    pParent, 
    null
    });
  }
  
  @Override
  protected ContainmentPatternMatch tupleToMatch(final Tuple t) {
    try {
    	return ContainmentPatternMatch.newMatch((org.eclipse.emf.ecore.EObject) t.get(POSITION_PARENT), (org.eclipse.emf.ecore.EObject) t.get(POSITION_CHILD));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ContainmentPatternMatch arrayToMatch(final Object[] match) {
    try {
    	return ContainmentPatternMatch.newMatch((org.eclipse.emf.ecore.EObject) match[POSITION_PARENT], (org.eclipse.emf.ecore.EObject) match[POSITION_CHILD]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ContainmentPatternMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ContainmentPatternMatch.newMutableMatch((org.eclipse.emf.ecore.EObject) match[POSITION_PARENT], (org.eclipse.emf.ecore.EObject) match[POSITION_CHILD]);
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
  public static IQuerySpecification<ContainmentPatternMatcher> querySpecification() throws IncQueryException {
    return ContainmentPatternQuerySpecification.instance();
  }
}
