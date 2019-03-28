package ly.pp.addsongs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ly.pp.addsongs.mx */
final class C1326mx implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1324mv f5989a;
    /* renamed from: b */
    private final /* synthetic */ String f5990b;
    /* renamed from: c */
    private final /* synthetic */ int f5991c;

    C1326mx(C1324mv c1324mv, String str, int i) {
        this.f5989a = c1324mv;
        this.f5990b = str;
        this.f5991c = i;
    }

    public final void onClick(View view) {
        if (this.f5990b.equals("original")) {
            //this.f5989a.f5986e.persistString(this.f5990b);
            new C1327my(this.f5989a.f5986e).execute("original", null, null);
        } else if (this.f5990b.equals("more")){
            Intent intent = new Intent();
            intent.setFlags(0);
            intent.setClass(this.f5989a.f5982a, SoundDownload.class);
            this.f5989a.f5982a.startActivity(intent);
        } else {
            //this.f5989a.f5986e.persistString(this.f5990b);
            new C1327my(this.f5989a.f5986e).execute(this.f5990b, String.valueOf(this.f5989a.f5983b[this.f5991c]), null);
        }
    }
}
