package com.ravis.senexa.network;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 92\u00020\u0001:\u0003789B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0013J/\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0013J/\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0013J/\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\'\u0010!\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0018\u0010$\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJO\u0010%\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010\'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010*JO\u0010+\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010\'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010*JO\u0010,\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010\'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010.2\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010/J;\u00100\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010.2\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u00101J;\u00102\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010.2\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u00101J1\u00103\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0013J1\u00104\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010,\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\rJ4\u00100\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010.2\b\u00106\u001a\u0004\u0018\u00010\rJ\u0018\u00100\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\rJ4\u00102\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010.2\b\u00106\u001a\u0004\u0018\u00010\rJ \u00102\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/ravis/senexa/network/ApiManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "requestNetwork", "Lcom/ravis/senexa/network/utility/RequestNetwork;", "globalSearch", "", "text", "", "listener", "Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;", "searchSongs", "query", "page", "", "limit", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;)V", "searchAlbums", "searchArtists", "searchPlaylists", "retrieveSongsByIds", "ids", "retrieveSongByLink", "link", "retrieveSongById", "id", "lyrics", "", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;)V", "retrieveLyricsById", "retrieveSongSuggestions", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;)V", "retrieveAlbumById", "retrieveAlbumByLink", "retrieveArtistsById", "songCount", "albumCount", "sortBy", "sortOrder", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;)V", "retrieveArtistsByLink", "retrieveArtistById", "Lcom/ravis/senexa/network/ApiManager$SortBy;", "Lcom/ravis/senexa/network/ApiManager$SortOrder;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/ravis/senexa/network/ApiManager$SortBy;Lcom/ravis/senexa/network/ApiManager$SortOrder;Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;)V", "retrieveArtistSongs", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/ravis/senexa/network/ApiManager$SortBy;Lcom/ravis/senexa/network/ApiManager$SortOrder;Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;)V", "retrieveArtistAlbums", "retrievePlaylistById", "retrievePlaylistByLink", "artistId", "requestListener", "SortBy", "SortOrder", "Companion", "app_nofirebaseDebug"})
public final class ApiManager {
    @org.jetbrains.annotations.NotNull()
    private final com.ravis.senexa.network.utility.RequestNetwork requestNetwork = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://melotune.lulli.qzz.io/api/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SEARCH_URL = "https://melotune.lulli.qzz.io/api/search";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SONGS = "/songs";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ALBUMS = "/albums";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARTISTS = "/artists";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PLAYLISTS = "/playlists";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SONGS_URL = "https://melotune.lulli.qzz.io/api/songs";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ALBUMS_URL = "https://melotune.lulli.qzz.io/api/albums";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARTISTS_URL = "https://melotune.lulli.qzz.io/api/artists";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PLAYLISTS_URL = "https://melotune.lulli.qzz.io/api/playlists";
    @org.jetbrains.annotations.NotNull()
    public static final com.ravis.senexa.network.ApiManager.Companion Companion = null;
    
    public ApiManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    public final void globalSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void searchSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.NotNull()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void searchAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.NotNull()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void searchArtists(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.NotNull()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void searchPlaylists(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.NotNull()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveSongsByIds(@org.jetbrains.annotations.NotNull()
    java.lang.String ids, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveSongByLink(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveSongById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean lyrics, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveLyricsById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveSongSuggestions(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveAlbumById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveAlbumByLink(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveArtistsById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer songCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer albumCount, @org.jetbrains.annotations.Nullable()
    java.lang.String sortBy, @org.jetbrains.annotations.Nullable()
    java.lang.String sortOrder, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveArtistsByLink(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer songCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer albumCount, @org.jetbrains.annotations.Nullable()
    java.lang.String sortBy, @org.jetbrains.annotations.Nullable()
    java.lang.String sortOrder, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveArtistById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer songCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer albumCount, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortBy sortBy, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortOrder sortOrder, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveArtistSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortBy sortBy, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortOrder sortOrder, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveArtistAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortBy sortBy, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortOrder sortOrder, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrievePlaylistById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrievePlaylistByLink(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener listener) {
    }
    
    public final void retrieveArtistById(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener requestListener) {
    }
    
    public final void retrieveArtistSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, int page, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortBy sortBy, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortOrder sortOrder, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener requestListener) {
    }
    
    public final void retrieveArtistSongs(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener requestListener) {
    }
    
    public final void retrieveArtistAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, int page, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortBy sortBy, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.ApiManager.SortOrder sortOrder, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener requestListener) {
    }
    
    public final void retrieveArtistAlbums(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, int page, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener requestListener) {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/ravis/senexa/network/ApiManager$Companion;", "", "<init>", "()V", "BASE_URL", "", "SEARCH_URL", "SONGS", "ALBUMS", "ARTISTS", "PLAYLISTS", "SONGS_URL", "ALBUMS_URL", "ARTISTS_URL", "PLAYLISTS_URL", "app_nofirebaseDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ravis/senexa/network/ApiManager$SortBy;", "", "<init>", "(Ljava/lang/String;I)V", "popularity", "latest", "alphabetical", "app_nofirebaseDebug"})
    public static enum SortBy {
        /*public static final*/ popularity /* = new popularity() */,
        /*public static final*/ latest /* = new latest() */,
        /*public static final*/ alphabetical /* = new alphabetical() */;
        
        SortBy() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.ravis.senexa.network.ApiManager.SortBy> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/ravis/senexa/network/ApiManager$SortOrder;", "", "<init>", "(Ljava/lang/String;I)V", "asc", "desc", "app_nofirebaseDebug"})
    public static enum SortOrder {
        /*public static final*/ asc /* = new asc() */,
        /*public static final*/ desc /* = new desc() */;
        
        SortOrder() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.ravis.senexa.network.ApiManager.SortOrder> getEntries() {
            return null;
        }
    }
}