/**
 */
package WTSpec4M.impl;

import WTSpec4M.SystemParam;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.SystemParamImpl#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link WTSpec4M.impl.SystemParamImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WTSpec4M.impl.SystemParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link WTSpec4M.impl.SystemParamImpl#isSettable <em>Settable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemParamImpl extends WTCParamImpl implements SystemParam {
	/**
	 * The default value of the '{@link #getSysId() <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysId()
	 * @generated
	 * @ordered
	 */
	protected static final String SYS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSysId() <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysId()
	 * @generated
	 * @ordered
	 */
	protected String sysId = SYS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSettable() <em>Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSettable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SETTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSettable() <em>Settable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSettable()
	 * @generated
	 * @ordered
	 */
	protected boolean settable = SETTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.SYSTEM_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSysId() {
		return sysId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSysId(String newSysId) {
		String oldSysId = sysId;
		sysId = newSysId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.SYSTEM_PARAM__SYS_ID, oldSysId, sysId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.SYSTEM_PARAM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.SYSTEM_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSettable() {
		return settable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettable(boolean newSettable) {
		boolean oldSettable = settable;
		settable = newSettable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.SYSTEM_PARAM__SETTABLE, oldSettable, settable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpec4MPackage.SYSTEM_PARAM__SYS_ID:
				return getSysId();
			case WTSpec4MPackage.SYSTEM_PARAM__DESCRIPTION:
				return getDescription();
			case WTSpec4MPackage.SYSTEM_PARAM__VALUE:
				return getValue();
			case WTSpec4MPackage.SYSTEM_PARAM__SETTABLE:
				return isSettable();
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
			case WTSpec4MPackage.SYSTEM_PARAM__SYS_ID:
				setSysId((String)newValue);
				return;
			case WTSpec4MPackage.SYSTEM_PARAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WTSpec4MPackage.SYSTEM_PARAM__VALUE:
				setValue((Integer)newValue);
				return;
			case WTSpec4MPackage.SYSTEM_PARAM__SETTABLE:
				setSettable((Boolean)newValue);
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
			case WTSpec4MPackage.SYSTEM_PARAM__SYS_ID:
				setSysId(SYS_ID_EDEFAULT);
				return;
			case WTSpec4MPackage.SYSTEM_PARAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WTSpec4MPackage.SYSTEM_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case WTSpec4MPackage.SYSTEM_PARAM__SETTABLE:
				setSettable(SETTABLE_EDEFAULT);
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
			case WTSpec4MPackage.SYSTEM_PARAM__SYS_ID:
				return SYS_ID_EDEFAULT == null ? sysId != null : !SYS_ID_EDEFAULT.equals(sysId);
			case WTSpec4MPackage.SYSTEM_PARAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WTSpec4MPackage.SYSTEM_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case WTSpec4MPackage.SYSTEM_PARAM__SETTABLE:
				return settable != SETTABLE_EDEFAULT;
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
		result.append(" (sysId: ");
		result.append(sysId);
		result.append(", description: ");
		result.append(description);
		result.append(", value: ");
		result.append(value);
		result.append(", settable: ");
		result.append(settable);
		result.append(')');
		return result.toString();
	}

} //SystemParamImpl
