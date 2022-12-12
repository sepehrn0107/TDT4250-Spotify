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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spotify.Album;
import spotify.Artist;
import spotify.SpotifyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify.impl.ArtistImpl#getArtistAlbum <em>Artist Album</em>}</li>
 *   <li>{@link spotify.impl.ArtistImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link spotify.impl.ArtistImpl#getGenres <em>Genres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtistImpl extends AccountImpl implements Artist {
	/**
	 * The cached value of the '{@link #getArtistAlbum() <em>Artist Album</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtistAlbum()
	 * @generated
	 * @ordered
	 */
	protected EList<Album> artistAlbum;

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
	 * The default value of the '{@link #getGenres() <em>Genres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenres()
	 * @generated
	 * @ordered
	 */
	protected static final String GENRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenres() <em>Genres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenres()
	 * @generated
	 * @ordered
	 */
	protected String genres = GENRES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpotifyPackage.Literals.ARTIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Album> getArtistAlbum() {
		if (artistAlbum == null) {
			artistAlbum = new EObjectContainmentEList<Album>(Album.class, this, SpotifyPackage.ARTIST__ARTIST_ALBUM);
		}
		return artistAlbum;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.ARTIST__FOLLOWERS, oldFollowers,
					followers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenres() {
		return genres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenres(String newGenres) {
		String oldGenres = genres;
		genres = newGenres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.ARTIST__GENRES, oldGenres, genres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpotifyPackage.ARTIST__ARTIST_ALBUM:
			return ((InternalEList<?>) getArtistAlbum()).basicRemove(otherEnd, msgs);
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
		case SpotifyPackage.ARTIST__ARTIST_ALBUM:
			return getArtistAlbum();
		case SpotifyPackage.ARTIST__FOLLOWERS:
			return getFollowers();
		case SpotifyPackage.ARTIST__GENRES:
			return getGenres();
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
		case SpotifyPackage.ARTIST__ARTIST_ALBUM:
			getArtistAlbum().clear();
			getArtistAlbum().addAll((Collection<? extends Album>) newValue);
			return;
		case SpotifyPackage.ARTIST__FOLLOWERS:
			setFollowers((Integer) newValue);
			return;
		case SpotifyPackage.ARTIST__GENRES:
			setGenres((String) newValue);
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
		case SpotifyPackage.ARTIST__ARTIST_ALBUM:
			getArtistAlbum().clear();
			return;
		case SpotifyPackage.ARTIST__FOLLOWERS:
			setFollowers(FOLLOWERS_EDEFAULT);
			return;
		case SpotifyPackage.ARTIST__GENRES:
			setGenres(GENRES_EDEFAULT);
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
		case SpotifyPackage.ARTIST__ARTIST_ALBUM:
			return artistAlbum != null && !artistAlbum.isEmpty();
		case SpotifyPackage.ARTIST__FOLLOWERS:
			return followers != FOLLOWERS_EDEFAULT;
		case SpotifyPackage.ARTIST__GENRES:
			return GENRES_EDEFAULT == null ? genres != null : !GENRES_EDEFAULT.equals(genres);
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
		result.append(" (Followers: ");
		result.append(followers);
		result.append(", Genres: ");
		result.append(genres);
		result.append(')');
		return result.toString();
	}

} //ArtistImpl
