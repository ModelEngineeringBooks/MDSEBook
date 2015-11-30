/**
 * <copyright>
 * </copyright>
 *

 */
package mdse.book.sWML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mdse.book.sWML.SWMLPackage
 * @generated
 */
public interface SWMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SWMLFactory eINSTANCE = mdse.book.sWML.impl.SWMLFactoryImpl.init();

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
   * Returns a new object of class '<em>Index Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Page</em>'.
   * @generated
   */
  IndexPage createIndexPage();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SWMLPackage getSWMLPackage();

} //SWMLFactory
