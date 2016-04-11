package WTSpec4M.validation;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import WTSpec4M.WTSpec4MPackage;

public class WTSpec4MStartup implements IStartup {

	@Override
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(
				WTSpec4MPackage.eINSTANCE,
				new WTSpec4MValidator());
	}

}
