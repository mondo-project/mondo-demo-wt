/**
 */
package WTSpec4M.impl;

import WTSpec4M.MainSubsystem;
import WTSpec4M.SystemFault;
import WTSpec4M.SystemInput;
import WTSpec4M.SystemOutput;
import WTSpec4M.SystemParam;
import WTSpec4M.SystemTimer;
import WTSpec4M.SystemVariable;
import WTSpec4M.WT;
import WTSpec4M.WTSpec4MPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.WTImpl#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getModel <em>Model</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getItsSubsystems <em>Its Subsystems</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getItsInputs <em>Its Inputs</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getItsOutputs <em>Its Outputs</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getItsParams <em>Its Params</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getItsTimers <em>Its Timers</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getItsFaults <em>Its Faults</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getItsVariables <em>Its Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WTImpl extends MinimalEObjectImpl.Container implements WT {
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
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItsSubsystems() <em>Its Subsystems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSubsystems()
	 * @generated
	 * @ordered
	 */
	protected EList<MainSubsystem> itsSubsystems;

	/**
	 * The cached value of the '{@link #getItsInputs() <em>Its Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemInput> itsInputs;

	/**
	 * The cached value of the '{@link #getItsOutputs() <em>Its Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemOutput> itsOutputs;

	/**
	 * The cached value of the '{@link #getItsParams() <em>Its Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsParams()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemParam> itsParams;

	/**
	 * The cached value of the '{@link #getItsTimers() <em>Its Timers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsTimers()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemTimer> itsTimers;

	/**
	 * The cached value of the '{@link #getItsFaults() <em>Its Faults</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsFaults()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFault> itsFaults;

	/**
	 * The cached value of the '{@link #getItsVariables() <em>Its Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemVariable> itsVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpec4MPackage.Literals.WT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WT__SYS_ID, oldSysId, sysId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MainSubsystem> getItsSubsystems() {
		if (itsSubsystems == null) {
			itsSubsystems = new EObjectContainmentEList<MainSubsystem>(MainSubsystem.class, this, WTSpec4MPackage.WT__ITS_SUBSYSTEMS);
		}
		return itsSubsystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemInput> getItsInputs() {
		if (itsInputs == null) {
			itsInputs = new EObjectContainmentEList<SystemInput>(SystemInput.class, this, WTSpec4MPackage.WT__ITS_INPUTS);
		}
		return itsInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemOutput> getItsOutputs() {
		if (itsOutputs == null) {
			itsOutputs = new EObjectContainmentEList<SystemOutput>(SystemOutput.class, this, WTSpec4MPackage.WT__ITS_OUTPUTS);
		}
		return itsOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemParam> getItsParams() {
		if (itsParams == null) {
			itsParams = new EObjectContainmentEList<SystemParam>(SystemParam.class, this, WTSpec4MPackage.WT__ITS_PARAMS);
		}
		return itsParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemTimer> getItsTimers() {
		if (itsTimers == null) {
			itsTimers = new EObjectContainmentEList<SystemTimer>(SystemTimer.class, this, WTSpec4MPackage.WT__ITS_TIMERS);
		}
		return itsTimers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFault> getItsFaults() {
		if (itsFaults == null) {
			itsFaults = new EObjectContainmentEList<SystemFault>(SystemFault.class, this, WTSpec4MPackage.WT__ITS_FAULTS);
		}
		return itsFaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemVariable> getItsVariables() {
		if (itsVariables == null) {
			itsVariables = new EObjectContainmentEList<SystemVariable>(SystemVariable.class, this, WTSpec4MPackage.WT__ITS_VARIABLES);
		}
		return itsVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WTSpec4MPackage.WT__ITS_SUBSYSTEMS:
				return ((InternalEList<?>)getItsSubsystems()).basicRemove(otherEnd, msgs);
			case WTSpec4MPackage.WT__ITS_INPUTS:
				return ((InternalEList<?>)getItsInputs()).basicRemove(otherEnd, msgs);
			case WTSpec4MPackage.WT__ITS_OUTPUTS:
				return ((InternalEList<?>)getItsOutputs()).basicRemove(otherEnd, msgs);
			case WTSpec4MPackage.WT__ITS_PARAMS:
				return ((InternalEList<?>)getItsParams()).basicRemove(otherEnd, msgs);
			case WTSpec4MPackage.WT__ITS_TIMERS:
				return ((InternalEList<?>)getItsTimers()).basicRemove(otherEnd, msgs);
			case WTSpec4MPackage.WT__ITS_FAULTS:
				return ((InternalEList<?>)getItsFaults()).basicRemove(otherEnd, msgs);
			case WTSpec4MPackage.WT__ITS_VARIABLES:
				return ((InternalEList<?>)getItsVariables()).basicRemove(otherEnd, msgs);
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
			case WTSpec4MPackage.WT__SYS_ID:
				return getSysId();
			case WTSpec4MPackage.WT__MODEL:
				return getModel();
			case WTSpec4MPackage.WT__VERSION:
				return getVersion();
			case WTSpec4MPackage.WT__ITS_SUBSYSTEMS:
				return getItsSubsystems();
			case WTSpec4MPackage.WT__ITS_INPUTS:
				return getItsInputs();
			case WTSpec4MPackage.WT__ITS_OUTPUTS:
				return getItsOutputs();
			case WTSpec4MPackage.WT__ITS_PARAMS:
				return getItsParams();
			case WTSpec4MPackage.WT__ITS_TIMERS:
				return getItsTimers();
			case WTSpec4MPackage.WT__ITS_FAULTS:
				return getItsFaults();
			case WTSpec4MPackage.WT__ITS_VARIABLES:
				return getItsVariables();
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
			case WTSpec4MPackage.WT__SYS_ID:
				setSysId((String)newValue);
				return;
			case WTSpec4MPackage.WT__MODEL:
				setModel((String)newValue);
				return;
			case WTSpec4MPackage.WT__VERSION:
				setVersion((String)newValue);
				return;
			case WTSpec4MPackage.WT__ITS_SUBSYSTEMS:
				getItsSubsystems().clear();
				getItsSubsystems().addAll((Collection<? extends MainSubsystem>)newValue);
				return;
			case WTSpec4MPackage.WT__ITS_INPUTS:
				getItsInputs().clear();
				getItsInputs().addAll((Collection<? extends SystemInput>)newValue);
				return;
			case WTSpec4MPackage.WT__ITS_OUTPUTS:
				getItsOutputs().clear();
				getItsOutputs().addAll((Collection<? extends SystemOutput>)newValue);
				return;
			case WTSpec4MPackage.WT__ITS_PARAMS:
				getItsParams().clear();
				getItsParams().addAll((Collection<? extends SystemParam>)newValue);
				return;
			case WTSpec4MPackage.WT__ITS_TIMERS:
				getItsTimers().clear();
				getItsTimers().addAll((Collection<? extends SystemTimer>)newValue);
				return;
			case WTSpec4MPackage.WT__ITS_FAULTS:
				getItsFaults().clear();
				getItsFaults().addAll((Collection<? extends SystemFault>)newValue);
				return;
			case WTSpec4MPackage.WT__ITS_VARIABLES:
				getItsVariables().clear();
				getItsVariables().addAll((Collection<? extends SystemVariable>)newValue);
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
			case WTSpec4MPackage.WT__SYS_ID:
				setSysId(SYS_ID_EDEFAULT);
				return;
			case WTSpec4MPackage.WT__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case WTSpec4MPackage.WT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case WTSpec4MPackage.WT__ITS_SUBSYSTEMS:
				getItsSubsystems().clear();
				return;
			case WTSpec4MPackage.WT__ITS_INPUTS:
				getItsInputs().clear();
				return;
			case WTSpec4MPackage.WT__ITS_OUTPUTS:
				getItsOutputs().clear();
				return;
			case WTSpec4MPackage.WT__ITS_PARAMS:
				getItsParams().clear();
				return;
			case WTSpec4MPackage.WT__ITS_TIMERS:
				getItsTimers().clear();
				return;
			case WTSpec4MPackage.WT__ITS_FAULTS:
				getItsFaults().clear();
				return;
			case WTSpec4MPackage.WT__ITS_VARIABLES:
				getItsVariables().clear();
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
			case WTSpec4MPackage.WT__SYS_ID:
				return SYS_ID_EDEFAULT == null ? sysId != null : !SYS_ID_EDEFAULT.equals(sysId);
			case WTSpec4MPackage.WT__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case WTSpec4MPackage.WT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case WTSpec4MPackage.WT__ITS_SUBSYSTEMS:
				return itsSubsystems != null && !itsSubsystems.isEmpty();
			case WTSpec4MPackage.WT__ITS_INPUTS:
				return itsInputs != null && !itsInputs.isEmpty();
			case WTSpec4MPackage.WT__ITS_OUTPUTS:
				return itsOutputs != null && !itsOutputs.isEmpty();
			case WTSpec4MPackage.WT__ITS_PARAMS:
				return itsParams != null && !itsParams.isEmpty();
			case WTSpec4MPackage.WT__ITS_TIMERS:
				return itsTimers != null && !itsTimers.isEmpty();
			case WTSpec4MPackage.WT__ITS_FAULTS:
				return itsFaults != null && !itsFaults.isEmpty();
			case WTSpec4MPackage.WT__ITS_VARIABLES:
				return itsVariables != null && !itsVariables.isEmpty();
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
		result.append(", model: ");
		result.append(model);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //WTImpl
