#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_example_android_test_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_android_test_JNI_sayHello(JNIEnv *env, jobject instance) {

    // TODO

    char *text = "I am from c";
    return env->NewStringUTF(text);
}