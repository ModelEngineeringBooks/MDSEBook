/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdse.book.sWML.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link mdse.book.sWML.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdse.book.sWML.SWMLPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
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
   * @see mdse.book.sWML.SWMLPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdse.book.sWML.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link mdse.book.sWML.SWMLTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see mdse.book.sWML.SWMLTypes
   * @see #setType(SWMLTypes)
   * @see mdse.book.sWML.SWMLPackage#getAttribute_Type()
   * @model
   * @generated
   */
  SWMLTypes getType();

  /**
   * Sets the value of the '{@link mdse.book.sWML.Attribute#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see mdse.book.sWML.SWMLTypes
   * @see #getType()
   * @generated
   */
  void setType(SWMLTypes value);

} // Attribute
