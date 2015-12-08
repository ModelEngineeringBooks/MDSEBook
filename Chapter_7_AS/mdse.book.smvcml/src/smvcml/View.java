/**
 */
package smvcml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smvcml.View#getCtrl <em>Ctrl</em>}</li>
 *   <li>{@link smvcml.View#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see smvcml.SmvcmlPackage#getView()
 * @model
 * @generated
 */
public interface View extends Element {
	/**
	 * Returns the value of the '<em><b>Ctrl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctrl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctrl</em>' reference.
	 * @see #setCtrl(Controller)
	 * @see smvcml.SmvcmlPackage#getView_Ctrl()
	 * @model required="true"
	 * @generated
	 */
	Controller getCtrl();

	/**
	 * Sets the value of the '{@link smvcml.View#getCtrl <em>Ctrl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctrl</em>' reference.
	 * @see #getCtrl()
	 * @generated
	 */
	void setCtrl(Controller value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see smvcml.SmvcmlPackage#getView_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link smvcml.View#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // View
