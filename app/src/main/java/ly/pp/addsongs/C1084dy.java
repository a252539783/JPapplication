package ly.pp.addsongs;

import android.widget.TabHost.OnTabChangeListener;

/* renamed from: ly.pp.addsongs.dy */
final class C1084dy implements OnTabChangeListener {
    /* renamed from: a */
    final /* synthetic */ OLPlayDressRoom f5363a;

    C1084dy(OLPlayDressRoom oLPlayDressRoom) {
        this.f5363a = oLPlayDressRoom;
    }

    public final void onTabChanged(String str) {
        int intValue = Integer.valueOf(str.substring(str.length() - 1, str.length())).intValue() - 1;
        int childCount = this.f5363a.f4363v.getTabWidget().getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (intValue == i) {
                this.f5363a.f4363v.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.selector_ol_orange);
            } else {
                this.f5363a.f4363v.getTabWidget().getChildTabViewAt(i).setBackgroundResource(R.drawable.selector_ol_blue);
            }
        }
    }
}
