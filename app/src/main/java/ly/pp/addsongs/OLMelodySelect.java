package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;




/* renamed from: ly.pp.addsongs.OLMelodySelect */
public class OLMelodySelect extends Activity implements Callback, OnClickListener {
    /* renamed from: d */
    public static byte[] f4294d = null;
    /* renamed from: g */
    public static Long f4295g = null;
    /* renamed from: A */
    private Button f4296A;
    /* renamed from: B */
    private Button f4297B;
    /* renamed from: C */
    private Button f4298C;
    /* renamed from: D */
    private Button f4299D;
    /* renamed from: E */
    public Double f4300E;
    /* renamed from: F */
    public int f4301F;
    /* renamed from: G */
    public Button f4302G;
    /* renamed from: H */
    public int f4303H = 0;
    /* renamed from: I */
    public JPApplication f4304I;
    /* renamed from: J */
    public int f4305J = 1;
    /* renamed from: K */
    private PopupWindow f4306K = null;
    /* renamed from: L */
    public C1211iq f4307L = null;
    /* renamed from: M */
    private ArrayList f4308M = new ArrayList();
    /* renamed from: N */
    private int f4309N;
    /* renamed from: O */
    private ListView f4310O = null;
    /* renamed from: P */
    private Handler f4311P;
    /* renamed from: Q */
    private boolean f4312Q = false;
    /* renamed from: R */
    /* renamed from: a */
    int f4314a = 0;
    /* renamed from: b */
    String f4315b = "";
    /* renamed from: c */
    int f4316c = 0;
    /* renamed from: e */
    String f4317e = "";
    /* renamed from: f */
    String f4318f = "";
    /* renamed from: h */
    C1253ke f4319h;
    /* renamed from: i */
    public boolean f4320i;
    /* renamed from: j */
    private List f4321j = null;
    /* renamed from: k */
    public int f4322k = 0;
    /* renamed from: l */
    public LayoutInflater f4323l;
    /* renamed from: m */
    public LayoutInflater f4324m;
    /* renamed from: n */
    private Button f4325n;
    /* renamed from: o */
    private ListView f4326o;
    /* renamed from: p */
    public ListView f4327p;
    /* renamed from: q */
    public TextView f4328q;
    /* renamed from: r */
    private TextView f4329r;
    /* renamed from: s */
    public boolean f4330s = true;
    /* renamed from: t */
    public boolean f4331t = true;
    /* renamed from: u */
    public boolean f4332u = true;
    /* renamed from: v */
    public boolean f4333v = true;
    /* renamed from: w */
    public boolean f4334w = true;
    /* renamed from: x */
    public boolean f4335x = true;
    /* renamed from: y */
    public Button f4336y;
    /* renamed from: z */
    private Button f4337z;

    /* renamed from: a */
    public void m3643a(int i) {
        this.f4308M.clear();
        for (int i2 = 1; i2 <= i; i2++) {
            this.f4308M.add(i2 - 1, "第" + String.valueOf(i2) + "页");
        }
    }

    /* renamed from: b */
    private List m3648b(String str) {
        JSONArray jSONArray;
        List arrayList = new ArrayList();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        this.f4322k = jSONArray.length();
        for (int i = 0; i < this.f4322k; i++) {
            try {
                Map hashMap = new HashMap();
                hashMap.put("songID", Long.valueOf(jSONArray.getJSONObject(i).get("songID").toString()));
                hashMap.put("songName", jSONArray.getJSONObject(i).get("songName").toString());
                hashMap.put("degree", Double.valueOf(jSONArray.getJSONObject(i).get("degree").toString()));
                hashMap.put("artist", jSONArray.getJSONObject(i).get("artist").toString());
                hashMap.put("topUser", jSONArray.getJSONObject(i).get("topUser").toString());
                hashMap.put("topScore", Integer.valueOf(jSONArray.getJSONObject(i).get("topScore").toString()));
                hashMap.put("update", jSONArray.getJSONObject(i).get("update").toString());
                hashMap.put("playCount", jSONArray.getJSONObject(i).get("playCount").toString());
                arrayList.add(hashMap);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo2808a(ListView listView, int i, int i2) {
        List list = this.f4321j;
        if (!(list == null || list.isEmpty())) {
            Collections.sort(list, new C1071dl(this, i));
        }
        listView.setAdapter(new C1077dr(this, i2, list));
    }

    /* renamed from: a */
    public final void mo2809a(String str) {
        this.f4321j = m3648b(str);
    }

    public boolean handleMessage(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                int i = data.getInt("selIndex");
                this.f4302G.setText(" " + ((String) this.f4308M.get(i)) + " ");
                this.f4303H = i;
                this.f4306K.dismiss();
                new C1072dm(this).execute(null, null, null);
                break;
            case 2:
                this.f4308M.remove(data.getInt("delIndex"));
                this.f4307L.notifyDataSetChanged();
                break;
            case 3:
                CharSequence format = SimpleDateFormat.getTimeInstance(3, Locale.ENGLISH).format(new Date());
                if (this.f4329r != null) {
                    this.f4329r.setText(format);
                    break;
                }
                break;
        }
        return false;
    }

    public void onBackPressed() {
        this.f4319h.dismiss();
        Intent intent = new Intent();
        intent.setClass(this, OLSongsPage.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        boolean z = false;
        boolean z2 = true;
        switch (view.getId()) {
            case R.id.ol_date_b:
                if (this.f4331t) {
                    z2 = false;
                }
                this.f4331t = z2;
                this.f4316c = 0;
                mo2808a(this.f4327p, this.f4316c, this.f4322k);
                return;
            case R.id.ol_degree_b:
                if (!this.f4332u) {
                    z = true;
                }
                this.f4332u = z;
                this.f4316c = 1;
                mo2808a(this.f4327p, this.f4316c, this.f4322k);
                return;
            case R.id.ol_name_b:
                if (!this.f4333v) {
                    z = true;
                }
                this.f4333v = z;
                this.f4316c = 2;
                mo2808a(this.f4327p, this.f4316c, this.f4322k);
                return;
            case R.id.ol_artist_b:
                if (!this.f4334w) {
                    z = true;
                }
                this.f4334w = z;
                this.f4316c = 3;
                mo2808a(this.f4327p, this.f4316c, this.f4322k);
                return;
            case R.id.ol_hot_b:
                if (!this.f4335x) {
                    z = true;
                }
                this.f4335x = z;
                this.f4316c = 3;
                this.f4316c = 4;
                mo2808a(this.f4327p, this.f4316c, this.f4322k);
                return;
            case R.id.ol_search_button:
                Intent intent = new Intent();
                intent.putExtra("head", 1);
                intent.setClass(this, SearchSongs.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_top_next:
                if (this.f4312Q) {
                    this.f4306K.showAsDropDown(this.f4302G);
                    return;
                }
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4320i = true;
        this.f4304I = (JPApplication) getApplication();
        JPApplication jPApplication = this.f4304I;
        JPApplication jPApplication2 = this.f4304I;
        jPApplication.mo2718c(0);
        try {
            this.f4304I.mo2728f(1);
            this.f4304I.mo2731i();
            this.f4323l = LayoutInflater.from(this);
            this.f4324m = LayoutInflater.from(this);
            new ArrayAdapter(this, 17367048, C1194i.f5603g).setDropDownViewResource(17367049);
            setContentView(LayoutInflater.from(this).inflate(R.layout.olmelodylist, null));
            this.f4304I.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sup_view);
            ((ImageButton) findViewById(R.id.sup)).setOnClickListener(new C1068di(this));
            this.f4325n = (Button) findViewById(R.id.ol_search_button);
            this.f4325n.setOnClickListener(this);
            this.f4326o = (ListView) findViewById(R.id.ol_f_list);
            this.f4327p = (ListView) findViewById(R.id.ol_c_list);
            this.f4326o.setAdapter(new C1076dq(this));
            this.f4326o.setCacheColorHint(0);
            this.f4326o.setOnItemClickListener(new C1069dj(this, linearLayout));
            this.f4328q = (TextView) findViewById(R.id.title_bar);
            if (this.f4330s) {
                this.f4328q.setVisibility(View.VISIBLE);
            }
            this.f4336y = (Button) findViewById(R.id.show_button);
            this.f4337z = (Button) findViewById(R.id.ol_date_b);
            this.f4337z.setOnClickListener(this);
            this.f4296A = (Button) findViewById(R.id.ol_degree_b);
            this.f4296A.setOnClickListener(this);
            this.f4297B = (Button) findViewById(R.id.ol_name_b);
            this.f4297B.setOnClickListener(this);
            this.f4299D = (Button) findViewById(R.id.ol_hot_b);
            this.f4299D.setOnClickListener(this);
            this.f4298C = (Button) findViewById(R.id.ol_artist_b);
            this.f4298C.setOnClickListener(this);
            this.f4302G = (Button) findViewById(R.id.ol_top_next);
            this.f4302G.setOnClickListener(this);
            this.f4336y.setOnClickListener(new C1070dk(this));
            this.f4319h = new C1253ke(this);
        } catch (Exception e) {
            e.toString();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }

    protected void onDestroy() {
        this.f4311P = null;
        this.f4320i = false;
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();

    }

    protected void onResume() {
        f4294d = null;
        super.onResume();

    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        while (!this.f4312Q) {
            this.f4311P = new Handler(this);
            this.f4309N = this.f4302G.getWidth();
            m3643a(this.f4305J);
            View inflate = getLayoutInflater().inflate(R.layout.options, null);
            this.f4310O = (ListView) inflate.findViewById(R.id.list);
            this.f4307L = new C1211iq(this, this.f4311P, this.f4308M);
            this.f4310O.setAdapter(this.f4307L);
            this.f4306K = new PopupWindow(inflate, this.f4309N, -2, true);
            this.f4306K.setOutsideTouchable(true);
            this.f4306K.setBackgroundDrawable(getResources().getDrawable(R.drawable.filled_face));
            this.f4312Q = true;
        }
    }
}
