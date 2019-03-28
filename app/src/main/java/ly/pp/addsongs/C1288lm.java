package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.lm */
final class C1288lm implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1285lj f5891a;
    /* renamed from: b */
    private final /* synthetic */ String f5892b;
    /* renamed from: c */
    private final /* synthetic */ Long f5893c;
    /* renamed from: d */
    private final /* synthetic */ int f5894d;
    /* renamed from: e */
    private final /* synthetic */ Double f5895e;

    C1288lm(C1285lj c1285lj, String str, Long l, int i, Double d) {
        this.f5891a = c1285lj;
        this.f5892b = str;
        this.f5893c = l;
        this.f5894d = i;
        this.f5895e = d;
    }

    public final void onClick(View view) {
        this.f5891a.f5883c.f4968d = this.f5892b;
        this.f5891a.f5883c.f4969e = this.f5893c;
        this.f5891a.f5883c.f4973i = this.f5894d;
        this.f5891a.f5883c.f4972h = this.f5895e;
        new C1283lh(this.f5891a.f5883c).execute(null, null, null);
    }
}
