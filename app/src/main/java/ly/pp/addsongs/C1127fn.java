package ly.pp.addsongs;

import android.widget.TabHost.OnTabChangeListener;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.fn */
final class C1127fn implements OnTabChangeListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayHallRoom f5451a;

    C1127fn(OLPlayHallRoom oLPlayHallRoom) {
        this.f5451a = oLPlayHallRoom;
    }

    public final void onTabChanged(String str) {
        int intValue = Integer.valueOf(str.substring(str.length() - 1, str.length())).intValue() - 1;
        int childCount = this.f5451a.f4411A.getTabWidget().getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (intValue == i) {
                this.f5451a.f4411A.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.selector_ol_orange);
            } else {
                this.f5451a.f4411A.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.selector_ol_blue);
            }
        }
        JSONObject jSONObject;
        if (str.equals("tab1")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("T", "L");
                jSONObject2.put("B", this.f5451a.f4469t);
                this.f5451a.mo2839a((byte) 34, (byte) 0, jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (str.equals("tab4")) {
            this.f5451a.f4413C.setText("");
            jSONObject = new JSONObject();
            try {
                jSONObject.put("T", "M");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.f5451a.mo2839a((byte) 34, (byte) 0, jSONObject.toString());
        } else if (str.equals("tab3")) {
            this.f5451a.f4413C.setText("");
            jSONObject = new JSONObject();
            try {
                jSONObject.put("T", "C");
            } catch (JSONException e22) {
                e22.printStackTrace();
            }
            this.f5451a.mo2839a((byte) 34, (byte) 0, jSONObject.toString());
        }
    }
}
