/**
 */
package ecoreA1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface EcoreA1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecoreA1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ecoreA1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoreA1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreA1Package eINSTANCE = ecoreA1.impl.EcoreA1PackageImpl.init();

	/**
	 * The meta object id for the '{@link ecoreA1.impl.ListingImpl <em>Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.ListingImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getListing()
	 * @generated
	 */
	int LISTING = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__PRICE = 3;

	/**
	 * The feature id for the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__MODIFIED_AT = 4;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__COORDINATE = 5;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING__USER = 6;

	/**
	 * The number of structural features of the '<em>Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.BikeListingImpl <em>Bike Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.BikeListingImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getBikeListing()
	 * @generated
	 */
	int BIKE_LISTING = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__ID = LISTING__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__TITLE = LISTING__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__DESCRIPTION = LISTING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__PRICE = LISTING__PRICE;

	/**
	 * The feature id for the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__MODIFIED_AT = LISTING__MODIFIED_AT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__COORDINATE = LISTING__COORDINATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__USER = LISTING__USER;

	/**
	 * The feature id for the '<em><b>Bike Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__BIKE_TYPE = LISTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING__CONDITION = LISTING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bike Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING_FEATURE_COUNT = LISTING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bike Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_LISTING_OPERATION_COUNT = LISTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.UserImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 0;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PHONE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Listing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LISTING = 3;

	/**
	 * The feature id for the '<em><b>Buys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BUYS = 4;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.ClothesListingImpl <em>Clothes Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.ClothesListingImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getClothesListing()
	 * @generated
	 */
	int CLOTHES_LISTING = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__ID = LISTING__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__TITLE = LISTING__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__DESCRIPTION = LISTING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__PRICE = LISTING__PRICE;

	/**
	 * The feature id for the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__MODIFIED_AT = LISTING__MODIFIED_AT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__COORDINATE = LISTING__COORDINATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__USER = LISTING__USER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__SIZE = LISTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__TYPE = LISTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING__CONDITION = LISTING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clothes Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING_FEATURE_COUNT = LISTING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Clothes Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOTHES_LISTING_OPERATION_COUNT = LISTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.FinnImpl <em>Finn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.FinnImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getFinn()
	 * @generated
	 */
	int FINN = 4;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINN__USER = 0;

	/**
	 * The feature id for the '<em><b>Listing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINN__LISTING = 1;

	/**
	 * The number of structural features of the '<em>Finn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Finn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.ElectronicListingImpl <em>Electronic Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.ElectronicListingImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getElectronicListing()
	 * @generated
	 */
	int ELECTRONIC_LISTING = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__ID = LISTING__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__TITLE = LISTING__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__DESCRIPTION = LISTING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__PRICE = LISTING__PRICE;

	/**
	 * The feature id for the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__MODIFIED_AT = LISTING__MODIFIED_AT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__COORDINATE = LISTING__COORDINATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__USER = LISTING__USER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__CONDITION = LISTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING__BRAND = LISTING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Electronic Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING_FEATURE_COUNT = LISTING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Electronic Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRONIC_LISTING_OPERATION_COUNT = LISTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.SportListingImpl <em>Sport Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.SportListingImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getSportListing()
	 * @generated
	 */
	int SPORT_LISTING = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__ID = LISTING__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__TITLE = LISTING__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__DESCRIPTION = LISTING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__PRICE = LISTING__PRICE;

	/**
	 * The feature id for the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__MODIFIED_AT = LISTING__MODIFIED_AT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__COORDINATE = LISTING__COORDINATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__USER = LISTING__USER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__CONDITION = LISTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sport Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING__SPORT_TYPE = LISTING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sport Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING_FEATURE_COUNT = LISTING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sport Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_LISTING_OPERATION_COUNT = LISTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.PetListingImpl <em>Pet Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.PetListingImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getPetListing()
	 * @generated
	 */
	int PET_LISTING = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__ID = LISTING__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__TITLE = LISTING__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__DESCRIPTION = LISTING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__PRICE = LISTING__PRICE;

	/**
	 * The feature id for the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__MODIFIED_AT = LISTING__MODIFIED_AT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__COORDINATE = LISTING__COORDINATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__USER = LISTING__USER;

	/**
	 * The feature id for the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__SPECIES = LISTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pet Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING__PET_TYPE = LISTING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pet Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING_FEATURE_COUNT = LISTING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pet Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PET_LISTING_OPERATION_COUNT = LISTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.CameraListingImpl <em>Camera Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.CameraListingImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getCameraListing()
	 * @generated
	 */
	int CAMERA_LISTING = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__ID = ELECTRONIC_LISTING__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__TITLE = ELECTRONIC_LISTING__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__DESCRIPTION = ELECTRONIC_LISTING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__PRICE = ELECTRONIC_LISTING__PRICE;

	/**
	 * The feature id for the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__MODIFIED_AT = ELECTRONIC_LISTING__MODIFIED_AT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__COORDINATE = ELECTRONIC_LISTING__COORDINATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__USER = ELECTRONIC_LISTING__USER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__CONDITION = ELECTRONIC_LISTING__CONDITION;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__BRAND = ELECTRONIC_LISTING__BRAND;

	/**
	 * The feature id for the '<em><b>Camera Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING__CAMERA_TYPE = ELECTRONIC_LISTING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Camera Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING_FEATURE_COUNT = ELECTRONIC_LISTING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Camera Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_LISTING_OPERATION_COUNT = ELECTRONIC_LISTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.PhoneListingImpl <em>Phone Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.PhoneListingImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getPhoneListing()
	 * @generated
	 */
	int PHONE_LISTING = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__ID = ELECTRONIC_LISTING__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__TITLE = ELECTRONIC_LISTING__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__DESCRIPTION = ELECTRONIC_LISTING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__PRICE = ELECTRONIC_LISTING__PRICE;

	/**
	 * The feature id for the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__MODIFIED_AT = ELECTRONIC_LISTING__MODIFIED_AT;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__COORDINATE = ELECTRONIC_LISTING__COORDINATE;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__USER = ELECTRONIC_LISTING__USER;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__CONDITION = ELECTRONIC_LISTING__CONDITION;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__BRAND = ELECTRONIC_LISTING__BRAND;

	/**
	 * The feature id for the '<em><b>Phone Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING__PHONE_TYPE = ELECTRONIC_LISTING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phone Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING_FEATURE_COUNT = ELECTRONIC_LISTING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phone Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_LISTING_OPERATION_COUNT = ELECTRONIC_LISTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.PrivateUserImpl <em>Private User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.PrivateUserImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getPrivateUser()
	 * @generated
	 */
	int PRIVATE_USER = 10;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER__PHONE = USER__PHONE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Listing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER__LISTING = USER__LISTING;

	/**
	 * The feature id for the '<em><b>Buys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER__BUYS = USER__BUYS;

	/**
	 * The feature id for the '<em><b>Favorites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER__FAVORITES = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER__DATE_OF_BIRTH = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER__GENDER = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Private User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Private User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.impl.CompanyUserImpl <em>Company User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.impl.CompanyUserImpl
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getCompanyUser()
	 * @generated
	 */
	int COMPANY_USER = 11;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_USER__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_USER__PHONE = USER__PHONE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_USER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Listing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_USER__LISTING = USER__LISTING;

	/**
	 * The feature id for the '<em><b>Buys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_USER__BUYS = USER__BUYS;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_USER__WEBSITE = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Company User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Company User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreA1.BikeType <em>Bike Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.BikeType
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getBikeType()
	 * @generated
	 */
	int BIKE_TYPE = 12;

	/**
	 * The meta object id for the '{@link ecoreA1.Condition <em>Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.Condition
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 13;

	/**
	 * The meta object id for the '{@link ecoreA1.ClothesType <em>Clothes Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.ClothesType
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getClothesType()
	 * @generated
	 */
	int CLOTHES_TYPE = 14;

	/**
	 * The meta object id for the '{@link ecoreA1.CameraTypes <em>Camera Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.CameraTypes
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getCameraTypes()
	 * @generated
	 */
	int CAMERA_TYPES = 15;

	/**
	 * The meta object id for the '{@link ecoreA1.PhoneType <em>Phone Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.PhoneType
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getPhoneType()
	 * @generated
	 */
	int PHONE_TYPE = 16;

	/**
	 * The meta object id for the '{@link ecoreA1.SportType <em>Sport Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.SportType
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getSportType()
	 * @generated
	 */
	int SPORT_TYPE = 17;

	/**
	 * The meta object id for the '{@link ecoreA1.PetType <em>Pet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.PetType
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getPetType()
	 * @generated
	 */
	int PET_TYPE = 18;

	/**
	 * The meta object id for the '{@link ecoreA1.GenderType <em>Gender Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreA1.GenderType
	 * @see ecoreA1.impl.EcoreA1PackageImpl#getGenderType()
	 * @generated
	 */
	int GENDER_TYPE = 19;

	/**
	 * Returns the meta object for class '{@link ecoreA1.Listing <em>Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listing</em>'.
	 * @see ecoreA1.Listing
	 * @generated
	 */
	EClass getListing();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.Listing#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ecoreA1.Listing#getID()
	 * @see #getListing()
	 * @generated
	 */
	EAttribute getListing_ID();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.Listing#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ecoreA1.Listing#getTitle()
	 * @see #getListing()
	 * @generated
	 */
	EAttribute getListing_Title();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.Listing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ecoreA1.Listing#getDescription()
	 * @see #getListing()
	 * @generated
	 */
	EAttribute getListing_Description();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.Listing#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ecoreA1.Listing#getPrice()
	 * @see #getListing()
	 * @generated
	 */
	EAttribute getListing_Price();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.Listing#getModified_At <em>Modified At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified At</em>'.
	 * @see ecoreA1.Listing#getModified_At()
	 * @see #getListing()
	 * @generated
	 */
	EAttribute getListing_Modified_At();

	/**
	 * Returns the meta object for the attribute list '{@link ecoreA1.Listing#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordinate</em>'.
	 * @see ecoreA1.Listing#getCoordinate()
	 * @see #getListing()
	 * @generated
	 */
	EAttribute getListing_Coordinate();

	/**
	 * Returns the meta object for the reference '{@link ecoreA1.Listing#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see ecoreA1.Listing#getUser()
	 * @see #getListing()
	 * @generated
	 */
	EReference getListing_User();

	/**
	 * Returns the meta object for class '{@link ecoreA1.BikeListing <em>Bike Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bike Listing</em>'.
	 * @see ecoreA1.BikeListing
	 * @generated
	 */
	EClass getBikeListing();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.BikeListing#getBikeType <em>Bike Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bike Type</em>'.
	 * @see ecoreA1.BikeListing#getBikeType()
	 * @see #getBikeListing()
	 * @generated
	 */
	EAttribute getBikeListing_BikeType();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.BikeListing#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ecoreA1.BikeListing#getCondition()
	 * @see #getBikeListing()
	 * @generated
	 */
	EAttribute getBikeListing_Condition();

	/**
	 * Returns the meta object for class '{@link ecoreA1.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ecoreA1.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ecoreA1.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.User#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see ecoreA1.User#getPhone()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Phone();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreA1.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the reference list '{@link ecoreA1.User#getListing <em>Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Listing</em>'.
	 * @see ecoreA1.User#getListing()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Listing();

	/**
	 * Returns the meta object for the reference list '{@link ecoreA1.User#getBuys <em>Buys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buys</em>'.
	 * @see ecoreA1.User#getBuys()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Buys();

	/**
	 * Returns the meta object for class '{@link ecoreA1.ClothesListing <em>Clothes Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clothes Listing</em>'.
	 * @see ecoreA1.ClothesListing
	 * @generated
	 */
	EClass getClothesListing();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.ClothesListing#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see ecoreA1.ClothesListing#getSize()
	 * @see #getClothesListing()
	 * @generated
	 */
	EAttribute getClothesListing_Size();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.ClothesListing#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ecoreA1.ClothesListing#getType()
	 * @see #getClothesListing()
	 * @generated
	 */
	EAttribute getClothesListing_Type();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.ClothesListing#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ecoreA1.ClothesListing#getCondition()
	 * @see #getClothesListing()
	 * @generated
	 */
	EAttribute getClothesListing_Condition();

	/**
	 * Returns the meta object for class '{@link ecoreA1.Finn <em>Finn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finn</em>'.
	 * @see ecoreA1.Finn
	 * @generated
	 */
	EClass getFinn();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreA1.Finn#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see ecoreA1.Finn#getUser()
	 * @see #getFinn()
	 * @generated
	 */
	EReference getFinn_User();

	/**
	 * Returns the meta object for the containment reference list '{@link ecoreA1.Finn#getListing <em>Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listing</em>'.
	 * @see ecoreA1.Finn#getListing()
	 * @see #getFinn()
	 * @generated
	 */
	EReference getFinn_Listing();

	/**
	 * Returns the meta object for class '{@link ecoreA1.ElectronicListing <em>Electronic Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electronic Listing</em>'.
	 * @see ecoreA1.ElectronicListing
	 * @generated
	 */
	EClass getElectronicListing();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.ElectronicListing#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ecoreA1.ElectronicListing#getCondition()
	 * @see #getElectronicListing()
	 * @generated
	 */
	EAttribute getElectronicListing_Condition();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.ElectronicListing#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see ecoreA1.ElectronicListing#getBrand()
	 * @see #getElectronicListing()
	 * @generated
	 */
	EAttribute getElectronicListing_Brand();

	/**
	 * Returns the meta object for class '{@link ecoreA1.SportListing <em>Sport Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sport Listing</em>'.
	 * @see ecoreA1.SportListing
	 * @generated
	 */
	EClass getSportListing();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.SportListing#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see ecoreA1.SportListing#getCondition()
	 * @see #getSportListing()
	 * @generated
	 */
	EAttribute getSportListing_Condition();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.SportListing#getSportType <em>Sport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sport Type</em>'.
	 * @see ecoreA1.SportListing#getSportType()
	 * @see #getSportListing()
	 * @generated
	 */
	EAttribute getSportListing_SportType();

	/**
	 * Returns the meta object for class '{@link ecoreA1.PetListing <em>Pet Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pet Listing</em>'.
	 * @see ecoreA1.PetListing
	 * @generated
	 */
	EClass getPetListing();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.PetListing#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species</em>'.
	 * @see ecoreA1.PetListing#getSpecies()
	 * @see #getPetListing()
	 * @generated
	 */
	EAttribute getPetListing_Species();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.PetListing#getPetType <em>Pet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pet Type</em>'.
	 * @see ecoreA1.PetListing#getPetType()
	 * @see #getPetListing()
	 * @generated
	 */
	EAttribute getPetListing_PetType();

	/**
	 * Returns the meta object for class '{@link ecoreA1.CameraListing <em>Camera Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Listing</em>'.
	 * @see ecoreA1.CameraListing
	 * @generated
	 */
	EClass getCameraListing();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.CameraListing#getCameraType <em>Camera Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Camera Type</em>'.
	 * @see ecoreA1.CameraListing#getCameraType()
	 * @see #getCameraListing()
	 * @generated
	 */
	EAttribute getCameraListing_CameraType();

	/**
	 * Returns the meta object for class '{@link ecoreA1.PhoneListing <em>Phone Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Listing</em>'.
	 * @see ecoreA1.PhoneListing
	 * @generated
	 */
	EClass getPhoneListing();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.PhoneListing#getPhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Type</em>'.
	 * @see ecoreA1.PhoneListing#getPhoneType()
	 * @see #getPhoneListing()
	 * @generated
	 */
	EAttribute getPhoneListing_PhoneType();

	/**
	 * Returns the meta object for class '{@link ecoreA1.PrivateUser <em>Private User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private User</em>'.
	 * @see ecoreA1.PrivateUser
	 * @generated
	 */
	EClass getPrivateUser();

	/**
	 * Returns the meta object for the reference list '{@link ecoreA1.PrivateUser#getFavorites <em>Favorites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Favorites</em>'.
	 * @see ecoreA1.PrivateUser#getFavorites()
	 * @see #getPrivateUser()
	 * @generated
	 */
	EReference getPrivateUser_Favorites();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.PrivateUser#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see ecoreA1.PrivateUser#getDateOfBirth()
	 * @see #getPrivateUser()
	 * @generated
	 */
	EAttribute getPrivateUser_DateOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.PrivateUser#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see ecoreA1.PrivateUser#getGender()
	 * @see #getPrivateUser()
	 * @generated
	 */
	EAttribute getPrivateUser_Gender();

	/**
	 * Returns the meta object for class '{@link ecoreA1.CompanyUser <em>Company User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company User</em>'.
	 * @see ecoreA1.CompanyUser
	 * @generated
	 */
	EClass getCompanyUser();

	/**
	 * Returns the meta object for the attribute '{@link ecoreA1.CompanyUser#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see ecoreA1.CompanyUser#getWebsite()
	 * @see #getCompanyUser()
	 * @generated
	 */
	EAttribute getCompanyUser_Website();

	/**
	 * Returns the meta object for enum '{@link ecoreA1.BikeType <em>Bike Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bike Type</em>'.
	 * @see ecoreA1.BikeType
	 * @generated
	 */
	EEnum getBikeType();

	/**
	 * Returns the meta object for enum '{@link ecoreA1.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition</em>'.
	 * @see ecoreA1.Condition
	 * @generated
	 */
	EEnum getCondition();

	/**
	 * Returns the meta object for enum '{@link ecoreA1.ClothesType <em>Clothes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clothes Type</em>'.
	 * @see ecoreA1.ClothesType
	 * @generated
	 */
	EEnum getClothesType();

	/**
	 * Returns the meta object for enum '{@link ecoreA1.CameraTypes <em>Camera Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Camera Types</em>'.
	 * @see ecoreA1.CameraTypes
	 * @generated
	 */
	EEnum getCameraTypes();

	/**
	 * Returns the meta object for enum '{@link ecoreA1.PhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phone Type</em>'.
	 * @see ecoreA1.PhoneType
	 * @generated
	 */
	EEnum getPhoneType();

	/**
	 * Returns the meta object for enum '{@link ecoreA1.SportType <em>Sport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sport Type</em>'.
	 * @see ecoreA1.SportType
	 * @generated
	 */
	EEnum getSportType();

	/**
	 * Returns the meta object for enum '{@link ecoreA1.PetType <em>Pet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pet Type</em>'.
	 * @see ecoreA1.PetType
	 * @generated
	 */
	EEnum getPetType();

	/**
	 * Returns the meta object for enum '{@link ecoreA1.GenderType <em>Gender Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender Type</em>'.
	 * @see ecoreA1.GenderType
	 * @generated
	 */
	EEnum getGenderType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreA1Factory getEcoreA1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecoreA1.impl.ListingImpl <em>Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.ListingImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getListing()
		 * @generated
		 */
		EClass LISTING = eINSTANCE.getListing();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTING__ID = eINSTANCE.getListing_ID();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTING__TITLE = eINSTANCE.getListing_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTING__DESCRIPTION = eINSTANCE.getListing_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTING__PRICE = eINSTANCE.getListing_Price();

		/**
		 * The meta object literal for the '<em><b>Modified At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTING__MODIFIED_AT = eINSTANCE.getListing_Modified_At();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTING__COORDINATE = eINSTANCE.getListing_Coordinate();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTING__USER = eINSTANCE.getListing_User();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.BikeListingImpl <em>Bike Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.BikeListingImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getBikeListing()
		 * @generated
		 */
		EClass BIKE_LISTING = eINSTANCE.getBikeListing();

		/**
		 * The meta object literal for the '<em><b>Bike Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE_LISTING__BIKE_TYPE = eINSTANCE.getBikeListing_BikeType();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE_LISTING__CONDITION = eINSTANCE.getBikeListing_Condition();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.UserImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PHONE = eINSTANCE.getUser_Phone();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Listing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__LISTING = eINSTANCE.getUser_Listing();

		/**
		 * The meta object literal for the '<em><b>Buys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BUYS = eINSTANCE.getUser_Buys();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.ClothesListingImpl <em>Clothes Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.ClothesListingImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getClothesListing()
		 * @generated
		 */
		EClass CLOTHES_LISTING = eINSTANCE.getClothesListing();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOTHES_LISTING__SIZE = eINSTANCE.getClothesListing_Size();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOTHES_LISTING__TYPE = eINSTANCE.getClothesListing_Type();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOTHES_LISTING__CONDITION = eINSTANCE.getClothesListing_Condition();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.FinnImpl <em>Finn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.FinnImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getFinn()
		 * @generated
		 */
		EClass FINN = eINSTANCE.getFinn();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINN__USER = eINSTANCE.getFinn_User();

		/**
		 * The meta object literal for the '<em><b>Listing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINN__LISTING = eINSTANCE.getFinn_Listing();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.ElectronicListingImpl <em>Electronic Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.ElectronicListingImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getElectronicListing()
		 * @generated
		 */
		EClass ELECTRONIC_LISTING = eINSTANCE.getElectronicListing();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_LISTING__CONDITION = eINSTANCE.getElectronicListing_Condition();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRONIC_LISTING__BRAND = eINSTANCE.getElectronicListing_Brand();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.SportListingImpl <em>Sport Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.SportListingImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getSportListing()
		 * @generated
		 */
		EClass SPORT_LISTING = eINSTANCE.getSportListing();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORT_LISTING__CONDITION = eINSTANCE.getSportListing_Condition();

		/**
		 * The meta object literal for the '<em><b>Sport Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORT_LISTING__SPORT_TYPE = eINSTANCE.getSportListing_SportType();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.PetListingImpl <em>Pet Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.PetListingImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getPetListing()
		 * @generated
		 */
		EClass PET_LISTING = eINSTANCE.getPetListing();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PET_LISTING__SPECIES = eINSTANCE.getPetListing_Species();

		/**
		 * The meta object literal for the '<em><b>Pet Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PET_LISTING__PET_TYPE = eINSTANCE.getPetListing_PetType();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.CameraListingImpl <em>Camera Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.CameraListingImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getCameraListing()
		 * @generated
		 */
		EClass CAMERA_LISTING = eINSTANCE.getCameraListing();

		/**
		 * The meta object literal for the '<em><b>Camera Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_LISTING__CAMERA_TYPE = eINSTANCE.getCameraListing_CameraType();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.PhoneListingImpl <em>Phone Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.PhoneListingImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getPhoneListing()
		 * @generated
		 */
		EClass PHONE_LISTING = eINSTANCE.getPhoneListing();

		/**
		 * The meta object literal for the '<em><b>Phone Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_LISTING__PHONE_TYPE = eINSTANCE.getPhoneListing_PhoneType();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.PrivateUserImpl <em>Private User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.PrivateUserImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getPrivateUser()
		 * @generated
		 */
		EClass PRIVATE_USER = eINSTANCE.getPrivateUser();

		/**
		 * The meta object literal for the '<em><b>Favorites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVATE_USER__FAVORITES = eINSTANCE.getPrivateUser_Favorites();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_USER__DATE_OF_BIRTH = eINSTANCE.getPrivateUser_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_USER__GENDER = eINSTANCE.getPrivateUser_Gender();

		/**
		 * The meta object literal for the '{@link ecoreA1.impl.CompanyUserImpl <em>Company User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.impl.CompanyUserImpl
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getCompanyUser()
		 * @generated
		 */
		EClass COMPANY_USER = eINSTANCE.getCompanyUser();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_USER__WEBSITE = eINSTANCE.getCompanyUser_Website();

		/**
		 * The meta object literal for the '{@link ecoreA1.BikeType <em>Bike Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.BikeType
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getBikeType()
		 * @generated
		 */
		EEnum BIKE_TYPE = eINSTANCE.getBikeType();

		/**
		 * The meta object literal for the '{@link ecoreA1.Condition <em>Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.Condition
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getCondition()
		 * @generated
		 */
		EEnum CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link ecoreA1.ClothesType <em>Clothes Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.ClothesType
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getClothesType()
		 * @generated
		 */
		EEnum CLOTHES_TYPE = eINSTANCE.getClothesType();

		/**
		 * The meta object literal for the '{@link ecoreA1.CameraTypes <em>Camera Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.CameraTypes
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getCameraTypes()
		 * @generated
		 */
		EEnum CAMERA_TYPES = eINSTANCE.getCameraTypes();

		/**
		 * The meta object literal for the '{@link ecoreA1.PhoneType <em>Phone Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.PhoneType
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getPhoneType()
		 * @generated
		 */
		EEnum PHONE_TYPE = eINSTANCE.getPhoneType();

		/**
		 * The meta object literal for the '{@link ecoreA1.SportType <em>Sport Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.SportType
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getSportType()
		 * @generated
		 */
		EEnum SPORT_TYPE = eINSTANCE.getSportType();

		/**
		 * The meta object literal for the '{@link ecoreA1.PetType <em>Pet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.PetType
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getPetType()
		 * @generated
		 */
		EEnum PET_TYPE = eINSTANCE.getPetType();

		/**
		 * The meta object literal for the '{@link ecoreA1.GenderType <em>Gender Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreA1.GenderType
		 * @see ecoreA1.impl.EcoreA1PackageImpl#getGenderType()
		 * @generated
		 */
		EEnum GENDER_TYPE = eINSTANCE.getGenderType();

	}

} //EcoreA1Package
