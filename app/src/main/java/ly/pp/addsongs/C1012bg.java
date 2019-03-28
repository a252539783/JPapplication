package ly.pp.addsongs;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: ly.pp.addsongs.bg */
final class C1012bg implements OnCheckedChangeListener {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5154a;

    C1012bg(MelodySelect melodySelect) {
        this.f5154a = melodySelect;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f5154a.f4243T.setOnCheckedChangeListener(new C1013bh(this));
    }
}
