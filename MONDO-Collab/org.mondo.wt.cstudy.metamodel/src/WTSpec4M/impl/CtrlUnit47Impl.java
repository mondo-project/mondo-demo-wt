/**
 */
package WTSpec4M.impl;

import WTSpec4M.CtrlUnit47;
import WTSpec4M.WTCFault;
import WTSpec4M.WTCInput;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit47</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.CtrlUnit47Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec4M.impl.CtrlUnit47Impl#getFault__fFault1 <em>Fault fFault1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtrlUnit47Impl extends wtcImpl implements CtrlUnit47 {
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
	 * The cached value of the '{@link #getFault__fFault1() <em>Fault fFault1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault1()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit47Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.CTRL_UNIT47;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT47__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT47__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CTRL_UNIT47__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CTRL_UNIT47__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpec4MPackage.CTRL_UNIT47__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpec4MPackage.CTRL_UNIT47__FAULT_FFAULT1:
				if (resolve) return getFault__fFault1();
				return basicGetFault__fFault1();
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
			case WTSpec4MPackage.CTRL_UNIT47__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpec4MPackage.CTRL_UNIT47__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)newValue);
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
			case WTSpec4MPackage.CTRL_UNIT47__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpec4MPackage.CTRL_UNIT47__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)null);
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
			case WTSpec4MPackage.CTRL_UNIT47__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpec4MPackage.CTRL_UNIT47__FAULT_FFAULT1:
				return fault__fFault1 != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit47Impl
