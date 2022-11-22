/**
 */
package ecoreA1.impl;

import ecoreA1.EcoreA1Package;
import ecoreA1.Listing;
import ecoreA1.User;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.impl.ListingImpl#getID <em>ID</em>}</li>
 *   <li>{@link ecoreA1.impl.ListingImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ecoreA1.impl.ListingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ecoreA1.impl.ListingImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link ecoreA1.impl.ListingImpl#getModified_At <em>Modified At</em>}</li>
 *   <li>{@link ecoreA1.impl.ListingImpl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link ecoreA1.impl.ListingImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ListingImpl extends MinimalEObjectImpl.Container implements Listing {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified_At() <em>Modified At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified_At()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified_At() <em>Modified At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified_At()
	 * @generated
	 * @ordered
	 */
	protected Date modified_At = MODIFIED_AT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> coordinate;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreA1Package.Literals.LISTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.LISTING__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.LISTING__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.LISTING__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified_At() {
		return modified_At;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified_At(Date newModified_At) {
		Date oldModified_At = modified_At;
		modified_At = newModified_At;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.LISTING__MODIFIED_AT, oldModified_At,
					modified_At));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getCoordinate() {
		if (coordinate == null) {
			coordinate = new EDataTypeEList<Double>(Double.class, this, EcoreA1Package.LISTING__COORDINATE);
		}
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject) user;
			user = (User) eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcoreA1Package.LISTING__USER, oldUser,
							user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcoreA1Package.LISTING__USER,
					oldUser, newUser);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this, EcoreA1Package.USER__LISTING, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this, EcoreA1Package.USER__LISTING, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.LISTING__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreA1Package.LISTING__USER:
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this, EcoreA1Package.USER__LISTING, User.class, msgs);
			return basicSetUser((User) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreA1Package.LISTING__USER:
			return basicSetUser(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreA1Package.LISTING__ID:
			return getID();
		case EcoreA1Package.LISTING__TITLE:
			return getTitle();
		case EcoreA1Package.LISTING__DESCRIPTION:
			return getDescription();
		case EcoreA1Package.LISTING__PRICE:
			return getPrice();
		case EcoreA1Package.LISTING__MODIFIED_AT:
			return getModified_At();
		case EcoreA1Package.LISTING__COORDINATE:
			return getCoordinate();
		case EcoreA1Package.LISTING__USER:
			if (resolve)
				return getUser();
			return basicGetUser();
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
		case EcoreA1Package.LISTING__TITLE:
			setTitle((String) newValue);
			return;
		case EcoreA1Package.LISTING__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EcoreA1Package.LISTING__PRICE:
			setPrice((Integer) newValue);
			return;
		case EcoreA1Package.LISTING__MODIFIED_AT:
			setModified_At((Date) newValue);
			return;
		case EcoreA1Package.LISTING__COORDINATE:
			getCoordinate().clear();
			getCoordinate().addAll((Collection<? extends Double>) newValue);
			return;
		case EcoreA1Package.LISTING__USER:
			setUser((User) newValue);
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
		case EcoreA1Package.LISTING__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case EcoreA1Package.LISTING__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EcoreA1Package.LISTING__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case EcoreA1Package.LISTING__MODIFIED_AT:
			setModified_At(MODIFIED_AT_EDEFAULT);
			return;
		case EcoreA1Package.LISTING__COORDINATE:
			getCoordinate().clear();
			return;
		case EcoreA1Package.LISTING__USER:
			setUser((User) null);
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
		case EcoreA1Package.LISTING__ID:
			return id != ID_EDEFAULT;
		case EcoreA1Package.LISTING__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case EcoreA1Package.LISTING__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EcoreA1Package.LISTING__PRICE:
			return price != PRICE_EDEFAULT;
		case EcoreA1Package.LISTING__MODIFIED_AT:
			return MODIFIED_AT_EDEFAULT == null ? modified_At != null : !MODIFIED_AT_EDEFAULT.equals(modified_At);
		case EcoreA1Package.LISTING__COORDINATE:
			return coordinate != null && !coordinate.isEmpty();
		case EcoreA1Package.LISTING__USER:
			return user != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", Title: ");
		result.append(title);
		result.append(", Description: ");
		result.append(description);
		result.append(", Price: ");
		result.append(price);
		result.append(", Modified_At: ");
		result.append(modified_At);
		result.append(", Coordinate: ");
		result.append(coordinate);
		result.append(')');
		return result.toString();
	}

} //ListingImpl
