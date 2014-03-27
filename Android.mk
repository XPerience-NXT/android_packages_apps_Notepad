LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

# Only build apk if this package is added to CUSTOM_MODLUES in buildspec.mk
LOCAL_MODULE_TAGS := optional

# Only compile source java files in this apk.
LOCAL_SRC_FILES := $(call all-java-files-under, src)

LOCAL_PACKAGE_NAME := XPeNotePad

LOCAL_SDK_VERSION := current

include $(BUILD_PACKAGE)

# Use the following include to make our test apk.
include $(call all-makefiles-under,$(LOCAL_PATH))
