package org.mondo.wt.cstudy.merge.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.wt.cstudy.merge.Id2objectMatch;

/**
 * A match processor tailored for the org.mondo.wt.cstudy.merge.id2object pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Id2objectProcessor implements IMatchProcessor<Id2objectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEobject the value of pattern parameter eobject in the currently processed match
   * @param pId the value of pattern parameter id in the currently processed match
   * 
   */
  public abstract void process(final Object pEobject, final String pId);
  
  @Override
  public void process(final Id2objectMatch match) {
    process(match.getEobject(), match.getId());
  }
}
