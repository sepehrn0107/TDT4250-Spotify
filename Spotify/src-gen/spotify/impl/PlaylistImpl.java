/**
 */
package spotify.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spotify.Playlist;
import spotify.SpotifyPackage;
import spotify.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify.impl.PlaylistImpl#getName <em>Name</em>}</li>
 *   <li>{@link spotify.impl.PlaylistImpl#getID <em>ID</em>}</li>
 *   <li>{@link spotify.impl.PlaylistImpl#getTrackInPlaylist <em>Track In Playlist</em>}</li>
 *   <li>{@link spotify.impl.PlaylistImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link spotify.impl.PlaylistImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link spotify.impl.PlaylistImpl#isPublic <em>Public</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaylistImpl extends MinimalEObjectImpl.Container implements Playlist {
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
	 * The cached value of the '{@link #getTrackInPlaylist() <em>Track In Playlist</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackInPlaylist()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> trackInPlaylist;

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
	 * The default value of the '{@link #getFollowers() <em>Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected static final int FOLLOWERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFollowers() <em>Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected int followers = FOLLOWERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean public_ = PUBLIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaylistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpotifyPackage.Literals.PLAYLIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.PLAYLIST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.PLAYLIST__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTrackInPlaylist() {
		if (trackInPlaylist == null) {
			trackInPlaylist = new EObjectResolvingEList<Track>(Track.class, this,
					SpotifyPackage.PLAYLIST__TRACK_IN_PLAYLIST);
		}
		return trackInPlaylist;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.PLAYLIST__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFollowers() {
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowers(int newFollowers) {
		int oldFollowers = followers;
		followers = newFollowers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.PLAYLIST__FOLLOWERS, oldFollowers,
					followers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublic() {
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic(boolean newPublic) {
		boolean oldPublic = public_;
		public_ = newPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.PLAYLIST__PUBLIC, oldPublic, public_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpotifyPackage.PLAYLIST__NAME:
			return getName();
		case SpotifyPackage.PLAYLIST__ID:
			return getID();
		case SpotifyPackage.PLAYLIST__TRACK_IN_PLAYLIST:
			return getTrackInPlaylist();
		case SpotifyPackage.PLAYLIST__DESCRIPTION:
			return getDescription();
		case SpotifyPackage.PLAYLIST__FOLLOWERS:
			return getFollowers();
		case SpotifyPackage.PLAYLIST__PUBLIC:
			return isPublic();
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
		case SpotifyPackage.PLAYLIST__NAME:
			setName((String) newValue);
			return;
		case SpotifyPackage.PLAYLIST__ID:
			setID((String) newValue);
			return;
		case SpotifyPackage.PLAYLIST__TRACK_IN_PLAYLIST:
			getTrackInPlaylist().clear();
			getTrackInPlaylist().addAll((Collection<? extends Track>) newValue);
			return;
		case SpotifyPackage.PLAYLIST__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SpotifyPackage.PLAYLIST__FOLLOWERS:
			setFollowers((Integer) newValue);
			return;
		case SpotifyPackage.PLAYLIST__PUBLIC:
			setPublic((Boolean) newValue);
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
		case SpotifyPackage.PLAYLIST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SpotifyPackage.PLAYLIST__ID:
			setID(ID_EDEFAULT);
			return;
		case SpotifyPackage.PLAYLIST__TRACK_IN_PLAYLIST:
			getTrackInPlaylist().clear();
			return;
		case SpotifyPackage.PLAYLIST__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SpotifyPackage.PLAYLIST__FOLLOWERS:
			setFollowers(FOLLOWERS_EDEFAULT);
			return;
		case SpotifyPackage.PLAYLIST__PUBLIC:
			setPublic(PUBLIC_EDEFAULT);
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
		case SpotifyPackage.PLAYLIST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SpotifyPackage.PLAYLIST__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SpotifyPackage.PLAYLIST__TRACK_IN_PLAYLIST:
			return trackInPlaylist != null && !trackInPlaylist.isEmpty();
		case SpotifyPackage.PLAYLIST__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SpotifyPackage.PLAYLIST__FOLLOWERS:
			return followers != FOLLOWERS_EDEFAULT;
		case SpotifyPackage.PLAYLIST__PUBLIC:
			return public_ != PUBLIC_EDEFAULT;
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
		result.append(", Description: ");
		result.append(description);
		result.append(", Followers: ");
		result.append(followers);
		result.append(", Public: ");
		result.append(public_);
		result.append(')');
		return result.toString();
	}

} //PlaylistImpl
