/**
 */
package ecoreA1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clothes Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.ClothesListing#getSize <em>Size</em>}</li>
 *   <li>{@link ecoreA1.ClothesListing#getType <em>Type</em>}</li>
 *   <li>{@link ecoreA1.ClothesListing#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getClothesListing()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sizeCorrect'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL sizeCorrect='self.Size.size() &lt; 5'"
 * @generated
 */
public interface ClothesListing extends Listing {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see ecoreA1.EcoreA1Package#getClothesListing_Size()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link ecoreA1.ClothesListing#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.ClothesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ecoreA1.ClothesType
	 * @see #setType(ClothesType)
	 * @see ecoreA1.EcoreA1Package#getClothesListing_Type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ClothesType getType();

	/**
	 * Sets the value of the '{@link ecoreA1.ClothesListing#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ecoreA1.ClothesType
	 * @see #getType()
	 * @generated
	 */
	void setType(ClothesType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see ecoreA1.Condition
	 * @see #setCondition(Condition)
	 * @see ecoreA1.EcoreA1Package#getClothesListing_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link ecoreA1.ClothesListing#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see ecoreA1.Condition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // ClothesListing
