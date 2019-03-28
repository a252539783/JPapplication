package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.jy */
final class C1246jy implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ PopUserInfo f5770a;

    C1246jy(PopUserInfo popUserInfo) {
        this.f5770a = popUserInfo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("H", 0);
            jSONObject.put("T", this.f5770a.f4829c);
            jSONObject.put("F", this.f5770a.f4836j.mo2701P());
            jSONObject.put("M", "");
            if (!(this.f5770a.f4829c.equals("") || this.f5770a.f4836j.mo2701P().equals(""))) {
                this.f5770a.f4830d = jSONObject.toString();
                new C1251kc(this.f5770a, (byte) 0).execute(null, null, null);
            }
            dialogInterface.dismiss();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
