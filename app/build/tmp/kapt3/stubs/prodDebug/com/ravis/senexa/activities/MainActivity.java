package com.ravis.senexa.activities;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 12\u00020\u0001:\u00011B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0014J\b\u0010%\u001a\u00020\u001fH\u0014J\b\u0010&\u001a\u00020\u001fH\u0016J\b\u0010\'\u001a\u00020\u001fH\u0014J\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\u0010\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-J\b\u00100\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050/X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/ravis/senexa/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "TAG", "", "binding", "Lcom/ravis/senexa/databinding/ActivityMainBinding;", "baseApplicationClass", "Lcom/ravis/senexa/BaseApplicationClass;", "songs", "", "Lcom/ravis/senexa/model/AlbumItem;", "getSongs", "()Ljava/util/List;", "artists", "Lcom/ravis/senexa/records/ArtistsSearch$Data$Results;", "getArtists", "albums", "getAlbums", "playlists", "getPlaylists", "networkChangeReceiver", "Lcom/ravis/senexa/network/NetworkChangeReceiver;", "getNetworkChangeReceiver", "()Lcom/ravis/senexa/network/NetworkChangeReceiver;", "setNetworkChangeReceiver", "(Lcom/ravis/senexa/network/NetworkChangeReceiver;)V", "slidingRootNavBuilder", "Lcom/yarolegovich/slidingrootnav/SlidingRootNav;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "updateVersionTextInDrawer", "setupDrawerClicks", "onResume", "onPause", "onBackPressed", "onDestroy", "showData", "showShimmerData", "showOfflineData", "openSearch", "view", "Landroid/view/View;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "askNotificationPermission", "Companion", "app_prodDebug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "MainActivity";
    @org.jetbrains.annotations.Nullable()
    private com.ravis.senexa.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.ravis.senexa.BaseApplicationClass baseApplicationClass;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ravis.senexa.model.AlbumItem> songs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ravis.senexa.records.ArtistsSearch.Data.Results> artists = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ravis.senexa.model.AlbumItem> albums = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ravis.senexa.model.AlbumItem> playlists = null;
    @org.jetbrains.annotations.NotNull()
    private com.ravis.senexa.network.NetworkChangeReceiver networkChangeReceiver;
    @org.jetbrains.annotations.Nullable()
    private com.yarolegovich.slidingrootnav.SlidingRootNav slidingRootNavBuilder;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ravis.senexa.activities.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ravis.senexa.model.AlbumItem> getSongs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ravis.senexa.records.ArtistsSearch.Data.Results> getArtists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ravis.senexa.model.AlbumItem> getAlbums() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ravis.senexa.model.AlbumItem> getPlaylists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ravis.senexa.network.NetworkChangeReceiver getNetworkChangeReceiver() {
        return null;
    }
    
    public final void setNetworkChangeReceiver(@org.jetbrains.annotations.NotNull()
    com.ravis.senexa.network.NetworkChangeReceiver p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateVersionTextInDrawer() {
    }
    
    private final void setupDrawerClicks() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void showData() {
    }
    
    private final void showShimmerData() {
    }
    
    private final void showOfflineData() {
    }
    
    public final void openSearch(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    private final void askNotificationPermission() {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/ravis/senexa/activities/MainActivity$Companion;", "", "<init>", "()V", "calculateNoOfColumns", "", "context", "Landroid/content/Context;", "columnWidthDp", "", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int calculateNoOfColumns(@org.jetbrains.annotations.NotNull()
        android.content.Context context, float columnWidthDp) {
            return 0;
        }
    }
}