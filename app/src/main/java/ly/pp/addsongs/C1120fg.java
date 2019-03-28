package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.fg */
final class C1120fg implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1119ff f5438a;
    /* renamed from: b */
    private final /* synthetic */ int f5439b;
    /* renamed from: c */
    private final /* synthetic */ Bundle f5440c;
    /* renamed from: d */
    private final /* synthetic */ OLPlayHall f5441d;
    /* renamed from: e */
    private final /* synthetic */ byte f5442e;

    C1120fg(C1119ff c1119ff, int i, Bundle bundle, OLPlayHall oLPlayHall, byte b) {
        this.f5438a = c1119ff;
        this.f5439b = i;
        this.f5440c = bundle;
        this.f5441d = oLPlayHall;
        this.f5442e = b;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f5439b == 0) {
            Integer.valueOf(this.f5440c.getInt("P"));
            this.f5441d.mo2826a(this.f5440c.getInt("P"), this.f5442e);
        } else if (this.f5439b == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("I", this.f5442e);
                jSONObject.put("P", this.f5440c.getString("P"));
                this.f5441d.mo2824a((byte) 7, this.f5442e, this.f5441d.f4398n, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
