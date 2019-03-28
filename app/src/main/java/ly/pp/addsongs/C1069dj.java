package ly.pp.addsongs;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;

/* renamed from: ly.pp.addsongs.dj */
final class C1069dj implements OnItemClickListener {
    /* renamed from: a */
    final /* synthetic */ OLMelodySelect f5329a;
    /* renamed from: b */
    private final /* synthetic */ LinearLayout f5330b;

    C1069dj(OLMelodySelect oLMelodySelect, LinearLayout linearLayout) {
        this.f5329a = oLMelodySelect;
        this.f5330b = linearLayout;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f5330b.setVisibility(View.GONE);
        this.f5329a.f4314a = i;
        this.f5329a.f4315b = C1194i.f5598b[i];
        this.f5329a.f4317e = C1194i.f5598b[i];
        this.f5329a.f4303H = 0;
        this.f5329a.f4302G.setText(" 第1页 ");
        new C1072dm(this.f5329a).execute(null, null, null);
    }
}
