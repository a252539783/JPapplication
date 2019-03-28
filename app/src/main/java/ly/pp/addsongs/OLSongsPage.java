package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;


/* renamed from: ly.pp.addsongs.OLSongsPage */
public class OLSongsPage extends Activity implements OnClickListener {
    /* renamed from: a */
    private JPApplication f4543a;
    /* renamed from: b */
    private Button f4544b;
    /* renamed from: c */
    private Button f4545c;
    /* renamed from: d */
    private Button f4546d;
    /* renamed from: e */
    private Button f4547e;
    /* renamed from: f */
    private Button f4548f;
    /* renamed from: g */
    private View f4549g;

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, OLMainMode.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.ol_melodyList_b:
                intent.setClass(this, OLMelodySelect.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_hotSongs_b:
                intent.putExtra("head", "1");
                intent.putExtra("keywords", "H");
                intent.setClass(this, ShowSongsInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_newSongs_b:
                intent.putExtra("head", "1");
                intent.putExtra("keywords", "N");
                intent.setClass(this, ShowSongsInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_collect_b:
                intent.putExtra("head", "1");
                intent.putExtra("keywords", "F");
                intent.setClass(this, ShowSongsInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_search_b:
                intent.putExtra("head", 0);
                intent.setClass(this, SearchSongs.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_recent_b:
                intent.putExtra("head", "1");
                intent.putExtra("keywords", "T");
                intent.setClass(this, ShowSongsInfo.class);
                startActivity(intent);
                finish();
                return;
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4543a = (JPApplication) getApplication();
        this.f4543a.mo2728f(1);
        setContentView(R.layout.ol_songs_page);
        this.f4543a.mo2706a(this, "ground", (LinearLayout) findViewById(R.id.layout));
        JPApplication jPApplication = this.f4543a;
        jPApplication.mo2718c(0);
        this.f4544b = findViewById(R.id.ol_melodyList_b);
        this.f4544b.setOnClickListener(this);
        this.f4545c = findViewById(R.id.ol_hotSongs_b);
        this.f4545c.setOnClickListener(this);
        this.f4546d = findViewById(R.id.ol_search_b);
        this.f4546d.setOnClickListener(this);
        this.f4548f = findViewById(R.id.ol_newSongs_b);
        this.f4548f.setOnClickListener(this);
        this.f4547e = findViewById(R.id.ol_collect_b);
        this.f4547e.setOnClickListener(this);
        this.f4549g = findViewById(R.id.ol_recent_b);
        this.f4549g.setOnClickListener(this);
    }

    public void onPause() {
        super.onPause();

    }
}
