package ly.pp.addsongs;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: ly.pp.addsongs.km */
final class C1261km implements OnCheckedChangeListener {
    /* renamed from: a */
    final /* synthetic */ Register f5801a;

    C1261km(Register register) {
        this.f5801a = register;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == this.f5801a.f4938l.getId()) {
            this.f5801a.f4927a = "f";
        } else if (i == this.f5801a.f4939m.getId()) {
            this.f5801a.f4927a = "m";
        }
    }
}
