package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.gn */
final class C1154gn implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5507a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5508b;
    /* renamed from: c */
    private final /* synthetic */ String f5509c;

    C1154gn(OLPlayRoom oLPlayRoom, TextView textView, String str) {
        this.f5507a = oLPlayRoom;
        this.f5508b = textView;
        this.f5509c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5508b.getText());
        JSONObject jSONObject = new JSONObject();
        try {
            if (valueOf.equals("")) {
                Toast.makeText(this.f5507a, "请输入信件内容！", Toast.LENGTH_SHORT).show();
            } else if (valueOf.length() > 1600) {
                Toast.makeText(this.f5507a, "确定在一百字之内！", Toast.LENGTH_SHORT).show();
            } else {
                jSONObject.put("T", this.f5509c);
                jSONObject.put("M", valueOf);
                if (!this.f5509c.equals("")) {
                    this.f5507a.f4537u.mo2676a((byte) 35, (byte) 0, (byte) 0, jSONObject.toString(), null);
                }
                dialogInterface.dismiss();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
