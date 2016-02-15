package org.mondo.wt.cstudy.lens;

import java.util.Set;

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

	public UniqueIdSchemeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UniqueIDScheme apply(URI input) {
		System.out.println(getClass().getSimpleName() + " on " + input);
		return ComposableIDFunction.dispatchTo(WTUniqueID.INSTANCE, DefaultEMFUniqueIDFunctions.forBaseURI(input));
	}

	public static class WTUniqueID extends ComposableIDFunction {
		public final static WTUniqueID INSTANCE = new WTUniqueID();

		@Override
		public Object tryApply(EObject input) {
			if (input instanceof WT) {
				return "org.mondo.wt.cstudy.WTSpec4M.WT:" + ((WT) input).getSysId();
			}
			if (input instanceof wtc) {
				return "org.mondo.wt.cstudy.WTSpec4M.wtc:" + ((wtc) input).getSysId();
			}
			if (input instanceof Subsystem) {
				return "org.mondo.wt.cstudy.WTSpec4M.Subsystem:" + ((Subsystem) input).getSysId();
			}
			if (input instanceof SystemFault) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemFault:" + ((SystemFault) input).getSysId();
			}
			if (input instanceof SystemInput) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemInput:" + ((SystemInput) input).getSysId();
			}
			if (input instanceof SystemOutput) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemOutput:" + ((SystemOutput) input).getSysId();
			}
			if (input instanceof SystemParam) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemOutput:" + ((SystemParam) input).getSysId();
			}
			if (input instanceof SystemVariable) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemVariable:" + ((SystemVariable) input).getSysId();
			}
			if (input instanceof SystemTimer) {
				return "org.mondo.wt.cstudy.WTSpec4M.SystemTimer:" + ((SystemTimer) input).getSysId();
			}
			return null;
		}

		public Object generateUniqueId(EObject input, Set<Object> reserved) {
			String prefix = null;
			if (input instanceof WT) {
				prefix = "WT_";
			}
			if (input instanceof wtc) {
				prefix = "wtc_";
			}
			if (input instanceof Subsystem) {
				prefix = "Subsystem_";
			}
			if (input instanceof SystemFault) {
				prefix = "SystemFault_";
			}
			if (input instanceof SystemInput) {
				prefix = "SystemInput_";
			}
			if (input instanceof SystemOutput) {
				prefix = "SystemOutput_";
			}
			if (input instanceof SystemParam) {
				prefix = "SystemParam_";
			}
			if (input instanceof SystemVariable) {
				prefix = "SystemVariable_";
			}
			if (input instanceof SystemTimer) {
				prefix = "SystemTimer_";
			}
			if(prefix == null)
				throw new IllegalArgumentException();
			
			prefix = "generated_" + prefix;
			int counter = 1;
			for(; reserved.contains(prefix + counter); counter++);
			String id = prefix + String.valueOf(counter);
			return id;
		}

		public void setUniqueId(EObject target, Object value) {
        	if(value == null || target == null || !(value instanceof String))  {
        		throw new IllegalArgumentException();
        	}
        	if (target instanceof WT) {
				((WT) target).setSysId((String) value);
			}
			if (target instanceof wtc) {
				((wtc) target).setSysId((String) value);
			}
			if (target instanceof Subsystem) {
				((Subsystem) target).setSysId((String) value);
			}
			if (target instanceof SystemFault) {
				((SystemFault) target).setSysId((String) value);
			}
			if (target instanceof SystemInput) {
				((SystemInput) target).setSysId((String) value);
			}
			if (target instanceof SystemOutput) {
				((SystemOutput) target).setSysId((String) value);
			}
			if (target instanceof SystemParam) {
				((SystemParam) target).setSysId((String) value);
			}
			if (target instanceof SystemVariable) {
				((SystemVariable) target).setSysId((String) value);
			}
			if (target instanceof SystemTimer) {
				((SystemTimer) target).setSysId((String) value);
			}
        	
        }
    }

}
