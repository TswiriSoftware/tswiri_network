package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.camera.CameraPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin camera_android, io.flutter.plugins.camera.CameraPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.rmawatson.flutterisolate.FlutterIsolatePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_isolate, com.rmawatson.flutterisolate.FlutterIsolatePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_barcode_scanning.GoogleMlKitBarcodeScanningPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_barcode_scanning, com.google_mlkit_barcode_scanning.GoogleMlKitBarcodeScanningPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_commons.GoogleMlKitCommonsPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_commons, com.google_mlkit_commons.GoogleMlKitCommonsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_image_labeling.GoogleMlKitImageLabelingPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_image_labeling, com.google_mlkit_image_labeling.GoogleMlKitImageLabelingPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_object_detection.GoogleMlKitObjectDetectionPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_object_detection, com.google_mlkit_object_detection.GoogleMlKitObjectDetectionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.google_mlkit_text_recognition.GoogleMlKitTextRecognitionPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin google_mlkit_text_recognition, com.google_mlkit_text_recognition.GoogleMlKitTextRecognitionPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.googlesignin.GoogleSignInPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.isar.isar_flutter_libs.IsarFlutterLibsPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin isar_flutter_libs, dev.isar.isar_flutter_libs.IsarFlutterLibsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new net.nfet.flutter.printing.PrintingPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin printing, net.nfet.flutter.printing.PrintingPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e);
    }
  }
}
