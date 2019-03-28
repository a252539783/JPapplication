package ly.pp.addsongs;

/* renamed from: ly.pp.addsongs.mm */
final class C1315mm extends Thread {
    /* renamed from: a */
    final /* synthetic */ C1313mk f5965a;
    /* renamed from: b */
    private final /* synthetic */ String f5966b;

    C1315mm(C1313mk c1313mk, String str) {
        this.f5965a = c1313mk;
        this.f5966b = str;
    }

    /* renamed from: run */
    public final void run() {
        try {
            this.f5965a.f5958a.mo3006a(this.f5966b + ".ss");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
