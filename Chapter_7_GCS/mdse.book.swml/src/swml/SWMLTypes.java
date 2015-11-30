/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package swml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SWML Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see swml.SwmlPackage#getSWMLTypes()
 * @model
 * @generated
 */
public enum SWMLTypes implements Enumerator
{
  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(0, "Boolean", "Boolean"),

  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(1, "String", "String"),

  /**
   * The '<em><b>Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(2, "Integer", "Integer"),

  /**
   * The '<em><b>Float</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
  FLOAT(3, "Float", "Float"),

  /**
   * The '<em><b>Email</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMAIL_VALUE
   * @generated
   * @ordered
   */
  EMAIL(4, "Email", "Email");

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model name="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 0;

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="String"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 1;

  /**
   * The '<em><b>Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model name="Integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 2;

  /**
   * The '<em><b>Float</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT
   * @model name="Float"
   * @generated
   * @ordered
   */
  public static final int FLOAT_VALUE = 3;

  /**
   * The '<em><b>Email</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Email</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMAIL
   * @model name="Email"
   * @generated
   * @ordered
   */
  public static final int EMAIL_VALUE = 4;

  /**
   * An array of all the '<em><b>SWML Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SWMLTypes[] VALUES_ARRAY =
    new SWMLTypes[]
    {
      BOOLEAN,
      STRING,
      INTEGER,
      FLOAT,
      EMAIL,
    };

  /**
   * A public read-only list of all the '<em><b>SWML Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SWMLTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>SWML Types</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SWMLTypes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SWMLTypes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SWML Types</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SWMLTypes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SWMLTypes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SWML Types</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SWMLTypes get(int value)
  {
    switch (value)
    {
      case BOOLEAN_VALUE: return BOOLEAN;
      case STRING_VALUE: return STRING;
      case INTEGER_VALUE: return INTEGER;
      case FLOAT_VALUE: return FLOAT;
      case EMAIL_VALUE: return EMAIL;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private SWMLTypes(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //SWMLTypes
