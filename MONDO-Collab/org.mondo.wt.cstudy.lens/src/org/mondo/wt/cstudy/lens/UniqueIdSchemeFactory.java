package org.mondo.wt.cstudy.lens;

import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.security.lens.correspondence.ComposableIDFunction;
import org.mondo.collaboration.security.lens.correspondence.DefaultEMFUniqueIDFunctions;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDScheme;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;

import WTSpec4M.Subsystem;
import WTSpec4M.SystemFault;
import WTSpec4M.SystemInput;
import WTSpec4M.SystemOutput;
import WTSpec4M.SystemParam;
import WTSpec4M.SystemTimer;
import WTSpec4M.SystemVariable;
import WTSpec4M.WT;
import WTSpec4M.wtc;

public class UniqueIdSchemeFactory implements UniqueIDSchemeFactory {
	
	public static Logger LOGGER = Logger.getLogger(UniqueIDSchemeFactory.class);

	@Override
	public UniqueIDScheme apply(URI input) {
		if (LOGGER.isDebugEnabled()) 
			LOGGER.debug(getClass().getSimpleName() + " instantiated for resource URI " + input);
		return ComposableIDFunction.dispatchTo(WTUniqueID.INSTANCE, DefaultEMFUniqueIDFunctions.forBaseURI(input));
	}

	public static class WTUniqueID extends ComposableIDFunction {
		private static final String GENERATED = "_generated";
		public final static WTUniqueID INSTANCE = new WTUniqueID();

		@Override
		public Object tryApply(EObject input) {
			if (input instanceof WT) {
				return ((WT) input).getSysId() == null ? null : prefix(input) + ((WT) input).getSysId();
			}
			if (input instanceof wtc) {
				return ((wtc) input).getSysId() == null ? null : prefix(input) + ((wtc) input).getSysId();
			}
			if (input instanceof Subsystem) {
				return ((Subsystem) input).getSysId() == null ? null : prefix(input) + ((Subsystem) input).getSysId();
			}
			if (input instanceof SystemFault) {
				return ((SystemFault) input).getSysId() == null ? null : prefix(input) + ((SystemFault) input).getSysId();
			}
			if (input instanceof SystemInput) {
				return ((SystemInput) input).getSysId() == null ? null : prefix(input) + ((SystemInput) input).getSysId();
			}
			if (input instanceof SystemOutput) {
				return ((SystemOutput) input).getSysId() == null ? null : prefix(input) + ((SystemOutput) input).getSysId();
			}
			if (input instanceof SystemParam) {
				return ((SystemParam) input).getSysId() == null ? null : prefix(input) + ((SystemParam) input).getSysId();
			}
			if (input instanceof SystemVariable) {
				return ((SystemVariable) input).getSysId() == null ? null : prefix(input) + ((SystemVariable) input).getSysId();
			}
			if (input instanceof SystemTimer) {
				return ((SystemTimer) input).getSysId() == null ? null : prefix(input) + ((SystemTimer) input).getSysId();
			}
			return null;
		}

		public Object generateUniqueId(EObject input, Set<Object> reserved) {
			String prefix = prefix(input);
			String type = null;
			if (input instanceof WT) {
				type = "WT_";
			}
			if (input instanceof wtc) {
				type = "wtc_";
			}
			if (input instanceof Subsystem) {
				type = "Subsystem_";
			}
			if (input instanceof SystemFault) {
				type = "F_";
			}
			if (input instanceof SystemInput) {
				type = "I_";
			}
			if (input instanceof SystemOutput) {
				type = "O_";
			}
			if (input instanceof SystemParam) {
				type = "P_";
			}
			if (input instanceof SystemVariable) {
				type = "V_";
			}
			if (input instanceof SystemTimer) {
				type = "T_";
			}
			if(type == null)
				throw new IllegalArgumentException();
			
			int counter = 1;
			for(; reserved.contains(prefix + type + counter) || reserved.contains(prefix + type + counter + GENERATED); counter++);
			String id = type + String.valueOf(counter) + GENERATED;
			return id;
		}

		public void setUniqueId(EObject target, Object value) {
        	if(value == null || target == null || !(value instanceof String))  {
        		throw new IllegalArgumentException();
        	}
        	else if (target instanceof WT) {
				((WT) target).setSysId((String) value);
			}
        	else if (target instanceof wtc) {
				((wtc) target).setSysId((String) value);
			}
        	else if (target instanceof Subsystem) {
				((Subsystem) target).setSysId((String) value);
			}
        	else if (target instanceof SystemFault) {
				((SystemFault) target).setSysId((String) value);
			}
        	else if (target instanceof SystemInput) {
				((SystemInput) target).setSysId((String) value);
			}
        	else if (target instanceof SystemOutput) {
				((SystemOutput) target).setSysId((String) value);
			}
        	else if (target instanceof SystemParam) {
				((SystemParam) target).setSysId((String) value);
			}
        	else if (target instanceof SystemVariable) {
				((SystemVariable) target).setSysId((String) value);
			}
        	else if (target instanceof SystemTimer) {
				((SystemTimer) target).setSysId((String) value);
			}
        	else
        		throw new IllegalArgumentException();
        }
		
		protected String prefix(EObject input) {
			if (input instanceof WT) {
				return "org.mondo.wt.cstudy.WTSpec4M.WT:";
			}
			if (input instanceof wtc) {
				return "org.mondo.wt.cstudy.WTSpec4M.wtc:";
			}
			if (input instanceof Subsystem) {
				return "org.mondo.wt.cstudy.WTSpec4M.Subsystem:";
			}
			if (input instanceof SystemFault) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemFault:";
			}
			if (input instanceof SystemInput) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemInput:";
			}
			if (input instanceof SystemOutput) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemOutput:";
			}
			if (input instanceof SystemParam) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemOutput:";
			}
			if (input instanceof SystemVariable) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemVariable:";
			}
			if (input instanceof SystemTimer) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemTimer:";
			}
			throw new IllegalArgumentException();
		}
    }
}
