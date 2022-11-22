/**
 */
package ecoreA1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sport Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.SportListing#getCondition <em>Condition</em>}</li>
 *   <li>{@link ecoreA1.SportListing#getSportType <em>Sport Type</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getSportListing()
 * @model
 * @generated
 */
public interface SportListing extends Listing {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see ecoreA1.Condition
	 * @see #setCondition(Condition)
	 * @see ecoreA1.EcoreA1Package#getSportListing_Condition()
	 * @model required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link ecoreA1.SportListing#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see ecoreA1.Condition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Sport Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.SportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sport Type</em>' attribute.
	 * @see ecoreA1.SportType
	 * @see #setSportType(SportType)
	 * @see ecoreA1.EcoreA1Package#getSportListing_SportType()
	 * @model required="true"
	 * @generated
	 */
	SportType getSportType();

	/**
	 * Sets the value of the '{@link ecoreA1.SportListing#getSportType <em>Sport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sport Type</em>' attribute.
	 * @see ecoreA1.SportType
	 * @see #getSportType()
	 * @generated
	 */
	void setSportType(SportType value);

} // SportListing
