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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link swml.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link swml.Class#getRepresentativeAttribute <em>Representative Attribute</em>}</li>
 *   <li>{@link swml.Class#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see swml.SwmlPackage#getClass_()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface Class extends EObject
{
  /**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link swml.Attribute}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see swml.SwmlPackage#getClass_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
  EList<Attribute> getAttributes();

  /**
	 * Returns the value of the '<em><b>Representative Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Representative Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Representative Attribute</em>' reference.
	 * @see #setRepresentativeAttribute(Attribute)
	 * @see swml.SwmlPackage#getClass_RepresentativeAttribute()
	 * @model required="true"
	 * @generated
	 */
  Attribute getRepresentativeAttribute();

  /**
	 * Sets the value of the '{@link swml.Class#getRepresentativeAttribute <em>Representative Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representative Attribute</em>' reference.
	 * @see #getRepresentativeAttribute()
	 * @generated
	 */
  void setRepresentativeAttribute(Attribute value);

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
	 * @see swml.SwmlPackage#getClass_Name()
	 * @model required="true"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link swml.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // Class
