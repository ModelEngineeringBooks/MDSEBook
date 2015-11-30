/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML.util;

import mdse.book.sWML.Attribute;
import mdse.book.sWML.ContentLayer;
import mdse.book.sWML.HypertextLayer;
import mdse.book.sWML.IndexPage;
import mdse.book.sWML.SWMLPackage;
import mdse.book.sWML.WebModel;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mdse.book.sWML.SWMLPackage
 * @generated
 */
public class SWMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SWMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SWMLPackage.eINSTANCE;
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
  protected SWMLSwitch<Adapter> modelSwitch =
    new SWMLSwitch<Adapter>()
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
      public Adapter caseIndexPage(IndexPage object)
      {
        return createIndexPageAdapter();
      }
      @Override
      public Adapter caseContentLayer(ContentLayer object)
      {
        return createContentLayerAdapter();
      }
      @Override
      public Adapter caseClass(mdse.book.sWML.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
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
   * Creates a new adapter for an object of class '{@link mdse.book.sWML.WebModel <em>Web Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdse.book.sWML.WebModel
   * @generated
   */
  public Adapter createWebModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdse.book.sWML.HypertextLayer <em>Hypertext Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdse.book.sWML.HypertextLayer
   * @generated
   */
  public Adapter createHypertextLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdse.book.sWML.IndexPage <em>Index Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdse.book.sWML.IndexPage
   * @generated
   */
  public Adapter createIndexPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdse.book.sWML.ContentLayer <em>Content Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdse.book.sWML.ContentLayer
   * @generated
   */
  public Adapter createContentLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdse.book.sWML.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdse.book.sWML.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdse.book.sWML.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdse.book.sWML.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
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

} //SWMLAdapterFactory
