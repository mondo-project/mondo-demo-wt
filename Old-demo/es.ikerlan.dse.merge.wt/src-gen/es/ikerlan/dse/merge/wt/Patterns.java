package es.ikerlan.dse.merge.wt;

import es.ikerlan.dse.merge.wt.Id2objectMatcher;
import es.ikerlan.dse.merge.wt.util.Id2objectQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in patterns.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file patterns.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package es.ikerlan.dse.merge.wt, the group contains the definition of the following patterns: <ul>
 * <li>id2object</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Patterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Patterns instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Patterns();
    }
    return INSTANCE;
  }
  
  private static Patterns INSTANCE;
  
  private Patterns() throws IncQueryException {
    querySpecifications.add(Id2objectQuerySpecification.instance());
  }
  
  public Id2objectQuerySpecification getId2object() throws IncQueryException {
    return Id2objectQuerySpecification.instance();
  }
  
  public Id2objectMatcher getId2object(final IncQueryEngine engine) throws IncQueryException {
    return Id2objectMatcher.on(engine);
  }
}
