package ly.pp.addsongs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.ld */
final class C1279ld implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1278lc f5872a;
    /* renamed from: b */
    private final /* synthetic */ String f5873b;

    C1279ld(C1278lc c1278lc, String str) {
        this.f5872a = c1278lc;
        this.f5873b = str;
    }

    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("head", 1);
        intent.putExtra("userKitiName", this.f5873b);
        intent.setClass(this.f5872a.f5871c, PopUserInfo.class);
        this.f5872a.f5871c.startActivity(intent);
    }
}
