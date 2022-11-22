/**
 */
package ecoreA1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sport Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Package#getSportType()
 * @model
 * @generated
 */
public enum SportType implements Enumerator {
	/**
	 * The '<em><b>Ball Game</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALL_GAME_VALUE
	 * @generated
	 * @ordered
	 */
	BALL_GAME(0, "BallGame", "BallGame"),

	/**
	 * The '<em><b>Swimming</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIMMING_VALUE
	 * @generated
	 * @ordered
	 */
	SWIMMING(1, "Swimming", "Swimming"),

	/**
	 * The '<em><b>Track</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACK_VALUE
	 * @generated
	 * @ordered
	 */
	TRACK(2, "Track", "Track"),

	/**
	 * The '<em><b>Accessories</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSORIES_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSORIES(3, "Accessories", "Accessories");

	/**
	 * The '<em><b>Ball Game</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALL_GAME
	 * @model name="BallGame"
	 * @generated
	 * @ordered
	 */
	public static final int BALL_GAME_VALUE = 0;

	/**
	 * The '<em><b>Swimming</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIMMING
	 * @model name="Swimming"
	 * @generated
	 * @ordered
	 */
	public static final int SWIMMING_VALUE = 1;

	/**
	 * The '<em><b>Track</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACK
	 * @model name="Track"
	 * @generated
	 * @ordered
	 */
	public static final int TRACK_VALUE = 2;

	/**
	 * The '<em><b>Accessories</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSORIES
	 * @model name="Accessories"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSORIES_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sport Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SportType[] VALUES_ARRAY = new SportType[] { BALL_GAME, SWIMMING, TRACK, ACCESSORIES, };

	/**
	 * A public read-only list of all the '<em><b>Sport Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SportType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sport Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SportType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SportType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sport Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SportType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SportType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sport Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SportType get(int value) {
		switch (value) {
		case BALL_GAME_VALUE:
			return BALL_GAME;
		case SWIMMING_VALUE:
			return SWIMMING;
		case TRACK_VALUE:
			return TRACK;
		case ACCESSORIES_VALUE:
			return ACCESSORIES;
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
	private SportType(int value, String name, String literal) {
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

} //SportType
