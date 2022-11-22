/**
 */
package ecoreA1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bike Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.BikeListing#getBikeType <em>Bike Type</em>}</li>
 *   <li>{@link ecoreA1.BikeListing#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getBikeListing()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='pricePositive'"
 * @generated
 */
public interface BikeListing extends Listing {
	/**
	 * Returns the value of the '<em><b>Bike Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.BikeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike Type</em>' attribute.
	 * @see ecoreA1.BikeType
	 * @see #setBikeType(BikeType)
	 * @see ecoreA1.EcoreA1Package#getBikeListing_BikeType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	BikeType getBikeType();

	/**
	 * Sets the value of the '{@link ecoreA1.BikeListing#getBikeType <em>Bike Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike Type</em>' attribute.
	 * @see ecoreA1.BikeType
	 * @see #getBikeType()
	 * @generated
	 */
	void setBikeType(BikeType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see ecoreA1.Condition
	 * @see #setCondition(Condition)
	 * @see ecoreA1.EcoreA1Package#getBikeListing_Condition()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link ecoreA1.BikeListing#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see ecoreA1.Condition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // BikeListing
