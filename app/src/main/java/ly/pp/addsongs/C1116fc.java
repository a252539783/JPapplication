package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.fc */
final class C1116fc implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1115fb f5428a;
    /* renamed from: b */
    private final /* synthetic */ String f5429b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5430c;

    C1116fc(C1115fb c1115fb, String str, OLPlayHall oLPlayHall) {
        this.f5428a = c1115fb;
        this.f5429b = str;
        this.f5430c = oLPlayHall;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("T", 1);
            jSONObject.put("I", 0);
            jSONObject.put("F", this.f5429b);
            this.f5430c.mo2824a((byte) 31, (byte) 0, this.f5430c.f4398n, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
