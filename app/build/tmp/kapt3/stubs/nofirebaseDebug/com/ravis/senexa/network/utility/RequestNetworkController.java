package com.ravis.senexa.network.utility;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/ravis/senexa/network/utility/RequestNetworkController;", "", "<init>", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "setClient", "(Lokhttp3/OkHttpClient;)V", "getOkHttpClient", "execute", "", "requestNetwork", "Lcom/ravis/senexa/network/utility/RequestNetwork;", "method", "", "url", "tag", "requestListener", "Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;", "Companion", "app_nofirebaseDebug"})
public final class RequestNetworkController {
    @org.jetbrains.annotations.Nullable()
    private okhttp3.OkHttpClient client;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET = "GET";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POST = "POST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PUT = "PUT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELETE = "DELETE";
    public static final int REQUEST_PARAM = 0;
    public static final int REQUEST_BODY = 1;
    private static final int SOCKET_TIMEOUT = 15000;
    private static final int READ_TIMEOUT = 25000;
    @org.jetbrains.annotations.Nullable()
    private static com.ravis.senexa.network.utility.RequestNetworkController mInstance;
    @org.jetbrains.annotations.NotNull()
    public static final com.ravis.senexa.network.utility.RequestNetworkController.Companion Companion = null;
    
    public RequestNetworkController() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    protected final void setClient(@org.jetbrains.annotations.Nullable()
    okhttp3.OkHttpClient p0) {
    }
    
    private final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    public final void execute(@org.jetbrains.annotations.NotNull()
    com.ravis.senexa.network.utility.RequestNetwork requestNetwork, @org.jetbrains.annotations.NotNull()
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener requestListener) {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/ravis/senexa/network/utility/RequestNetworkController$Companion;", "", "<init>", "()V", "GET", "", "POST", "PUT", "DELETE", "REQUEST_PARAM", "", "REQUEST_BODY", "SOCKET_TIMEOUT", "READ_TIMEOUT", "mInstance", "Lcom/ravis/senexa/network/utility/RequestNetworkController;", "instance", "getInstance", "()Lcom/ravis/senexa/network/utility/RequestNetworkController;", "app_nofirebaseDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized()
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.ravis.senexa.network.utility.RequestNetworkController getInstance() {
            return null;
        }
    }
}