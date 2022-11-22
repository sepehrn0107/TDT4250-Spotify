/**
 */
package ecoreA1.impl;

import ecoreA1.BikeListing;
import ecoreA1.BikeType;
import ecoreA1.CameraListing;
import ecoreA1.CameraTypes;
import ecoreA1.ClothesListing;
import ecoreA1.ClothesType;
import ecoreA1.CompanyUser;
import ecoreA1.Condition;
import ecoreA1.EcoreA1Factory;
import ecoreA1.EcoreA1Package;
import ecoreA1.ElectronicListing;
import ecoreA1.Finn;
import ecoreA1.GenderType;
import ecoreA1.Listing;
import ecoreA1.PetListing;
import ecoreA1.PetType;
import ecoreA1.PhoneListing;
import ecoreA1.PhoneType;
import ecoreA1.PrivateUser;
import ecoreA1.SportListing;
import ecoreA1.SportType;
import ecoreA1.User;

import ecoreA1.util.EcoreA1Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreA1PackageImpl extends EPackageImpl implements EcoreA1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bikeListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clothesListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electronicListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sportListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phoneListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass companyUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bikeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clothesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cameraTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phoneTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sportTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum petTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecoreA1.EcoreA1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreA1PackageImpl() {
		super(eNS_URI, EcoreA1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EcoreA1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcoreA1Package init() {
		if (isInited)
			return (EcoreA1Package) EPackage.Registry.INSTANCE.getEPackage(EcoreA1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredEcoreA1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		EcoreA1PackageImpl theEcoreA1Package = registeredEcoreA1Package instanceof EcoreA1PackageImpl
				? (EcoreA1PackageImpl) registeredEcoreA1Package
				: new EcoreA1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEcoreA1Package.createPackageContents();

		// Initialize created meta-data
		theEcoreA1Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theEcoreA1Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return EcoreA1Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theEcoreA1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreA1Package.eNS_URI, theEcoreA1Package);
		return theEcoreA1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListing() {
		return listingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListing_ID() {
		return (EAttribute) listingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListing_Title() {
		return (EAttribute) listingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListing_Description() {
		return (EAttribute) listingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListing_Price() {
		return (EAttribute) listingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListing_Modified_At() {
		return (EAttribute) listingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListing_Coordinate() {
		return (EAttribute) listingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListing_User() {
		return (EReference) listingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBikeListing() {
		return bikeListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBikeListing_BikeType() {
		return (EAttribute) bikeListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBikeListing_Condition() {
		return (EAttribute) bikeListingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Phone() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Listing() {
		return (EReference) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Buys() {
		return (EReference) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClothesListing() {
		return clothesListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClothesListing_Size() {
		return (EAttribute) clothesListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClothesListing_Type() {
		return (EAttribute) clothesListingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClothesListing_Condition() {
		return (EAttribute) clothesListingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinn() {
		return finnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinn_User() {
		return (EReference) finnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinn_Listing() {
		return (EReference) finnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectronicListing() {
		return electronicListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicListing_Condition() {
		return (EAttribute) electronicListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicListing_Brand() {
		return (EAttribute) electronicListingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSportListing() {
		return sportListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSportListing_Condition() {
		return (EAttribute) sportListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSportListing_SportType() {
		return (EAttribute) sportListingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetListing() {
		return petListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetListing_Species() {
		return (EAttribute) petListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetListing_PetType() {
		return (EAttribute) petListingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraListing() {
		return cameraListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraListing_CameraType() {
		return (EAttribute) cameraListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhoneListing() {
		return phoneListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoneListing_PhoneType() {
		return (EAttribute) phoneListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivateUser() {
		return privateUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivateUser_Favorites() {
		return (EReference) privateUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivateUser_DateOfBirth() {
		return (EAttribute) privateUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivateUser_Gender() {
		return (EAttribute) privateUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompanyUser() {
		return companyUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompanyUser_Website() {
		return (EAttribute) companyUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBikeType() {
		return bikeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCondition() {
		return conditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClothesType() {
		return clothesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCameraTypes() {
		return cameraTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhoneType() {
		return phoneTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSportType() {
		return sportTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPetType() {
		return petTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenderType() {
		return genderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreA1Factory getEcoreA1Factory() {
		return (EcoreA1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		listingEClass = createEClass(LISTING);
		createEAttribute(listingEClass, LISTING__ID);
		createEAttribute(listingEClass, LISTING__TITLE);
		createEAttribute(listingEClass, LISTING__DESCRIPTION);
		createEAttribute(listingEClass, LISTING__PRICE);
		createEAttribute(listingEClass, LISTING__MODIFIED_AT);
		createEAttribute(listingEClass, LISTING__COORDINATE);
		createEReference(listingEClass, LISTING__USER);

		bikeListingEClass = createEClass(BIKE_LISTING);
		createEAttribute(bikeListingEClass, BIKE_LISTING__BIKE_TYPE);
		createEAttribute(bikeListingEClass, BIKE_LISTING__CONDITION);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__PHONE);
		createEAttribute(userEClass, USER__NAME);
		createEReference(userEClass, USER__LISTING);
		createEReference(userEClass, USER__BUYS);

		clothesListingEClass = createEClass(CLOTHES_LISTING);
		createEAttribute(clothesListingEClass, CLOTHES_LISTING__SIZE);
		createEAttribute(clothesListingEClass, CLOTHES_LISTING__TYPE);
		createEAttribute(clothesListingEClass, CLOTHES_LISTING__CONDITION);

		finnEClass = createEClass(FINN);
		createEReference(finnEClass, FINN__USER);
		createEReference(finnEClass, FINN__LISTING);

		electronicListingEClass = createEClass(ELECTRONIC_LISTING);
		createEAttribute(electronicListingEClass, ELECTRONIC_LISTING__CONDITION);
		createEAttribute(electronicListingEClass, ELECTRONIC_LISTING__BRAND);

		sportListingEClass = createEClass(SPORT_LISTING);
		createEAttribute(sportListingEClass, SPORT_LISTING__CONDITION);
		createEAttribute(sportListingEClass, SPORT_LISTING__SPORT_TYPE);

		petListingEClass = createEClass(PET_LISTING);
		createEAttribute(petListingEClass, PET_LISTING__SPECIES);
		createEAttribute(petListingEClass, PET_LISTING__PET_TYPE);

		cameraListingEClass = createEClass(CAMERA_LISTING);
		createEAttribute(cameraListingEClass, CAMERA_LISTING__CAMERA_TYPE);

		phoneListingEClass = createEClass(PHONE_LISTING);
		createEAttribute(phoneListingEClass, PHONE_LISTING__PHONE_TYPE);

		privateUserEClass = createEClass(PRIVATE_USER);
		createEReference(privateUserEClass, PRIVATE_USER__FAVORITES);
		createEAttribute(privateUserEClass, PRIVATE_USER__DATE_OF_BIRTH);
		createEAttribute(privateUserEClass, PRIVATE_USER__GENDER);

		companyUserEClass = createEClass(COMPANY_USER);
		createEAttribute(companyUserEClass, COMPANY_USER__WEBSITE);

		// Create enums
		bikeTypeEEnum = createEEnum(BIKE_TYPE);
		conditionEEnum = createEEnum(CONDITION);
		clothesTypeEEnum = createEEnum(CLOTHES_TYPE);
		cameraTypesEEnum = createEEnum(CAMERA_TYPES);
		phoneTypeEEnum = createEEnum(PHONE_TYPE);
		sportTypeEEnum = createEEnum(SPORT_TYPE);
		petTypeEEnum = createEEnum(PET_TYPE);
		genderTypeEEnum = createEEnum(GENDER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bikeListingEClass.getESuperTypes().add(this.getListing());
		clothesListingEClass.getESuperTypes().add(this.getListing());
		electronicListingEClass.getESuperTypes().add(this.getListing());
		sportListingEClass.getESuperTypes().add(this.getListing());
		petListingEClass.getESuperTypes().add(this.getListing());
		cameraListingEClass.getESuperTypes().add(this.getElectronicListing());
		phoneListingEClass.getESuperTypes().add(this.getElectronicListing());
		privateUserEClass.getESuperTypes().add(this.getUser());
		companyUserEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(listingEClass, Listing.class, "Listing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListing_ID(), ecorePackage.getEInt(), "ID", null, 1, 1, Listing.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getListing_Title(), ecorePackage.getEString(), "Title", null, 1, 1, Listing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getListing_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Listing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getListing_Price(), ecorePackage.getEInt(), "Price", null, 0, 1, Listing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListing_Modified_At(), ecorePackage.getEDate(), "Modified_At", null, 0, 1, Listing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getListing_Coordinate(), ecorePackage.getEDouble(), "Coordinate", null, 2, 2, Listing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getListing_User(), this.getUser(), this.getUser_Listing(), "user", null, 1, 1, Listing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bikeListingEClass, BikeListing.class, "BikeListing", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBikeListing_BikeType(), this.getBikeType(), "BikeType", null, 1, 1, BikeListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBikeListing_Condition(), this.getCondition(), "Condition", null, 1, 1, BikeListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "Email", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Phone(), ecorePackage.getEString(), "Phone", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "Name", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Listing(), this.getListing(), this.getListing_User(), "listing", null, 0, -1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Buys(), this.getListing(), null, "buys", null, 0, -1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(clothesListingEClass, ClothesListing.class, "ClothesListing", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClothesListing_Size(), ecorePackage.getEString(), "Size", null, 0, 1, ClothesListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getClothesListing_Type(), this.getClothesType(), "Type", null, 1, 1, ClothesListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getClothesListing_Condition(), this.getCondition(), "Condition", null, 0, 1,
				ClothesListing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(finnEClass, Finn.class, "Finn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinn_User(), this.getUser(), null, "user", null, 0, -1, Finn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFinn_Listing(), this.getListing(), null, "listing", null, 0, -1, Finn.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(electronicListingEClass, ElectronicListing.class, "ElectronicListing", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectronicListing_Condition(), this.getCondition(), "Condition", null, 1, 1,
				ElectronicListing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicListing_Brand(), ecorePackage.getEString(), "Brand", null, 0, 1,
				ElectronicListing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sportListingEClass, SportListing.class, "SportListing", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSportListing_Condition(), this.getCondition(), "Condition", null, 1, 1, SportListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSportListing_SportType(), this.getSportType(), "SportType", null, 1, 1, SportListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petListingEClass, PetListing.class, "PetListing", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPetListing_Species(), ecorePackage.getEString(), "Species", null, 0, 1, PetListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPetListing_PetType(), this.getPetType(), "PetType", null, 0, 1, PetListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraListingEClass, CameraListing.class, "CameraListing", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCameraListing_CameraType(), this.getCameraTypes(), "CameraType", null, 1, 1,
				CameraListing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(phoneListingEClass, PhoneListing.class, "PhoneListing", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhoneListing_PhoneType(), this.getPhoneType(), "PhoneType", null, 1, 1, PhoneListing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateUserEClass, PrivateUser.class, "PrivateUser", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivateUser_Favorites(), this.getListing(), null, "Favorites", null, 0, -1, PrivateUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateUser_DateOfBirth(), ecorePackage.getEDate(), "DateOfBirth", null, 1, 1,
				PrivateUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivateUser_Gender(), this.getGenderType(), "Gender", null, 1, 1, PrivateUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(companyUserEClass, CompanyUser.class, "CompanyUser", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompanyUser_Website(), ecorePackage.getEString(), "Website", null, 0, 1, CompanyUser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bikeTypeEEnum, BikeType.class, "BikeType");
		addEEnumLiteral(bikeTypeEEnum, BikeType.TERRAIN);
		addEEnumLiteral(bikeTypeEEnum, BikeType.HYBRID);
		addEEnumLiteral(bikeTypeEEnum, BikeType.ELECTRIC);
		addEEnumLiteral(bikeTypeEEnum, BikeType.BMX);

		initEEnum(conditionEEnum, Condition.class, "Condition");
		addEEnumLiteral(conditionEEnum, Condition.NEW);
		addEEnumLiteral(conditionEEnum, Condition.USED);

		initEEnum(clothesTypeEEnum, ClothesType.class, "ClothesType");
		addEEnumLiteral(clothesTypeEEnum, ClothesType.JACKET);
		addEEnumLiteral(clothesTypeEEnum, ClothesType.PANTS);

		initEEnum(cameraTypesEEnum, CameraTypes.class, "CameraTypes");
		addEEnumLiteral(cameraTypesEEnum, CameraTypes.HYBRID);
		addEEnumLiteral(cameraTypesEEnum, CameraTypes.COMPACT);
		addEEnumLiteral(cameraTypesEEnum, CameraTypes.LENSE);

		initEEnum(phoneTypeEEnum, PhoneType.class, "PhoneType");
		addEEnumLiteral(phoneTypeEEnum, PhoneType.IPHONE);
		addEEnumLiteral(phoneTypeEEnum, PhoneType.ANDROID);
		addEEnumLiteral(phoneTypeEEnum, PhoneType.OTHER);

		initEEnum(sportTypeEEnum, SportType.class, "SportType");
		addEEnumLiteral(sportTypeEEnum, SportType.BALL_GAME);
		addEEnumLiteral(sportTypeEEnum, SportType.SWIMMING);
		addEEnumLiteral(sportTypeEEnum, SportType.TRACK);
		addEEnumLiteral(sportTypeEEnum, SportType.ACCESSORIES);

		initEEnum(petTypeEEnum, PetType.class, "PetType");
		addEEnumLiteral(petTypeEEnum, PetType.DOG);
		addEEnumLiteral(petTypeEEnum, PetType.CAT);
		addEEnumLiteral(petTypeEEnum, PetType.BIRD);
		addEEnumLiteral(petTypeEEnum, PetType.RODENT);

		initEEnum(genderTypeEEnum, GenderType.class, "GenderType");
		addEEnumLiteral(genderTypeEEnum, GenderType.MALE);
		addEEnumLiteral(genderTypeEEnum, GenderType.FEMALE);
		addEEnumLiteral(genderTypeEEnum, GenderType.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL" });
		addAnnotation(listingEClass, source, new String[] { "constraints", "PriceNotNegative" });
		addAnnotation(bikeListingEClass, source, new String[] { "constraints", "pricePositive" });
		addAnnotation(userEClass, source, new String[] { "constraints", "CorrectPhoneNumber" });
		addAnnotation(clothesListingEClass, source, new String[] { "constraints", "sizeCorrect" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation(userEClass, source,
				new String[] { "CorrectPhoneNumber", "self.Phone.size() = 8", "BuyerNotSeller", "self.Email <> " });
		addAnnotation(clothesListingEClass, source, new String[] { "sizeCorrect", "self.Size.size() < 5" });
	}

} //EcoreA1PackageImpl
