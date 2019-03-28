package ly.pp.addsongs;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;


/* renamed from: ly.pp.addsongs.er */
final class C1104er implements OnClickListener {
    /* renamed from: a */
    final /* synthetic */ C1103eq f5397a;
    /* renamed from: b */
    private final /* synthetic */ int f5398b;
    /* renamed from: c */
    private final /* synthetic */ OLPlayHall f5399c;
    /* renamed from: d */
    private final /* synthetic */ String f5400d;

    C1104er(C1103eq c1103eq, int i, OLPlayHall oLPlayHall, String str) {
        this.f5397a = c1103eq;
        this.f5398b = i;
        this.f5399c = oLPlayHall;
        this.f5400d = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f5398b == 1) {
            Intent intent = new Intent(this.f5399c, PianoPlay.class);
            intent.putExtra("head", 3);
            intent.putExtra("path", this.f5400d);
            intent.putExtra("name", "");
            intent.putExtra("bundle", this.f5399c.f4381N);
            intent.putExtra("bundleHall", this.f5399c.f4381N);
            this.f5399c.startActivity(intent);
            this.f5399c.finish();
        }
    }
}
