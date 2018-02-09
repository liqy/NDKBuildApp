LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := hello-jni
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_SRC_FILES := \
	C:\Users\liqy\Documents\newtech\NDKBuildApp\app\src\main\jni\hello-jni.cpp \

LOCAL_C_INCLUDES += C:\Users\liqy\Documents\newtech\NDKBuildApp\app\src\main\jni
LOCAL_C_INCLUDES += C:\Users\liqy\Documents\newtech\NDKBuildApp\app\src\debug\jni

include $(BUILD_SHARED_LIBRARY)
