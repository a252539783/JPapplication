package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.mt */
final class C1322mt implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1320mr f5975a;
    /* renamed from: b */
    private final /* synthetic */ String f5976b;
    /* renamed from: c */
    private final /* synthetic */ String f5977c;
    /* renamed from: d */
    private final /* synthetic */ int f5978d;
    /* renamed from: e */
    private final /* synthetic */ String f5979e;

    C1322mt(C1320mr c1320mr, String str, String str2, int i, String str3) {
        this.f5975a = c1320mr;
        this.f5976b = str;
        this.f5977c = str2;
        this.f5978d = i;
        this.f5979e = str3;
    }

    public final void onClick(View view) {
        if (this.f5975a.f5973c.f5045p.contains(this.f5976b)) {
            this.f5975a.f5973c.mo3005a(1, this.f5976b, "", 0, "");
        } else {
            this.f5975a.f5973c.mo3005a(0, this.f5976b, this.f5977c, this.f5978d, this.f5979e);
        }
    }
}
