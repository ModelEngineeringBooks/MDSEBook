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
 * <ul>
 *   <li>{@link swml.ContentLayer#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.SwmlPackage#getContentLayer()
 * @model annotation="gmf.node label='Content' figure='rectangle'"
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
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<swml.Class> getClasses();

} // ContentLayer
