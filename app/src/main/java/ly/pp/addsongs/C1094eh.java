package ly.pp.addsongs;

import android.widget.TabHost.OnTabChangeListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.eh */
final class C1094eh implements OnTabChangeListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHall f5376a;

    C1094eh(OLPlayHall oLPlayHall) {
        this.f5376a = oLPlayHall;
    }

    public final void onTabChanged(String str) {
        int intValue = Integer.valueOf(str.substring(str.length() - 1, str.length())).intValue() - 1;
        int childCount = this.f5376a.f4378K.getTabWidget().getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (intValue == i) {
                this.f5376a.f4378K.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.selector_ol_orange);
            } else {
                this.f5376a.f4378K.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.selector_ol_blue);
            }
        }
        JSONObject jSONObject;
        if (str.equals("tab1")) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("T", "L");
                jSONObject.put("B", this.f5376a.f4401q);
                this.f5376a.mo2824a((byte) 34, (byte) 0, this.f5376a.f4398n, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (str.equals("tab3")) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("T", "L");
                jSONObject.put("B", this.f5376a.f4387T);
                this.f5376a.mo2824a((byte) 36, (byte) 0, this.f5376a.f4398n, jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
