package com.ravis.senexa.network;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/ravis/senexa/network/NetworkChangeReceiver;", "Landroid/content/BroadcastReceiver;", "listener", "Lcom/ravis/senexa/network/NetworkChangeReceiver$NetworkStatusListener;", "<init>", "(Lcom/ravis/senexa/network/NetworkChangeReceiver$NetworkStatusListener;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "NetworkStatusListener", "Companion", "app_nofirebaseDebug"})
public final class NetworkChangeReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private final com.ravis.senexa.network.NetworkChangeReceiver.NetworkStatusListener listener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ravis.senexa.network.NetworkChangeReceiver.Companion Companion = null;
    
    public NetworkChangeReceiver(@org.jetbrains.annotations.NotNull()
    com.ravis.senexa.network.NetworkChangeReceiver.NetworkStatusListener listener) {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/ravis/senexa/network/NetworkChangeReceiver$Companion;", "", "<init>", "()V", "registerReceiver", "", "context", "Landroid/content/Context;", "receiver", "Lcom/ravis/senexa/network/NetworkChangeReceiver;", "unregisterReceiver", "app_nofirebaseDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void registerReceiver(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        com.ravis.senexa.network.NetworkChangeReceiver receiver) {
        }
        
        public final void unregisterReceiver(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        com.ravis.senexa.network.NetworkChangeReceiver receiver) {
        }
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005\u00c0\u0006\u0003"}, d2 = {"Lcom/ravis/senexa/network/NetworkChangeReceiver$NetworkStatusListener;", "", "onNetworkConnected", "", "onNetworkDisconnected", "app_nofirebaseDebug"})
    public static abstract interface NetworkStatusListener {
        
        public abstract void onNetworkConnected();
        
        public abstract void onNetworkDisconnected();
    }
}