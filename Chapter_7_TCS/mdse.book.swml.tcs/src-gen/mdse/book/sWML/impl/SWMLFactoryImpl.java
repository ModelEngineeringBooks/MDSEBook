/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML.impl;

import mdse.book.sWML.Attribute;
import mdse.book.sWML.ContentLayer;
import mdse.book.sWML.HypertextLayer;
import mdse.book.sWML.IndexPage;
import mdse.book.sWML.SWMLFactory;
import mdse.book.sWML.SWMLPackage;
import mdse.book.sWML.SWMLTypes;
import mdse.book.sWML.WebModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SWMLFactoryImpl extends EFactoryImpl implements SWMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SWMLFactory init()
  {
    try
    {
      SWMLFactory theSWMLFactory = (SWMLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mdse-book.org/SWML"); 
      if (theSWMLFactory != null)
      {
        return theSWMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SWMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SWMLPackage.WEB_MODEL: return createWebModel();
      case SWMLPackage.HYPERTEXT_LAYER: return createHypertextLayer();
      case SWMLPackage.INDEX_PAGE: return createIndexPage();
      case SWMLPackage.CONTENT_LAYER: return createContentLayer();
      case SWMLPackage.CLASS: return createClass();
      case SWMLPackage.ATTRIBUTE: return createAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SWMLPackage.SWML_TYPES:
        return createSWMLTypesFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SWMLPackage.SWML_TYPES:
        return convertSWMLTypesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebModel createWebModel()
  {
    WebModelImpl webModel = new WebModelImpl();
    return webModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HypertextLayer createHypertextLayer()
  {
    HypertextLayerImpl hypertextLayer = new HypertextLayerImpl();
    return hypertextLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexPage createIndexPage()
  {
    IndexPageImpl indexPage = new IndexPageImpl();
    return indexPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentLayer createContentLayer()
  {
    ContentLayerImpl contentLayer = new ContentLayerImpl();
    return contentLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mdse.book.sWML.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWMLTypes createSWMLTypesFromString(EDataType eDataType, String initialValue)
  {
    SWMLTypes result = SWMLTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSWMLTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWMLPackage getSWMLPackage()
  {
    return (SWMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SWMLPackage getPackage()
  {
    return SWMLPackage.eINSTANCE;
  }

} //SWMLFactoryImpl
