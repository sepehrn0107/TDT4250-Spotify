/**
 */
package ecoreA1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Package
 * @generated
 */
public interface EcoreA1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreA1Factory eINSTANCE = ecoreA1.impl.EcoreA1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bike Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bike Listing</em>'.
	 * @generated
	 */
	BikeListing createBikeListing();

	/**
	 * Returns a new object of class '<em>Clothes Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clothes Listing</em>'.
	 * @generated
	 */
	ClothesListing createClothesListing();

	/**
	 * Returns a new object of class '<em>Finn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finn</em>'.
	 * @generated
	 */
	Finn createFinn();

	/**
	 * Returns a new object of class '<em>Sport Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sport Listing</em>'.
	 * @generated
	 */
	SportListing createSportListing();

	/**
	 * Returns a new object of class '<em>Pet Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pet Listing</em>'.
	 * @generated
	 */
	PetListing createPetListing();

	/**
	 * Returns a new object of class '<em>Camera Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Listing</em>'.
	 * @generated
	 */
	CameraListing createCameraListing();

	/**
	 * Returns a new object of class '<em>Phone Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phone Listing</em>'.
	 * @generated
	 */
	PhoneListing createPhoneListing();

	/**
	 * Returns a new object of class '<em>Private User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private User</em>'.
	 * @generated
	 */
	PrivateUser createPrivateUser();

	/**
	 * Returns a new object of class '<em>Company User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Company User</em>'.
	 * @generated
	 */
	CompanyUser createCompanyUser();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcoreA1Package getEcoreA1Package();

} //EcoreA1Factory
