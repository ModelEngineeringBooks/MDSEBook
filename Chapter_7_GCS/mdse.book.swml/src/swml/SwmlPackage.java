/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see swml.SwmlFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface SwmlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "swml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mdse-book.org/swml/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "swml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SwmlPackage eINSTANCE = swml.impl.SwmlPackageImpl.init();

  /**
   * The meta object id for the '{@link swml.impl.WebModelImpl <em>Web Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.WebModelImpl
   * @see swml.impl.SwmlPackageImpl#getWebModel()
   * @generated
   */
  int WEB_MODEL = 0;

  /**
   * The feature id for the '<em><b>Hypertext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__HYPERTEXT = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__CONTENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__NAME = 2;

  /**
   * The number of structural features of the '<em>Web Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link swml.impl.HypertextLayerImpl <em>Hypertext Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.HypertextLayerImpl
   * @see swml.impl.SwmlPackageImpl#getHypertextLayer()
   * @generated
   */
  int HYPERTEXT_LAYER = 1;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERTEXT_LAYER__PAGES = 0;

  /**
   * The feature id for the '<em><b>Home Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERTEXT_LAYER__HOME_PAGE = 1;

  /**
   * The number of structural features of the '<em>Hypertext Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERTEXT_LAYER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link swml.impl.ContentLayerImpl <em>Content Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.ContentLayerImpl
   * @see swml.impl.SwmlPackageImpl#getContentLayer()
   * @generated
   */
  int CONTENT_LAYER = 2;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_LAYER__CLASSES = 0;

  /**
   * The number of structural features of the '<em>Content Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_LAYER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link swml.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.ClassImpl
   * @see swml.impl.SwmlPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ATTRIBUTES = 0;

  /**
   * The feature id for the '<em><b>Representative Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__REPRESENTATIVE_ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 2;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link swml.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.AttributeImpl
   * @see swml.impl.SwmlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link swml.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.PageImpl
   * @see swml.impl.SwmlPackageImpl#getPage()
   * @generated
   */
  int PAGE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__LINKS = 1;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link swml.impl.DynamicPageImpl <em>Dynamic Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.DynamicPageImpl
   * @see swml.impl.SwmlPackageImpl#getDynamicPage()
   * @generated
   */
  int DYNAMIC_PAGE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE__NAME = PAGE__NAME;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE__LINKS = PAGE__LINKS;

  /**
   * The feature id for the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE__DISPLAYED_CLASS = PAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dynamic Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link swml.impl.IndexPageImpl <em>Index Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.IndexPageImpl
   * @see swml.impl.SwmlPackageImpl#getIndexPage()
   * @generated
   */
  int INDEX_PAGE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__NAME = DYNAMIC_PAGE__NAME;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__LINKS = DYNAMIC_PAGE__LINKS;

  /**
   * The feature id for the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__DISPLAYED_CLASS = DYNAMIC_PAGE__DISPLAYED_CLASS;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__SIZE = DYNAMIC_PAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Index Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE_FEATURE_COUNT = DYNAMIC_PAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link swml.impl.DetailsPageImpl <em>Details Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.DetailsPageImpl
   * @see swml.impl.SwmlPackageImpl#getDetailsPage()
   * @generated
   */
  int DETAILS_PAGE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_PAGE__NAME = DYNAMIC_PAGE__NAME;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_PAGE__LINKS = DYNAMIC_PAGE__LINKS;

  /**
   * The feature id for the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_PAGE__DISPLAYED_CLASS = DYNAMIC_PAGE__DISPLAYED_CLASS;

  /**
   * The number of structural features of the '<em>Details Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_PAGE_FEATURE_COUNT = DYNAMIC_PAGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link swml.impl.StaticPageImpl <em>Static Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.StaticPageImpl
   * @see swml.impl.SwmlPackageImpl#getStaticPage()
   * @generated
   */
  int STATIC_PAGE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PAGE__NAME = PAGE__NAME;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PAGE__LINKS = PAGE__LINKS;

  /**
   * The number of structural features of the '<em>Static Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link swml.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.LinkImpl
   * @see swml.impl.SwmlPackageImpl#getLink()
   * @generated
   */
  int LINK = 10;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__TARGET = 0;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link swml.impl.NCLinkImpl <em>NC Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.NCLinkImpl
   * @see swml.impl.SwmlPackageImpl#getNCLink()
   * @generated
   */
  int NC_LINK = 11;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NC_LINK__TARGET = LINK__TARGET;

  /**
   * The number of structural features of the '<em>NC Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NC_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link swml.impl.CLinkImpl <em>CLink</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.impl.CLinkImpl
   * @see swml.impl.SwmlPackageImpl#getCLink()
   * @generated
   */
  int CLINK = 12;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINK__TARGET = LINK__TARGET;

  /**
   * The number of structural features of the '<em>CLink</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link swml.SWMLTypes <em>SWML Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see swml.SWMLTypes
   * @see swml.impl.SwmlPackageImpl#getSWMLTypes()
   * @generated
   */
  int SWML_TYPES = 13;


  /**
   * Returns the meta object for class '{@link swml.WebModel <em>Web Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Model</em>'.
   * @see swml.WebModel
   * @generated
   */
  EClass getWebModel();

  /**
   * Returns the meta object for the containment reference '{@link swml.WebModel#getHypertext <em>Hypertext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hypertext</em>'.
   * @see swml.WebModel#getHypertext()
   * @see #getWebModel()
   * @generated
   */
  EReference getWebModel_Hypertext();

  /**
   * Returns the meta object for the containment reference '{@link swml.WebModel#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see swml.WebModel#getContent()
   * @see #getWebModel()
   * @generated
   */
  EReference getWebModel_Content();

  /**
   * Returns the meta object for the attribute '{@link swml.WebModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see swml.WebModel#getName()
   * @see #getWebModel()
   * @generated
   */
  EAttribute getWebModel_Name();

  /**
   * Returns the meta object for class '{@link swml.HypertextLayer <em>Hypertext Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hypertext Layer</em>'.
   * @see swml.HypertextLayer
   * @generated
   */
  EClass getHypertextLayer();

  /**
   * Returns the meta object for the containment reference list '{@link swml.HypertextLayer#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see swml.HypertextLayer#getPages()
   * @see #getHypertextLayer()
   * @generated
   */
  EReference getHypertextLayer_Pages();

  /**
   * Returns the meta object for the reference '{@link swml.HypertextLayer#getHomePage <em>Home Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Home Page</em>'.
   * @see swml.HypertextLayer#getHomePage()
   * @see #getHypertextLayer()
   * @generated
   */
  EReference getHypertextLayer_HomePage();

  /**
   * Returns the meta object for class '{@link swml.ContentLayer <em>Content Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Layer</em>'.
   * @see swml.ContentLayer
   * @generated
   */
  EClass getContentLayer();

  /**
   * Returns the meta object for the containment reference list '{@link swml.ContentLayer#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see swml.ContentLayer#getClasses()
   * @see #getContentLayer()
   * @generated
   */
  EReference getContentLayer_Classes();

  /**
   * Returns the meta object for class '{@link swml.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see swml.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference list '{@link swml.Class#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see swml.Class#getAttributes()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Attributes();

  /**
   * Returns the meta object for the reference '{@link swml.Class#getRepresentativeAttribute <em>Representative Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Representative Attribute</em>'.
   * @see swml.Class#getRepresentativeAttribute()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_RepresentativeAttribute();

  /**
   * Returns the meta object for the attribute '{@link swml.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see swml.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for class '{@link swml.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see swml.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link swml.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see swml.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link swml.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see swml.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for class '{@link swml.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see swml.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link swml.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see swml.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link swml.Page#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see swml.Page#getLinks()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Links();

  /**
   * Returns the meta object for class '{@link swml.IndexPage <em>Index Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Index Page</em>'.
   * @see swml.IndexPage
   * @generated
   */
  EClass getIndexPage();

  /**
   * Returns the meta object for the attribute '{@link swml.IndexPage#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see swml.IndexPage#getSize()
   * @see #getIndexPage()
   * @generated
   */
  EAttribute getIndexPage_Size();

  /**
   * Returns the meta object for class '{@link swml.DetailsPage <em>Details Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Details Page</em>'.
   * @see swml.DetailsPage
   * @generated
   */
  EClass getDetailsPage();

  /**
   * Returns the meta object for class '{@link swml.DynamicPage <em>Dynamic Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Page</em>'.
   * @see swml.DynamicPage
   * @generated
   */
  EClass getDynamicPage();

  /**
   * Returns the meta object for the reference '{@link swml.DynamicPage#getDisplayedClass <em>Displayed Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Displayed Class</em>'.
   * @see swml.DynamicPage#getDisplayedClass()
   * @see #getDynamicPage()
   * @generated
   */
  EReference getDynamicPage_DisplayedClass();

  /**
   * Returns the meta object for class '{@link swml.StaticPage <em>Static Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Page</em>'.
   * @see swml.StaticPage
   * @generated
   */
  EClass getStaticPage();

  /**
   * Returns the meta object for class '{@link swml.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see swml.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the reference '{@link swml.Link#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see swml.Link#getTarget()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Target();

  /**
   * Returns the meta object for class '{@link swml.NCLink <em>NC Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NC Link</em>'.
   * @see swml.NCLink
   * @generated
   */
  EClass getNCLink();

  /**
   * Returns the meta object for class '{@link swml.CLink <em>CLink</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CLink</em>'.
   * @see swml.CLink
   * @generated
   */
  EClass getCLink();

  /**
   * Returns the meta object for enum '{@link swml.SWMLTypes <em>SWML Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>SWML Types</em>'.
   * @see swml.SWMLTypes
   * @generated
   */
  EEnum getSWMLTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SwmlFactory getSwmlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link swml.impl.WebModelImpl <em>Web Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.WebModelImpl
     * @see swml.impl.SwmlPackageImpl#getWebModel()
     * @generated
     */
    EClass WEB_MODEL = eINSTANCE.getWebModel();

    /**
     * The meta object literal for the '<em><b>Hypertext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_MODEL__HYPERTEXT = eINSTANCE.getWebModel_Hypertext();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_MODEL__CONTENT = eINSTANCE.getWebModel_Content();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODEL__NAME = eINSTANCE.getWebModel_Name();

    /**
     * The meta object literal for the '{@link swml.impl.HypertextLayerImpl <em>Hypertext Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.HypertextLayerImpl
     * @see swml.impl.SwmlPackageImpl#getHypertextLayer()
     * @generated
     */
    EClass HYPERTEXT_LAYER = eINSTANCE.getHypertextLayer();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPERTEXT_LAYER__PAGES = eINSTANCE.getHypertextLayer_Pages();

    /**
     * The meta object literal for the '<em><b>Home Page</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPERTEXT_LAYER__HOME_PAGE = eINSTANCE.getHypertextLayer_HomePage();

    /**
     * The meta object literal for the '{@link swml.impl.ContentLayerImpl <em>Content Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.ContentLayerImpl
     * @see swml.impl.SwmlPackageImpl#getContentLayer()
     * @generated
     */
    EClass CONTENT_LAYER = eINSTANCE.getContentLayer();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_LAYER__CLASSES = eINSTANCE.getContentLayer_Classes();

    /**
     * The meta object literal for the '{@link swml.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.ClassImpl
     * @see swml.impl.SwmlPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

    /**
     * The meta object literal for the '<em><b>Representative Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__REPRESENTATIVE_ATTRIBUTE = eINSTANCE.getClass_RepresentativeAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '{@link swml.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.AttributeImpl
     * @see swml.impl.SwmlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link swml.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.PageImpl
     * @see swml.impl.SwmlPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__LINKS = eINSTANCE.getPage_Links();

    /**
     * The meta object literal for the '{@link swml.impl.IndexPageImpl <em>Index Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.IndexPageImpl
     * @see swml.impl.SwmlPackageImpl#getIndexPage()
     * @generated
     */
    EClass INDEX_PAGE = eINSTANCE.getIndexPage();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEX_PAGE__SIZE = eINSTANCE.getIndexPage_Size();

    /**
     * The meta object literal for the '{@link swml.impl.DetailsPageImpl <em>Details Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.DetailsPageImpl
     * @see swml.impl.SwmlPackageImpl#getDetailsPage()
     * @generated
     */
    EClass DETAILS_PAGE = eINSTANCE.getDetailsPage();

    /**
     * The meta object literal for the '{@link swml.impl.DynamicPageImpl <em>Dynamic Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.DynamicPageImpl
     * @see swml.impl.SwmlPackageImpl#getDynamicPage()
     * @generated
     */
    EClass DYNAMIC_PAGE = eINSTANCE.getDynamicPage();

    /**
     * The meta object literal for the '<em><b>Displayed Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_PAGE__DISPLAYED_CLASS = eINSTANCE.getDynamicPage_DisplayedClass();

    /**
     * The meta object literal for the '{@link swml.impl.StaticPageImpl <em>Static Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.StaticPageImpl
     * @see swml.impl.SwmlPackageImpl#getStaticPage()
     * @generated
     */
    EClass STATIC_PAGE = eINSTANCE.getStaticPage();

    /**
     * The meta object literal for the '{@link swml.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.LinkImpl
     * @see swml.impl.SwmlPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__TARGET = eINSTANCE.getLink_Target();

    /**
     * The meta object literal for the '{@link swml.impl.NCLinkImpl <em>NC Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.NCLinkImpl
     * @see swml.impl.SwmlPackageImpl#getNCLink()
     * @generated
     */
    EClass NC_LINK = eINSTANCE.getNCLink();

    /**
     * The meta object literal for the '{@link swml.impl.CLinkImpl <em>CLink</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.impl.CLinkImpl
     * @see swml.impl.SwmlPackageImpl#getCLink()
     * @generated
     */
    EClass CLINK = eINSTANCE.getCLink();

    /**
     * The meta object literal for the '{@link swml.SWMLTypes <em>SWML Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see swml.SWMLTypes
     * @see swml.impl.SwmlPackageImpl#getSWMLTypes()
     * @generated
     */
    EEnum SWML_TYPES = eINSTANCE.getSWMLTypes();

  }

} //SwmlPackage
