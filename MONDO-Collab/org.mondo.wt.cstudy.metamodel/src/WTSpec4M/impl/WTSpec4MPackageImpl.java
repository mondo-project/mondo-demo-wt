/**
 */
package WTSpec4M.impl;

import WTSpec4M.CtrlUnit10;
import WTSpec4M.CtrlUnit102;
import WTSpec4M.CtrlUnit11;
import WTSpec4M.CtrlUnit124;
import WTSpec4M.CtrlUnit125;
import WTSpec4M.CtrlUnit126;
import WTSpec4M.CtrlUnit13;
import WTSpec4M.CtrlUnit15;
import WTSpec4M.CtrlUnit18;
import WTSpec4M.CtrlUnit27;
import WTSpec4M.CtrlUnit29;
import WTSpec4M.CtrlUnit31;
import WTSpec4M.CtrlUnit34;
import WTSpec4M.CtrlUnit36;
import WTSpec4M.CtrlUnit37;
import WTSpec4M.CtrlUnit39;
import WTSpec4M.CtrlUnit40;
import WTSpec4M.CtrlUnit44;
import WTSpec4M.CtrlUnit46;
import WTSpec4M.CtrlUnit47;
import WTSpec4M.CtrlUnit49;
import WTSpec4M.CtrlUnit5;
import WTSpec4M.CtrlUnit50;
import WTSpec4M.CtrlUnit58;
import WTSpec4M.CtrlUnit59;
import WTSpec4M.CtrlUnit65;
import WTSpec4M.CtrlUnit68;
import WTSpec4M.CtrlUnit71;
import WTSpec4M.CtrlUnit73;
import WTSpec4M.CtrlUnit78;
import WTSpec4M.CtrlUnit80;
import WTSpec4M.CtrlUnit9;
import WTSpec4M.CtrlUnit92;
import WTSpec4M.CtrlUnit94;
import WTSpec4M.MainSubsystem;
import WTSpec4M.Subsystem;
import WTSpec4M.SystemFault;
import WTSpec4M.SystemInput;
import WTSpec4M.SystemOutput;
import WTSpec4M.SystemParam;
import WTSpec4M.SystemTimer;
import WTSpec4M.SystemVariable;
import WTSpec4M.WTCFault;
import WTSpec4M.WTCInput;
import WTSpec4M.WTCOutput;
import WTSpec4M.WTCParam;
import WTSpec4M.WTCTimer;
import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;
import WTSpec4M.wtc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WTSpec4MPackageImpl extends EPackageImpl implements WTSpec4MPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit9EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit10EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit13EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit15EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit18EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit27EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit29EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit31EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit34EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit36EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit37EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit39EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit40EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit44EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit46EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit47EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit49EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit50EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit58EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit59EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit65EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit68EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit71EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit73EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit78EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit80EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit92EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit94EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit102EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit124EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit125EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit126EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainSubsystemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see WTSpec4M.WTSpec4MPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WTSpec4MPackageImpl() {
		super(eNS_URI, WTSpec4MFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WTSpec4MPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WTSpec4MPackage init() {
		if (isInited) return (WTSpec4MPackage)EPackage.Registry.INSTANCE.getEPackage(WTSpec4MPackage.eNS_URI);

		// Obtain or create and register package
		WTSpec4MPackageImpl theWTSpec4MPackage = (WTSpec4MPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WTSpec4MPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WTSpec4MPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWTSpec4MPackage.createPackageContents();

		// Initialize created meta-data
		theWTSpec4MPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWTSpec4MPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WTSpec4MPackage.eNS_URI, theWTSpec4MPackage);
		return theWTSpec4MPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWT() {
		return wtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWT_SysId() {
		return (EAttribute)wtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWT_Model() {
		return (EAttribute)wtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWT_Version() {
		return (EAttribute)wtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsSubsystems() {
		return (EReference)wtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsInputs() {
		return (EReference)wtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsOutputs() {
		return (EReference)wtEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsParams() {
		return (EReference)wtEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsTimers() {
		return (EReference)wtEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsFaults() {
		return (EReference)wtEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsVariables() {
		return (EReference)wtEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemInput() {
		return systemInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemInput_SysId() {
		return (EAttribute)systemInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemInput_Description() {
		return (EAttribute)systemInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemOutput() {
		return systemOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemOutput_SysId() {
		return (EAttribute)systemOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemOutput_Description() {
		return (EAttribute)systemOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFault() {
		return systemFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemFault_SysId() {
		return (EAttribute)systemFaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemFault_Description() {
		return (EAttribute)systemFaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemFault_Value() {
		return (EAttribute)systemFaultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemParam() {
		return systemParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemParam_SysId() {
		return (EAttribute)systemParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemParam_Description() {
		return (EAttribute)systemParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemParam_Value() {
		return (EAttribute)systemParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemParam_Settable() {
		return (EAttribute)systemParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTimer() {
		return systemTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimer_SysId() {
		return (EAttribute)systemTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimer_Description() {
		return (EAttribute)systemTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimer_Value() {
		return (EAttribute)systemTimerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemVariable() {
		return systemVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemVariable_SysId() {
		return (EAttribute)systemVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemVariable_Description() {
		return (EAttribute)systemVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCInput() {
		return wtcInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCOutput() {
		return wtcOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCParam() {
		return wtcParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCTimer() {
		return wtcTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCFault() {
		return wtcFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsystem() {
		return subsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsystem_SysId() {
		return (EAttribute)subsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsystem_Description() {
		return (EAttribute)subsystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsystem_ItsWTCs() {
		return (EReference)subsystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsystem_ItsSubsystems() {
		return (EReference)subsystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwtc() {
		return wtcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_SysId() {
		return (EAttribute)wtcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_Description() {
		return (EAttribute)wtcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_Cycle() {
		return (EAttribute)wtcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_Priority() {
		return (EAttribute)wtcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_Enabled() {
		return (EAttribute)wtcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit5() {
		return ctrlUnit5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit5_Input__iInput1() {
		return (EReference)ctrlUnit5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit5_Input__iInput2() {
		return (EReference)ctrlUnit5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit5_Output__oOutput1() {
		return (EReference)ctrlUnit5EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit9() {
		return ctrlUnit9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Input__iInput1() {
		return (EReference)ctrlUnit9EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Input__iInput2() {
		return (EReference)ctrlUnit9EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Input__iInput3() {
		return (EReference)ctrlUnit9EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Input__iInput4() {
		return (EReference)ctrlUnit9EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Output__oOutput1() {
		return (EReference)ctrlUnit9EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Parameter__pParam1() {
		return (EReference)ctrlUnit9EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Parameter__pParam2() {
		return (EReference)ctrlUnit9EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Timer__tTimer1() {
		return (EReference)ctrlUnit9EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit9_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit9EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit9_BhvParam__BhvParam2() {
		return (EAttribute)ctrlUnit9EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit10() {
		return ctrlUnit10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Input__iInput1() {
		return (EReference)ctrlUnit10EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Output__oOutput1() {
		return (EReference)ctrlUnit10EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pParam1() {
		return (EReference)ctrlUnit10EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pParam2() {
		return (EReference)ctrlUnit10EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pParam3() {
		return (EReference)ctrlUnit10EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pParam4() {
		return (EReference)ctrlUnit10EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pParam5() {
		return (EReference)ctrlUnit10EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pParam6() {
		return (EReference)ctrlUnit10EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit10_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit10EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit11() {
		return ctrlUnit11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit11_Input__iInput1() {
		return (EReference)ctrlUnit11EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit11_Input__iInput2() {
		return (EReference)ctrlUnit11EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit11_Output__oOutput1() {
		return (EReference)ctrlUnit11EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit13() {
		return ctrlUnit13EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Input__iInput1() {
		return (EReference)ctrlUnit13EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Input__iInput2() {
		return (EReference)ctrlUnit13EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Input__iInput3() {
		return (EReference)ctrlUnit13EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Output__oOutput1() {
		return (EReference)ctrlUnit13EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Parameter__pParam1() {
		return (EReference)ctrlUnit13EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Parameter__pParam2() {
		return (EReference)ctrlUnit13EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit13_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit13EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit13_BhvParam__BhvParam2() {
		return (EAttribute)ctrlUnit13EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit15() {
		return ctrlUnit15EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit15_Input__iInput1() {
		return (EReference)ctrlUnit15EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit15_Output__oOutput1() {
		return (EReference)ctrlUnit15EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit15_Parameter__pParam1() {
		return (EReference)ctrlUnit15EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit18() {
		return ctrlUnit18EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iInput1() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iInput2() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iInput3() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iInput4() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iInput5() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iInput6() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Output__oOutput1() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pParam1() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pParam2() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pParam3() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pParam4() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pParam5() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pParam6() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pParam7() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Timer__tTimer1() {
		return (EReference)ctrlUnit18EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit27() {
		return ctrlUnit27EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Input__iInput1() {
		return (EReference)ctrlUnit27EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Input__iInput2() {
		return (EReference)ctrlUnit27EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Output__oOutput1() {
		return (EReference)ctrlUnit27EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Output__oOutput2() {
		return (EReference)ctrlUnit27EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Parameter__pParam1() {
		return (EReference)ctrlUnit27EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit29() {
		return ctrlUnit29EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit29_Input__iInput1() {
		return (EReference)ctrlUnit29EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit29_Input__iInput2() {
		return (EReference)ctrlUnit29EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit29_Fault__fFault1() {
		return (EReference)ctrlUnit29EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit29_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit29EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit31() {
		return ctrlUnit31EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit31_Input__iInput1() {
		return (EReference)ctrlUnit31EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit31_Output__oOutput1() {
		return (EReference)ctrlUnit31EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit31_Parameter__pParam1() {
		return (EReference)ctrlUnit31EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit34() {
		return ctrlUnit34EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Input__iInput1() {
		return (EReference)ctrlUnit34EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Input__iInput2() {
		return (EReference)ctrlUnit34EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Output__oOutput1() {
		return (EReference)ctrlUnit34EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Output__oOutput2() {
		return (EReference)ctrlUnit34EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Timer__tTimer1() {
		return (EReference)ctrlUnit34EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Timer__tTimer2() {
		return (EReference)ctrlUnit34EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit34_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit34EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit36() {
		return ctrlUnit36EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit36_Input__iInput1() {
		return (EReference)ctrlUnit36EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit36_Output__oOutput1() {
		return (EReference)ctrlUnit36EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit36_Parameter__pParam1() {
		return (EReference)ctrlUnit36EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit36_Parameter__pParam2() {
		return (EReference)ctrlUnit36EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit37() {
		return ctrlUnit37EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Input__iInput1() {
		return (EReference)ctrlUnit37EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Input__iInput2() {
		return (EReference)ctrlUnit37EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Input__iInput3() {
		return (EReference)ctrlUnit37EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Output__oOutput1() {
		return (EReference)ctrlUnit37EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Fault__fFault1() {
		return (EReference)ctrlUnit37EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Timer__tTimer1() {
		return (EReference)ctrlUnit37EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit37_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit37EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit39() {
		return ctrlUnit39EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit39_Input__iInput1() {
		return (EReference)ctrlUnit39EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit39_Input__iInput2() {
		return (EReference)ctrlUnit39EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit39_Fault__fFault1() {
		return (EReference)ctrlUnit39EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit39_Timer__tTimer1() {
		return (EReference)ctrlUnit39EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit39_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit39EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit40() {
		return ctrlUnit40EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit40_Input__iInput1() {
		return (EReference)ctrlUnit40EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit40_Output__oOutput1() {
		return (EReference)ctrlUnit40EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit40_Timer__tTimer1() {
		return (EReference)ctrlUnit40EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit44() {
		return ctrlUnit44EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit44_Input__iInput1() {
		return (EReference)ctrlUnit44EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit44_Output__oOutput1() {
		return (EReference)ctrlUnit44EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit46() {
		return ctrlUnit46EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit46_Output__oOutput1() {
		return (EReference)ctrlUnit46EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit47() {
		return ctrlUnit47EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit47_Input__iInput1() {
		return (EReference)ctrlUnit47EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit47_Fault__fFault1() {
		return (EReference)ctrlUnit47EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit49() {
		return ctrlUnit49EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Input__iInput1() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Input__iInput2() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Input__iInput3() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Input__iInput4() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Output__oOutput1() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Output__oOutput2() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Parameter__pParam1() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Parameter__pParam2() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Parameter__pParam3() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Parameter__pParam4() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Fault__fFault1() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Timer__tTimer1() {
		return (EReference)ctrlUnit49EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit50() {
		return ctrlUnit50EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit50_Output__oOutput1() {
		return (EReference)ctrlUnit50EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit50_Fault__fFault1() {
		return (EReference)ctrlUnit50EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit58() {
		return ctrlUnit58EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit58_Input__iInput1() {
		return (EReference)ctrlUnit58EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit58_Output__oOutput1() {
		return (EReference)ctrlUnit58EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit58_Parameter__pParam1() {
		return (EReference)ctrlUnit58EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit58_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit58EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit59() {
		return ctrlUnit59EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit59_Input__iInput1() {
		return (EReference)ctrlUnit59EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit59_Output__oOutput1() {
		return (EReference)ctrlUnit59EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit65() {
		return ctrlUnit65EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit65_Output__oOutput1() {
		return (EReference)ctrlUnit65EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit65_Fault__fFault1() {
		return (EReference)ctrlUnit65EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit68() {
		return ctrlUnit68EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit68_Input__iInput1() {
		return (EReference)ctrlUnit68EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit68_Input__iInput2() {
		return (EReference)ctrlUnit68EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit68_Output__oOutput1() {
		return (EReference)ctrlUnit68EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit68_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit68EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit71() {
		return ctrlUnit71EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput1() {
		return (EReference)ctrlUnit71EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput2() {
		return (EReference)ctrlUnit71EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput3() {
		return (EReference)ctrlUnit71EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput4() {
		return (EReference)ctrlUnit71EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput5() {
		return (EReference)ctrlUnit71EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput6() {
		return (EReference)ctrlUnit71EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Output__oOutput1() {
		return (EReference)ctrlUnit71EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Output__oOutput2() {
		return (EReference)ctrlUnit71EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit73() {
		return ctrlUnit73EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit73_Input__iInput1() {
		return (EReference)ctrlUnit73EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit73_Output__oOutput1() {
		return (EReference)ctrlUnit73EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit78() {
		return ctrlUnit78EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit78_Input__iInput1() {
		return (EReference)ctrlUnit78EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit78_Input__iInput2() {
		return (EReference)ctrlUnit78EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit78_Output__oOutput1() {
		return (EReference)ctrlUnit78EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit80() {
		return ctrlUnit80EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iInput1() {
		return (EReference)ctrlUnit80EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iInput2() {
		return (EReference)ctrlUnit80EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iInput3() {
		return (EReference)ctrlUnit80EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iInput4() {
		return (EReference)ctrlUnit80EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iInput5() {
		return (EReference)ctrlUnit80EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Output__oOutput1() {
		return (EReference)ctrlUnit80EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit92() {
		return ctrlUnit92EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Input__iInput1() {
		return (EReference)ctrlUnit92EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Input__iInput2() {
		return (EReference)ctrlUnit92EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Parameter__pParam1() {
		return (EReference)ctrlUnit92EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Parameter__pParam2() {
		return (EReference)ctrlUnit92EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Fault__fFault1() {
		return (EReference)ctrlUnit92EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit92_BhvParam__BhvParam1() {
		return (EAttribute)ctrlUnit92EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit94() {
		return ctrlUnit94EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit94_Input__iInput1() {
		return (EReference)ctrlUnit94EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit94_Output__oOutput1() {
		return (EReference)ctrlUnit94EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit102() {
		return ctrlUnit102EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit102_Input__iInput1() {
		return (EReference)ctrlUnit102EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit102_Input__iInput2() {
		return (EReference)ctrlUnit102EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit102_Output__oOutput1() {
		return (EReference)ctrlUnit102EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit102_Fault__fFault1() {
		return (EReference)ctrlUnit102EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit124() {
		return ctrlUnit124EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit124_Input__iInput1() {
		return (EReference)ctrlUnit124EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit124_Input__iInput2() {
		return (EReference)ctrlUnit124EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit124_Output__oOutput1() {
		return (EReference)ctrlUnit124EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit125() {
		return ctrlUnit125EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit125_Input__iInput1() {
		return (EReference)ctrlUnit125EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit125_Output__oOutput1() {
		return (EReference)ctrlUnit125EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit125_Parameter__pParam1() {
		return (EReference)ctrlUnit125EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit125_Parameter__pParam2() {
		return (EReference)ctrlUnit125EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit126() {
		return ctrlUnit126EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Input__iInput1() {
		return (EReference)ctrlUnit126EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Input__iInput2() {
		return (EReference)ctrlUnit126EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Output__oOutput1() {
		return (EReference)ctrlUnit126EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Output__oOutput2() {
		return (EReference)ctrlUnit126EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Parameter__pParam1() {
		return (EReference)ctrlUnit126EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Parameter__pParam2() {
		return (EReference)ctrlUnit126EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainSubsystem() {
		return mainSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSpec4MFactory getWTSpec4MFactory() {
		return (WTSpec4MFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wtEClass = createEClass(WT);
		createEAttribute(wtEClass, WT__SYS_ID);
		createEAttribute(wtEClass, WT__MODEL);
		createEAttribute(wtEClass, WT__VERSION);
		createEReference(wtEClass, WT__ITS_SUBSYSTEMS);
		createEReference(wtEClass, WT__ITS_INPUTS);
		createEReference(wtEClass, WT__ITS_OUTPUTS);
		createEReference(wtEClass, WT__ITS_PARAMS);
		createEReference(wtEClass, WT__ITS_TIMERS);
		createEReference(wtEClass, WT__ITS_FAULTS);
		createEReference(wtEClass, WT__ITS_VARIABLES);

		systemInputEClass = createEClass(SYSTEM_INPUT);
		createEAttribute(systemInputEClass, SYSTEM_INPUT__SYS_ID);
		createEAttribute(systemInputEClass, SYSTEM_INPUT__DESCRIPTION);

		systemOutputEClass = createEClass(SYSTEM_OUTPUT);
		createEAttribute(systemOutputEClass, SYSTEM_OUTPUT__SYS_ID);
		createEAttribute(systemOutputEClass, SYSTEM_OUTPUT__DESCRIPTION);

		systemFaultEClass = createEClass(SYSTEM_FAULT);
		createEAttribute(systemFaultEClass, SYSTEM_FAULT__SYS_ID);
		createEAttribute(systemFaultEClass, SYSTEM_FAULT__DESCRIPTION);
		createEAttribute(systemFaultEClass, SYSTEM_FAULT__VALUE);

		systemParamEClass = createEClass(SYSTEM_PARAM);
		createEAttribute(systemParamEClass, SYSTEM_PARAM__SYS_ID);
		createEAttribute(systemParamEClass, SYSTEM_PARAM__DESCRIPTION);
		createEAttribute(systemParamEClass, SYSTEM_PARAM__VALUE);
		createEAttribute(systemParamEClass, SYSTEM_PARAM__SETTABLE);

		systemTimerEClass = createEClass(SYSTEM_TIMER);
		createEAttribute(systemTimerEClass, SYSTEM_TIMER__SYS_ID);
		createEAttribute(systemTimerEClass, SYSTEM_TIMER__DESCRIPTION);
		createEAttribute(systemTimerEClass, SYSTEM_TIMER__VALUE);

		systemVariableEClass = createEClass(SYSTEM_VARIABLE);
		createEAttribute(systemVariableEClass, SYSTEM_VARIABLE__SYS_ID);
		createEAttribute(systemVariableEClass, SYSTEM_VARIABLE__DESCRIPTION);

		wtcInputEClass = createEClass(WTC_INPUT);

		wtcOutputEClass = createEClass(WTC_OUTPUT);

		wtcParamEClass = createEClass(WTC_PARAM);

		wtcTimerEClass = createEClass(WTC_TIMER);

		wtcFaultEClass = createEClass(WTC_FAULT);

		subsystemEClass = createEClass(SUBSYSTEM);
		createEAttribute(subsystemEClass, SUBSYSTEM__SYS_ID);
		createEAttribute(subsystemEClass, SUBSYSTEM__DESCRIPTION);
		createEReference(subsystemEClass, SUBSYSTEM__ITS_WT_CS);
		createEReference(subsystemEClass, SUBSYSTEM__ITS_SUBSYSTEMS);

		wtcEClass = createEClass(WTC);
		createEAttribute(wtcEClass, WTC__SYS_ID);
		createEAttribute(wtcEClass, WTC__DESCRIPTION);
		createEAttribute(wtcEClass, WTC__CYCLE);
		createEAttribute(wtcEClass, WTC__PRIORITY);
		createEAttribute(wtcEClass, WTC__ENABLED);

		ctrlUnit5EClass = createEClass(CTRL_UNIT5);
		createEReference(ctrlUnit5EClass, CTRL_UNIT5__INPUT_IINPUT1);
		createEReference(ctrlUnit5EClass, CTRL_UNIT5__INPUT_IINPUT2);
		createEReference(ctrlUnit5EClass, CTRL_UNIT5__OUTPUT_OOUTPUT1);

		ctrlUnit9EClass = createEClass(CTRL_UNIT9);
		createEReference(ctrlUnit9EClass, CTRL_UNIT9__INPUT_IINPUT1);
		createEReference(ctrlUnit9EClass, CTRL_UNIT9__INPUT_IINPUT2);
		createEReference(ctrlUnit9EClass, CTRL_UNIT9__INPUT_IINPUT3);
		createEReference(ctrlUnit9EClass, CTRL_UNIT9__INPUT_IINPUT4);
		createEReference(ctrlUnit9EClass, CTRL_UNIT9__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit9EClass, CTRL_UNIT9__PARAMETER_PPARAM1);
		createEReference(ctrlUnit9EClass, CTRL_UNIT9__PARAMETER_PPARAM2);
		createEReference(ctrlUnit9EClass, CTRL_UNIT9__TIMER_TTIMER1);
		createEAttribute(ctrlUnit9EClass, CTRL_UNIT9__BHV_PARAM_BHV_PARAM1);
		createEAttribute(ctrlUnit9EClass, CTRL_UNIT9__BHV_PARAM_BHV_PARAM2);

		ctrlUnit10EClass = createEClass(CTRL_UNIT10);
		createEReference(ctrlUnit10EClass, CTRL_UNIT10__INPUT_IINPUT1);
		createEReference(ctrlUnit10EClass, CTRL_UNIT10__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit10EClass, CTRL_UNIT10__PARAMETER_PPARAM1);
		createEReference(ctrlUnit10EClass, CTRL_UNIT10__PARAMETER_PPARAM2);
		createEReference(ctrlUnit10EClass, CTRL_UNIT10__PARAMETER_PPARAM3);
		createEReference(ctrlUnit10EClass, CTRL_UNIT10__PARAMETER_PPARAM4);
		createEReference(ctrlUnit10EClass, CTRL_UNIT10__PARAMETER_PPARAM5);
		createEReference(ctrlUnit10EClass, CTRL_UNIT10__PARAMETER_PPARAM6);
		createEAttribute(ctrlUnit10EClass, CTRL_UNIT10__BHV_PARAM_BHV_PARAM1);

		ctrlUnit11EClass = createEClass(CTRL_UNIT11);
		createEReference(ctrlUnit11EClass, CTRL_UNIT11__INPUT_IINPUT1);
		createEReference(ctrlUnit11EClass, CTRL_UNIT11__INPUT_IINPUT2);
		createEReference(ctrlUnit11EClass, CTRL_UNIT11__OUTPUT_OOUTPUT1);

		ctrlUnit13EClass = createEClass(CTRL_UNIT13);
		createEReference(ctrlUnit13EClass, CTRL_UNIT13__INPUT_IINPUT1);
		createEReference(ctrlUnit13EClass, CTRL_UNIT13__INPUT_IINPUT2);
		createEReference(ctrlUnit13EClass, CTRL_UNIT13__INPUT_IINPUT3);
		createEReference(ctrlUnit13EClass, CTRL_UNIT13__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit13EClass, CTRL_UNIT13__PARAMETER_PPARAM1);
		createEReference(ctrlUnit13EClass, CTRL_UNIT13__PARAMETER_PPARAM2);
		createEAttribute(ctrlUnit13EClass, CTRL_UNIT13__BHV_PARAM_BHV_PARAM1);
		createEAttribute(ctrlUnit13EClass, CTRL_UNIT13__BHV_PARAM_BHV_PARAM2);

		ctrlUnit15EClass = createEClass(CTRL_UNIT15);
		createEReference(ctrlUnit15EClass, CTRL_UNIT15__INPUT_IINPUT1);
		createEReference(ctrlUnit15EClass, CTRL_UNIT15__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit15EClass, CTRL_UNIT15__PARAMETER_PPARAM1);

		ctrlUnit18EClass = createEClass(CTRL_UNIT18);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__INPUT_IINPUT1);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__INPUT_IINPUT2);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__INPUT_IINPUT3);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__INPUT_IINPUT4);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__INPUT_IINPUT5);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__INPUT_IINPUT6);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__PARAMETER_PPARAM1);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__PARAMETER_PPARAM2);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__PARAMETER_PPARAM3);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__PARAMETER_PPARAM4);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__PARAMETER_PPARAM5);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__PARAMETER_PPARAM6);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__PARAMETER_PPARAM7);
		createEReference(ctrlUnit18EClass, CTRL_UNIT18__TIMER_TTIMER1);

		ctrlUnit27EClass = createEClass(CTRL_UNIT27);
		createEReference(ctrlUnit27EClass, CTRL_UNIT27__INPUT_IINPUT1);
		createEReference(ctrlUnit27EClass, CTRL_UNIT27__INPUT_IINPUT2);
		createEReference(ctrlUnit27EClass, CTRL_UNIT27__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit27EClass, CTRL_UNIT27__OUTPUT_OOUTPUT2);
		createEReference(ctrlUnit27EClass, CTRL_UNIT27__PARAMETER_PPARAM1);

		ctrlUnit29EClass = createEClass(CTRL_UNIT29);
		createEReference(ctrlUnit29EClass, CTRL_UNIT29__INPUT_IINPUT1);
		createEReference(ctrlUnit29EClass, CTRL_UNIT29__INPUT_IINPUT2);
		createEReference(ctrlUnit29EClass, CTRL_UNIT29__FAULT_FFAULT1);
		createEAttribute(ctrlUnit29EClass, CTRL_UNIT29__BHV_PARAM_BHV_PARAM1);

		ctrlUnit31EClass = createEClass(CTRL_UNIT31);
		createEReference(ctrlUnit31EClass, CTRL_UNIT31__INPUT_IINPUT1);
		createEReference(ctrlUnit31EClass, CTRL_UNIT31__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit31EClass, CTRL_UNIT31__PARAMETER_PPARAM1);

		ctrlUnit34EClass = createEClass(CTRL_UNIT34);
		createEReference(ctrlUnit34EClass, CTRL_UNIT34__INPUT_IINPUT1);
		createEReference(ctrlUnit34EClass, CTRL_UNIT34__INPUT_IINPUT2);
		createEReference(ctrlUnit34EClass, CTRL_UNIT34__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit34EClass, CTRL_UNIT34__OUTPUT_OOUTPUT2);
		createEReference(ctrlUnit34EClass, CTRL_UNIT34__TIMER_TTIMER1);
		createEReference(ctrlUnit34EClass, CTRL_UNIT34__TIMER_TTIMER2);
		createEAttribute(ctrlUnit34EClass, CTRL_UNIT34__BHV_PARAM_BHV_PARAM1);

		ctrlUnit36EClass = createEClass(CTRL_UNIT36);
		createEReference(ctrlUnit36EClass, CTRL_UNIT36__INPUT_IINPUT1);
		createEReference(ctrlUnit36EClass, CTRL_UNIT36__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit36EClass, CTRL_UNIT36__PARAMETER_PPARAM1);
		createEReference(ctrlUnit36EClass, CTRL_UNIT36__PARAMETER_PPARAM2);

		ctrlUnit37EClass = createEClass(CTRL_UNIT37);
		createEReference(ctrlUnit37EClass, CTRL_UNIT37__INPUT_IINPUT1);
		createEReference(ctrlUnit37EClass, CTRL_UNIT37__INPUT_IINPUT2);
		createEReference(ctrlUnit37EClass, CTRL_UNIT37__INPUT_IINPUT3);
		createEReference(ctrlUnit37EClass, CTRL_UNIT37__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit37EClass, CTRL_UNIT37__FAULT_FFAULT1);
		createEReference(ctrlUnit37EClass, CTRL_UNIT37__TIMER_TTIMER1);
		createEAttribute(ctrlUnit37EClass, CTRL_UNIT37__BHV_PARAM_BHV_PARAM1);

		ctrlUnit39EClass = createEClass(CTRL_UNIT39);
		createEReference(ctrlUnit39EClass, CTRL_UNIT39__INPUT_IINPUT1);
		createEReference(ctrlUnit39EClass, CTRL_UNIT39__INPUT_IINPUT2);
		createEReference(ctrlUnit39EClass, CTRL_UNIT39__FAULT_FFAULT1);
		createEReference(ctrlUnit39EClass, CTRL_UNIT39__TIMER_TTIMER1);
		createEAttribute(ctrlUnit39EClass, CTRL_UNIT39__BHV_PARAM_BHV_PARAM1);

		ctrlUnit40EClass = createEClass(CTRL_UNIT40);
		createEReference(ctrlUnit40EClass, CTRL_UNIT40__INPUT_IINPUT1);
		createEReference(ctrlUnit40EClass, CTRL_UNIT40__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit40EClass, CTRL_UNIT40__TIMER_TTIMER1);

		ctrlUnit44EClass = createEClass(CTRL_UNIT44);
		createEReference(ctrlUnit44EClass, CTRL_UNIT44__INPUT_IINPUT1);
		createEReference(ctrlUnit44EClass, CTRL_UNIT44__OUTPUT_OOUTPUT1);

		ctrlUnit46EClass = createEClass(CTRL_UNIT46);
		createEReference(ctrlUnit46EClass, CTRL_UNIT46__OUTPUT_OOUTPUT1);

		ctrlUnit47EClass = createEClass(CTRL_UNIT47);
		createEReference(ctrlUnit47EClass, CTRL_UNIT47__INPUT_IINPUT1);
		createEReference(ctrlUnit47EClass, CTRL_UNIT47__FAULT_FFAULT1);

		ctrlUnit49EClass = createEClass(CTRL_UNIT49);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__INPUT_IINPUT1);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__INPUT_IINPUT2);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__INPUT_IINPUT3);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__INPUT_IINPUT4);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__OUTPUT_OOUTPUT2);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__PARAMETER_PPARAM1);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__PARAMETER_PPARAM2);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__PARAMETER_PPARAM3);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__PARAMETER_PPARAM4);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__FAULT_FFAULT1);
		createEReference(ctrlUnit49EClass, CTRL_UNIT49__TIMER_TTIMER1);

		ctrlUnit50EClass = createEClass(CTRL_UNIT50);
		createEReference(ctrlUnit50EClass, CTRL_UNIT50__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit50EClass, CTRL_UNIT50__FAULT_FFAULT1);

		ctrlUnit58EClass = createEClass(CTRL_UNIT58);
		createEReference(ctrlUnit58EClass, CTRL_UNIT58__INPUT_IINPUT1);
		createEReference(ctrlUnit58EClass, CTRL_UNIT58__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit58EClass, CTRL_UNIT58__PARAMETER_PPARAM1);
		createEAttribute(ctrlUnit58EClass, CTRL_UNIT58__BHV_PARAM_BHV_PARAM1);

		ctrlUnit59EClass = createEClass(CTRL_UNIT59);
		createEReference(ctrlUnit59EClass, CTRL_UNIT59__INPUT_IINPUT1);
		createEReference(ctrlUnit59EClass, CTRL_UNIT59__OUTPUT_OOUTPUT1);

		ctrlUnit65EClass = createEClass(CTRL_UNIT65);
		createEReference(ctrlUnit65EClass, CTRL_UNIT65__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit65EClass, CTRL_UNIT65__FAULT_FFAULT1);

		ctrlUnit68EClass = createEClass(CTRL_UNIT68);
		createEReference(ctrlUnit68EClass, CTRL_UNIT68__INPUT_IINPUT1);
		createEReference(ctrlUnit68EClass, CTRL_UNIT68__INPUT_IINPUT2);
		createEReference(ctrlUnit68EClass, CTRL_UNIT68__OUTPUT_OOUTPUT1);
		createEAttribute(ctrlUnit68EClass, CTRL_UNIT68__BHV_PARAM_BHV_PARAM1);

		ctrlUnit71EClass = createEClass(CTRL_UNIT71);
		createEReference(ctrlUnit71EClass, CTRL_UNIT71__INPUT_IINPUT1);
		createEReference(ctrlUnit71EClass, CTRL_UNIT71__INPUT_IINPUT2);
		createEReference(ctrlUnit71EClass, CTRL_UNIT71__INPUT_IINPUT3);
		createEReference(ctrlUnit71EClass, CTRL_UNIT71__INPUT_IINPUT4);
		createEReference(ctrlUnit71EClass, CTRL_UNIT71__INPUT_IINPUT5);
		createEReference(ctrlUnit71EClass, CTRL_UNIT71__INPUT_IINPUT6);
		createEReference(ctrlUnit71EClass, CTRL_UNIT71__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit71EClass, CTRL_UNIT71__OUTPUT_OOUTPUT2);

		ctrlUnit73EClass = createEClass(CTRL_UNIT73);
		createEReference(ctrlUnit73EClass, CTRL_UNIT73__INPUT_IINPUT1);
		createEReference(ctrlUnit73EClass, CTRL_UNIT73__OUTPUT_OOUTPUT1);

		ctrlUnit78EClass = createEClass(CTRL_UNIT78);
		createEReference(ctrlUnit78EClass, CTRL_UNIT78__INPUT_IINPUT1);
		createEReference(ctrlUnit78EClass, CTRL_UNIT78__INPUT_IINPUT2);
		createEReference(ctrlUnit78EClass, CTRL_UNIT78__OUTPUT_OOUTPUT1);

		ctrlUnit80EClass = createEClass(CTRL_UNIT80);
		createEReference(ctrlUnit80EClass, CTRL_UNIT80__INPUT_IINPUT1);
		createEReference(ctrlUnit80EClass, CTRL_UNIT80__INPUT_IINPUT2);
		createEReference(ctrlUnit80EClass, CTRL_UNIT80__INPUT_IINPUT3);
		createEReference(ctrlUnit80EClass, CTRL_UNIT80__INPUT_IINPUT4);
		createEReference(ctrlUnit80EClass, CTRL_UNIT80__INPUT_IINPUT5);
		createEReference(ctrlUnit80EClass, CTRL_UNIT80__OUTPUT_OOUTPUT1);

		ctrlUnit92EClass = createEClass(CTRL_UNIT92);
		createEReference(ctrlUnit92EClass, CTRL_UNIT92__INPUT_IINPUT1);
		createEReference(ctrlUnit92EClass, CTRL_UNIT92__INPUT_IINPUT2);
		createEReference(ctrlUnit92EClass, CTRL_UNIT92__PARAMETER_PPARAM1);
		createEReference(ctrlUnit92EClass, CTRL_UNIT92__PARAMETER_PPARAM2);
		createEReference(ctrlUnit92EClass, CTRL_UNIT92__FAULT_FFAULT1);
		createEAttribute(ctrlUnit92EClass, CTRL_UNIT92__BHV_PARAM_BHV_PARAM1);

		ctrlUnit94EClass = createEClass(CTRL_UNIT94);
		createEReference(ctrlUnit94EClass, CTRL_UNIT94__INPUT_IINPUT1);
		createEReference(ctrlUnit94EClass, CTRL_UNIT94__OUTPUT_OOUTPUT1);

		ctrlUnit102EClass = createEClass(CTRL_UNIT102);
		createEReference(ctrlUnit102EClass, CTRL_UNIT102__INPUT_IINPUT1);
		createEReference(ctrlUnit102EClass, CTRL_UNIT102__INPUT_IINPUT2);
		createEReference(ctrlUnit102EClass, CTRL_UNIT102__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit102EClass, CTRL_UNIT102__FAULT_FFAULT1);

		ctrlUnit124EClass = createEClass(CTRL_UNIT124);
		createEReference(ctrlUnit124EClass, CTRL_UNIT124__INPUT_IINPUT1);
		createEReference(ctrlUnit124EClass, CTRL_UNIT124__INPUT_IINPUT2);
		createEReference(ctrlUnit124EClass, CTRL_UNIT124__OUTPUT_OOUTPUT1);

		ctrlUnit125EClass = createEClass(CTRL_UNIT125);
		createEReference(ctrlUnit125EClass, CTRL_UNIT125__INPUT_IINPUT1);
		createEReference(ctrlUnit125EClass, CTRL_UNIT125__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit125EClass, CTRL_UNIT125__PARAMETER_PPARAM1);
		createEReference(ctrlUnit125EClass, CTRL_UNIT125__PARAMETER_PPARAM2);

		ctrlUnit126EClass = createEClass(CTRL_UNIT126);
		createEReference(ctrlUnit126EClass, CTRL_UNIT126__INPUT_IINPUT1);
		createEReference(ctrlUnit126EClass, CTRL_UNIT126__INPUT_IINPUT2);
		createEReference(ctrlUnit126EClass, CTRL_UNIT126__OUTPUT_OOUTPUT1);
		createEReference(ctrlUnit126EClass, CTRL_UNIT126__OUTPUT_OOUTPUT2);
		createEReference(ctrlUnit126EClass, CTRL_UNIT126__PARAMETER_PPARAM1);
		createEReference(ctrlUnit126EClass, CTRL_UNIT126__PARAMETER_PPARAM2);

		mainSubsystemEClass = createEClass(MAIN_SUBSYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemInputEClass.getESuperTypes().add(this.getWTCInput());
		systemOutputEClass.getESuperTypes().add(this.getWTCOutput());
		systemFaultEClass.getESuperTypes().add(this.getWTCFault());
		systemParamEClass.getESuperTypes().add(this.getWTCParam());
		systemTimerEClass.getESuperTypes().add(this.getWTCTimer());
		systemVariableEClass.getESuperTypes().add(this.getWTCInput());
		systemVariableEClass.getESuperTypes().add(this.getWTCOutput());
		ctrlUnit5EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit9EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit10EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit11EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit13EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit15EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit18EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit27EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit29EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit31EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit34EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit36EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit37EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit39EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit40EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit44EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit46EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit47EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit49EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit50EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit58EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit59EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit65EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit68EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit71EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit73EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit78EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit80EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit92EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit94EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit102EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit124EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit125EClass.getESuperTypes().add(this.getwtc());
		ctrlUnit126EClass.getESuperTypes().add(this.getwtc());
		mainSubsystemEClass.getESuperTypes().add(this.getSubsystem());

		// Initialize classes, features, and operations; add parameters
		initEClass(wtEClass, WTSpec4M.WT.class, "WT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWT_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWT_Model(), ecorePackage.getEString(), "model", null, 0, 1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWT_Version(), ecorePackage.getEString(), "version", null, 0, 1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWT_ItsSubsystems(), this.getMainSubsystem(), null, "itsSubsystems", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWT_ItsInputs(), this.getSystemInput(), null, "itsInputs", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWT_ItsOutputs(), this.getSystemOutput(), null, "itsOutputs", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWT_ItsParams(), this.getSystemParam(), null, "itsParams", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWT_ItsTimers(), this.getSystemTimer(), null, "itsTimers", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWT_ItsFaults(), this.getSystemFault(), null, "itsFaults", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWT_ItsVariables(), this.getSystemVariable(), null, "itsVariables", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemInputEClass, SystemInput.class, "SystemInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemInput_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, SystemInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInput_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemOutputEClass, SystemOutput.class, "SystemOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemOutput_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, SystemOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemOutput_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemFaultEClass, SystemFault.class, "SystemFault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemFault_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, SystemFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemFault_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemFault_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SystemFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemParamEClass, SystemParam.class, "SystemParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemParam_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, SystemParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemParam_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemParam_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SystemParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemParam_Settable(), ecorePackage.getEBoolean(), "settable", null, 0, 1, SystemParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTimerEClass, SystemTimer.class, "SystemTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemTimer_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, SystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemTimer_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemTimer_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemVariableEClass, SystemVariable.class, "SystemVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemVariable_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, SystemVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wtcInputEClass, WTCInput.class, "WTCInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wtcOutputEClass, WTCOutput.class, "WTCOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wtcParamEClass, WTCParam.class, "WTCParam", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wtcTimerEClass, WTCTimer.class, "WTCTimer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wtcFaultEClass, WTCFault.class, "WTCFault", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsystemEClass, Subsystem.class, "Subsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubsystem_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubsystem_Description(), ecorePackage.getEString(), "description", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubsystem_ItsWTCs(), this.getwtc(), null, "itsWTCs", null, 0, -1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubsystem_ItsSubsystems(), this.getSubsystem(), null, "itsSubsystems", null, 0, -1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wtcEClass, wtc.class, "wtc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getwtc_SysId(), ecorePackage.getEString(), "sysId", null, 0, 1, wtc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getwtc_Description(), ecorePackage.getEString(), "description", null, 0, 1, wtc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getwtc_Cycle(), ecorePackage.getEShort(), "cycle", null, 0, 1, wtc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getwtc_Priority(), ecorePackage.getEShort(), "priority", null, 0, 1, wtc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getwtc_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, wtc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit5EClass, CtrlUnit5.class, "CtrlUnit5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit5_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit5_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit5_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit9EClass, CtrlUnit9.class, "CtrlUnit9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit9_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit9_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit9_Input__iInput3(), this.getWTCInput(), null, "Input__iInput3", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit9_Input__iInput4(), this.getWTCInput(), null, "Input__iInput4", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit9_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit9_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit9_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit9_Timer__tTimer1(), this.getWTCTimer(), null, "Timer__tTimer1", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit9_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit9_BhvParam__BhvParam2(), ecorePackage.getEString(), "BhvParam__BhvParam2", null, 0, 1, CtrlUnit9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit10EClass, CtrlUnit10.class, "CtrlUnit10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit10_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit10_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit10_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit10_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit10_Parameter__pParam3(), this.getWTCParam(), null, "Parameter__pParam3", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit10_Parameter__pParam4(), this.getWTCParam(), null, "Parameter__pParam4", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit10_Parameter__pParam5(), this.getWTCParam(), null, "Parameter__pParam5", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit10_Parameter__pParam6(), this.getWTCParam(), null, "Parameter__pParam6", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit10_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit11EClass, CtrlUnit11.class, "CtrlUnit11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit11_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit11.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit11_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit11.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit11_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit11.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit13EClass, CtrlUnit13.class, "CtrlUnit13", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit13_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit13_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit13_Input__iInput3(), this.getWTCInput(), null, "Input__iInput3", null, 0, 1, CtrlUnit13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit13_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit13_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit13_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit13_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit13_BhvParam__BhvParam2(), ecorePackage.getEString(), "BhvParam__BhvParam2", null, 0, 1, CtrlUnit13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit15EClass, CtrlUnit15.class, "CtrlUnit15", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit15_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit15.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit15_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit15.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit15_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit15.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit18EClass, CtrlUnit18.class, "CtrlUnit18", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit18_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Input__iInput3(), this.getWTCInput(), null, "Input__iInput3", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Input__iInput4(), this.getWTCInput(), null, "Input__iInput4", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Input__iInput5(), this.getWTCInput(), null, "Input__iInput5", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Input__iInput6(), this.getWTCInput(), null, "Input__iInput6", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Parameter__pParam3(), this.getWTCParam(), null, "Parameter__pParam3", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Parameter__pParam4(), this.getWTCParam(), null, "Parameter__pParam4", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Parameter__pParam5(), this.getWTCParam(), null, "Parameter__pParam5", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Parameter__pParam6(), this.getWTCParam(), null, "Parameter__pParam6", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Parameter__pParam7(), this.getWTCParam(), null, "Parameter__pParam7", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit18_Timer__tTimer1(), this.getWTCTimer(), null, "Timer__tTimer1", null, 0, 1, CtrlUnit18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit27EClass, CtrlUnit27.class, "CtrlUnit27", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit27_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit27.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit27_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit27.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit27_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit27.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit27_Output__oOutput2(), this.getWTCOutput(), null, "Output__oOutput2", null, 0, 1, CtrlUnit27.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit27_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit27.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit29EClass, CtrlUnit29.class, "CtrlUnit29", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit29_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit29.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit29_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit29.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit29_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit29.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit29_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit29.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit31EClass, CtrlUnit31.class, "CtrlUnit31", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit31_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit31.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit31_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit31.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit31_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit31.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit34EClass, CtrlUnit34.class, "CtrlUnit34", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit34_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit34.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit34_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit34.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit34_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit34.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit34_Output__oOutput2(), this.getWTCOutput(), null, "Output__oOutput2", null, 0, 1, CtrlUnit34.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit34_Timer__tTimer1(), this.getWTCTimer(), null, "Timer__tTimer1", null, 0, 1, CtrlUnit34.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit34_Timer__tTimer2(), this.getWTCTimer(), null, "Timer__tTimer2", null, 0, 1, CtrlUnit34.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit34_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit34.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit36EClass, CtrlUnit36.class, "CtrlUnit36", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit36_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit36.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit36_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit36.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit36_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit36.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit36_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit36.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit37EClass, CtrlUnit37.class, "CtrlUnit37", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit37_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit37.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit37_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit37.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit37_Input__iInput3(), this.getWTCInput(), null, "Input__iInput3", null, 0, 1, CtrlUnit37.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit37_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit37.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit37_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit37.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit37_Timer__tTimer1(), this.getWTCTimer(), null, "Timer__tTimer1", null, 0, 1, CtrlUnit37.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit37_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit37.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit39EClass, CtrlUnit39.class, "CtrlUnit39", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit39_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit39.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit39_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit39.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit39_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit39.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit39_Timer__tTimer1(), this.getWTCTimer(), null, "Timer__tTimer1", null, 0, 1, CtrlUnit39.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit39_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit39.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit40EClass, CtrlUnit40.class, "CtrlUnit40", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit40_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit40.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit40_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit40.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit40_Timer__tTimer1(), this.getWTCTimer(), null, "Timer__tTimer1", null, 0, 1, CtrlUnit40.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit44EClass, CtrlUnit44.class, "CtrlUnit44", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit44_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit44.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit44_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit44.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit46EClass, CtrlUnit46.class, "CtrlUnit46", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit46_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit46.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit47EClass, CtrlUnit47.class, "CtrlUnit47", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit47_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit47.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit47_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit47.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit49EClass, CtrlUnit49.class, "CtrlUnit49", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit49_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Input__iInput3(), this.getWTCInput(), null, "Input__iInput3", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Input__iInput4(), this.getWTCInput(), null, "Input__iInput4", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Output__oOutput2(), this.getWTCOutput(), null, "Output__oOutput2", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Parameter__pParam3(), this.getWTCParam(), null, "Parameter__pParam3", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Parameter__pParam4(), this.getWTCParam(), null, "Parameter__pParam4", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit49_Timer__tTimer1(), this.getWTCTimer(), null, "Timer__tTimer1", null, 0, 1, CtrlUnit49.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit50EClass, CtrlUnit50.class, "CtrlUnit50", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit50_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit50.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit50_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit50.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit58EClass, CtrlUnit58.class, "CtrlUnit58", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit58_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit58.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit58_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit58.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit58_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit58.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit58_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit58.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit59EClass, CtrlUnit59.class, "CtrlUnit59", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit59_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit59.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit59_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit59.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit65EClass, CtrlUnit65.class, "CtrlUnit65", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit65_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit65.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit65_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit65.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit68EClass, CtrlUnit68.class, "CtrlUnit68", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit68_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit68.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit68_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit68.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit68_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit68.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit68_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit68.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit71EClass, CtrlUnit71.class, "CtrlUnit71", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit71_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit71.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit71_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit71.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit71_Input__iInput3(), this.getWTCInput(), null, "Input__iInput3", null, 0, 1, CtrlUnit71.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit71_Input__iInput4(), this.getWTCInput(), null, "Input__iInput4", null, 0, 1, CtrlUnit71.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit71_Input__iInput5(), this.getWTCInput(), null, "Input__iInput5", null, 0, 1, CtrlUnit71.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit71_Input__iInput6(), this.getWTCInput(), null, "Input__iInput6", null, 0, 1, CtrlUnit71.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit71_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit71.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit71_Output__oOutput2(), this.getWTCOutput(), null, "Output__oOutput2", null, 0, 1, CtrlUnit71.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit73EClass, CtrlUnit73.class, "CtrlUnit73", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit73_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit73.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit73_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit73.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit78EClass, CtrlUnit78.class, "CtrlUnit78", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit78_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit78.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit78_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit78.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit78_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit78.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit80EClass, CtrlUnit80.class, "CtrlUnit80", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit80_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit80.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit80_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit80.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit80_Input__iInput3(), this.getWTCInput(), null, "Input__iInput3", null, 0, 1, CtrlUnit80.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit80_Input__iInput4(), this.getWTCInput(), null, "Input__iInput4", null, 0, 1, CtrlUnit80.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit80_Input__iInput5(), this.getWTCInput(), null, "Input__iInput5", null, 0, 1, CtrlUnit80.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit80_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit80.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit92EClass, CtrlUnit92.class, "CtrlUnit92", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit92_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit92.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit92_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit92.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit92_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit92.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit92_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit92.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit92_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit92.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCtrlUnit92_BhvParam__BhvParam1(), ecorePackage.getEString(), "BhvParam__BhvParam1", null, 0, 1, CtrlUnit92.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit94EClass, CtrlUnit94.class, "CtrlUnit94", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit94_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit94.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit94_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit94.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit102EClass, CtrlUnit102.class, "CtrlUnit102", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit102_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit102.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit102_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit102.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit102_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit102.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit102_Fault__fFault1(), this.getWTCFault(), null, "Fault__fFault1", null, 0, 1, CtrlUnit102.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit124EClass, CtrlUnit124.class, "CtrlUnit124", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit124_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit124.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit124_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit124.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit124_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit124.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit125EClass, CtrlUnit125.class, "CtrlUnit125", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit125_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit125.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit125_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit125.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit125_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit125.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit125_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit125.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ctrlUnit126EClass, CtrlUnit126.class, "CtrlUnit126", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCtrlUnit126_Input__iInput1(), this.getWTCInput(), null, "Input__iInput1", null, 0, 1, CtrlUnit126.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit126_Input__iInput2(), this.getWTCInput(), null, "Input__iInput2", null, 0, 1, CtrlUnit126.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit126_Output__oOutput1(), this.getWTCOutput(), null, "Output__oOutput1", null, 0, 1, CtrlUnit126.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit126_Output__oOutput2(), this.getWTCOutput(), null, "Output__oOutput2", null, 0, 1, CtrlUnit126.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit126_Parameter__pParam1(), this.getWTCParam(), null, "Parameter__pParam1", null, 0, 1, CtrlUnit126.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCtrlUnit126_Parameter__pParam2(), this.getWTCParam(), null, "Parameter__pParam2", null, 0, 1, CtrlUnit126.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainSubsystemEClass, MainSubsystem.class, "MainSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //WTSpec4MPackageImpl
