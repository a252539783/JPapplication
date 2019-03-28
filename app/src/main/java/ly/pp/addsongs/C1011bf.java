package ly.pp.addsongs;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: ly.pp.addsongs.bf */
final class C1011bf implements OnCheckedChangeListener {
    /* renamed from: a */
    final /* synthetic */ C1010be f5153a;

    C1011bf(C1010be c1010be) {
        this.f5153a = c1010be;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z && this.f5153a.f5152a.f4225B.getBoolean("play_dialog", true)) {
            this.f5153a.f5152a.mo2785a("提示", "选择后软件将从当前播放的曲目开始依次播放试听。", 1);
        }
    }
}
