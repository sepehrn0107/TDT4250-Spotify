/**
 */
package ecoreA1.util;

import ecoreA1.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Package
 * @generated
 */
public class EcoreA1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcoreA1Validator INSTANCE = new EcoreA1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ecoreA1";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreA1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return EcoreA1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case EcoreA1Package.LISTING:
			return validateListing((Listing) value, diagnostics, context);
		case EcoreA1Package.BIKE_LISTING:
			return validateBikeListing((BikeListing) value, diagnostics, context);
		case EcoreA1Package.USER:
			return validateUser((User) value, diagnostics, context);
		case EcoreA1Package.CLOTHES_LISTING:
			return validateClothesListing((ClothesListing) value, diagnostics, context);
		case EcoreA1Package.FINN:
			return validateFinn((Finn) value, diagnostics, context);
		case EcoreA1Package.ELECTRONIC_LISTING:
			return validateElectronicListing((ElectronicListing) value, diagnostics, context);
		case EcoreA1Package.SPORT_LISTING:
			return validateSportListing((SportListing) value, diagnostics, context);
		case EcoreA1Package.PET_LISTING:
			return validatePetListing((PetListing) value, diagnostics, context);
		case EcoreA1Package.CAMERA_LISTING:
			return validateCameraListing((CameraListing) value, diagnostics, context);
		case EcoreA1Package.PHONE_LISTING:
			return validatePhoneListing((PhoneListing) value, diagnostics, context);
		case EcoreA1Package.PRIVATE_USER:
			return validatePrivateUser((PrivateUser) value, diagnostics, context);
		case EcoreA1Package.COMPANY_USER:
			return validateCompanyUser((CompanyUser) value, diagnostics, context);
		case EcoreA1Package.BIKE_TYPE:
			return validateBikeType((BikeType) value, diagnostics, context);
		case EcoreA1Package.CONDITION:
			return validateCondition((Condition) value, diagnostics, context);
		case EcoreA1Package.CLOTHES_TYPE:
			return validateClothesType((ClothesType) value, diagnostics, context);
		case EcoreA1Package.CAMERA_TYPES:
			return validateCameraTypes((CameraTypes) value, diagnostics, context);
		case EcoreA1Package.PHONE_TYPE:
			return validatePhoneType((PhoneType) value, diagnostics, context);
		case EcoreA1Package.SPORT_TYPE:
			return validateSportType((SportType) value, diagnostics, context);
		case EcoreA1Package.PET_TYPE:
			return validatePetType((PetType) value, diagnostics, context);
		case EcoreA1Package.GENDER_TYPE:
			return validateGenderType((GenderType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListing(Listing listing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(listing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(listing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(listing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(listing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(listing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(listing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(listing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(listing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateListing_PriceNotNegative(listing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PriceNotNegative constraint of '<em>Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListing_PriceNotNegative(Listing listing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (listing.getPrice() < 0) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "PriceNotNegative", getObjectLabel(listing, context) },
								new Object[] { listing }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBikeListing(BikeListing bikeListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bikeListing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateListing_PriceNotNegative(bikeListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBikeListing_pricePositive(bikeListing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the pricePositive constraint of '<em>Bike Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBikeListing_pricePositive(BikeListing bikeListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "pricePositive", getObjectLabel(bikeListing, context) },
								new Object[] { bikeListing }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(user, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_CorrectPhoneNumber(user, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CorrectPhoneNumber constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USER__CORRECT_PHONE_NUMBER__EEXPRESSION = "self.Phone.size() = 8";

	/**
	 * Validates the CorrectPhoneNumber constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_CorrectPhoneNumber(User user, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(EcoreA1Package.Literals.USER, user, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "CorrectPhoneNumber",
				USER__CORRECT_PHONE_NUMBER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClothesListing(ClothesListing clothesListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clothesListing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateListing_PriceNotNegative(clothesListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateClothesListing_sizeCorrect(clothesListing, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sizeCorrect constraint of '<em>Clothes Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOTHES_LISTING__SIZE_CORRECT__EEXPRESSION = "self.Size.size() < 5";

	/**
	 * Validates the sizeCorrect constraint of '<em>Clothes Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClothesListing_sizeCorrect(ClothesListing clothesListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(EcoreA1Package.Literals.CLOTHES_LISTING, clothesListing, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "sizeCorrect", CLOTHES_LISTING__SIZE_CORRECT__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinn(Finn finn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(finn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectronicListing(ElectronicListing electronicListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(electronicListing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(electronicListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(electronicListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(electronicListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(electronicListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(electronicListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(electronicListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(electronicListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(electronicListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateListing_PriceNotNegative(electronicListing, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSportListing(SportListing sportListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sportListing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sportListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sportListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sportListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sportListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sportListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sportListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sportListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sportListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateListing_PriceNotNegative(sportListing, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetListing(PetListing petListing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(petListing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(petListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(petListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(petListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(petListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(petListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(petListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(petListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(petListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateListing_PriceNotNegative(petListing, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCameraListing(CameraListing cameraListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cameraListing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(cameraListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(cameraListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(cameraListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(cameraListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(cameraListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(cameraListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(cameraListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(cameraListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateListing_PriceNotNegative(cameraListing, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneListing(PhoneListing phoneListing, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(phoneListing, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(phoneListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(phoneListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(phoneListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(phoneListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(phoneListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(phoneListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(phoneListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(phoneListing, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateListing_PriceNotNegative(phoneListing, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivateUser(PrivateUser privateUser, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privateUser, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(privateUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(privateUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(privateUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(privateUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(privateUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(privateUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(privateUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(privateUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_CorrectPhoneNumber(privateUser, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyUser(CompanyUser companyUser, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(companyUser, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(companyUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(companyUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(companyUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(companyUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(companyUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(companyUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(companyUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(companyUser, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUser_CorrectPhoneNumber(companyUser, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBikeType(BikeType bikeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClothesType(ClothesType clothesType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCameraTypes(CameraTypes cameraTypes, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneType(PhoneType phoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSportType(SportType sportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetType(PetType petType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderType(GenderType genderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EcoreA1Validator
