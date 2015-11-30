/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import swml.Attribute;
import swml.SwmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link swml.impl.ClassImpl#getRepresentativeAttribute <em>Representative Attribute</em>}</li>
 *   <li>{@link swml.impl.ClassImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EObjectImpl implements swml.Class
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getRepresentativeAttribute() <em>Representative Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresentativeAttribute()
   * @generated
   * @ordered
   */
  protected Attribute representativeAttribute;

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
  protected ClassImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SwmlPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, SwmlPackage.CLASS__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getRepresentativeAttribute()
  {
    if (representativeAttribute != null && representativeAttribute.eIsProxy())
    {
      InternalEObject oldRepresentativeAttribute = (InternalEObject)representativeAttribute;
      representativeAttribute = (Attribute)eResolveProxy(oldRepresentativeAttribute);
      if (representativeAttribute != oldRepresentativeAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwmlPackage.CLASS__REPRESENTATIVE_ATTRIBUTE, oldRepresentativeAttribute, representativeAttribute));
      }
    }
    return representativeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetRepresentativeAttribute()
  {
    return representativeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepresentativeAttribute(Attribute newRepresentativeAttribute)
  {
    Attribute oldRepresentativeAttribute = representativeAttribute;
    representativeAttribute = newRepresentativeAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwmlPackage.CLASS__REPRESENTATIVE_ATTRIBUTE, oldRepresentativeAttribute, representativeAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwmlPackage.CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SwmlPackage.CLASS__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SwmlPackage.CLASS__ATTRIBUTES:
        return getAttributes();
      case SwmlPackage.CLASS__REPRESENTATIVE_ATTRIBUTE:
        if (resolve) return getRepresentativeAttribute();
        return basicGetRepresentativeAttribute();
      case SwmlPackage.CLASS__NAME:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwmlPackage.CLASS__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case SwmlPackage.CLASS__REPRESENTATIVE_ATTRIBUTE:
        setRepresentativeAttribute((Attribute)newValue);
        return;
      case SwmlPackage.CLASS__NAME:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SwmlPackage.CLASS__ATTRIBUTES:
        getAttributes().clear();
        return;
      case SwmlPackage.CLASS__REPRESENTATIVE_ATTRIBUTE:
        setRepresentativeAttribute((Attribute)null);
        return;
      case SwmlPackage.CLASS__NAME:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SwmlPackage.CLASS__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case SwmlPackage.CLASS__REPRESENTATIVE_ATTRIBUTE:
        return representativeAttribute != null;
      case SwmlPackage.CLASS__NAME:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ClassImpl
