/**
 */
package WTSpec4M;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Input Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.CollectionInputOutput#getItsInput <em>Its Input</em>}</li>
 *   <li>{@link WTSpec4M.CollectionInputOutput#getItsOutput <em>Its Output</em>}</li>
 *   <li>{@link WTSpec4M.CollectionInputOutput#getSysId <em>Sys Id</em>}</li>
 * </ul>
 *
 * @see WTSpec4M.WTSpec4MPackage#getCollectionInputOutput()
 * @model
 * @generated
 */
public interface CollectionInputOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Its Input</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpec4M.SystemInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Input</em>' containment reference list.
	 * @see WTSpec4M.WTSpec4MPackage#getCollectionInputOutput_ItsInput()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<SystemInput> getItsInput();

	/**
	 * Returns the value of the '<em><b>Its Output</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpec4M.SystemOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Output</em>' containment reference list.
	 * @see WTSpec4M.WTSpec4MPackage#getCollectionInputOutput_ItsOutput()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<SystemOutput> getItsOutput();

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
	 * @see WTSpec4M.WTSpec4MPackage#getCollectionInputOutput_SysId()
	 * @model required="true"
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link WTSpec4M.CollectionInputOutput#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

} // CollectionInputOutput
