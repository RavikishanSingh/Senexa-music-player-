package com.ravis.senexa.utils;

/**
 * Drop-in replacement for your old SharedPreferenceManager that uses Room.
 *
 * Notes:
 * - This keeps the same public API-method names so you can replace the file with minimal changes.
 * - For compatibility this version allows main-thread DB queries (allowMainThreadQueries).
 * This is convenient for drop-in replacement but not recommended for long-term (remove it later
 * and call write/read methods on background threads).
 * - Run migrateFromOldPrefs(context, onComplete) once (e.g. in Application.onCreate) to move
 * existing entries from SharedPreferences named "cache" into Room. After verifying, call
 * clearOldPrefsAsync(context, onComplete) to free space.
 */
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 m2\u00020\u0001:\u0004jklmB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010;\u001a\u00020\u00182\b\u0010<\u001a\u0004\u0018\u00010\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010=J\u0012\u0010>\u001a\u0004\u0018\u00010=2\b\u0010<\u001a\u0004\u0018\u00010\u0011J\u0010\u0010?\u001a\u00020\u001d2\b\u0010<\u001a\u0004\u0018\u00010\u0011J\u001a\u0010@\u001a\u00020\u00182\b\u0010<\u001a\u0004\u0018\u00010\u00112\b\u0010A\u001a\u0004\u0018\u00010BJ\u0012\u0010C\u001a\u0004\u0018\u00010B2\b\u0010<\u001a\u0004\u0018\u00010\u0011J\u001a\u0010D\u001a\u00020\u00182\b\u0010<\u001a\u0004\u0018\u00010\u00112\b\u0010E\u001a\u0004\u0018\u00010FJ\u0012\u0010G\u001a\u0004\u0018\u00010F2\b\u0010<\u001a\u0004\u0018\u00010\u0011J\u0010\u0010U\u001a\u00020\u00182\b\u0010V\u001a\u0004\u0018\u00010WJ\u000e\u0010X\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020ZJ\u001a\u0010[\u001a\u00020\u00182\b\u0010<\u001a\u0004\u0018\u00010\u00112\b\u0010V\u001a\u0004\u0018\u00010WJ\u0012\u0010\\\u001a\u0004\u0018\u00010W2\b\u0010<\u001a\u0004\u0018\u00010\u0011J\u001a\u0010]\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010^\u001a\u0004\u0018\u00010_J\u0012\u0010`\u001a\u0004\u0018\u00010_2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u001a\u0010a\u001a\u00020\u00182\b\u0010b\u001a\u0004\u0018\u00010\u00112\b\u0010c\u001a\u0004\u0018\u00010dJ\u0012\u0010e\u001a\u0004\u0018\u00010d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011J\u0018\u0010f\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010g\u001a\u0004\u0018\u00010hJ\u0018\u0010i\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010g\u001a\u0004\u0018\u00010hR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010(\u001a\u0004\u0018\u00010\'2\b\u0010&\u001a\u0004\u0018\u00010\'8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010/\u001a\u0004\u0018\u00010.2\b\u0010-\u001a\u0004\u0018\u00010.8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00106\u001a\u0004\u0018\u0001052\b\u00104\u001a\u0004\u0018\u0001058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010I\u001a\u0004\u0018\u00010\u00112\b\u0010H\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010P\u001a\u0004\u0018\u00010O2\b\u0010N\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T\u00a8\u0006n"}, d2 = {"Lcom/ravis/senexa/utils/SharedPreferenceManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "db", "Lcom/ravis/senexa/utils/SharedPreferenceManager$AppDatabase;", "dao", "Lcom/ravis/senexa/utils/SharedPreferenceManager$KeyValueDao;", "gson", "Lcom/google/gson/Gson;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "keyForSearch", "", "query", "keyForArtistData", "artistId", "now", "", "putJson", "", "key", "json", "getJson", "containsKey", "", "removeKey", "songSearch", "Lcom/ravis/senexa/records/SongSearch;", "homeSongsRecommended", "getHomeSongsRecommended", "()Lcom/ravis/senexa/records/SongSearch;", "setHomeSongsRecommended", "(Lcom/ravis/senexa/records/SongSearch;)V", "artistsRecommended", "Lcom/ravis/senexa/records/ArtistsSearch;", "homeArtistsRecommended", "getHomeArtistsRecommended", "()Lcom/ravis/senexa/records/ArtistsSearch;", "setHomeArtistsRecommended", "(Lcom/ravis/senexa/records/ArtistsSearch;)V", "albumsSearch", "Lcom/ravis/senexa/records/AlbumsSearch;", "homeAlbumsRecommended", "getHomeAlbumsRecommended", "()Lcom/ravis/senexa/records/AlbumsSearch;", "setHomeAlbumsRecommended", "(Lcom/ravis/senexa/records/AlbumsSearch;)V", "playlistsSearch", "Lcom/ravis/senexa/records/PlaylistsSearch;", "homePlaylistRecommended", "getHomePlaylistRecommended", "()Lcom/ravis/senexa/records/PlaylistsSearch;", "setHomePlaylistRecommended", "(Lcom/ravis/senexa/records/PlaylistsSearch;)V", "setSongResponseById", "id", "Lcom/ravis/senexa/records/SongResponse;", "getSongResponseById", "isSongResponseById", "setAlbumResponseById", "albumSearch", "Lcom/ravis/senexa/records/AlbumSearch;", "getAlbumResponseById", "setPlaylistResponseById", "playlistSearch", "Lcom/ravis/senexa/records/PlaylistSearch;", "getPlaylistResponseById", "string", "trackQuality", "getTrackQuality", "()Ljava/lang/String;", "setTrackQuality", "(Ljava/lang/String;)V", "savedLibraries", "Lcom/ravis/senexa/records/sharedpref/SavedLibraries;", "savedLibrariesData", "getSavedLibrariesData", "()Lcom/ravis/senexa/records/sharedpref/SavedLibraries;", "setSavedLibrariesData", "(Lcom/ravis/senexa/records/sharedpref/SavedLibraries;)V", "addLibraryToSavedLibraries", "library", "Lcom/ravis/senexa/records/sharedpref/SavedLibraries$Library;", "removeLibraryFromSavedLibraries", "index", "", "setSavedLibraryDataById", "getSavedLibraryDataById", "setSearchResultCache", "searchResult", "Lcom/ravis/senexa/records/GlobalSearch;", "getSearchResult", "setArtistData", "artistID", "artistSearch", "Lcom/ravis/senexa/records/ArtistSearch;", "getArtistData", "migrateFromOldPrefs", "onComplete", "Ljava/lang/Runnable;", "clearOldPrefsAsync", "KeyValue", "KeyValueDao", "AppDatabase", "Companion", "app_prodDebug"})
public final class SharedPreferenceManager {
    @org.jetbrains.annotations.NotNull()
    private final com.ravis.senexa.utils.SharedPreferenceManager.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ravis.senexa.utils.SharedPreferenceManager.KeyValueDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.Nullable()
    private static com.ravis.senexa.utils.SharedPreferenceManager instance;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String OLD_PREFS_NAME = "cache";
    @org.jetbrains.annotations.NotNull()
    public static final com.ravis.senexa.utils.SharedPreferenceManager.Companion Companion = null;
    
    private SharedPreferenceManager(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    private final java.lang.String keyForSearch(java.lang.String query) {
        return null;
    }
    
    private final java.lang.String keyForArtistData(java.lang.String artistId) {
        return null;
    }
    
    private final long now() {
        return 0L;
    }
    
    private final void putJson(java.lang.String key, java.lang.String json) {
    }
    
    private final java.lang.String getJson(java.lang.String key) {
        return null;
    }
    
    private final boolean containsKey(java.lang.String key) {
        return false;
    }
    
    private final void removeKey(java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.SongSearch getHomeSongsRecommended() {
        return null;
    }
    
    public final void setHomeSongsRecommended(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.SongSearch songSearch) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.ArtistsSearch getHomeArtistsRecommended() {
        return null;
    }
    
    public final void setHomeArtistsRecommended(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.ArtistsSearch artistsRecommended) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.AlbumsSearch getHomeAlbumsRecommended() {
        return null;
    }
    
    public final void setHomeAlbumsRecommended(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.AlbumsSearch albumsSearch) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.PlaylistsSearch getHomePlaylistRecommended() {
        return null;
    }
    
    public final void setHomePlaylistRecommended(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.PlaylistsSearch playlistsSearch) {
    }
    
    public final void setSongResponseById(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.SongResponse songSearch) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.SongResponse getSongResponseById(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return null;
    }
    
    public final boolean isSongResponseById(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return false;
    }
    
    public final void setAlbumResponseById(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.AlbumSearch albumSearch) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.AlbumSearch getAlbumResponseById(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return null;
    }
    
    public final void setPlaylistResponseById(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.PlaylistSearch playlistSearch) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.PlaylistSearch getPlaylistResponseById(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTrackQuality() {
        return null;
    }
    
    public final void setTrackQuality(@org.jetbrains.annotations.Nullable()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.sharedpref.SavedLibraries getSavedLibrariesData() {
        return null;
    }
    
    public final void setSavedLibrariesData(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.sharedpref.SavedLibraries savedLibraries) {
    }
    
    public final void addLibraryToSavedLibraries(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.sharedpref.SavedLibraries.Library library) {
    }
    
    public final void removeLibraryFromSavedLibraries(int index) {
    }
    
    public final void setSavedLibraryDataById(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.sharedpref.SavedLibraries.Library library) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.sharedpref.SavedLibraries.Library getSavedLibraryDataById(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return null;
    }
    
    public final void setSearchResultCache(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.GlobalSearch searchResult) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.GlobalSearch getSearchResult(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return null;
    }
    
    public final void setArtistData(@org.jetbrains.annotations.Nullable()
    java.lang.String artistID, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.records.ArtistSearch artistSearch) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.records.ArtistSearch getArtistData(@org.jetbrains.annotations.Nullable()
    java.lang.String artistId) {
        return null;
    }
    
    /**
     * Migrate all entries from the old SharedPreferences named "cache" into Room.
     * This runs synchronously (it can be called from Application.onCreate). It iterates all keys
     * in the old prefs and upserts their value (strings/primitives) into Room under the same key.
     *
     * You can pass a Runnable for onComplete which will run after migration (on the caller thread).
     * Recommended: call this once in Application.onCreate and then verify data in Room.
     */
    public final void migrateFromOldPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable onComplete) {
    }
    
    /**
     * Clear the old SharedPreferences (async-friendly, but uses allowMainThreadQueries for this file).
     * Call this only after you verified migration succeeded and Room contains your data.
     */
    public final void clearOldPrefsAsync(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable onComplete) {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ravis/senexa/utils/SharedPreferenceManager$AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "keyValueDao", "Lcom/ravis/senexa/utils/SharedPreferenceManager$KeyValueDao;", "app_prodDebug"})
    @androidx.room.Database(entities = {com.ravis.senexa.utils.SharedPreferenceManager.KeyValue.class}, version = 1, exportSchema = false)
    public static abstract class AppDatabase extends androidx.room.RoomDatabase {
        
        public AppDatabase() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.ravis.senexa.utils.SharedPreferenceManager.KeyValueDao keyValueDao();
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ravis/senexa/utils/SharedPreferenceManager$Companion;", "", "<init>", "()V", "instance", "Lcom/ravis/senexa/utils/SharedPreferenceManager;", "OLD_PREFS_NAME", "", "getInstance", "context", "Landroid/content/Context;", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ravis.senexa.utils.SharedPreferenceManager getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/ravis/senexa/utils/SharedPreferenceManager$KeyValue;", "", "key", "", "json", "lastUpdated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getJson", "setJson", "getLastUpdated", "()J", "setLastUpdated", "(J)V", "app_prodDebug"})
    @androidx.room.Entity(tableName = "key_value")
    public static final class KeyValue {
        @androidx.room.PrimaryKey()
        @org.jetbrains.annotations.NotNull()
        private java.lang.String key;
        @androidx.room.ColumnInfo(name = "json")
        @org.jetbrains.annotations.Nullable()
        private java.lang.String json;
        @androidx.room.ColumnInfo(name = "last_updated")
        private long lastUpdated;
        
        public KeyValue(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        java.lang.String json, long lastUpdated) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        public final void setKey(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getJson() {
            return null;
        }
        
        public final void setJson(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final long getLastUpdated() {
            return 0L;
        }
        
        public final void setLastUpdated(long p0) {
        }
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\'J\u0012\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\'J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\'\u00a8\u0006\u000e\u00c0\u0006\u0003"}, d2 = {"Lcom/ravis/senexa/utils/SharedPreferenceManager$KeyValueDao;", "", "upsert", "", "kv", "Lcom/ravis/senexa/utils/SharedPreferenceManager$KeyValue;", "getJson", "", "key", "exists", "", "deleteByKey", "getAll", "", "app_prodDebug"})
    @androidx.room.Dao()
    public static abstract interface KeyValueDao {
        
        @androidx.room.Insert(onConflict = 1)
        public abstract void upsert(@org.jetbrains.annotations.NotNull()
        com.ravis.senexa.utils.SharedPreferenceManager.KeyValue kv);
        
        @androidx.room.Query(value = "SELECT json FROM key_value WHERE key = :key LIMIT 1")
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getJson(@org.jetbrains.annotations.Nullable()
        java.lang.String key);
        
        @androidx.room.Query(value = "SELECT COUNT(*) > 0 FROM key_value WHERE key = :key")
        public abstract boolean exists(@org.jetbrains.annotations.Nullable()
        java.lang.String key);
        
        @androidx.room.Query(value = "DELETE FROM key_value WHERE key = :key")
        public abstract void deleteByKey(@org.jetbrains.annotations.Nullable()
        java.lang.String key);
        
        @androidx.room.Query(value = "SELECT * FROM key_value")
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.ravis.senexa.utils.SharedPreferenceManager.KeyValue> getAll();
    }
}