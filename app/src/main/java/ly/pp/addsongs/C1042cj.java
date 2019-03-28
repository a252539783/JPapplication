package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.cj */
final class C1042cj implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5272a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5273b;
    /* renamed from: c */
    private final /* synthetic */ byte f5274c;

    C1042cj(C1036cd c1036cd, TextView textView, byte b) {
        this.f5272a = c1036cd;
        this.f5273b = textView;
        this.f5274c = b;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5273b.getText());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("I", this.f5274c);
            jSONObject.put("P", valueOf);
            this.f5272a.f5256f.mo2676a((byte) 29, (byte) 0, this.f5274c, jSONObject.toString(), null);
            dialogInterface.dismiss();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
