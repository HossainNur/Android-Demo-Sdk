package com.nurhossain.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MyLibrary {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void test(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
