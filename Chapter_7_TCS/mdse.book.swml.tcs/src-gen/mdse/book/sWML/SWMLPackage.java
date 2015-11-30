/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML;

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
 * @see mdse.book.sWML.SWMLFactory
 * @model kind="package"
 * @generated
 */
public interface SWMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sWML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mdse-book.org/SWML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sWML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SWMLPackage eINSTANCE = mdse.book.sWML.impl.SWMLPackageImpl.init();

  /**
   * The meta object id for the '{@link mdse.book.sWML.impl.WebModelImpl <em>Web Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdse.book.sWML.impl.WebModelImpl
   * @see mdse.book.sWML.impl.SWMLPackageImpl#getWebModel()
   * @generated
   */
  int WEB_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Hypertext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__HYPERTEXT = 1;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__CONTENT = 2;

  /**
   * The number of structural features of the '<em>Web Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mdse.book.sWML.impl.HypertextLayerImpl <em>Hypertext Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdse.book.sWML.impl.HypertextLayerImpl
   * @see mdse.book.sWML.impl.SWMLPackageImpl#getHypertextLayer()
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
   * The number of structural features of the '<em>Hypertext Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERTEXT_LAYER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link mdse.book.sWML.impl.IndexPageImpl <em>Index Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdse.book.sWML.impl.IndexPageImpl
   * @see mdse.book.sWML.impl.SWMLPackageImpl#getIndexPage()
   * @generated
   */
  int INDEX_PAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__DISPLAYED_CLASS = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__SIZE = 2;

  /**
   * The number of structural features of the '<em>Index Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mdse.book.sWML.impl.ContentLayerImpl <em>Content Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdse.book.sWML.impl.ContentLayerImpl
   * @see mdse.book.sWML.impl.SWMLPackageImpl#getContentLayer()
   * @generated
   */
  int CONTENT_LAYER = 3;

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
   * The meta object id for the '{@link mdse.book.sWML.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdse.book.sWML.impl.ClassImpl
   * @see mdse.book.sWML.impl.SWMLPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mdse.book.sWML.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdse.book.sWML.impl.AttributeImpl
   * @see mdse.book.sWML.impl.SWMLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

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
   * The meta object id for the '{@link mdse.book.sWML.SWMLTypes <em>Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdse.book.sWML.SWMLTypes
   * @see mdse.book.sWML.impl.SWMLPackageImpl#getSWMLTypes()
   * @generated
   */
  int SWML_TYPES = 6;


  /**
   * Returns the meta object for class '{@link mdse.book.sWML.WebModel <em>Web Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Model</em>'.
   * @see mdse.book.sWML.WebModel
   * @generated
   */
  EClass getWebModel();

  /**
   * Returns the meta object for the attribute '{@link mdse.book.sWML.WebModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdse.book.sWML.WebModel#getName()
   * @see #getWebModel()
   * @generated
   */
  EAttribute getWebModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link mdse.book.sWML.WebModel#getHypertext <em>Hypertext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hypertext</em>'.
   * @see mdse.book.sWML.WebModel#getHypertext()
   * @see #getWebModel()
   * @generated
   */
  EReference getWebModel_Hypertext();

  /**
   * Returns the meta object for the containment reference '{@link mdse.book.sWML.WebModel#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see mdse.book.sWML.WebModel#getContent()
   * @see #getWebModel()
   * @generated
   */
  EReference getWebModel_Content();

  /**
   * Returns the meta object for class '{@link mdse.book.sWML.HypertextLayer <em>Hypertext Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hypertext Layer</em>'.
   * @see mdse.book.sWML.HypertextLayer
   * @generated
   */
  EClass getHypertextLayer();

  /**
   * Returns the meta object for the containment reference list '{@link mdse.book.sWML.HypertextLayer#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see mdse.book.sWML.HypertextLayer#getPages()
   * @see #getHypertextLayer()
   * @generated
   */
  EReference getHypertextLayer_Pages();

  /**
   * Returns the meta object for class '{@link mdse.book.sWML.IndexPage <em>Index Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Index Page</em>'.
   * @see mdse.book.sWML.IndexPage
   * @generated
   */
  EClass getIndexPage();

  /**
   * Returns the meta object for the attribute '{@link mdse.book.sWML.IndexPage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdse.book.sWML.IndexPage#getName()
   * @see #getIndexPage()
   * @generated
   */
  EAttribute getIndexPage_Name();

  /**
   * Returns the meta object for the reference '{@link mdse.book.sWML.IndexPage#getDisplayedClass <em>Displayed Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Displayed Class</em>'.
   * @see mdse.book.sWML.IndexPage#getDisplayedClass()
   * @see #getIndexPage()
   * @generated
   */
  EReference getIndexPage_DisplayedClass();

  /**
   * Returns the meta object for the attribute '{@link mdse.book.sWML.IndexPage#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see mdse.book.sWML.IndexPage#getSize()
   * @see #getIndexPage()
   * @generated
   */
  EAttribute getIndexPage_Size();

  /**
   * Returns the meta object for class '{@link mdse.book.sWML.ContentLayer <em>Content Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Layer</em>'.
   * @see mdse.book.sWML.ContentLayer
   * @generated
   */
  EClass getContentLayer();

  /**
   * Returns the meta object for the containment reference list '{@link mdse.book.sWML.ContentLayer#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see mdse.book.sWML.ContentLayer#getClasses()
   * @see #getContentLayer()
   * @generated
   */
  EReference getContentLayer_Classes();

  /**
   * Returns the meta object for class '{@link mdse.book.sWML.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see mdse.book.sWML.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link mdse.book.sWML.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdse.book.sWML.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link mdse.book.sWML.Class#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see mdse.book.sWML.Class#getAttributes()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Attributes();

  /**
   * Returns the meta object for class '{@link mdse.book.sWML.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see mdse.book.sWML.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link mdse.book.sWML.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdse.book.sWML.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link mdse.book.sWML.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see mdse.book.sWML.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for enum '{@link mdse.book.sWML.SWMLTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Types</em>'.
   * @see mdse.book.sWML.SWMLTypes
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
  SWMLFactory getSWMLFactory();

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
     * The meta object literal for the '{@link mdse.book.sWML.impl.WebModelImpl <em>Web Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdse.book.sWML.impl.WebModelImpl
     * @see mdse.book.sWML.impl.SWMLPackageImpl#getWebModel()
     * @generated
     */
    EClass WEB_MODEL = eINSTANCE.getWebModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODEL__NAME = eINSTANCE.getWebModel_Name();

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
     * The meta object literal for the '{@link mdse.book.sWML.impl.HypertextLayerImpl <em>Hypertext Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdse.book.sWML.impl.HypertextLayerImpl
     * @see mdse.book.sWML.impl.SWMLPackageImpl#getHypertextLayer()
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
     * The meta object literal for the '{@link mdse.book.sWML.impl.IndexPageImpl <em>Index Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdse.book.sWML.impl.IndexPageImpl
     * @see mdse.book.sWML.impl.SWMLPackageImpl#getIndexPage()
     * @generated
     */
    EClass INDEX_PAGE = eINSTANCE.getIndexPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEX_PAGE__NAME = eINSTANCE.getIndexPage_Name();

    /**
     * The meta object literal for the '<em><b>Displayed Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDEX_PAGE__DISPLAYED_CLASS = eINSTANCE.getIndexPage_DisplayedClass();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEX_PAGE__SIZE = eINSTANCE.getIndexPage_Size();

    /**
     * The meta object literal for the '{@link mdse.book.sWML.impl.ContentLayerImpl <em>Content Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdse.book.sWML.impl.ContentLayerImpl
     * @see mdse.book.sWML.impl.SWMLPackageImpl#getContentLayer()
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
     * The meta object literal for the '{@link mdse.book.sWML.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdse.book.sWML.impl.ClassImpl
     * @see mdse.book.sWML.impl.SWMLPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

    /**
     * The meta object literal for the '{@link mdse.book.sWML.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdse.book.sWML.impl.AttributeImpl
     * @see mdse.book.sWML.impl.SWMLPackageImpl#getAttribute()
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
     * The meta object literal for the '{@link mdse.book.sWML.SWMLTypes <em>Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdse.book.sWML.SWMLTypes
     * @see mdse.book.sWML.impl.SWMLPackageImpl#getSWMLTypes()
     * @generated
     */
    EEnum SWML_TYPES = eINSTANCE.getSWMLTypes();

  }

} //SWMLPackage
