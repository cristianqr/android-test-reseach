package com.cristianqr.androidtestreseach;

import android.text.TextUtils;
import android.util.Patterns;

public class EmailValidator {
    static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
