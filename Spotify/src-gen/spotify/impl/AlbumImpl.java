/**
 */
package spotify.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spotify.Album;
import spotify.AlbumType;
import spotify.SpotifyPackage;
import spotify.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify.impl.AlbumImpl#getName <em>Name</em>}</li>
 *   <li>{@link spotify.impl.AlbumImpl#getID <em>ID</em>}</li>
 *   <li>{@link spotify.impl.AlbumImpl#getTrackInAlbum <em>Track In Album</em>}</li>
 *   <li>{@link spotify.impl.AlbumImpl#getAlbumType <em>Album Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlbumImpl extends MinimalEObjectImpl.Container implements Album {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrackInAlbum() <em>Track In Album</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackInAlbum()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> trackInAlbum;

	/**
	 * The default value of the '{@link #getAlbumType() <em>Album Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbumType()
	 * @generated
	 * @ordered
	 */
	protected static final AlbumType ALBUM_TYPE_EDEFAULT = AlbumType.ALBUM;

	/**
	 * The cached value of the '{@link #getAlbumType() <em>Album Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbumType()
	 * @generated
	 * @ordered
	 */
	protected AlbumType albumType = ALBUM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpotifyPackage.Literals.ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.ALBUM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.ALBUM__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTrackInAlbum() {
		if (trackInAlbum == null) {
			trackInAlbum = new EObjectContainmentEList<Track>(Track.class, this, SpotifyPackage.ALBUM__TRACK_IN_ALBUM);
		}
		return trackInAlbum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlbumType getAlbumType() {
		return albumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlbumType(AlbumType newAlbumType) {
		AlbumType oldAlbumType = albumType;
		albumType = newAlbumType == null ? ALBUM_TYPE_EDEFAULT : newAlbumType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.ALBUM__ALBUM_TYPE, oldAlbumType,
					albumType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpotifyPackage.ALBUM__TRACK_IN_ALBUM:
			return ((InternalEList<?>) getTrackInAlbum()).basicRemove(otherEnd, msgs);
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
		case SpotifyPackage.ALBUM__NAME:
			return getName();
		case SpotifyPackage.ALBUM__ID:
			return getID();
		case SpotifyPackage.ALBUM__TRACK_IN_ALBUM:
			return getTrackInAlbum();
		case SpotifyPackage.ALBUM__ALBUM_TYPE:
			return getAlbumType();
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
		case SpotifyPackage.ALBUM__NAME:
			setName((String) newValue);
			return;
		case SpotifyPackage.ALBUM__ID:
			setID((String) newValue);
			return;
		case SpotifyPackage.ALBUM__TRACK_IN_ALBUM:
			getTrackInAlbum().clear();
			getTrackInAlbum().addAll((Collection<? extends Track>) newValue);
			return;
		case SpotifyPackage.ALBUM__ALBUM_TYPE:
			setAlbumType((AlbumType) newValue);
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
		case SpotifyPackage.ALBUM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SpotifyPackage.ALBUM__ID:
			setID(ID_EDEFAULT);
			return;
		case SpotifyPackage.ALBUM__TRACK_IN_ALBUM:
			getTrackInAlbum().clear();
			return;
		case SpotifyPackage.ALBUM__ALBUM_TYPE:
			setAlbumType(ALBUM_TYPE_EDEFAULT);
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
		case SpotifyPackage.ALBUM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SpotifyPackage.ALBUM__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SpotifyPackage.ALBUM__TRACK_IN_ALBUM:
			return trackInAlbum != null && !trackInAlbum.isEmpty();
		case SpotifyPackage.ALBUM__ALBUM_TYPE:
			return albumType != ALBUM_TYPE_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", ID: ");
		result.append(id);
		result.append(", AlbumType: ");
		result.append(albumType);
		result.append(')');
		return result.toString();
	}

} //AlbumImpl
