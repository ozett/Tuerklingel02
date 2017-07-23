package com.example.olaf.tuerklingel02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fullscreen);
        setContentView(R.layout.activity_main);

        /*Button button1 = (Button) findViewById(R.id.buttonRosalie);
        int text_height = button1.getHeight()/3;   // define text_height as 1/3 of button height in px
        button1.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_height);  // set text height in px

        Button button2 = (Button)findViewById(R.id.buttonJutta);
        text_height = button2.getHeight()/2;
        button2.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_height);*/

    }


    @Override
    public void onWindowFocusChanged (boolean hasFocus) { // the layout is set

        Button button1 = (Button) findViewById(R.id.buttonEGli);
//        double text_height = button1.getHeight()/3;   // define text_height as 1/3 of button height in px
        double text_height = button1.getHeight() * 0.20;
//        button1.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_height);  // set text height in px
        button1.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) text_height);  // set text height in sp

        /*Button button2 = (Button)findViewById(R.id.buttonJutta);
//        text_height = button2.getHeight()/2;
        text_height = button2.getHeight() * 0.50;
        button2.setTextSize(TypedValue.COMPLEX_UNIT_PX, (float) text_height);
//        button2.setText( String.valueOf(text_height) );
        button2.setText( Double.toString(text_height) );*/

        Button button3 = (Button) findViewById(R.id.buttonEGre);
//        text_height = button3.getHeight()/3;   // define text_height as 1/3 of button height in px
        text_height = button3.getHeight() * 0.20;
//        button1.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_height);  // set text height in px
        button3.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) text_height);  // set text height in sp

        Button button4 = (Button) findViewById(R.id.buttonDGli);
        text_height = button4.getHeight() * 0.20;
        button4.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) text_height);  // set text height in sp


        Button button5 = (Button) findViewById(R.id.buttonDGre);
        text_height = button5.getHeight() * 0.20;
        button5.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float) text_height);  // set text height in sp

    }

    //Kiosk-Mode, disable back-button
    //    http://www.andreas-schrade.de/2015/02/16/android-tutorial-how-to-create-a-kiosk-mode-in-android/
    @Override
    public void onBackPressed() {
        // nothing to do here
        // … really
    }
}
