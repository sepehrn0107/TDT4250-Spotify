/**
 */
package spotify.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spotify.Artist;
import spotify.SpotifyPackage;
import spotify.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spotify.impl.TrackImpl#getAvailable_markets <em>Available markets</em>}</li>
 *   <li>{@link spotify.impl.TrackImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link spotify.impl.TrackImpl#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link spotify.impl.TrackImpl#getHref <em>Href</em>}</li>
 *   <li>{@link spotify.impl.TrackImpl#getID <em>ID</em>}</li>
 *   <li>{@link spotify.impl.TrackImpl#getName <em>Name</em>}</li>
 *   <li>{@link spotify.impl.TrackImpl#getFeatured_artists <em>Featured artists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackImpl extends MinimalEObjectImpl.Container implements Track {
	/**
	 * The cached value of the '{@link #getAvailable_markets() <em>Available markets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailable_markets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> available_markets;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isExplicit() <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicit() <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicit()
	 * @generated
	 * @ordered
	 */
	protected boolean explicit = EXPLICIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatured_artists() <em>Featured artists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatured_artists()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> featured_artists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpotifyPackage.Literals.TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailable_markets() {
		if (available_markets == null) {
			available_markets = new EDataTypeEList<String>(String.class, this, SpotifyPackage.TRACK__AVAILABLE_MARKETS);
		}
		return available_markets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.TRACK__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicit() {
		return explicit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicit(boolean newExplicit) {
		boolean oldExplicit = explicit;
		explicit = newExplicit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.TRACK__EXPLICIT, oldExplicit,
					explicit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.TRACK__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.TRACK__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpotifyPackage.TRACK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artist> getFeatured_artists() {
		if (featured_artists == null) {
			featured_artists = new EObjectResolvingEList<Artist>(Artist.class, this,
					SpotifyPackage.TRACK__FEATURED_ARTISTS);
		}
		return featured_artists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpotifyPackage.TRACK__AVAILABLE_MARKETS:
			return getAvailable_markets();
		case SpotifyPackage.TRACK__DURATION:
			return getDuration();
		case SpotifyPackage.TRACK__EXPLICIT:
			return isExplicit();
		case SpotifyPackage.TRACK__HREF:
			return getHref();
		case SpotifyPackage.TRACK__ID:
			return getID();
		case SpotifyPackage.TRACK__NAME:
			return getName();
		case SpotifyPackage.TRACK__FEATURED_ARTISTS:
			return getFeatured_artists();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpotifyPackage.TRACK__AVAILABLE_MARKETS:
			getAvailable_markets().clear();
			getAvailable_markets().addAll((Collection<? extends String>) newValue);
			return;
		case SpotifyPackage.TRACK__DURATION:
			setDuration((Integer) newValue);
			return;
		case SpotifyPackage.TRACK__EXPLICIT:
			setExplicit((Boolean) newValue);
			return;
		case SpotifyPackage.TRACK__HREF:
			setHref((String) newValue);
			return;
		case SpotifyPackage.TRACK__ID:
			setID((String) newValue);
			return;
		case SpotifyPackage.TRACK__NAME:
			setName((String) newValue);
			return;
		case SpotifyPackage.TRACK__FEATURED_ARTISTS:
			getFeatured_artists().clear();
			getFeatured_artists().addAll((Collection<? extends Artist>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpotifyPackage.TRACK__AVAILABLE_MARKETS:
			getAvailable_markets().clear();
			return;
		case SpotifyPackage.TRACK__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case SpotifyPackage.TRACK__EXPLICIT:
			setExplicit(EXPLICIT_EDEFAULT);
			return;
		case SpotifyPackage.TRACK__HREF:
			setHref(HREF_EDEFAULT);
			return;
		case SpotifyPackage.TRACK__ID:
			setID(ID_EDEFAULT);
			return;
		case SpotifyPackage.TRACK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SpotifyPackage.TRACK__FEATURED_ARTISTS:
			getFeatured_artists().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpotifyPackage.TRACK__AVAILABLE_MARKETS:
			return available_markets != null && !available_markets.isEmpty();
		case SpotifyPackage.TRACK__DURATION:
			return duration != DURATION_EDEFAULT;
		case SpotifyPackage.TRACK__EXPLICIT:
			return explicit != EXPLICIT_EDEFAULT;
		case SpotifyPackage.TRACK__HREF:
			return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
		case SpotifyPackage.TRACK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SpotifyPackage.TRACK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SpotifyPackage.TRACK__FEATURED_ARTISTS:
			return featured_artists != null && !featured_artists.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (available_markets: ");
		result.append(available_markets);
		result.append(", Duration: ");
		result.append(duration);
		result.append(", Explicit: ");
		result.append(explicit);
		result.append(", href: ");
		result.append(href);
		result.append(", ID: ");
		result.append(id);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TrackImpl
