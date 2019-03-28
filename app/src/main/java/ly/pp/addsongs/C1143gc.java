package ly.pp.addsongs;

import android.os.Message;

/* renamed from: ly.pp.addsongs.gc */
final class C1143gc implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1137fx f5480a;
    /* renamed from: b */
    private final /* synthetic */ Message f5481b;

    C1143gc(C1137fx c1137fx, Message message) {
        this.f5480a = c1137fx;
        this.f5481b = message;
    }

    /* renamed from: run */
    public final void run() {
        String string = this.f5481b.getData().getString("T");
        if (string != null) {
            string.equals("D");
        }
    }
}
