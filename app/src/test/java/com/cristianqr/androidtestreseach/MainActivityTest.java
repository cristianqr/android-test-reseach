package com.cristianqr.androidtestreseach;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void textViewShouldHaveCorrectText() {
        TextView textView = (TextView)activity.findViewById(R.id.hello_world);
        assertEquals("Hello World!", textView.getText());
    }
}
