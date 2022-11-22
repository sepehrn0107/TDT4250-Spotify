/**
 */
package ecoreA1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pet Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.PetListing#getSpecies <em>Species</em>}</li>
 *   <li>{@link ecoreA1.PetListing#getPetType <em>Pet Type</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getPetListing()
 * @model
 * @generated
 */
public interface PetListing extends Listing {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' attribute.
	 * @see #setSpecies(String)
	 * @see ecoreA1.EcoreA1Package#getPetListing_Species()
	 * @model
	 * @generated
	 */
	String getSpecies();

	/**
	 * Sets the value of the '{@link ecoreA1.PetListing#getSpecies <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' attribute.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(String value);

	/**
	 * Returns the value of the '<em><b>Pet Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.PetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pet Type</em>' attribute.
	 * @see ecoreA1.PetType
	 * @see #setPetType(PetType)
	 * @see ecoreA1.EcoreA1Package#getPetListing_PetType()
	 * @model
	 * @generated
	 */
	PetType getPetType();

	/**
	 * Sets the value of the '{@link ecoreA1.PetListing#getPetType <em>Pet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pet Type</em>' attribute.
	 * @see ecoreA1.PetType
	 * @see #getPetType()
	 * @generated
	 */
	void setPetType(PetType value);

} // PetListing
