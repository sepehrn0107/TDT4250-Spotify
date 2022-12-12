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
 *   <li>{@link spotify.Spotify#getAccount <em>Account</em>}</li>
 * </ul>
 *
 * @see spotify.SpotifyPackage#getSpotify()
 * @model
 * @generated
 */
public interface Spotify extends EObject {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference list.
	 * The list contents are of type {@link spotify.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' containment reference list.
	 * @see spotify.SpotifyPackage#getSpotify_Account()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccount();

} // Spotify
