package ly.pp.addsongs;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;




/* renamed from: ly.pp.addsongs.MoreAppActivity */
public class MoreAppActivity extends Activity implements Callback, OnClickListener {
    /* renamed from: a */
    public ListView f4271a;
    /* renamed from: b */
    public List f4272b = null;
    /* renamed from: c */
    public JPApplication f4273c;
    /* renamed from: d */
    public C0978a f4274d;
    /* renamed from: e */
    public Handler f4275e;
    /* renamed from: f */
    public LayoutInflater f4276f;
    /* renamed from: g */
    public C1253ke f4277g;
    /* renamed from: h */
    private Bitmap f4278h = null;
    /* renamed from: i */
    public int f4279i = 0;
    /* renamed from: j */
    public String f4280j = "";
    /* renamed from: k */
    public int f4281k = 0;

    /* renamed from: b */
    public List m3629b(String str) {
        JSONArray jSONArray;
        List arrayList = new ArrayList();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        this.f4279i = jSONArray.length();
        for (int i = 0; i < this.f4279i; i++) {
            try {
                Map hashMap = new HashMap();
                hashMap.put("icon", jSONArray.getJSONObject(i).get("i"));
                hashMap.put("name", jSONArray.getJSONObject(i).get("n").toString());
                hashMap.put("content", jSONArray.getJSONObject(i).get("c").toString());
                hashMap.put("apk", jSONArray.getJSONObject(i).get("a").toString());
                hashMap.put("size", jSONArray.getJSONObject(i).get("s").toString());
                arrayList.add(hashMap);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo2796a(String str) {
        String str2;
        try {
            str2 = "android.intent.action.VIEW";
            Intent intent = new Intent(str2, Uri.parse(new StringBuilder("market://details?id=") + str));
            intent.setPackage("com.android.vending");
            startActivity(intent);
        } catch (Exception e) {
            try {
                str2 = "android.intent.action.VIEW";
                startActivity(new Intent(str2, Uri.parse(new StringBuilder("market://details?id=") + str)));
            } catch (Exception e2) {
                Toast.makeText(this, "您的设备未安装市场类应用，谢谢您的支持！", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, MainMode.class);
        startActivity(intent);
        finish();
        finish();
    }

    public void onClick(View view) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.more_app);
        this.f4271a = (ListView) findViewById(R.id.more_app_list);
        this.f4273c = (JPApplication) getApplication();
        this.f4276f = LayoutInflater.from(this);
        this.f4277g = new C1253ke(this);
        new C1028bw(this).execute(null, null, null);
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
