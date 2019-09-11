package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
    private CakeView cView;
    private CakeModel cModel;

    public CakeController(CakeView cv) {
        cView = cv;
        cModel = cv.getCakeModel();
    }

    public void onClick(View v) {
        Log.d(null, "click", null);
    }

}
