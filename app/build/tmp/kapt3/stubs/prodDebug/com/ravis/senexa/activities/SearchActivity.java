package com.ravis.senexa.activities;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0014J\b\u0010!\u001a\u00020\u0017H\u0014J\u0010\u0010\"\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/ravis/senexa/activities/SearchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "binding", "Lcom/ravis/senexa/databinding/ActivitySearchBinding;", "getBinding", "()Lcom/ravis/senexa/databinding/ActivitySearchBinding;", "setBinding", "(Lcom/ravis/senexa/databinding/ActivitySearchBinding;)V", "TAG", "", "searchHandler", "Landroid/os/Handler;", "searchRunnable", "Ljava/lang/Runnable;", "currentQuery", "songs", "", "Lcom/ravis/senexa/model/AlbumItem;", "getSongs", "()Ljava/util/List;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "hideKeyboard", "view", "Landroid/view/View;", "showData", "query", "showShimmerData", "onResume", "onPause", "backPress", "app_prodDebug"})
public final class SearchActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private com.ravis.senexa.databinding.ActivitySearchBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "SearchActivity";
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler searchHandler = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable searchRunnable;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentQuery = "";
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ravis.senexa.model.AlbumItem> songs = null;
    
    public SearchActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.databinding.ActivitySearchBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.databinding.ActivitySearchBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ravis.senexa.model.AlbumItem> getSongs() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideKeyboard(android.view.View view) {
    }
    
    private final void showData(java.lang.String query) {
    }
    
    private final void showShimmerData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public final void backPress(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
}