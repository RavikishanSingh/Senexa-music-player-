package com.ravis.senexa;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ravis/senexa/BaseApplicationClass;", "Landroid/app/Application;", "<init>", "()V", "TAG", "", "onCreate", "", "Companion", "app_prodDebug"})
public class BaseApplicationClass extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "ApplicationClass";
    @org.jetbrains.annotations.Nullable()
    private static com.ravis.senexa.utils.SharedPreferenceManager sharedPreferenceManager;
    @org.jetbrains.annotations.Nullable()
    private static android.app.Activity currentActivity;
    @org.jetbrains.annotations.NotNull()
    public static final com.ravis.senexa.BaseApplicationClass.Companion Companion = null;
    
    public BaseApplicationClass() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/ravis/senexa/BaseApplicationClass$Companion;", "", "<init>", "()V", "sharedPreferenceManager", "Lcom/ravis/senexa/utils/SharedPreferenceManager;", "getSharedPreferenceManager", "()Lcom/ravis/senexa/utils/SharedPreferenceManager;", "setSharedPreferenceManager", "(Lcom/ravis/senexa/utils/SharedPreferenceManager;)V", "currentActivity", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "setCurrentActivity", "(Landroid/app/Activity;)V", "updateTheme", "", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.ravis.senexa.utils.SharedPreferenceManager getSharedPreferenceManager() {
            return null;
        }
        
        public final void setSharedPreferenceManager(@org.jetbrains.annotations.Nullable()
        com.ravis.senexa.utils.SharedPreferenceManager p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.Activity getCurrentActivity() {
            return null;
        }
        
        public final void setCurrentActivity(@org.jetbrains.annotations.Nullable()
        android.app.Activity p0) {
        }
        
        public final void updateTheme() {
        }
    }
}