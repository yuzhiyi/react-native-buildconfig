import {
    NativeModules
} from 'react-native';

const BuildConfigModule = NativeModules.BuildConfigModule;

const BuildConfig = {
    getVersionCode() {
        return new Promise((resolve, reject) => {
            try {
                BuildConfigModule.getVersionCode();
            }
            catch (e) {
                reject(e);
                return;
            }
            DeviceEventEmitter.once('onGetVersionCode', resp => {
                resolve(resp);
            });
        });
    }
    getVersionName() {
        return new Promise((resolve, reject) => {
            try {
                BuildConfigModule.getVersionName();
            }
            catch (e) {
                reject(e);
                return;
            }
            DeviceEventEmitter.once('onGetVersionName', resp => {
                resolve(resp);
            });
        });
    }
    getBuildTime() {
        return new Promise((resolve, reject) => {
            try {
                BuildConfigModule.getBuildTime();
            }
            catch (e) {
                reject(e);
                return;
            }
            DeviceEventEmitter.once('onGetBuildTime', resp => {
                resolve(resp);
            });
        });
    }
    getGitSha() {
        return new Promise((resolve, reject) => {
            try {
                BuildConfigModule.getGitSha();
            }
            catch (e) {
                reject(e);
                return;
            }
            DeviceEventEmitter.once('onGetGitSha', resp => {
                resolve(resp);
            });
        });
    }
};

module.exports = BuildConfig;
