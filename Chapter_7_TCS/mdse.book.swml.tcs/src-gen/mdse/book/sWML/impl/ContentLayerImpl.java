/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML.impl;

import java.util.Collection;

import mdse.book.sWML.ContentLayer;
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
 * An implementation of the model object '<em><b>Content Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdse.book.sWML.impl.ContentLayerImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentLayerImpl extends MinimalEObjectImpl.Container implements ContentLayer
{
  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<mdse.book.sWML.Class> classes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentLayerImpl()
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
    return SWMLPackage.Literals.CONTENT_LAYER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<mdse.book.sWML.Class> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<mdse.book.sWML.Class>(mdse.book.sWML.Class.class, this, SWMLPackage.CONTENT_LAYER__CLASSES);
    }
    return classes;
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
      case SWMLPackage.CONTENT_LAYER__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
      case SWMLPackage.CONTENT_LAYER__CLASSES:
        return getClasses();
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
      case SWMLPackage.CONTENT_LAYER__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends mdse.book.sWML.Class>)newValue);
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
      case SWMLPackage.CONTENT_LAYER__CLASSES:
        getClasses().clear();
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
      case SWMLPackage.CONTENT_LAYER__CLASSES:
        return classes != null && !classes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContentLayerImpl
