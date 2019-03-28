package ly.pp.addsongs;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.io.IOException;
import java.sql.Date;





/* renamed from: ly.pp.addsongs.PlayFinish */
public class PlayFinish extends Activity implements OnClickListener {
    /* renamed from: S */
    private static int f4636S;
    /* renamed from: A */
    TextView f4637A;
    /* renamed from: B */
    TextView f4638B;
    /* renamed from: C */
    TextView f4639C;
    /* renamed from: D */
    TextView f4640D;
    /* renamed from: E */
    TextView f4641E;
    /* renamed from: F */
    TextView f4642F;
    /* renamed from: G */
    TextView f4643G;
    /* renamed from: H */
    TextView f4644H;
    /* renamed from: I */
    TextView f4645I;
    /* renamed from: J */
    TextView f4646J;
    /* renamed from: K */
    TextView f4647K;
    /* renamed from: L */
    TextView f4648L;
    /* renamed from: M */
    TextView f4649M;
    /* renamed from: N */
    TextView f4650N;
    /* renamed from: O */
    TextView f4651O;
    /* renamed from: P */
    Date f4652P;
    /* renamed from: Q */
    String f4653Q = "";
    /* renamed from: R */
    Button f4654R = null;
    /* renamed from: T */
    private int f4655T;
    /* renamed from: U */
    public JPApplication f4656U;
    /* renamed from: a */
    C1253ke f4657a;
    /* renamed from: b */
    String f4658b = "f";
    /* renamed from: c */
    int f4659c = 0;
    /* renamed from: d */
    int f4660d = 0;
    /* renamed from: e */
    int f4661e = 0;
    /* renamed from: f */
    int f4662f = 0;
    /* renamed from: g */
    int f4663g = 0;
    /* renamed from: h */
    int f4664h = 0;
    /* renamed from: i */
    int f4665i = 0;
    /* renamed from: j */
    int f4666j = 0;
    /* renamed from: k */
    double f4667k;
    /* renamed from: l */
    String f4668l = "";
    /* renamed from: m */
    String f4669m = "";
    /* renamed from: n */
    String f4670n = "";
    /* renamed from: o */
    ImageButton f4671o;
    /* renamed from: p */
    ImageButton f4672p;
    /* renamed from: q */
    boolean f4673q = false;
    /* renamed from: r */
    int f4674r;
    /* renamed from: s */
    int f4675s;
    /* renamed from: t */
    int f4676t;
    /* renamed from: u */
    int f4677u;
    /* renamed from: v */
    int f4678v;
    /* renamed from: w */
    int f4679w;
    /* renamed from: x */
    int f4680x;
    /* renamed from: y */
    TextView f4681y;
    /* renamed from: z */
    TextView f4682z;

    public void onBackPressed() {
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, PianoPlay.class);
        int i = this.f4674r > this.f4675s ? this.f4674r : this.f4675s;
        if (view == this.f4671o) {
            OLMelodySelect.f4294d = null;
            setResult(-1, intent);
            finish();
        } else if (view == this.f4672p) {
            switch (f4636S) {
                case 0:
                    setResult(-1, intent);
                    intent = new Intent();
                    intent.setClass(this, PianoPlay.class);
                    intent.putExtra("head", f4636S);
                    intent.putExtra("name", this.f4668l);
                    intent.putExtra("path", this.f4669m);
                    intent.putExtra("nandu", this.f4667k);
                    intent.putExtra("score", i);
                    startActivity(intent);
                    finish();
                    return;
                case 1:
                    if (OLMelodySelect.f4294d != null) {
                        setResult(-1, intent);
                        intent = new Intent();
                        intent.setClass(this, PianoPlay.class);
                        intent.putExtra("head", f4636S);
                        intent.putExtra("songName", this.f4668l);
                        intent.putExtra("degree", this.f4667k);
                        intent.putExtra("songBytes", OLMelodySelect.f4294d);
                        intent.putExtra("songID", OLMelodySelect.f4295g);
                        intent.putExtra("topScore", i);
                        startActivity(intent);
                        finish();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4656U = (JPApplication) getApplication();
        this.f4667k = 0.0d;
        this.f4657a = new C1253ke(this);
        Bundle extras = getIntent().getExtras();
        int i = extras.getInt("head");
        f4636S = i;
        switch (i) {
            case 0:
                this.f4660d = extras.getInt("perf");
                this.f4661e = extras.getInt("cool");
                this.f4662f = extras.getInt("great");
                this.f4663g = extras.getInt("bad");
                this.f4664h = extras.getInt("miss");
                this.f4668l = extras.getString("name");
                this.f4669m = extras.getString("path");
                this.f4667k = (double) extras.getFloat("nandu");
                this.f4666j = extras.getInt("top_combo");
                this.f4655T = extras.getInt("combo_scr");
                this.f4676t = this.f4660d * 10;
                this.f4677u = this.f4661e * 8;
                this.f4678v = this.f4662f * 5;
                this.f4679w = this.f4663g * 2;
                this.f4680x = this.f4664h * -5;
                this.f4675s = extras.getInt("totalScore");
                this.f4652P = new Date(System.currentTimeMillis());
                this.f4665i = (((this.f4660d + this.f4661e) + this.f4662f) + this.f4663g) + this.f4664h;
                SQLiteDatabase writableDatabase = new C1213is(this, "data", null).getWritableDatabase();
                Cursor query = writableDatabase.query("jp_data", new String[]{"_id", "name", "score", "date", "isnew"}, "name='" + this.f4668l + "'", null, null, null, null);
                while (query.moveToNext()) {
                    this.f4674r = query.getInt(query.getColumnIndexOrThrow("score"));
                }
                if (this.f4674r <= this.f4675s) {
                    this.f4673q = true;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("score", Integer.valueOf(this.f4675s));
                    contentValues.put("date", String.valueOf(this.f4652P));
                    contentValues.put("isnew", Integer.valueOf(0));
                    writableDatabase.update("jp_data", contentValues, "name='" + this.f4668l + "'", null);
                    contentValues.clear();
                } else {
                    this.f4673q = false;
                }
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e) {
                        break;
                    }
                }
                writableDatabase.close();
                break;
            case 1:
                this.f4674r = extras.getInt("topScore");
                this.f4660d = extras.getInt("perf");
                this.f4661e = extras.getInt("cool");
                this.f4662f = extras.getInt("great");
                this.f4663g = extras.getInt("bad");
                this.f4664h = extras.getInt("miss");
                this.f4668l = extras.getString("name");
                this.f4670n = extras.getString("songID");
                this.f4669m = extras.getString("path");
                this.f4667k = extras.getDouble("nandu");
                this.f4666j = extras.getInt("top_combo");
                this.f4655T = extras.getInt("combo_scr");
                try {
                    this.f4653Q = new String(extras.getByteArray("scoreArray"), "UTF-8");
                    this.f4653Q = C1340nk.m4154a(this.f4653Q);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                this.f4675s = extras.getInt("totalScore");
                this.f4676t = this.f4660d * 10;
                this.f4677u = this.f4661e * 8;
                this.f4678v = this.f4662f * 5;
                this.f4679w = this.f4663g * 2;
                this.f4680x = this.f4664h * -5;
                this.f4665i = (((this.f4660d + this.f4661e) + this.f4662f) + this.f4663g) + this.f4664h;
                this.f4659c = ((((this.f4676t + this.f4677u) + this.f4678v) + this.f4679w) + this.f4680x) + this.f4655T;
                this.f4652P = new Date(System.currentTimeMillis());
                this.f4673q = this.f4675s >= this.f4674r;
                if (this.f4659c > 0) {
                    this.f4658b = "t";
                    new C1241jt(this).execute(null, null, null);
                }
                this.f4659c = 0;
                break;
        }
        setContentView(R.layout.finish);
        this.f4671o = findViewById(R.id.ok);
        this.f4671o.setOnClickListener(this);
        this.f4672p = findViewById(R.id.retry);
        this.f4672p.setOnClickListener(this);
        this.f4654R = findViewById(R.id.share_score);
        this.f4654R.setOnClickListener(this);
        this.f4681y = findViewById(R.id.perfect);
        this.f4681y.setText(String.valueOf(this.f4660d));
        this.f4682z = findViewById(R.id.cool);
        this.f4682z.setText(String.valueOf(this.f4661e));
        this.f4637A = findViewById(R.id.great);
        this.f4637A.setText(String.valueOf(this.f4662f));
        this.f4638B = findViewById(R.id.bad);
        this.f4638B.setText(String.valueOf(this.f4663g));
        this.f4639C = findViewById(R.id.miss);
        this.f4639C.setText(String.valueOf(this.f4664h));
        this.f4640D = findViewById(R.id.total);
        this.f4640D.setText(String.valueOf(this.f4665i));
        this.f4641E = findViewById(R.id.combo);
        this.f4641E.setText(String.valueOf(this.f4666j));
        this.f4642F = findViewById(R.id.combo_scr);
        this.f4642F.setText(String.valueOf(this.f4655T));
        this.f4643G = findViewById(R.id.perfect_scr);
        this.f4643G.setText(String.valueOf(this.f4676t));
        this.f4644H = findViewById(R.id.cool_scr);
        this.f4644H.setText(String.valueOf(this.f4677u));
        this.f4645I = findViewById(R.id.great_scr);
        this.f4645I.setText(String.valueOf(this.f4678v));
        this.f4646J = findViewById(R.id.bad_scr);
        this.f4646J.setText(String.valueOf(this.f4679w));
        this.f4647K = findViewById(R.id.miss_scr);
        this.f4647K.setText(String.valueOf(this.f4680x));
        this.f4648L = findViewById(R.id.total_scr);
        this.f4648L.setText(String.valueOf(this.f4675s));
        this.f4649M = findViewById(R.id.highscore);
        this.f4649M.setText(String.valueOf(this.f4674r));
        this.f4650N = findViewById(R.id.totlescore);
        this.f4650N.setText(String.valueOf(this.f4675s));
        this.f4651O = findViewById(R.id.report);
        if (this.f4673q) {
            this.f4651O.setText("恭喜您获得了<" + this.f4668l + ">曲目的冠军！");
        } else {
            this.f4651O.setText("很不幸,你差点就是<" + this.f4668l + ">曲目的冠军了。");
        }
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
