package com.example.android.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * NDK开发流程
 * 1 在Java里面写native代码
 * 2 在main目录下创建jni目录写C代码，生成头文件
 * 3 配置动态链接库的名称
 * 4 加载动态链接库
 * 5 使用
 */
public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = new JNI().sayHello();
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
//        tv.setText(stringFromJNI());
        tv.setText(text);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
