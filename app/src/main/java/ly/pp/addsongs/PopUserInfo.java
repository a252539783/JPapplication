package ly.pp.addsongs;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;



/* renamed from: ly.pp.addsongs.PopUserInfo */
public class PopUserInfo extends Activity implements Callback, OnClickListener {
    /* renamed from: a */
    C1253ke f4827a;
    /* renamed from: b */
    int f4828b = 0;
    /* renamed from: c */
    String f4829c = "";
    /* renamed from: d */
    String f4830d = "P";
    /* renamed from: e */
    TextView f4831e;
    /* renamed from: f */
    TextView f4832f;
    /* renamed from: g */
    TextView f4833g;
    /* renamed from: h */
    TextView f4834h;
    /* renamed from: i */
    ImageView f4835i;
    /* renamed from: j */
    JPApplication f4836j;
    /* renamed from: k */
    C0978a f4837k;
    /* renamed from: l */
    Handler f4838l;
    /* renamed from: m */
    String f4839m = "";
    /* renamed from: n */
    private Button f4840n;
    /* renamed from: o */
    private Button f4841o;

    /* renamed from: a */
    static /* synthetic */ void m3823a(PopUserInfo popUserInfo, String str) {
        JSONObject jSONObject;
        popUserInfo.f4838l = new Handler(popUserInfo);
        popUserInfo.f4837k = new C0978a(popUserInfo.f4838l, 1);
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        try {
            popUserInfo.f4831e.setText(popUserInfo.f4829c);
            if (jSONObject.getString("sex").equals("m")) {
                popUserInfo.f4833g.setText("男");
            } else {
                popUserInfo.f4833g.setText("女");
            }
            popUserInfo.f4835i.setTag(jSONObject.getString("faceID"));
            popUserInfo.f4837k.mo3027a(popUserInfo.f4835i, null);
            popUserInfo.f4834h.setText(jSONObject.getInt("age") + "岁");
            CharSequence obj = jSONObject.get("msg").toString();
            if (obj.equals("")) {
                obj = "该玩家暂未设置个性签名";
            }
            popUserInfo.f4832f.setText(obj);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public void onBackPressed() {
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add_friend:
                if (!this.f4829c.equals(this.f4836j.mo2702Q())) {
                    this.f4828b = 2;
                    C1302m c1302m = new C1302m(this);
                    c1302m.mo3539b("好友请求");
                    c1302m.mo3535a("添加[" + this.f4829c + "]为好友,确定吗?");
                    c1302m.mo3536a("确定", new C1246jy(this));
                    c1302m.mo3540b("取消", new C1247jz(this));
                    c1302m.mo3541c();
                    return;
                }
                return;
            case R.id.send_mail:
                if (!this.f4829c.equals(this.f4836j.mo2702Q())) {
                    this.f4828b = 2;
                    String str = this.f4829c;
                    String P = this.f4836j.mo2701P();
                    View inflate = getLayoutInflater().inflate(R.layout.message_send, (ViewGroup) findViewById(R.id.dialog));
                    TextView textView = (TextView) inflate.findViewById(R.id.text_1);
                    TextView textView2 = (TextView) inflate.findViewById(R.id.title_1);
                    TextView textView3 = (TextView) inflate.findViewById(R.id.title_2);
                    ((TextView) inflate.findViewById(R.id.text_2)).setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);
                    textView2.setText("消息:");
                    new C1302m(this).mo3539b("发私信给" + str).mo3534a(inflate).mo3536a("发送", new C1249ka(this, textView, str, P)).mo3540b("取消", new C1250kb(this)).mo3541c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.popuserinfo);
        this.f4836j = (JPApplication) getApplication();
        this.f4831e = (TextView) findViewById(R.id.user_kitiname);
        this.f4833g = (TextView) findViewById(R.id.user_sex);
        this.f4832f = (TextView) findViewById(R.id.user_msg);
        this.f4835i = (ImageView) findViewById(R.id.user_face);
        this.f4834h = (TextView) findViewById(R.id.user_age);
        this.f4840n = (Button) findViewById(R.id.add_friend);
        this.f4840n.setOnClickListener(this);
        this.f4841o = (Button) findViewById(R.id.send_mail);
        this.f4841o.setOnClickListener(this);
        Bundle extras = getIntent().getExtras();
        this.f4828b = extras.getInt("head");
        if (this.f4828b == 2) {
            this.f4828b = 1;
            this.f4840n.setVisibility(View.INVISIBLE);
        }
        this.f4829c = extras.getString("userKitiName");
        this.f4827a = new C1253ke(this);
        this.f4839m = "GetUserInfo";
        new C1251kc(this, (byte) 0).execute(null, null, null);
    }

    protected void onDestroy() {
        if (this.f4837k != null) {
            //this.f4837k.mo3026a();
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
