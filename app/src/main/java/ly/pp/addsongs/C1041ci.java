package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ci */
final class C1041ci implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5269a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5270b;
    /* renamed from: c */
    private final /* synthetic */ String f5271c;

    C1041ci(C1036cd c1036cd, RelativeLayout relativeLayout, String str) {
        this.f5269a = c1036cd;
        this.f5270b = relativeLayout;
        this.f5271c = str;
    }

    public final void onClick(View view) {
        this.f5270b.setVisibility(View.GONE);
        if (this.f5269a.f5256f != null && !this.f5271c.equals("") && !this.f5271c.equals(this.f5269a.f5253c.mo2702Q())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("F", this.f5271c);
                jSONObject.put("T", 0);
                this.f5269a.f5256f.mo2676a((byte) 31, (byte) 0, (byte) 0, jSONObject.toString(), null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
