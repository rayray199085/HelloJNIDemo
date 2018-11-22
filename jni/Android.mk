#makefile this file is used to describe the target file's location and its compile name and type
 LOCAL_PATH := $(call my-dir)
#clear last time running information	
   include $(CLEAR_VARS)
#define the final file name 
   LOCAL_MODULE    := hello
   LOCAL_SRC_FILES := hello.c
#generate a dynamic link library
   include $(BUILD_SHARED_LIBRARY)