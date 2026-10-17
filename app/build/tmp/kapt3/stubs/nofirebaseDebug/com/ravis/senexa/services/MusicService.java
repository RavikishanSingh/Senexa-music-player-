package com.ravis.senexa.services;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\"\u0010\u0012\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/ravis/senexa/services/MusicService;", "Landroid/app/Service;", "<init>", "()V", "mBinder", "Landroid/os/IBinder;", "actionPlaying", "Lcom/ravis/senexa/services/ActionPlaying;", "getActionPlaying", "()Lcom/ravis/senexa/services/ActionPlaying;", "setActionPlaying", "(Lcom/ravis/senexa/services/ActionPlaying;)V", "onCreate", "", "onDestroy", "onBind", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "setCallback", "MyBinder", "app_nofirebaseDebug"})
public final class MusicService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private final android.os.IBinder mBinder = null;
    @org.jetbrains.annotations.Nullable()
    private com.ravis.senexa.services.ActionPlaying actionPlaying;
    
    public MusicService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravis.senexa.services.ActionPlaying getActionPlaying() {
        return null;
    }
    
    public final void setActionPlaying(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.services.ActionPlaying p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.services.ActionPlaying actionPlaying) {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ravis/senexa/services/MusicService$MyBinder;", "Landroid/os/Binder;", "<init>", "(Lcom/ravis/senexa/services/MusicService;)V", "service", "Lcom/ravis/senexa/services/MusicService;", "getService", "()Lcom/ravis/senexa/services/MusicService;", "app_nofirebaseDebug"})
    public final class MyBinder extends android.os.Binder {
        
        public MyBinder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ravis.senexa.services.MusicService getService() {
            return null;
        }
    }
}