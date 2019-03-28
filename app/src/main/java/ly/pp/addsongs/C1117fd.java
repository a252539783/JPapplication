package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.fd */
final class C1117fd implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1115fb f5431a;
    /* renamed from: b */
    private final /* synthetic */ String f5432b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5433c;

    C1117fd(C1115fb c1115fb, String str, OLPlayHall oLPlayHall) {
        this.f5431a = c1115fb;
        this.f5432b = str;
        this.f5433c = oLPlayHall;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("T", 1);
            jSONObject.put("I", 1);
            jSONObject.put("F", this.f5432b);
            this.f5433c.mo2824a((byte) 31, (byte) 0, this.f5433c.f4398n, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
