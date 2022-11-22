/**
 */
package ecoreA1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.Finn#getUser <em>User</em>}</li>
 *   <li>{@link ecoreA1.Finn#getListing <em>Listing</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getFinn()
 * @model
 * @generated
 */
public interface Finn extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreA1.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see ecoreA1.EcoreA1Package#getFinn_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Listing</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreA1.Listing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listing</em>' containment reference list.
	 * @see ecoreA1.EcoreA1Package#getFinn_Listing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Listing> getListing();

} // Finn
