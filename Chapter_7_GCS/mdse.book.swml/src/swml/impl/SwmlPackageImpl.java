/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import swml.SWMLTypes;
import swml.StaticPage;
import swml.SwmlFactory;
import swml.SwmlPackage;
import swml.WebModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwmlPackageImpl extends EPackageImpl implements SwmlPackage
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
  private EClass pageEClass = null;

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
  private EClass detailsPageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamicPageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticPageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ncLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cLinkEClass = null;

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
   * @see swml.SwmlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SwmlPackageImpl()
  {
    super(eNS_URI, SwmlFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SwmlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SwmlPackage init()
  {
    if (isInited) return (SwmlPackage)EPackage.Registry.INSTANCE.getEPackage(SwmlPackage.eNS_URI);

    // Obtain or create and register package
    SwmlPackageImpl theSwmlPackage = (SwmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SwmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SwmlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSwmlPackage.createPackageContents();

    // Initialize created meta-data
    theSwmlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSwmlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SwmlPackage.eNS_URI, theSwmlPackage);
    return theSwmlPackage;
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
  public EReference getWebModel_Hypertext()
  {
    return (EReference)webModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebModel_Content()
  {
    return (EReference)webModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModel_Name()
  {
    return (EAttribute)webModelEClass.getEStructuralFeatures().get(2);
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
  public EReference getHypertextLayer_HomePage()
  {
    return (EReference)hypertextLayerEClass.getEStructuralFeatures().get(1);
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
  public EReference getClass_Attributes()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_RepresentativeAttribute()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Name()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(2);
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
  public EClass getPage()
  {
    return pageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPage_Name()
  {
    return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPage_Links()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getIndexPage_Size()
  {
    return (EAttribute)indexPageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDetailsPage()
  {
    return detailsPageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicPage()
  {
    return dynamicPageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicPage_DisplayedClass()
  {
    return (EReference)dynamicPageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticPage()
  {
    return staticPageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Target()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNCLink()
  {
    return ncLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCLink()
  {
    return cLinkEClass;
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
  public SwmlFactory getSwmlFactory()
  {
    return (SwmlFactory)getEFactoryInstance();
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
    createEReference(webModelEClass, WEB_MODEL__HYPERTEXT);
    createEReference(webModelEClass, WEB_MODEL__CONTENT);
    createEAttribute(webModelEClass, WEB_MODEL__NAME);

    hypertextLayerEClass = createEClass(HYPERTEXT_LAYER);
    createEReference(hypertextLayerEClass, HYPERTEXT_LAYER__PAGES);
    createEReference(hypertextLayerEClass, HYPERTEXT_LAYER__HOME_PAGE);

    contentLayerEClass = createEClass(CONTENT_LAYER);
    createEReference(contentLayerEClass, CONTENT_LAYER__CLASSES);

    classEClass = createEClass(CLASS);
    createEReference(classEClass, CLASS__ATTRIBUTES);
    createEReference(classEClass, CLASS__REPRESENTATIVE_ATTRIBUTE);
    createEAttribute(classEClass, CLASS__NAME);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

    pageEClass = createEClass(PAGE);
    createEAttribute(pageEClass, PAGE__NAME);
    createEReference(pageEClass, PAGE__LINKS);

    indexPageEClass = createEClass(INDEX_PAGE);
    createEAttribute(indexPageEClass, INDEX_PAGE__SIZE);

    detailsPageEClass = createEClass(DETAILS_PAGE);

    dynamicPageEClass = createEClass(DYNAMIC_PAGE);
    createEReference(dynamicPageEClass, DYNAMIC_PAGE__DISPLAYED_CLASS);

    staticPageEClass = createEClass(STATIC_PAGE);

    linkEClass = createEClass(LINK);
    createEReference(linkEClass, LINK__TARGET);

    ncLinkEClass = createEClass(NC_LINK);

    cLinkEClass = createEClass(CLINK);

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
    indexPageEClass.getESuperTypes().add(this.getDynamicPage());
    detailsPageEClass.getESuperTypes().add(this.getDynamicPage());
    dynamicPageEClass.getESuperTypes().add(this.getPage());
    staticPageEClass.getESuperTypes().add(this.getPage());
    ncLinkEClass.getESuperTypes().add(this.getLink());
    cLinkEClass.getESuperTypes().add(this.getLink());

    // Initialize classes and features; add operations and parameters
    initEClass(webModelEClass, WebModel.class, "WebModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWebModel_Hypertext(), this.getHypertextLayer(), null, "hypertext", null, 1, 1, WebModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebModel_Content(), this.getContentLayer(), null, "content", null, 1, 1, WebModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWebModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, WebModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hypertextLayerEClass, HypertextLayer.class, "HypertextLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHypertextLayer_Pages(), this.getPage(), null, "pages", null, 1, -1, HypertextLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHypertextLayer_HomePage(), this.getPage(), null, "homePage", null, 1, 1, HypertextLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentLayerEClass, ContentLayer.class, "ContentLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContentLayer_Classes(), this.getClass_(), null, "classes", null, 1, -1, ContentLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classEClass, swml.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, swml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_RepresentativeAttribute(), this.getAttribute(), null, "representativeAttribute", null, 1, 1, swml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, swml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Type(), this.getSWMLTypes(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageEClass, Page.class, "Page", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPage_Name(), ecorePackage.getEString(), "name", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPage_Links(), this.getLink(), null, "links", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexPageEClass, IndexPage.class, "IndexPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndexPage_Size(), ecorePackage.getEInt(), "size", null, 0, 1, IndexPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(detailsPageEClass, DetailsPage.class, "DetailsPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dynamicPageEClass, DynamicPage.class, "DynamicPage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDynamicPage_DisplayedClass(), this.getClass_(), null, "displayedClass", null, 1, 1, DynamicPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticPageEClass, StaticPage.class, "StaticPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLink_Target(), this.getPage(), null, "target", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ncLinkEClass, NCLink.class, "NCLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cLinkEClass, CLink.class, "CLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(swmlTypesEEnum, SWMLTypes.class, "SWMLTypes");
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.BOOLEAN);
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.STRING);
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.INTEGER);
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.FLOAT);
    addEEnumLiteral(swmlTypesEEnum, SWMLTypes.EMAIL);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.compartment
    createGmf_2Annotations();
    // gmf.node
    createGmf_3Annotations();
    // gmf.link
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });										
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (webModelEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });									
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.compartment";				
    addAnnotation
      (getWebModel_Hypertext(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getWebModel_Content(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getHypertextLayer_Pages(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getContentLayer_Classes(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.node";						
    addAnnotation
      (hypertextLayerEClass, 
       source, 
       new String[] 
       {
       "label", "Hypertext",
       "figure", "rectangle"
       });			
    addAnnotation
      (contentLayerEClass, 
       source, 
       new String[] 
       {
       "label", "Content",
       "figure", "rectangle"
       });			
    addAnnotation
      (classEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "rectangle"
       });		
    addAnnotation
      (pageEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "rounded"
       });	
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.link";												
    addAnnotation
      (linkEClass, 
       source, 
       new String[] 
       {
       "target", "target",
       "style", "solid",
       "target.decoration", "filledclosedarrow"
       });
  }

} //SwmlPackageImpl
