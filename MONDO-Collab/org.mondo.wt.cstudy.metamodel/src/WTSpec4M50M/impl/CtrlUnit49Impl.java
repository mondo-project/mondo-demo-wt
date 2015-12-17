/**
 */
package WTSpec4M50M.impl;

import WTSpec4M50M.CtrlUnit49;
import WTSpec4M50M.WTCFault;
import WTSpec4M50M.WTCInput;
import WTSpec4M50M.WTCOutput;
import WTSpec4M50M.WTCParam;
import WTSpec4M50M.WTCTimer;
import WTSpec4M50M.WTSpec4M50MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit49</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getInput__iInput3 <em>Input iInput3</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getInput__iInput4 <em>Input iInput4</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getOutput__oOutput1 <em>Output oOutput1</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getOutput__oOutput2 <em>Output oOutput2</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getParameter__pParam1 <em>Parameter pParam1</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getParameter__pParam2 <em>Parameter pParam2</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getParameter__pParam3 <em>Parameter pParam3</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getParameter__pParam4 <em>Parameter pParam4</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getFault__fFault1 <em>Fault fFault1</em>}</li>
 *   <li>{@link WTSpec4M50M.impl.CtrlUnit49Impl#getTimer__tTimer1 <em>Timer tTimer1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtrlUnit49Impl extends wtcImpl implements CtrlUnit49 {
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
     * The cached value of the '{@link #getInput__iInput3() <em>Input iInput3</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput__iInput3()
     * @generated
     * @ordered
     */
    protected WTCInput input__iInput3;

    /**
     * The cached value of the '{@link #getInput__iInput4() <em>Input iInput4</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput__iInput4()
     * @generated
     * @ordered
     */
    protected WTCInput input__iInput4;

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
     * The cached value of the '{@link #getFault__fFault1() <em>Fault fFault1</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFault__fFault1()
     * @generated
     * @ordered
     */
    protected WTCFault fault__fFault1;

    /**
     * The cached value of the '{@link #getTimer__tTimer1() <em>Timer tTimer1</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimer__tTimer1()
     * @generated
     * @ordered
     */
    protected WTCTimer timer__tTimer1;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CtrlUnit49Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WTSpec4M50MPackage.Literals.CTRL_UNIT49;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WTCInput getInput__iInput3() {
        if (input__iInput3 != null && input__iInput3.eIsProxy()) {
            InternalEObject oldInput__iInput3 = (InternalEObject)input__iInput3;
            input__iInput3 = (WTCInput)eResolveProxy(oldInput__iInput3);
            if (input__iInput3 != oldInput__iInput3) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
            }
        }
        return input__iInput3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WTCInput basicGetInput__iInput3() {
        return input__iInput3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInput__iInput3(WTCInput newInput__iInput3) {
        WTCInput oldInput__iInput3 = input__iInput3;
        input__iInput3 = newInput__iInput3;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WTCInput getInput__iInput4() {
        if (input__iInput4 != null && input__iInput4.eIsProxy()) {
            InternalEObject oldInput__iInput4 = (InternalEObject)input__iInput4;
            input__iInput4 = (WTCInput)eResolveProxy(oldInput__iInput4);
            if (input__iInput4 != oldInput__iInput4) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT4, oldInput__iInput4, input__iInput4));
            }
        }
        return input__iInput4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WTCInput basicGetInput__iInput4() {
        return input__iInput4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInput__iInput4(WTCInput newInput__iInput4) {
        WTCInput oldInput__iInput4 = input__iInput4;
        input__iInput4 = newInput__iInput4;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT4, oldInput__iInput4, input__iInput4));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT1, oldOutput__oOutput1, output__oOutput1));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT2, oldOutput__oOutput2, output__oOutput2));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT2, oldOutput__oOutput2, output__oOutput2));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM3, oldParameter__pParam3, parameter__pParam3));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM3, oldParameter__pParam3, parameter__pParam3));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM4, oldParameter__pParam4, parameter__pParam4));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM4, oldParameter__pParam4, parameter__pParam4));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
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
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WTCTimer getTimer__tTimer1() {
        if (timer__tTimer1 != null && timer__tTimer1.eIsProxy()) {
            InternalEObject oldTimer__tTimer1 = (InternalEObject)timer__tTimer1;
            timer__tTimer1 = (WTCTimer)eResolveProxy(oldTimer__tTimer1);
            if (timer__tTimer1 != oldTimer__tTimer1) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4M50MPackage.CTRL_UNIT49__TIMER_TTIMER1, oldTimer__tTimer1, timer__tTimer1));
            }
        }
        return timer__tTimer1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WTCTimer basicGetTimer__tTimer1() {
        return timer__tTimer1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimer__tTimer1(WTCTimer newTimer__tTimer1) {
        WTCTimer oldTimer__tTimer1 = timer__tTimer1;
        timer__tTimer1 = newTimer__tTimer1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4M50MPackage.CTRL_UNIT49__TIMER_TTIMER1, oldTimer__tTimer1, timer__tTimer1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT1:
                if (resolve) return getInput__iInput1();
                return basicGetInput__iInput1();
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT2:
                if (resolve) return getInput__iInput2();
                return basicGetInput__iInput2();
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT3:
                if (resolve) return getInput__iInput3();
                return basicGetInput__iInput3();
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT4:
                if (resolve) return getInput__iInput4();
                return basicGetInput__iInput4();
            case WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT1:
                if (resolve) return getOutput__oOutput1();
                return basicGetOutput__oOutput1();
            case WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT2:
                if (resolve) return getOutput__oOutput2();
                return basicGetOutput__oOutput2();
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM1:
                if (resolve) return getParameter__pParam1();
                return basicGetParameter__pParam1();
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM2:
                if (resolve) return getParameter__pParam2();
                return basicGetParameter__pParam2();
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM3:
                if (resolve) return getParameter__pParam3();
                return basicGetParameter__pParam3();
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM4:
                if (resolve) return getParameter__pParam4();
                return basicGetParameter__pParam4();
            case WTSpec4M50MPackage.CTRL_UNIT49__FAULT_FFAULT1:
                if (resolve) return getFault__fFault1();
                return basicGetFault__fFault1();
            case WTSpec4M50MPackage.CTRL_UNIT49__TIMER_TTIMER1:
                if (resolve) return getTimer__tTimer1();
                return basicGetTimer__tTimer1();
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
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT1:
                setInput__iInput1((WTCInput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT2:
                setInput__iInput2((WTCInput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT3:
                setInput__iInput3((WTCInput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT4:
                setInput__iInput4((WTCInput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT1:
                setOutput__oOutput1((WTCOutput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT2:
                setOutput__oOutput2((WTCOutput)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM1:
                setParameter__pParam1((WTCParam)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM2:
                setParameter__pParam2((WTCParam)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM3:
                setParameter__pParam3((WTCParam)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM4:
                setParameter__pParam4((WTCParam)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__FAULT_FFAULT1:
                setFault__fFault1((WTCFault)newValue);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__TIMER_TTIMER1:
                setTimer__tTimer1((WTCTimer)newValue);
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
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT1:
                setInput__iInput1((WTCInput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT2:
                setInput__iInput2((WTCInput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT3:
                setInput__iInput3((WTCInput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT4:
                setInput__iInput4((WTCInput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT1:
                setOutput__oOutput1((WTCOutput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT2:
                setOutput__oOutput2((WTCOutput)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM1:
                setParameter__pParam1((WTCParam)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM2:
                setParameter__pParam2((WTCParam)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM3:
                setParameter__pParam3((WTCParam)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM4:
                setParameter__pParam4((WTCParam)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__FAULT_FFAULT1:
                setFault__fFault1((WTCFault)null);
                return;
            case WTSpec4M50MPackage.CTRL_UNIT49__TIMER_TTIMER1:
                setTimer__tTimer1((WTCTimer)null);
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
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT1:
                return input__iInput1 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT2:
                return input__iInput2 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT3:
                return input__iInput3 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__INPUT_IINPUT4:
                return input__iInput4 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT1:
                return output__oOutput1 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__OUTPUT_OOUTPUT2:
                return output__oOutput2 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM1:
                return parameter__pParam1 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM2:
                return parameter__pParam2 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM3:
                return parameter__pParam3 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__PARAMETER_PPARAM4:
                return parameter__pParam4 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__FAULT_FFAULT1:
                return fault__fFault1 != null;
            case WTSpec4M50MPackage.CTRL_UNIT49__TIMER_TTIMER1:
                return timer__tTimer1 != null;
        }
        return super.eIsSet(featureID);
    }

} //CtrlUnit49Impl
