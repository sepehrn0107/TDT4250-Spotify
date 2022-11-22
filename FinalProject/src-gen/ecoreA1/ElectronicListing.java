/**
 */
package ecoreA1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.ElectronicListing#getCondition <em>Condition</em>}</li>
 *   <li>{@link ecoreA1.ElectronicListing#getBrand <em>Brand</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getElectronicListing()
 * @model abstract="true"
 * @generated
 */
public interface ElectronicListing extends Listing {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see ecoreA1.Condition
	 * @see #setCondition(Condition)
	 * @see ecoreA1.EcoreA1Package#getElectronicListing_Condition()
	 * @model required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link ecoreA1.ElectronicListing#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see ecoreA1.Condition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see ecoreA1.EcoreA1Package#getElectronicListing_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link ecoreA1.ElectronicListing#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

} // ElectronicListing
