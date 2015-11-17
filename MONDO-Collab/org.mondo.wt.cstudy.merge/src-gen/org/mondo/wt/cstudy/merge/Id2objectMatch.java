package org.mondo.wt.cstudy.merge;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.mondo.wt.cstudy.merge.util.Id2objectQuerySpecification;

/**
 * Pattern-specific match representation of the org.mondo.wt.cstudy.merge.id2object pattern,
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
  private Object fEobject;
  
  private String fId;
  
  private static List<String> parameterNames = makeImmutableList("eobject", "id");
  
  private Id2objectMatch(final Object pEobject, final String pId) {
    this.fEobject = pEobject;
    this.fId = pId;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("eobject".equals(parameterName)) return this.fEobject;
    if ("id".equals(parameterName)) return this.fId;
    return null;
  }
  
  public Object getEobject() {
    return this.fEobject;
  }
  
  public String getId() {
    return this.fId;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("eobject".equals(parameterName) && newValue instanceof java.lang.Object) {
    	this.fEobject = (java.lang.Object) newValue;
    	return true;
    }
    if ("id".equals(parameterName) ) {
    	this.fId = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setEobject(final Object pEobject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEobject = pEobject;
  }
  
  public void setId(final String pId) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fId = pId;
  }
  
  @Override
  public String patternName() {
    return "org.mondo.wt.cstudy.merge.id2object";
  }
  
  @Override
  public List<String> parameterNames() {
    return Id2objectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEobject, fId};
  }
  
  @Override
  public Id2objectMatch toImmutable() {
    return isMutable() ? newMatch(fEobject, fId) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"eobject\"=" + prettyPrintValue(fEobject) + ", ");
    
    result.append("\"id\"=" + prettyPrintValue(fId)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fEobject == null) ? 0 : fEobject.hashCode());
    result = prime * result + ((fId == null) ? 0 : fId.hashCode());
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
    if (fEobject == null) {if (other.fEobject != null) return false;}
    else if (!fEobject.equals(other.fEobject)) return false;
    if (fId == null) {if (other.fId != null) return false;}
    else if (!fId.equals(other.fId)) return false;
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
   * @param pEobject the fixed value of pattern parameter eobject, or null if not bound.
   * @param pId the fixed value of pattern parameter id, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static Id2objectMatch newMutableMatch(final Object pEobject, final String pId) {
    return new Mutable(pEobject, pId);
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
  public static Id2objectMatch newMatch(final Object pEobject, final String pId) {
    return new Immutable(pEobject, pId);
  }
  
  private static final class Mutable extends Id2objectMatch {
    Mutable(final Object pEobject, final String pId) {
      super(pEobject, pId);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends Id2objectMatch {
    Immutable(final Object pEobject, final String pId) {
      super(pEobject, pId);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
