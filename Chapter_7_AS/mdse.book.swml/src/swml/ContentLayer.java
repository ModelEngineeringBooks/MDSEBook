/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swml.ContentLayer#getClasses <em>Classes</em>}</li>
 *   <li>{@link swml.ContentLayer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see swml.SwmlPackage#getContentLayer()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface ContentLayer extends EObject
{
  /**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link swml.Class}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see swml.SwmlPackage#getContentLayer_Classes()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
  EList<swml.Class> getClasses();

		/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see swml.SwmlPackage#getContentLayer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

		/**
	 * Sets the value of the '{@link swml.ContentLayer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ContentLayer
