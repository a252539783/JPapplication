package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: ly.pp.addsongs.kk */
final class C1259kk implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ RecordFiles f5797a;
    /* renamed from: b */
    private final /* synthetic */ int f5798b;
    /* renamed from: c */
    private final /* synthetic */ String f5799c;

    C1259kk(RecordFiles recordFiles, int i, String str) {
        this.f5797a = recordFiles;
        this.f5798b = i;
        this.f5799c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f5797a.mo2948a(this.f5798b, this.f5799c);
    }
}
