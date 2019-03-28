package ly.pp.addsongs;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.SurfaceHolder;


/* renamed from: ly.pp.addsongs.q */
public final class C1343q extends Thread {
    /* renamed from: a */
    private PlayView f6015a;
    /* renamed from: b */
    private SurfaceHolder f6016b;
    /* renamed from: c */
    private Canvas f6017c;
    /* renamed from: d */
    private long f6018d = System.nanoTime();
    /* renamed from: e */
    private float f6019e;
    /* renamed from: f */
    private float f6020f;
    /* renamed from: g */
    private float f6021g;
    /* renamed from: h */
    private float f6022h;
    /* renamed from: i */
    private Paint f6023i;
    /* renamed from: j */
    private Paint f6024j;
    /* renamed from: k */
    private Paint f6025k;
    /* renamed from: l */
    private Paint f6026l;
    /* renamed from: m */
    private JPApplication f6027m;
    /* renamed from: n */
    private Rect f6028n;
    /* renamed from: o */
    private Rect f6029o;
    /* renamed from: p */
    private Rect f6030p;
    /* renamed from: q */
    private PianoPlay f6031q;

    public C1343q(JPApplication jPApplication, PlayView playView, PianoPlay pianoPlay) {
        this.f6027m = jPApplication;
        this.f6015a = playView;
        this.f6016b = playView.f4714W;
        this.f6019e = (float) (jPApplication.mo2693I() / 120);
        this.f6020f = (float) this.f6015a.f4700H.getHeight();
        this.f6023i = new Paint();
        this.f6023i.setARGB(200, 255, 125, 25);
        this.f6023i.setStrokeWidth(2.0f);
        this.f6023i.setStyle(Style.STROKE);
        this.f6024j = new Paint();
        this.f6024j.setColor(-16711936);
        this.f6025k = new Paint();
        this.f6025k.setARGB(255, 255, 125, 25);
        this.f6026l = new Paint();
        this.f6026l.setColor(-1);
        this.f6028n = new Rect(0, 0, jPApplication.mo2693I(), (int) jPApplication.mo2747v());
        this.f6029o = new Rect(0, (int) jPApplication.mo2747v(), this.f6015a.f4762au, (int) jPApplication.mo2748w());
        this.f6030p = new Rect(0, 0, this.f6015a.f4762au, (int) jPApplication.mo2748w());
        this.f6031q = pianoPlay;
    }

    /* renamed from: run */
    public final void run() {
        while (this.f6031q.f4617h) {
            try {
                this.f6017c = this.f6016b.lockCanvas(this.f6030p);
                if (this.f6017c != null) {
                    this.f6017c.drawBitmap(this.f6015a.f4802c, null, this.f6028n, null);
                    this.f6017c.drawBitmap(this.f6015a.f4803d, null, this.f6029o, null);
                }
                int E = this.f6027m.mo2689E();
                JPApplication jPApplication = this.f6027m;
                if (E != 3) {
                    this.f6015a.mo2930b(this.f6017c);
                } else {
                    this.f6015a.mo2931c(this.f6017c);
                }
                if (this.f6017c != null && this.f6027m.mo2736n()) {
                    Canvas canvas = this.f6017c;
                    canvas.drawBitmap(this.f6015a.f4700H, null, new RectF(0.0f, 0.0f, (float) this.f6027m.mo2693I(), this.f6020f), null);
                    canvas.drawRoundRect(new RectF((float) (((this.f6027m.mo2693I() / 10) * this.f6015a.f4704L) + 1), 1.0f, (((float) ((this.f6027m.mo2693I() / 10) * this.f6015a.f4704L)) + (13.0f * this.f6019e)) + 1.0f, 29.0f), 3.0f, 3.0f, this.f6023i);
                    switch (this.f6015a.f4735aT.f5208a % 12) {
                        case 0:
                            this.f6021g = 20.0f;
                            break;
                        case 1:
                            this.f6021g = 10.0f;
                            break;
                        case 2:
                            this.f6021g = 20.0f;
                            break;
                        case 3:
                            this.f6021g = 10.0f;
                            break;
                        case 4:
                            this.f6021g = 20.0f;
                            break;
                        case 5:
                            this.f6021g = 20.0f;
                            break;
                        case 6:
                            this.f6021g = 10.0f;
                            break;
                        case 7:
                            this.f6021g = 20.0f;
                            break;
                        case 8:
                            this.f6021g = 10.0f;
                            break;
                        case 9:
                            this.f6021g = 20.0f;
                            break;
                        case 10:
                            this.f6021g = 10.0f;
                            break;
                        case 11:
                            this.f6021g = 20.0f;
                            break;
                    }
                    switch (this.f6015a.f4813n % 12) {
                        case 0:
                            this.f6022h = 20.0f;
                            break;
                        case 1:
                            this.f6022h = 10.0f;
                            break;
                        case 2:
                            this.f6022h = 20.0f;
                            break;
                        case 3:
                            this.f6022h = 10.0f;
                            break;
                        case 4:
                            this.f6022h = 20.0f;
                            break;
                        case 5:
                            this.f6022h = 20.0f;
                            break;
                        case 6:
                            this.f6022h = 10.0f;
                            break;
                        case 7:
                            this.f6022h = 20.0f;
                            break;
                        case 8:
                            this.f6022h = 10.0f;
                            break;
                        case 9:
                            this.f6022h = 20.0f;
                            break;
                        case 10:
                            this.f6022h = 10.0f;
                            break;
                        case 11:
                            this.f6022h = 20.0f;
                            break;
                    }
                    canvas.drawArc(new RectF(((float) this.f6015a.f4735aT.f5208a) * this.f6019e, this.f6021g, ((float) (this.f6015a.f4735aT.f5208a + 1)) * this.f6019e, this.f6021g + this.f6019e), 0.0f, 360.0f, false, this.f6024j);
                    canvas.drawArc(new RectF(((float) this.f6015a.f4813n) * this.f6019e, this.f6022h, ((float) (this.f6015a.f4813n + 1)) * this.f6019e, this.f6022h + this.f6019e), 0.0f, 360.0f, false, this.f6025k);
                }
                this.f6015a.mo2929a(this.f6017c);
                if (this.f6017c != null) {
                    this.f6016b.unlockCanvasAndPost(this.f6017c);
                }
                this.f6017c = null;
                try {
                    C1343q.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                this.f6015a.mo2929a(this.f6017c);
                if (this.f6017c != null) {
                    this.f6016b.unlockCanvasAndPost(this.f6017c);
                }
                this.f6017c = null;
                try {
                    C1343q.sleep(5);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            } catch (Throwable th) {
                this.f6015a.mo2929a(this.f6017c);
                if (this.f6017c != null) {
                    this.f6016b.unlockCanvasAndPost(this.f6017c);
                }
                this.f6017c = null;
                try {
                    C1343q.sleep(5);
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        }
    }
}
