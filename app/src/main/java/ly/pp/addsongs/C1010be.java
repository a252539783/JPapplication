package ly.pp.addsongs;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: ly.pp.addsongs.be */
final class C1010be implements OnCheckedChangeListener {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5152a;

    C1010be(MelodySelect melodySelect) {
        this.f5152a = melodySelect;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f5152a.f4242S.setOnCheckedChangeListener(new C1011bf(this));
    }
}
