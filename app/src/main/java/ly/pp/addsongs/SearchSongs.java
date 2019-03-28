package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.SearchSongs */
public class SearchSongs extends Activity implements Callback, OnClickListener {
    /* renamed from: a */
    public LayoutInflater f4946a;
    /* renamed from: b */
    public int f4947b = 0;
    /* renamed from: c */
    public String f4948c = "";
    /* renamed from: d */
    public String f4949d = "";
    /* renamed from: e */
    public Long f4950e = null;
    /* renamed from: f */
    public ListView f4951f;
    /* renamed from: g */
    public C1253ke f4952g;
    /* renamed from: h */
    public Double f4953h;
    /* renamed from: i */
    public int f4954i;
    /* renamed from: j */
    private TextView f4955j;
    /* renamed from: k */
    private TextView f4956k;
    /* renamed from: l */
    private Button f4957l;
    /* renamed from: m */
    public int f4958m = 0;
    /* renamed from: n */
    public JPApplication f4959n;
    /* renamed from: o */
    public C0978a f4960o;
    /* renamed from: p */
    public Handler f4961p;
    /* renamed from: q */
    private Bitmap f4962q = null;

    /* renamed from: a */
    public Bitmap m3831a(Context context) {
        try {
            if (this.f4962q == null) {
                this.f4962q = BitmapFactory.decodeStream(context.getResources().getAssets().open("drawable/nailface.jpg"));
            }
        } catch (IOException e) {
        }
        return this.f4962q;
    }

    /* renamed from: a */
    private List m3834a(String str) {
        JSONArray jSONArray;
        List arrayList = new ArrayList();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        this.f4947b = jSONArray.length();
        for (int i = 0; i < this.f4947b; i++) {
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

    /* renamed from: b */
    public List m3841b(String str) {
        JSONArray jSONArray;
        List arrayList = new ArrayList();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        this.f4947b = jSONArray.length();
        for (int i = 0; i < this.f4947b; i++) {
            try {
                Map hashMap = new HashMap();
                hashMap.put("userID", Integer.valueOf(jSONArray.getJSONObject(i).get("I").toString()));
                hashMap.put("userName", jSONArray.getJSONObject(i).get("K").toString());
                hashMap.put("faceID", jSONArray.getJSONObject(i).get("F").toString());
                hashMap.put("userScore", Integer.valueOf(jSONArray.getJSONObject(i).get("S").toString()));
                hashMap.put("userNuns", Integer.valueOf(jSONArray.getJSONObject(i).get("T").toString()));
                hashMap.put("userSex", jSONArray.getJSONObject(i).get("X").toString());
                arrayList.add(hashMap);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo2963a(String str, ListView listView) {
        try {
            ListAdapter c1273ky = new C1273ky(this, this.f4947b, m3834a(C1340nk.m4156b(new JSONObject(str).getString("L"))));
            if (listView != null) {
                listView.setAdapter(c1273ky);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public void onBackPressed() {
        this.f4952g.dismiss();
        Intent intent = new Intent();
        switch (this.f4958m) {
            case 0:
                intent.setClass(this, OLSongsPage.class);
                break;
            case 1:
                intent.setClass(this, OLMelodySelect.class);
                break;
            case 6:
                intent.setClass(this, OLUsersPage.class);
                break;
        }
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ol_search_b:
                this.f4948c = this.f4955j.getText().toString();
                if (this.f4948c.equals("")) {
                    Toast.makeText(this, "请输入需要搜索的关键词！", Toast.LENGTH_SHORT).show();
                    return;
                }
                new C1269ku(this).execute(null, null, null);
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4959n = (JPApplication) getApplication();
        this.f4958m = getIntent().getExtras().getInt("head");
        setContentView(R.layout.searchsongs);
        this.f4959n.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4946a = LayoutInflater.from(this);
        this.f4955j = (TextView) findViewById(R.id.ol_keywords);
        this.f4957l = (Button) findViewById(R.id.ol_search_b);
        this.f4957l.setOnClickListener(this);
        this.f4952g = new C1253ke(this);
        this.f4951f = (ListView) findViewById(R.id.ol_search_list);
        this.f4956k = (TextView) findViewById(R.id.title_bar);
        if (this.f4958m == 6) {
            this.f4956k.setText("查找玩家:");
        }
    }

    protected void onDestroy() {
        if (this.f4960o != null) {
            //this.f4960o.mo3026a();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
