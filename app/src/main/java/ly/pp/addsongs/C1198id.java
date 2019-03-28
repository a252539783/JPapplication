package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.id */
final class C1198id implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1196ib f5627a;
    /* renamed from: b */
    private final /* synthetic */ PopupWindow f5628b;
    /* renamed from: c */
    private final /* synthetic */ C1245jx f5629c;
    /* renamed from: d */
    private final /* synthetic */ OLPlayRoom f5630d;

    C1198id(C1196ib c1196ib, PopupWindow popupWindow, C1245jx c1245jx, OLPlayRoom oLPlayRoom) {
        this.f5627a = c1196ib;
        this.f5628b = popupWindow;
        this.f5629c = c1245jx;
        this.f5630d = oLPlayRoom;
    }

    public final void onClick(View view) {
        if (this.f5628b != null && this.f5628b.isShowing()) {
            this.f5628b.dismiss();
            if (this.f5627a.f5614f != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("C", this.f5629c.mo3394e());
                    jSONObject.put("T", 4);
                    this.f5627a.f5614f.mo2676a((byte) 45, this.f5627a.f5611c, this.f5630d.f4477B, jSONObject.toString(), null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
