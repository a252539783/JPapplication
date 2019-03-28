package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.hu */
final class C1188hu implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1187ht f5583a;
    /* renamed from: b */
    private final /* synthetic */ String f5584b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayRoom f5585c;

    C1188hu(C1187ht c1187ht, String str, OLPlayRoom oLPlayRoom) {
        this.f5583a = c1187ht;
        this.f5584b = str;
        this.f5585c = oLPlayRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("T", 1);
            jSONObject.put("I", 0);
            jSONObject.put("F", this.f5584b);
            this.f5585c.mo2857a((byte) 31, this.f5585c.f4529m, this.f5585c.f4477B, jSONObject.toString());
            dialogInterface.dismiss();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
