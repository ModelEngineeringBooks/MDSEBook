/**
 */
package smvcml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smvcml.Controller;
import smvcml.CtrlOperation;
import smvcml.DAO;
import smvcml.SmvcmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smvcml.impl.ControllerImpl#getOp <em>Op</em>}</li>
 *   <li>{@link smvcml.impl.ControllerImpl#getDao <em>Dao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends ElementImpl implements Controller {
	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final CtrlOperation OP_EDEFAULT = CtrlOperation.RETRIEVE_ALL;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected CtrlOperation op = OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDao() <em>Dao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDao()
	 * @generated
	 * @ordered
	 */
	protected DAO dao;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmvcmlPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlOperation getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(CtrlOperation newOp) {
		CtrlOperation oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmvcmlPackage.CONTROLLER__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAO getDao() {
		if (dao != null && dao.eIsProxy()) {
			InternalEObject oldDao = (InternalEObject)dao;
			dao = (DAO)eResolveProxy(oldDao);
			if (dao != oldDao) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmvcmlPackage.CONTROLLER__DAO, oldDao, dao));
			}
		}
		return dao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAO basicGetDao() {
		return dao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDao(DAO newDao) {
		DAO oldDao = dao;
		dao = newDao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmvcmlPackage.CONTROLLER__DAO, oldDao, dao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmvcmlPackage.CONTROLLER__OP:
				return getOp();
			case SmvcmlPackage.CONTROLLER__DAO:
				if (resolve) return getDao();
				return basicGetDao();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmvcmlPackage.CONTROLLER__OP:
				setOp((CtrlOperation)newValue);
				return;
			case SmvcmlPackage.CONTROLLER__DAO:
				setDao((DAO)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmvcmlPackage.CONTROLLER__OP:
				setOp(OP_EDEFAULT);
				return;
			case SmvcmlPackage.CONTROLLER__DAO:
				setDao((DAO)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmvcmlPackage.CONTROLLER__OP:
				return op != OP_EDEFAULT;
			case SmvcmlPackage.CONTROLLER__DAO:
				return dao != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
