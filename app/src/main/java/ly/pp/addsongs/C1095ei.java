package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.ei */
final class C1095ei implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHall f5377a;
    /* renamed from: b */
    private final /* synthetic */ TextView f5378b;
    /* renamed from: c */
    private final /* synthetic */ byte f5379c;

    C1095ei(OLPlayHall oLPlayHall, TextView textView, byte b) {
        this.f5377a = oLPlayHall;
        this.f5378b = textView;
        this.f5379c = b;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(this.f5378b.getText());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("I", this.f5379c);
            jSONObject.put("P", valueOf);
            this.f5377a.mo2824a((byte) 7, (byte) 0, this.f5377a.f4398n, jSONObject.toString());
            dialogInterface.dismiss();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
