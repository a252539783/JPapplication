package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ly.pp.addsongs.ff */
final class C1119ff implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1101eo f5435a;
    /* renamed from: b */
    private final /* synthetic */ Message f5436b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5437c;

    C1119ff(C1101eo c1101eo, Message message, OLPlayHall oLPlayHall) {
        this.f5435a = c1101eo;
        this.f5436b = message;
        this.f5437c = oLPlayHall;
    }

    /* renamed from: run */
    public final void run() {
        Bundle data = this.f5436b.getData();
        int i = data.getInt("T");
        byte b = (byte) data.getInt("R");
        byte b2 = (byte) data.getInt("H");
        int i2 = data.getInt("C");
        String string = data.getString("I");
        String string2 = data.getString("Ti");
        C1302m c1302m = new C1302m(this.f5437c);
        c1302m.mo3539b(string2);
        string2 = "确定";
        if (i2 == 1 && b2 == this.f5437c.f4398n && b2 > (byte) 0) {
            c1302m.mo3535a(string);
            c1302m.mo3536a("一起游戏", new C1120fg(this, i, data, this.f5437c, b));
            c1302m.mo3540b("取消", new C1121fh(this));
        } else {
            c1302m.mo3535a(string);
            c1302m.mo3536a(string2, new C1122fi(this));
        }
        try {
            c1302m.mo3541c();
        } catch (Exception e) {
        }
    }
}
