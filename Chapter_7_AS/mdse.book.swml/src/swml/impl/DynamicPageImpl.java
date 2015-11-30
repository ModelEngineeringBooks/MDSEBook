/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import swml.DynamicPage;
import swml.SwmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.DynamicPageImpl#getDisplayedClass <em>Displayed Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DynamicPageImpl extends PageImpl implements DynamicPage
{
  /**
   * The cached value of the '{@link #getDisplayedClass() <em>Displayed Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayedClass()
   * @generated
   * @ordered
   */
  protected swml.Class displayedClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicPageImpl()
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
    return SwmlPackage.Literals.DYNAMIC_PAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public swml.Class getDisplayedClass()
  {
    if (displayedClass != null && displayedClass.eIsProxy())
    {
      InternalEObject oldDisplayedClass = (InternalEObject)displayedClass;
      displayedClass = (swml.Class)eResolveProxy(oldDisplayedClass);
      if (displayedClass != oldDisplayedClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwmlPackage.DYNAMIC_PAGE__DISPLAYED_CLASS, oldDisplayedClass, displayedClass));
      }
    }
    return displayedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public swml.Class basicGetDisplayedClass()
  {
    return displayedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayedClass(swml.Class newDisplayedClass)
  {
    swml.Class oldDisplayedClass = displayedClass;
    displayedClass = newDisplayedClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwmlPackage.DYNAMIC_PAGE__DISPLAYED_CLASS, oldDisplayedClass, displayedClass));
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
      case SwmlPackage.DYNAMIC_PAGE__DISPLAYED_CLASS:
        if (resolve) return getDisplayedClass();
        return basicGetDisplayedClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwmlPackage.DYNAMIC_PAGE__DISPLAYED_CLASS:
        setDisplayedClass((swml.Class)newValue);
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
      case SwmlPackage.DYNAMIC_PAGE__DISPLAYED_CLASS:
        setDisplayedClass((swml.Class)null);
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
      case SwmlPackage.DYNAMIC_PAGE__DISPLAYED_CLASS:
        return displayedClass != null;
    }
    return super.eIsSet(featureID);
  }

} //DynamicPageImpl
