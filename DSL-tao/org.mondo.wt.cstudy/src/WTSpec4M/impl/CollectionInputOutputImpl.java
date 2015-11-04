/**
 */
package WTSpec4M.impl;

import WTSpec4M.CollectionInputOutput;
import WTSpec4M.SystemInput;
import WTSpec4M.SystemOutput;
import WTSpec4M.WTSpec4MPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Input Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.CollectionInputOutputImpl#getItsInput <em>Its Input</em>}</li>
 *   <li>{@link WTSpec4M.impl.CollectionInputOutputImpl#getItsOutput <em>Its Output</em>}</li>
 *   <li>{@link WTSpec4M.impl.CollectionInputOutputImpl#getSysId <em>Sys Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionInputOutputImpl extends EObjectImpl implements CollectionInputOutput {
	/**
	 * The cached value of the '{@link #getItsInput() <em>Its Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsInput()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemInput> itsInput;

	/**
	 * The cached value of the '{@link #getItsOutput() <em>Its Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemOutput> itsOutput;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionInputOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.COLLECTION_INPUT_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemInput> getItsInput() {
		if (itsInput == null) {
			itsInput = new EObjectContainmentEList.Resolving<SystemInput>(SystemInput.class, this, WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_INPUT);
		}
		return itsInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemOutput> getItsOutput() {
		if (itsOutput == null) {
			itsOutput = new EObjectContainmentEList.Resolving<SystemOutput>(SystemOutput.class, this, WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_OUTPUT);
		}
		return itsOutput;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__SYS_ID, oldSysId, sysId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_INPUT:
				return ((InternalEList<?>)getItsInput()).basicRemove(otherEnd, msgs);
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_OUTPUT:
				return ((InternalEList<?>)getItsOutput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_INPUT:
				return getItsInput();
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_OUTPUT:
				return getItsOutput();
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__SYS_ID:
				return getSysId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_INPUT:
				getItsInput().clear();
				getItsInput().addAll((Collection<? extends SystemInput>)newValue);
				return;
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_OUTPUT:
				getItsOutput().clear();
				getItsOutput().addAll((Collection<? extends SystemOutput>)newValue);
				return;
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__SYS_ID:
				setSysId((String)newValue);
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
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_INPUT:
				getItsInput().clear();
				return;
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_OUTPUT:
				getItsOutput().clear();
				return;
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__SYS_ID:
				setSysId(SYS_ID_EDEFAULT);
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
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_INPUT:
				return itsInput != null && !itsInput.isEmpty();
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__ITS_OUTPUT:
				return itsOutput != null && !itsOutput.isEmpty();
			case WTSpec4MPackage.COLLECTION_INPUT_OUTPUT__SYS_ID:
				return SYS_ID_EDEFAULT == null ? sysId != null : !SYS_ID_EDEFAULT.equals(sysId);
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
		result.append(')');
		return result.toString();
	}

} //CollectionInputOutputImpl
