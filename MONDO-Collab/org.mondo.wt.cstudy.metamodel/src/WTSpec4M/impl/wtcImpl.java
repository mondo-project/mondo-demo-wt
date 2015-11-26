/**
 */
package WTSpec4M.impl;

import WTSpec4M.WTSpec4MPackage;
import WTSpec4M.wtc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>wtc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.wtcImpl#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link WTSpec4M.impl.wtcImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WTSpec4M.impl.wtcImpl#getCycle <em>Cycle</em>}</li>
 *   <li>{@link WTSpec4M.impl.wtcImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link WTSpec4M.impl.wtcImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class wtcImpl extends MinimalEObjectImpl.Container implements wtc {
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
	 * The default value of the '{@link #getCycle() <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected static final short CYCLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycle() <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected short cycle = CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final short PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected short priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected wtcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.WTC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WTC__SYS_ID, oldSysId, sysId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WTC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getCycle() {
		return cycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycle(short newCycle) {
		short oldCycle = cycle;
		cycle = newCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WTC__CYCLE, oldCycle, cycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(short newPriority) {
		short oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WTC__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WTC__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpec4MPackage.WTC__SYS_ID:
				return getSysId();
			case WTSpec4MPackage.WTC__DESCRIPTION:
				return getDescription();
			case WTSpec4MPackage.WTC__CYCLE:
				return getCycle();
			case WTSpec4MPackage.WTC__PRIORITY:
				return getPriority();
			case WTSpec4MPackage.WTC__ENABLED:
				return isEnabled();
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
			case WTSpec4MPackage.WTC__SYS_ID:
				setSysId((String)newValue);
				return;
			case WTSpec4MPackage.WTC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WTSpec4MPackage.WTC__CYCLE:
				setCycle((Short)newValue);
				return;
			case WTSpec4MPackage.WTC__PRIORITY:
				setPriority((Short)newValue);
				return;
			case WTSpec4MPackage.WTC__ENABLED:
				setEnabled((Boolean)newValue);
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
			case WTSpec4MPackage.WTC__SYS_ID:
				setSysId(SYS_ID_EDEFAULT);
				return;
			case WTSpec4MPackage.WTC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WTSpec4MPackage.WTC__CYCLE:
				setCycle(CYCLE_EDEFAULT);
				return;
			case WTSpec4MPackage.WTC__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case WTSpec4MPackage.WTC__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
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
			case WTSpec4MPackage.WTC__SYS_ID:
				return SYS_ID_EDEFAULT == null ? sysId != null : !SYS_ID_EDEFAULT.equals(sysId);
			case WTSpec4MPackage.WTC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WTSpec4MPackage.WTC__CYCLE:
				return cycle != CYCLE_EDEFAULT;
			case WTSpec4MPackage.WTC__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case WTSpec4MPackage.WTC__ENABLED:
				return enabled != ENABLED_EDEFAULT;
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
		result.append(", cycle: ");
		result.append(cycle);
		result.append(", priority: ");
		result.append(priority);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //wtcImpl
