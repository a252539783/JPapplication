package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.bj */
final class C1015bj implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5157a;

    C1015bj(MelodySelect melodySelect) {
        this.f5157a = melodySelect;
    }

    public final void onClick(View view) {
        if (this.f5157a.f4255k) {
            this.f5157a.f4266v.setVisibility(View.GONE);
            this.f5157a.f4255k = false;
            this.f5157a.f4249e.setText("显示标题");
            return;
        }
        this.f5157a.f4266v.setVisibility(View.VISIBLE);
        this.f5157a.f4255k = true;
        this.f5157a.f4249e.setText("隐藏标题");
    }
}
