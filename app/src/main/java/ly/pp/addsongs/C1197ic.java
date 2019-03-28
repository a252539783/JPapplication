package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ic */
final class C1197ic implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1196ib f5623a;
    /* renamed from: b */
    private final /* synthetic */ PopupWindow f5624b;
    /* renamed from: c */
    private final /* synthetic */ C1245jx f5625c;
    /* renamed from: d */
    private final /* synthetic */ OLPlayRoom f5626d;

    C1197ic(C1196ib c1196ib, PopupWindow popupWindow, C1245jx c1245jx, OLPlayRoom oLPlayRoom) {
        this.f5623a = c1196ib;
        this.f5624b = popupWindow;
        this.f5625c = c1245jx;
        this.f5626d = oLPlayRoom;
    }

    public final void onClick(View view) {
        if (this.f5624b != null && this.f5624b.isShowing()) {
            this.f5624b.dismiss();
            if (this.f5623a.f5614f != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("C", this.f5625c.mo3394e());
                    jSONObject.put("T", 4);
                    this.f5623a.f5614f.mo2676a((byte) 45, this.f5623a.f5611c, this.f5626d.f4477B, jSONObject.toString(), null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
