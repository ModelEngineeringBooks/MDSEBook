/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import swml.ContentLayer;
import swml.HypertextLayer;
import swml.SwmlPackage;
import swml.WebModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link swml.impl.WebModelImpl#getHypertext <em>Hypertext</em>}</li>
 *   <li>{@link swml.impl.WebModelImpl#getContent <em>Content</em>}</li>
 *   <li>{@link swml.impl.WebModelImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebModelImpl extends EObjectImpl implements WebModel
{
  /**
   * The cached value of the '{@link #getHypertext() <em>Hypertext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHypertext()
   * @generated
   * @ordered
   */
  protected HypertextLayer hypertext;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected ContentLayer content;

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
  protected WebModelImpl()
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
    return SwmlPackage.Literals.WEB_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HypertextLayer getHypertext()
  {
    return hypertext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHypertext(HypertextLayer newHypertext, NotificationChain msgs)
  {
    HypertextLayer oldHypertext = hypertext;
    hypertext = newHypertext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwmlPackage.WEB_MODEL__HYPERTEXT, oldHypertext, newHypertext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHypertext(HypertextLayer newHypertext)
  {
    if (newHypertext != hypertext)
    {
      NotificationChain msgs = null;
      if (hypertext != null)
        msgs = ((InternalEObject)hypertext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwmlPackage.WEB_MODEL__HYPERTEXT, null, msgs);
      if (newHypertext != null)
        msgs = ((InternalEObject)newHypertext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwmlPackage.WEB_MODEL__HYPERTEXT, null, msgs);
      msgs = basicSetHypertext(newHypertext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwmlPackage.WEB_MODEL__HYPERTEXT, newHypertext, newHypertext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentLayer getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(ContentLayer newContent, NotificationChain msgs)
  {
    ContentLayer oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwmlPackage.WEB_MODEL__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(ContentLayer newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwmlPackage.WEB_MODEL__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwmlPackage.WEB_MODEL__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwmlPackage.WEB_MODEL__CONTENT, newContent, newContent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SwmlPackage.WEB_MODEL__NAME, oldName, name));
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
      case SwmlPackage.WEB_MODEL__HYPERTEXT:
        return basicSetHypertext(null, msgs);
      case SwmlPackage.WEB_MODEL__CONTENT:
        return basicSetContent(null, msgs);
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
      case SwmlPackage.WEB_MODEL__HYPERTEXT:
        return getHypertext();
      case SwmlPackage.WEB_MODEL__CONTENT:
        return getContent();
      case SwmlPackage.WEB_MODEL__NAME:
        return getName();
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
      case SwmlPackage.WEB_MODEL__HYPERTEXT:
        setHypertext((HypertextLayer)newValue);
        return;
      case SwmlPackage.WEB_MODEL__CONTENT:
        setContent((ContentLayer)newValue);
        return;
      case SwmlPackage.WEB_MODEL__NAME:
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
      case SwmlPackage.WEB_MODEL__HYPERTEXT:
        setHypertext((HypertextLayer)null);
        return;
      case SwmlPackage.WEB_MODEL__CONTENT:
        setContent((ContentLayer)null);
        return;
      case SwmlPackage.WEB_MODEL__NAME:
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
      case SwmlPackage.WEB_MODEL__HYPERTEXT:
        return hypertext != null;
      case SwmlPackage.WEB_MODEL__CONTENT:
        return content != null;
      case SwmlPackage.WEB_MODEL__NAME:
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

} //WebModelImpl
