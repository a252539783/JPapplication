package ly.pp.addsongs;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: ly.pp.addsongs.FriendMailPage */
public class FriendMailPage extends Activity implements Callback {
    /* renamed from: a */
    public ListView f4019a;
    /* renamed from: b */
    private Handler f4020b;
    /* renamed from: c */
    public ArrayList f4021c;
    /* renamed from: d */
   public JPApplication f4022d;
    /* renamed from: e */
    public C1253ke f4023e;
    /* renamed from: f */
    public String f4024f = "F";
    /* renamed from: g */
    public C1351z f4025g;
    /* renamed from: h */
    private TextView f4026h;
    /* renamed from: i */
    private SharedPreferences f4027i = null;
    /* renamed from: j */
    private Editor f4028j = null;

    /* renamed from: a */
    private void m3505a(String str, String str2, int i, int i2) {
        String str3;
        String str4;
        View inflate = getLayoutInflater().inflate(R.layout.message_send, (ViewGroup) findViewById(R.id.dialog));
        TextView textView = (TextView) inflate.findViewById(R.id.text_1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.title_1);
        TextView textView3 = (TextView) inflate.findViewById(R.id.title_2);
        ((TextView) inflate.findViewById(R.id.text_2)).setVisibility(View.GONE);
        textView3.setVisibility(View.GONE);
        if (i == 1) {
            textView2.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);
            str3 = "同意";
            str4 = "同意" + str + "的好友请求";
        } else if (i == 2) {
            textView2.setVisibility(View.GONE);
            textView.setVisibility(View.GONE);
            str3 = "确定";
            str4 = "刪除好友" + str + "?";
        } else {
            textView2.setText("消息:");
            str3 = "发送";
            str4 = "发私信给" + str;
        }
        new C1302m(this).mo3539b(str4).mo3534a(inflate).mo3536a(str3, new C1347v(this, textView, i, str, i2, str2)).mo3540b("取消", new C1348w(this)).mo3541c();
    }

    /* renamed from: a */
    static /* synthetic */ void m3506a(FriendMailPage friendMailPage, ListView listView, String str) {
        int i = 0;
        try {
            int i2;
            JSONArray jSONArray = new JSONArray(str);
            friendMailPage.f4021c = new ArrayList();
            int length = jSONArray.length();
            for (i2 = 0; i2 < length; i2++) {
                friendMailPage.f4021c.add(jSONArray.getJSONObject(i2));
            }
            if (!(friendMailPage.f4027i == null || friendMailPage.f4028j == null)) {
                jSONArray = new JSONArray(friendMailPage.f4027i.getString("mailsString", "[]"));
                length = jSONArray.length();
                for (i2 = 0; i2 < length; i2++) {
                    friendMailPage.f4021c.add(jSONArray.getJSONObject(i2));
                }
                i2 = friendMailPage.f4021c.size();
                jSONArray = new JSONArray();
                while (i < i2) {
                    jSONArray.put(friendMailPage.f4021c.get(i));
                    i++;
                }
                friendMailPage.f4028j.putString("mailsString", jSONArray.toString());
                jSONArray.toString();
                friendMailPage.f4028j.commit();
            }
            friendMailPage.f4025g = new C1351z(friendMailPage, friendMailPage.f4021c, friendMailPage);
            listView.setAdapter(friendMailPage.f4025g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo2683a(int i, int i2, String str, String str2) {
        int i3 = 0;
        switch (i) {
            case 0:
                Intent intent = new Intent();
                intent.putExtra("head", 2);
                intent.putExtra("userKitiName", str);
                intent.setClass(this, PopUserInfo.class);
                startActivity(intent);
                return;
            case 1:
                m3505a(str, this.f4022d.mo2701P(), 2, i2);
                return;
            case 2:
                m3505a(str, this.f4022d.mo2701P(), 0, 0);
                return;
            case 3:
                if (str2.equals("")) {
                    m3505a(str, this.f4022d.mo2701P(), 1, 0);
                    return;
                } else {
                    m3505a(str, this.f4022d.mo2701P(), 0, 0);
                    return;
                }
            case 4:
                this.f4021c.remove(i2);
                if (this.f4025g != null) {
                    this.f4025g.mo3634a(this.f4021c);
                    this.f4025g.notifyDataSetChanged();
                }
                if (this.f4028j != null) {
                    int size = this.f4021c.size();
                    JSONArray jSONArray = new JSONArray();
                    while (i3 < size) {
                        jSONArray.put(this.f4021c.get(i3));
                        i3++;
                    }
                    this.f4028j.putString("mailsString", jSONArray.toString());
                    this.f4028j.commit();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public void onBackPressed() {
        if (this.f4023e.isShowing()) {
            this.f4023e.dismiss();
        }
        Intent intent = new Intent();
        intent.setClass(this, OLUsersPage.class);
        startActivity(intent);
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4022d = (JPApplication) getApplication();
        this.f4024f = getIntent().getStringExtra("type");
        setContentView(R.layout.friendmailpage);
        this.f4019a = (ListView) findViewById(R.id.list_view);
        this.f4019a.setCacheColorHint(0);
        this.f4026h = (TextView) findViewById(R.id.ol_top_tittle);
        if (this.f4024f.equals("F")) {
            this.f4026h.setText("-好友列表-");
        } else if (this.f4024f.endsWith("M")) {
            this.f4026h.setText("-邮件列表-");
            this.f4027i = getSharedPreferences("mails_" + this.f4022d.mo2701P(), 0);
            this.f4028j = this.f4027i.edit();
        }
        this.f4020b = new Handler(this);
        this.f4023e = new C1253ke(this);
        new C1349x(this).execute("F", "GetSocialInfo", null);
    }

    protected void onDestroy() {
        super.onDestroy();
    }
}
