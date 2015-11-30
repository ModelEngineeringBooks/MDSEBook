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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdse.book.sWML.Class#getName <em>Name</em>}</li>
 *   <li>{@link mdse.book.sWML.Class#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdse.book.sWML.SWMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
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
   * @see mdse.book.sWML.SWMLPackage#getClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdse.book.sWML.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link mdse.book.sWML.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see mdse.book.sWML.SWMLPackage#getClass_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Class
