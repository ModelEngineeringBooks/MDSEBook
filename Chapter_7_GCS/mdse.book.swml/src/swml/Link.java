/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link swml.Link#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see swml.SwmlPackage#getLink()
 * @model abstract="true"
 *        annotation="gmf.link target='target' style='solid' target.decoration='filledclosedarrow'"
 * @generated
 */
public interface Link extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Page)
   * @see swml.SwmlPackage#getLink_Target()
   * @model required="true"
   * @generated
   */
  Page getTarget();

  /**
   * Sets the value of the '{@link swml.Link#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Page value);

} // Link
