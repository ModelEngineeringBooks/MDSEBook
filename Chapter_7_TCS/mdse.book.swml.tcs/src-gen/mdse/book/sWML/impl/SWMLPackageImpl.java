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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SWMLPackageImpl extends EPackageImpl implements SWMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass webModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hypertextLayerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexPageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentLayerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum swmlTypesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see mdse.book.sWML.SWMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SWMLPackageImpl()
  {
    super(eNS_URI, SWMLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SWMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SWMLPackage init()
  {
    if (isInited) return (SWMLPackage)EPackage.Registry.INSTANCE.getEPackage(SWMLPackage.eNS_URI);

    // Obtain or create and register package
    SWMLPackageImpl theSWMLPackage = (SWMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SWMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SWMLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSWMLPackage.createPackageContents();

    // Initialize created meta-data
    theSWMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSWMLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SWMLPackage.eNS_URI, theSWMLPackage);
    return theSWMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebModel()
  {
    return webModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModel_Name()
  {
    return (EAttribute)webModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebModel_Hypertext()
  {
    return (EReference)webModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebModel_Content()
  {
    return (EReference)webModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHypertextLayer()
  {
    return hypertextLayerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHypertextLayer_Pages()
  {
    return (EReference)hypertextLayerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexPage()
  {
    return indexPageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexPage_Name()
  {
    return (EAttribute)indexPageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndexPage_DisplayedClass()
  {
    return (EReference)indexPageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexPage_Size()
  {
    return (EAttribute)indexPageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentLayer()
  {
    return contentLayerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContentLayer_Classes()
  {
    return (EReference)contentLayerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Name()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Attributes()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Type()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSWMLTypes()
  {
    return swmlTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWMLFactory getSWMLFactory()
  {
    return (SWMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    webModelEClass = createEClass(WEB_MODEL);
    createEAttribute(webModelEClass, WEB_MODEL__NAME);
    createEReference(webModelEClass, WEB_MODEL__HYPERTEXT);
    createEReference(webModelEClass, WEB_MODEL__CONTENT);

    hypertextLayerEClass = createEClass(HYPERTEXT_LAYER);
    createEReference(hypertextLayerEClass, HYPERTEXT_LAYER__PAGES);

    indexPageEClass = createEClass(INDEX_PAGE);
    createEAttribute(indexPageEClass, INDEX_PAGE__NAME);
    createEReference(indexPageEClass, INDEX_PAGE__DISPLAYED_CLASS);
    createEAttribute(indexPageEClass, INDEX_PAGE__SIZE);

    contentLayerEClass = createEClass(CONTENT_LAYER);
    createEReference(contentLayerEClass, CONTENT_LAYER__CLASSES);

    classEClass = createEClass(CLASS);
    createEAttribute(classEClass, CLASS__NAME);
    createEReference(classEClass, CLASS__ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

    // Create enums
    swmlTypesEEnum = createEEnum(SWML_TYPES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(webModelEClass, WebModel.class, "WebModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWebModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, WebModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebModel_Hypertext(), this.getHypertextLayer(), null, "hypertext", null, 0, 1, WebModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebModel_Content(), this.getContentLayer(), null, "content", null, 0, 1, WebModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hypertextLayerEClass, HypertextLayer.class, "HypertextLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHypertextLayer_Pages(), this.getIndexPage(), null, "pages", null, 0, -1, HypertextLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexPageEClass, IndexPage.class, "IndexPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndexPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, IndexPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndexPage_DisplayedClass(), this.getClass_(), null, "displayedClass", null, 0, 1, IndexPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIndexPage_Size(), ecorePackage.getEInt(), "size", null, 0, 1, IndexPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentLayerEClass, ContentLayer.class, "ContentLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContentLayer_Classes(), this.getClass_(), null, "classes", null, 0, -1, ContentLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classEClass, mdse.book.sWML.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, mdse.book.sWML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, mdse.book.sWML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Type(), this.getSWMLTypes(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(swmlTypesEEnum, SWMLTypes.class, "SWMLTypes");
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.STRING);
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.INTEGER);
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.FLOAT);
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.EMAIL);
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.BOOLEAN);

    // Create resource
    createResource(eNS_URI);
  }

} //SWMLPackageImpl
