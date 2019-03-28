package ly.pp.addsongs;

/* renamed from: ly.pp.addsongs.ml */
final class C1314ml extends Thread {
    /* renamed from: a */
    final /* synthetic */ C1313mk f5962a;
    /* renamed from: b */
    private final /* synthetic */ String f5963b;
    /* renamed from: c */
    private final /* synthetic */ String f5964c;

    C1314ml(C1313mk c1313mk, String str, String str2) {
        this.f5962a = c1313mk;
        this.f5963b = str;
        this.f5964c = str2;
    }

    /* renamed from: run */
    public final void run() {
        try {
            SoundDownload.m3911a(this.f5962a.f5958a, this.f5963b, this.f5964c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
