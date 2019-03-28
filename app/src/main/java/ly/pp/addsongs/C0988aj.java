package ly.pp.addsongs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.widget.Toast;

/* renamed from: ly.pp.addsongs.aj */
final class C0988aj implements ServiceConnection {
    /* renamed from: a */
    final /* synthetic */ JPApplication f5110a;

    C0988aj(JPApplication jPApplication) {
        this.f5110a = jPApplication;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5110a.mo2709a(((C1167h) iBinder).mo3283a());
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5110a.mo2709a(null);
        Toast.makeText(this.f5110a, "Service  Failed.", Toast.LENGTH_LONG).show();
    }
}
