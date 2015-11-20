package es.ikerlan.dse.merge.wt.util;

import es.ikerlan.WTSpec4M.WTElement;
import es.ikerlan.dse.merge.wt.Id2objectMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the es.ikerlan.dse.merge.wt.id2object pattern.
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
  public abstract void process(final WTElement pEobject, final String pId);
  
  @Override
  public void process(final Id2objectMatch match) {
    process(match.getEobject(), match.getId());
  }
}
