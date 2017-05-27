package com.example.android.myhandler;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created on 5/27/17.
 */

public class L {
    public static void m(String message) {
        Log.d("ANDROID", message);
    }

    public static void s(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
