package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.gk */
final class C1151gk implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5501a;
    /* renamed from: b */
    private final /* synthetic */ Message f5502b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHallRoom f5503c;

    C1151gk(C1137fx c1137fx, Message message, OLPlayHallRoom oLPlayHallRoom) {
        this.f5501a = c1137fx;
        this.f5502b = message;
        this.f5503c = oLPlayHallRoom;
    }

    /* renamed from: run */
    public final void run() {
        Bundle data = this.f5502b.getData();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("F", data.getString("F"));
            jSONObject.put("T", 2);
            this.f5503c.f4458i.remove(this.f5502b.arg1);
            this.f5503c.mo2839a((byte) 31, (byte) 0, jSONObject.toString());
            this.f5503c.mo2846b(this.f5503c.f4459j, this.f5503c.f4458i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
