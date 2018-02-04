package com.example.android.test;

/**
 * Created by lenovo on 2018/2/4.`
 * 作用：Java调用对应的c代码的桥梁
 */

public class JNI {

    static {
        System.loadLibrary("Hello");
    }

    public native String sayHello();

//    {
//        System.loadLibrary("Hello");
//    }

    /**
     * 定义native方法
     * 调用c代码对应的方法
     *
     * 方法一：自动生成，Alt+Enter出现提示，点击生成会自动生成jni目录和jni.c文件
     * 方法二：在main目录下创建jni目录，新建Hello.c文件
     *         右键拷贝方法名复制到c文件中:com.example.android.test.JNI.sayHello把.改为_
     *         前面再加上Java_:Java_com_example_android_test_JNI_sayHello
     *
     * @return
     */

}
