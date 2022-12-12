/**
 */
package spotify;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify.Artist#getArtistAlbum <em>Artist Album</em>}</li>
 *   <li>{@link spotify.Artist#getFollowers <em>Followers</em>}</li>
 *   <li>{@link spotify.Artist#getGenres <em>Genres</em>}</li>
 * </ul>
 *
 * @see spotify.SpotifyPackage#getArtist()
 * @model
 * @generated
 */
public interface Artist extends Account {
	/**
	 * Returns the value of the '<em><b>Artist Album</b></em>' containment reference list.
	 * The list contents are of type {@link spotify.Album}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist Album</em>' containment reference list.
	 * @see spotify.SpotifyPackage#getArtist_ArtistAlbum()
	 * @model containment="true"
	 * @generated
	 */
	EList<Album> getArtistAlbum();

	/**
	 * Returns the value of the '<em><b>Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' attribute.
	 * @see #setFollowers(int)
	 * @see spotify.SpotifyPackage#getArtist_Followers()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getFollowers();

	/**
	 * Sets the value of the '{@link spotify.Artist#getFollowers <em>Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Followers</em>' attribute.
	 * @see #getFollowers()
	 * @generated
	 */
	void setFollowers(int value);

	/**
	 * Returns the value of the '<em><b>Genres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genres</em>' attribute.
	 * @see #setGenres(String)
	 * @see spotify.SpotifyPackage#getArtist_Genres()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getGenres();

	/**
	 * Sets the value of the '{@link spotify.Artist#getGenres <em>Genres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genres</em>' attribute.
	 * @see #getGenres()
	 * @generated
	 */
	void setGenres(String value);

} // Artist
