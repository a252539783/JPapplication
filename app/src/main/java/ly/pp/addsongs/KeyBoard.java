package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.view.View;
import java.io.IOException;



/* renamed from: ly.pp.addsongs.KeyBoard */
public class KeyBoard extends Activity {
    /* renamed from: A */
    float f4124A;
    /* renamed from: B */
    float f4125B;
    /* renamed from: C */
    float f4126C;
    /* renamed from: D */
    float f4127D;
    /* renamed from: E */
    float f4128E;
    /* renamed from: F */
    float f4129F;
    /* renamed from: G */
    float f4130G;
    /* renamed from: H */
    float f4131H;
    /* renamed from: I */
    boolean f4132I = true;
    /* renamed from: J */
    float f4133J = 0.0f;
    /* renamed from: K */
    boolean f4134K = true;
    /* renamed from: L */
    int f4135L = 0;
    /* renamed from: M */
    int f4136M = 0;
    /* renamed from: N */
    JPApplication f4137N;
    /* renamed from: a */
    int f4138a = -1;
    /* renamed from: b */
    int f4139b = -1;
    /* renamed from: c */
    Paint f4140c;
    /* renamed from: d */
    Paint f4141d;
    /* renamed from: e */
    Bitmap f4142e;
    /* renamed from: f */
    int f4143f = 0;
    /* renamed from: g */
    Bitmap f4144g;
    /* renamed from: h */
    Bitmap f4145h;
    /* renamed from: i */
    Bitmap f4146i;
    /* renamed from: j */
    Bitmap f4147j;
    /* renamed from: k */
    Bitmap f4148k;
    /* renamed from: l */
    int f4149l = 0;
    /* renamed from: m */
    boolean f4150m;
    /* renamed from: n */
    boolean f4151n;
    /* renamed from: o */
    int f4152o = 6;
    /* renamed from: p */
    int f4153p = 5;
    /* renamed from: q */
    float f4154q;
    /* renamed from: r */
    float f4155r;
    /* renamed from: s */
    double f4156s;
    /* renamed from: t */
    double f4157t;
    /* renamed from: u */
    double f4158u;
    /* renamed from: v */
    double f4159v;
    /* renamed from: w */
    double f4160w;
    /* renamed from: x */
    double f4161x;
    /* renamed from: y */
    float f4162y;
    /* renamed from: z */
    float f4163z;

    /* renamed from: a */
    private static Bitmap m3591a(Context context, String str) {
        Bitmap bitmap = null;
        try {
            return BitmapFactory.decodeStream(context.getResources().getAssets().open("drawable/" + str + ".png"));
        } catch (IOException e) {
            e.toString();
            return bitmap;
        }
    }

    /* renamed from: a */
    public final int mo2763a(float f, float f2, int i) {
        int i2 = 2;
        int i3 = 1;
        if (f2 < this.f4124A) {
            if (f2 < this.f4124A) {
                switch (i) {
                    case 0:
                        this.f4133J = f;
                        if (f <= ((float) ((this.f4137N.mo2693I() / 10) * this.f4152o)) || f >= ((float) ((this.f4137N.mo2693I() / 10) * this.f4152o)) + (this.f4131H * 13.0f)) {
                            if (f > ((float) ((this.f4137N.mo2693I() / 10) * this.f4153p)) && f < ((float) ((this.f4137N.mo2693I() / 10) * this.f4153p)) + (this.f4131H * 13.0f)) {
                                this.f4141d.setColor(-1);
                                this.f4134K = false;
                                break;
                            }
                        }
                        this.f4140c.setColor(-1);
                        this.f4134K = true;
                        break;
                    case 1:
                        if (!this.f4134K) {
                            this.f4141d.setARGB(200, 255, 125, 25);
                            break;
                        }
                        this.f4140c.setColor(-16711936);
                        break;
                    case 2:
                        if (!this.f4134K) {
                            while (i2 < 9) {
                                if (f > ((float) ((this.f4137N.mo2693I() / 10) * i2)) && f < ((float) ((this.f4137N.mo2693I() / 10) * (i2 + 1))) + (this.f4131H * 13.0f)) {
                                    this.f4153p = i2;
                                }
                                i2++;
                            }
                            break;
                        }
                        while (i2 < 9) {
                            if (f > ((float) ((this.f4137N.mo2693I() / 10) * i2)) && f < ((float) ((this.f4137N.mo2693I() / 10) * (i2 + 1))) + (this.f4131H * 13.0f)) {
                                this.f4152o = i2;
                            }
                            i2++;
                        }
                        break;
                }
            }
        }
        if (f2 <= this.f4129F) {
            if (Math.abs(this.f4156s - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 1;
            }
            if (Math.abs(this.f4157t - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 3;
            }
            if (Math.abs(this.f4158u - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 6;
            }
            if (Math.abs(this.f4159v - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 8;
            }
            if (Math.abs(this.f4160w - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 10;
            }
            if (Math.abs(this.f4161x - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 13;
            }
        } else if (f2 >= this.f4126C && f2 <= this.f4130G) {
            if (Math.abs(this.f4156s - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 15;
            }
            if (Math.abs(this.f4157t - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 17;
            }
            if (Math.abs(this.f4158u - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 20;
            }
            if (Math.abs(this.f4159v - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 22;
            }
            if (Math.abs(this.f4160w - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 24;
            }
            if (Math.abs(this.f4161x - ((double) f)) < ((double) this.f4137N.mo2750y())) {
                return 27;
            }
        }
        if (f2 < this.f4127D) {
            while (i3 < 9) {
                if (f >= ((float) (i3 - 1)) * this.f4137N.mo2746u() && f < ((float) i3) * this.f4137N.mo2746u()) {
                    switch (i3) {
                        case 1:
                            return 0;
                        case 2:
                            return 2;
                        case 3:
                            return 4;
                        case 4:
                            return 5;
                        case 5:
                            return 7;
                        case 6:
                            return 9;
                        case 7:
                            return 11;
                        case 8:
                            return 12;
                        default:
                            break;
                    }
                }
                i3++;
            }
        } else if (f2 >= this.f4127D) {
            while (i3 < 9) {
                if (f >= ((float) (i3 - 1)) * this.f4137N.mo2746u() && f < ((float) i3) * this.f4137N.mo2746u()) {
                    switch (i3) {
                        case 1:
                            return 14;
                        case 2:
                            return 16;
                        case 3:
                            return 18;
                        case 4:
                            return 19;
                        case 5:
                            return 21;
                        case 6:
                            return 23;
                        case 7:
                            return 25;
                        case 8:
                            return 26;
                        default:
                            break;
                    }
                }
                i3++;
            }
        }
        return -1;
    }

    public void onBackPressed() {
        this.f4142e = null;
        this.f4144g = null;
        this.f4145h = null;
        this.f4146i = null;
        this.f4147j = null;
        this.f4148k = null;
        Intent intent = new Intent();
        intent.setClass(this, PlayModeSelect.class);
        startActivity(intent);
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4137N = (JPApplication) getApplication();
        this.f4156s = (double) (this.f4137N.mo2693I() / 8);
        this.f4157t = (double) ((this.f4137N.mo2693I() * 2) / 8);
        this.f4158u = (double) ((this.f4137N.mo2693I() * 4) / 8);
        this.f4159v = (double) ((this.f4137N.mo2693I() * 5) / 8);
        this.f4160w = (double) ((this.f4137N.mo2693I() * 6) / 8);
        this.f4161x = (double) this.f4137N.mo2693I();
        this.f4162y = (float) this.f4137N.mo2692H();
        this.f4142e = KeyBoard.m3591a(this, "key_board_hd");
        this.f4144g = KeyBoard.m3591a(this, "white_r");
        this.f4145h = KeyBoard.m3591a(this, "white_m");
        this.f4146i = KeyBoard.m3591a(this, "white_l");
        this.f4147j = KeyBoard.m3591a(this, "black");
        this.f4148k = KeyBoard.m3591a(this, "keyboard_long");
        this.f4137N.mo2715b((float) (this.f4137N.mo2693I() / 8));
        this.f4137N.mo2724e((float) ((this.f4137N.mo2692H() * 10) / 34));
        this.f4137N.mo2727f((float) (((this.f4137N.mo2692H() - 35) * 10) / 34));
        this.f4137N.mo2729g((float) ((this.f4137N.mo2693I() * 3) / 80));
        this.f4142e = KeyBoard.m3591a(this, "key_board_hd");
        this.f4150m = true;
        this.f4151n = true;
        this.f4124A = (float) this.f4148k.getHeight();
        this.f4163z = (this.f4162y - ((float) this.f4148k.getHeight())) / 2.0f;
        this.f4125B = this.f4124A;
        this.f4127D = this.f4124A + this.f4163z;
        this.f4126C = this.f4124A + this.f4163z;
        this.f4128E = (float) this.f4137N.mo2692H();
        this.f4129F = this.f4124A + ((this.f4163z * 14.0f) / 25.0f);
        this.f4130G = (this.f4124A + this.f4163z) + ((this.f4163z * 14.0f) / 25.0f);
        this.f4131H = (float) (this.f4137N.mo2693I() / 120);
        this.f4140c = new Paint();
        this.f4140c.setColor(-16711936);
        this.f4140c.setStrokeWidth(2.0f);
        this.f4140c.setStyle(Style.STROKE);
        this.f4141d = new Paint();
        this.f4141d.setARGB(200, 255, 125, 25);
        this.f4141d.setStrokeWidth(2.0f);
        this.f4141d.setStyle(Style.STROKE);
        View c0992an = new C0992an(this, this);
        setContentView(c0992an);
        c0992an.setOnTouchListener(new C0991am(this, (C0992an) c0992an));
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
