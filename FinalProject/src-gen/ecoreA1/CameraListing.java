/**
 */
package ecoreA1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreA1.CameraListing#getCameraType <em>Camera Type</em>}</li>
 * </ul>
 *
 * @see ecoreA1.EcoreA1Package#getCameraListing()
 * @model
 * @generated
 */
public interface CameraListing extends ElectronicListing {
	/**
	 * Returns the value of the '<em><b>Camera Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ecoreA1.CameraTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Type</em>' attribute.
	 * @see ecoreA1.CameraTypes
	 * @see #setCameraType(CameraTypes)
	 * @see ecoreA1.EcoreA1Package#getCameraListing_CameraType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	CameraTypes getCameraType();

	/**
	 * Sets the value of the '{@link ecoreA1.CameraListing#getCameraType <em>Camera Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera Type</em>' attribute.
	 * @see ecoreA1.CameraTypes
	 * @see #getCameraType()
	 * @generated
	 */
	void setCameraType(CameraTypes value);

} // CameraListing
