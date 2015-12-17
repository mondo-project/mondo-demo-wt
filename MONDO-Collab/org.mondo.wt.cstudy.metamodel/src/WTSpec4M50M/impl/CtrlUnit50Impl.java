/**
 */
package WTSpec4M50M.impl;

import WTSpec4M50M.CtrlUnit50;
import WTSpec4M50M.WTCFault;
import WTSpec4M50M.WTCOutput;
import WTSpec4M50M.WTSpec4M50MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit50</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit50Impl#getOutput__oOutput1 <em>Output oOutput1</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit50Impl#getFault__fFault1 <em>Fault fFault1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtrlUnit50Impl extends wtcImpl implements CtrlUnit50 {
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
    protected CtrlUnit50Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WTSpec4M50MPackage.Literals.CTRL_UNIT50;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT50__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT50__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT50__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT50__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WTSpec4M50MPackage.CTRL_UNIT50__OUTPUT_OOUTPUT1:
                if (resolve) return getOutput__oOutput1();
                return basicGetOutput__oOutput1();
            case WTSpec4M50MPackage.CTRL_UNIT50__FAULT_FFAULT1:
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
            case WTSpec4M50MPackage.CTRL_UNIT50__OUTPUT_OOUTPUT1:
                setOutput__oOutput1((WTCOutput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT50__FAULT_FFAULT1:
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
            case WTSpec4M50MPackage.CTRL_UNIT50__OUTPUT_OOUTPUT1:
                setOutput__oOutput1((WTCOutput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT50__FAULT_FFAULT1:
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
            case WTSpec4M50MPackage.CTRL_UNIT50__OUTPUT_OOUTPUT1:
                return output__oOutput1 != null;
            case WTSpec4M50MPackage.CTRL_UNIT50__FAULT_FFAULT1:
                return fault__fFault1 != null;
        }
        return super.eIsSet(featureID);
    }

} //CtrlUnit50Impl
