/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mdse.book.sWML.IndexPage#getName <em>Name</em>}</li>
 *   <li>{@link mdse.book.sWML.IndexPage#getDisplayedClass <em>Displayed Class</em>}</li>
 *   <li>{@link mdse.book.sWML.IndexPage#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see mdse.book.sWML.SWMLPackage#getIndexPage()
 * @model
 * @generated
 */
public interface IndexPage extends EObject
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
   * @see mdse.book.sWML.SWMLPackage#getIndexPage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdse.book.sWML.IndexPage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displayed Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Displayed Class</em>' reference.
   * @see #setDisplayedClass(mdse.book.sWML.Class)
   * @see mdse.book.sWML.SWMLPackage#getIndexPage_DisplayedClass()
   * @model
   * @generated
   */
  mdse.book.sWML.Class getDisplayedClass();

  /**
   * Sets the value of the '{@link mdse.book.sWML.IndexPage#getDisplayedClass <em>Displayed Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Displayed Class</em>' reference.
   * @see #getDisplayedClass()
   * @generated
   */
  void setDisplayedClass(mdse.book.sWML.Class value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see mdse.book.sWML.SWMLPackage#getIndexPage_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link mdse.book.sWML.IndexPage#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

} // IndexPage
