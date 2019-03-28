package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

/* renamed from: ly.pp.addsongs.cf */
final class C1038cf implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5260a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5261b;
    /* renamed from: c */
    private final /* synthetic */ String f5262c;

    C1038cf(C1036cd c1036cd, RelativeLayout relativeLayout, String str) {
        this.f5260a = c1036cd;
        this.f5261b = relativeLayout;
        this.f5262c = str;
    }

    public final void onClick(View view) {
        this.f5261b.setVisibility(View.GONE);
        Bundle bundle = new Bundle();
        Message obtainMessage;
        if (this.f5260a.f5255e instanceof OLPlayHall) {
            obtainMessage = ((OLPlayHall) this.f5260a.f5255e).f4403s.obtainMessage();
            obtainMessage.what = 6;
            bundle.putString("U", this.f5262c);
            obtainMessage.setData(bundle);
            ((OLPlayHall) this.f5260a.f5255e).f4403s.handleMessage(obtainMessage);
        } else if (this.f5260a.f5255e instanceof OLPlayRoom) {
            obtainMessage = ((OLPlayRoom) this.f5260a.f5255e).f4482G.obtainMessage();
            obtainMessage.what = 12;
            obtainMessage.setData(bundle);
            bundle.putString("U", this.f5262c);
            ((OLPlayRoom) this.f5260a.f5255e).f4482G.handleMessage(obtainMessage);
        }
    }
}
