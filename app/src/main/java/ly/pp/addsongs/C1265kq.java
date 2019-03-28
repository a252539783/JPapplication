package ly.pp.addsongs;

import android.graphics.Bitmap;

/* renamed from: ly.pp.addsongs.kq */
public final class C1265kq {
    /* renamed from: a */
    int f5819a;
    /* renamed from: b */
    int f5820b = 0;
    /* renamed from: c */
    int f5821c = 0;
    /* renamed from: d */
    int f5822d = 0;
    /* renamed from: e */
    int f5823e = 0;
    /* renamed from: f */
    PlayView f5824f;
    /* renamed from: g */
    Bitmap f5825g;

    public C1265kq(int i, PlayView playView, int i2, int i3, int i4) {
        this.f5819a = i;
        this.f5821c = i3 / 2;
        this.f5822d = i4 / 4;
        this.f5824f = playView;
        this.f5823e = i2;
        switch (this.f5819a) {
            case -1:
                this.f5825g = this.f5824f.f4816q;
                return;
            case 1:
                this.f5825g = this.f5824f.f4817r;
                return;
            case 2:
                this.f5825g = this.f5824f.f4820u;
                return;
            case 3:
                this.f5825g = this.f5824f.f4821v;
                return;
            case 5:
                this.f5825g = this.f5824f.f4822w;
                return;
            default:
                return;
        }
    }
}
