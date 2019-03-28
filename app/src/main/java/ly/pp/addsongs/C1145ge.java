package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ge */
final class C1145ge implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5485a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHallRoom f5486b;
    /* renamed from: c */
    private final /* synthetic */ Message f5487c;

    C1145ge(C1137fx c1137fx, OLPlayHallRoom oLPlayHallRoom, Message message) {
        this.f5485a = c1137fx;
        this.f5486b = oLPlayHallRoom;
        this.f5487c = message;
    }

    /* renamed from: run */
    public final void run() {
        int i;
        int i2 = 0;
        this.f5486b.f4426P.dismiss();
        this.f5486b.f4473x.clear();
        Bundle data = this.f5487c.getData();
        int size = data.size();
        for (i = 0; i < size; i++) {
            this.f5486b.f4473x.add(data.getBundle(String.valueOf(i)));
        }
        try {
            JSONArray jSONArray = new JSONArray(this.f5486b.f4432V.getString("mailsString", "[]"));
            i = jSONArray.length();
            while (i2 < i) {
                Bundle bundle = new Bundle();
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject.has("type")) {
                    bundle.putInt("type", jSONObject.getInt("type"));
                }
                bundle.putString("F", jSONObject.getString("F"));
                bundle.putString("M", jSONObject.getString("M"));
                bundle.putString("T", jSONObject.getString("T"));
                this.f5486b.f4473x.add(bundle);
                i2++;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (this.f5486b.f4473x.size() > 0) {
            this.f5486b.mo2848c();
            this.f5486b.mo2849c(this.f5486b.f4474y, this.f5486b.f4473x);
        }
    }
}
