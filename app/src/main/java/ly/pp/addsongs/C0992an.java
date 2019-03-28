package ly.pp.addsongs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;


/* renamed from: ly.pp.addsongs.an */
final class C0992an extends View {
    /* renamed from: a */
    int f5117a = -1;
    /* renamed from: b */
    int f5118b = -1;
    /* renamed from: c */
    final /* synthetic */ KeyBoard f5119c;

    public C0992an(KeyBoard keyBoard, Context context) {
        super(context);
        this.f5119c = keyBoard;
    }

    /* renamed from: a */
    public final void mo3045a(int i, int i2) {
        this.f5118b = i2;
        this.f5117a = i;
        postInvalidate();
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = this.f5119c.f4132I;
        canvas.drawBitmap(this.f5119c.f4142e, null, new Rect(0, (int) this.f5119c.f4125B, this.f5119c.f4137N.mo2693I(), (int) this.f5119c.f4127D), null);
        canvas.drawBitmap(this.f5119c.f4142e, null, new Rect(0, (int) this.f5119c.f4126C, this.f5119c.f4137N.mo2693I(), (int) this.f5119c.f4128E), null);
        if (z) {
            switch (this.f5117a) {
                case 0:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(0, (int) this.f5119c.f4125B, (int) this.f5119c.f4137N.mo2746u(), (int) this.f5119c.f4127D), null);
                    break;
                case 1:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) (this.f5119c.f4137N.mo2746u() - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) (this.f5119c.f4137N.mo2746u() + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 2:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect((int) this.f5119c.f4137N.mo2746u(), (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 2, (int) this.f5119c.f4127D), null);
                    break;
                case 3:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 2.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 2.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 4:
                    canvas.drawBitmap(this.f5119c.f4146i, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 2, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 3, (int) this.f5119c.f4127D), null);
                    break;
                case 5:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 3, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 4, (int) this.f5119c.f4127D), null);
                    break;
                case 6:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 4.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 4.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 7:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 4, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 5, (int) this.f5119c.f4127D), null);
                    break;
                case 8:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 5.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 5.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 9:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 5, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 6, (int) this.f5119c.f4127D), null);
                    break;
                case 10:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 6.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 6.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 11:
                    canvas.drawBitmap(this.f5119c.f4146i, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 6, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 7, (int) this.f5119c.f4127D), null);
                    break;
                case 12:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 7, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 8, (int) this.f5119c.f4127D), null);
                    break;
                case 13:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 8.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 8.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 14:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(0, (int) this.f5119c.f4126C, (int) this.f5119c.f4137N.mo2746u(), (int) this.f5119c.f4128E), null);
                    break;
                case 15:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) (this.f5119c.f4137N.mo2746u() - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) (this.f5119c.f4137N.mo2746u() + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 16:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect((int) this.f5119c.f4137N.mo2746u(), (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 2, (int) this.f5119c.f4128E), null);
                    break;
                case 17:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 2.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 2.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 18:
                    canvas.drawBitmap(this.f5119c.f4146i, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 2, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 3, (int) this.f5119c.f4128E), null);
                    break;
                case 19:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 3, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 4, (int) this.f5119c.f4128E), null);
                    break;
                case 20:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 4.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 4.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 21:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 4, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 5, (int) this.f5119c.f4128E), null);
                    break;
                case 22:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 5.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 5.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 23:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 5, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 6, (int) this.f5119c.f4128E), null);
                    break;
                case 24:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 6.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 6.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 25:
                    canvas.drawBitmap(this.f5119c.f4146i, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 6, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 7, (int) this.f5119c.f4128E), null);
                    break;
                case 26:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 7, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 8, (int) this.f5119c.f4128E), null);
                    break;
                case 27:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 8.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 8.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
            }
            switch (this.f5118b) {
                case 0:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(0, (int) this.f5119c.f4125B, (int) this.f5119c.f4137N.mo2746u(), (int) this.f5119c.f4127D), null);
                    break;
                case 1:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) (this.f5119c.f4137N.mo2746u() - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) (this.f5119c.f4137N.mo2746u() + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 2:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect((int) this.f5119c.f4137N.mo2746u(), (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 2, (int) this.f5119c.f4127D), null);
                    break;
                case 3:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 2.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 2.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 4:
                    canvas.drawBitmap(this.f5119c.f4146i, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 2, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 3, (int) this.f5119c.f4127D), null);
                    break;
                case 5:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 3, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 4, (int) this.f5119c.f4127D), null);
                    break;
                case 6:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 4.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 4.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 7:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 4, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 5, (int) this.f5119c.f4127D), null);
                    break;
                case 8:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 5.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 5.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 9:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 5, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 6, (int) this.f5119c.f4127D), null);
                    break;
                case 10:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 6.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 6.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 11:
                    canvas.drawBitmap(this.f5119c.f4146i, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 6, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 7, (int) this.f5119c.f4127D), null);
                    break;
                case 12:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 7, (int) this.f5119c.f4125B, ((int) this.f5119c.f4137N.mo2746u()) * 8, (int) this.f5119c.f4127D), null);
                    break;
                case 13:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 8.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4125B, (int) ((this.f5119c.f4137N.mo2746u() * 8.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4129F + 5.0f)), null);
                    break;
                case 14:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(0, (int) this.f5119c.f4126C, (int) this.f5119c.f4137N.mo2746u(), (int) this.f5119c.f4128E), null);
                    break;
                case 15:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) (this.f5119c.f4137N.mo2746u() - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) (this.f5119c.f4137N.mo2746u() + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 16:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect((int) this.f5119c.f4137N.mo2746u(), (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 2, (int) this.f5119c.f4128E), null);
                    break;
                case 17:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 2.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 2.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 18:
                    canvas.drawBitmap(this.f5119c.f4146i, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 2, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 3, (int) this.f5119c.f4128E), null);
                    break;
                case 19:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 3, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 4, (int) this.f5119c.f4128E), null);
                    break;
                case 20:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 4.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 4.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 21:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 4, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 5, (int) this.f5119c.f4128E), null);
                    break;
                case 22:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 5.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 5.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 23:
                    canvas.drawBitmap(this.f5119c.f4145h, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 5, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 6, (int) this.f5119c.f4128E), null);
                    break;
                case 24:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 6.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 6.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
                case 25:
                    canvas.drawBitmap(this.f5119c.f4146i, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 6, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 7, (int) this.f5119c.f4128E), null);
                    break;
                case 26:
                    canvas.drawBitmap(this.f5119c.f4144g, null, new Rect(((int) this.f5119c.f4137N.mo2746u()) * 7, (int) this.f5119c.f4126C, ((int) this.f5119c.f4137N.mo2746u()) * 8, (int) this.f5119c.f4128E), null);
                    break;
                case 27:
                    canvas.drawBitmap(this.f5119c.f4147j, null, new Rect((int) ((this.f5119c.f4137N.mo2746u() * 8.0f) - this.f5119c.f4137N.mo2750y()), (int) this.f5119c.f4126C, (int) ((this.f5119c.f4137N.mo2746u() * 8.0f) + this.f5119c.f4137N.mo2750y()), (int) (this.f5119c.f4130G + 5.0f)), null);
                    break;
            }
        }
        int i = this.f5117a;
        i = this.f5118b;
        canvas.drawRoundRect(new RectF(0.0f, this.f5119c.f4125B - 1.0f, (float) this.f5119c.f4137N.mo2693I(), this.f5119c.f4127D - 1.0f), 5.0f, 5.0f, this.f5119c.f4140c);
        canvas.drawRoundRect(new RectF(0.0f, this.f5119c.f4126C, (float) this.f5119c.f4137N.mo2693I(), this.f5119c.f4128E), 5.0f, 5.0f, this.f5119c.f4141d);
        canvas.drawBitmap(this.f5119c.f4148k, null, new RectF(0.0f, 0.0f, (float) this.f5119c.f4137N.mo2693I(), this.f5119c.f4124A), null);
        canvas.drawRoundRect(new RectF((float) ((this.f5119c.f4137N.mo2693I() / 10) * this.f5119c.f4152o), 1.0f, ((float) ((this.f5119c.f4137N.mo2693I() / 10) * this.f5119c.f4152o)) + (13.0f * this.f5119c.f4131H), 29.0f), 3.0f, 3.0f, this.f5119c.f4140c);
        canvas.drawRoundRect(new RectF((float) ((this.f5119c.f4137N.mo2693I() / 10) * this.f5119c.f4153p), 1.0f, ((float) ((this.f5119c.f4137N.mo2693I() / 10) * this.f5119c.f4153p)) + (13.0f * this.f5119c.f4131H), 29.0f), 3.0f, 3.0f, this.f5119c.f4141d);
    }
}
