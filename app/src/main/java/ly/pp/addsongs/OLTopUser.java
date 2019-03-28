package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


/* renamed from: ly.pp.addsongs.OLTopUser */
public class OLTopUser extends Activity implements OnClickListener {
    /* renamed from: a */
    private final int f4550a = 0;
    /* renamed from: b */
    private final int f4551b = 1;
    /* renamed from: c */
    private final int f4552c = 4;
    /* renamed from: d */
    private final int f4553d = 7;
    /* renamed from: e */
    private final int f4554e = 8;
    /* renamed from: f */
    private final int f4555f = 9;
    /* renamed from: g */
    private final int f4556g = 10;
    /* renamed from: h */
    private Button f4557h;
    /* renamed from: i */
    private Button f4558i;
    /* renamed from: j */
    private Button f4559j;
    /* renamed from: k */
    private Button f4560k;
    /* renamed from: l */
    private Button f4561l;
    /* renamed from: m */
    private Button f4562m;
    /* renamed from: n */
    public RadioButton f4563n;
    /* renamed from: o */
    public RadioButton f4564o;
    /* renamed from: p */
    private RadioGroup f4565p;
    /* renamed from: q */
    private JPApplication f4566q;
    /* renamed from: r */
    public String f4567r = "C";
    /* renamed from: s */
    private String f4568s = "";

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, OLMainMode.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("address", this.f4568s);
        switch (view.getId()) {
            case R.id.ol_class_b:
                intent.putExtra("head", 10);
                intent.putExtra("keywords", this.f4567r);
                intent.setClass(this, ShowTopInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_level_b:
                intent.putExtra("head", 4);
                intent.putExtra("keywords", this.f4567r);
                intent.setClass(this, ShowTopInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_topUsers_b:
                intent.putExtra("head", 0);
                intent.putExtra("keywords", this.f4567r);
                intent.setClass(this, ShowTopInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_topScore_b:
                intent.putExtra("head", 1);
                intent.putExtra("keywords", this.f4567r);
                intent.setClass(this, ShowTopInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_score_day:
                intent.putExtra("head", 7);
                intent.putExtra("keywords", this.f4567r);
                intent.setClass(this, ShowTopInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_score_month:
                intent.putExtra("head", 9);
                intent.putExtra("keywords", this.f4567r);
                intent.setClass(this, ShowTopInfo.class);
                startActivity(intent);
                finish();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4566q = (JPApplication) getApplication();
        this.f4566q.mo2728f(1);
        this.f4568s = getSharedPreferences("account", 0).getString("local_addr", "");
        if (this.f4568s.contains("省")) {
            Integer.valueOf(this.f4568s.indexOf("省"));
            this.f4568s = this.f4568s.substring(0, this.f4568s.indexOf("省"));
        } else if (this.f4568s.contains("自治区")) {
            this.f4568s = this.f4568s.substring(0, this.f4568s.indexOf("自治区"));
            if (this.f4568s.length() >= 4) {
                this.f4568s = this.f4568s.substring(0, 2);
            }
        } else if (this.f4568s.contains("特别行政区")) {
            this.f4568s = this.f4568s.substring(0, this.f4568s.indexOf("特别行政区"));
        } else if (this.f4568s.contains("市")) {
            this.f4568s = this.f4568s.substring(0, this.f4568s.indexOf("市"));
        }
        setContentView(R.layout.ol_top_user);
        this.f4566q.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4561l = (Button) findViewById(R.id.ol_level_b);
        this.f4561l.setOnClickListener(this);
        this.f4557h = (Button) findViewById(R.id.ol_topUsers_b);
        this.f4557h.setOnClickListener(this);
        this.f4558i = (Button) findViewById(R.id.ol_topScore_b);
        this.f4558i.setOnClickListener(this);
        this.f4559j = (Button) findViewById(R.id.ol_score_day);
        this.f4559j.setOnClickListener(this);
        this.f4562m = (Button) findViewById(R.id.ol_class_b);
        this.f4562m.setOnClickListener(this);
        this.f4560k = (Button) findViewById(R.id.ol_score_month);
        this.f4560k.setOnClickListener(this);
        this.f4563n = (RadioButton) findViewById(R.id.p_radio);
        this.f4564o = (RadioButton) findViewById(R.id.c_radio);
        this.f4564o.setChecked(true);
        this.f4565p = (RadioGroup) findViewById(R.id.rg_p_c);
        if (!this.f4568s.equals("")) {
            this.f4563n.setText(this.f4568s + "榜");
        }
        this.f4565p.setOnCheckedChangeListener(new C1210ip(this));
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
