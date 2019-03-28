package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.hv */
final class C1189hv implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1187ht f5586a;
    /* renamed from: b */
    private final /* synthetic */ String f5587b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayRoom f5588c;

    C1189hv(C1187ht c1187ht, String str, OLPlayRoom oLPlayRoom) {
        this.f5586a = c1187ht;
        this.f5587b = str;
        this.f5588c = oLPlayRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("T", 1);
            jSONObject.put("I", 1);
            jSONObject.put("F", this.f5587b);
            this.f5588c.mo2857a((byte) 31, this.f5588c.f4529m, this.f5588c.f4477B, jSONObject.toString());
            dialogInterface.dismiss();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
