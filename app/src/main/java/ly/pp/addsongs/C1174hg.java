package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.hg */
final class C1174hg implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5547a;
    /* renamed from: b */
    private final /* synthetic */ Message f5548b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayRoom f5549c;

    C1174hg(C1164gx c1164gx, Message message, OLPlayRoom oLPlayRoom) {
        this.f5547a = c1164gx;
        this.f5548b = message;
        this.f5549c = oLPlayRoom;
    }

    /* renamed from: run */
    public final void run() {
        Bundle data = this.f5548b.getData();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("F", data.getString("F"));
            jSONObject.put("T", 2);
            this.f5549c.f4479D.remove(this.f5548b.arg1);
            this.f5549c.mo2857a((byte) 31, (byte) 0, (byte) 0, jSONObject.toString());
            this.f5549c.mo2863a(this.f5549c.f4514am, this.f5549c.f4479D, 1);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
