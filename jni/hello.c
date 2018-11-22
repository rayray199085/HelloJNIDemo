#include<stdlib.h>
#include<stdio.h>
#include<jni.h>
// Java_packageName_className_methodName
//the first parameter, JNIEnv* is a pointer of JNINativeInterface which is a structure
//env is a pointer of JNIEnv
//the second parameter, jobject is the object of the class who calls the native method
jstring Java_com_example_stephencao_hellojnidemo_MainActivity_stringFromJNI(JNIEnv* env, jobject thiz){
    char* str = "Hello, this is from C!!!";
    return (*env)->NewStringUTF(env,str);
}