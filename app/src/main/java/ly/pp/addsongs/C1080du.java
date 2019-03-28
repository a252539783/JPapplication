package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.du */
final class C1080du implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1077dr f5350a;
    /* renamed from: b */
    private final /* synthetic */ String f5351b;
    /* renamed from: c */
    private final /* synthetic */ Long f5352c;
    /* renamed from: d */
    private final /* synthetic */ int f5353d;
    /* renamed from: e */
    private final /* synthetic */ Double f5354e;

    C1080du(C1077dr c1077dr, String str, Long l, int i, Double d) {
        this.f5350a = c1077dr;
        this.f5351b = str;
        this.f5352c = l;
        this.f5353d = i;
        this.f5354e = d;
    }

    public final void onClick(View view) {
        this.f5350a.f5343c.f4318f = this.f5351b;
        OLMelodySelect.f4295g = this.f5352c;
        this.f5350a.f5343c.f4301F = this.f5353d;
        this.f5350a.f5343c.f4300E = this.f5354e;
        new C1074do(this.f5350a.f5343c).execute(null, null, null);
    }
}
