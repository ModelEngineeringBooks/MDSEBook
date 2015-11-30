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
 * <ul>
 *   <li>{@link swml.HypertextLayer#getPages <em>Pages</em>}</li>
 *   <li>{@link swml.HypertextLayer#getHomePage <em>Home Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.SwmlPackage#getHypertextLayer()
 * @model annotation="gmf.node label='Hypertext' figure='rectangle'"
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
   *        annotation="gmf.compartment foo='bar'"
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

} // HypertextLayer
