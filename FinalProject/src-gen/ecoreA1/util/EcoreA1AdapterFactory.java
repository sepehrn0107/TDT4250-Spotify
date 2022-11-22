/**
 */
package ecoreA1.util;

import ecoreA1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecoreA1.EcoreA1Package
 * @generated
 */
public class EcoreA1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcoreA1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreA1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcoreA1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreA1Switch<Adapter> modelSwitch = new EcoreA1Switch<Adapter>() {
		@Override
		public Adapter caseListing(Listing object) {
			return createListingAdapter();
		}

		@Override
		public Adapter caseBikeListing(BikeListing object) {
			return createBikeListingAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseClothesListing(ClothesListing object) {
			return createClothesListingAdapter();
		}

		@Override
		public Adapter caseFinn(Finn object) {
			return createFinnAdapter();
		}

		@Override
		public Adapter caseElectronicListing(ElectronicListing object) {
			return createElectronicListingAdapter();
		}

		@Override
		public Adapter caseSportListing(SportListing object) {
			return createSportListingAdapter();
		}

		@Override
		public Adapter casePetListing(PetListing object) {
			return createPetListingAdapter();
		}

		@Override
		public Adapter caseCameraListing(CameraListing object) {
			return createCameraListingAdapter();
		}

		@Override
		public Adapter casePhoneListing(PhoneListing object) {
			return createPhoneListingAdapter();
		}

		@Override
		public Adapter casePrivateUser(PrivateUser object) {
			return createPrivateUserAdapter();
		}

		@Override
		public Adapter caseCompanyUser(CompanyUser object) {
			return createCompanyUserAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.Listing <em>Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.Listing
	 * @generated
	 */
	public Adapter createListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.BikeListing <em>Bike Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.BikeListing
	 * @generated
	 */
	public Adapter createBikeListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.ClothesListing <em>Clothes Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.ClothesListing
	 * @generated
	 */
	public Adapter createClothesListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.Finn <em>Finn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.Finn
	 * @generated
	 */
	public Adapter createFinnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.ElectronicListing <em>Electronic Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.ElectronicListing
	 * @generated
	 */
	public Adapter createElectronicListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.SportListing <em>Sport Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.SportListing
	 * @generated
	 */
	public Adapter createSportListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.PetListing <em>Pet Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.PetListing
	 * @generated
	 */
	public Adapter createPetListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.CameraListing <em>Camera Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.CameraListing
	 * @generated
	 */
	public Adapter createCameraListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.PhoneListing <em>Phone Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.PhoneListing
	 * @generated
	 */
	public Adapter createPhoneListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.PrivateUser <em>Private User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.PrivateUser
	 * @generated
	 */
	public Adapter createPrivateUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecoreA1.CompanyUser <em>Company User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecoreA1.CompanyUser
	 * @generated
	 */
	public Adapter createCompanyUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EcoreA1AdapterFactory
