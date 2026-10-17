package com.ravis.senexa.utils.customview;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\b\u0004\u0010\u000bJ\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/ravis/senexa/utils/customview/MaterialCustomSwitch;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textHead", "", "textOn", "textOff", "checked", "", "textHeadView", "Landroid/widget/TextView;", "textDescView", "materialSwitch", "Lcom/google/android/material/materialswitch/MaterialSwitch;", "onCheckChangedListener", "Lcom/ravis/senexa/utils/customview/MaterialCustomSwitch$OnCheckChangeListener;", "init", "", "setOnCheckChangeListener", "setChecked", "OnCheckChangeListener", "app_nofirebaseDebug"})
public final class MaterialCustomSwitch extends android.widget.LinearLayout {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String textHead = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String textOn = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String textOff = "";
    private boolean checked = false;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView textHeadView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView textDescView;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.materialswitch.MaterialSwitch materialSwitch;
    @org.jetbrains.annotations.Nullable()
    private com.ravis.senexa.utils.customview.MaterialCustomSwitch.OnCheckChangeListener onCheckChangedListener;
    
    public MaterialCustomSwitch(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public MaterialCustomSwitch(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public MaterialCustomSwitch(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void init(android.util.AttributeSet attrs, int defStyle) {
    }
    
    public final void setOnCheckChangeListener(@org.jetbrains.annotations.Nullable()
    com.ravis.senexa.utils.customview.MaterialCustomSwitch.OnCheckChangeListener onCheckChangedListener) {
    }
    
    public final void setChecked(boolean checked) {
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"}, d2 = {"Lcom/ravis/senexa/utils/customview/MaterialCustomSwitch$OnCheckChangeListener;", "", "onCheckChanged", "", "isChecked", "", "app_nofirebaseDebug"})
    public static abstract interface OnCheckChangeListener {
        
        public abstract void onCheckChanged(boolean isChecked);
    }
}