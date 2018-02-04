//
// Created by lenovo on 2018/2/4.
//

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

jstring Java_com_example_android_test_JNI_sayHello(JNIEnv *env, jobject instance) {

// TODO

    char *text = "I am from c";
    return (*env)->NewStringUTF(env, text);
}