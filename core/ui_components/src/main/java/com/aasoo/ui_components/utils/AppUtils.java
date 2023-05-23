package com.aasoo.ui_components.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Himanshu Srivastava on 24,May,2023
 * Project MultiModuleApp
 */
public class AppUtils {

    public static void showToast(Context context, CharSequence msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }


}
