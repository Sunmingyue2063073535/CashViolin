# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
-optimizationpasses 1
-ignorewarnings
-obfuscationdictionary dictionary_rules.txt
-classobfuscationdictionary dictionary_rules.txt
-packageobfuscationdictionary dictionary_rules.txt


#Flutter Wrapper
-dontwarn io.branch.**
-dontwarn okhttp3.**


-keep class com.appsflyer.** { *; }
#-dontwarn com.android.installreferrer

-keepattributes *Annotation*
-keep class com.google.android.gms.** { *; }
-keep class com.facebook.applinks.** { *; }
-keepclassmembers class com.facebook.applinks.** { *; }
-keep class com.facebook.** { *; }
-keep class io.branch.** { *; }

-keep class com.android.installreferrer.** { *; }
-dontwarn com.android.installreferrer.**

# android x
-dontwarn com.google.android.material.**
-keep class com.google.android.material.** { *; }
-dontwarn androidx.**
-keep class androidx.** { *; }
-keep interface androidx.** { *; }

# yitu
-keep class com.oliveapp.camerasdk.** {*;}
-keepattributes InnerClasses
-keep class com.oliveapp.**.R$* {*;}
-keep class com.music.violin.cash.violin.music.loan.store.cash.loan.R$* {*;}
-keep class com.music.violin.cash.violin.music.loan.store.cash.loan.**.R$* {*;}


# Keep EventBus class
#-keepattributes *Annotation*
#-keepclassmembers class * {
#    @org.greenrobot.eventbus.Subscribe <methods>;
#}
#-keep enum org.greenrobot.eventbus.ThreadMode { *; }
#
#-keepclassmembers class org.greenrobot.eventbus.util.ThrowableFailureEvent {
#    <init>(java.lang.Throwable);
#}

#-keep class org.greenrobot.eventbus.android.AndroidComponentsImpl

# -keep dfsdk
-dontwarn com.dfsdk.**
-keep class com.dfsdk.** {*;}

-keep class **.R$* {*;}
-keep class com.ms.banner.** {*;}

-dontwarn java.lang.**
-keep class java.lang.** {*;}


-dontwarn com.alibaba.fastjson.**
-keep class com.alibaba.fastjson.** { *; }
-keepattributes InnerClasses