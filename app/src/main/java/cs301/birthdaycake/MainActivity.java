package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cv = (CakeView) findViewById(R.id.cakeview);
        CakeController cc = new CakeController(cv);
        Button blowOut = (Button) findViewById(R.id.blowButton);
        blowOut.setOnClickListener(cc);
    }

    public void goodbye(View button) {
        System.out.println("Goodbye");
    }
}
