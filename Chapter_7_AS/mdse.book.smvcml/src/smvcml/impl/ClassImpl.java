/**
 */
package smvcml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smvcml.Attribute;
import smvcml.Operation;
import smvcml.SmvcmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smvcml.impl.ClassImpl#getAtts <em>Atts</em>}</li>
 *   <li>{@link smvcml.impl.ClassImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link smvcml.impl.ClassImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ElementImpl implements smvcml.Class {
	/**
	 * The cached value of the '{@link #getAtts() <em>Atts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtts()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> atts;

	/**
	 * The cached value of the '{@link #getOps() <em>Ops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOps()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ops;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmvcmlPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAtts() {
		if (atts == null) {
			atts = new EObjectContainmentEList<Attribute>(Attribute.class, this, SmvcmlPackage.CLASS__ATTS);
		}
		return atts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOps() {
		if (ops == null) {
			ops = new EObjectContainmentEList<Operation>(Operation.class, this, SmvcmlPackage.CLASS__OPS);
		}
		return ops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmvcmlPackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmvcmlPackage.CLASS__ATTS:
				return ((InternalEList<?>)getAtts()).basicRemove(otherEnd, msgs);
			case SmvcmlPackage.CLASS__OPS:
				return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmvcmlPackage.CLASS__ATTS:
				return getAtts();
			case SmvcmlPackage.CLASS__OPS:
				return getOps();
			case SmvcmlPackage.CLASS__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmvcmlPackage.CLASS__ATTS:
				getAtts().clear();
				getAtts().addAll((Collection<? extends Attribute>)newValue);
				return;
			case SmvcmlPackage.CLASS__OPS:
				getOps().clear();
				getOps().addAll((Collection<? extends Operation>)newValue);
				return;
			case SmvcmlPackage.CLASS__NAME:
				setName((String)newValue);
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
			case SmvcmlPackage.CLASS__ATTS:
				getAtts().clear();
				return;
			case SmvcmlPackage.CLASS__OPS:
				getOps().clear();
				return;
			case SmvcmlPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
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
			case SmvcmlPackage.CLASS__ATTS:
				return atts != null && !atts.isEmpty();
			case SmvcmlPackage.CLASS__OPS:
				return ops != null && !ops.isEmpty();
			case SmvcmlPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
