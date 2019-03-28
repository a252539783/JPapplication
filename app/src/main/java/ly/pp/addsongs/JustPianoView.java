package ly.pp.addsongs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import java.io.IOException;

/* renamed from: ly.pp.addsongs.JustPianoView */
public class JustPianoView extends View {
    /* renamed from: a */
    float f4109a = 0.0f;
    /* renamed from: b */
    float f4110b = 0.0f;
    /* renamed from: c */
    JPApplication f4111c;
    /* renamed from: d */
    RectF f4112d;
    /* renamed from: e */
    RectF f4113e;
    /* renamed from: f */
    private Bitmap f4114f;
    /* renamed from: g */
    private boolean f4115g = false;
    /* renamed from: h */
    private Bitmap f4116h;
    /* renamed from: i */
    private Bitmap f4117i;
    /* renamed from: j */
    private Bitmap f4118j;
    /* renamed from: k */
    private String f4119k = "";
    /* renamed from: l */
    private String f4120l = "";
    /* renamed from: m */
    private Paint f4121m;
    /* renamed from: n */
    private int f4122n = 0;
    /* renamed from: o */
    private float f4123o = 20.0f;

    public JustPianoView(Context context, JPApplication jPApplication) {
        super(context);
        this.f4109a = (float) jPApplication.mo2693I();
        this.f4110b = (float) jPApplication.mo2692H();
        this.f4111c = jPApplication;
        this.f4112d = new RectF(0.0f, 0.0f, this.f4109a, this.f4110b);
        this.f4114f = BitmapFactory.decodeResource(getResources(), R.drawable.ground);
        try {
            this.f4116h = BitmapFactory.decodeStream(getResources().getAssets().open("drawable/logopiano.png"));
            this.f4117i = jPApplication.mo2714b("progress_bar");
            this.f4118j = jPApplication.mo2714b("progress_bar_base");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f4113e = new RectF(0.0f, this.f4110b - ((float) this.f4117i.getHeight()), (float) jPApplication.mo2693I(), this.f4110b);
        this.f4121m = new Paint();
    }

    /* renamed from: a */
    public final void mo2760a() {
        this.f4114f.recycle();
        this.f4114f = null;
        if (this.f4116h != null) {
            this.f4116h.recycle();
            this.f4116h = null;
        }
        if (this.f4117i != null) {
            this.f4117i.recycle();
            this.f4117i = null;
        }
        if (this.f4118j != null) {
            this.f4118j.recycle();
            this.f4118j = null;
        }
    }

    /* renamed from: a */
    public final void mo2761a(int i, String str, String str2) {
        this.f4122n = i;
        this.f4120l = str;
        this.f4119k = str2;
        this.f4115g = true;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4115g) {
            this.f4121m.setARGB(255, 12, 160, 251);
            this.f4121m.setTextAlign(Align.RIGHT);
            this.f4121m.setAntiAlias(true);
            this.f4121m.setTextSize(this.f4123o);
            this.f4121m.setTypeface(Typeface.DEFAULT_BOLD);
            int I = (this.f4111c.mo2693I() * this.f4122n) / 100;
            canvas.drawBitmap(this.f4114f, null, this.f4112d, null);
            canvas.drawBitmap(this.f4116h, (float) ((this.f4111c.mo2693I() - this.f4116h.getWidth()) / 2), (float) ((this.f4111c.mo2692H() - this.f4116h.getHeight()) / 2), null);
            canvas.drawBitmap(this.f4118j, null, this.f4113e, null);
            canvas.drawBitmap(this.f4117i, null, new Rect(I - this.f4111c.mo2693I(), this.f4111c.mo2692H() - this.f4117i.getHeight(), I, this.f4111c.mo2692H()), null);
            canvas.drawText(this.f4119k + this.f4120l, (float) this.f4111c.mo2693I(), (float) (this.f4111c.mo2692H() - this.f4117i.getHeight()), this.f4121m);
            return;
        }
        canvas.drawColor(35584);
        canvas.drawBitmap(this.f4116h, (this.f4109a - ((float) this.f4116h.getWidth())) / 2.0f, (this.f4110b - ((float) this.f4116h.getHeight())) / 2.0f, null);
    }
}
