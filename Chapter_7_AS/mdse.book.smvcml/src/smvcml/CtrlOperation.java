/**
 */
package smvcml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ctrl Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smvcml.SmvcmlPackage#getCtrlOperation()
 * @model
 * @generated
 */
public enum CtrlOperation implements Enumerator {
	/**
	 * The '<em><b>Retrieve All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	RETRIEVE_ALL(0, "retrieveAll", "retrieveAll"),

	/**
	 * The '<em><b>Retrieve One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	RETRIEVE_ONE(1, "retrieveOne", "retrieveOne");

	/**
	 * The '<em><b>Retrieve All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retrieve All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_ALL
	 * @model name="retrieveAll"
	 * @generated
	 * @ordered
	 */
	public static final int RETRIEVE_ALL_VALUE = 0;

	/**
	 * The '<em><b>Retrieve One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retrieve One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_ONE
	 * @model name="retrieveOne"
	 * @generated
	 * @ordered
	 */
	public static final int RETRIEVE_ONE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Ctrl Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CtrlOperation[] VALUES_ARRAY =
		new CtrlOperation[] {
			RETRIEVE_ALL,
			RETRIEVE_ONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Ctrl Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CtrlOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ctrl Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtrlOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtrlOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ctrl Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtrlOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CtrlOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ctrl Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CtrlOperation get(int value) {
		switch (value) {
			case RETRIEVE_ALL_VALUE: return RETRIEVE_ALL;
			case RETRIEVE_ONE_VALUE: return RETRIEVE_ONE;
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
	private CtrlOperation(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CtrlOperation
