/**
 */
package ecoreA1.impl;

import ecoreA1.EcoreA1Package;
import ecoreA1.GenderType;
import ecoreA1.Listing;
import ecoreA1.PrivateUser;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.impl.PrivateUserImpl#getFavorites <em>Favorites</em>}</li>
 *   <li>{@link ecoreA1.impl.PrivateUserImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link ecoreA1.impl.PrivateUserImpl#getGender <em>Gender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateUserImpl extends UserImpl implements PrivateUser {
	/**
	 * The cached value of the '{@link #getFavorites() <em>Favorites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFavorites()
	 * @generated
	 * @ordered
	 */
	protected EList<Listing> favorites;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final GenderType GENDER_EDEFAULT = GenderType.MALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected GenderType gender = GENDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreA1Package.Literals.PRIVATE_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Listing> getFavorites() {
		if (favorites == null) {
			favorites = new EObjectResolvingEList<Listing>(Listing.class, this, EcoreA1Package.PRIVATE_USER__FAVORITES);
		}
		return favorites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(Date newDateOfBirth) {
		Date oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.PRIVATE_USER__DATE_OF_BIRTH,
					oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderType getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(GenderType newGender) {
		GenderType oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.PRIVATE_USER__GENDER, oldGender,
					gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreA1Package.PRIVATE_USER__FAVORITES:
			return getFavorites();
		case EcoreA1Package.PRIVATE_USER__DATE_OF_BIRTH:
			return getDateOfBirth();
		case EcoreA1Package.PRIVATE_USER__GENDER:
			return getGender();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EcoreA1Package.PRIVATE_USER__FAVORITES:
			getFavorites().clear();
			getFavorites().addAll((Collection<? extends Listing>) newValue);
			return;
		case EcoreA1Package.PRIVATE_USER__DATE_OF_BIRTH:
			setDateOfBirth((Date) newValue);
			return;
		case EcoreA1Package.PRIVATE_USER__GENDER:
			setGender((GenderType) newValue);
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
		case EcoreA1Package.PRIVATE_USER__FAVORITES:
			getFavorites().clear();
			return;
		case EcoreA1Package.PRIVATE_USER__DATE_OF_BIRTH:
			setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
			return;
		case EcoreA1Package.PRIVATE_USER__GENDER:
			setGender(GENDER_EDEFAULT);
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
		case EcoreA1Package.PRIVATE_USER__FAVORITES:
			return favorites != null && !favorites.isEmpty();
		case EcoreA1Package.PRIVATE_USER__DATE_OF_BIRTH:
			return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
		case EcoreA1Package.PRIVATE_USER__GENDER:
			return gender != GENDER_EDEFAULT;
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
		result.append(" (DateOfBirth: ");
		result.append(dateOfBirth);
		result.append(", Gender: ");
		result.append(gender);
		result.append(')');
		return result.toString();
	}

} //PrivateUserImpl
