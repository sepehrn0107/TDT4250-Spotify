/**
 */
package ecoreA1;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.Listing#getID <em>ID</em>}</li>
 *   <li>{@link ecoreA1.Listing#getTitle <em>Title</em>}</li>
 *   <li>{@link ecoreA1.Listing#getDescription <em>Description</em>}</li>
 *   <li>{@link ecoreA1.Listing#getPrice <em>Price</em>}</li>
 *   <li>{@link ecoreA1.Listing#getModified_At <em>Modified At</em>}</li>
 *   <li>{@link ecoreA1.Listing#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link ecoreA1.Listing#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getListing()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PriceNotNegative'"
 * @generated
 */
public interface Listing extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see ecoreA1.EcoreA1Package#getListing_ID()
	 * @model id="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	int getID();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ecoreA1.EcoreA1Package#getListing_Title()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ecoreA1.Listing#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ecoreA1.EcoreA1Package#getListing_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ecoreA1.Listing#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see ecoreA1.EcoreA1Package#getListing_Price()
	 * @model unique="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link ecoreA1.Listing#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Modified At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified At</em>' attribute.
	 * @see #setModified_At(Date)
	 * @see ecoreA1.EcoreA1Package#getListing_Modified_At()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Date getModified_At();

	/**
	 * Sets the value of the '{@link ecoreA1.Listing#getModified_At <em>Modified At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified At</em>' attribute.
	 * @see #getModified_At()
	 * @generated
	 */
	void setModified_At(Date value);

	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' attribute list.
	 * @see ecoreA1.EcoreA1Package#getListing_Coordinate()
	 * @model unique="false" lower="2" upper="2"
	 * @generated
	 */
	EList<Double> getCoordinate();

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ecoreA1.User#getListing <em>Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see ecoreA1.EcoreA1Package#getListing_User()
	 * @see ecoreA1.User#getListing
	 * @model opposite="listing" required="true" ordered="false"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link ecoreA1.Listing#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // Listing
