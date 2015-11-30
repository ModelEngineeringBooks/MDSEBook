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
 * A representation of the model object '<em><b>Hypertext Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdse.book.sWML.HypertextLayer#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdse.book.sWML.SWMLPackage#getHypertextLayer()
 * @model
 * @generated
 */
public interface HypertextLayer extends EObject
{
  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
   * The list contents are of type {@link mdse.book.sWML.IndexPage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference list.
   * @see mdse.book.sWML.SWMLPackage#getHypertextLayer_Pages()
   * @model containment="true"
   * @generated
   */
  EList<IndexPage> getPages();

} // HypertextLayer
