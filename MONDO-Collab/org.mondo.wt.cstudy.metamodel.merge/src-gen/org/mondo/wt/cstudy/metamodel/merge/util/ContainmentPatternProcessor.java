package org.mondo.wt.cstudy.metamodel.merge.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.wt.cstudy.metamodel.merge.ContainmentPatternMatch;

/**
 * A match processor tailored for the org.mondo.wt.cstudy.metamodel.merge.containmentPattern pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ContainmentPatternProcessor implements IMatchProcessor<ContainmentPatternMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pParent the value of pattern parameter parent in the currently processed match
   * @param pChild the value of pattern parameter child in the currently processed match
   * 
   */
  public abstract void process(final EObject pParent, final EObject pChild);
  
  @Override
  public void process(final ContainmentPatternMatch match) {
    process(match.getParent(), match.getChild());
  }
}
