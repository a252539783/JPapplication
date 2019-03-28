package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;





/* renamed from: ly.pp.addsongs.ShowSongsInfo */
public class ShowSongsInfo extends Activity implements OnClickListener {
    /* renamed from: a */
    public LayoutInflater f4965a;
    /* renamed from: b */
    private int f4966b = 0;
    /* renamed from: c */
    public String f4967c = "";
    /* renamed from: d */
    public String f4968d = "";
    /* renamed from: e */
    public Long f4969e = null;
    /* renamed from: f */
    public ListView f4970f;
    /* renamed from: g */
    public C1253ke f4971g;
    /* renamed from: h */
    public Double f4972h;
    /* renamed from: i */
    public int f4973i;
    /* renamed from: j */
    private TextView f4974j;
    /* renamed from: k */
    private TextView f4975k;
    /* renamed from: l */
    private Button f4976l;
    /* renamed from: m */
    private Button f4977m;
    /* renamed from: n */
    public String f4978n = "1";
    /* renamed from: o */
    public int f4979o = 0;
    /* renamed from: p */
    private int f4980p = 0;
    /* renamed from: q */
    public JPApplication f4981q;
    /* renamed from: r */
    private C1285lj f4982r;
    /* renamed from: s */
    private List f4983s;
    /* renamed from: t */

    /* renamed from: a */
    private List m3857a(String str) {
        JSONArray jSONArray;
        List arrayList = new ArrayList();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        this.f4966b = jSONArray.length();
        for (int i = 0; i < this.f4966b; i++) {
            try {
                Map hashMap = new HashMap();
                hashMap.put("songID", jSONArray.getJSONObject(i).get("SI").toString());
                hashMap.put("songName", jSONArray.getJSONObject(i).get("SN").toString());
                hashMap.put("degree", Double.valueOf(jSONArray.getJSONObject(i).get("DG").toString()));
                hashMap.put("artist", jSONArray.getJSONObject(i).get("AR").toString());
                hashMap.put("topUser", jSONArray.getJSONObject(i).get("TU").toString());
                hashMap.put("topScore", jSONArray.getJSONObject(i).get("TS").toString());
                hashMap.put("playCount", Integer.valueOf(jSONArray.getJSONObject(i).get("PC").toString()));
                hashMap.put("update", jSONArray.getJSONObject(i).get("UP").toString());
                arrayList.add(hashMap);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo2976a(int i) {
        if (this.f4982r != null && this.f4983s != null) {
            this.f4983s.remove(i);
            this.f4982r.mo3500a(this.f4983s);
            this.f4982r.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo2977a(String str, ListView listView) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.f4983s = m3857a(C1340nk.m4156b(new JSONObject(str).getString("L")));
            this.f4982r = new C1285lj(this, this.f4966b, this.f4983s);
            if (listView != null) {
                listView.setAdapter(this.f4982r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onBackPressed() {
        if (this.f4971g != null) {
            this.f4971g.dismiss();
        }
        Intent intent = new Intent();
        intent.setClass(this, OLSongsPage.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        if (this.f4967c.equals("H") || this.f4967c.equals("N") || this.f4967c.equals("T") || this.f4967c.equals("M")) {
            switch (view.getId()) {
                case R.id.ol_top_next:
                    this.f4979o++;
                    this.f4980p = (this.f4979o * 2) + 1;
                    this.f4975k.setText("-" + String.valueOf(this.f4979o + 1) + "-");
                    new C1281lf(this).execute(null, null, null);
                    return;
                case R.id.ol_top_before:
                    this.f4979o--;
                    if (this.f4979o < 0) {
                        this.f4979o = 0;
                    }
                    this.f4980p = (this.f4979o * 2) + 1;
                    this.f4975k.setText("-" + String.valueOf(this.f4979o + 1) + "-");
                    new C1281lf(this).execute(null, null, null);
                    return;
                default:
                    return;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4981q = (JPApplication) getApplication();
        Bundle extras = getIntent().getExtras();
        this.f4978n = extras.getString("head");
        this.f4967c = extras.getString("keywords");
        setContentView(R.layout.showtopinfo);
        this.f4981q.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4965a = LayoutInflater.from(this);
        this.f4974j = (TextView) findViewById(R.id.ol_top_tittle);
        this.f4976l = (Button) findViewById(R.id.ol_top_before);
        this.f4977m = (Button) findViewById(R.id.ol_top_next);
        this.f4976l.setOnClickListener(this);
        this.f4977m.setOnClickListener(this);
        this.f4975k = (TextView) findViewById(R.id.ol_top_page);
        this.f4975k.setText("-" + String.valueOf(this.f4979o + 1) + "-");
        if (this.f4967c.equals("N")) {
            this.f4974j.setText("-最新曲目-");
            this.f4971g = new C1253ke(this);
            this.f4970f = (ListView) findViewById(R.id.ol_top_list);
            new C1281lf(this).execute(null, null, null);
        } else if (this.f4967c.equals("H")) {
            this.f4974j.setText("-热门曲目-");
            this.f4971g = new C1253ke(this);
            this.f4970f = (ListView) findViewById(R.id.ol_top_list);
            new C1281lf(this).execute(null, null, null);
        } else if (this.f4967c.equals("F")) {
            this.f4974j.setText("-曲谱收藏-");
            this.f4971g = new C1253ke(this);
            this.f4970f = (ListView) findViewById(R.id.ol_top_list);
            new C1281lf(this).execute(null, null, null);
        } else if (this.f4967c.equals("T")) {
            this.f4974j.setText("-新晋冠军-");
            this.f4971g = new C1253ke(this);
            this.f4970f = (ListView) findViewById(R.id.ol_top_list);
            this.f4970f.setCacheColorHint(0);
            new C1281lf(this).execute(null, null, null);
        } else if (this.f4967c.equals("M")) {
            this.f4974j.setText("-最多收藏-");
            this.f4971g = new C1253ke(this);
            this.f4970f = (ListView) findViewById(R.id.ol_top_list);
            this.f4970f.setCacheColorHint(0);
            new C1281lf(this).execute(null, null, null);
        }
        if (System.currentTimeMillis() > 1391011200000L) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
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
