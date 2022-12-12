/**
 */
package spotify;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spotify.SpotifyFactory
 * @model kind="package"
 * @generated
 */
public interface SpotifyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spotify";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/spotify";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spotify";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpotifyPackage eINSTANCE = spotify.impl.SpotifyPackageImpl.init();

	/**
	 * The meta object id for the '{@link spotify.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify.impl.AlbumImpl
	 * @see spotify.impl.SpotifyPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ID = 1;

	/**
	 * The feature id for the '<em><b>Track In Album</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TRACK_IN_ALBUM = 2;

	/**
	 * The feature id for the '<em><b>Album Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ALBUM_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spotify.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify.impl.AccountImpl
	 * @see spotify.impl.SpotifyPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__USER_ID = 1;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spotify.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify.impl.ArtistImpl
	 * @see spotify.impl.SpotifyPackageImpl#getArtist()
	 * @generated
	 */
	int ARTIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__NAME = ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__USER_ID = ACCOUNT__USER_ID;

	/**
	 * The feature id for the '<em><b>Artist Album</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__ARTIST_ALBUM = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__FOLLOWERS = ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Genres</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__GENRES = ACCOUNT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_OPERATION_COUNT = ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spotify.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify.impl.TrackImpl
	 * @see spotify.impl.SpotifyPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 2;

	/**
	 * The feature id for the '<em><b>Available markets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__AVAILABLE_MARKETS = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__EXPLICIT = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__HREF = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = 5;

	/**
	 * The feature id for the '<em><b>Featured artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__FEATURED_ARTISTS = 6;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spotify.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify.impl.PlaylistImpl
	 * @see spotify.impl.SpotifyPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__ID = 1;

	/**
	 * The feature id for the '<em><b>Track In Playlist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__TRACK_IN_PLAYLIST = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__FOLLOWERS = 4;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__PUBLIC = 5;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spotify.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify.impl.UserImpl
	 * @see spotify.impl.SpotifyPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ACCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = ACCOUNT__USER_ID;

	/**
	 * The feature id for the '<em><b>Playlist</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PLAYLIST = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COUNTRY = ACCOUNT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spotify.impl.SpotifyImpl <em>Spotify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify.impl.SpotifyImpl
	 * @see spotify.impl.SpotifyPackageImpl#getSpotify()
	 * @generated
	 */
	int SPOTIFY = 6;

	/**
	 * The feature id for the '<em><b>Account</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY__ACCOUNT = 0;

	/**
	 * The number of structural features of the '<em>Spotify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Spotify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOTIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spotify.AlbumType <em>Album Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spotify.AlbumType
	 * @see spotify.impl.SpotifyPackageImpl#getAlbumType()
	 * @generated
	 */
	int ALBUM_TYPE = 7;

	/**
	 * Returns the meta object for class '{@link spotify.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see spotify.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Album#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify.Album#getName()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Name();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Album#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see spotify.Album#getID()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link spotify.Album#getTrackInAlbum <em>Track In Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Track In Album</em>'.
	 * @see spotify.Album#getTrackInAlbum()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_TrackInAlbum();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Album#getAlbumType <em>Album Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Album Type</em>'.
	 * @see spotify.Album#getAlbumType()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_AlbumType();

	/**
	 * Returns the meta object for class '{@link spotify.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see spotify.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the containment reference list '{@link spotify.Artist#getArtistAlbum <em>Artist Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artist Album</em>'.
	 * @see spotify.Artist#getArtistAlbum()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_ArtistAlbum();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Artist#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Followers</em>'.
	 * @see spotify.Artist#getFollowers()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Followers();

	/**
	 * Returns the meta object for the attribute list '{@link spotify.Artist#getGenres <em>Genres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Genres</em>'.
	 * @see spotify.Artist#getGenres()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Genres();

	/**
	 * Returns the meta object for class '{@link spotify.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see spotify.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the attribute list '{@link spotify.Track#getAvailable_markets <em>Available markets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Available markets</em>'.
	 * @see spotify.Track#getAvailable_markets()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Available_markets();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Track#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see spotify.Track#getDuration()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Duration();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Track#isExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit</em>'.
	 * @see spotify.Track#isExplicit()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Explicit();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Track#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see spotify.Track#getHref()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Href();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Track#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see spotify.Track#getID()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_ID();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Track#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify.Track#getName()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Name();

	/**
	 * Returns the meta object for the reference list '{@link spotify.Track#getFeatured_artists <em>Featured artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Featured artists</em>'.
	 * @see spotify.Track#getFeatured_artists()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Featured_artists();

	/**
	 * Returns the meta object for class '{@link spotify.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see spotify.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Playlist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify.Playlist#getName()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Name();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Playlist#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see spotify.Playlist#getID()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_ID();

	/**
	 * Returns the meta object for the reference list '{@link spotify.Playlist#getTrackInPlaylist <em>Track In Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Track In Playlist</em>'.
	 * @see spotify.Playlist#getTrackInPlaylist()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_TrackInPlaylist();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Playlist#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see spotify.Playlist#getDescription()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Description();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Playlist#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Followers</em>'.
	 * @see spotify.Playlist#getFollowers()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Followers();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Playlist#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see spotify.Playlist#isPublic()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Public();

	/**
	 * Returns the meta object for class '{@link spotify.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see spotify.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Account#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spotify.Account#getName()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Name();

	/**
	 * Returns the meta object for the attribute '{@link spotify.Account#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see spotify.Account#getUserID()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_UserID();

	/**
	 * Returns the meta object for class '{@link spotify.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see spotify.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference list '{@link spotify.User#getPlaylist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Playlist</em>'.
	 * @see spotify.User#getPlaylist()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Playlist();

	/**
	 * Returns the meta object for the attribute '{@link spotify.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see spotify.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link spotify.User#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see spotify.User#getCountry()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Country();

	/**
	 * Returns the meta object for class '{@link spotify.Spotify <em>Spotify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spotify</em>'.
	 * @see spotify.Spotify
	 * @generated
	 */
	EClass getSpotify();

	/**
	 * Returns the meta object for the containment reference list '{@link spotify.Spotify#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Account</em>'.
	 * @see spotify.Spotify#getAccount()
	 * @see #getSpotify()
	 * @generated
	 */
	EReference getSpotify_Account();

	/**
	 * Returns the meta object for enum '{@link spotify.AlbumType <em>Album Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Album Type</em>'.
	 * @see spotify.AlbumType
	 * @generated
	 */
	EEnum getAlbumType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpotifyFactory getSpotifyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spotify.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify.impl.AlbumImpl
		 * @see spotify.impl.SpotifyPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__NAME = eINSTANCE.getAlbum_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__ID = eINSTANCE.getAlbum_ID();

		/**
		 * The meta object literal for the '<em><b>Track In Album</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__TRACK_IN_ALBUM = eINSTANCE.getAlbum_TrackInAlbum();

		/**
		 * The meta object literal for the '<em><b>Album Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__ALBUM_TYPE = eINSTANCE.getAlbum_AlbumType();

		/**
		 * The meta object literal for the '{@link spotify.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify.impl.ArtistImpl
		 * @see spotify.impl.SpotifyPackageImpl#getArtist()
		 * @generated
		 */
		EClass ARTIST = eINSTANCE.getArtist();

		/**
		 * The meta object literal for the '<em><b>Artist Album</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__ARTIST_ALBUM = eINSTANCE.getArtist_ArtistAlbum();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__FOLLOWERS = eINSTANCE.getArtist_Followers();

		/**
		 * The meta object literal for the '<em><b>Genres</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__GENRES = eINSTANCE.getArtist_Genres();

		/**
		 * The meta object literal for the '{@link spotify.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify.impl.TrackImpl
		 * @see spotify.impl.SpotifyPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Available markets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__AVAILABLE_MARKETS = eINSTANCE.getTrack_Available_markets();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__DURATION = eINSTANCE.getTrack_Duration();

		/**
		 * The meta object literal for the '<em><b>Explicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__EXPLICIT = eINSTANCE.getTrack_Explicit();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__HREF = eINSTANCE.getTrack_Href();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__ID = eINSTANCE.getTrack_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__NAME = eINSTANCE.getTrack_Name();

		/**
		 * The meta object literal for the '<em><b>Featured artists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__FEATURED_ARTISTS = eINSTANCE.getTrack_Featured_artists();

		/**
		 * The meta object literal for the '{@link spotify.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify.impl.PlaylistImpl
		 * @see spotify.impl.SpotifyPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__NAME = eINSTANCE.getPlaylist_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__ID = eINSTANCE.getPlaylist_ID();

		/**
		 * The meta object literal for the '<em><b>Track In Playlist</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__TRACK_IN_PLAYLIST = eINSTANCE.getPlaylist_TrackInPlaylist();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__DESCRIPTION = eINSTANCE.getPlaylist_Description();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__FOLLOWERS = eINSTANCE.getPlaylist_Followers();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__PUBLIC = eINSTANCE.getPlaylist_Public();

		/**
		 * The meta object literal for the '{@link spotify.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify.impl.AccountImpl
		 * @see spotify.impl.SpotifyPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__NAME = eINSTANCE.getAccount_Name();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__USER_ID = eINSTANCE.getAccount_UserID();

		/**
		 * The meta object literal for the '{@link spotify.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify.impl.UserImpl
		 * @see spotify.impl.SpotifyPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Playlist</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PLAYLIST = eINSTANCE.getUser_Playlist();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__COUNTRY = eINSTANCE.getUser_Country();

		/**
		 * The meta object literal for the '{@link spotify.impl.SpotifyImpl <em>Spotify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify.impl.SpotifyImpl
		 * @see spotify.impl.SpotifyPackageImpl#getSpotify()
		 * @generated
		 */
		EClass SPOTIFY = eINSTANCE.getSpotify();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOTIFY__ACCOUNT = eINSTANCE.getSpotify_Account();

		/**
		 * The meta object literal for the '{@link spotify.AlbumType <em>Album Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spotify.AlbumType
		 * @see spotify.impl.SpotifyPackageImpl#getAlbumType()
		 * @generated
		 */
		EEnum ALBUM_TYPE = eINSTANCE.getAlbumType();

	}

} //SpotifyPackage
