package ly.pp.addsongs;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ly.pp.addsongs.ks */
public final class C1267ks extends Thread {
    /* renamed from: a */
    ArrayList f5843a;
    /* renamed from: b */
    int f5844b = 0;
    /* renamed from: c */
    int f5845c = 0;
    /* renamed from: d */
    PianoPlay f5846d;

    public C1267ks(ArrayList arrayList, PianoPlay pianoPlay) {
        this.f5843a = arrayList;
        this.f5844b = 0;
        this.f5845c = 0;
        this.f5845c = 0;
        this.f5846d = pianoPlay;
    }

    /* renamed from: a */
    public final int mo3461a(C1265kq c1265kq, int i, int i2) {
        if (this.f5843a.size() > 1) {
            this.f5843a.remove(0);
        }
        this.f5843a.add(0, c1265kq);
        if (i2 <= 0) {
            this.f5844b += i;
        } else if (i2 <= 11 && i2 > 0) {
            this.f5845c = (this.f5845c + i2) - 1;
            this.f5844b = ((this.f5844b + i) + i2) - 1;
        } else if (i2 > 11) {
            this.f5845c += 10;
            this.f5844b = (this.f5844b + i) + 10;
        }
        if (this.f5844b < 0) {
            this.f5844b = 0;
        }
        return this.f5844b;
    }

    /* renamed from: run */
    public final void run() {
        while (this.f5846d.f4617h) {
            try {
                Iterator it = this.f5843a.iterator();
                while (it.hasNext()) {
                    C1265kq c1265kq = (C1265kq) it.next();
                    c1265kq.f5822d -= 10;
                }
                C1267ks.sleep(60);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
