/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import swml.Attribute;
import swml.CLink;
import swml.ContentLayer;
import swml.DetailsPage;
import swml.DynamicPage;
import swml.HypertextLayer;
import swml.IndexPage;
import swml.Link;
import swml.NCLink;
import swml.Page;
import swml.StaticPage;
import swml.SwmlPackage;
import swml.WebModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see swml.SwmlPackage
 * @generated
 */
public class SwmlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SwmlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwmlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SwmlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SwmlPackage.WEB_MODEL:
      {
        WebModel webModel = (WebModel)theEObject;
        T result = caseWebModel(webModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.HYPERTEXT_LAYER:
      {
        HypertextLayer hypertextLayer = (HypertextLayer)theEObject;
        T result = caseHypertextLayer(hypertextLayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.CONTENT_LAYER:
      {
        ContentLayer contentLayer = (ContentLayer)theEObject;
        T result = caseContentLayer(contentLayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.CLASS:
      {
        swml.Class class_ = (swml.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.PAGE:
      {
        Page page = (Page)theEObject;
        T result = casePage(page);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.INDEX_PAGE:
      {
        IndexPage indexPage = (IndexPage)theEObject;
        T result = caseIndexPage(indexPage);
        if (result == null) result = caseDynamicPage(indexPage);
        if (result == null) result = casePage(indexPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.DETAILS_PAGE:
      {
        DetailsPage detailsPage = (DetailsPage)theEObject;
        T result = caseDetailsPage(detailsPage);
        if (result == null) result = caseDynamicPage(detailsPage);
        if (result == null) result = casePage(detailsPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.DYNAMIC_PAGE:
      {
        DynamicPage dynamicPage = (DynamicPage)theEObject;
        T result = caseDynamicPage(dynamicPage);
        if (result == null) result = casePage(dynamicPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.STATIC_PAGE:
      {
        StaticPage staticPage = (StaticPage)theEObject;
        T result = caseStaticPage(staticPage);
        if (result == null) result = casePage(staticPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.NC_LINK:
      {
        NCLink ncLink = (NCLink)theEObject;
        T result = caseNCLink(ncLink);
        if (result == null) result = caseLink(ncLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwmlPackage.CLINK:
      {
        CLink cLink = (CLink)theEObject;
        T result = caseCLink(cLink);
        if (result == null) result = caseLink(cLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebModel(WebModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hypertext Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hypertext Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHypertextLayer(HypertextLayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentLayer(ContentLayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(swml.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePage(Page object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Index Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Index Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexPage(IndexPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Details Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Details Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDetailsPage(DetailsPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicPage(DynamicPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticPage(StaticPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NC Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NC Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNCLink(NCLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CLink</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CLink</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCLink(CLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SwmlSwitch
