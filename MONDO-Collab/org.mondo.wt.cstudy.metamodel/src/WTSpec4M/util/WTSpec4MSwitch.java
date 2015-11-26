/**
 */
package WTSpec4M.util;

import WTSpec4M.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WTSpec4M.WTSpec4MPackage
 * @generated
 */
public class WTSpec4MSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WTSpec4MPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSpec4MSwitch() {
		if (modelPackage == null) {
			modelPackage = WTSpec4MPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WTSpec4MPackage.WT: {
				WT wt = (WT)theEObject;
				T result = caseWT(wt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.SYSTEM_INPUT: {
				SystemInput systemInput = (SystemInput)theEObject;
				T result = caseSystemInput(systemInput);
				if (result == null) result = caseWTCInput(systemInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.SYSTEM_OUTPUT: {
				SystemOutput systemOutput = (SystemOutput)theEObject;
				T result = caseSystemOutput(systemOutput);
				if (result == null) result = caseWTCOutput(systemOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.SYSTEM_FAULT: {
				SystemFault systemFault = (SystemFault)theEObject;
				T result = caseSystemFault(systemFault);
				if (result == null) result = caseWTCFault(systemFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.SYSTEM_PARAM: {
				SystemParam systemParam = (SystemParam)theEObject;
				T result = caseSystemParam(systemParam);
				if (result == null) result = caseWTCParam(systemParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.SYSTEM_TIMER: {
				SystemTimer systemTimer = (SystemTimer)theEObject;
				T result = caseSystemTimer(systemTimer);
				if (result == null) result = caseWTCTimer(systemTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.SYSTEM_VARIABLE: {
				SystemVariable systemVariable = (SystemVariable)theEObject;
				T result = caseSystemVariable(systemVariable);
				if (result == null) result = caseWTCInput(systemVariable);
				if (result == null) result = caseWTCOutput(systemVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.WTC_INPUT: {
				WTCInput wtcInput = (WTCInput)theEObject;
				T result = caseWTCInput(wtcInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.WTC_OUTPUT: {
				WTCOutput wtcOutput = (WTCOutput)theEObject;
				T result = caseWTCOutput(wtcOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.WTC_PARAM: {
				WTCParam wtcParam = (WTCParam)theEObject;
				T result = caseWTCParam(wtcParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.WTC_TIMER: {
				WTCTimer wtcTimer = (WTCTimer)theEObject;
				T result = caseWTCTimer(wtcTimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.WTC_FAULT: {
				WTCFault wtcFault = (WTCFault)theEObject;
				T result = caseWTCFault(wtcFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.SUBSYSTEM: {
				Subsystem subsystem = (Subsystem)theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.WTC: {
				wtc wtc = (wtc)theEObject;
				T result = casewtc(wtc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT5: {
				CtrlUnit5 ctrlUnit5 = (CtrlUnit5)theEObject;
				T result = caseCtrlUnit5(ctrlUnit5);
				if (result == null) result = casewtc(ctrlUnit5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT9: {
				CtrlUnit9 ctrlUnit9 = (CtrlUnit9)theEObject;
				T result = caseCtrlUnit9(ctrlUnit9);
				if (result == null) result = casewtc(ctrlUnit9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT10: {
				CtrlUnit10 ctrlUnit10 = (CtrlUnit10)theEObject;
				T result = caseCtrlUnit10(ctrlUnit10);
				if (result == null) result = casewtc(ctrlUnit10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT11: {
				CtrlUnit11 ctrlUnit11 = (CtrlUnit11)theEObject;
				T result = caseCtrlUnit11(ctrlUnit11);
				if (result == null) result = casewtc(ctrlUnit11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT13: {
				CtrlUnit13 ctrlUnit13 = (CtrlUnit13)theEObject;
				T result = caseCtrlUnit13(ctrlUnit13);
				if (result == null) result = casewtc(ctrlUnit13);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT15: {
				CtrlUnit15 ctrlUnit15 = (CtrlUnit15)theEObject;
				T result = caseCtrlUnit15(ctrlUnit15);
				if (result == null) result = casewtc(ctrlUnit15);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT18: {
				CtrlUnit18 ctrlUnit18 = (CtrlUnit18)theEObject;
				T result = caseCtrlUnit18(ctrlUnit18);
				if (result == null) result = casewtc(ctrlUnit18);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT27: {
				CtrlUnit27 ctrlUnit27 = (CtrlUnit27)theEObject;
				T result = caseCtrlUnit27(ctrlUnit27);
				if (result == null) result = casewtc(ctrlUnit27);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT29: {
				CtrlUnit29 ctrlUnit29 = (CtrlUnit29)theEObject;
				T result = caseCtrlUnit29(ctrlUnit29);
				if (result == null) result = casewtc(ctrlUnit29);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT31: {
				CtrlUnit31 ctrlUnit31 = (CtrlUnit31)theEObject;
				T result = caseCtrlUnit31(ctrlUnit31);
				if (result == null) result = casewtc(ctrlUnit31);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT34: {
				CtrlUnit34 ctrlUnit34 = (CtrlUnit34)theEObject;
				T result = caseCtrlUnit34(ctrlUnit34);
				if (result == null) result = casewtc(ctrlUnit34);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT36: {
				CtrlUnit36 ctrlUnit36 = (CtrlUnit36)theEObject;
				T result = caseCtrlUnit36(ctrlUnit36);
				if (result == null) result = casewtc(ctrlUnit36);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT37: {
				CtrlUnit37 ctrlUnit37 = (CtrlUnit37)theEObject;
				T result = caseCtrlUnit37(ctrlUnit37);
				if (result == null) result = casewtc(ctrlUnit37);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT39: {
				CtrlUnit39 ctrlUnit39 = (CtrlUnit39)theEObject;
				T result = caseCtrlUnit39(ctrlUnit39);
				if (result == null) result = casewtc(ctrlUnit39);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT40: {
				CtrlUnit40 ctrlUnit40 = (CtrlUnit40)theEObject;
				T result = caseCtrlUnit40(ctrlUnit40);
				if (result == null) result = casewtc(ctrlUnit40);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT44: {
				CtrlUnit44 ctrlUnit44 = (CtrlUnit44)theEObject;
				T result = caseCtrlUnit44(ctrlUnit44);
				if (result == null) result = casewtc(ctrlUnit44);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT46: {
				CtrlUnit46 ctrlUnit46 = (CtrlUnit46)theEObject;
				T result = caseCtrlUnit46(ctrlUnit46);
				if (result == null) result = casewtc(ctrlUnit46);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT47: {
				CtrlUnit47 ctrlUnit47 = (CtrlUnit47)theEObject;
				T result = caseCtrlUnit47(ctrlUnit47);
				if (result == null) result = casewtc(ctrlUnit47);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT49: {
				CtrlUnit49 ctrlUnit49 = (CtrlUnit49)theEObject;
				T result = caseCtrlUnit49(ctrlUnit49);
				if (result == null) result = casewtc(ctrlUnit49);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT50: {
				CtrlUnit50 ctrlUnit50 = (CtrlUnit50)theEObject;
				T result = caseCtrlUnit50(ctrlUnit50);
				if (result == null) result = casewtc(ctrlUnit50);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT58: {
				CtrlUnit58 ctrlUnit58 = (CtrlUnit58)theEObject;
				T result = caseCtrlUnit58(ctrlUnit58);
				if (result == null) result = casewtc(ctrlUnit58);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT59: {
				CtrlUnit59 ctrlUnit59 = (CtrlUnit59)theEObject;
				T result = caseCtrlUnit59(ctrlUnit59);
				if (result == null) result = casewtc(ctrlUnit59);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT65: {
				CtrlUnit65 ctrlUnit65 = (CtrlUnit65)theEObject;
				T result = caseCtrlUnit65(ctrlUnit65);
				if (result == null) result = casewtc(ctrlUnit65);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT68: {
				CtrlUnit68 ctrlUnit68 = (CtrlUnit68)theEObject;
				T result = caseCtrlUnit68(ctrlUnit68);
				if (result == null) result = casewtc(ctrlUnit68);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT71: {
				CtrlUnit71 ctrlUnit71 = (CtrlUnit71)theEObject;
				T result = caseCtrlUnit71(ctrlUnit71);
				if (result == null) result = casewtc(ctrlUnit71);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT73: {
				CtrlUnit73 ctrlUnit73 = (CtrlUnit73)theEObject;
				T result = caseCtrlUnit73(ctrlUnit73);
				if (result == null) result = casewtc(ctrlUnit73);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT78: {
				CtrlUnit78 ctrlUnit78 = (CtrlUnit78)theEObject;
				T result = caseCtrlUnit78(ctrlUnit78);
				if (result == null) result = casewtc(ctrlUnit78);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT80: {
				CtrlUnit80 ctrlUnit80 = (CtrlUnit80)theEObject;
				T result = caseCtrlUnit80(ctrlUnit80);
				if (result == null) result = casewtc(ctrlUnit80);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT92: {
				CtrlUnit92 ctrlUnit92 = (CtrlUnit92)theEObject;
				T result = caseCtrlUnit92(ctrlUnit92);
				if (result == null) result = casewtc(ctrlUnit92);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT94: {
				CtrlUnit94 ctrlUnit94 = (CtrlUnit94)theEObject;
				T result = caseCtrlUnit94(ctrlUnit94);
				if (result == null) result = casewtc(ctrlUnit94);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT102: {
				CtrlUnit102 ctrlUnit102 = (CtrlUnit102)theEObject;
				T result = caseCtrlUnit102(ctrlUnit102);
				if (result == null) result = casewtc(ctrlUnit102);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT124: {
				CtrlUnit124 ctrlUnit124 = (CtrlUnit124)theEObject;
				T result = caseCtrlUnit124(ctrlUnit124);
				if (result == null) result = casewtc(ctrlUnit124);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT125: {
				CtrlUnit125 ctrlUnit125 = (CtrlUnit125)theEObject;
				T result = caseCtrlUnit125(ctrlUnit125);
				if (result == null) result = casewtc(ctrlUnit125);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.CTRL_UNIT126: {
				CtrlUnit126 ctrlUnit126 = (CtrlUnit126)theEObject;
				T result = caseCtrlUnit126(ctrlUnit126);
				if (result == null) result = casewtc(ctrlUnit126);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WTSpec4MPackage.MAIN_SUBSYSTEM: {
				MainSubsystem mainSubsystem = (MainSubsystem)theEObject;
				T result = caseMainSubsystem(mainSubsystem);
				if (result == null) result = caseSubsystem(mainSubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWT(WT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemInput(SystemInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemOutput(SystemOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemFault(SystemFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemParam(SystemParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemTimer(SystemTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemVariable(SystemVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCInput(WTCInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCOutput(WTCOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCParam(WTCParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCTimer(WTCTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WTC Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WTC Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWTCFault(WTCFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>wtc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>wtc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewtc(wtc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit5(CtrlUnit5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit9(CtrlUnit9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit10(CtrlUnit10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit11(CtrlUnit11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit13(CtrlUnit13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit15</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit15</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit15(CtrlUnit15 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit18</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit18</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit18(CtrlUnit18 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit27</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit27</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit27(CtrlUnit27 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit29</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit29</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit29(CtrlUnit29 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit31</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit31</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit31(CtrlUnit31 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit34</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit34</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit34(CtrlUnit34 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit36</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit36</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit36(CtrlUnit36 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit37</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit37</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit37(CtrlUnit37 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit39</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit39</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit39(CtrlUnit39 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit40</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit40</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit40(CtrlUnit40 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit44</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit44</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit44(CtrlUnit44 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit46</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit46</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit46(CtrlUnit46 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit47</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit47</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit47(CtrlUnit47 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit49</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit49</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit49(CtrlUnit49 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit50</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit50</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit50(CtrlUnit50 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit58</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit58</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit58(CtrlUnit58 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit59</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit59</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit59(CtrlUnit59 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit65</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit65</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit65(CtrlUnit65 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit68</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit68</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit68(CtrlUnit68 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit71</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit71</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit71(CtrlUnit71 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit73</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit73</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit73(CtrlUnit73 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit78</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit78</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit78(CtrlUnit78 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit80</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit80</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit80(CtrlUnit80 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit92</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit92</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit92(CtrlUnit92 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit94</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit94</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit94(CtrlUnit94 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit102</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit102</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit102(CtrlUnit102 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit124</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit124</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit124(CtrlUnit124 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit125</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit125</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit125(CtrlUnit125 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ctrl Unit126</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ctrl Unit126</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCtrlUnit126(CtrlUnit126 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainSubsystem(MainSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WTSpec4MSwitch
