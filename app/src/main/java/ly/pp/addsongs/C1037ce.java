package ly.pp.addsongs;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.ce */
final class C1037ce implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5257a;
    /* renamed from: b */
    private final /* synthetic */ int f5258b;
    /* renamed from: c */
    private final /* synthetic */ byte f5259c;

    C1037ce(C1036cd c1036cd, int i, byte b) {
        this.f5257a = c1036cd;
        this.f5258b = i;
        this.f5259c = b;
    }

    public final void onClick(View view) {
        if (((Bundle) this.f5257a.f5252b.get(this.f5258b)).getInt("W") > 0) {
            C1036cd.m3978a(this.f5257a, this.f5259c);
        } else {
            this.f5257a.f5256f.mo2676a((byte) 29, (byte) 0, this.f5259c, "", null);
        }
    }
}
