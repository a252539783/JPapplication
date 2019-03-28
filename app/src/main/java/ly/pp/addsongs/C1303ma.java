package ly.pp.addsongs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.ma */
final class C1303ma implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1300ly f5930a;
    /* renamed from: b */
    private final /* synthetic */ String f5931b;
    /* renamed from: c */
    private final /* synthetic */ String f5932c;
    /* renamed from: d */
    private final /* synthetic */ int f5933d;
    /* renamed from: e */
    private final /* synthetic */ String f5934e;

    C1303ma(C1300ly c1300ly, String str, String str2, int i, String str3) {
        this.f5930a = c1300ly;
        this.f5931b = str;
        this.f5932c = str2;
        this.f5933d = i;
        this.f5934e = str3;
    }

    public final void onClick(View view) {
        if (this.f5930a.f5919c.f5020p.contains(this.f5931b)) {
            this.f5930a.f5919c.mo2992a(1, this.f5931b, "", 0, "");
        } else {
            this.f5930a.f5919c.mo2992a(0, this.f5931b, this.f5932c, this.f5933d, this.f5934e);
        }
    }
}
