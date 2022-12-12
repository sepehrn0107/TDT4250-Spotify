/**
 */
package spotify;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify.Album#getName <em>Name</em>}</li>
 *   <li>{@link spotify.Album#getID <em>ID</em>}</li>
 *   <li>{@link spotify.Album#getTrackInAlbum <em>Track In Album</em>}</li>
 *   <li>{@link spotify.Album#getAlbumType <em>Album Type</em>}</li>
 * </ul>
 *
 * @see spotify.SpotifyPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spotify.SpotifyPackage#getAlbum_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spotify.Album#getName <em>Name</em>}' attribute.
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
	 * @see spotify.SpotifyPackage#getAlbum_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link spotify.Album#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Track In Album</b></em>' containment reference list.
	 * The list contents are of type {@link spotify.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track In Album</em>' containment reference list.
	 * @see spotify.SpotifyPackage#getAlbum_TrackInAlbum()
	 * @model containment="true"
	 * @generated
	 */
	EList<Track> getTrackInAlbum();

	/**
	 * Returns the value of the '<em><b>Album Type</b></em>' attribute.
	 * The literals are from the enumeration {@link spotify.AlbumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Album Type</em>' attribute.
	 * @see spotify.AlbumType
	 * @see #setAlbumType(AlbumType)
	 * @see spotify.SpotifyPackage#getAlbum_AlbumType()
	 * @model unique="false"
	 * @generated
	 */
	AlbumType getAlbumType();

	/**
	 * Sets the value of the '{@link spotify.Album#getAlbumType <em>Album Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Album Type</em>' attribute.
	 * @see spotify.AlbumType
	 * @see #getAlbumType()
	 * @generated
	 */
	void setAlbumType(AlbumType value);

} // Album
