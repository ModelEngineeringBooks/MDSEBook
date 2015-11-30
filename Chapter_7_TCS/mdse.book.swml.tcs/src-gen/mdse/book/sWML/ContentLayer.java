/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML;

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
 *   <li>{@link mdse.book.sWML.ContentLayer#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdse.book.sWML.SWMLPackage#getContentLayer()
 * @model
 * @generated
 */
public interface ContentLayer extends EObject
{
  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link mdse.book.sWML.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see mdse.book.sWML.SWMLPackage#getContentLayer_Classes()
   * @model containment="true"
   * @generated
   */
  EList<mdse.book.sWML.Class> getClasses();

} // ContentLayer
