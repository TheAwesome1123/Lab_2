package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

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
        CompoundButton candles = (CompoundButton) findViewById(R.id.candles);
        candles.setOnCheckedChangeListener(cc);
        SeekBar candleCount = (SeekBar) findViewById(R.id.candleBar);
        candleCount.setOnSeekBarChangeListener(cc);
    }

    public void goodbye(View button) {
        System.out.println("Goodbye");
    }
}
