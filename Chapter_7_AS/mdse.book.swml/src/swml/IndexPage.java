/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.IndexPage#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.SwmlPackage#getIndexPage()
 * @model
 * @generated
 */
public interface IndexPage extends DynamicPage
{
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
   * @see swml.SwmlPackage#getIndexPage_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link swml.IndexPage#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

} // IndexPage
