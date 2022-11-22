/**
 */
package ecoreA1.impl;

import ecoreA1.CameraListing;
import ecoreA1.CameraTypes;
import ecoreA1.EcoreA1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.impl.CameraListingImpl#getCameraType <em>Camera Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraListingImpl extends ElectronicListingImpl implements CameraListing {
	/**
	 * The default value of the '{@link #getCameraType() <em>Camera Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraType()
	 * @generated
	 * @ordered
	 */
	protected static final CameraTypes CAMERA_TYPE_EDEFAULT = CameraTypes.HYBRID;

	/**
	 * The cached value of the '{@link #getCameraType() <em>Camera Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraType()
	 * @generated
	 * @ordered
	 */
	protected CameraTypes cameraType = CAMERA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreA1Package.Literals.CAMERA_LISTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraTypes getCameraType() {
		return cameraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraType(CameraTypes newCameraType) {
		CameraTypes oldCameraType = cameraType;
		cameraType = newCameraType == null ? CAMERA_TYPE_EDEFAULT : newCameraType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreA1Package.CAMERA_LISTING__CAMERA_TYPE,
					oldCameraType, cameraType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreA1Package.CAMERA_LISTING__CAMERA_TYPE:
			return getCameraType();
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
		case EcoreA1Package.CAMERA_LISTING__CAMERA_TYPE:
			setCameraType((CameraTypes) newValue);
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
		case EcoreA1Package.CAMERA_LISTING__CAMERA_TYPE:
			setCameraType(CAMERA_TYPE_EDEFAULT);
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
		case EcoreA1Package.CAMERA_LISTING__CAMERA_TYPE:
			return cameraType != CAMERA_TYPE_EDEFAULT;
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
		result.append(" (CameraType: ");
		result.append(cameraType);
		result.append(')');
		return result.toString();
	}

} //CameraListingImpl
