/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML.impl;

import mdse.book.sWML.IndexPage;
import mdse.book.sWML.SWMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdse.book.sWML.impl.IndexPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdse.book.sWML.impl.IndexPageImpl#getDisplayedClass <em>Displayed Class</em>}</li>
 *   <li>{@link mdse.book.sWML.impl.IndexPageImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexPageImpl extends MinimalEObjectImpl.Container implements IndexPage
{
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
   * The cached value of the '{@link #getDisplayedClass() <em>Displayed Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayedClass()
   * @generated
   * @ordered
   */
  protected mdse.book.sWML.Class displayedClass;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndexPageImpl()
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
    return SWMLPackage.Literals.INDEX_PAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SWMLPackage.INDEX_PAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mdse.book.sWML.Class getDisplayedClass()
  {
    if (displayedClass != null && displayedClass.eIsProxy())
    {
      InternalEObject oldDisplayedClass = (InternalEObject)displayedClass;
      displayedClass = (mdse.book.sWML.Class)eResolveProxy(oldDisplayedClass);
      if (displayedClass != oldDisplayedClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SWMLPackage.INDEX_PAGE__DISPLAYED_CLASS, oldDisplayedClass, displayedClass));
      }
    }
    return displayedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mdse.book.sWML.Class basicGetDisplayedClass()
  {
    return displayedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayedClass(mdse.book.sWML.Class newDisplayedClass)
  {
    mdse.book.sWML.Class oldDisplayedClass = displayedClass;
    displayedClass = newDisplayedClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWMLPackage.INDEX_PAGE__DISPLAYED_CLASS, oldDisplayedClass, displayedClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWMLPackage.INDEX_PAGE__SIZE, oldSize, size));
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
      case SWMLPackage.INDEX_PAGE__NAME:
        return getName();
      case SWMLPackage.INDEX_PAGE__DISPLAYED_CLASS:
        if (resolve) return getDisplayedClass();
        return basicGetDisplayedClass();
      case SWMLPackage.INDEX_PAGE__SIZE:
        return getSize();
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
      case SWMLPackage.INDEX_PAGE__NAME:
        setName((String)newValue);
        return;
      case SWMLPackage.INDEX_PAGE__DISPLAYED_CLASS:
        setDisplayedClass((mdse.book.sWML.Class)newValue);
        return;
      case SWMLPackage.INDEX_PAGE__SIZE:
        setSize((Integer)newValue);
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
      case SWMLPackage.INDEX_PAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SWMLPackage.INDEX_PAGE__DISPLAYED_CLASS:
        setDisplayedClass((mdse.book.sWML.Class)null);
        return;
      case SWMLPackage.INDEX_PAGE__SIZE:
        setSize(SIZE_EDEFAULT);
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
      case SWMLPackage.INDEX_PAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SWMLPackage.INDEX_PAGE__DISPLAYED_CLASS:
        return displayedClass != null;
      case SWMLPackage.INDEX_PAGE__SIZE:
        return size != SIZE_EDEFAULT;
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
    result.append(", size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //IndexPageImpl
