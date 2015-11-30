/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdse.book.sWML.WebModel#getName <em>Name</em>}</li>
 *   <li>{@link mdse.book.sWML.WebModel#getHypertext <em>Hypertext</em>}</li>
 *   <li>{@link mdse.book.sWML.WebModel#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdse.book.sWML.SWMLPackage#getWebModel()
 * @model
 * @generated
 */
public interface WebModel extends EObject
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
   * @see mdse.book.sWML.SWMLPackage#getWebModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdse.book.sWML.WebModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Hypertext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hypertext</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hypertext</em>' containment reference.
   * @see #setHypertext(HypertextLayer)
   * @see mdse.book.sWML.SWMLPackage#getWebModel_Hypertext()
   * @model containment="true"
   * @generated
   */
  HypertextLayer getHypertext();

  /**
   * Sets the value of the '{@link mdse.book.sWML.WebModel#getHypertext <em>Hypertext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hypertext</em>' containment reference.
   * @see #getHypertext()
   * @generated
   */
  void setHypertext(HypertextLayer value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(ContentLayer)
   * @see mdse.book.sWML.SWMLPackage#getWebModel_Content()
   * @model containment="true"
   * @generated
   */
  ContentLayer getContent();

  /**
   * Sets the value of the '{@link mdse.book.sWML.WebModel#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(ContentLayer value);

} // WebModel
