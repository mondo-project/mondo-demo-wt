/**
 */
package WTSpec4M.impl;

import WTSpec4M.CtrlUnit68;
import WTSpec4M.WTCInput;
import WTSpec4M.WTCOutput;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit68</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.CtrlUnit68Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit68Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit68Impl#getOutput__oOutput1 <em>Output oOutput1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit68Impl#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtrlUnit68Impl extends wtcImpl implements CtrlUnit68 {
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
	 * The cached value of the '{@link #getOutput__oOutput1() <em>Output oOutput1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput1()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput1;

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
	protected CtrlUnit68Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.CTRL_UNIT68;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT68__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT68__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT68__BHV_PARAM_BHV_PARAM1, oldBhvParam__BhvParam1, bhvParam__BhvParam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT2:
				if (resolve) return getInput__iInput2();
				return basicGetInput__iInput2();
			case WTSpec4MPackage.CTRL_UNIT68__OUTPUT_OOUTPUT1:
				if (resolve) return getOutput__oOutput1();
				return basicGetOutput__oOutput1();
			case WTSpec4MPackage.CTRL_UNIT68__BHV_PARAM_BHV_PARAM1:
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
			case WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT68__OUTPUT_OOUTPUT1:
				setOutput__oOutput1((WTCOutput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT68__BHV_PARAM_BHV_PARAM1:
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
			case WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT68__OUTPUT_OOUTPUT1:
				setOutput__oOutput1((WTCOutput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT68__BHV_PARAM_BHV_PARAM1:
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
			case WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpec4MPackage.CTRL_UNIT68__INPUT_IINPUT2:
				return input__iInput2 != null;
			case WTSpec4MPackage.CTRL_UNIT68__OUTPUT_OOUTPUT1:
				return output__oOutput1 != null;
			case WTSpec4MPackage.CTRL_UNIT68__BHV_PARAM_BHV_PARAM1:
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

} //CtrlUnit68Impl
