package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.gr */
final class C1158gr implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5514a;
    /* renamed from: b */
    private final /* synthetic */ int f5515b;
    /* renamed from: c */
    private final /* synthetic */ byte f5516c;
    /* renamed from: d */
    private final /* synthetic */ int f5517d;
    /* renamed from: e */
    private final /* synthetic */ byte f5518e = (byte) 45;

    C1158gr(OLPlayRoom oLPlayRoom, int i, byte b, int i2) {
        this.f5514a = oLPlayRoom;
        this.f5515b = i;
        this.f5516c = b;
        this.f5517d = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.f5515b == 1 || this.f5515b == 2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("T", this.f5515b + 1);
                jSONObject.put("C", this.f5514a.f4528l.mo3385a());
                jSONObject.put("CI", this.f5516c);
                jSONObject.put("CT", this.f5517d);
                this.f5514a.mo2857a(this.f5518e, this.f5514a.f4529m, this.f5514a.f4477B, jSONObject.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dialogInterface.dismiss();
    }
}
