package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.fj */
final class C1123fj implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5445a;
    /* renamed from: b */
    private final /* synthetic */ Message f5446b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5447c;

    C1123fj(C1101eo c1101eo, Message message, OLPlayHall oLPlayHall) {
        this.f5445a = c1101eo;
        this.f5446b = message;
        this.f5447c = oLPlayHall;
    }

    /* renamed from: run */
    public final void run() {
        Bundle data = this.f5446b.getData();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("F", data.getString("F"));
            jSONObject.put("T", 2);
            this.f5447c.f4399o.remove(this.f5446b.arg1);
            this.f5447c.mo2824a((byte) 31, (byte) 0, (byte) 0, jSONObject.toString());
            this.f5447c.mo2829a(this.f5447c.f4382O, this.f5447c.f4399o, 1, true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
