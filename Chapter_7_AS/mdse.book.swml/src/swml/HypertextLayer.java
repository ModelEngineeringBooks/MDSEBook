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
 * A representation of the model object '<em><b>Hypertext Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swml.HypertextLayer#getPages <em>Pages</em>}</li>
 *   <li>{@link swml.HypertextLayer#getHomePage <em>Home Page</em>}</li>
 *   <li>{@link swml.HypertextLayer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see swml.SwmlPackage#getHypertextLayer()
 * @model annotation="gmf.node figure='rectangle' label='name'"
 * @generated
 */
public interface HypertextLayer extends EObject
{
  /**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link swml.Page}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see swml.SwmlPackage#getHypertextLayer_Pages()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
  EList<Page> getPages();

  /**
	 * Returns the value of the '<em><b>Home Page</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Home Page</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Page</em>' reference.
	 * @see #setHomePage(Page)
	 * @see swml.SwmlPackage#getHypertextLayer_HomePage()
	 * @model required="true"
	 * @generated
	 */
  Page getHomePage();

  /**
	 * Sets the value of the '{@link swml.HypertextLayer#getHomePage <em>Home Page</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Page</em>' reference.
	 * @see #getHomePage()
	 * @generated
	 */
  void setHomePage(Page value);

		/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see swml.SwmlPackage#getHypertextLayer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

		/**
	 * Sets the value of the '{@link swml.HypertextLayer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HypertextLayer
