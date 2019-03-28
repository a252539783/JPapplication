package ly.pp.addsongs;

import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

/* renamed from: ly.pp.addsongs.cp */
final class C1048cp implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5288a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5289b;
    /* renamed from: c */
    private final /* synthetic */ int f5290c;
    /* renamed from: d */
    private final /* synthetic */ String f5291d;

    C1048cp(C1036cd c1036cd, RelativeLayout relativeLayout, int i, String str) {
        this.f5288a = c1036cd;
        this.f5289b = relativeLayout;
        this.f5290c = i;
        this.f5291d = str;
    }

    public final void onClick(View view) {
        this.f5289b.setVisibility(View.GONE);
        Message obtainMessage;
        if (this.f5288a.f5255e instanceof OLPlayHallRoom) {
            obtainMessage = ((OLPlayHallRoom) this.f5288a.f5255e).f4468s.obtainMessage();
            obtainMessage.what = 7;
            obtainMessage.arg1 = this.f5290c;
            obtainMessage.getData().putString("F", this.f5291d);
            ((OLPlayHallRoom) this.f5288a.f5255e).f4468s.handleMessage(obtainMessage);
        } else if (this.f5288a.f5255e instanceof OLPlayHall) {
            obtainMessage = ((OLPlayHall) this.f5288a.f5255e).f4403s.obtainMessage();
            obtainMessage.what = 10;
            obtainMessage.arg1 = this.f5290c;
            obtainMessage.getData().putString("F", this.f5291d);
            ((OLPlayHall) this.f5288a.f5255e).f4403s.handleMessage(obtainMessage);
        } else if (this.f5288a.f5255e instanceof OLPlayRoom) {
            obtainMessage = ((OLPlayRoom) this.f5288a.f5255e).f4482G.obtainMessage();
            obtainMessage.what = 16;
            obtainMessage.arg1 = this.f5290c;
            obtainMessage.getData().putString("F", this.f5291d);
            ((OLPlayRoom) this.f5288a.f5255e).f4482G.handleMessage(obtainMessage);
        }
    }
}
