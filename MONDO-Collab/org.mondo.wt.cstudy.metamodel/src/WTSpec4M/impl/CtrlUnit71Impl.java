/**
 */
package WTSpec4M.impl;

import WTSpec4M.CtrlUnit71;
import WTSpec4M.WTCInput;
import WTSpec4M.WTCOutput;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit71</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.CtrlUnit71Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit71Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit71Impl#getInput__iInput3 <em>Input iInput3</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit71Impl#getInput__iInput4 <em>Input iInput4</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit71Impl#getInput__iInput5 <em>Input iInput5</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit71Impl#getInput__iInput6 <em>Input iInput6</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit71Impl#getOutput__oOutput1 <em>Output oOutput1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit71Impl#getOutput__oOutput2 <em>Output oOutput2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtrlUnit71Impl extends wtcImpl implements CtrlUnit71 {
	/**
	 * The cached value of the '{@link #getInput__iInput1() <em>Input iInput1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput1;

	/**
	 * The cached value of the '{@link #getInput__iInput2() <em>Input iInput2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput2;

	/**
	 * The cached value of the '{@link #getInput__iInput3() <em>Input iInput3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput3;

	/**
	 * The cached value of the '{@link #getInput__iInput4() <em>Input iInput4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput4()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput4;

	/**
	 * The cached value of the '{@link #getInput__iInput5() <em>Input iInput5</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput5()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput5;

	/**
	 * The cached value of the '{@link #getInput__iInput6() <em>Input iInput6</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput6()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput6;

	/**
	 * The cached value of the '{@link #getOutput__oOutput1() <em>Output oOutput1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput1()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput1;

	/**
	 * The cached value of the '{@link #getOutput__oOutput2() <em>Output oOutput2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput2()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit71Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.CTRL_UNIT71;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput1() {
		if (input__iInput1 != null && input__iInput1.eIsProxy()) {
			InternalEObject oldInput__iInput1 = (InternalEObject)input__iInput1;
			input__iInput1 = (WTCInput)eResolveProxy(oldInput__iInput1);
			if (input__iInput1 != oldInput__iInput1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
			}
		}
		return input__iInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput1() {
		return input__iInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput1(WTCInput newInput__iInput1) {
		WTCInput oldInput__iInput1 = input__iInput1;
		input__iInput1 = newInput__iInput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput2() {
		if (input__iInput2 != null && input__iInput2.eIsProxy()) {
			InternalEObject oldInput__iInput2 = (InternalEObject)input__iInput2;
			input__iInput2 = (WTCInput)eResolveProxy(oldInput__iInput2);
			if (input__iInput2 != oldInput__iInput2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
			}
		}
		return input__iInput2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput2() {
		return input__iInput2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput2(WTCInput newInput__iInput2) {
		WTCInput oldInput__iInput2 = input__iInput2;
		input__iInput2 = newInput__iInput2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput3() {
		if (input__iInput3 != null && input__iInput3.eIsProxy()) {
			InternalEObject oldInput__iInput3 = (InternalEObject)input__iInput3;
			input__iInput3 = (WTCInput)eResolveProxy(oldInput__iInput3);
			if (input__iInput3 != oldInput__iInput3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
			}
		}
		return input__iInput3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput3() {
		return input__iInput3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput3(WTCInput newInput__iInput3) {
		WTCInput oldInput__iInput3 = input__iInput3;
		input__iInput3 = newInput__iInput3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput4() {
		if (input__iInput4 != null && input__iInput4.eIsProxy()) {
			InternalEObject oldInput__iInput4 = (InternalEObject)input__iInput4;
			input__iInput4 = (WTCInput)eResolveProxy(oldInput__iInput4);
			if (input__iInput4 != oldInput__iInput4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT4, oldInput__iInput4, input__iInput4));
			}
		}
		return input__iInput4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput4() {
		return input__iInput4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput4(WTCInput newInput__iInput4) {
		WTCInput oldInput__iInput4 = input__iInput4;
		input__iInput4 = newInput__iInput4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT4, oldInput__iInput4, input__iInput4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput5() {
		if (input__iInput5 != null && input__iInput5.eIsProxy()) {
			InternalEObject oldInput__iInput5 = (InternalEObject)input__iInput5;
			input__iInput5 = (WTCInput)eResolveProxy(oldInput__iInput5);
			if (input__iInput5 != oldInput__iInput5) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT5, oldInput__iInput5, input__iInput5));
			}
		}
		return input__iInput5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput5() {
		return input__iInput5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput5(WTCInput newInput__iInput5) {
		WTCInput oldInput__iInput5 = input__iInput5;
		input__iInput5 = newInput__iInput5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT5, oldInput__iInput5, input__iInput5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput6() {
		if (input__iInput6 != null && input__iInput6.eIsProxy()) {
			InternalEObject oldInput__iInput6 = (InternalEObject)input__iInput6;
			input__iInput6 = (WTCInput)eResolveProxy(oldInput__iInput6);
			if (input__iInput6 != oldInput__iInput6) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT6, oldInput__iInput6, input__iInput6));
			}
		}
		return input__iInput6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput6() {
		return input__iInput6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput6(WTCInput newInput__iInput6) {
		WTCInput oldInput__iInput6 = input__iInput6;
		input__iInput6 = newInput__iInput6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT6, oldInput__iInput6, input__iInput6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutput1() {
		if (output__oOutput1 != null && output__oOutput1.eIsProxy()) {
			InternalEObject oldOutput__oOutput1 = (InternalEObject)output__oOutput1;
			output__oOutput1 = (WTCOutput)eResolveProxy(oldOutput__oOutput1);
			if (output__oOutput1 != oldOutput__oOutput1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
			}
		}
		return output__oOutput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutput1() {
		return output__oOutput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutput1(WTCOutput newOutput__oOutput1) {
		WTCOutput oldOutput__oOutput1 = output__oOutput1;
		output__oOutput1 = newOutput__oOutput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutput2() {
		if (output__oOutput2 != null && output__oOutput2.eIsProxy()) {
			InternalEObject oldOutput__oOutput2 = (InternalEObject)output__oOutput2;
			output__oOutput2 = (WTCOutput)eResolveProxy(oldOutput__oOutput2);
			if (output__oOutput2 != oldOutput__oOutput2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT2, oldOutput__oOutput2, output__oOutput2));
			}
		}
		return output__oOutput2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutput2() {
		return output__oOutput2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutput2(WTCOutput newOutput__oOutput2) {
		WTCOutput oldOutput__oOutput2 = output__oOutput2;
		output__oOutput2 = newOutput__oOutput2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT2, oldOutput__oOutput2, output__oOutput2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT2:
				if (resolve) return getInput__iInput2();
				return basicGetInput__iInput2();
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT3:
				if (resolve) return getInput__iInput3();
				return basicGetInput__iInput3();
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT4:
				if (resolve) return getInput__iInput4();
				return basicGetInput__iInput4();
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT5:
				if (resolve) return getInput__iInput5();
				return basicGetInput__iInput5();
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT6:
				if (resolve) return getInput__iInput6();
				return basicGetInput__iInput6();
			case WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT1:
				if (resolve) return getOutput__oOutput1();
				return basicGetOutput__oOutput1();
			case WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT2:
				if (resolve) return getOutput__oOutput2();
				return basicGetOutput__oOutput2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT3:
				setInput__iInput3((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT4:
				setInput__iInput4((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT5:
				setInput__iInput5((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT6:
				setInput__iInput6((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT1:
				setOutput__oOutput1((WTCOutput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT2:
				setOutput__oOutput2((WTCOutput)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT3:
				setInput__iInput3((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT4:
				setInput__iInput4((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT5:
				setInput__iInput5((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT6:
				setInput__iInput6((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT1:
				setOutput__oOutput1((WTCOutput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT2:
				setOutput__oOutput2((WTCOutput)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT2:
				return input__iInput2 != null;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT3:
				return input__iInput3 != null;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT4:
				return input__iInput4 != null;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT5:
				return input__iInput5 != null;
			case WTSpec4MPackage.CTRL_UNIT71__INPUT_IINPUT6:
				return input__iInput6 != null;
			case WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT1:
				return output__oOutput1 != null;
			case WTSpec4MPackage.CTRL_UNIT71__OUTPUT_OOUTPUT2:
				return output__oOutput2 != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit71Impl
