package ly.pp.addsongs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.dt */
final class C1079dt implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1077dr f5348a;
    /* renamed from: b */
    private final /* synthetic */ String f5349b;

    C1079dt(C1077dr c1077dr, String str) {
        this.f5348a = c1077dr;
        this.f5349b = str;
    }

    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("head", 1);
        intent.putExtra("userKitiName", this.f5349b);
        intent.setClass(this.f5348a.f5343c, PopUserInfo.class);
        this.f5348a.f5343c.startActivity(intent);
    }
}
