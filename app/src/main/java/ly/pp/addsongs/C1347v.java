package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.v */
final class C1347v implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ FriendMailPage f6045a;
    /* renamed from: b */
    private final /* synthetic */ TextView f6046b;
    /* renamed from: c */
    private final /* synthetic */ int f6047c;
    /* renamed from: d */
    private final /* synthetic */ String f6048d;
    /* renamed from: e */
    private final /* synthetic */ int f6049e;
    /* renamed from: f */
    private final /* synthetic */ String f6050f;

    C1347v(FriendMailPage friendMailPage, TextView textView, int i, String str, int i2, String str2) {
        this.f6045a = friendMailPage;
        this.f6046b = textView;
        this.f6047c = i;
        this.f6048d = str;
        this.f6049e = i2;
        this.f6050f = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f6046b.getText());
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f6047c == 0) {
                if (valueOf.equals("")) {
                    Toast.makeText(this.f6045a, "请输入消息内容！", Toast.LENGTH_SHORT).show();
                    return;
                } else if (valueOf.length() > 1600) {
                    Toast.makeText(this.f6045a, "确定在一百字之内！", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    String format = SimpleDateFormat.getDateInstance(2, Locale.CHINESE).format(new Date());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("F", this.f6048d);
                    jSONObject2.put("M", valueOf);
                    jSONObject2.put("T", format);
                    jSONObject2.put("type", 1);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject2);
                    FriendMailPage friendMailPage = this.f6045a;
                    ListView b = this.f6045a.f4019a;
                    format = jSONArray.toString();
                    //this.f6045a.f4024f;
                    int i2 = this.f6049e;
                    FriendMailPage.m3506a(friendMailPage, b, format);
                }
            } else if (this.f6047c != 1 && this.f6047c == 2) {
                this.f6045a.f4021c.remove(this.f6049e);
                if (this.f6045a.f4025g != null) {
                    this.f6045a.f4025g.mo3634a(this.f6045a.f4021c);
                    this.f6045a.f4025g.notifyDataSetChanged();
                }
            }
            jSONObject.put("H", this.f6047c);
            jSONObject.put("T", this.f6048d);
            jSONObject.put("F", this.f6050f);
            jSONObject.put("M", valueOf);
            if (!(this.f6048d.equals("") || this.f6050f.equals(""))) {
                valueOf = jSONObject.toString();
                new C0985ag(this.f6045a, (byte) 0).execute(valueOf, "GetUserInfo", null);
            }
            dialogInterface.dismiss();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
