package ly.pp.addsongs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: ly.pp.addsongs.PlayWidgetConf */
public class PlayWidgetConf extends Activity {
    /* renamed from: a */
    int f4826a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f4826a = extras.getInt("appWidgetId", 0);
        }
        if (this.f4826a == 0) {
            finish();
        }
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.f4826a);
        setResult(-1, intent);
        finish();
    }
}
