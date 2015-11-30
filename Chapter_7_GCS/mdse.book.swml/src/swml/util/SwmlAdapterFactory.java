/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see swml.SwmlPackage
 * @generated
 */
public class SwmlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SwmlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwmlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SwmlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwmlSwitch<Adapter> modelSwitch =
    new SwmlSwitch<Adapter>()
    {
      @Override
      public Adapter caseWebModel(WebModel object)
      {
        return createWebModelAdapter();
      }
      @Override
      public Adapter caseHypertextLayer(HypertextLayer object)
      {
        return createHypertextLayerAdapter();
      }
      @Override
      public Adapter caseContentLayer(ContentLayer object)
      {
        return createContentLayerAdapter();
      }
      @Override
      public Adapter caseClass(swml.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter casePage(Page object)
      {
        return createPageAdapter();
      }
      @Override
      public Adapter caseIndexPage(IndexPage object)
      {
        return createIndexPageAdapter();
      }
      @Override
      public Adapter caseDetailsPage(DetailsPage object)
      {
        return createDetailsPageAdapter();
      }
      @Override
      public Adapter caseDynamicPage(DynamicPage object)
      {
        return createDynamicPageAdapter();
      }
      @Override
      public Adapter caseStaticPage(StaticPage object)
      {
        return createStaticPageAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseNCLink(NCLink object)
      {
        return createNCLinkAdapter();
      }
      @Override
      public Adapter caseCLink(CLink object)
      {
        return createCLinkAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link swml.WebModel <em>Web Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.WebModel
   * @generated
   */
  public Adapter createWebModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.HypertextLayer <em>Hypertext Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.HypertextLayer
   * @generated
   */
  public Adapter createHypertextLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.ContentLayer <em>Content Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.ContentLayer
   * @generated
   */
  public Adapter createContentLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.Page
   * @generated
   */
  public Adapter createPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.IndexPage <em>Index Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.IndexPage
   * @generated
   */
  public Adapter createIndexPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.DetailsPage <em>Details Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.DetailsPage
   * @generated
   */
  public Adapter createDetailsPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.DynamicPage <em>Dynamic Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.DynamicPage
   * @generated
   */
  public Adapter createDynamicPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.StaticPage <em>Static Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.StaticPage
   * @generated
   */
  public Adapter createStaticPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.NCLink <em>NC Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.NCLink
   * @generated
   */
  public Adapter createNCLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link swml.CLink <em>CLink</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see swml.CLink
   * @generated
   */
  public Adapter createCLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SwmlAdapterFactory
