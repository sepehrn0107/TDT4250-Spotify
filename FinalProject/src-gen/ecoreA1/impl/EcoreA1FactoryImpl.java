/**
 */
package ecoreA1.impl;

import ecoreA1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreA1FactoryImpl extends EFactoryImpl implements EcoreA1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreA1Factory init() {
		try {
			EcoreA1Factory theEcoreA1Factory = (EcoreA1Factory) EPackage.Registry.INSTANCE
					.getEFactory(EcoreA1Package.eNS_URI);
			if (theEcoreA1Factory != null) {
				return theEcoreA1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreA1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreA1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EcoreA1Package.BIKE_LISTING:
			return createBikeListing();
		case EcoreA1Package.CLOTHES_LISTING:
			return createClothesListing();
		case EcoreA1Package.FINN:
			return createFinn();
		case EcoreA1Package.SPORT_LISTING:
			return createSportListing();
		case EcoreA1Package.PET_LISTING:
			return createPetListing();
		case EcoreA1Package.CAMERA_LISTING:
			return createCameraListing();
		case EcoreA1Package.PHONE_LISTING:
			return createPhoneListing();
		case EcoreA1Package.PRIVATE_USER:
			return createPrivateUser();
		case EcoreA1Package.COMPANY_USER:
			return createCompanyUser();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EcoreA1Package.BIKE_TYPE:
			return createBikeTypeFromString(eDataType, initialValue);
		case EcoreA1Package.CONDITION:
			return createConditionFromString(eDataType, initialValue);
		case EcoreA1Package.CLOTHES_TYPE:
			return createClothesTypeFromString(eDataType, initialValue);
		case EcoreA1Package.CAMERA_TYPES:
			return createCameraTypesFromString(eDataType, initialValue);
		case EcoreA1Package.PHONE_TYPE:
			return createPhoneTypeFromString(eDataType, initialValue);
		case EcoreA1Package.SPORT_TYPE:
			return createSportTypeFromString(eDataType, initialValue);
		case EcoreA1Package.PET_TYPE:
			return createPetTypeFromString(eDataType, initialValue);
		case EcoreA1Package.GENDER_TYPE:
			return createGenderTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EcoreA1Package.BIKE_TYPE:
			return convertBikeTypeToString(eDataType, instanceValue);
		case EcoreA1Package.CONDITION:
			return convertConditionToString(eDataType, instanceValue);
		case EcoreA1Package.CLOTHES_TYPE:
			return convertClothesTypeToString(eDataType, instanceValue);
		case EcoreA1Package.CAMERA_TYPES:
			return convertCameraTypesToString(eDataType, instanceValue);
		case EcoreA1Package.PHONE_TYPE:
			return convertPhoneTypeToString(eDataType, instanceValue);
		case EcoreA1Package.SPORT_TYPE:
			return convertSportTypeToString(eDataType, instanceValue);
		case EcoreA1Package.PET_TYPE:
			return convertPetTypeToString(eDataType, instanceValue);
		case EcoreA1Package.GENDER_TYPE:
			return convertGenderTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BikeListing createBikeListing() {
		BikeListingImpl bikeListing = new BikeListingImpl();
		return bikeListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClothesListing createClothesListing() {
		ClothesListingImpl clothesListing = new ClothesListingImpl();
		return clothesListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Finn createFinn() {
		FinnImpl finn = new FinnImpl();
		return finn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportListing createSportListing() {
		SportListingImpl sportListing = new SportListingImpl();
		return sportListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetListing createPetListing() {
		PetListingImpl petListing = new PetListingImpl();
		return petListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraListing createCameraListing() {
		CameraListingImpl cameraListing = new CameraListingImpl();
		return cameraListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneListing createPhoneListing() {
		PhoneListingImpl phoneListing = new PhoneListingImpl();
		return phoneListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateUser createPrivateUser() {
		PrivateUserImpl privateUser = new PrivateUserImpl();
		return privateUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyUser createCompanyUser() {
		CompanyUserImpl companyUser = new CompanyUserImpl();
		return companyUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BikeType createBikeTypeFromString(EDataType eDataType, String initialValue) {
		BikeType result = BikeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBikeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createConditionFromString(EDataType eDataType, String initialValue) {
		Condition result = Condition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClothesType createClothesTypeFromString(EDataType eDataType, String initialValue) {
		ClothesType result = ClothesType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClothesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraTypes createCameraTypesFromString(EDataType eDataType, String initialValue) {
		CameraTypes result = CameraTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCameraTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneType createPhoneTypeFromString(EDataType eDataType, String initialValue) {
		PhoneType result = PhoneType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhoneTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportType createSportTypeFromString(EDataType eDataType, String initialValue) {
		SportType result = SportType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSportTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetType createPetTypeFromString(EDataType eDataType, String initialValue) {
		PetType result = PetType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderType createGenderTypeFromString(EDataType eDataType, String initialValue) {
		GenderType result = GenderType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreA1Package getEcoreA1Package() {
		return (EcoreA1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreA1Package getPackage() {
		return EcoreA1Package.eINSTANCE;
	}

} //EcoreA1FactoryImpl
