/**
 */
package WTSpec4M50M;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M50M.SystemVariable#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link WTSpec4M50M.SystemVariable#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see WTSpec4M50M.WTSpec4M50MPackage#getSystemVariable()
 * @model
 * @generated
 */
public interface SystemVariable extends WTCInput, WTCOutput {
    /**
     * Returns the value of the '<em><b>Sys Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sys Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sys Id</em>' attribute.
     * @see #setSysId(String)
     * @see WTSpec4M50M.WTSpec4M50MPackage#getSystemVariable_SysId()
     * @model
     * @generated
     */
    String getSysId();

    /**
     * Sets the value of the '{@link WTSpec4M50M.SystemVariable#getSysId <em>Sys Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sys Id</em>' attribute.
     * @see #getSysId()
     * @generated
     */
    void setSysId(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see WTSpec4M50M.WTSpec4M50MPackage#getSystemVariable_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link WTSpec4M50M.SystemVariable#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // SystemVariable
