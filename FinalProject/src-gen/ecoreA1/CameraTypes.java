/**
 */
package ecoreA1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Camera Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Package#getCameraTypes()
 * @model
 * @generated
 */
public enum CameraTypes implements Enumerator {
	/**
	 * The '<em><b>Hybrid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID_VALUE
	 * @generated
	 * @ordered
	 */
	HYBRID(0, "Hybrid", "Hybrid"),

	/**
	 * The '<em><b>Compact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACT(1, "Compact", "Compact"),

	/**
	 * The '<em><b>Lense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENSE_VALUE
	 * @generated
	 * @ordered
	 */
	LENSE(2, "Lense", "Lense");

	/**
	 * The '<em><b>Hybrid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID
	 * @model name="Hybrid"
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID_VALUE = 0;

	/**
	 * The '<em><b>Compact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACT
	 * @model name="Compact"
	 * @generated
	 * @ordered
	 */
	public static final int COMPACT_VALUE = 1;

	/**
	 * The '<em><b>Lense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENSE
	 * @model name="Lense"
	 * @generated
	 * @ordered
	 */
	public static final int LENSE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Camera Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CameraTypes[] VALUES_ARRAY = new CameraTypes[] { HYBRID, COMPACT, LENSE, };

	/**
	 * A public read-only list of all the '<em><b>Camera Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CameraTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Camera Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CameraTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Camera Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CameraTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Camera Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CameraTypes get(int value) {
		switch (value) {
		case HYBRID_VALUE:
			return HYBRID;
		case COMPACT_VALUE:
			return COMPACT;
		case LENSE_VALUE:
			return LENSE;
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
	private CameraTypes(int value, String name, String literal) {
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

} //CameraTypes
