/**
 */
package smvcml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smvcml.Controller#getOp <em>Op</em>}</li>
 *   <li>{@link smvcml.Controller#getDao <em>Dao</em>}</li>
 * </ul>
 *
 * @see smvcml.SmvcmlPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends Element {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link smvcml.CtrlOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see smvcml.CtrlOperation
	 * @see #setOp(CtrlOperation)
	 * @see smvcml.SmvcmlPackage#getController_Op()
	 * @model required="true"
	 * @generated
	 */
	CtrlOperation getOp();

	/**
	 * Sets the value of the '{@link smvcml.Controller#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see smvcml.CtrlOperation
	 * @see #getOp()
	 * @generated
	 */
	void setOp(CtrlOperation value);

	/**
	 * Returns the value of the '<em><b>Dao</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dao</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dao</em>' reference.
	 * @see #setDao(DAO)
	 * @see smvcml.SmvcmlPackage#getController_Dao()
	 * @model required="true"
	 * @generated
	 */
	DAO getDao();

	/**
	 * Sets the value of the '{@link smvcml.Controller#getDao <em>Dao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dao</em>' reference.
	 * @see #getDao()
	 * @generated
	 */
	void setDao(DAO value);

} // Controller
