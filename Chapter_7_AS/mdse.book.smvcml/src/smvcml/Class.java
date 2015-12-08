/**
 */
package smvcml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smvcml.Class#getAtts <em>Atts</em>}</li>
 *   <li>{@link smvcml.Class#getOps <em>Ops</em>}</li>
 *   <li>{@link smvcml.Class#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see smvcml.SmvcmlPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Element {
	/**
	 * Returns the value of the '<em><b>Atts</b></em>' containment reference list.
	 * The list contents are of type {@link smvcml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atts</em>' containment reference list.
	 * @see smvcml.SmvcmlPackage#getClass_Atts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAtts();

	/**
	 * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
	 * The list contents are of type {@link smvcml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' containment reference list.
	 * @see smvcml.SmvcmlPackage#getClass_Ops()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOps();

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
	 * @see smvcml.SmvcmlPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smvcml.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Class
