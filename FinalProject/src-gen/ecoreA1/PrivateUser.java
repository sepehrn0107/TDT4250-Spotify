/**
 */
package ecoreA1;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.PrivateUser#getFavorites <em>Favorites</em>}</li>
 *   <li>{@link ecoreA1.PrivateUser#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link ecoreA1.PrivateUser#getGender <em>Gender</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getPrivateUser()
 * @model
 * @generated
 */
public interface PrivateUser extends User {
	/**
	 * Returns the value of the '<em><b>Favorites</b></em>' reference list.
	 * The list contents are of type {@link ecoreA1.Listing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Favorites</em>' reference list.
	 * @see ecoreA1.EcoreA1Package#getPrivateUser_Favorites()
	 * @model
	 * @generated
	 */
	EList<Listing> getFavorites();

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(Date)
	 * @see ecoreA1.EcoreA1Package#getPrivateUser_DateOfBirth()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Date getDateOfBirth();

	/**
	 * Sets the value of the '{@link ecoreA1.PrivateUser#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(Date value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.GenderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see ecoreA1.GenderType
	 * @see #setGender(GenderType)
	 * @see ecoreA1.EcoreA1Package#getPrivateUser_Gender()
	 * @model unique="false" required="true"
	 * @generated
	 */
	GenderType getGender();

	/**
	 * Sets the value of the '{@link ecoreA1.PrivateUser#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see ecoreA1.GenderType
	 * @see #getGender()
	 * @generated
	 */
	void setGender(GenderType value);

} // PrivateUser
