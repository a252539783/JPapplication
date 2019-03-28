package ly.pp.addsongs;

/* renamed from: ly.pp.addsongs.hr */
final class C1185hr implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1164gx f5576a;
    /* renamed from: b */
    private final /* synthetic */ OLPlayRoom f5577b;

    C1185hr(C1164gx c1164gx, OLPlayRoom oLPlayRoom) {
        this.f5576a = c1164gx;
        this.f5577b = oLPlayRoom;
    }

    /* renamed from: run */
    public final void run() {
        if (this.f5577b.f4536t != null) {
            while (this.f5577b.f4536t.isAlive()) {
                this.f5577b.f4536t.f5738b = false;
            }
            this.f5577b.f4536t = null;
        }
        C1302m c1302m = new C1302m(this.f5577b);
        c1302m.mo3537a();
        c1302m.mo3539b("您已被房主移出房间").mo3536a("確定", new C1186hs(this, this.f5577b)).mo3541c();
    }
}
