/**
 */
package ecoreA1.impl;

import ecoreA1.Condition;
import ecoreA1.EcoreA1Package;
import ecoreA1.SportListing;
import ecoreA1.SportType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sport Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.impl.SportListingImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ecoreA1.impl.SportListingImpl#getSportType <em>Sport Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SportListingImpl extends ListingImpl implements SportListing {
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
	 * The default value of the '{@link #getSportType() <em>Sport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSportType()
	 * @generated
	 * @ordered
	 */
	protected static final SportType SPORT_TYPE_EDEFAULT = SportType.BALL_GAME;

	/**
	 * The cached value of the '{@link #getSportType() <em>Sport Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSportType()
	 * @generated
	 * @ordered
	 */
	protected SportType sportType = SPORT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SportListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreA1Package.Literals.SPORT_LISTING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.SPORT_LISTING__CONDITION, oldCondition,
					condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SportType getSportType() {
		return sportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSportType(SportType newSportType) {
		SportType oldSportType = sportType;
		sportType = newSportType == null ? SPORT_TYPE_EDEFAULT : newSportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.SPORT_LISTING__SPORT_TYPE,
					oldSportType, sportType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreA1Package.SPORT_LISTING__CONDITION:
			return getCondition();
		case EcoreA1Package.SPORT_LISTING__SPORT_TYPE:
			return getSportType();
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
		case EcoreA1Package.SPORT_LISTING__CONDITION:
			setCondition((Condition) newValue);
			return;
		case EcoreA1Package.SPORT_LISTING__SPORT_TYPE:
			setSportType((SportType) newValue);
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
		case EcoreA1Package.SPORT_LISTING__CONDITION:
			setCondition(CONDITION_EDEFAULT);
			return;
		case EcoreA1Package.SPORT_LISTING__SPORT_TYPE:
			setSportType(SPORT_TYPE_EDEFAULT);
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
		case EcoreA1Package.SPORT_LISTING__CONDITION:
			return condition != CONDITION_EDEFAULT;
		case EcoreA1Package.SPORT_LISTING__SPORT_TYPE:
			return sportType != SPORT_TYPE_EDEFAULT;
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
		result.append(" (Condition: ");
		result.append(condition);
		result.append(", SportType: ");
		result.append(sportType);
		result.append(')');
		return result.toString();
	}

} //SportListingImpl
