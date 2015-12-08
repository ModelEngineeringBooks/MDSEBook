/**
 */
package smvcml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smvcml.DAO#getClass_ <em>Class</em>}</li>
 *   <li>{@link smvcml.DAO#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see smvcml.SmvcmlPackage#getDAO()
 * @model
 * @generated
 */
public interface DAO extends Element {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(smvcml.Class)
	 * @see smvcml.SmvcmlPackage#getDAO_Class()
	 * @model required="true"
	 * @generated
	 */
	smvcml.Class getClass_();

	/**
	 * Sets the value of the '{@link smvcml.DAO#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(smvcml.Class value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smvcml.SmvcmlPackage#getDAO_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smvcml.DAO#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DAO
