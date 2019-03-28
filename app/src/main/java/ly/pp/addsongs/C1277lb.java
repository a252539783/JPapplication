package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.lb */
final class C1277lb implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1273ky f5864a;
    /* renamed from: b */
    private final /* synthetic */ String f5865b;
    /* renamed from: c */
    private final /* synthetic */ Long f5866c;
    /* renamed from: d */
    private final /* synthetic */ int f5867d;
    /* renamed from: e */
    private final /* synthetic */ Double f5868e;

    C1277lb(C1273ky c1273ky, String str, Long l, int i, Double d) {
        this.f5864a = c1273ky;
        this.f5865b = str;
        this.f5866c = l;
        this.f5867d = i;
        this.f5868e = d;
    }

    public final void onClick(View view) {
        this.f5864a.f5857c.f4949d = this.f5865b;
        this.f5864a.f5857c.f4950e = this.f5866c;
        this.f5864a.f5857c.f4954i = this.f5867d;
        this.f5864a.f5857c.f4953h = this.f5868e;
        new C1271kw(this.f5864a.f5857c).execute(null, null, null);
    }
}
