package kr.ac.cnu.computer.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SOSPopupActivity extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();

        layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;

        layoutParams.dimAmount = 0.7f;

        getWindow().setAttributes(layoutParams);

        setContentView(R.layout.activity_sos_popup);


    }


}



