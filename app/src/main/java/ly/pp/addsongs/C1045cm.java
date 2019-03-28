package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.cm */
final class C1045cm implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5278a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5279b;
    /* renamed from: c */
    private final /* synthetic */ String f5280c;

    C1045cm(C1036cd c1036cd, RelativeLayout relativeLayout, String str) {
        this.f5278a = c1036cd;
        this.f5279b = relativeLayout;
        this.f5280c = str;
    }

    public final void onClick(View view) {
        this.f5279b.setVisibility(View.GONE);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("F", this.f5280c);
            jSONObject.put("T", 0);
            this.f5278a.f5256f.mo2676a((byte) 37, (byte) 0, (byte) 0, jSONObject.toString(), null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
