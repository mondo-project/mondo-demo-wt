package org.mondo.wt.cstudy.metamodel.merge.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.mondo.wt.cstudy.metamodel.merge.Id2objectMatch;

/**
 * A match processor tailored for the org.mondo.wt.cstudy.metamodel.merge.id2object pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class Id2objectProcessor implements IMatchProcessor<Id2objectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pObject the value of pattern parameter object in the currently processed match
   * @param pKey the value of pattern parameter key in the currently processed match
   * 
   */
  public abstract void process(final EObject pObject, final String pKey);
  
  @Override
  public void process(final Id2objectMatch match) {
    process(match.getObject(), match.getKey());
  }
}
