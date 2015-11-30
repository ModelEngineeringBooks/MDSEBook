/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.DynamicPage#getDisplayedClass <em>Displayed Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.SwmlPackage#getDynamicPage()
 * @model abstract="true"
 * @generated
 */
public interface DynamicPage extends Page
{
  /**
   * Returns the value of the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displayed Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Displayed Class</em>' reference.
   * @see #setDisplayedClass(swml.Class)
   * @see swml.SwmlPackage#getDynamicPage_DisplayedClass()
   * @model required="true"
   * @generated
   */
  swml.Class getDisplayedClass();

  /**
   * Sets the value of the '{@link swml.DynamicPage#getDisplayedClass <em>Displayed Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Displayed Class</em>' reference.
   * @see #getDisplayedClass()
   * @generated
   */
  void setDisplayedClass(swml.Class value);

} // DynamicPage
