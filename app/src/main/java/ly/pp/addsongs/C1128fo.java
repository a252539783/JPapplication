package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.fo */
final class C1128fo implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHallRoom f5452a;
    /* renamed from: b */
    private final /* synthetic */ String f5453b;

    C1128fo(OLPlayHallRoom oLPlayHallRoom, String str) {
        this.f5452a = oLPlayHallRoom;
        this.f5453b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("H", 1);
            jSONObject.put("T", this.f5453b);
            jSONObject.put("F", this.f5452a.f4470u.mo2701P());
            new C1135fv(this.f5452a, (byte) 0).execute(jSONObject.toString(), "", null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
