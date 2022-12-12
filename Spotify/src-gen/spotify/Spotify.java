/**
 */
package spotify;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spotify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify.Spotify#getArtist <em>Artist</em>}</li>
 * </ul>
 *
 * @see spotify.SpotifyPackage#getSpotify()
 * @model
 * @generated
 */
public interface Spotify extends EObject {
	/**
	 * Returns the value of the '<em><b>Artist</b></em>' reference list.
	 * The list contents are of type {@link spotify.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' reference list.
	 * @see spotify.SpotifyPackage#getSpotify_Artist()
	 * @model
	 * @generated
	 */
	EList<Artist> getArtist();

} // Spotify
