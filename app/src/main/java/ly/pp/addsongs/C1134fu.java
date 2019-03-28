package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.fu */
final class C1134fu implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHallRoom f5462a;

    C1134fu(OLPlayHallRoom oLPlayHallRoom) {
        this.f5462a = oLPlayHallRoom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("F", "");
            jSONObject.put("T", 3);
            this.f5462a.mo2839a((byte) 31, (byte) 0, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dialogInterface.dismiss();
    }
}
