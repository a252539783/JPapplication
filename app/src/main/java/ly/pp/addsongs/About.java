package ly.pp.addsongs;

import android.app.Activity;
import android.os.Bundle;


/* renamed from: ly.pp.addsongs.About */
public class About extends Activity {
    public void onBackPressed() {
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(3);
        setContentView(R.layout.about);
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
