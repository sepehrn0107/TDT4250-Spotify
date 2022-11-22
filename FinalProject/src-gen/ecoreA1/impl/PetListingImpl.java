/**
 */
package ecoreA1.impl;

import ecoreA1.EcoreA1Package;
import ecoreA1.PetListing;
import ecoreA1.PetType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pet Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.impl.PetListingImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link ecoreA1.impl.PetListingImpl#getPetType <em>Pet Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PetListingImpl extends ListingImpl implements PetListing {
	/**
	 * The default value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected String species = SPECIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPetType() <em>Pet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetType()
	 * @generated
	 * @ordered
	 */
	protected static final PetType PET_TYPE_EDEFAULT = PetType.DOG;

	/**
	 * The cached value of the '{@link #getPetType() <em>Pet Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetType()
	 * @generated
	 * @ordered
	 */
	protected PetType petType = PET_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreA1Package.Literals.PET_LISTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(String newSpecies) {
		String oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.PET_LISTING__SPECIES, oldSpecies,
					species));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetType getPetType() {
		return petType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetType(PetType newPetType) {
		PetType oldPetType = petType;
		petType = newPetType == null ? PET_TYPE_EDEFAULT : newPetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.PET_LISTING__PET_TYPE, oldPetType,
					petType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreA1Package.PET_LISTING__SPECIES:
			return getSpecies();
		case EcoreA1Package.PET_LISTING__PET_TYPE:
			return getPetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcoreA1Package.PET_LISTING__SPECIES:
			setSpecies((String) newValue);
			return;
		case EcoreA1Package.PET_LISTING__PET_TYPE:
			setPetType((PetType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EcoreA1Package.PET_LISTING__SPECIES:
			setSpecies(SPECIES_EDEFAULT);
			return;
		case EcoreA1Package.PET_LISTING__PET_TYPE:
			setPetType(PET_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EcoreA1Package.PET_LISTING__SPECIES:
			return SPECIES_EDEFAULT == null ? species != null : !SPECIES_EDEFAULT.equals(species);
		case EcoreA1Package.PET_LISTING__PET_TYPE:
			return petType != PET_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Species: ");
		result.append(species);
		result.append(", PetType: ");
		result.append(petType);
		result.append(')');
		return result.toString();
	}

} //PetListingImpl
