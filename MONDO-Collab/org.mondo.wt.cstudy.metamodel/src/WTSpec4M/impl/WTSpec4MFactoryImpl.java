/**
 */
package WTSpec4M.impl;

import WTSpec4M.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WTSpec4MFactoryImpl extends EFactoryImpl implements WTSpec4MFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WTSpec4MFactory init() {
		try {
			WTSpec4MFactory theWTSpec4MFactory = (WTSpec4MFactory)EPackage.Registry.INSTANCE.getEFactory(WTSpec4MPackage.eNS_URI);
			if (theWTSpec4MFactory != null) {
				return theWTSpec4MFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WTSpec4MFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSpec4MFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WTSpec4MPackage.WT: return createWT();
			case WTSpec4MPackage.SYSTEM_INPUT: return createSystemInput();
			case WTSpec4MPackage.SYSTEM_OUTPUT: return createSystemOutput();
			case WTSpec4MPackage.SYSTEM_FAULT: return createSystemFault();
			case WTSpec4MPackage.SYSTEM_PARAM: return createSystemParam();
			case WTSpec4MPackage.SYSTEM_TIMER: return createSystemTimer();
			case WTSpec4MPackage.SYSTEM_VARIABLE: return createSystemVariable();
			case WTSpec4MPackage.SUBSYSTEM: return createSubsystem();
			case WTSpec4MPackage.CTRL_UNIT5: return createCtrlUnit5();
			case WTSpec4MPackage.CTRL_UNIT9: return createCtrlUnit9();
			case WTSpec4MPackage.CTRL_UNIT10: return createCtrlUnit10();
			case WTSpec4MPackage.CTRL_UNIT11: return createCtrlUnit11();
			case WTSpec4MPackage.CTRL_UNIT13: return createCtrlUnit13();
			case WTSpec4MPackage.CTRL_UNIT15: return createCtrlUnit15();
			case WTSpec4MPackage.CTRL_UNIT18: return createCtrlUnit18();
			case WTSpec4MPackage.CTRL_UNIT27: return createCtrlUnit27();
			case WTSpec4MPackage.CTRL_UNIT29: return createCtrlUnit29();
			case WTSpec4MPackage.CTRL_UNIT31: return createCtrlUnit31();
			case WTSpec4MPackage.CTRL_UNIT34: return createCtrlUnit34();
			case WTSpec4MPackage.CTRL_UNIT36: return createCtrlUnit36();
			case WTSpec4MPackage.CTRL_UNIT37: return createCtrlUnit37();
			case WTSpec4MPackage.CTRL_UNIT39: return createCtrlUnit39();
			case WTSpec4MPackage.CTRL_UNIT40: return createCtrlUnit40();
			case WTSpec4MPackage.CTRL_UNIT44: return createCtrlUnit44();
			case WTSpec4MPackage.CTRL_UNIT46: return createCtrlUnit46();
			case WTSpec4MPackage.CTRL_UNIT47: return createCtrlUnit47();
			case WTSpec4MPackage.CTRL_UNIT49: return createCtrlUnit49();
			case WTSpec4MPackage.CTRL_UNIT50: return createCtrlUnit50();
			case WTSpec4MPackage.CTRL_UNIT58: return createCtrlUnit58();
			case WTSpec4MPackage.CTRL_UNIT59: return createCtrlUnit59();
			case WTSpec4MPackage.CTRL_UNIT65: return createCtrlUnit65();
			case WTSpec4MPackage.CTRL_UNIT68: return createCtrlUnit68();
			case WTSpec4MPackage.CTRL_UNIT71: return createCtrlUnit71();
			case WTSpec4MPackage.CTRL_UNIT73: return createCtrlUnit73();
			case WTSpec4MPackage.CTRL_UNIT78: return createCtrlUnit78();
			case WTSpec4MPackage.CTRL_UNIT80: return createCtrlUnit80();
			case WTSpec4MPackage.CTRL_UNIT92: return createCtrlUnit92();
			case WTSpec4MPackage.CTRL_UNIT94: return createCtrlUnit94();
			case WTSpec4MPackage.CTRL_UNIT102: return createCtrlUnit102();
			case WTSpec4MPackage.CTRL_UNIT124: return createCtrlUnit124();
			case WTSpec4MPackage.CTRL_UNIT125: return createCtrlUnit125();
			case WTSpec4MPackage.CTRL_UNIT126: return createCtrlUnit126();
			case WTSpec4MPackage.MAIN_SUBSYSTEM: return createMainSubsystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WT createWT() {
		WTImpl wt = new WTImpl();
		return wt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInput createSystemInput() {
		SystemInputImpl systemInput = new SystemInputImpl();
		return systemInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOutput createSystemOutput() {
		SystemOutputImpl systemOutput = new SystemOutputImpl();
		return systemOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFault createSystemFault() {
		SystemFaultImpl systemFault = new SystemFaultImpl();
		return systemFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemParam createSystemParam() {
		SystemParamImpl systemParam = new SystemParamImpl();
		return systemParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTimer createSystemTimer() {
		SystemTimerImpl systemTimer = new SystemTimerImpl();
		return systemTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemVariable createSystemVariable() {
		SystemVariableImpl systemVariable = new SystemVariableImpl();
		return systemVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem createSubsystem() {
		SubsystemImpl subsystem = new SubsystemImpl();
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit5 createCtrlUnit5() {
		CtrlUnit5Impl ctrlUnit5 = new CtrlUnit5Impl();
		return ctrlUnit5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit9 createCtrlUnit9() {
		CtrlUnit9Impl ctrlUnit9 = new CtrlUnit9Impl();
		return ctrlUnit9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit10 createCtrlUnit10() {
		CtrlUnit10Impl ctrlUnit10 = new CtrlUnit10Impl();
		return ctrlUnit10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit11 createCtrlUnit11() {
		CtrlUnit11Impl ctrlUnit11 = new CtrlUnit11Impl();
		return ctrlUnit11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit13 createCtrlUnit13() {
		CtrlUnit13Impl ctrlUnit13 = new CtrlUnit13Impl();
		return ctrlUnit13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit15 createCtrlUnit15() {
		CtrlUnit15Impl ctrlUnit15 = new CtrlUnit15Impl();
		return ctrlUnit15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit18 createCtrlUnit18() {
		CtrlUnit18Impl ctrlUnit18 = new CtrlUnit18Impl();
		return ctrlUnit18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit27 createCtrlUnit27() {
		CtrlUnit27Impl ctrlUnit27 = new CtrlUnit27Impl();
		return ctrlUnit27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit29 createCtrlUnit29() {
		CtrlUnit29Impl ctrlUnit29 = new CtrlUnit29Impl();
		return ctrlUnit29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit31 createCtrlUnit31() {
		CtrlUnit31Impl ctrlUnit31 = new CtrlUnit31Impl();
		return ctrlUnit31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit34 createCtrlUnit34() {
		CtrlUnit34Impl ctrlUnit34 = new CtrlUnit34Impl();
		return ctrlUnit34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit36 createCtrlUnit36() {
		CtrlUnit36Impl ctrlUnit36 = new CtrlUnit36Impl();
		return ctrlUnit36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit37 createCtrlUnit37() {
		CtrlUnit37Impl ctrlUnit37 = new CtrlUnit37Impl();
		return ctrlUnit37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit39 createCtrlUnit39() {
		CtrlUnit39Impl ctrlUnit39 = new CtrlUnit39Impl();
		return ctrlUnit39;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit40 createCtrlUnit40() {
		CtrlUnit40Impl ctrlUnit40 = new CtrlUnit40Impl();
		return ctrlUnit40;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit44 createCtrlUnit44() {
		CtrlUnit44Impl ctrlUnit44 = new CtrlUnit44Impl();
		return ctrlUnit44;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit46 createCtrlUnit46() {
		CtrlUnit46Impl ctrlUnit46 = new CtrlUnit46Impl();
		return ctrlUnit46;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit47 createCtrlUnit47() {
		CtrlUnit47Impl ctrlUnit47 = new CtrlUnit47Impl();
		return ctrlUnit47;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit49 createCtrlUnit49() {
		CtrlUnit49Impl ctrlUnit49 = new CtrlUnit49Impl();
		return ctrlUnit49;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit50 createCtrlUnit50() {
		CtrlUnit50Impl ctrlUnit50 = new CtrlUnit50Impl();
		return ctrlUnit50;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit58 createCtrlUnit58() {
		CtrlUnit58Impl ctrlUnit58 = new CtrlUnit58Impl();
		return ctrlUnit58;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit59 createCtrlUnit59() {
		CtrlUnit59Impl ctrlUnit59 = new CtrlUnit59Impl();
		return ctrlUnit59;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit65 createCtrlUnit65() {
		CtrlUnit65Impl ctrlUnit65 = new CtrlUnit65Impl();
		return ctrlUnit65;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit68 createCtrlUnit68() {
		CtrlUnit68Impl ctrlUnit68 = new CtrlUnit68Impl();
		return ctrlUnit68;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit71 createCtrlUnit71() {
		CtrlUnit71Impl ctrlUnit71 = new CtrlUnit71Impl();
		return ctrlUnit71;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit73 createCtrlUnit73() {
		CtrlUnit73Impl ctrlUnit73 = new CtrlUnit73Impl();
		return ctrlUnit73;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit78 createCtrlUnit78() {
		CtrlUnit78Impl ctrlUnit78 = new CtrlUnit78Impl();
		return ctrlUnit78;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit80 createCtrlUnit80() {
		CtrlUnit80Impl ctrlUnit80 = new CtrlUnit80Impl();
		return ctrlUnit80;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit92 createCtrlUnit92() {
		CtrlUnit92Impl ctrlUnit92 = new CtrlUnit92Impl();
		return ctrlUnit92;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit94 createCtrlUnit94() {
		CtrlUnit94Impl ctrlUnit94 = new CtrlUnit94Impl();
		return ctrlUnit94;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit102 createCtrlUnit102() {
		CtrlUnit102Impl ctrlUnit102 = new CtrlUnit102Impl();
		return ctrlUnit102;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit124 createCtrlUnit124() {
		CtrlUnit124Impl ctrlUnit124 = new CtrlUnit124Impl();
		return ctrlUnit124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit125 createCtrlUnit125() {
		CtrlUnit125Impl ctrlUnit125 = new CtrlUnit125Impl();
		return ctrlUnit125;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit126 createCtrlUnit126() {
		CtrlUnit126Impl ctrlUnit126 = new CtrlUnit126Impl();
		return ctrlUnit126;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainSubsystem createMainSubsystem() {
		MainSubsystemImpl mainSubsystem = new MainSubsystemImpl();
		return mainSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSpec4MPackage getWTSpec4MPackage() {
		return (WTSpec4MPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WTSpec4MPackage getPackage() {
		return WTSpec4MPackage.eINSTANCE;
	}

} //WTSpec4MFactoryImpl
