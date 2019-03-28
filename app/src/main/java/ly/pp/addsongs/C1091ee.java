package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ee */
final class C1091ee implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHall f5370a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5371b;
    /* renamed from: c */
    private final /* synthetic */ String f5372c;

    C1091ee(OLPlayHall oLPlayHall, TextView textView, String str) {
        this.f5370a = oLPlayHall;
        this.f5371b = textView;
        this.f5372c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5371b.getText());
        JSONObject jSONObject = new JSONObject();
        try {
            if (valueOf.equals("")) {
                Toast.makeText(this.f5370a, "请输入信件内容！", Toast.LENGTH_SHORT).show();
            } else if (valueOf.length() > 1600) {
                Toast.makeText(this.f5370a, "确定在一百字之内！", Toast.LENGTH_SHORT).show();
            } else {
                jSONObject.put("T", this.f5372c);
                jSONObject.put("M", valueOf);
                if (!this.f5372c.equals("")) {
                    this.f5370a.f4376I.mo2676a((byte) 35, (byte) 0, (byte) 0, jSONObject.toString(), null);
                }
                dialogInterface.dismiss();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
