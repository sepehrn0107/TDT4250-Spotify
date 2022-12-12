/**
 */
package spotify;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify.Playlist#getName <em>Name</em>}</li>
 *   <li>{@link spotify.Playlist#getID <em>ID</em>}</li>
 *   <li>{@link spotify.Playlist#getTrackInPlaylist <em>Track In Playlist</em>}</li>
 *   <li>{@link spotify.Playlist#getDescription <em>Description</em>}</li>
 *   <li>{@link spotify.Playlist#getFollowers <em>Followers</em>}</li>
 *   <li>{@link spotify.Playlist#isPublic <em>Public</em>}</li>
 * </ul>
 *
 * @see spotify.SpotifyPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spotify.SpotifyPackage#getPlaylist_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spotify.Playlist#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see spotify.SpotifyPackage#getPlaylist_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link spotify.Playlist#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Track In Playlist</b></em>' reference list.
	 * The list contents are of type {@link spotify.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track In Playlist</em>' reference list.
	 * @see spotify.SpotifyPackage#getPlaylist_TrackInPlaylist()
	 * @model required="true"
	 * @generated
	 */
	EList<Track> getTrackInPlaylist();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see spotify.SpotifyPackage#getPlaylist_Description()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link spotify.Playlist#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' attribute.
	 * @see #setFollowers(int)
	 * @see spotify.SpotifyPackage#getPlaylist_Followers()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getFollowers();

	/**
	 * Sets the value of the '{@link spotify.Playlist#getFollowers <em>Followers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Followers</em>' attribute.
	 * @see #getFollowers()
	 * @generated
	 */
	void setFollowers(int value);

	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' attribute.
	 * @see #setPublic(boolean)
	 * @see spotify.SpotifyPackage#getPlaylist_Public()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isPublic();

	/**
	 * Sets the value of the '{@link spotify.Playlist#isPublic <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' attribute.
	 * @see #isPublic()
	 * @generated
	 */
	void setPublic(boolean value);

} // Playlist
