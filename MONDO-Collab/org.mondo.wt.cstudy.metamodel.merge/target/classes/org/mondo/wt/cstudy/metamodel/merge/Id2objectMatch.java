package org.mondo.wt.cstudy.metamodel.merge;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.mondo.wt.cstudy.metamodel.merge.util.Id2objectQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.wt.cstudy.metamodel.merge.id2object pattern,
 * to be used in conjunction with {@link Id2objectMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see Id2objectMatcher
 * @see Id2objectProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class Id2objectMatch extends BasePatternMatch {
  private EObject fObject;
  
  private String fKey;
  
  private static List<String> parameterNames = makeImmutableList("object", "key");
  
  private Id2objectMatch(final EObject pObject, final String pKey) {
    this.fObject = pObject;
    this.fKey = pKey;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("object".equals(parameterName)) return this.fObject;
    if ("key".equals(parameterName)) return this.fKey;
    return null;
  }
  
  public EObject getObject() {
    return this.fObject;
  }
  
  public String getKey() {
    return this.fKey;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("object".equals(parameterName) ) {
    	this.fObject = (org.eclipse.emf.ecore.EObject) newValue;
    	return true;
    }
    if ("key".equals(parameterName) ) {
    	this.fKey = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setObject(final EObject pObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fObject = pObject;
  }
  
  public void setKey(final String pKey) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fKey = pKey;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.wt.cstudy.metamodel.merge.id2object";
  }
  
  @Override
  public List<String> parameterNames() {
    return Id2objectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fObject, fKey};
  }
  
  @Override
  public Id2objectMatch toImmutable() {
    return isMutable() ? newMatch(fObject, fKey) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"object\"=" + prettyPrintValue(fObject) + ", ");
    
    result.append("\"key\"=" + prettyPrintValue(fKey)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fObject == null) ? 0 : fObject.hashCode());
    result = prime * result + ((fKey == null) ? 0 : fKey.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof Id2objectMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    Id2objectMatch other = (Id2objectMatch) obj;
    if (fObject == null) {if (other.fObject != null) return false;}
    else if (!fObject.equals(other.fObject)) return false;
    if (fKey == null) {if (other.fKey != null) return false;}
    else if (!fKey.equals(other.fKey)) return false;
    return true;
  }
  
  @Override
  public Id2objectQuerySpecification specification() {
    try {
    	return Id2objectQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static Id2objectMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pKey the fixed value of pattern parameter key, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Id2objectMatch newMutableMatch(final EObject pObject, final String pKey) {
    return new Mutable(pObject, pKey);
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
  public static Id2objectMatch newMatch(final EObject pObject, final String pKey) {
    return new Immutable(pObject, pKey);
  }
  
  private static final class Mutable extends Id2objectMatch {
    Mutable(final EObject pObject, final String pKey) {
      super(pObject, pKey);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Id2objectMatch {
    Immutable(final EObject pObject, final String pKey) {
      super(pObject, pKey);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
