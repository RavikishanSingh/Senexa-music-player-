package com.ravis.senexa.services;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Lcom/ravis/senexa/services/ActionPlaying;", "", "nextClicked", "", "prevClicked", "playClicked", "onProgressChanged", "progress", "", "app_prodDebug"})
public abstract interface ActionPlaying {
    
    public abstract void nextClicked();
    
    public abstract void prevClicked();
    
    public abstract void playClicked();
    
    public abstract void onProgressChanged(int progress);
}