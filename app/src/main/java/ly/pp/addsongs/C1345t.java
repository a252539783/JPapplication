package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.t */
final class C1345t implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1344s f6039a;
    /* renamed from: b */
    private final /* synthetic */ int f6040b;

    C1345t(C1344s c1344s, int i) {
        this.f6039a = c1344s;
        this.f6040b = i;
    }

    public final void onClick(View view) {
        if (this.f6039a.f6034c != null && this.f6039a.f6034c.isShowing()) {
            this.f6039a.f6034c.dismiss();
            if (this.f6039a.f6035d != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("@", "");
                    jSONObject.put("M", "//" + this.f6040b);
                    this.f6039a.f6035d.mo2676a(this.f6039a.f6038g, this.f6039a.f6036e, this.f6039a.f6037f, jSONObject.toString(), null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
