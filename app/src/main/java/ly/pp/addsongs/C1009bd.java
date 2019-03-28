package ly.pp.addsongs;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: ly.pp.addsongs.bd */
final class C1009bd implements OnCheckedChangeListener {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5151a;

    C1009bd(MelodySelect melodySelect) {
        this.f5151a = melodySelect;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z && this.f5151a.f4225B.getBoolean("record_dialog", true)) {
            this.f5151a.mo2785a("提示", "该功能需要root，一部分未root过的机型开启录音后可能会引起强制关闭。录制成功后，将保存到SD卡下面的Justpiano/Record文件夹下。为减少环境杂音，可以尝试按住MIC孔。", 0);
        }
    }
}
