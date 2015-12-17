/**
 */
package WTSpec4M50M;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit50</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M50M.CtrlUnit50#getOutput__oOutput1 <em>Output oOutput1</em>}</li>
 *   <li>{@link WTSpec4M50M.CtrlUnit50#getFault__fFault1 <em>Fault fFault1</em>}</li>
 * </ul>
 *
 * @see WTSpec4M50M.WTSpec4M50MPackage#getCtrlUnit50()
 * @model
 * @generated
 */
public interface CtrlUnit50 extends wtc {
    /**
     * Returns the value of the '<em><b>Output oOutput1</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output oOutput1</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output oOutput1</em>' reference.
     * @see #setOutput__oOutput1(WTCOutput)
     * @see WTSpec4M50M.WTSpec4M50MPackage#getCtrlUnit50_Output__oOutput1()
     * @model
     * @generated
     */
    WTCOutput getOutput__oOutput1();

    /**
     * Sets the value of the '{@link WTSpec4M50M.CtrlUnit50#getOutput__oOutput1 <em>Output oOutput1</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output oOutput1</em>' reference.
     * @see #getOutput__oOutput1()
     * @generated
     */
    void setOutput__oOutput1(WTCOutput value);

    /**
     * Returns the value of the '<em><b>Fault fFault1</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fault fFault1</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fault fFault1</em>' reference.
     * @see #setFault__fFault1(WTCFault)
     * @see WTSpec4M50M.WTSpec4M50MPackage#getCtrlUnit50_Fault__fFault1()
     * @model
     * @generated
     */
    WTCFault getFault__fFault1();

    /**
     * Sets the value of the '{@link WTSpec4M50M.CtrlUnit50#getFault__fFault1 <em>Fault fFault1</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fault fFault1</em>' reference.
     * @see #getFault__fFault1()
     * @generated
     */
    void setFault__fFault1(WTCFault value);

} // CtrlUnit50
