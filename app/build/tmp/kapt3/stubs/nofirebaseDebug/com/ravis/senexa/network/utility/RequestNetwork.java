package com.ravis.senexa.network.utility;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0017\u001a\u00020\u00182.\u0010\f\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u000b2\u0006\u0010\u0014\u001a\u00020\u0013J.\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Rn\u0010\f\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u000b2.\u0010\b\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u000b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eRB\u0010\u000f\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0013@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006 "}, d2 = {"Lcom/ravis/senexa/network/utility/RequestNetwork;", "", "activity", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getActivity", "()Landroid/content/Context;", "value", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "params", "getParams", "()Ljava/util/HashMap;", "headers", "getHeaders", "setHeaders", "(Ljava/util/HashMap;)V", "", "requestType", "getRequestType", "()I", "setParams", "", "startRequestNetwork", "method", "url", "tag", "requestListener", "Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;", "RequestListener", "app_nofirebaseDebug"})
public final class RequestNetwork {
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context activity = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.HashMap<java.lang.String, java.lang.Object> params;
    @org.jetbrains.annotations.Nullable()
    private java.util.HashMap<java.lang.String, java.lang.Object> headers;
    private int requestType = 0;
    
    public RequestNetwork(@org.jetbrains.annotations.Nullable()
    android.content.Context activity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.HashMap<java.lang.String, java.lang.Object> getParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.HashMap<java.lang.String, java.lang.Object> getHeaders() {
        return null;
    }
    
    public final void setHeaders(@org.jetbrains.annotations.Nullable()
    java.util.HashMap<java.lang.String, java.lang.Object> p0) {
    }
    
    public final int getRequestType() {
        return 0;
    }
    
    public final void setParams(@org.jetbrains.annotations.Nullable()
    java.util.HashMap<java.lang.String, java.lang.Object> params, int requestType) {
    }
    
    public final void startRequestNetwork(@org.jetbrains.annotations.Nullable()
    java.lang.String method, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    com.ravis.senexa.network.utility.RequestNetwork.RequestListener requestListener) {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JL\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052.\u0010\u0007\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bj\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\tH&J\u001c\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Lcom/ravis/senexa/network/utility/RequestNetwork$RequestListener;", "", "onResponse", "", "tag", "", "response", "responseHeaders", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "onErrorResponse", "message", "app_nofirebaseDebug"})
    public static abstract interface RequestListener {
        
        public abstract void onResponse(@org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.Nullable()
        java.lang.String response, @org.jetbrains.annotations.Nullable()
        java.util.HashMap<java.lang.String, java.lang.Object> responseHeaders);
        
        public abstract void onErrorResponse(@org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.Nullable()
        java.lang.String message);
    }
}