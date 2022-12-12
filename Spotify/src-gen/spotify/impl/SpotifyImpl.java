/**
 */
package spotify.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import spotify.Artist;
import spotify.Spotify;
import spotify.SpotifyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spotify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify.impl.SpotifyImpl#getArtist <em>Artist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpotifyImpl extends MinimalEObjectImpl.Container implements Spotify {
	/**
	 * The cached value of the '{@link #getArtist() <em>Artist</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> artist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpotifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpotifyPackage.Literals.SPOTIFY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artist> getArtist() {
		if (artist == null) {
			artist = new EObjectResolvingEList<Artist>(Artist.class, this, SpotifyPackage.SPOTIFY__ARTIST);
		}
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpotifyPackage.SPOTIFY__ARTIST:
			return getArtist();
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
		case SpotifyPackage.SPOTIFY__ARTIST:
			getArtist().clear();
			getArtist().addAll((Collection<? extends Artist>) newValue);
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
		case SpotifyPackage.SPOTIFY__ARTIST:
			getArtist().clear();
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
		case SpotifyPackage.SPOTIFY__ARTIST:
			return artist != null && !artist.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpotifyImpl
