/**
 */
package WTSpec4M;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see WTSpec4M.WTSpec4MFactory
 * @model kind="package"
 * @generated
 */
public interface WTSpec4MPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WTSpec4M";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://WTSpec4M/5.0M";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wtc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WTSpec4MPackage eINSTANCE = WTSpec4M.impl.WTSpec4MPackageImpl.init();

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.WTImpl <em>WT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.WTImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWT()
	 * @generated
	 */
	int WT = 0;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__SYS_ID = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_SUBSYSTEMS = 3;

	/**
	 * The feature id for the '<em><b>Its Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_INPUTS = 4;

	/**
	 * The feature id for the '<em><b>Its Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_OUTPUTS = 5;

	/**
	 * The feature id for the '<em><b>Its Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_PARAMS = 6;

	/**
	 * The feature id for the '<em><b>Its Timers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_TIMERS = 7;

	/**
	 * The feature id for the '<em><b>Its Faults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_FAULTS = 8;

	/**
	 * The feature id for the '<em><b>Its Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_VARIABLES = 9;

	/**
	 * The number of structural features of the '<em>WT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>WT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.WTCInputImpl <em>WTC Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.WTCInputImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCInput()
	 * @generated
	 */
	int WTC_INPUT = 7;

	/**
	 * The number of structural features of the '<em>WTC Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_INPUT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WTC Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.SystemInputImpl <em>System Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.SystemInputImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemInput()
	 * @generated
	 */
	int SYSTEM_INPUT = 1;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT__SYS_ID = WTC_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT__DESCRIPTION = WTC_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_FEATURE_COUNT = WTC_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_OPERATION_COUNT = WTC_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.WTCOutputImpl <em>WTC Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.WTCOutputImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCOutput()
	 * @generated
	 */
	int WTC_OUTPUT = 8;

	/**
	 * The number of structural features of the '<em>WTC Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_OUTPUT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WTC Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.SystemOutputImpl <em>System Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.SystemOutputImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemOutput()
	 * @generated
	 */
	int SYSTEM_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT__SYS_ID = WTC_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT__DESCRIPTION = WTC_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT_FEATURE_COUNT = WTC_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT_OPERATION_COUNT = WTC_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.WTCFaultImpl <em>WTC Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.WTCFaultImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCFault()
	 * @generated
	 */
	int WTC_FAULT = 11;

	/**
	 * The number of structural features of the '<em>WTC Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_FAULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WTC Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_FAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.SystemFaultImpl <em>System Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.SystemFaultImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemFault()
	 * @generated
	 */
	int SYSTEM_FAULT = 3;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT__SYS_ID = WTC_FAULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT__DESCRIPTION = WTC_FAULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT__VALUE = WTC_FAULT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT_FEATURE_COUNT = WTC_FAULT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT_OPERATION_COUNT = WTC_FAULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.WTCParamImpl <em>WTC Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.WTCParamImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCParam()
	 * @generated
	 */
	int WTC_PARAM = 9;

	/**
	 * The number of structural features of the '<em>WTC Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_PARAM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WTC Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.SystemParamImpl <em>System Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.SystemParamImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemParam()
	 * @generated
	 */
	int SYSTEM_PARAM = 4;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM__SYS_ID = WTC_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM__DESCRIPTION = WTC_PARAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM__VALUE = WTC_PARAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Settable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM__SETTABLE = WTC_PARAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>System Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM_FEATURE_COUNT = WTC_PARAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>System Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM_OPERATION_COUNT = WTC_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.WTCTimerImpl <em>WTC Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.WTCTimerImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCTimer()
	 * @generated
	 */
	int WTC_TIMER = 10;

	/**
	 * The number of structural features of the '<em>WTC Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_TIMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>WTC Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.SystemTimerImpl <em>System Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.SystemTimerImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemTimer()
	 * @generated
	 */
	int SYSTEM_TIMER = 5;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER__SYS_ID = WTC_TIMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER__DESCRIPTION = WTC_TIMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER__VALUE = WTC_TIMER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER_FEATURE_COUNT = WTC_TIMER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER_OPERATION_COUNT = WTC_TIMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.SystemVariableImpl <em>System Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.SystemVariableImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemVariable()
	 * @generated
	 */
	int SYSTEM_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VARIABLE__SYS_ID = WTC_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VARIABLE__DESCRIPTION = WTC_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VARIABLE_FEATURE_COUNT = WTC_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VARIABLE_OPERATION_COUNT = WTC_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.SubsystemImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__SYS_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Its WT Cs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ITS_WT_CS = 2;

	/**
	 * The feature id for the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ITS_SUBSYSTEMS = 3;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.wtcImpl <em>wtc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.wtcImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getwtc()
	 * @generated
	 */
	int WTC = 13;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__SYS_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__CYCLE = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__ENABLED = 4;

	/**
	 * The number of structural features of the '<em>wtc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>wtc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit5Impl <em>Ctrl Unit5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit5Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit5()
	 * @generated
	 */
	int CTRL_UNIT5 = 14;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit9Impl <em>Ctrl Unit9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit9Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit9()
	 * @generated
	 */
	int CTRL_UNIT9 = 15;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInput4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__INPUT_IINPUT4 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timer tTimer1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__TIMER_TTIMER1 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__BHV_PARAM_BHV_PARAM2 = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Ctrl Unit9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9_FEATURE_COUNT = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Ctrl Unit9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit10Impl <em>Ctrl Unit10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit10Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit10()
	 * @generated
	 */
	int CTRL_UNIT10 = 16;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pParam3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PPARAM3 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pParam4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PPARAM4 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pParam5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PPARAM5 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pParam6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PPARAM6 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ctrl Unit10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10_FEATURE_COUNT = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Ctrl Unit10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit11Impl <em>Ctrl Unit11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit11Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit11()
	 * @generated
	 */
	int CTRL_UNIT11 = 17;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit13Impl <em>Ctrl Unit13</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit13Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit13()
	 * @generated
	 */
	int CTRL_UNIT13 = 18;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__BHV_PARAM_BHV_PARAM2 = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit15Impl <em>Ctrl Unit15</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit15Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit15()
	 * @generated
	 */
	int CTRL_UNIT15 = 19;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit18Impl <em>Ctrl Unit18</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit18Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit18()
	 * @generated
	 */
	int CTRL_UNIT18 = 20;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInput4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IINPUT4 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iInput5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IINPUT5 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iInput6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IINPUT6 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameter pParam3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PPARAM3 = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parameter pParam4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PPARAM4 = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parameter pParam5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PPARAM5 = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parameter pParam6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PPARAM6 = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parameter pParam7</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PPARAM7 = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Timer tTimer1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__TIMER_TTIMER1 = WTC_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Ctrl Unit18</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18_FEATURE_COUNT = WTC_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Ctrl Unit18</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit27Impl <em>Ctrl Unit27</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit27Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit27()
	 * @generated
	 */
	int CTRL_UNIT27 = 21;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oOutput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__OUTPUT_OOUTPUT2 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit27</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit27</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit29Impl <em>Ctrl Unit29</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit29Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit29()
	 * @generated
	 */
	int CTRL_UNIT29 = 22;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit29</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit29</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit31Impl <em>Ctrl Unit31</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit31Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit31()
	 * @generated
	 */
	int CTRL_UNIT31 = 23;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit31</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit31</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit34Impl <em>Ctrl Unit34</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit34Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit34()
	 * @generated
	 */
	int CTRL_UNIT34 = 24;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oOutput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__OUTPUT_OOUTPUT2 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timer tTimer1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__TIMER_TTIMER1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tTimer2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__TIMER_TTIMER2 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit34</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit34</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit36Impl <em>Ctrl Unit36</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit36Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit36()
	 * @generated
	 */
	int CTRL_UNIT36 = 25;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit36</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit36</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit37Impl <em>Ctrl Unit37</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit37Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit37()
	 * @generated
	 */
	int CTRL_UNIT37 = 26;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tTimer1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__TIMER_TTIMER1 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit37</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit37</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit39Impl <em>Ctrl Unit39</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit39Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit39()
	 * @generated
	 */
	int CTRL_UNIT39 = 27;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timer tTimer1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__TIMER_TTIMER1 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit39</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit39</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit40Impl <em>Ctrl Unit40</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit40Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit40()
	 * @generated
	 */
	int CTRL_UNIT40 = 28;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timer tTimer1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__TIMER_TTIMER1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit40</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit40</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit44Impl <em>Ctrl Unit44</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit44Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit44()
	 * @generated
	 */
	int CTRL_UNIT44 = 29;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit44</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit44</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit46Impl <em>Ctrl Unit46</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit46Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit46()
	 * @generated
	 */
	int CTRL_UNIT46 = 30;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ctrl Unit46</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46_FEATURE_COUNT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ctrl Unit46</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit47Impl <em>Ctrl Unit47</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit47Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit47()
	 * @generated
	 */
	int CTRL_UNIT47 = 31;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit47</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit47</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit49Impl <em>Ctrl Unit49</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit49Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit49()
	 * @generated
	 */
	int CTRL_UNIT49 = 32;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInput4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__INPUT_IINPUT4 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oOutput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__OUTPUT_OOUTPUT2 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter pParam3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PARAMETER_PPARAM3 = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameter pParam4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PARAMETER_PPARAM4 = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Timer tTimer1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__TIMER_TTIMER1 = WTC_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Ctrl Unit49</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49_FEATURE_COUNT = WTC_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Ctrl Unit49</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit50Impl <em>Ctrl Unit50</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit50Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit50()
	 * @generated
	 */
	int CTRL_UNIT50 = 33;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit50</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit50</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit58Impl <em>Ctrl Unit58</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit58Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit58()
	 * @generated
	 */
	int CTRL_UNIT58 = 34;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit58</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit58</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit59Impl <em>Ctrl Unit59</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit59Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit59()
	 * @generated
	 */
	int CTRL_UNIT59 = 35;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit59</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit59</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit65Impl <em>Ctrl Unit65</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit65Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit65()
	 * @generated
	 */
	int CTRL_UNIT65 = 36;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit65</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit65</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit68Impl <em>Ctrl Unit68</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit68Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit68()
	 * @generated
	 */
	int CTRL_UNIT68 = 37;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit68</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit68</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit71Impl <em>Ctrl Unit71</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit71Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit71()
	 * @generated
	 */
	int CTRL_UNIT71 = 38;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInput4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT4 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iInput5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT5 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iInput6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT6 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oOutput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__OUTPUT_OOUTPUT2 = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit71</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit71</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit73Impl <em>Ctrl Unit73</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit73Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit73()
	 * @generated
	 */
	int CTRL_UNIT73 = 39;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit73</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit73</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit78Impl <em>Ctrl Unit78</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit78Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit78()
	 * @generated
	 */
	int CTRL_UNIT78 = 40;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit78</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit78</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit80Impl <em>Ctrl Unit80</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit80Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit80()
	 * @generated
	 */
	int CTRL_UNIT80 = 41;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInput4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IINPUT4 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iInput5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IINPUT5 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit80</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit80</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit92Impl <em>Ctrl Unit92</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit92Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit92()
	 * @generated
	 */
	int CTRL_UNIT92 = 42;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__BHV_PARAM_BHV_PARAM1 = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit92</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit92</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit94Impl <em>Ctrl Unit94</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit94Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit94()
	 * @generated
	 */
	int CTRL_UNIT94 = 43;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit94</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit94</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit102Impl <em>Ctrl Unit102</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit102Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit102()
	 * @generated
	 */
	int CTRL_UNIT102 = 44;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit102</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit102</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit124Impl <em>Ctrl Unit124</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit124Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit124()
	 * @generated
	 */
	int CTRL_UNIT124 = 45;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit124</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit124</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit125Impl <em>Ctrl Unit125</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit125Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit125()
	 * @generated
	 */
	int CTRL_UNIT125 = 46;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit125</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit125</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.CtrlUnit126Impl <em>Ctrl Unit126</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.CtrlUnit126Impl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit126()
	 * @generated
	 */
	int CTRL_UNIT126 = 47;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__ENABLED = WTC__ENABLED;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__OUTPUT_OOUTPUT1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oOutput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__OUTPUT_OOUTPUT2 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit126</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit126</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpec4M.impl.MainSubsystemImpl <em>Main Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpec4M.impl.MainSubsystemImpl
	 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getMainSubsystem()
	 * @generated
	 */
	int MAIN_SUBSYSTEM = 48;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SUBSYSTEM__SYS_ID = SUBSYSTEM__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SUBSYSTEM__DESCRIPTION = SUBSYSTEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its WT Cs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SUBSYSTEM__ITS_WT_CS = SUBSYSTEM__ITS_WT_CS;

	/**
	 * The feature id for the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SUBSYSTEM__ITS_SUBSYSTEMS = SUBSYSTEM__ITS_SUBSYSTEMS;

	/**
	 * The number of structural features of the '<em>Main Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SUBSYSTEM_FEATURE_COUNT = SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_SUBSYSTEM_OPERATION_COUNT = SUBSYSTEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link WTSpec4M.WT <em>WT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WT</em>'.
	 * @see WTSpec4M.WT
	 * @generated
	 */
	EClass getWT();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.WT#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.WT#getSysId()
	 * @see #getWT()
	 * @generated
	 */
	EAttribute getWT_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.WT#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see WTSpec4M.WT#getModel()
	 * @see #getWT()
	 * @generated
	 */
	EAttribute getWT_Model();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.WT#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see WTSpec4M.WT#getVersion()
	 * @see #getWT()
	 * @generated
	 */
	EAttribute getWT_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getItsSubsystems <em>Its Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Subsystems</em>'.
	 * @see WTSpec4M.WT#getItsSubsystems()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsSubsystems();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getItsInputs <em>Its Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Inputs</em>'.
	 * @see WTSpec4M.WT#getItsInputs()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getItsOutputs <em>Its Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Outputs</em>'.
	 * @see WTSpec4M.WT#getItsOutputs()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getItsParams <em>Its Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Params</em>'.
	 * @see WTSpec4M.WT#getItsParams()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsParams();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getItsTimers <em>Its Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Timers</em>'.
	 * @see WTSpec4M.WT#getItsTimers()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsTimers();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getItsFaults <em>Its Faults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Faults</em>'.
	 * @see WTSpec4M.WT#getItsFaults()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsFaults();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getItsVariables <em>Its Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Variables</em>'.
	 * @see WTSpec4M.WT#getItsVariables()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsVariables();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.SystemInput <em>System Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Input</em>'.
	 * @see WTSpec4M.SystemInput
	 * @generated
	 */
	EClass getSystemInput();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemInput#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.SystemInput#getSysId()
	 * @see #getSystemInput()
	 * @generated
	 */
	EAttribute getSystemInput_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemInput#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpec4M.SystemInput#getDescription()
	 * @see #getSystemInput()
	 * @generated
	 */
	EAttribute getSystemInput_Description();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.SystemOutput <em>System Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Output</em>'.
	 * @see WTSpec4M.SystemOutput
	 * @generated
	 */
	EClass getSystemOutput();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemOutput#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.SystemOutput#getSysId()
	 * @see #getSystemOutput()
	 * @generated
	 */
	EAttribute getSystemOutput_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemOutput#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpec4M.SystemOutput#getDescription()
	 * @see #getSystemOutput()
	 * @generated
	 */
	EAttribute getSystemOutput_Description();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.SystemFault <em>System Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Fault</em>'.
	 * @see WTSpec4M.SystemFault
	 * @generated
	 */
	EClass getSystemFault();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemFault#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.SystemFault#getSysId()
	 * @see #getSystemFault()
	 * @generated
	 */
	EAttribute getSystemFault_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemFault#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpec4M.SystemFault#getDescription()
	 * @see #getSystemFault()
	 * @generated
	 */
	EAttribute getSystemFault_Description();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemFault#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WTSpec4M.SystemFault#getValue()
	 * @see #getSystemFault()
	 * @generated
	 */
	EAttribute getSystemFault_Value();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.SystemParam <em>System Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Param</em>'.
	 * @see WTSpec4M.SystemParam
	 * @generated
	 */
	EClass getSystemParam();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemParam#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.SystemParam#getSysId()
	 * @see #getSystemParam()
	 * @generated
	 */
	EAttribute getSystemParam_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemParam#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpec4M.SystemParam#getDescription()
	 * @see #getSystemParam()
	 * @generated
	 */
	EAttribute getSystemParam_Description();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WTSpec4M.SystemParam#getValue()
	 * @see #getSystemParam()
	 * @generated
	 */
	EAttribute getSystemParam_Value();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemParam#isSettable <em>Settable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settable</em>'.
	 * @see WTSpec4M.SystemParam#isSettable()
	 * @see #getSystemParam()
	 * @generated
	 */
	EAttribute getSystemParam_Settable();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.SystemTimer <em>System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Timer</em>'.
	 * @see WTSpec4M.SystemTimer
	 * @generated
	 */
	EClass getSystemTimer();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemTimer#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.SystemTimer#getSysId()
	 * @see #getSystemTimer()
	 * @generated
	 */
	EAttribute getSystemTimer_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemTimer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpec4M.SystemTimer#getDescription()
	 * @see #getSystemTimer()
	 * @generated
	 */
	EAttribute getSystemTimer_Description();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemTimer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WTSpec4M.SystemTimer#getValue()
	 * @see #getSystemTimer()
	 * @generated
	 */
	EAttribute getSystemTimer_Value();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.SystemVariable <em>System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Variable</em>'.
	 * @see WTSpec4M.SystemVariable
	 * @generated
	 */
	EClass getSystemVariable();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemVariable#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.SystemVariable#getSysId()
	 * @see #getSystemVariable()
	 * @generated
	 */
	EAttribute getSystemVariable_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.SystemVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpec4M.SystemVariable#getDescription()
	 * @see #getSystemVariable()
	 * @generated
	 */
	EAttribute getSystemVariable_Description();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.WTCInput <em>WTC Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Input</em>'.
	 * @see WTSpec4M.WTCInput
	 * @generated
	 */
	EClass getWTCInput();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.WTCOutput <em>WTC Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Output</em>'.
	 * @see WTSpec4M.WTCOutput
	 * @generated
	 */
	EClass getWTCOutput();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.WTCParam <em>WTC Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Param</em>'.
	 * @see WTSpec4M.WTCParam
	 * @generated
	 */
	EClass getWTCParam();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.WTCTimer <em>WTC Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Timer</em>'.
	 * @see WTSpec4M.WTCTimer
	 * @generated
	 */
	EClass getWTCTimer();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.WTCFault <em>WTC Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Fault</em>'.
	 * @see WTSpec4M.WTCFault
	 * @generated
	 */
	EClass getWTCFault();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see WTSpec4M.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.Subsystem#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.Subsystem#getSysId()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.Subsystem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpec4M.Subsystem#getDescription()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.Subsystem#getItsWTCs <em>Its WT Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its WT Cs</em>'.
	 * @see WTSpec4M.Subsystem#getItsWTCs()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_ItsWTCs();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpec4M.Subsystem#getItsSubsystems <em>Its Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Subsystems</em>'.
	 * @see WTSpec4M.Subsystem#getItsSubsystems()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_ItsSubsystems();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.wtc <em>wtc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>wtc</em>'.
	 * @see WTSpec4M.wtc
	 * @generated
	 */
	EClass getwtc();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.wtc#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpec4M.wtc#getSysId()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.wtc#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpec4M.wtc#getDescription()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_Description();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.wtc#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle</em>'.
	 * @see WTSpec4M.wtc#getCycle()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_Cycle();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.wtc#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see WTSpec4M.wtc#getPriority()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_Priority();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.wtc#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see WTSpec4M.wtc#isEnabled()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_Enabled();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit5 <em>Ctrl Unit5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit5</em>'.
	 * @see WTSpec4M.CtrlUnit5
	 * @generated
	 */
	EClass getCtrlUnit5();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit5#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit5#getInput__iInput1()
	 * @see #getCtrlUnit5()
	 * @generated
	 */
	EReference getCtrlUnit5_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit5#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit5#getInput__iInput2()
	 * @see #getCtrlUnit5()
	 * @generated
	 */
	EReference getCtrlUnit5_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit5#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit5#getOutput__oOutput1()
	 * @see #getCtrlUnit5()
	 * @generated
	 */
	EReference getCtrlUnit5_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit9 <em>Ctrl Unit9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit9</em>'.
	 * @see WTSpec4M.CtrlUnit9
	 * @generated
	 */
	EClass getCtrlUnit9();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit9#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit9#getInput__iInput1()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit9#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit9#getInput__iInput2()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit9#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpec4M.CtrlUnit9#getInput__iInput3()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit9#getInput__iInput4 <em>Input iInput4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput4</em>'.
	 * @see WTSpec4M.CtrlUnit9#getInput__iInput4()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Input__iInput4();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit9#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit9#getOutput__oOutput1()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit9#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit9#getParameter__pParam1()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit9#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit9#getParameter__pParam2()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Parameter__pParam2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit9#getTimer__tTimer1 <em>Timer tTimer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer1</em>'.
	 * @see WTSpec4M.CtrlUnit9#getTimer__tTimer1()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Timer__tTimer1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit9#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit9#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EAttribute getCtrlUnit9_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit9#getBhvParam__BhvParam2 <em>Bhv Param Bhv Param2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param2</em>'.
	 * @see WTSpec4M.CtrlUnit9#getBhvParam__BhvParam2()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EAttribute getCtrlUnit9_BhvParam__BhvParam2();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit10 <em>Ctrl Unit10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit10</em>'.
	 * @see WTSpec4M.CtrlUnit10
	 * @generated
	 */
	EClass getCtrlUnit10();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit10#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit10#getInput__iInput1()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit10#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit10#getOutput__oOutput1()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit10#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit10#getParameter__pParam1()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit10#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit10#getParameter__pParam2()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pParam2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit10#getParameter__pParam3 <em>Parameter pParam3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam3</em>'.
	 * @see WTSpec4M.CtrlUnit10#getParameter__pParam3()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pParam3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit10#getParameter__pParam4 <em>Parameter pParam4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam4</em>'.
	 * @see WTSpec4M.CtrlUnit10#getParameter__pParam4()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pParam4();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit10#getParameter__pParam5 <em>Parameter pParam5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam5</em>'.
	 * @see WTSpec4M.CtrlUnit10#getParameter__pParam5()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pParam5();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit10#getParameter__pParam6 <em>Parameter pParam6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam6</em>'.
	 * @see WTSpec4M.CtrlUnit10#getParameter__pParam6()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pParam6();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit10#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit10#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EAttribute getCtrlUnit10_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit11 <em>Ctrl Unit11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit11</em>'.
	 * @see WTSpec4M.CtrlUnit11
	 * @generated
	 */
	EClass getCtrlUnit11();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit11#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit11#getInput__iInput1()
	 * @see #getCtrlUnit11()
	 * @generated
	 */
	EReference getCtrlUnit11_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit11#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit11#getInput__iInput2()
	 * @see #getCtrlUnit11()
	 * @generated
	 */
	EReference getCtrlUnit11_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit11#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit11#getOutput__oOutput1()
	 * @see #getCtrlUnit11()
	 * @generated
	 */
	EReference getCtrlUnit11_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit13 <em>Ctrl Unit13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit13</em>'.
	 * @see WTSpec4M.CtrlUnit13
	 * @generated
	 */
	EClass getCtrlUnit13();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit13#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit13#getInput__iInput1()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit13#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit13#getInput__iInput2()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit13#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpec4M.CtrlUnit13#getInput__iInput3()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit13#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit13#getOutput__oOutput1()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit13#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit13#getParameter__pParam1()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit13#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit13#getParameter__pParam2()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Parameter__pParam2();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit13#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit13#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EAttribute getCtrlUnit13_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit13#getBhvParam__BhvParam2 <em>Bhv Param Bhv Param2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param2</em>'.
	 * @see WTSpec4M.CtrlUnit13#getBhvParam__BhvParam2()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EAttribute getCtrlUnit13_BhvParam__BhvParam2();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit15 <em>Ctrl Unit15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit15</em>'.
	 * @see WTSpec4M.CtrlUnit15
	 * @generated
	 */
	EClass getCtrlUnit15();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit15#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit15#getInput__iInput1()
	 * @see #getCtrlUnit15()
	 * @generated
	 */
	EReference getCtrlUnit15_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit15#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit15#getOutput__oOutput1()
	 * @see #getCtrlUnit15()
	 * @generated
	 */
	EReference getCtrlUnit15_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit15#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit15#getParameter__pParam1()
	 * @see #getCtrlUnit15()
	 * @generated
	 */
	EReference getCtrlUnit15_Parameter__pParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit18 <em>Ctrl Unit18</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit18</em>'.
	 * @see WTSpec4M.CtrlUnit18
	 * @generated
	 */
	EClass getCtrlUnit18();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit18#getInput__iInput1()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit18#getInput__iInput2()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpec4M.CtrlUnit18#getInput__iInput3()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getInput__iInput4 <em>Input iInput4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput4</em>'.
	 * @see WTSpec4M.CtrlUnit18#getInput__iInput4()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iInput4();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getInput__iInput5 <em>Input iInput5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput5</em>'.
	 * @see WTSpec4M.CtrlUnit18#getInput__iInput5()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iInput5();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getInput__iInput6 <em>Input iInput6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput6</em>'.
	 * @see WTSpec4M.CtrlUnit18#getInput__iInput6()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iInput6();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit18#getOutput__oOutput1()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit18#getParameter__pParam1()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit18#getParameter__pParam2()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pParam2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getParameter__pParam3 <em>Parameter pParam3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam3</em>'.
	 * @see WTSpec4M.CtrlUnit18#getParameter__pParam3()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pParam3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getParameter__pParam4 <em>Parameter pParam4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam4</em>'.
	 * @see WTSpec4M.CtrlUnit18#getParameter__pParam4()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pParam4();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getParameter__pParam5 <em>Parameter pParam5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam5</em>'.
	 * @see WTSpec4M.CtrlUnit18#getParameter__pParam5()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pParam5();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getParameter__pParam6 <em>Parameter pParam6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam6</em>'.
	 * @see WTSpec4M.CtrlUnit18#getParameter__pParam6()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pParam6();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getParameter__pParam7 <em>Parameter pParam7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam7</em>'.
	 * @see WTSpec4M.CtrlUnit18#getParameter__pParam7()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pParam7();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit18#getTimer__tTimer1 <em>Timer tTimer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer1</em>'.
	 * @see WTSpec4M.CtrlUnit18#getTimer__tTimer1()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Timer__tTimer1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit27 <em>Ctrl Unit27</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit27</em>'.
	 * @see WTSpec4M.CtrlUnit27
	 * @generated
	 */
	EClass getCtrlUnit27();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit27#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit27#getInput__iInput1()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit27#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit27#getInput__iInput2()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit27#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit27#getOutput__oOutput1()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit27#getOutput__oOutput2 <em>Output oOutput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput2</em>'.
	 * @see WTSpec4M.CtrlUnit27#getOutput__oOutput2()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Output__oOutput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit27#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit27#getParameter__pParam1()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Parameter__pParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit29 <em>Ctrl Unit29</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit29</em>'.
	 * @see WTSpec4M.CtrlUnit29
	 * @generated
	 */
	EClass getCtrlUnit29();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit29#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit29#getInput__iInput1()
	 * @see #getCtrlUnit29()
	 * @generated
	 */
	EReference getCtrlUnit29_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit29#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit29#getInput__iInput2()
	 * @see #getCtrlUnit29()
	 * @generated
	 */
	EReference getCtrlUnit29_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit29#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit29#getFault__fFault1()
	 * @see #getCtrlUnit29()
	 * @generated
	 */
	EReference getCtrlUnit29_Fault__fFault1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit29#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit29#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit29()
	 * @generated
	 */
	EAttribute getCtrlUnit29_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit31 <em>Ctrl Unit31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit31</em>'.
	 * @see WTSpec4M.CtrlUnit31
	 * @generated
	 */
	EClass getCtrlUnit31();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit31#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit31#getInput__iInput1()
	 * @see #getCtrlUnit31()
	 * @generated
	 */
	EReference getCtrlUnit31_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit31#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit31#getOutput__oOutput1()
	 * @see #getCtrlUnit31()
	 * @generated
	 */
	EReference getCtrlUnit31_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit31#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit31#getParameter__pParam1()
	 * @see #getCtrlUnit31()
	 * @generated
	 */
	EReference getCtrlUnit31_Parameter__pParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit34 <em>Ctrl Unit34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit34</em>'.
	 * @see WTSpec4M.CtrlUnit34
	 * @generated
	 */
	EClass getCtrlUnit34();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit34#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit34#getInput__iInput1()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit34#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit34#getInput__iInput2()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit34#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit34#getOutput__oOutput1()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit34#getOutput__oOutput2 <em>Output oOutput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput2</em>'.
	 * @see WTSpec4M.CtrlUnit34#getOutput__oOutput2()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Output__oOutput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit34#getTimer__tTimer1 <em>Timer tTimer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer1</em>'.
	 * @see WTSpec4M.CtrlUnit34#getTimer__tTimer1()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Timer__tTimer1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit34#getTimer__tTimer2 <em>Timer tTimer2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer2</em>'.
	 * @see WTSpec4M.CtrlUnit34#getTimer__tTimer2()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Timer__tTimer2();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit34#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit34#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EAttribute getCtrlUnit34_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit36 <em>Ctrl Unit36</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit36</em>'.
	 * @see WTSpec4M.CtrlUnit36
	 * @generated
	 */
	EClass getCtrlUnit36();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit36#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit36#getInput__iInput1()
	 * @see #getCtrlUnit36()
	 * @generated
	 */
	EReference getCtrlUnit36_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit36#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit36#getOutput__oOutput1()
	 * @see #getCtrlUnit36()
	 * @generated
	 */
	EReference getCtrlUnit36_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit36#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit36#getParameter__pParam1()
	 * @see #getCtrlUnit36()
	 * @generated
	 */
	EReference getCtrlUnit36_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit36#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit36#getParameter__pParam2()
	 * @see #getCtrlUnit36()
	 * @generated
	 */
	EReference getCtrlUnit36_Parameter__pParam2();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit37 <em>Ctrl Unit37</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit37</em>'.
	 * @see WTSpec4M.CtrlUnit37
	 * @generated
	 */
	EClass getCtrlUnit37();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit37#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit37#getInput__iInput1()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit37#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit37#getInput__iInput2()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit37#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpec4M.CtrlUnit37#getInput__iInput3()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit37#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit37#getOutput__oOutput1()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit37#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit37#getFault__fFault1()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Fault__fFault1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit37#getTimer__tTimer1 <em>Timer tTimer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer1</em>'.
	 * @see WTSpec4M.CtrlUnit37#getTimer__tTimer1()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Timer__tTimer1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit37#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit37#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EAttribute getCtrlUnit37_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit39 <em>Ctrl Unit39</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit39</em>'.
	 * @see WTSpec4M.CtrlUnit39
	 * @generated
	 */
	EClass getCtrlUnit39();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit39#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit39#getInput__iInput1()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EReference getCtrlUnit39_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit39#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit39#getInput__iInput2()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EReference getCtrlUnit39_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit39#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit39#getFault__fFault1()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EReference getCtrlUnit39_Fault__fFault1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit39#getTimer__tTimer1 <em>Timer tTimer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer1</em>'.
	 * @see WTSpec4M.CtrlUnit39#getTimer__tTimer1()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EReference getCtrlUnit39_Timer__tTimer1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit39#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit39#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EAttribute getCtrlUnit39_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit40 <em>Ctrl Unit40</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit40</em>'.
	 * @see WTSpec4M.CtrlUnit40
	 * @generated
	 */
	EClass getCtrlUnit40();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit40#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit40#getInput__iInput1()
	 * @see #getCtrlUnit40()
	 * @generated
	 */
	EReference getCtrlUnit40_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit40#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit40#getOutput__oOutput1()
	 * @see #getCtrlUnit40()
	 * @generated
	 */
	EReference getCtrlUnit40_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit40#getTimer__tTimer1 <em>Timer tTimer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer1</em>'.
	 * @see WTSpec4M.CtrlUnit40#getTimer__tTimer1()
	 * @see #getCtrlUnit40()
	 * @generated
	 */
	EReference getCtrlUnit40_Timer__tTimer1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit44 <em>Ctrl Unit44</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit44</em>'.
	 * @see WTSpec4M.CtrlUnit44
	 * @generated
	 */
	EClass getCtrlUnit44();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit44#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit44#getInput__iInput1()
	 * @see #getCtrlUnit44()
	 * @generated
	 */
	EReference getCtrlUnit44_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit44#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit44#getOutput__oOutput1()
	 * @see #getCtrlUnit44()
	 * @generated
	 */
	EReference getCtrlUnit44_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit46 <em>Ctrl Unit46</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit46</em>'.
	 * @see WTSpec4M.CtrlUnit46
	 * @generated
	 */
	EClass getCtrlUnit46();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit46#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit46#getOutput__oOutput1()
	 * @see #getCtrlUnit46()
	 * @generated
	 */
	EReference getCtrlUnit46_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit47 <em>Ctrl Unit47</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit47</em>'.
	 * @see WTSpec4M.CtrlUnit47
	 * @generated
	 */
	EClass getCtrlUnit47();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit47#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit47#getInput__iInput1()
	 * @see #getCtrlUnit47()
	 * @generated
	 */
	EReference getCtrlUnit47_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit47#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit47#getFault__fFault1()
	 * @see #getCtrlUnit47()
	 * @generated
	 */
	EReference getCtrlUnit47_Fault__fFault1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit49 <em>Ctrl Unit49</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit49</em>'.
	 * @see WTSpec4M.CtrlUnit49
	 * @generated
	 */
	EClass getCtrlUnit49();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit49#getInput__iInput1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit49#getInput__iInput2()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpec4M.CtrlUnit49#getInput__iInput3()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getInput__iInput4 <em>Input iInput4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput4</em>'.
	 * @see WTSpec4M.CtrlUnit49#getInput__iInput4()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Input__iInput4();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit49#getOutput__oOutput1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getOutput__oOutput2 <em>Output oOutput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput2</em>'.
	 * @see WTSpec4M.CtrlUnit49#getOutput__oOutput2()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Output__oOutput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit49#getParameter__pParam1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit49#getParameter__pParam2()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Parameter__pParam2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getParameter__pParam3 <em>Parameter pParam3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam3</em>'.
	 * @see WTSpec4M.CtrlUnit49#getParameter__pParam3()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Parameter__pParam3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getParameter__pParam4 <em>Parameter pParam4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam4</em>'.
	 * @see WTSpec4M.CtrlUnit49#getParameter__pParam4()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Parameter__pParam4();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit49#getFault__fFault1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Fault__fFault1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit49#getTimer__tTimer1 <em>Timer tTimer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer1</em>'.
	 * @see WTSpec4M.CtrlUnit49#getTimer__tTimer1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Timer__tTimer1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit50 <em>Ctrl Unit50</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit50</em>'.
	 * @see WTSpec4M.CtrlUnit50
	 * @generated
	 */
	EClass getCtrlUnit50();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit50#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit50#getOutput__oOutput1()
	 * @see #getCtrlUnit50()
	 * @generated
	 */
	EReference getCtrlUnit50_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit50#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit50#getFault__fFault1()
	 * @see #getCtrlUnit50()
	 * @generated
	 */
	EReference getCtrlUnit50_Fault__fFault1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit58 <em>Ctrl Unit58</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit58</em>'.
	 * @see WTSpec4M.CtrlUnit58
	 * @generated
	 */
	EClass getCtrlUnit58();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit58#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit58#getInput__iInput1()
	 * @see #getCtrlUnit58()
	 * @generated
	 */
	EReference getCtrlUnit58_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit58#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit58#getOutput__oOutput1()
	 * @see #getCtrlUnit58()
	 * @generated
	 */
	EReference getCtrlUnit58_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit58#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit58#getParameter__pParam1()
	 * @see #getCtrlUnit58()
	 * @generated
	 */
	EReference getCtrlUnit58_Parameter__pParam1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit58#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit58#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit58()
	 * @generated
	 */
	EAttribute getCtrlUnit58_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit59 <em>Ctrl Unit59</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit59</em>'.
	 * @see WTSpec4M.CtrlUnit59
	 * @generated
	 */
	EClass getCtrlUnit59();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit59#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit59#getInput__iInput1()
	 * @see #getCtrlUnit59()
	 * @generated
	 */
	EReference getCtrlUnit59_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit59#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit59#getOutput__oOutput1()
	 * @see #getCtrlUnit59()
	 * @generated
	 */
	EReference getCtrlUnit59_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit65 <em>Ctrl Unit65</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit65</em>'.
	 * @see WTSpec4M.CtrlUnit65
	 * @generated
	 */
	EClass getCtrlUnit65();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit65#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit65#getOutput__oOutput1()
	 * @see #getCtrlUnit65()
	 * @generated
	 */
	EReference getCtrlUnit65_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit65#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit65#getFault__fFault1()
	 * @see #getCtrlUnit65()
	 * @generated
	 */
	EReference getCtrlUnit65_Fault__fFault1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit68 <em>Ctrl Unit68</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit68</em>'.
	 * @see WTSpec4M.CtrlUnit68
	 * @generated
	 */
	EClass getCtrlUnit68();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit68#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit68#getInput__iInput1()
	 * @see #getCtrlUnit68()
	 * @generated
	 */
	EReference getCtrlUnit68_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit68#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit68#getInput__iInput2()
	 * @see #getCtrlUnit68()
	 * @generated
	 */
	EReference getCtrlUnit68_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit68#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit68#getOutput__oOutput1()
	 * @see #getCtrlUnit68()
	 * @generated
	 */
	EReference getCtrlUnit68_Output__oOutput1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit68#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit68#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit68()
	 * @generated
	 */
	EAttribute getCtrlUnit68_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit71 <em>Ctrl Unit71</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit71</em>'.
	 * @see WTSpec4M.CtrlUnit71
	 * @generated
	 */
	EClass getCtrlUnit71();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit71#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit71#getInput__iInput1()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit71#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit71#getInput__iInput2()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit71#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpec4M.CtrlUnit71#getInput__iInput3()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit71#getInput__iInput4 <em>Input iInput4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput4</em>'.
	 * @see WTSpec4M.CtrlUnit71#getInput__iInput4()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput4();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit71#getInput__iInput5 <em>Input iInput5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput5</em>'.
	 * @see WTSpec4M.CtrlUnit71#getInput__iInput5()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput5();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit71#getInput__iInput6 <em>Input iInput6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput6</em>'.
	 * @see WTSpec4M.CtrlUnit71#getInput__iInput6()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput6();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit71#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit71#getOutput__oOutput1()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit71#getOutput__oOutput2 <em>Output oOutput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput2</em>'.
	 * @see WTSpec4M.CtrlUnit71#getOutput__oOutput2()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Output__oOutput2();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit73 <em>Ctrl Unit73</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit73</em>'.
	 * @see WTSpec4M.CtrlUnit73
	 * @generated
	 */
	EClass getCtrlUnit73();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit73#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit73#getInput__iInput1()
	 * @see #getCtrlUnit73()
	 * @generated
	 */
	EReference getCtrlUnit73_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit73#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit73#getOutput__oOutput1()
	 * @see #getCtrlUnit73()
	 * @generated
	 */
	EReference getCtrlUnit73_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit78 <em>Ctrl Unit78</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit78</em>'.
	 * @see WTSpec4M.CtrlUnit78
	 * @generated
	 */
	EClass getCtrlUnit78();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit78#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit78#getInput__iInput1()
	 * @see #getCtrlUnit78()
	 * @generated
	 */
	EReference getCtrlUnit78_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit78#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit78#getInput__iInput2()
	 * @see #getCtrlUnit78()
	 * @generated
	 */
	EReference getCtrlUnit78_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit78#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit78#getOutput__oOutput1()
	 * @see #getCtrlUnit78()
	 * @generated
	 */
	EReference getCtrlUnit78_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit80 <em>Ctrl Unit80</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit80</em>'.
	 * @see WTSpec4M.CtrlUnit80
	 * @generated
	 */
	EClass getCtrlUnit80();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit80#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit80#getInput__iInput1()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit80#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit80#getInput__iInput2()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit80#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpec4M.CtrlUnit80#getInput__iInput3()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit80#getInput__iInput4 <em>Input iInput4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput4</em>'.
	 * @see WTSpec4M.CtrlUnit80#getInput__iInput4()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iInput4();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit80#getInput__iInput5 <em>Input iInput5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput5</em>'.
	 * @see WTSpec4M.CtrlUnit80#getInput__iInput5()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iInput5();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit80#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit80#getOutput__oOutput1()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit92 <em>Ctrl Unit92</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit92</em>'.
	 * @see WTSpec4M.CtrlUnit92
	 * @generated
	 */
	EClass getCtrlUnit92();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit92#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit92#getInput__iInput1()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit92#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit92#getInput__iInput2()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit92#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit92#getParameter__pParam1()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit92#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit92#getParameter__pParam2()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Parameter__pParam2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit92#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit92#getFault__fFault1()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Fault__fFault1();

	/**
	 * Returns the meta object for the attribute '{@link WTSpec4M.CtrlUnit92#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param Bhv Param1</em>'.
	 * @see WTSpec4M.CtrlUnit92#getBhvParam__BhvParam1()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EAttribute getCtrlUnit92_BhvParam__BhvParam1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit94 <em>Ctrl Unit94</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit94</em>'.
	 * @see WTSpec4M.CtrlUnit94
	 * @generated
	 */
	EClass getCtrlUnit94();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit94#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit94#getInput__iInput1()
	 * @see #getCtrlUnit94()
	 * @generated
	 */
	EReference getCtrlUnit94_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit94#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit94#getOutput__oOutput1()
	 * @see #getCtrlUnit94()
	 * @generated
	 */
	EReference getCtrlUnit94_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit102 <em>Ctrl Unit102</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit102</em>'.
	 * @see WTSpec4M.CtrlUnit102
	 * @generated
	 */
	EClass getCtrlUnit102();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit102#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit102#getInput__iInput1()
	 * @see #getCtrlUnit102()
	 * @generated
	 */
	EReference getCtrlUnit102_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit102#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit102#getInput__iInput2()
	 * @see #getCtrlUnit102()
	 * @generated
	 */
	EReference getCtrlUnit102_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit102#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit102#getOutput__oOutput1()
	 * @see #getCtrlUnit102()
	 * @generated
	 */
	EReference getCtrlUnit102_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit102#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpec4M.CtrlUnit102#getFault__fFault1()
	 * @see #getCtrlUnit102()
	 * @generated
	 */
	EReference getCtrlUnit102_Fault__fFault1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit124 <em>Ctrl Unit124</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit124</em>'.
	 * @see WTSpec4M.CtrlUnit124
	 * @generated
	 */
	EClass getCtrlUnit124();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit124#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit124#getInput__iInput1()
	 * @see #getCtrlUnit124()
	 * @generated
	 */
	EReference getCtrlUnit124_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit124#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit124#getInput__iInput2()
	 * @see #getCtrlUnit124()
	 * @generated
	 */
	EReference getCtrlUnit124_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit124#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit124#getOutput__oOutput1()
	 * @see #getCtrlUnit124()
	 * @generated
	 */
	EReference getCtrlUnit124_Output__oOutput1();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit125 <em>Ctrl Unit125</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit125</em>'.
	 * @see WTSpec4M.CtrlUnit125
	 * @generated
	 */
	EClass getCtrlUnit125();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit125#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit125#getInput__iInput1()
	 * @see #getCtrlUnit125()
	 * @generated
	 */
	EReference getCtrlUnit125_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit125#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit125#getOutput__oOutput1()
	 * @see #getCtrlUnit125()
	 * @generated
	 */
	EReference getCtrlUnit125_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit125#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit125#getParameter__pParam1()
	 * @see #getCtrlUnit125()
	 * @generated
	 */
	EReference getCtrlUnit125_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit125#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit125#getParameter__pParam2()
	 * @see #getCtrlUnit125()
	 * @generated
	 */
	EReference getCtrlUnit125_Parameter__pParam2();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.CtrlUnit126 <em>Ctrl Unit126</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit126</em>'.
	 * @see WTSpec4M.CtrlUnit126
	 * @generated
	 */
	EClass getCtrlUnit126();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit126#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpec4M.CtrlUnit126#getInput__iInput1()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit126#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpec4M.CtrlUnit126#getInput__iInput2()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit126#getOutput__oOutput1 <em>Output oOutput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput1</em>'.
	 * @see WTSpec4M.CtrlUnit126#getOutput__oOutput1()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Output__oOutput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit126#getOutput__oOutput2 <em>Output oOutput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput2</em>'.
	 * @see WTSpec4M.CtrlUnit126#getOutput__oOutput2()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Output__oOutput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit126#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpec4M.CtrlUnit126#getParameter__pParam1()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpec4M.CtrlUnit126#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpec4M.CtrlUnit126#getParameter__pParam2()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Parameter__pParam2();

	/**
	 * Returns the meta object for class '{@link WTSpec4M.MainSubsystem <em>Main Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Subsystem</em>'.
	 * @see WTSpec4M.MainSubsystem
	 * @generated
	 */
	EClass getMainSubsystem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WTSpec4MFactory getWTSpec4MFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.WTImpl <em>WT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.WTImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWT()
		 * @generated
		 */
		EClass WT = eINSTANCE.getWT();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WT__SYS_ID = eINSTANCE.getWT_SysId();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WT__MODEL = eINSTANCE.getWT_Model();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WT__VERSION = eINSTANCE.getWT_Version();

		/**
		 * The meta object literal for the '<em><b>Its Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WT__ITS_SUBSYSTEMS = eINSTANCE.getWT_ItsSubsystems();

		/**
		 * The meta object literal for the '<em><b>Its Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WT__ITS_INPUTS = eINSTANCE.getWT_ItsInputs();

		/**
		 * The meta object literal for the '<em><b>Its Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WT__ITS_OUTPUTS = eINSTANCE.getWT_ItsOutputs();

		/**
		 * The meta object literal for the '<em><b>Its Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WT__ITS_PARAMS = eINSTANCE.getWT_ItsParams();

		/**
		 * The meta object literal for the '<em><b>Its Timers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WT__ITS_TIMERS = eINSTANCE.getWT_ItsTimers();

		/**
		 * The meta object literal for the '<em><b>Its Faults</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WT__ITS_FAULTS = eINSTANCE.getWT_ItsFaults();

		/**
		 * The meta object literal for the '<em><b>Its Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WT__ITS_VARIABLES = eINSTANCE.getWT_ItsVariables();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.SystemInputImpl <em>System Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.SystemInputImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemInput()
		 * @generated
		 */
		EClass SYSTEM_INPUT = eINSTANCE.getSystemInput();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INPUT__SYS_ID = eINSTANCE.getSystemInput_SysId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INPUT__DESCRIPTION = eINSTANCE.getSystemInput_Description();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.SystemOutputImpl <em>System Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.SystemOutputImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemOutput()
		 * @generated
		 */
		EClass SYSTEM_OUTPUT = eINSTANCE.getSystemOutput();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OUTPUT__SYS_ID = eINSTANCE.getSystemOutput_SysId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OUTPUT__DESCRIPTION = eINSTANCE.getSystemOutput_Description();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.SystemFaultImpl <em>System Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.SystemFaultImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemFault()
		 * @generated
		 */
		EClass SYSTEM_FAULT = eINSTANCE.getSystemFault();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_FAULT__SYS_ID = eINSTANCE.getSystemFault_SysId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_FAULT__DESCRIPTION = eINSTANCE.getSystemFault_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_FAULT__VALUE = eINSTANCE.getSystemFault_Value();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.SystemParamImpl <em>System Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.SystemParamImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemParam()
		 * @generated
		 */
		EClass SYSTEM_PARAM = eINSTANCE.getSystemParam();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PARAM__SYS_ID = eINSTANCE.getSystemParam_SysId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PARAM__DESCRIPTION = eINSTANCE.getSystemParam_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PARAM__VALUE = eINSTANCE.getSystemParam_Value();

		/**
		 * The meta object literal for the '<em><b>Settable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PARAM__SETTABLE = eINSTANCE.getSystemParam_Settable();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.SystemTimerImpl <em>System Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.SystemTimerImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemTimer()
		 * @generated
		 */
		EClass SYSTEM_TIMER = eINSTANCE.getSystemTimer();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TIMER__SYS_ID = eINSTANCE.getSystemTimer_SysId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TIMER__DESCRIPTION = eINSTANCE.getSystemTimer_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TIMER__VALUE = eINSTANCE.getSystemTimer_Value();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.SystemVariableImpl <em>System Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.SystemVariableImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemVariable()
		 * @generated
		 */
		EClass SYSTEM_VARIABLE = eINSTANCE.getSystemVariable();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_VARIABLE__SYS_ID = eINSTANCE.getSystemVariable_SysId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_VARIABLE__DESCRIPTION = eINSTANCE.getSystemVariable_Description();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.WTCInputImpl <em>WTC Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.WTCInputImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCInput()
		 * @generated
		 */
		EClass WTC_INPUT = eINSTANCE.getWTCInput();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.WTCOutputImpl <em>WTC Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.WTCOutputImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCOutput()
		 * @generated
		 */
		EClass WTC_OUTPUT = eINSTANCE.getWTCOutput();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.WTCParamImpl <em>WTC Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.WTCParamImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCParam()
		 * @generated
		 */
		EClass WTC_PARAM = eINSTANCE.getWTCParam();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.WTCTimerImpl <em>WTC Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.WTCTimerImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCTimer()
		 * @generated
		 */
		EClass WTC_TIMER = eINSTANCE.getWTCTimer();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.WTCFaultImpl <em>WTC Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.WTCFaultImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCFault()
		 * @generated
		 */
		EClass WTC_FAULT = eINSTANCE.getWTCFault();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.SubsystemImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSYSTEM__SYS_ID = eINSTANCE.getSubsystem_SysId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSYSTEM__DESCRIPTION = eINSTANCE.getSubsystem_Description();

		/**
		 * The meta object literal for the '<em><b>Its WT Cs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__ITS_WT_CS = eINSTANCE.getSubsystem_ItsWTCs();

		/**
		 * The meta object literal for the '<em><b>Its Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSYSTEM__ITS_SUBSYSTEMS = eINSTANCE.getSubsystem_ItsSubsystems();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.wtcImpl <em>wtc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.wtcImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getwtc()
		 * @generated
		 */
		EClass WTC = eINSTANCE.getwtc();

		/**
		 * The meta object literal for the '<em><b>Sys Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WTC__SYS_ID = eINSTANCE.getwtc_SysId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WTC__DESCRIPTION = eINSTANCE.getwtc_Description();

		/**
		 * The meta object literal for the '<em><b>Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WTC__CYCLE = eINSTANCE.getwtc_Cycle();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WTC__PRIORITY = eINSTANCE.getwtc_Priority();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WTC__ENABLED = eINSTANCE.getwtc_Enabled();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit5Impl <em>Ctrl Unit5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit5Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit5()
		 * @generated
		 */
		EClass CTRL_UNIT5 = eINSTANCE.getCtrlUnit5();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT5__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit5_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT5__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit5_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT5__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit5_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit9Impl <em>Ctrl Unit9</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit9Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit9()
		 * @generated
		 */
		EClass CTRL_UNIT9 = eINSTANCE.getCtrlUnit9();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT9__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit9_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT9__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit9_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Input iInput3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT9__INPUT_IINPUT3 = eINSTANCE.getCtrlUnit9_Input__iInput3();

		/**
		 * The meta object literal for the '<em><b>Input iInput4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT9__INPUT_IINPUT4 = eINSTANCE.getCtrlUnit9_Input__iInput4();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT9__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit9_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT9__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit9_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT9__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit9_Parameter__pParam2();

		/**
		 * The meta object literal for the '<em><b>Timer tTimer1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT9__TIMER_TTIMER1 = eINSTANCE.getCtrlUnit9_Timer__tTimer1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT9__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit9_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT9__BHV_PARAM_BHV_PARAM2 = eINSTANCE.getCtrlUnit9_BhvParam__BhvParam2();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit10Impl <em>Ctrl Unit10</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit10Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit10()
		 * @generated
		 */
		EClass CTRL_UNIT10 = eINSTANCE.getCtrlUnit10();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT10__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit10_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT10__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit10_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT10__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit10_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT10__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit10_Parameter__pParam2();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT10__PARAMETER_PPARAM3 = eINSTANCE.getCtrlUnit10_Parameter__pParam3();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT10__PARAMETER_PPARAM4 = eINSTANCE.getCtrlUnit10_Parameter__pParam4();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam5</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT10__PARAMETER_PPARAM5 = eINSTANCE.getCtrlUnit10_Parameter__pParam5();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam6</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT10__PARAMETER_PPARAM6 = eINSTANCE.getCtrlUnit10_Parameter__pParam6();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT10__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit10_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit11Impl <em>Ctrl Unit11</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit11Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit11()
		 * @generated
		 */
		EClass CTRL_UNIT11 = eINSTANCE.getCtrlUnit11();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT11__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit11_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT11__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit11_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT11__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit11_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit13Impl <em>Ctrl Unit13</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit13Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit13()
		 * @generated
		 */
		EClass CTRL_UNIT13 = eINSTANCE.getCtrlUnit13();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT13__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit13_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT13__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit13_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Input iInput3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT13__INPUT_IINPUT3 = eINSTANCE.getCtrlUnit13_Input__iInput3();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT13__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit13_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT13__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit13_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT13__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit13_Parameter__pParam2();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT13__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit13_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT13__BHV_PARAM_BHV_PARAM2 = eINSTANCE.getCtrlUnit13_BhvParam__BhvParam2();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit15Impl <em>Ctrl Unit15</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit15Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit15()
		 * @generated
		 */
		EClass CTRL_UNIT15 = eINSTANCE.getCtrlUnit15();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT15__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit15_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT15__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit15_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT15__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit15_Parameter__pParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit18Impl <em>Ctrl Unit18</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit18Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit18()
		 * @generated
		 */
		EClass CTRL_UNIT18 = eINSTANCE.getCtrlUnit18();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit18_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit18_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Input iInput3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__INPUT_IINPUT3 = eINSTANCE.getCtrlUnit18_Input__iInput3();

		/**
		 * The meta object literal for the '<em><b>Input iInput4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__INPUT_IINPUT4 = eINSTANCE.getCtrlUnit18_Input__iInput4();

		/**
		 * The meta object literal for the '<em><b>Input iInput5</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__INPUT_IINPUT5 = eINSTANCE.getCtrlUnit18_Input__iInput5();

		/**
		 * The meta object literal for the '<em><b>Input iInput6</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__INPUT_IINPUT6 = eINSTANCE.getCtrlUnit18_Input__iInput6();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit18_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit18_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit18_Parameter__pParam2();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__PARAMETER_PPARAM3 = eINSTANCE.getCtrlUnit18_Parameter__pParam3();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__PARAMETER_PPARAM4 = eINSTANCE.getCtrlUnit18_Parameter__pParam4();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam5</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__PARAMETER_PPARAM5 = eINSTANCE.getCtrlUnit18_Parameter__pParam5();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam6</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__PARAMETER_PPARAM6 = eINSTANCE.getCtrlUnit18_Parameter__pParam6();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam7</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__PARAMETER_PPARAM7 = eINSTANCE.getCtrlUnit18_Parameter__pParam7();

		/**
		 * The meta object literal for the '<em><b>Timer tTimer1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT18__TIMER_TTIMER1 = eINSTANCE.getCtrlUnit18_Timer__tTimer1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit27Impl <em>Ctrl Unit27</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit27Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit27()
		 * @generated
		 */
		EClass CTRL_UNIT27 = eINSTANCE.getCtrlUnit27();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT27__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit27_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT27__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit27_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT27__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit27_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT27__OUTPUT_OOUTPUT2 = eINSTANCE.getCtrlUnit27_Output__oOutput2();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT27__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit27_Parameter__pParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit29Impl <em>Ctrl Unit29</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit29Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit29()
		 * @generated
		 */
		EClass CTRL_UNIT29 = eINSTANCE.getCtrlUnit29();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT29__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit29_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT29__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit29_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT29__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit29_Fault__fFault1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT29__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit29_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit31Impl <em>Ctrl Unit31</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit31Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit31()
		 * @generated
		 */
		EClass CTRL_UNIT31 = eINSTANCE.getCtrlUnit31();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT31__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit31_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT31__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit31_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT31__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit31_Parameter__pParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit34Impl <em>Ctrl Unit34</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit34Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit34()
		 * @generated
		 */
		EClass CTRL_UNIT34 = eINSTANCE.getCtrlUnit34();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT34__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit34_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT34__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit34_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT34__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit34_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT34__OUTPUT_OOUTPUT2 = eINSTANCE.getCtrlUnit34_Output__oOutput2();

		/**
		 * The meta object literal for the '<em><b>Timer tTimer1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT34__TIMER_TTIMER1 = eINSTANCE.getCtrlUnit34_Timer__tTimer1();

		/**
		 * The meta object literal for the '<em><b>Timer tTimer2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT34__TIMER_TTIMER2 = eINSTANCE.getCtrlUnit34_Timer__tTimer2();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT34__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit34_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit36Impl <em>Ctrl Unit36</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit36Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit36()
		 * @generated
		 */
		EClass CTRL_UNIT36 = eINSTANCE.getCtrlUnit36();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT36__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit36_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT36__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit36_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT36__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit36_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT36__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit36_Parameter__pParam2();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit37Impl <em>Ctrl Unit37</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit37Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit37()
		 * @generated
		 */
		EClass CTRL_UNIT37 = eINSTANCE.getCtrlUnit37();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT37__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit37_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT37__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit37_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Input iInput3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT37__INPUT_IINPUT3 = eINSTANCE.getCtrlUnit37_Input__iInput3();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT37__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit37_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT37__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit37_Fault__fFault1();

		/**
		 * The meta object literal for the '<em><b>Timer tTimer1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT37__TIMER_TTIMER1 = eINSTANCE.getCtrlUnit37_Timer__tTimer1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT37__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit37_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit39Impl <em>Ctrl Unit39</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit39Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit39()
		 * @generated
		 */
		EClass CTRL_UNIT39 = eINSTANCE.getCtrlUnit39();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT39__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit39_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT39__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit39_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT39__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit39_Fault__fFault1();

		/**
		 * The meta object literal for the '<em><b>Timer tTimer1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT39__TIMER_TTIMER1 = eINSTANCE.getCtrlUnit39_Timer__tTimer1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT39__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit39_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit40Impl <em>Ctrl Unit40</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit40Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit40()
		 * @generated
		 */
		EClass CTRL_UNIT40 = eINSTANCE.getCtrlUnit40();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT40__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit40_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT40__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit40_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Timer tTimer1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT40__TIMER_TTIMER1 = eINSTANCE.getCtrlUnit40_Timer__tTimer1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit44Impl <em>Ctrl Unit44</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit44Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit44()
		 * @generated
		 */
		EClass CTRL_UNIT44 = eINSTANCE.getCtrlUnit44();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT44__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit44_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT44__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit44_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit46Impl <em>Ctrl Unit46</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit46Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit46()
		 * @generated
		 */
		EClass CTRL_UNIT46 = eINSTANCE.getCtrlUnit46();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT46__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit46_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit47Impl <em>Ctrl Unit47</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit47Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit47()
		 * @generated
		 */
		EClass CTRL_UNIT47 = eINSTANCE.getCtrlUnit47();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT47__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit47_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT47__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit47_Fault__fFault1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit49Impl <em>Ctrl Unit49</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit49Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit49()
		 * @generated
		 */
		EClass CTRL_UNIT49 = eINSTANCE.getCtrlUnit49();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit49_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit49_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Input iInput3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__INPUT_IINPUT3 = eINSTANCE.getCtrlUnit49_Input__iInput3();

		/**
		 * The meta object literal for the '<em><b>Input iInput4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__INPUT_IINPUT4 = eINSTANCE.getCtrlUnit49_Input__iInput4();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit49_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__OUTPUT_OOUTPUT2 = eINSTANCE.getCtrlUnit49_Output__oOutput2();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit49_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit49_Parameter__pParam2();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__PARAMETER_PPARAM3 = eINSTANCE.getCtrlUnit49_Parameter__pParam3();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__PARAMETER_PPARAM4 = eINSTANCE.getCtrlUnit49_Parameter__pParam4();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit49_Fault__fFault1();

		/**
		 * The meta object literal for the '<em><b>Timer tTimer1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT49__TIMER_TTIMER1 = eINSTANCE.getCtrlUnit49_Timer__tTimer1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit50Impl <em>Ctrl Unit50</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit50Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit50()
		 * @generated
		 */
		EClass CTRL_UNIT50 = eINSTANCE.getCtrlUnit50();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT50__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit50_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT50__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit50_Fault__fFault1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit58Impl <em>Ctrl Unit58</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit58Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit58()
		 * @generated
		 */
		EClass CTRL_UNIT58 = eINSTANCE.getCtrlUnit58();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT58__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit58_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT58__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit58_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT58__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit58_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT58__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit58_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit59Impl <em>Ctrl Unit59</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit59Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit59()
		 * @generated
		 */
		EClass CTRL_UNIT59 = eINSTANCE.getCtrlUnit59();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT59__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit59_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT59__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit59_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit65Impl <em>Ctrl Unit65</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit65Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit65()
		 * @generated
		 */
		EClass CTRL_UNIT65 = eINSTANCE.getCtrlUnit65();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT65__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit65_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT65__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit65_Fault__fFault1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit68Impl <em>Ctrl Unit68</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit68Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit68()
		 * @generated
		 */
		EClass CTRL_UNIT68 = eINSTANCE.getCtrlUnit68();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT68__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit68_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT68__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit68_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT68__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit68_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT68__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit68_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit71Impl <em>Ctrl Unit71</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit71Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit71()
		 * @generated
		 */
		EClass CTRL_UNIT71 = eINSTANCE.getCtrlUnit71();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT71__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit71_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT71__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit71_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Input iInput3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT71__INPUT_IINPUT3 = eINSTANCE.getCtrlUnit71_Input__iInput3();

		/**
		 * The meta object literal for the '<em><b>Input iInput4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT71__INPUT_IINPUT4 = eINSTANCE.getCtrlUnit71_Input__iInput4();

		/**
		 * The meta object literal for the '<em><b>Input iInput5</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT71__INPUT_IINPUT5 = eINSTANCE.getCtrlUnit71_Input__iInput5();

		/**
		 * The meta object literal for the '<em><b>Input iInput6</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT71__INPUT_IINPUT6 = eINSTANCE.getCtrlUnit71_Input__iInput6();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT71__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit71_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT71__OUTPUT_OOUTPUT2 = eINSTANCE.getCtrlUnit71_Output__oOutput2();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit73Impl <em>Ctrl Unit73</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit73Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit73()
		 * @generated
		 */
		EClass CTRL_UNIT73 = eINSTANCE.getCtrlUnit73();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT73__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit73_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT73__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit73_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit78Impl <em>Ctrl Unit78</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit78Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit78()
		 * @generated
		 */
		EClass CTRL_UNIT78 = eINSTANCE.getCtrlUnit78();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT78__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit78_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT78__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit78_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT78__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit78_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit80Impl <em>Ctrl Unit80</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit80Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit80()
		 * @generated
		 */
		EClass CTRL_UNIT80 = eINSTANCE.getCtrlUnit80();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT80__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit80_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT80__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit80_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Input iInput3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT80__INPUT_IINPUT3 = eINSTANCE.getCtrlUnit80_Input__iInput3();

		/**
		 * The meta object literal for the '<em><b>Input iInput4</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT80__INPUT_IINPUT4 = eINSTANCE.getCtrlUnit80_Input__iInput4();

		/**
		 * The meta object literal for the '<em><b>Input iInput5</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT80__INPUT_IINPUT5 = eINSTANCE.getCtrlUnit80_Input__iInput5();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT80__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit80_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit92Impl <em>Ctrl Unit92</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit92Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit92()
		 * @generated
		 */
		EClass CTRL_UNIT92 = eINSTANCE.getCtrlUnit92();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT92__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit92_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT92__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit92_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT92__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit92_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT92__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit92_Parameter__pParam2();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT92__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit92_Fault__fFault1();

		/**
		 * The meta object literal for the '<em><b>Bhv Param Bhv Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTRL_UNIT92__BHV_PARAM_BHV_PARAM1 = eINSTANCE.getCtrlUnit92_BhvParam__BhvParam1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit94Impl <em>Ctrl Unit94</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit94Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit94()
		 * @generated
		 */
		EClass CTRL_UNIT94 = eINSTANCE.getCtrlUnit94();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT94__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit94_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT94__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit94_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit102Impl <em>Ctrl Unit102</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit102Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit102()
		 * @generated
		 */
		EClass CTRL_UNIT102 = eINSTANCE.getCtrlUnit102();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT102__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit102_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT102__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit102_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT102__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit102_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Fault fFault1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT102__FAULT_FFAULT1 = eINSTANCE.getCtrlUnit102_Fault__fFault1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit124Impl <em>Ctrl Unit124</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit124Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit124()
		 * @generated
		 */
		EClass CTRL_UNIT124 = eINSTANCE.getCtrlUnit124();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT124__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit124_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT124__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit124_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT124__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit124_Output__oOutput1();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit125Impl <em>Ctrl Unit125</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit125Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit125()
		 * @generated
		 */
		EClass CTRL_UNIT125 = eINSTANCE.getCtrlUnit125();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT125__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit125_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT125__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit125_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT125__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit125_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT125__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit125_Parameter__pParam2();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.CtrlUnit126Impl <em>Ctrl Unit126</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.CtrlUnit126Impl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getCtrlUnit126()
		 * @generated
		 */
		EClass CTRL_UNIT126 = eINSTANCE.getCtrlUnit126();

		/**
		 * The meta object literal for the '<em><b>Input iInput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT126__INPUT_IINPUT1 = eINSTANCE.getCtrlUnit126_Input__iInput1();

		/**
		 * The meta object literal for the '<em><b>Input iInput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT126__INPUT_IINPUT2 = eINSTANCE.getCtrlUnit126_Input__iInput2();

		/**
		 * The meta object literal for the '<em><b>Output oOutput1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT126__OUTPUT_OOUTPUT1 = eINSTANCE.getCtrlUnit126_Output__oOutput1();

		/**
		 * The meta object literal for the '<em><b>Output oOutput2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT126__OUTPUT_OOUTPUT2 = eINSTANCE.getCtrlUnit126_Output__oOutput2();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT126__PARAMETER_PPARAM1 = eINSTANCE.getCtrlUnit126_Parameter__pParam1();

		/**
		 * The meta object literal for the '<em><b>Parameter pParam2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRL_UNIT126__PARAMETER_PPARAM2 = eINSTANCE.getCtrlUnit126_Parameter__pParam2();

		/**
		 * The meta object literal for the '{@link WTSpec4M.impl.MainSubsystemImpl <em>Main Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WTSpec4M.impl.MainSubsystemImpl
		 * @see WTSpec4M.impl.WTSpec4MPackageImpl#getMainSubsystem()
		 * @generated
		 */
		EClass MAIN_SUBSYSTEM = eINSTANCE.getMainSubsystem();

	}

} //WTSpec4MPackage
