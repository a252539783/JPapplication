package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;

/* renamed from: ly.pp.addsongs.bl */
final class C1017bl implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ MelodySelect f5159a;
    /* renamed from: b */
    private final /* synthetic */ int f5160b;

    C1017bl(MelodySelect melodySelect, int i) {
        this.f5159a = melodySelect;
        this.f5160b = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Editor edit = this.f5159a.f4225B.edit();
        if (this.f5160b == 0) {
            edit.putBoolean("record_dialog", false);
        } else if (this.f5160b == 1) {
            edit.putBoolean("play_dialog", false);
        } else if (this.f5160b == 2) {
            edit.putBoolean("hand_dialog", false);
        }
        edit.commit();
    }
}
