/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see swml.SwmlPackage
 * @generated
 */
public interface SwmlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SwmlFactory eINSTANCE = swml.impl.SwmlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Web Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Web Model</em>'.
   * @generated
   */
  WebModel createWebModel();

  /**
   * Returns a new object of class '<em>Hypertext Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hypertext Layer</em>'.
   * @generated
   */
  HypertextLayer createHypertextLayer();

  /**
   * Returns a new object of class '<em>Content Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Layer</em>'.
   * @generated
   */
  ContentLayer createContentLayer();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Index Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Page</em>'.
   * @generated
   */
  IndexPage createIndexPage();

  /**
   * Returns a new object of class '<em>Details Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Details Page</em>'.
   * @generated
   */
  DetailsPage createDetailsPage();

  /**
   * Returns a new object of class '<em>Static Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Page</em>'.
   * @generated
   */
  StaticPage createStaticPage();

  /**
   * Returns a new object of class '<em>NC Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NC Link</em>'.
   * @generated
   */
  NCLink createNCLink();

  /**
   * Returns a new object of class '<em>CLink</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CLink</em>'.
   * @generated
   */
  CLink createCLink();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SwmlPackage getSwmlPackage();

} //SwmlFactory
