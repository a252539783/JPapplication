package ly.pp.addsongs;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: ly.pp.addsongs.ip */
final class C1210ip implements OnCheckedChangeListener {
    /* renamed from: a */
    final /* synthetic */ OLTopUser f5674a;

    C1210ip(OLTopUser oLTopUser) {
        this.f5674a = oLTopUser;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == this.f5674a.f4563n.getId()) {
            this.f5674a.f4567r = "P";
        } else if (i == this.f5674a.f4564o.getId()) {
            this.f5674a.f4567r = "C";
        }
    }
}
