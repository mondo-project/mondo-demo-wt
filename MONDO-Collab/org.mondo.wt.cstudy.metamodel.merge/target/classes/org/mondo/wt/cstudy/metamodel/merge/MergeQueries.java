package org.mondo.wt.cstudy.metamodel.merge;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.mondo.wt.cstudy.metamodel.merge.ContainmentPatternMatcher;
import org.mondo.wt.cstudy.metamodel.merge.util.ContainmentPatternQuerySpecification;

/**
 * A pattern group formed of all patterns defined in mergeQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file mergeQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.mondo.wt.cstudy.metamodel.merge, the group contains the definition of the following patterns: <ul>
 * <li>containmentPattern</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class MergeQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static MergeQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new MergeQueries();
    }
    return INSTANCE;
  }
  
  private static MergeQueries INSTANCE;
  
  private MergeQueries() throws IncQueryException {
    querySpecifications.add(ContainmentPatternQuerySpecification.instance());
  }
  
  public ContainmentPatternQuerySpecification getContainmentPattern() throws IncQueryException {
    return ContainmentPatternQuerySpecification.instance();
  }
  
  public ContainmentPatternMatcher getContainmentPattern(final IncQueryEngine engine) throws IncQueryException {
    return ContainmentPatternMatcher.on(engine);
  }
}
