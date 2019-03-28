package ly.pp.addsongs;

import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.gy */
final class C1165gy implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5526a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5527b;
    /* renamed from: c */
    private final /* synthetic */ Message f5528c;

    C1165gy(C1164gx c1164gx, OLPlayRoom oLPlayRoom, Message message) {
        this.f5526a = c1164gx;
        this.f5527b = oLPlayRoom;
        this.f5528c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5527b.mo2861a(this.f5527b.f4494S, this.f5528c.getData());
        String str = "songs/" + this.f5528c.getData().getString("SI") + ".pm";
        if (!str.equals("songs/.pm")) {
            String[] a = this.f5527b.mo2864a(str);
            Object obj = a[0];
            str = a[1];
            if (obj != null) {
                this.f5527b.f4486K.setText(new StringBuilder(String.valueOf(obj)).append("[难度:").append(str).append("]").toString());
            }
        }
        str = this.f5528c.getData().getString("MSG");
        if (!str.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = jSONObject.getInt("T");
                int i2 = jSONObject.getInt("CT");
                byte b = (byte) jSONObject.getInt("CI");
                String string = jSONObject.getString("C");
                if (!string.equals("")) {
                    this.f5527b.mo2860a(i, string, i2, b);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
