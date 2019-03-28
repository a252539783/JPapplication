package ly.pp.addsongs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

/* renamed from: ly.pp.addsongs.me */
final class C1307me implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1305mc f5944a;
    /* renamed from: b */
    private final /* synthetic */ String f5945b;

    C1307me(C1305mc c1305mc, String str) {
        this.f5944a = c1305mc;
        this.f5945b = str;
    }

    public final void onClick(View view) {
        int i = 0;
        if (this.f5945b.equals("original")) {
            //this.f5944a.f5941e.persistString(this.f5945b);
            File dir = this.f5944a.f5937a.getDir("Skin", 0);
            if (dir.isDirectory()) {
                File[] listFiles = dir.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    while (i < listFiles.length) {
                        listFiles[i].delete();
                        i++;
                    }
                }
            }
        } else if (this.f5945b.equals("more")) {
            Intent intent = new Intent();
            intent.setFlags(0);
            intent.setClass(this.f5944a.f5937a, SkinDownload.class);
            this.f5944a.f5937a.startActivity(intent);
        } else {
            //this.f5944a.f5941e.persistString(this.f5945b);
            this.f5944a.f5941e.f5024d = new File(this.f5945b);
            new C1308mf(this.f5944a.f5941e).execute(null, null, null);
        }
    }
}
