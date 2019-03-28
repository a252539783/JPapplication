package ly.pp.addsongs;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: ly.pp.addsongs.bh */
final class C1013bh implements OnCheckedChangeListener {
    /* renamed from: a */
    final /* synthetic */ C1012bg f5155a;

    C1013bh(C1012bg c1012bg) {
        this.f5155a = c1012bg;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z && this.f5155a.f5154a.f4225B.getBoolean("hand_dialog", true)) {
            this.f5155a.f5154a.mo2785a("提示", "选择后您将弹奏曲谱的和弦，软件将自动播放主旋律。", 2);
        }
    }
}
