/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import swml.Attribute;
import swml.CLink;
import swml.ContentLayer;
import swml.DetailsPage;
import swml.HypertextLayer;
import swml.IndexPage;
import swml.NCLink;
import swml.SWMLTypes;
import swml.StaticPage;
import swml.SwmlFactory;
import swml.SwmlPackage;
import swml.WebModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwmlFactoryImpl extends EFactoryImpl implements SwmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SwmlFactory init()
  {
    try
    {
      SwmlFactory theSwmlFactory = (SwmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mdse-book.org/swml/"); 
      if (theSwmlFactory != null)
      {
        return theSwmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SwmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwmlFactoryImpl()
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
      case SwmlPackage.WEB_MODEL: return createWebModel();
      case SwmlPackage.HYPERTEXT_LAYER: return createHypertextLayer();
      case SwmlPackage.CONTENT_LAYER: return createContentLayer();
      case SwmlPackage.CLASS: return createClass();
      case SwmlPackage.ATTRIBUTE: return createAttribute();
      case SwmlPackage.INDEX_PAGE: return createIndexPage();
      case SwmlPackage.DETAILS_PAGE: return createDetailsPage();
      case SwmlPackage.STATIC_PAGE: return createStaticPage();
      case SwmlPackage.NC_LINK: return createNCLink();
      case SwmlPackage.CLINK: return createCLink();
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
      case SwmlPackage.SWML_TYPES:
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
      case SwmlPackage.SWML_TYPES:
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
  public swml.Class createClass()
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
  public DetailsPage createDetailsPage()
  {
    DetailsPageImpl detailsPage = new DetailsPageImpl();
    return detailsPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticPage createStaticPage()
  {
    StaticPageImpl staticPage = new StaticPageImpl();
    return staticPage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NCLink createNCLink()
  {
    NCLinkImpl ncLink = new NCLinkImpl();
    return ncLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLink createCLink()
  {
    CLinkImpl cLink = new CLinkImpl();
    return cLink;
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
  public SwmlPackage getSwmlPackage()
  {
    return (SwmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SwmlPackage getPackage()
  {
    return SwmlPackage.eINSTANCE;
  }

} //SwmlFactoryImpl
