/**
 */
package ecoreA1.util;

import ecoreA1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Package
 * @generated
 */
public class EcoreA1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcoreA1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreA1Switch() {
		if (modelPackage == null) {
			modelPackage = EcoreA1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EcoreA1Package.LISTING: {
			Listing listing = (Listing) theEObject;
			T result = caseListing(listing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.BIKE_LISTING: {
			BikeListing bikeListing = (BikeListing) theEObject;
			T result = caseBikeListing(bikeListing);
			if (result == null)
				result = caseListing(bikeListing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.CLOTHES_LISTING: {
			ClothesListing clothesListing = (ClothesListing) theEObject;
			T result = caseClothesListing(clothesListing);
			if (result == null)
				result = caseListing(clothesListing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.FINN: {
			Finn finn = (Finn) theEObject;
			T result = caseFinn(finn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.ELECTRONIC_LISTING: {
			ElectronicListing electronicListing = (ElectronicListing) theEObject;
			T result = caseElectronicListing(electronicListing);
			if (result == null)
				result = caseListing(electronicListing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.SPORT_LISTING: {
			SportListing sportListing = (SportListing) theEObject;
			T result = caseSportListing(sportListing);
			if (result == null)
				result = caseListing(sportListing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.PET_LISTING: {
			PetListing petListing = (PetListing) theEObject;
			T result = casePetListing(petListing);
			if (result == null)
				result = caseListing(petListing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.CAMERA_LISTING: {
			CameraListing cameraListing = (CameraListing) theEObject;
			T result = caseCameraListing(cameraListing);
			if (result == null)
				result = caseElectronicListing(cameraListing);
			if (result == null)
				result = caseListing(cameraListing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.PHONE_LISTING: {
			PhoneListing phoneListing = (PhoneListing) theEObject;
			T result = casePhoneListing(phoneListing);
			if (result == null)
				result = caseElectronicListing(phoneListing);
			if (result == null)
				result = caseListing(phoneListing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.PRIVATE_USER: {
			PrivateUser privateUser = (PrivateUser) theEObject;
			T result = casePrivateUser(privateUser);
			if (result == null)
				result = caseUser(privateUser);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EcoreA1Package.COMPANY_USER: {
			CompanyUser companyUser = (CompanyUser) theEObject;
			T result = caseCompanyUser(companyUser);
			if (result == null)
				result = caseUser(companyUser);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListing(Listing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bike Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bike Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBikeListing(BikeListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clothes Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clothes Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClothesListing(ClothesListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinn(Finn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electronic Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electronic Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectronicListing(ElectronicListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sport Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sport Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSportListing(SportListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pet Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pet Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetListing(PetListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraListing(CameraListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhoneListing(PhoneListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateUser(PrivateUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Company User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompanyUser(CompanyUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EcoreA1Switch
