package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;




/* renamed from: ly.pp.addsongs.MelodySelect */
public class MelodySelect extends Activity implements Callback, OnClickListener {
    /* renamed from: A */
    public boolean f4224A;
    /* renamed from: B */
    SharedPreferences f4225B;
    /* renamed from: C */
    public LayoutInflater f4226C;
    /* renamed from: D */
    public LayoutInflater f4227D;
    /* renamed from: E */
    public ImageView f4228E;
    /* renamed from: F */
    private Button f4229F;
    /* renamed from: G */
    private Button f4230G;
    /* renamed from: H */
    public String f4231H = "";
    /* renamed from: I */
    private int f4232I;
    /* renamed from: J */
    private ListView f4233J = null;
    /* renamed from: K */
    private boolean f4234K = false;
    /* renamed from: L */
    private PopupWindow f4235L = null;
    /* renamed from: M */
    private C1211iq f4236M = null;
    /* renamed from: N */
    private TextView f4237N;
    /* renamed from: O */
    public String f4238O = "online = 1";
    /* renamed from: P */
    /* renamed from: Q */
    public String f4240Q = "";
    /* renamed from: R */
    public CheckBox f4241R;
    /* renamed from: S */
    public CheckBox f4242S;
    /* renamed from: T */
    public CheckBox f4243T;
    /* renamed from: U */
    private int f4244U = 0;
    /* renamed from: a */
    ListView f4245a;
    /* renamed from: b */
    ListView f4246b;
    /* renamed from: c */
    TextView f4247c;
    /* renamed from: d */
    TextView f4248d;
    /* renamed from: e */
    Button f4249e;
    /* renamed from: f */
    C1020bo f4250f;
    /* renamed from: g */
    C1213is f4251g;
    /* renamed from: h */
    SQLiteDatabase f4252h;
    /* renamed from: i */
    int f4253i = 0;
    /* renamed from: j */
    boolean f4254j = false;
    /* renamed from: k */
    boolean f4255k = true;
    /* renamed from: l */
    int f4256l = 0;
    /* renamed from: m */
    int f4257m;
    /* renamed from: n */
    int f4258n = 55;
    /* renamed from: o */
    int f4259o = 0;
    /* renamed from: p */
    String f4260p = null;
    /* renamed from: q */
    View f4261q;
    /* renamed from: r */
    C1243jv f4262r;
    /* renamed from: s */
    String f4263s = "";
    /* renamed from: t */
    int f4264t = 0;
    /* renamed from: u */
    LayoutInflater f4265u;
    /* renamed from: v */
    TextView f4266v;
    /* renamed from: w */
    JPApplication f4267w;
    /* renamed from: x */
    public Handler f4268x;
    /* renamed from: y */
    public ArrayList f4269y = new ArrayList();
    /* renamed from: z */
    Cursor f4270z;

    /* renamed from: b */
    private void m3611b() {
        this.f4269y.clear();
        for (Object add : C1194i.f5603g) {
            this.f4269y.add(add);
        }
    }

    /* renamed from: a */
    public final void mo2784a(Cursor cursor) {
        this.f4242S.setChecked(false);
        if (this.f4250f == null) {
            this.f4250f = new C1020bo(this, this, cursor);
            this.f4246b.setAdapter(this.f4250f);
            return;
        }
        Object cursor2;
        if (this.f4260p.equals(C1194i.f5604h[0])) {
             cursor2= new C1309mg(cursor, "name", true);
        } else {
            cursor2 = new C1309mg(cursor, "name", false);
        }
        this.f4250f.changeCursor((Cursor) cursor2);
        this.f4250f.notifyDataSetChanged();
    }

    /* renamed from: a */
    protected final void mo2785a(String str, String str2, int i) {
        C1302m c1302m = new C1302m(this);
        c1302m.mo3539b(str);
        c1302m.mo3535a(str2);
        c1302m.mo3536a("确定", new C1016bk(this));
        c1302m.mo3540b("不再提示", new C1017bl(this, i));
        c1302m.mo3541c();
    }

    /* renamed from: a */
    public final boolean mo2786a() {
        return this.f4242S.isChecked();
    }

    public boolean handleMessage(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                int i = data.getInt("selIndex");
                this.f4229F.setText((CharSequence) this.f4269y.get(i));
                this.f4260p = C1194i.f5604h[i];
                if (!(this.f4231H.equals("") || this.f4250f == null || this.f4252h == null)) {
                    mo2784a(this.f4252h.query("jp_data", null, "ishot = 0 AND " + this.f4238O + " AND item=?", new String[]{this.f4231H}, null, null, this.f4260p));
                }
                this.f4235L.dismiss();
                break;
            case 3:
                CharSequence format = SimpleDateFormat.getTimeInstance(3, Locale.ENGLISH).format(new Date());
                if (this.f4237N != null) {
                    this.f4237N.setText(format);
                    break;
                }
                break;
            case 4:
                Cursor cursor = this.f4250f.getCursor();
                int i2 = data.getInt("position") + 1;
                this.f4262r = null;
                this.f4240Q = "";
                if (cursor.moveToPosition(i2)) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("path"));
                    String string2 = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                    this.f4262r = new C1243jv(this.f4267w, string, this, i2);
                    this.f4262r.f5738b = true;
                    this.f4262r.start();
                    Toast.makeText(this, "正在播放:《" + string2 + "》", Toast.LENGTH_SHORT).show();
                    break;
                }
                break;
        }
        return false;
    }

    public void onBackPressed() {
        if (this.f4252h.isOpen()) {
            this.f4252h.close();
        }
        if (this.f4262r != null) {
            this.f4262r.f5738b = false;
            this.f4262r = null;
        }
        Intent intent;
        if (this.f4244U == 10) {
            intent = new Intent();
            intent.setClass(this, MainMode.class);
            startActivity(intent);
        } else {
            intent = new Intent();
            intent.setClass(this, PlayModeSelect.class);
            startActivity(intent);
        }
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.list_sort_b:
                if (this.f4234K) {
                    this.f4235L.showAsDropDown(this.f4229F);
                    return;
                }
                return;
            case R.id.search_button:
                View inflate = getLayoutInflater().inflate(R.layout.message_send, (ViewGroup) findViewById(R.id.dialog));
                TextView textView = (TextView) inflate.findViewById(R.id.text_1);
                TextView textView2 = (TextView) inflate.findViewById(R.id.title_1);
                TextView textView3 = (TextView) inflate.findViewById(R.id.title_2);
                ((TextView) inflate.findViewById(R.id.text_2)).setVisibility(View.GONE);
                textView3.setVisibility(View.GONE);
                textView2.setText("关键词:");
                new C1302m(this).mo3539b("搜索曲谱").mo3534a(inflate).mo3536a("搜索", new C1018bm(this, textView)).mo3540b("取消", new C1008bc(this)).mo3541c();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4224A = true;
        this.f4244U = getIntent().getFlags();
        setVolumeControlStream(3);
        this.f4260p = C1194i.f5604h[2];
        this.f4267w = (JPApplication) getApplication();
        try {
            this.f4267w.mo2728f(0);
            this.f4265u = (LayoutInflater) getSystemService("layout_inflater");
            this.f4226C = LayoutInflater.from(this);
            this.f4227D = LayoutInflater.from(this);
            this.f4251g = new C1213is(this, "data", null);
            this.f4252h = this.f4251g.getWritableDatabase();
            this.f4270z = this.f4252h.query("jp_data", null, this.f4238O, null, null, null, null);
            while (this.f4270z.moveToNext()) {
                this.f4253i += this.f4270z.getInt(this.f4270z.getColumnIndexOrThrow("score"));
            }
            this.f4257m = this.f4270z.getCount();
            if (this.f4270z != null) {
                this.f4270z.close();
                this.f4270z = null;
            }
            this.f4259o = this.f4257m / this.f4258n;
            LinearLayout linearLayout = (LinearLayout) this.f4265u.inflate(R.layout.melodylist1, null);
            setContentView(linearLayout);
            this.f4267w.mo2706a((Context) this, "ground", linearLayout);
            this.f4230G = (Button) findViewById(R.id.search_button);
            this.f4230G.setOnClickListener(this);
            this.f4229F = (Button) findViewById(R.id.list_sort_b);
            this.f4229F.setOnClickListener(this);
            this.f4245a = (ListView) findViewById(R.id.f_list);
            this.f4246b = (ListView) findViewById(R.id.c_list);
            this.f4247c = (TextView) findViewById(R.id.all_mel);
            this.f4241R = (CheckBox) findViewById(R.id.check_record);
            if (this.f4244U == 10) {
                this.f4241R.setVisibility(View.GONE);
            } else {
                this.f4241R.setOnCheckedChangeListener(new C1009bd(this));
            }
            this.f4242S = (CheckBox) findViewById(R.id.check_play);
            if (this.f4244U == 10) {
                this.f4242S.setVisibility(View.GONE);
            } else {
                this.f4241R.setOnCheckedChangeListener(new C1010be(this));
            }
            this.f4243T = (CheckBox) findViewById(R.id.check_hand);
            if (this.f4244U == 10) {
                this.f4243T.setVisibility(View.GONE);
            } else {
                this.f4241R.setOnCheckedChangeListener(new C1012bg(this));
            }
            this.f4248d = (TextView) findViewById(R.id.totle_score_all);
            this.f4247c.setText("曲谱:" + this.f4257m);
            this.f4248d.setText("总分:" + this.f4253i);
            this.f4245a.setAdapter(new C1019bn(this));
            this.f4246b.setCacheColorHint(0);
            this.f4245a.setCacheColorHint(0);
            this.f4245a.setOnItemClickListener(new C1014bi(this));
            this.f4266v = (TextView) findViewById(R.id.title_bar);
            this.f4237N = (TextView) findViewById(R.id.time_text);
            if (this.f4255k) {
                this.f4266v.setVisibility(View.VISIBLE);
            }
            this.f4249e = (Button) findViewById(R.id.show_button);
            this.f4249e.setOnClickListener(new C1015bj(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f4225B = getSharedPreferences("set", 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }

    protected void onDestroy() {
        if (this.f4262r != null) {
            this.f4262r.f5738b = false;
            this.f4262r = null;
        }
        this.f4268x = null;
        this.f4224A = false;
        if (!(this.f4250f == null || this.f4250f.getCursor() == null)) {
            this.f4250f.getCursor().close();
        }
        if (this.f4270z != null) {
            this.f4270z.close();
            this.f4270z = null;
        }
        if (this.f4252h.isOpen()) {
            this.f4252h.close();
            this.f4252h = null;
            this.f4251g.close();
            this.f4251g = null;
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.f4262r != null) {
                this.f4262r.f5738b = false;
                this.f4262r = null;
            }
        } catch (Exception e) {
        }
        super.onPause();

    }

    protected void onResume() {
        super.onResume();

    }

    protected void onStop() {
        super.onStop();
        this.f4241R.setChecked(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        while (!this.f4234K) {
            this.f4268x = new Handler(this);
            this.f4232I = this.f4229F.getWidth() + 10;
            m3611b();
            View inflate = getLayoutInflater().inflate(R.layout.options, null);
            this.f4233J = (ListView) inflate.findViewById(R.id.list);
            this.f4236M = new C1211iq(this, this.f4268x, this.f4269y);
            this.f4233J.setAdapter(this.f4236M);
            this.f4235L = new PopupWindow(inflate, this.f4232I, -2, true);
            this.f4235L.setOutsideTouchable(true);
            this.f4235L.setBackgroundDrawable(getResources().getDrawable(R.drawable.filled_box));
            this.f4234K = true;
        }
    }
}
