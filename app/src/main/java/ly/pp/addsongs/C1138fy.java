package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.fy */
final class C1138fy implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5467a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHallRoom f5468b;
    /* renamed from: c */
    private final /* synthetic */ Message f5469c;

    C1138fy(C1137fx c1137fx, OLPlayHallRoom oLPlayHallRoom, Message message) {
        this.f5467a = c1137fx;
        this.f5468b = oLPlayHallRoom;
        this.f5469c = message;
    }

    /* renamed from: run */
    public final void run() {
        int i;
        this.f5468b.f4472w.clear();
        Bundle data = this.f5469c.getData();
        Bundle bundle = data.getBundle("L");
        int size = bundle.size();
        for (i = 0; i < size; i++) {
            this.f5468b.f4472w.add(bundle.getBundle(String.valueOf(i)));
        }
        this.f5468b.mo2843a(this.f5468b.f4471v, this.f5468b.f4472w);
        this.f5468b.f4412B.setText(data.getString("U"));
        this.f5468b.f4470u.mo2723d(data.getString("S"));
        this.f5468b.f4417G.setText("经验值:" + data.getInt("E") + "/" + data.getInt("X"));
        this.f5468b.f4414D.setText("LV." + data.getInt("LV"));
        i = data.getInt("CL");
        this.f5468b.f4415E.setText("CL." + i);
        this.f5468b.f4415E.setTextColor(this.f5468b.getResources().getColor(C1194i.f5606j[i]));
        this.f5468b.f4416F.setText(C1194i.f5602f[i]);
        this.f5468b.f4416F.setTextColor(this.f5468b.getResources().getColor(C1194i.f5606j[i]));
        this.f5468b.f4466q = data.getInt("CP");
        if (this.f5468b.f4466q >= 0 && this.f5468b.f4466q <= 3) {
            this.f5468b.f4437aa.setImageResource(this.f5468b.f4455as[this.f5468b.f4466q]);
        }
        this.f5468b.f4465p = data.getInt("LV");
        //data.getString("S") + "   " + data.getString("D");
        this.f5468b.mo2844a(data.getString("DR"));
        i = data.getInt("M");
        if (i > 0) {
            this.f5468b.f4413C.setText(String.valueOf(i));
        }
    }
}
