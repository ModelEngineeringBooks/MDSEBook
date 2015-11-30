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
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.Page#getName <em>Name</em>}</li>
 *   <li>{@link swml.Page#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.SwmlPackage#getPage()
 * @model abstract="true"
 *        annotation="gmf.node label='name' figure='rounded'"
 * @generated
 */
public interface Page extends EObject
{
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
   * @see swml.SwmlPackage#getPage_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link swml.Page#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link swml.Link}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see swml.SwmlPackage#getPage_Links()
   * @model containment="true"
   * @generated
   */
  EList<Link> getLinks();

} // Page
