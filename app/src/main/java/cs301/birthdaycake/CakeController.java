package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener {
    private CakeView cView;
    private CakeModel cModel;

    public CakeController(CakeView cv) {
        cView = cv;
        cModel = cv.getCakeModel();
    }

    public void onClick(View v) {
        //Log.d(null, "click", null);
        cModel.candlesLit = !cModel.candlesLit;
        cView.invalidate();
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        cModel.hasCandles = isChecked;
        cView.invalidate();
    }

    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
        cModel.numCandles = progress;
        cView.invalidate();
    }

    public void onStartTrackingTouch(SeekBar seekbar) {

    }

    public void onStopTrackingTouch(SeekBar seekbar) {

    }
}
