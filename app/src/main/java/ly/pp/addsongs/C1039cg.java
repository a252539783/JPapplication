package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.cg */
final class C1039cg implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5263a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5264b;
    /* renamed from: c */
    private final /* synthetic */ String f5265c;

    C1039cg(C1036cd c1036cd, RelativeLayout relativeLayout, String str) {
        this.f5263a = c1036cd;
        this.f5264b = relativeLayout;
        this.f5265c = str;
    }

    public final void onClick(View view) {
        this.f5264b.setVisibility(View.GONE);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("F", this.f5265c);
            jSONObject.put("T", 0);
            this.f5263a.f5256f.mo2676a((byte) 37, (byte) 0, (byte) 0, jSONObject.toString(), null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
