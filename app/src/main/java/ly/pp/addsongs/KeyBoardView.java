package ly.pp.addsongs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;

/* renamed from: ly.pp.addsongs.KeyBoardView */
public class KeyBoardView extends View {
    /* renamed from: a */
    Bitmap f4164a;
    /* renamed from: b */
    PlayView f4165b;
    /* renamed from: c */
    RectF f4166c;
    /* renamed from: d */
    int f4167d = -1;
    /* renamed from: e */
    int f4168e = 0;
    /* renamed from: f */
    int f4169f = 0;
    /* renamed from: g */
    int f4170g = 0;
    /* renamed from: h */
    int f4171h = 0;
    /* renamed from: i */
    boolean f4172i = true;
    /* renamed from: j */
    private JPApplication f4173j;
    /* renamed from: k */
    private ArrayList f4174k = new ArrayList();
    /* renamed from: l */
    private ArrayList f4175l = new ArrayList();
    /* renamed from: m */
    private Rect f4176m;
    /* renamed from: n */
    private Rect f4177n;

    public KeyBoardView(Context context, PlayView playView, JPApplication jPApplication) {
        super(context);
        this.f4173j = jPApplication;
        this.f4164a = playView.f4790bo;
        this.f4166c = new RectF(0.0f, (float) ((int) jPApplication.mo2748w()), (float) jPApplication.mo2693I(), (float) jPApplication.mo2692H());
        this.f4165b = playView;
        this.f4168e = 0;
        this.f4169f = (int) (jPApplication.mo2747v() - ((float) playView.f4699G.getHeight()));
        this.f4170g = jPApplication.mo2693I();
        this.f4171h = jPApplication.mo2692H();
        this.f4172i = jPApplication.mo2694J();
        this.f4174k = jPApplication.mo2704a(playView);
        this.f4175l = jPApplication.mo2691G();
    }

    /* renamed from: a */
    public final void mo2768a() {
        this.f4164a.recycle();
        this.f4164a = null;
    }

    /* renamed from: a */
    public final void mo2769a(int i) {
        if (this.f4167d != i) {
            if (this.f4172i) {
                if (i >= 0) {
                    if (i != this.f4167d && this.f4167d >= 0) {
                        invalidate(this.f4176m.left, this.f4176m.top, this.f4176m.right, this.f4177n.bottom);
                    }
                    this.f4176m = (Rect) this.f4174k.get(i);
                    this.f4177n = (Rect) this.f4175l.get(i);
                    invalidate(this.f4176m.left, this.f4176m.top, this.f4176m.right, this.f4177n.bottom);
                } else if (i == -1) {
                    invalidate(this.f4176m.left, this.f4176m.top, this.f4176m.right, this.f4177n.bottom);
                }
            }
            this.f4167d = i;
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f4164a, null, this.f4166c, null);
        if (this.f4167d >= 0) {
            JPApplication jPApplication = this.f4173j;
            JPApplication.m3520a(canvas, (Rect) this.f4174k.get(this.f4167d), (Rect) this.f4175l.get(this.f4167d), this.f4165b, this.f4167d);
        }
    }
}
