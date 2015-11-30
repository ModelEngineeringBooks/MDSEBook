/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML.impl;

import java.util.Collection;

import mdse.book.sWML.HypertextLayer;
import mdse.book.sWML.IndexPage;
import mdse.book.sWML.SWMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hypertext Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdse.book.sWML.impl.HypertextLayerImpl#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HypertextLayerImpl extends MinimalEObjectImpl.Container implements HypertextLayer
{
  /**
   * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPages()
   * @generated
   * @ordered
   */
  protected EList<IndexPage> pages;

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
    return SWMLPackage.Literals.HYPERTEXT_LAYER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IndexPage> getPages()
  {
    if (pages == null)
    {
      pages = new EObjectContainmentEList<IndexPage>(IndexPage.class, this, SWMLPackage.HYPERTEXT_LAYER__PAGES);
    }
    return pages;
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
      case SWMLPackage.HYPERTEXT_LAYER__PAGES:
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
      case SWMLPackage.HYPERTEXT_LAYER__PAGES:
        return getPages();
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
      case SWMLPackage.HYPERTEXT_LAYER__PAGES:
        getPages().clear();
        getPages().addAll((Collection<? extends IndexPage>)newValue);
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
      case SWMLPackage.HYPERTEXT_LAYER__PAGES:
        getPages().clear();
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
      case SWMLPackage.HYPERTEXT_LAYER__PAGES:
        return pages != null && !pages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HypertextLayerImpl
