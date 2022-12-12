/**
 */
package spotify;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spotify.User#getPlaylist <em>Playlist</em>}</li>
 *   <li>{@link spotify.User#getEmail <em>Email</em>}</li>
 *   <li>{@link spotify.User#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see spotify.SpotifyPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Account {
	/**
	 * Returns the value of the '<em><b>Playlist</b></em>' reference list.
	 * The list contents are of type {@link spotify.Playlist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playlist</em>' reference list.
	 * @see spotify.SpotifyPackage#getUser_Playlist()
	 * @model
	 * @generated
	 */
	EList<Playlist> getPlaylist();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see spotify.SpotifyPackage#getUser_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link spotify.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see spotify.SpotifyPackage#getUser_Country()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link spotify.User#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // User
