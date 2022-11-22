/**
 */
package ecoreA1.impl;

import ecoreA1.EcoreA1Package;
import ecoreA1.Finn;
import ecoreA1.Listing;
import ecoreA1.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.impl.FinnImpl#getUser <em>User</em>}</li>
 *   <li>{@link ecoreA1.impl.FinnImpl#getListing <em>Listing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinnImpl extends MinimalEObjectImpl.Container implements Finn {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getListing() <em>Listing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListing()
	 * @generated
	 * @ordered
	 */
	protected EList<Listing> listing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreA1Package.Literals.FINN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, EcoreA1Package.FINN__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Listing> getListing() {
		if (listing == null) {
			listing = new EObjectContainmentEList<Listing>(Listing.class, this, EcoreA1Package.FINN__LISTING);
		}
		return listing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreA1Package.FINN__USER:
			return ((InternalEList<?>) getUser()).basicRemove(otherEnd, msgs);
		case EcoreA1Package.FINN__LISTING:
			return ((InternalEList<?>) getListing()).basicRemove(otherEnd, msgs);
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
		case EcoreA1Package.FINN__USER:
			return getUser();
		case EcoreA1Package.FINN__LISTING:
			return getListing();
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
		case EcoreA1Package.FINN__USER:
			getUser().clear();
			getUser().addAll((Collection<? extends User>) newValue);
			return;
		case EcoreA1Package.FINN__LISTING:
			getListing().clear();
			getListing().addAll((Collection<? extends Listing>) newValue);
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
		case EcoreA1Package.FINN__USER:
			getUser().clear();
			return;
		case EcoreA1Package.FINN__LISTING:
			getListing().clear();
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
		case EcoreA1Package.FINN__USER:
			return user != null && !user.isEmpty();
		case EcoreA1Package.FINN__LISTING:
			return listing != null && !listing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FinnImpl
