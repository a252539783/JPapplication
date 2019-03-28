package ly.pp.addsongs;

import android.widget.TabHost.OnTabChangeListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.gu */
final class C1161gu implements OnTabChangeListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayRoom f5522a;

    C1161gu(OLPlayRoom oLPlayRoom) {
        this.f5522a = oLPlayRoom;
    }

    public final void onTabChanged(String str) {
        int intValue = Integer.valueOf(str.substring(str.length() - 1, str.length())).intValue() - 1;
        int childCount = this.f5522a.f4502aa.getTabWidget().getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (intValue == i) {
                this.f5522a.f4502aa.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.selector_ol_orange);
            } else {
                this.f5522a.f4502aa.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.selector_ol_blue);
            }
        }
        JSONObject jSONObject;
        if (str.equals("tab1")) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("T", "L");
                jSONObject.put("B", this.f5522a.f4522au);
                this.f5522a.mo2857a((byte) 34, this.f5522a.f4529m, this.f5522a.f4477B, jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (!str.equals("tab2") && !str.equals("tab3") && str.equals("tab4")) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("T", "L");
                jSONObject.put("B", 0);
                this.f5522a.mo2857a((byte) 36, (byte) 0, this.f5522a.f4477B, jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
