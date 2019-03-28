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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;




/* renamed from: ly.pp.addsongs.ShowTopInfo */
public class ShowTopInfo extends Activity implements Callback, OnClickListener {
    /* renamed from: a */
    public List f4985a = null;
    /* renamed from: b */
    public LayoutInflater f4986b;
    /* renamed from: c */
    public int f4987c = 0;
    /* renamed from: d */
    public String f4988d = "";
    /* renamed from: e */
    public ListView f4989e;
    /* renamed from: f */
    public C1253ke f4990f;
    /* renamed from: g */
    public int f4991g = 0;
    /* renamed from: h */
    private TextView f4992h;
    /* renamed from: i */
    private TextView f4993i;
    /* renamed from: j */
    private Button f4994j;
    /* renamed from: k */
    private Button f4995k;
    /* renamed from: l */
    public int f4996l = 0;
    /* renamed from: m */
    public int f4997m = 0;
    /* renamed from: n */
    private int f4998n = 20;
    /* renamed from: o */
    public String f4999o = "";
    /* renamed from: p */
    public JPApplication f5000p;
    /* renamed from: q */
    public C0978a f5001q;
    /* renamed from: r */
    public Handler f5002r;
    /* renamed from: s */
    private Bitmap f5003s = null;
    /* renamed from: t */

    /* renamed from: a */
    public Bitmap m3874a(Context context) {
        try {
            if (this.f5003s == null) {
                this.f5003s = BitmapFactory.decodeStream(context.getResources().getAssets().open("drawable/nailface.jpg"));
            }
        } catch (IOException e) {
        }
        return this.f5003s;
    }

    /* renamed from: a */
    public List m3877a(String str) {
        JSONArray jSONArray;
        List arrayList = new ArrayList();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        this.f4987c = jSONArray.length();
        for (int i = 0; i < this.f4987c; i++) {
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

    public boolean handleMessage(Message message) {
        return false;
    }

    public void onBackPressed() {
        this.f4990f.dismiss();
        Intent intent = new Intent();
        if (this.f4991g == 5) {
            intent.setClass(this, OLUsersPage.class);
        } else {
            intent.setClass(this, OLTopUser.class);
        }
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ol_top_next:
                this.f4996l++;
                this.f4997m = (this.f4996l * this.f4998n) + 1;
                this.f4993i.setText("-" + String.valueOf(this.f4996l + 1) + "-");
                new C1290lo(this).execute(null, null, null);
                return;
            case R.id.ol_top_before:
                this.f4996l--;
                if (this.f4996l < 0) {
                    this.f4996l = 0;
                    return;
                }
                this.f4997m = (this.f4996l * this.f4998n) + 1;
                this.f4993i.setText("-" + String.valueOf(this.f4996l + 1) + "-");
                new C1290lo(this).execute(null, null, null);
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5000p = (JPApplication) getApplication();
        setContentView(R.layout.showtopinfo);
        this.f5000p.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4986b = LayoutInflater.from(this);
        this.f4990f = new C1253ke(this);
        this.f4989e = (ListView) findViewById(R.id.ol_top_list);
        this.f4992h = (TextView) findViewById(R.id.ol_top_tittle);
        this.f4994j = (Button) findViewById(R.id.ol_top_before);
        this.f4995k = (Button) findViewById(R.id.ol_top_next);
        this.f4997m = (this.f4996l * this.f4998n) + 1;
        Bundle extras = getIntent().getExtras();
        this.f4991g = extras.getInt("head");
        this.f4988d = extras.getString("keywords");
        if (this.f4988d.equals("C")) {
            this.f4999o = "全国";
        } else {
            this.f4999o = extras.getString("address");
        }
        this.f4994j.setOnClickListener(this);
        this.f4995k.setOnClickListener(this);
        this.f4993i = (TextView) findViewById(R.id.ol_top_page);
        this.f4993i.setText("-" + String.valueOf(this.f4996l + 1) + "-");
        switch (this.f4991g) {
            case 0:
                this.f4992h.setText("-" + this.f4999o + "冠军榜-");
                break;
            case 1:
                this.f4992h.setText("-" + this.f4999o + "成绩榜-");
                break;
            case 2:
                this.f4992h.setText("-" + this.f4999o + "达人榜-");
                break;
            case 3:
                this.f4992h.setText("-" + this.f4999o + "新秀榜-");
                break;
            case 4:
                this.f4992h.setText("-" + this.f4999o + "等级榜-");
                break;
            case 5:
                this.f4992h.setText("-附近玩家-");
                this.f4994j.setVisibility(View.GONE);
                this.f4995k.setVisibility(View.GONE);
                this.f4993i.setVisibility(View.GONE);
                break;
            case 7:
                this.f4992h.setText("-" + this.f4999o + "总分日榜-");
                break;
            case 8:
                this.f4992h.setText("-" + this.f4999o + "总分周榜-");
                break;
            case 9:
                this.f4992h.setText("-" + this.f4999o + "总分月榜-");
                break;
            case 10:
                this.f4992h.setText("-" + this.f4999o + "考级榜-");
                break;
        }
        new C1290lo(this).execute(null, null, null);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }

    protected void onDestroy() {
        if (this.f5001q != null) {
            //this.f5001q.mo3026a();
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
