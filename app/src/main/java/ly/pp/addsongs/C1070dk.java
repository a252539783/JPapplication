package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.dk */
final class C1070dk implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ OLMelodySelect f5331a;

    C1070dk(OLMelodySelect oLMelodySelect) {
        this.f5331a = oLMelodySelect;
    }

    public final void onClick(View view) {
        if (this.f5331a.f4330s) {
            this.f5331a.f4328q.setVisibility(View.GONE);
            this.f5331a.f4330s = false;
            this.f5331a.f4336y.setText(" 显示标题 ");
            return;
        }
        this.f5331a.f4328q.setVisibility(View.VISIBLE);
        this.f5331a.f4330s = true;
        this.f5331a.f4336y.setText(" 隐藏标题 ");
    }
}
