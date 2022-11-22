/**
 */
package ecoreA1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bike Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Package#getBikeType()
 * @model
 * @generated
 */
public enum BikeType implements Enumerator {
	/**
	 * The '<em><b>Terrain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TERRAIN(0, "Terrain", "Terrain"),

	/**
	 * The '<em><b>Hybrid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID_VALUE
	 * @generated
	 * @ordered
	 */
	HYBRID(1, "Hybrid", "Hybrid"),

	/**
	 * The '<em><b>Electric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRIC(2, "Electric", "Electric"),

	/**
	 * The '<em><b>BMX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMX_VALUE
	 * @generated
	 * @ordered
	 */
	BMX(3, "BMX", "BMX");

	/**
	 * The '<em><b>Terrain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERRAIN
	 * @model name="Terrain"
	 * @generated
	 * @ordered
	 */
	public static final int TERRAIN_VALUE = 0;

	/**
	 * The '<em><b>Hybrid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID
	 * @model name="Hybrid"
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID_VALUE = 1;

	/**
	 * The '<em><b>Electric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC
	 * @model name="Electric"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_VALUE = 2;

	/**
	 * The '<em><b>BMX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BMX_VALUE = 3;

	/**
	 * An array of all the '<em><b>Bike Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BikeType[] VALUES_ARRAY = new BikeType[] { TERRAIN, HYBRID, ELECTRIC, BMX, };

	/**
	 * A public read-only list of all the '<em><b>Bike Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BikeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bike Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BikeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BikeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bike Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BikeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BikeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bike Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BikeType get(int value) {
		switch (value) {
		case TERRAIN_VALUE:
			return TERRAIN;
		case HYBRID_VALUE:
			return HYBRID;
		case ELECTRIC_VALUE:
			return ELECTRIC;
		case BMX_VALUE:
			return BMX;
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
	private BikeType(int value, String name, String literal) {
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

} //BikeType
