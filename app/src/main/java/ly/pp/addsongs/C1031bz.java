package ly.pp.addsongs;

/* renamed from: ly.pp.addsongs.bz */
public final class C1031bz extends Thread {
    /* renamed from: a */
    JPApplication f5234a;
    /* renamed from: b */
    int f5235b;
    /* renamed from: c */
    PianoPlay f5236c;

    public C1031bz(JPApplication jPApplication, int i, PianoPlay pianoPlay) {
        this.f5234a = jPApplication;
        this.f5235b = i;
        this.f5236c = pianoPlay;
    }

    /* renamed from: run */
    public final void run() {
        while (this.f5236c.f4617h) {
            while (this.f5236c.f4626q.f4710S) {
                if (this.f5234a.mo2689E() != 2) {
                    this.f5234a.mo2720d();
                } else if (this.f5236c.f4626q.f4778bc) {
                    this.f5234a.mo2720d();
                }
                try {
                    C1031bz.sleep((long) this.f5235b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                C1031bz.sleep(0);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }
}
