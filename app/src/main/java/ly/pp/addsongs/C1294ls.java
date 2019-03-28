package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.widget.RelativeLayout;
import java.io.File;

/* renamed from: ly.pp.addsongs.ls */
final class C1294ls implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ SkinDownload f5905a;
    /* renamed from: b */
    private final /* synthetic */ int f5906b;
    /* renamed from: c */
    private final /* synthetic */ String f5907c;
    /* renamed from: d */
    private final /* synthetic */ String f5908d;

    C1294ls(SkinDownload skinDownload, int i, String str, String str2) {
        this.f5905a = skinDownload;
        this.f5906b = i;
        this.f5907c = str;
        this.f5908d = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        dialogInterface.dismiss();
        if (this.f5906b == 0) {
            new C1304mb(this.f5905a, this.f5907c).start();
            this.f5905a.f5014j = 0;
            new C1295lt(this, this.f5907c, this.f5908d).start();
        } else if (this.f5906b == 1) {
            new C1296lu(this, this.f5908d).start();
        } else if (this.f5906b == 2) {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f5905a).edit();
            edit.putString("skin_list", "original");
            edit.commit();
            File dir = this.f5905a.getDir("Skin", 0);
            if (dir.isDirectory()) {
                File[] listFiles = dir.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    while (i2 < listFiles.length) {
                        listFiles[i2].delete();
                        i2++;
                    }
                }
            }
            this.f5905a.f5005a.mo2707a(this.f5905a, "ground", (RelativeLayout) this.f5905a.findViewById(R.id.layout));
        }
    }
}
