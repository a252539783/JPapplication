package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.gp */
final class C1156gp implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5511a;
    /* renamed from: b */
    private final /* synthetic */ JSONObject f5512b;

    C1156gp(OLPlayRoom oLPlayRoom, JSONObject jSONObject) {
        this.f5511a = oLPlayRoom;
        this.f5512b = jSONObject;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("T", 5);
            jSONObject.put("C", this.f5512b.getInt("I"));
            jSONObject.put("CI", -1);
            jSONObject.put("CT", -1);
            this.f5511a.mo2857a((byte) 45, this.f5511a.f4529m, this.f5511a.f4477B, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dialogInterface.dismiss();
    }
}
