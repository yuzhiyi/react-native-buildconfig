package com.buildconfig;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

/**
 * Created by chenwenyu on 17-5-4.
 */

public class BuildConfigModule extends BaseModule{

    public BuildConfigModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "BuildConfigModule";
    }

    @ReactMethod
    public void getVersionCode() {
        int versionCode = BuildConfig.VERSION_CODE;
        WritableMap map = Arguments.createMap();
        map.putInt("versionCode",versionCode);
        sendEvent("onGetVersionCode",map);
    }

    @ReactMethod
    public void getVersionName() {
        String versionName = BuildConfig.VERSION_NAME;
        WritableMap map = Arguments.createMap();
        map.putString("versionName",versionName);
        sendEvent("onGetVersionName",map);
    }

    @ReactMethod
    public void getBuildTime() {
        String buildTime = BuildConfig.BUILD_TIME;
        WritableMap map = Arguments.createMap();
        map.putString("buildTime",buildTime);
        sendEvent("onGetBuildTime",map);
    }

    @ReactMethod
    public void getGitSha() {
        String gitSha = BuildConfig.GIT_SHA;
        WritableMap map = Arguments.createMap();
        map.putString("gitSha",gitSha);
        sendEvent("onGetGitSha",map);
    }
}

