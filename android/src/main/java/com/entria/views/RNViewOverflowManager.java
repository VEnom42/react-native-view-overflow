package com.entria.views;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import android.os.Build;

public class RNViewOverflowManager extends ViewGroupManager<RNViewOverflowLayout> {

    public static final String REACT_CLASS = "RNViewOverflow";

    @Override
     protected RNViewOverflowLayout createViewInstance(ThemedReactContext reactContext) {
        return new RNViewOverflowLayout(reactContext);
     }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "borderRadius", defaultFloat = 0f)
    public void setBorderRadius(RNViewOverflowLayout view, float borderRadius) {
        if (Build.VERSION.SDK_INT != Build.VERSION_CODES.N) {
            view.setBorderRadius(borderRadius * 2);
        }
    }
}
