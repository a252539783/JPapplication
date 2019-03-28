package ly.pp.addsongs;

import android.os.Bundle;
import android.os.Message;
import java.io.Serializable;


/* renamed from: ly.pp.addsongs.jv */
public final class C1243jv extends Thread implements Serializable {
    /* renamed from: a */
    C1266kr f5737a;
    /* renamed from: b */
    public boolean f5738b = true;
    /* renamed from: c */
    JPApplication f5739c;
    /* renamed from: d */
    MelodySelect f5740d = null;
    /* renamed from: e */
    int f5741e = 0;
    /* renamed from: f */
    boolean f5742f = true;
    /* renamed from: g */
    private int[] f5743g;
    /* renamed from: h */
    private int[] f5744h;
    /* renamed from: i */
    private int f5745i;
    /* renamed from: j */
    private int f5746j;
    /* renamed from: k */
    private int[] f5747k;

    public C1243jv(JPApplication jPApplication, String str, MelodySelect melodySelect, int i) {
        this.f5739c = jPApplication;
        this.f5740d = melodySelect;
        this.f5741e = i;
        this.f5737a = new C1266kr(jPApplication, str);
        this.f5742f = this.f5737a.f5829d;
        this.f5743g = this.f5737a.mo3453a();
        this.f5747k = this.f5737a.mo3456d();
        this.f5744h = this.f5737a.mo3454b();
        this.f5745i = this.f5744h.length;
        this.f5746j = (int) this.f5737a.mo3457e();
        if (this.f5746j <= 0) {
            this.f5746j += 256;
        }
    }

    /* renamed from: run */
    public final void run() {
        int i = 0;
        while (true) {
            try {
                int i2 = i;
                if (i2 < this.f5745i) {
                    if (!this.f5738b) {
                        break;
                    }
                    try {
                        Thread.sleep((long) (this.f5744h[i2] * this.f5746j));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    this.f5739c.mo2703a(this.f5743g[i2], (((float) this.f5747k[i2]) * this.f5739c.mo2744s()) / 100.0f);
                    i = i2 + 1;
                } else {
                    break;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.f5740d != null && this.f5740d.mo2786a() && this.f5740d.f4268x != null && this.f5738b) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putInt("position", this.f5741e);
            message.what = 4;
            message.setData(bundle);
            this.f5740d.f4268x.sendMessage(message);
        }
    }
}
