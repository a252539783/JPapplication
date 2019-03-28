package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.cn */
final class C1046cn implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1036cd f5281a;
    /* renamed from: b */
    private final /* synthetic */ RelativeLayout f5282b;
    /* renamed from: c */
    private final /* synthetic */ int f5283c;
    /* renamed from: d */
    private final /* synthetic */ String f5284d;

    C1046cn(C1036cd c1036cd, RelativeLayout relativeLayout, int i, String str) {
        this.f5281a = c1036cd;
        this.f5282b = relativeLayout;
        this.f5283c = i;
        this.f5284d = str;
    }

    public final void onClick(View view) {
        this.f5282b.setVisibility(View.GONE);
        if (this.f5283c == 1) {
            Bundle bundle = new Bundle();
            Message obtainMessage;
            if (this.f5281a.f5255e instanceof OLPlayHall) {
                obtainMessage = ((OLPlayHall) this.f5281a.f5255e).f4403s.obtainMessage();
                obtainMessage.what = 6;
                bundle.putString("U", this.f5284d);
                obtainMessage.setData(bundle);
                ((OLPlayHall) this.f5281a.f5255e).f4403s.handleMessage(obtainMessage);
                return;
            } else if (this.f5281a.f5255e instanceof OLPlayRoom) {
                obtainMessage = ((OLPlayRoom) this.f5281a.f5255e).f4482G.obtainMessage();
                obtainMessage.what = 12;
                obtainMessage.setData(bundle);
                bundle.putString("U", this.f5284d);
                ((OLPlayRoom) this.f5281a.f5255e).f4482G.handleMessage(obtainMessage);
                return;
            } else {
                return;
            }
        }
        Toast.makeText(this.f5281a.f5253c, "对方不在线,无法进行私聊!", Toast.LENGTH_SHORT).show();
    }
}
