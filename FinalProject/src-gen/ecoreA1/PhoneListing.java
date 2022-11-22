/**
 */
package ecoreA1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phone Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.PhoneListing#getPhoneType <em>Phone Type</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getPhoneListing()
 * @model
 * @generated
 */
public interface PhoneListing extends ElectronicListing {
	/**
	 * Returns the value of the '<em><b>Phone Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.PhoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Type</em>' attribute.
	 * @see ecoreA1.PhoneType
	 * @see #setPhoneType(PhoneType)
	 * @see ecoreA1.EcoreA1Package#getPhoneListing_PhoneType()
	 * @model required="true"
	 * @generated
	 */
	PhoneType getPhoneType();

	/**
	 * Sets the value of the '{@link ecoreA1.PhoneListing#getPhoneType <em>Phone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Type</em>' attribute.
	 * @see ecoreA1.PhoneType
	 * @see #getPhoneType()
	 * @generated
	 */
	void setPhoneType(PhoneType value);

} // PhoneListing
