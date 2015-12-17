/**
 */
package WTSpec4M50M.impl;

import WTSpec4M50M.CtrlUnit126;
import WTSpec4M50M.WTCInput;
import WTSpec4M50M.WTCOutput;
import WTSpec4M50M.WTCParam;
import WTSpec4M50M.WTSpec4M50MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit126</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit126Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit126Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit126Impl#getOutput__oOutput1 <em>Output oOutput1</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit126Impl#getOutput__oOutput2 <em>Output oOutput2</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit126Impl#getParameter__pParam1 <em>Parameter pParam1</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit126Impl#getParameter__pParam2 <em>Parameter pParam2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtrlUnit126Impl extends wtcImpl implements CtrlUnit126 {
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
     * The cached value of the '{@link #getOutput__oOutput2() <em>Output oOutput2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput__oOutput2()
     * @generated
     * @ordered
     */
    protected WTCOutput output__oOutput2;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CtrlUnit126Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WTSpec4M50MPackage.Literals.CTRL_UNIT126;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT2, oldOutput__oOutput2, output__oOutput2));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT2, oldOutput__oOutput2, output__oOutput2));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT1:
                if (resolve) return getInput__iInput1();
                return basicGetInput__iInput1();
            case WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT2:
                if (resolve) return getInput__iInput2();
                return basicGetInput__iInput2();
            case WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT1:
                if (resolve) return getOutput__oOutput1();
                return basicGetOutput__oOutput1();
            case WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT2:
                if (resolve) return getOutput__oOutput2();
                return basicGetOutput__oOutput2();
            case WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM1:
                if (resolve) return getParameter__pParam1();
                return basicGetParameter__pParam1();
            case WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM2:
                if (resolve) return getParameter__pParam2();
                return basicGetParameter__pParam2();
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
            case WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT1:
                setInput__iInput1((WTCInput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT2:
                setInput__iInput2((WTCInput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT1:
                setOutput__oOutput1((WTCOutput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT2:
                setOutput__oOutput2((WTCOutput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM1:
                setParameter__pParam1((WTCParam)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM2:
                setParameter__pParam2((WTCParam)newValue);
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
            case WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT1:
                setInput__iInput1((WTCInput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT2:
                setInput__iInput2((WTCInput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT1:
                setOutput__oOutput1((WTCOutput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT2:
                setOutput__oOutput2((WTCOutput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM1:
                setParameter__pParam1((WTCParam)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM2:
                setParameter__pParam2((WTCParam)null);
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
            case WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT1:
                return input__iInput1 != null;
            case WTSpec4M50MPackage.CTRL_UNIT126__INPUT_IINPUT2:
                return input__iInput2 != null;
            case WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT1:
                return output__oOutput1 != null;
            case WTSpec4M50MPackage.CTRL_UNIT126__OUTPUT_OOUTPUT2:
                return output__oOutput2 != null;
            case WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM1:
                return parameter__pParam1 != null;
            case WTSpec4M50MPackage.CTRL_UNIT126__PARAMETER_PPARAM2:
                return parameter__pParam2 != null;
        }
        return super.eIsSet(featureID);
    }

} //CtrlUnit126Impl
