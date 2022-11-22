/**
 */
package ecoreA1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pet Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Package#getPetType()
 * @model
 * @generated
 */
public enum PetType implements Enumerator {
	/**
	 * The '<em><b>Dog</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOG_VALUE
	 * @generated
	 * @ordered
	 */
	DOG(0, "Dog", "Dog"),

	/**
	 * The '<em><b>Cat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAT_VALUE
	 * @generated
	 * @ordered
	 */
	CAT(1, "Cat", "Cat"),

	/**
	 * The '<em><b>Bird</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRD_VALUE
	 * @generated
	 * @ordered
	 */
	BIRD(2, "Bird", "Bird"),

	/**
	 * The '<em><b>Rodent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RODENT_VALUE
	 * @generated
	 * @ordered
	 */
	RODENT(3, "Rodent", "Rodent");

	/**
	 * The '<em><b>Dog</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOG
	 * @model name="Dog"
	 * @generated
	 * @ordered
	 */
	public static final int DOG_VALUE = 0;

	/**
	 * The '<em><b>Cat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAT
	 * @model name="Cat"
	 * @generated
	 * @ordered
	 */
	public static final int CAT_VALUE = 1;

	/**
	 * The '<em><b>Bird</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRD
	 * @model name="Bird"
	 * @generated
	 * @ordered
	 */
	public static final int BIRD_VALUE = 2;

	/**
	 * The '<em><b>Rodent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RODENT
	 * @model name="Rodent"
	 * @generated
	 * @ordered
	 */
	public static final int RODENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Pet Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PetType[] VALUES_ARRAY = new PetType[] { DOG, CAT, BIRD, RODENT, };

	/**
	 * A public read-only list of all the '<em><b>Pet Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PetType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pet Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PetType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PetType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pet Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PetType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PetType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pet Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PetType get(int value) {
		switch (value) {
		case DOG_VALUE:
			return DOG;
		case CAT_VALUE:
			return CAT;
		case BIRD_VALUE:
			return BIRD;
		case RODENT_VALUE:
			return RODENT;
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
	private PetType(int value, String name, String literal) {
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

} //PetType
