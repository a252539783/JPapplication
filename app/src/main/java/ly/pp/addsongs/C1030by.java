package ly.pp.addsongs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;

/* renamed from: ly.pp.addsongs.by */
public final class C1030by {
    /* renamed from: A */
    public float f5197A;
    /* renamed from: B */
    boolean f5198B;
    /* renamed from: C */
    boolean f5199C;
    /* renamed from: D */
    boolean f5200D = false;
    /* renamed from: E */
    int f5201E = 0;
    /* renamed from: F */
    int f5202F = 0;
    /* renamed from: G */
    PlayView f5203G;
    /* renamed from: H */
    JPApplication f5204H;
    /* renamed from: I */
    private float f5205I;
    /* renamed from: J */
    private float f5206J;
    /* renamed from: K */
    private double f5207K = 0.0d;
    /* renamed from: a */
    public int f5208a = 0;
    /* renamed from: b */
    public int f5209b = 0;
    /* renamed from: c */
    public float f5210c = 0.0f;
    /* renamed from: d */
    public Bitmap f5211d = null;
    /* renamed from: e */
    Paint f5212e = null;
    /* renamed from: f */
    Boolean f5213f = Boolean.valueOf(true);
    /* renamed from: g */
    float f5214g = 0.0f;
    /* renamed from: h */
    float f5215h = 0.0f;
    /* renamed from: i */
    float f5216i = 0.0f;
    /* renamed from: j */
    public float f5217j;
    /* renamed from: k */
    public int f5218k;
    /* renamed from: l */
    public float f5219l;
    /* renamed from: m */
    public float f5220m;
    /* renamed from: n */
    public int f5221n = 0;
    /* renamed from: o */
    public float f5222o;
    /* renamed from: p */
    public float f5223p;
    /* renamed from: q */
    public float f5224q;
    /* renamed from: r */
    public float f5225r;
    /* renamed from: s */
    public float f5226s;
    /* renamed from: t */
    public float f5227t;
    /* renamed from: u */
    public float f5228u;
    /* renamed from: v */
    public float f5229v;
    /* renamed from: w */
    public float f5230w;
    /* renamed from: x */
    public float f5231x;
    /* renamed from: y */
    public float f5232y;
    /* renamed from: z */
    public float f5233z;

    public C1030by(JPApplication jPApplication, PlayView playView, int i, int i2, float f, float f2, int i3, boolean z, boolean z2, float f3, int i4) {
        this.f5221n = i4;
        this.f5204H = jPApplication;
        this.f5203G = playView;
        this.f5218k = i3;
        this.f5208a = i;
        this.f5198B = z;
        this.f5217j = (f3 / 2.0f) + f2;
        this.f5200D = z2;
        this.f5216i = f2;
        this.f5209b = i2;
        this.f5199C = true;
        this.f5210c = f;
        this.f5219l = (float) playView.f4824y.getWidth();
        this.f5206J = this.f5219l / 2.0f;
        this.f5220m = (float) playView.f4824y.getHeight();
        this.f5205I = this.f5220m / 2.0f;
        this.f5207K = (double) (jPApplication.mo2748w() + (3.0f * this.f5220m));
        this.f5212e = new Paint();
        this.f5212e.setAntiAlias(true);
        this.f5212e.setColor(-1);
        this.f5212e.setTextAlign(Align.CENTER);
        this.f5212e.setTextSize((float) (((double) this.f5220m) * 1.2d));
        this.f5212e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f5212e.setShadowLayer(1.2f, 1.2f, 1.2f, -12303292);
        float I = (float) (this.f5204H.mo2693I() / 16);
        float f4 = this.f5219l / 2.0f;
        this.f5222o = I - f4;
        this.f5223p = (2.0f * I) - f4;
        this.f5224q = (3.0f * I) - f4;
        this.f5225r = (4.0f * I) - f4;
        this.f5226s = (5.0f * I) - f4;
        this.f5227t = (7.0f * I) - f4;
        this.f5228u = (8.0f * I) - f4;
        this.f5229v = (9.0f * I) - f4;
        this.f5230w = (10.0f * I) - f4;
        this.f5231x = (11.0f * I) - f4;
        this.f5232y = (12.0f * I) - f4;
        this.f5233z = (13.0f * I) - f4;
        this.f5197A = (I * 15.0f) - f4;
        if (this.f5209b != this.f5221n) {
            return;
        }
        if (this.f5208a == (i3 * 12) + 12) {
            this.f5211d = this.f5203G.f4824y;
            this.f5214g = this.f5197A;
            this.f5202F = 12;
            return;
        }
        this.f5202F = this.f5208a % 12;
        switch (this.f5208a % 12) {
            case 0:
                this.f5214g = this.f5222o;
                this.f5211d = this.f5203G.f4824y;
                return;
            case 1:
                this.f5214g = this.f5223p;
                this.f5211d = this.f5203G.f4825z;
                return;
            case 2:
                this.f5214g = this.f5224q;
                this.f5211d = this.f5203G.f4824y;
                return;
            case 3:
                this.f5214g = this.f5225r;
                this.f5211d = this.f5203G.f4825z;
                return;
            case 4:
                this.f5214g = this.f5226s;
                this.f5211d = this.f5203G.f4824y;
                return;
            case 5:
                this.f5214g = this.f5227t;
                this.f5211d = this.f5203G.f4824y;
                return;
            case 6:
                this.f5214g = this.f5228u;
                this.f5211d = this.f5203G.f4825z;
                return;
            case 7:
                this.f5214g = this.f5229v;
                this.f5211d = this.f5203G.f4824y;
                return;
            case 8:
                this.f5214g = this.f5230w;
                this.f5211d = this.f5203G.f4825z;
                return;
            case 9:
                this.f5214g = this.f5231x;
                this.f5211d = this.f5203G.f4824y;
                return;
            case 10:
                this.f5214g = this.f5232y;
                this.f5211d = this.f5203G.f4825z;
                return;
            case 11:
                this.f5214g = this.f5233z;
                this.f5211d = this.f5203G.f4824y;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final float mo3104a() {
        return this.f5205I;
    }

    /* renamed from: a */
    public final void mo3105a(Canvas canvas) {
        this.f5215h = this.f5217j + this.f5204H.mo2716c();
        if (this.f5215h >= this.f5204H.mo2747v()) {
            float s = (this.f5210c * this.f5204H.mo2744s()) / 100.0f;
            if (this.f5213f.booleanValue() && this.f5204H.mo2745t() && this.f5215h >= this.f5204H.mo2747v()) {
                if (this.f5209b == this.f5221n) {
                    this.f5204H.mo2710a(this.f5203G, canvas, this.f5202F);
                }
                this.f5201E = this.f5204H.mo2703a(this.f5208a, s);
                this.f5213f = Boolean.valueOf(false);
            }
            if (((double) this.f5215h) >= this.f5207K) {
                JPApplication jPApplication = this.f5204H;
                JPApplication.m3519a(this.f5201E);
            }
        }
        if (canvas != null && this.f5209b == this.f5221n) {
            canvas.drawBitmap(this.f5211d, this.f5214g, this.f5215h, null);
        }
    }

    /* renamed from: b */
    public final float mo3106b() {
        return this.f5206J;
    }

    /* renamed from: b */
    public final float mo3107b(Canvas canvas) {
        this.f5215h = this.f5217j + this.f5204H.mo2716c();
        if (this.f5215h >= this.f5204H.mo2747v()) {
            if (this.f5213f.booleanValue() && this.f5198B) {
                this.f5201E = this.f5204H.mo2703a(this.f5208a, this.f5210c);
                this.f5213f = Boolean.valueOf(false);
                return this.f5215h;
            } else if (((double) this.f5215h) >= this.f5207K) {
                JPApplication jPApplication = this.f5204H;
                JPApplication.m3519a(this.f5201E);
                return this.f5215h;
            }
        }
        if (!(canvas == null || this.f5209b != this.f5221n || this.f5198B)) {
            canvas.drawBitmap(this.f5211d, this.f5214g, this.f5215h, null);
        }
        return this.f5215h;
    }

    /* renamed from: c */
    public final float mo3108c(Canvas canvas) {
        this.f5215h = this.f5217j + this.f5204H.mo2716c();
        if (this.f5215h >= this.f5204H.mo2747v()) {
            if (this.f5204H.mo2743r()) {
                if (this.f5213f.booleanValue() && ((this.f5209b != this.f5221n || this.f5198B) && this.f5204H.mo2745t())) {
                    this.f5201E = this.f5204H.mo2703a(this.f5208a, this.f5210c);
                    this.f5213f = Boolean.valueOf(false);
                    return this.f5215h;
                }
            } else if (this.f5213f.booleanValue() && this.f5209b != this.f5221n && this.f5204H.mo2745t()) {
                this.f5201E = this.f5204H.mo2703a(this.f5208a, (this.f5210c * this.f5204H.mo2744s()) / 100.0f);
                this.f5213f = Boolean.valueOf(false);
                return this.f5215h;
            }
            if (((double) this.f5215h) >= this.f5207K) {
                JPApplication jPApplication = this.f5204H;
                JPApplication.m3519a(this.f5201E);
            }
        }
        if (this.f5204H.mo2743r()) {
            if (!(canvas == null || this.f5209b != this.f5221n || this.f5198B)) {
                canvas.drawBitmap(this.f5211d, this.f5214g, this.f5215h, null);
            }
        } else if (canvas != null && this.f5209b == this.f5221n) {
            canvas.drawBitmap(this.f5211d, this.f5214g, this.f5215h, null);
        }
        return this.f5215h;
    }
}
