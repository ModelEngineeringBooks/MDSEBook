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

import swml.HypertextLayer;
import swml.Page;
import swml.SwmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypertext Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.HypertextLayerImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link swml.impl.HypertextLayerImpl#getHomePage <em>Home Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypertextLayerImpl extends EObjectImpl implements HypertextLayer
{
  /**
   * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPages()
   * @generated
   * @ordered
   */
  protected EList<Page> pages;

  /**
   * The cached value of the '{@link #getHomePage() <em>Home Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHomePage()
   * @generated
   * @ordered
   */
  protected Page homePage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HypertextLayerImpl()
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
    return SwmlPackage.Literals.HYPERTEXT_LAYER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Page> getPages()
  {
    if (pages == null)
    {
      pages = new EObjectContainmentEList<Page>(Page.class, this, SwmlPackage.HYPERTEXT_LAYER__PAGES);
    }
    return pages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page getHomePage()
  {
    if (homePage != null && homePage.eIsProxy())
    {
      InternalEObject oldHomePage = (InternalEObject)homePage;
      homePage = (Page)eResolveProxy(oldHomePage);
      if (homePage != oldHomePage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwmlPackage.HYPERTEXT_LAYER__HOME_PAGE, oldHomePage, homePage));
      }
    }
    return homePage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page basicGetHomePage()
  {
    return homePage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHomePage(Page newHomePage)
  {
    Page oldHomePage = homePage;
    homePage = newHomePage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwmlPackage.HYPERTEXT_LAYER__HOME_PAGE, oldHomePage, homePage));
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
      case SwmlPackage.HYPERTEXT_LAYER__PAGES:
        return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
      case SwmlPackage.HYPERTEXT_LAYER__PAGES:
        return getPages();
      case SwmlPackage.HYPERTEXT_LAYER__HOME_PAGE:
        if (resolve) return getHomePage();
        return basicGetHomePage();
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
      case SwmlPackage.HYPERTEXT_LAYER__PAGES:
        getPages().clear();
        getPages().addAll((Collection<? extends Page>)newValue);
        return;
      case SwmlPackage.HYPERTEXT_LAYER__HOME_PAGE:
        setHomePage((Page)newValue);
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
      case SwmlPackage.HYPERTEXT_LAYER__PAGES:
        getPages().clear();
        return;
      case SwmlPackage.HYPERTEXT_LAYER__HOME_PAGE:
        setHomePage((Page)null);
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
      case SwmlPackage.HYPERTEXT_LAYER__PAGES:
        return pages != null && !pages.isEmpty();
      case SwmlPackage.HYPERTEXT_LAYER__HOME_PAGE:
        return homePage != null;
    }
    return super.eIsSet(featureID);
  }

} //HypertextLayerImpl
