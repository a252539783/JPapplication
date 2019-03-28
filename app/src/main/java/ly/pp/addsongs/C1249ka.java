package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ka */
final class C1249ka implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ PopUserInfo f5773a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5774b;
    /* renamed from: c */
    private final /* synthetic */ String f5775c;
    /* renamed from: d */
    private final /* synthetic */ String f5776d;

    C1249ka(PopUserInfo popUserInfo, TextView textView, String str, String str2) {
        this.f5773a = popUserInfo;
        this.f5774b = textView;
        this.f5775c = str;
        this.f5776d = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5774b.getText());
        JSONObject jSONObject = new JSONObject();
        try {
            if (valueOf.equals("")) {
                Toast.makeText(this.f5773a, "请输入消息内容！", Toast.LENGTH_SHORT).show();
            } else if (valueOf.length() > 1600) {
                Toast.makeText(this.f5773a, "确定在一百字之内！", Toast.LENGTH_SHORT).show();
            } else {
                jSONObject.put("H", 0);
                jSONObject.put("T", this.f5775c);
                jSONObject.put("F", this.f5776d);
                jSONObject.put("M", valueOf);
                if (!(this.f5775c.equals("") || this.f5776d.equals(""))) {
                    this.f5773a.f4830d = jSONObject.toString();
                    new C1251kc(this.f5773a, (byte) 0).execute(null, null, null);
                }
            }
            dialogInterface.dismiss();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
