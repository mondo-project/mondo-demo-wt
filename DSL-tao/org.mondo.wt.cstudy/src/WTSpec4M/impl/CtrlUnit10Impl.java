/**
 */
package WTSpec4M.impl;

import WTSpec4M.CtrlUnit10;
import WTSpec4M.WTCInput;
import WTSpec4M.WTCOutput;
import WTSpec4M.WTCParam;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit10</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getOutput__oOutput1 <em>Output oOutput1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getParameter__pParam1 <em>Parameter pParam1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getParameter__pParam2 <em>Parameter pParam2</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getParameter__pParam3 <em>Parameter pParam3</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getParameter__pParam4 <em>Parameter pParam4</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getParameter__pParam5 <em>Parameter pParam5</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getParameter__pParam6 <em>Parameter pParam6</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit10Impl#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtrlUnit10Impl extends wtcImpl implements CtrlUnit10 {
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
	 * The cached value of the '{@link #getOutput__oOutput1() <em>Output oOutput1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput1()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput1;

	/**
	 * The cached value of the '{@link #getParameter__pParam1() <em>Parameter pParam1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam1()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam1;

	/**
	 * The cached value of the '{@link #getParameter__pParam2() <em>Parameter pParam2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam2()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam2;

	/**
	 * The cached value of the '{@link #getParameter__pParam3() <em>Parameter pParam3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam3()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam3;

	/**
	 * The cached value of the '{@link #getParameter__pParam4() <em>Parameter pParam4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam4()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam4;

	/**
	 * The cached value of the '{@link #getParameter__pParam5() <em>Parameter pParam5</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam5()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam5;

	/**
	 * The cached value of the '{@link #getParameter__pParam6() <em>Parameter pParam6</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam6()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam6;

	/**
	 * The default value of the '{@link #getBhvParam__BhvParam1() <em>Bhv Param Bhv Param1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__BhvParam1()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BHV_PARAM1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__BhvParam1() <em>Bhv Param Bhv Param1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__BhvParam1()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__BhvParam1 = BHV_PARAM_BHV_PARAM1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit10Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.CTRL_UNIT10;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT10__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT10__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam1() {
		if (parameter__pParam1 != null && parameter__pParam1.eIsProxy()) {
			InternalEObject oldParameter__pParam1 = (InternalEObject)parameter__pParam1;
			parameter__pParam1 = (WTCParam)eResolveProxy(oldParameter__pParam1);
			if (parameter__pParam1 != oldParameter__pParam1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
			}
		}
		return parameter__pParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam1() {
		return parameter__pParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam1(WTCParam newParameter__pParam1) {
		WTCParam oldParameter__pParam1 = parameter__pParam1;
		parameter__pParam1 = newParameter__pParam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam2() {
		if (parameter__pParam2 != null && parameter__pParam2.eIsProxy()) {
			InternalEObject oldParameter__pParam2 = (InternalEObject)parameter__pParam2;
			parameter__pParam2 = (WTCParam)eResolveProxy(oldParameter__pParam2);
			if (parameter__pParam2 != oldParameter__pParam2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
			}
		}
		return parameter__pParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam2() {
		return parameter__pParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam2(WTCParam newParameter__pParam2) {
		WTCParam oldParameter__pParam2 = parameter__pParam2;
		parameter__pParam2 = newParameter__pParam2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam3() {
		if (parameter__pParam3 != null && parameter__pParam3.eIsProxy()) {
			InternalEObject oldParameter__pParam3 = (InternalEObject)parameter__pParam3;
			parameter__pParam3 = (WTCParam)eResolveProxy(oldParameter__pParam3);
			if (parameter__pParam3 != oldParameter__pParam3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM3, oldParameter__pParam3, parameter__pParam3));
			}
		}
		return parameter__pParam3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam3() {
		return parameter__pParam3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam3(WTCParam newParameter__pParam3) {
		WTCParam oldParameter__pParam3 = parameter__pParam3;
		parameter__pParam3 = newParameter__pParam3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM3, oldParameter__pParam3, parameter__pParam3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam4() {
		if (parameter__pParam4 != null && parameter__pParam4.eIsProxy()) {
			InternalEObject oldParameter__pParam4 = (InternalEObject)parameter__pParam4;
			parameter__pParam4 = (WTCParam)eResolveProxy(oldParameter__pParam4);
			if (parameter__pParam4 != oldParameter__pParam4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM4, oldParameter__pParam4, parameter__pParam4));
			}
		}
		return parameter__pParam4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam4() {
		return parameter__pParam4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam4(WTCParam newParameter__pParam4) {
		WTCParam oldParameter__pParam4 = parameter__pParam4;
		parameter__pParam4 = newParameter__pParam4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM4, oldParameter__pParam4, parameter__pParam4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam5() {
		if (parameter__pParam5 != null && parameter__pParam5.eIsProxy()) {
			InternalEObject oldParameter__pParam5 = (InternalEObject)parameter__pParam5;
			parameter__pParam5 = (WTCParam)eResolveProxy(oldParameter__pParam5);
			if (parameter__pParam5 != oldParameter__pParam5) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM5, oldParameter__pParam5, parameter__pParam5));
			}
		}
		return parameter__pParam5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam5() {
		return parameter__pParam5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam5(WTCParam newParameter__pParam5) {
		WTCParam oldParameter__pParam5 = parameter__pParam5;
		parameter__pParam5 = newParameter__pParam5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM5, oldParameter__pParam5, parameter__pParam5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam6() {
		if (parameter__pParam6 != null && parameter__pParam6.eIsProxy()) {
			InternalEObject oldParameter__pParam6 = (InternalEObject)parameter__pParam6;
			parameter__pParam6 = (WTCParam)eResolveProxy(oldParameter__pParam6);
			if (parameter__pParam6 != oldParameter__pParam6) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM6, oldParameter__pParam6, parameter__pParam6));
			}
		}
		return parameter__pParam6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam6() {
		return parameter__pParam6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam6(WTCParam newParameter__pParam6) {
		WTCParam oldParameter__pParam6 = parameter__pParam6;
		parameter__pParam6 = newParameter__pParam6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM6, oldParameter__pParam6, parameter__pParam6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__BhvParam1() {
		return bhvParam__BhvParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__BhvParam1(String newBhvParam__BhvParam1) {
		String oldBhvParam__BhvParam1 = bhvParam__BhvParam1;
		bhvParam__BhvParam1 = newBhvParam__BhvParam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT10__BHV_PARAM_BHV_PARAM1, oldBhvParam__BhvParam1, bhvParam__BhvParam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpec4MPackage.CTRL_UNIT10__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpec4MPackage.CTRL_UNIT10__OUTPUT_OOUTPUT1:
				if (resolve) return getOutput__oOutput1();
				return basicGetOutput__oOutput1();
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM1:
				if (resolve) return getParameter__pParam1();
				return basicGetParameter__pParam1();
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM2:
				if (resolve) return getParameter__pParam2();
				return basicGetParameter__pParam2();
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM3:
				if (resolve) return getParameter__pParam3();
				return basicGetParameter__pParam3();
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM4:
				if (resolve) return getParameter__pParam4();
				return basicGetParameter__pParam4();
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM5:
				if (resolve) return getParameter__pParam5();
				return basicGetParameter__pParam5();
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM6:
				if (resolve) return getParameter__pParam6();
				return basicGetParameter__pParam6();
			case WTSpec4MPackage.CTRL_UNIT10__BHV_PARAM_BHV_PARAM1:
				return getBhvParam__BhvParam1();
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
			case WTSpec4MPackage.CTRL_UNIT10__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__OUTPUT_OOUTPUT1:
				setOutput__oOutput1((WTCOutput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM3:
				setParameter__pParam3((WTCParam)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM4:
				setParameter__pParam4((WTCParam)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM5:
				setParameter__pParam5((WTCParam)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM6:
				setParameter__pParam6((WTCParam)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__BHV_PARAM_BHV_PARAM1:
				setBhvParam__BhvParam1((String)newValue);
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
			case WTSpec4MPackage.CTRL_UNIT10__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__OUTPUT_OOUTPUT1:
				setOutput__oOutput1((WTCOutput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM3:
				setParameter__pParam3((WTCParam)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM4:
				setParameter__pParam4((WTCParam)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM5:
				setParameter__pParam5((WTCParam)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM6:
				setParameter__pParam6((WTCParam)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT10__BHV_PARAM_BHV_PARAM1:
				setBhvParam__BhvParam1(BHV_PARAM_BHV_PARAM1_EDEFAULT);
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
			case WTSpec4MPackage.CTRL_UNIT10__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpec4MPackage.CTRL_UNIT10__OUTPUT_OOUTPUT1:
				return output__oOutput1 != null;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM1:
				return parameter__pParam1 != null;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM2:
				return parameter__pParam2 != null;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM3:
				return parameter__pParam3 != null;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM4:
				return parameter__pParam4 != null;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM5:
				return parameter__pParam5 != null;
			case WTSpec4MPackage.CTRL_UNIT10__PARAMETER_PPARAM6:
				return parameter__pParam6 != null;
			case WTSpec4MPackage.CTRL_UNIT10__BHV_PARAM_BHV_PARAM1:
				return BHV_PARAM_BHV_PARAM1_EDEFAULT == null ? bhvParam__BhvParam1 != null : !BHV_PARAM_BHV_PARAM1_EDEFAULT.equals(bhvParam__BhvParam1);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BhvParam__BhvParam1: ");
		result.append(bhvParam__BhvParam1);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit10Impl
