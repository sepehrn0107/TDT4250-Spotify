/**
 */
package ecoreA1.impl;

import ecoreA1.EcoreA1Package;
import ecoreA1.PhoneListing;
import ecoreA1.PhoneType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phone Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.impl.PhoneListingImpl#getPhoneType <em>Phone Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhoneListingImpl extends ElectronicListingImpl implements PhoneListing {
	/**
	 * The default value of the '{@link #getPhoneType() <em>Phone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneType()
	 * @generated
	 * @ordered
	 */
	protected static final PhoneType PHONE_TYPE_EDEFAULT = PhoneType.IPHONE;

	/**
	 * The cached value of the '{@link #getPhoneType() <em>Phone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneType()
	 * @generated
	 * @ordered
	 */
	protected PhoneType phoneType = PHONE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhoneListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreA1Package.Literals.PHONE_LISTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneType getPhoneType() {
		return phoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneType(PhoneType newPhoneType) {
		PhoneType oldPhoneType = phoneType;
		phoneType = newPhoneType == null ? PHONE_TYPE_EDEFAULT : newPhoneType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.PHONE_LISTING__PHONE_TYPE,
					oldPhoneType, phoneType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreA1Package.PHONE_LISTING__PHONE_TYPE:
			return getPhoneType();
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
		case EcoreA1Package.PHONE_LISTING__PHONE_TYPE:
			setPhoneType((PhoneType) newValue);
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
		case EcoreA1Package.PHONE_LISTING__PHONE_TYPE:
			setPhoneType(PHONE_TYPE_EDEFAULT);
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
		case EcoreA1Package.PHONE_LISTING__PHONE_TYPE:
			return phoneType != PHONE_TYPE_EDEFAULT;
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
		result.append(" (PhoneType: ");
		result.append(phoneType);
		result.append(')');
		return result.toString();
	}

} //PhoneListingImpl
