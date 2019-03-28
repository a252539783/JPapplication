package ly.pp.addsongs;

import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.hj */
final class C1177hj implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5554a;
    /* renamed from: b */
    private final /* synthetic */ Message f5555b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayRoom f5556c;

    C1177hj(C1164gx c1164gx, Message message, OLPlayRoom oLPlayRoom) {
        this.f5554a = c1164gx;
        this.f5555b = message;
        this.f5556c = oLPlayRoom;
    }

    /* renamed from: run */
    public final void run() {
        try {
            JSONObject jSONObject = new JSONObject(this.f5555b.getData().getString("MSG"));
            int i = jSONObject.getInt("T");
            int i2 = jSONObject.getInt("CT");
            byte b = (byte) jSONObject.getInt("CI");
            String string = jSONObject.getString("C");
            if (i != 0) {
                this.f5556c.mo2860a(i, string, i2, b);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
