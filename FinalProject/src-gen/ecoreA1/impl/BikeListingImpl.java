/**
 */
package ecoreA1.impl;

import ecoreA1.BikeListing;
import ecoreA1.BikeType;
import ecoreA1.Condition;
import ecoreA1.EcoreA1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bike Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.impl.BikeListingImpl#getBikeType <em>Bike Type</em>}</li>
 *   <li>{@link ecoreA1.impl.BikeListingImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BikeListingImpl extends ListingImpl implements BikeListing {
	/**
	 * The default value of the '{@link #getBikeType() <em>Bike Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeType()
	 * @generated
	 * @ordered
	 */
	protected static final BikeType BIKE_TYPE_EDEFAULT = BikeType.TERRAIN;

	/**
	 * The cached value of the '{@link #getBikeType() <em>Bike Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikeType()
	 * @generated
	 * @ordered
	 */
	protected BikeType bikeType = BIKE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final Condition CONDITION_EDEFAULT = Condition.NEW;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BikeListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreA1Package.Literals.BIKE_LISTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BikeType getBikeType() {
		return bikeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBikeType(BikeType newBikeType) {
		BikeType oldBikeType = bikeType;
		bikeType = newBikeType == null ? BIKE_TYPE_EDEFAULT : newBikeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.BIKE_LISTING__BIKE_TYPE, oldBikeType,
					bikeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		Condition oldCondition = condition;
		condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.BIKE_LISTING__CONDITION, oldCondition,
					condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreA1Package.BIKE_LISTING__BIKE_TYPE:
			return getBikeType();
		case EcoreA1Package.BIKE_LISTING__CONDITION:
			return getCondition();
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
		case EcoreA1Package.BIKE_LISTING__BIKE_TYPE:
			setBikeType((BikeType) newValue);
			return;
		case EcoreA1Package.BIKE_LISTING__CONDITION:
			setCondition((Condition) newValue);
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
		case EcoreA1Package.BIKE_LISTING__BIKE_TYPE:
			setBikeType(BIKE_TYPE_EDEFAULT);
			return;
		case EcoreA1Package.BIKE_LISTING__CONDITION:
			setCondition(CONDITION_EDEFAULT);
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
		case EcoreA1Package.BIKE_LISTING__BIKE_TYPE:
			return bikeType != BIKE_TYPE_EDEFAULT;
		case EcoreA1Package.BIKE_LISTING__CONDITION:
			return condition != CONDITION_EDEFAULT;
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
		result.append(" (BikeType: ");
		result.append(bikeType);
		result.append(", Condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //BikeListingImpl
