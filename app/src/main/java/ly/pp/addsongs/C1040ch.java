package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ch */
final class C1040ch implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5266a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5267b;
    /* renamed from: c */
    private final /* synthetic */ String f5268c;

    C1040ch(C1036cd c1036cd, RelativeLayout relativeLayout, String str) {
        this.f5266a = c1036cd;
        this.f5267b = relativeLayout;
        this.f5268c = str;
    }

    public final void onClick(View view) {
        this.f5267b.setVisibility(View.GONE);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("F", this.f5268c);
            jSONObject.put("T", 1);
            this.f5266a.f5256f.mo2676a((byte) 37, (byte) 0, (byte) 0, jSONObject.toString(), null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
