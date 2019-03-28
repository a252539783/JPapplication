package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.iw */
final class C1217iw implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ PianoPlay f5685a;

    C1217iw(PianoPlay pianoPlay) {
        this.f5685a = pianoPlay;
    }

    public final void onClick(View view) {
        JSONObject jSONObject = new JSONObject();
        if (this.f5685a.f4583B.getVisibility() == 0) {
            try {
                jSONObject.put("S", 0);
                this.f5685a.mo2904a((byte) 32, (byte) 0, jSONObject.toString(), null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f5685a.f4584C.setText("显示成绩");
            this.f5685a.f4583B.setVisibility(View.GONE);
        } else if (this.f5685a.f4583B.getVisibility() == 8) {
            try {
                jSONObject.put("S", 1);
                this.f5685a.mo2904a((byte) 32, (byte) 0, jSONObject.toString(), null);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.f5685a.f4584C.setText("点击隐藏");
            this.f5685a.f4583B.setVisibility(View.VISIBLE);
        }
    }
}
