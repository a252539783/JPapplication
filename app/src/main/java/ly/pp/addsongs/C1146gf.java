package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.gf */
final class C1146gf implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5488a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayHallRoom f5489b;
    /* renamed from: c */
    private final /* synthetic */ Message f5490c;

    C1146gf(C1137fx c1137fx, OLPlayHallRoom oLPlayHallRoom, Message message) {
        this.f5488a = c1137fx;
        this.f5489b = oLPlayHallRoom;
        this.f5490c = message;
    }

    /* renamed from: run */
    public final void run() {
        this.f5489b.f4426P.dismiss();
        Bundle data = this.f5490c.getData();
        data.getInt("R");
        byte b = (byte) data.getInt("H");
        data.getInt("C");
        String string = data.getString("Ti");
        String string2 = data.getString("I");
        String str = "确定";
        C1302m c1302m = new C1302m(this.f5489b);
        c1302m.mo3539b(string);
        if (b > (byte) 0) {
            c1302m.mo3535a(string2);
            c1302m.mo3536a("进入Ta所在大厅", new C1147gg(this, b, this.f5489b));
            c1302m.mo3540b("取消", new C1148gh(this));
        } else {
            c1302m.mo3535a(string2);
            c1302m.mo3536a(str, new C1149gi(this, b, this.f5489b));
        }
        try {
            c1302m.mo3541c();
        } catch (Exception e) {
        }
    }
}
