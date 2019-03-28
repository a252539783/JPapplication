package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.mk */
final class C1313mk implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ SoundDownload f5958a;
    /* renamed from: b */
    private final /* synthetic */ int f5959b;
    /* renamed from: c */
    private final /* synthetic */ String f5960c;
    /* renamed from: d */
    private final /* synthetic */ String f5961d;

    C1313mk(SoundDownload soundDownload, int i, String str, String str2) {
        this.f5958a = soundDownload;
        this.f5959b = i;
        this.f5960c = str;
        this.f5961d = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f5959b == 0) {
            new C1323mu(this.f5958a, this.f5960c).start();
            this.f5958a.f5039j = 0;
            new C1314ml(this, this.f5960c, this.f5961d).start();
        } else if (this.f5959b == 1) {
            new C1315mm(this, this.f5961d).start();
        } else if (this.f5959b == 2) {
            new C1316mn(this).start();
        }
    }
}
