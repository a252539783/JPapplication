package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ie */
final class C1199ie implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1196ib f5631a;
    /* renamed from: b */
    private final /* synthetic */ PopupWindow f5632b;
    /* renamed from: c */
    private final /* synthetic */ C1245jx f5633c;
    /* renamed from: d */
    private final /* synthetic */ OLPlayRoom f5634d;

    C1199ie(C1196ib c1196ib, PopupWindow popupWindow, C1245jx c1245jx, OLPlayRoom oLPlayRoom) {
        this.f5631a = c1196ib;
        this.f5632b = popupWindow;
        this.f5633c = c1245jx;
        this.f5634d = oLPlayRoom;
    }

    public final void onClick(View view) {
        if (this.f5632b != null && this.f5632b.isShowing()) {
            this.f5632b.dismiss();
            if (this.f5631a.f5614f == null) {
                return;
            }
            if (this.f5633c == null || !(this.f5633c.mo3391c().equals("N") || this.f5633c.mo3391c().equals("R"))) {
                Toast.makeText(this.f5634d, "玩家当前状态不能加好友！", Toast.LENGTH_SHORT).show();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("F", this.f5633c.mo3385a());
                jSONObject.put("T", 0);
                this.f5631a.f5614f.mo2676a((byte) 31, this.f5631a.f5611c, this.f5634d.f4477B, jSONObject.toString(), null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
