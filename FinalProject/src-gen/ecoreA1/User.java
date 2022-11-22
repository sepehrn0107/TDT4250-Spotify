/**
 */
package ecoreA1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.User#getEmail <em>Email</em>}</li>
 *   <li>{@link ecoreA1.User#getPhone <em>Phone</em>}</li>
 *   <li>{@link ecoreA1.User#getName <em>Name</em>}</li>
 *   <li>{@link ecoreA1.User#getListing <em>Listing</em>}</li>
 *   <li>{@link ecoreA1.User#getBuys <em>Buys</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getUser()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectPhoneNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CorrectPhoneNumber='self.Phone.size() = 8' BuyerNotSeller='self.Email &lt;&gt; '"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see ecoreA1.EcoreA1Package#getUser_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link ecoreA1.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see ecoreA1.EcoreA1Package#getUser_Phone()
	 * @model required="true"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link ecoreA1.User#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecoreA1.EcoreA1Package#getUser_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreA1.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Listing</b></em>' reference list.
	 * The list contents are of type {@link ecoreA1.Listing}.
	 * It is bidirectional and its opposite is '{@link ecoreA1.Listing#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listing</em>' reference list.
	 * @see ecoreA1.EcoreA1Package#getUser_Listing()
	 * @see ecoreA1.Listing#getUser
	 * @model opposite="user" changeable="false" ordered="false"
	 * @generated
	 */
	EList<Listing> getListing();

	/**
	 * Returns the value of the '<em><b>Buys</b></em>' reference list.
	 * The list contents are of type {@link ecoreA1.Listing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buys</em>' reference list.
	 * @see ecoreA1.EcoreA1Package#getUser_Buys()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Listing> getBuys();

} // User
