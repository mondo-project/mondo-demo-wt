/**
 */
package WTSpec4M.impl;

import WTSpec4M.CtrlUnit92;
import WTSpec4M.WTCFault;
import WTSpec4M.WTCInput;
import WTSpec4M.WTCParam;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit92</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.CtrlUnit92Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit92Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit92Impl#getParameter__pParam1 <em>Parameter pParam1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit92Impl#getParameter__pParam2 <em>Parameter pParam2</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit92Impl#getFault__fFault1 <em>Fault fFault1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit92Impl#getBhvParam__BhvParam1 <em>Bhv Param Bhv Param1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtrlUnit92Impl extends wtcImpl implements CtrlUnit92 {
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
	 * The cached value of the '{@link #getFault__fFault1() <em>Fault fFault1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault1()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault1;

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
	protected CtrlUnit92Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.CTRL_UNIT92;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault1() {
		if (fault__fFault1 != null && fault__fFault1.eIsProxy()) {
			InternalEObject oldFault__fFault1 = (InternalEObject)fault__fFault1;
			fault__fFault1 = (WTCFault)eResolveProxy(oldFault__fFault1);
			if (fault__fFault1 != oldFault__fFault1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT92__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
			}
		}
		return fault__fFault1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault1() {
		return fault__fFault1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault1(WTCFault newFault__fFault1) {
		WTCFault oldFault__fFault1 = fault__fFault1;
		fault__fFault1 = newFault__fFault1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT92__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT92__BHV_PARAM_BHV_PARAM1, oldBhvParam__BhvParam1, bhvParam__BhvParam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT2:
				if (resolve) return getInput__iInput2();
				return basicGetInput__iInput2();
			case WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM1:
				if (resolve) return getParameter__pParam1();
				return basicGetParameter__pParam1();
			case WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM2:
				if (resolve) return getParameter__pParam2();
				return basicGetParameter__pParam2();
			case WTSpec4MPackage.CTRL_UNIT92__FAULT_FFAULT1:
				if (resolve) return getFault__fFault1();
				return basicGetFault__fFault1();
			case WTSpec4MPackage.CTRL_UNIT92__BHV_PARAM_BHV_PARAM1:
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
			case WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__BHV_PARAM_BHV_PARAM1:
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
			case WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT92__BHV_PARAM_BHV_PARAM1:
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
			case WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpec4MPackage.CTRL_UNIT92__INPUT_IINPUT2:
				return input__iInput2 != null;
			case WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM1:
				return parameter__pParam1 != null;
			case WTSpec4MPackage.CTRL_UNIT92__PARAMETER_PPARAM2:
				return parameter__pParam2 != null;
			case WTSpec4MPackage.CTRL_UNIT92__FAULT_FFAULT1:
				return fault__fFault1 != null;
			case WTSpec4MPackage.CTRL_UNIT92__BHV_PARAM_BHV_PARAM1:
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

} //CtrlUnit92Impl
