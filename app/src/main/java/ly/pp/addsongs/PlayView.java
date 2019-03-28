package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;




/* renamed from: ly.pp.addsongs.PlayView */
public class PlayView extends SurfaceView implements Callback {
    /* renamed from: R */
    public static int f4691R;
    /* renamed from: aP */
    static double f4692aP;
    /* renamed from: A */
    Bitmap f4693A;
    /* renamed from: B */
    Bitmap f4694B;
    /* renamed from: C */
    Bitmap f4695C;
    /* renamed from: D */
    Bitmap f4696D;
    /* renamed from: E */
    Bitmap f4697E;
    /* renamed from: F */
    Bitmap f4698F;
    /* renamed from: G */
    Bitmap f4699G;
    /* renamed from: H */
    Bitmap f4700H;
    /* renamed from: I */
    int f4701I;
    /* renamed from: J */
    Bitmap f4702J;
    /* renamed from: K */
    Bitmap f4703K;
    /* renamed from: L */
    int f4704L;
    /* renamed from: M */
    float f4705M;
    /* renamed from: N */
    int f4706N;
    /* renamed from: O */
    float f4707O;
    /* renamed from: P */
    C1031bz f4708P;
    /* renamed from: Q */
    C1343q f4709Q;
    /* renamed from: S */
    boolean f4710S;
    /* renamed from: T */
    boolean f4711T;
    /* renamed from: U */
    boolean f4712U;
    /* renamed from: V */
    boolean f4713V;
    /* renamed from: W */
    SurfaceHolder f4714W;
    /* renamed from: Z */
    int f4715Z;
    /* renamed from: a */
    float f4716a;
    /* renamed from: aA */
    int f4717aA;
    /* renamed from: aB */
    int f4718aB;
    /* renamed from: aC */
    float f4719aC;
    /* renamed from: aD */
    float f4720aD;
    /* renamed from: aE */
    PianoPlay f4721aE;
    /* renamed from: aF */
    int f4722aF;
    /* renamed from: aG */
    boolean f4723aG;
    /* renamed from: aH */
    float f4724aH;
    /* renamed from: aI */
    float f4725aI;
    /* renamed from: aJ */
    int f4726aJ;
    /* renamed from: aK */
    int f4727aK;
    /* renamed from: aL */
    boolean f4728aL;
    /* renamed from: aM */
    int f4729aM;
    /* renamed from: aN */
    int f4730aN;
    /* renamed from: aO */
    int f4731aO;
    /* renamed from: aQ */
    float f4732aQ;
    /* renamed from: aR */
    Message f4733aR;
    /* renamed from: aS */
    String f4734aS;
    /* renamed from: aT */
    C1030by f4735aT;
    /* renamed from: aU */
    float f4736aU;
    /* renamed from: aV */
    float f4737aV;
    /* renamed from: aW */
    float f4738aW;
    /* renamed from: aX */
    float f4739aX;
    /* renamed from: aY */
    int f4740aY;
    /* renamed from: aZ */
    int f4741aZ;
    /* renamed from: aa */
    int f4742aa;
    /* renamed from: ab */
    int f4743ab;
    /* renamed from: ac */
    int f4744ac;
    /* renamed from: ad */
    int f4745ad;
    /* renamed from: ae */
    int f4746ae;
    /* renamed from: af */
    int f4747af;
    /* renamed from: ag */
    Paint f4748ag;
    /* renamed from: ah */
    Paint f4749ah;
    /* renamed from: ai */
    float f4750ai;
    /* renamed from: aj */
    int f4751aj;
    /* renamed from: ak */
    String f4752ak;
    /* renamed from: al */
    String f4753al;
    /* renamed from: am */
    int f4754am;
    /* renamed from: an */
    ArrayList f4755an;
    /* renamed from: ao */
    ArrayList f4756ao;
    /* renamed from: ap */
    C1267ks f4757ap;
    /* renamed from: aq */
    String f4758aq;
    /* renamed from: ar */
    String f4759ar;
    /* renamed from: as */
    double f4760as;
    /* renamed from: at */
    boolean f4761at;
    /* renamed from: au */
    int f4762au;
    /* renamed from: av */
    int f4763av;
    /* renamed from: aw */
    Context f4764aw;
    /* renamed from: ax */
    String f4765ax;
    /* renamed from: ay */
    RectF f4766ay;
    /* renamed from: az */
    Paint f4767az;
    /* renamed from: b */
    int f4768b;
    /* renamed from: bA */
    private Rect f4769bA;
    /* renamed from: bB */
    private Rect f4770bB;
    /* renamed from: bC */
    private RectF f4771bC;
    /* renamed from: bD */
    private RectF f4772bD;
    /* renamed from: bE */
    private Rect f4773bE;
    /* renamed from: bF */
    private RectF f4774bF;
    /* renamed from: bG */
    private int f4775bG;
    /* renamed from: ba */
    JPApplication f4776ba;
    /* renamed from: bb */
    ArrayList f4777bb;
    /* renamed from: bc */
    public boolean f4778bc;
    /* renamed from: bd */
    byte[] f4779bd;
    /* renamed from: be */
    int f4780be;
    /* renamed from: bf */
    List f4781bf;
    /* renamed from: bg */
    float f4782bg;
    /* renamed from: bh */
    float f4783bh;
    /* renamed from: bi */
    float f4784bi;
    /* renamed from: bj */
    int f4785bj;
    /* renamed from: bk */
    int f4786bk;
    /* renamed from: bl */
    int f4787bl;
    /* renamed from: bm */
    ArrayList f4788bm;
    /* renamed from: bn */
    public int f4789bn;
    /* renamed from: bo */
    public Bitmap f4790bo;
    /* renamed from: bp */
    private int[] f4791bp;
    /* renamed from: bq */
    private int[] f4792bq;
    /* renamed from: br */
    private int[] f4793br;
    /* renamed from: bs */
    private int[] f4794bs;
    /* renamed from: bt */
    private int f4795bt;
    /* renamed from: bu */
    private int f4796bu;
    /* renamed from: bv */
    private C1266kr f4797bv;
    /* renamed from: bw */
    private C1030by f4798bw;
    /* renamed from: bx */
    private Paint f4799bx;
    /* renamed from: by */
    private int f4800by;
    /* renamed from: bz */
    private Rect f4801bz;
    /* renamed from: c */
    Bitmap f4802c;
    /* renamed from: d */
    Bitmap f4803d;
    /* renamed from: e */
    Paint f4804e;
    /* renamed from: f */
    float f4805f;
    /* renamed from: g */
    float f4806g;
    /* renamed from: h */
    float f4807h;
    /* renamed from: i */
    float f4808i;
    /* renamed from: j */
    float f4809j;
    /* renamed from: k */
    float f4810k;
    /* renamed from: l */
    float f4811l;
    /* renamed from: m */
    int f4812m;
    /* renamed from: n */
    int f4813n;
    /* renamed from: o */
    Bitmap f4814o;
    /* renamed from: p */
    Bitmap f4815p;
    /* renamed from: q */
    Bitmap f4816q;
    /* renamed from: r */
    Bitmap f4817r;
    /* renamed from: s */
    Bitmap f4818s;
    /* renamed from: t */
    Bitmap f4819t;
    /* renamed from: u */
    Bitmap f4820u;
    /* renamed from: v */
    Bitmap f4821v;
    /* renamed from: w */
    Bitmap f4822w;
    /* renamed from: x */
    Bitmap f4823x;
    /* renamed from: y */
    Bitmap f4824y;
    /* renamed from: z */
    Bitmap f4825z;

    public PlayView(JPApplication jPApplication, Context context, String str, PianoPlay pianoPlay, double d, int i, int i2, int i3, int i4) {
        super(context);
        this.f4716a = 0.0f;
        this.f4768b = 0;
        this.f4811l = 0.0f;
        this.f4812m = 0;
        this.f4813n = 0;
        this.f4701I = 0;
        this.f4704L = 4;
        this.f4705M = 0.0f;
        this.f4706N = 0;
        this.f4707O = 10.0f;
        this.f4710S = false;
        this.f4711T = true;
        this.f4712U = true;
        this.f4713V = true;
        this.f4795bt = 0;
        this.f4715Z = 0;
        this.f4742aa = 0;
        this.f4743ab = 0;
        this.f4744ac = 0;
        this.f4745ad = 0;
        this.f4746ae = 0;
        this.f4747af = 0;
        this.f4749ah = new Paint();
        this.f4750ai = 0.0f;
        this.f4751aj = 15;
        this.f4752ak = "FPS:";
        this.f4753al = "SCORE:";
        this.f4754am = -1;
        this.f4755an = new ArrayList();
        this.f4756ao = new ArrayList();
        this.f4758aq = "";
        this.f4759ar = "";
        this.f4760as = 0.0d;
        this.f4761at = false;
        this.f4767az = new Paint();
        this.f4718aB = 0;
        this.f4722aF = 256;
        this.f4723aG = false;
        this.f4726aJ = -1;
        this.f4727aK = 0;
        this.f4728aL = false;
        this.f4729aM = 0;
        this.f4733aR = new Message();
        this.f4734aS = "";
        this.f4740aY = 0;
        this.f4741aZ = 0;
        this.f4778bc = true;
        this.f4780be = 0;
        this.f4781bf = new ArrayList();
        this.f4783bh = 0.0f;
        this.f4784bi = 10.0f;
        this.f4785bj = 0;
        this.f4786bk = 0;
        this.f4787bl = 0;
        this.f4788bm = new ArrayList();
        this.f4789bn = 0;
        this.f4789bn = (i3 + 12) % 2;
        this.f4776ba = jPApplication;
        this.f4701I = i2;
        this.f4764aw = context;
        this.f4775bG = i4;
        this.f4804e = new Paint();
        this.f4804e.setColor(Color.argb(178, 244, 255, 64));
        this.f4804e.setStrokeWidth(3.0f);
        if (this.f4803d == null) {
            m3813a();
        }
        this.f4732aQ = jPApplication.mo2748w();
        float b = (float) jPApplication.mo2713b();
        this.f4736aU = ((((12.0f * b) * 10.0f) * ((float) this.f4824y.getHeight())) / this.f4784bi) / 16.0f;
        this.f4737aV = ((((32.0f * b) * 10.0f) * ((float) this.f4824y.getHeight())) / this.f4784bi) / 16.0f;
        this.f4738aW = ((((62.0f * b) * 10.0f) * ((float) this.f4824y.getHeight())) / this.f4784bi) / 16.0f;
        this.f4739aX = ((((b * 100.0f) * 10.0f) * ((float) this.f4824y.getHeight())) / this.f4784bi) / 16.0f;
        this.f4767az.setARGB(100, 200, 250, 100);
        this.f4765ax = str;
        this.f4721aE = pianoPlay;
        this.f4760as = d;
        this.f4706N = i;
        m3816b();
        this.f4766ay = new RectF(0.0f, 0.0f, (float) jPApplication.mo2693I(), 20.0f);
        jPApplication.mo2705a(0.0f);
        try {
            m3814a(context, str);
            this.f4800by = this.f4755an.size();
        } catch (Exception e) {
            ((Activity) context).finish();
        }
    }

    public PlayView(JPApplication jPApplication, byte[] bArr, Context context, PianoPlay pianoPlay, double d, int i, String str) {
        super(context);
        this.f4716a = 0.0f;
        this.f4768b = 0;
        this.f4811l = 0.0f;
        this.f4812m = 0;
        this.f4813n = 0;
        this.f4701I = 0;
        this.f4704L = 4;
        this.f4705M = 0.0f;
        this.f4706N = 0;
        this.f4707O = 10.0f;
        this.f4710S = false;
        this.f4711T = true;
        this.f4712U = true;
        this.f4713V = true;
        this.f4795bt = 0;
        this.f4715Z = 0;
        this.f4742aa = 0;
        this.f4743ab = 0;
        this.f4744ac = 0;
        this.f4745ad = 0;
        this.f4746ae = 0;
        this.f4747af = 0;
        this.f4749ah = new Paint();
        this.f4750ai = 0.0f;
        this.f4751aj = 15;
        this.f4752ak = "FPS:";
        this.f4753al = "SCORE:";
        this.f4754am = -1;
        this.f4755an = new ArrayList();
        this.f4756ao = new ArrayList();
        this.f4758aq = "";
        this.f4759ar = "";
        this.f4760as = 0.0d;
        this.f4761at = false;
        this.f4767az = new Paint();
        this.f4718aB = 0;
        this.f4722aF = 256;
        this.f4723aG = false;
        this.f4726aJ = -1;
        this.f4727aK = 0;
        this.f4728aL = false;
        this.f4729aM = 0;
        this.f4733aR = new Message();
        this.f4734aS = "";
        this.f4740aY = 0;
        this.f4741aZ = 0;
        this.f4778bc = true;
        this.f4780be = 0;
        this.f4781bf = new ArrayList();
        this.f4783bh = 0.0f;
        this.f4784bi = 10.0f;
        this.f4785bj = 0;
        this.f4786bk = 0;
        this.f4787bl = 0;
        this.f4788bm = new ArrayList();
        this.f4789bn = 0;
        this.f4701I = 1;
        this.f4764aw = context;
        this.f4776ba = jPApplication;
        if (this.f4803d == null) {
            m3813a();
        }
        this.f4732aQ = jPApplication.mo2748w();
        int b = jPApplication.mo2713b();
        this.f4736aU = (((float) (((b * 12) * 10) * this.f4824y.getHeight())) / this.f4784bi) / 16.0f;
        this.f4737aV = (((float) (((b * 32) * 10) * this.f4824y.getHeight())) / this.f4784bi) / 16.0f;
        this.f4738aW = (((float) (((b * 62) * 10) * this.f4824y.getHeight())) / this.f4784bi) / 16.0f;
        this.f4739aX = (((float) (((b * 100) * 10) * this.f4824y.getHeight())) / this.f4784bi) / 16.0f;
        this.f4804e = new Paint();
        this.f4804e.setColor(Color.argb(178, 244, 255, 64));
        this.f4804e.setStrokeWidth(3.0f);
        this.f4767az.setARGB(100, 200, 250, 100);
        this.f4721aE = pianoPlay;
        this.f4760as = d;
        this.f4706N = i;
        this.f4734aS = str;
        m3816b();
        this.f4766ay = new RectF(0.0f, 0.0f, (float) jPApplication.mo2693I(), 20.0f);
        jPApplication.mo2705a(0.0f);
        m3815a(jPApplication, bArr);
        this.f4800by = this.f4755an.size();
    }

    /* renamed from: a */
    private void m3813a() {
        this.f4803d = this.f4776ba.mo2714b("bar");
        this.f4823x = this.f4776ba.mo2714b("combo");
        if (this.f4776ba.mo2692H() >= 1440) {
            this.f4790bo = this.f4776ba.mo2714b("key_board_hd");
            this.f4802c = this.f4776ba.mo2714b("background_hd");
            this.f4817r = this.f4776ba.mo2714b("perfect_img");
            this.f4820u = this.f4776ba.mo2714b("cool_img");
            this.f4821v = this.f4776ba.mo2714b("great_img");
            this.f4822w = this.f4776ba.mo2714b("bad_img");
            this.f4816q = this.f4776ba.mo2714b("miss_img");
            this.f4819t = this.f4776ba.mo2714b("max_img");
            this.f4818s = this.f4776ba.mo2714b("x_img");
            this.f4814o = this.f4776ba.mo2714b("score");
            this.f4815p = this.f4776ba.mo2714b("number");
            this.f4824y = this.f4776ba.mo2714b("white_note_hd");
            this.f4825z = this.f4776ba.mo2714b("black_note_hd");
            this.f4693A = this.f4776ba.mo2714b("play_note_hd");
            this.f4694B = this.f4776ba.mo2714b("play_note_hd");
        } else if (this.f4776ba.mo2692H() >= 1080 && this.f4776ba.mo2692H() < 1440) {
            this.f4790bo = this.f4776ba.mo2714b("key_board_hd");
            this.f4802c = this.f4776ba.mo2714b("background_hd");
            this.f4817r = this.f4776ba.mo2714b("perfect_img");
            this.f4820u = this.f4776ba.mo2714b("cool_img");
            this.f4821v = this.f4776ba.mo2714b("great_img");
            this.f4822w = this.f4776ba.mo2714b("bad_img");
            this.f4816q = this.f4776ba.mo2714b("miss_img");
            this.f4819t = this.f4776ba.mo2714b("max_img");
            this.f4818s = this.f4776ba.mo2714b("x_img");
            this.f4814o = this.f4776ba.mo2714b("score");
            this.f4815p = this.f4776ba.mo2714b("number");
            this.f4824y = this.f4776ba.mo2714b("white_note_hd");
            this.f4825z = this.f4776ba.mo2714b("black_note_hd");
            this.f4693A = this.f4776ba.mo2714b("play_note_hd");
            this.f4694B = this.f4776ba.mo2714b("play_note_hd");
        } else if (this.f4776ba.mo2692H() < 1080 || this.f4776ba.mo2692H() >= 1080) {
            this.f4790bo = this.f4776ba.mo2714b("key_board_hd");
            this.f4802c = this.f4776ba.mo2714b("background_hd");
            this.f4817r = this.f4776ba.mo2714b("perfect_img");
            this.f4820u = this.f4776ba.mo2714b("cool_img");
            this.f4821v = this.f4776ba.mo2714b("great_img");
            this.f4822w = this.f4776ba.mo2714b("bad_img");
            this.f4816q = this.f4776ba.mo2714b("miss_img");
            this.f4819t = this.f4776ba.mo2714b("max_img");
            this.f4818s = this.f4776ba.mo2714b("x_img");
            this.f4814o = this.f4776ba.mo2714b("score");
            this.f4815p = this.f4776ba.mo2714b("number");
            this.f4824y = this.f4776ba.mo2714b("white_note_hd");
            this.f4825z = this.f4776ba.mo2714b("black_note_hd");
            this.f4693A = this.f4776ba.mo2714b("play_note_hd");
            this.f4694B = this.f4776ba.mo2714b("play_note_hd");
        } else {
            this.f4790bo = this.f4776ba.mo2714b("key_board_hd");
            this.f4802c = this.f4776ba.mo2714b("background_hd");
            this.f4817r = this.f4776ba.mo2714b("perfect_img");
            this.f4820u = this.f4776ba.mo2714b("cool_img");
            this.f4821v = this.f4776ba.mo2714b("great_img");
            this.f4822w = this.f4776ba.mo2714b("bad_img");
            this.f4816q = this.f4776ba.mo2714b("miss_img");
            this.f4819t = this.f4776ba.mo2714b("max_img");
            this.f4818s = this.f4776ba.mo2714b("x_img");
            this.f4814o = this.f4776ba.mo2714b("score");
            this.f4815p = this.f4776ba.mo2714b("number");
            this.f4824y = this.f4776ba.mo2714b("white_note_hd");
            this.f4825z = this.f4776ba.mo2714b("black_note_hd");
            this.f4693A = this.f4776ba.mo2714b("play_note_hd");
            this.f4694B = this.f4776ba.mo2714b("play_note_hd");
        }
        this.f4695C = this.f4776ba.mo2714b("white_r");
        this.f4696D = this.f4776ba.mo2714b("white_m");
        this.f4697E = this.f4776ba.mo2714b("white_l");
        this.f4698F = this.f4776ba.mo2714b("black");
        this.f4699G = this.f4776ba.mo2714b("fire");
        this.f4700H = this.f4776ba.mo2714b("keyboard_long");
        this.f4702J = this.f4776ba.mo2714b("progress_bar");
        this.f4703K = this.f4776ba.mo2714b("progress_bar_base");
        Bitmap bitmap = this.f4824y;
        Matrix matrix = new Matrix();
        float NOTESIZE = this.f4776ba.NOTESIZE();
        matrix.postScale(NOTESIZE, NOTESIZE);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f4824y = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        this.f4825z = Bitmap.createBitmap(this.f4825z, 0, 0, width, height, matrix, true);
        this.f4693A = Bitmap.createBitmap(this.f4693A, 0, 0, width, height, matrix, true);
        this.f4716a = (float) this.f4824y.getHeight();
        if (this.f4776ba.mo2712a()) {
            if (this.f4776ba.mo2692H() >= 1440) {
                this.f4707O = 15.0f;
            } else if (this.f4776ba.mo2692H() >= 1080 && this.f4776ba.mo2692H() < 1440) {
                this.f4707O = 12.5f;
            } else if (this.f4776ba.mo2692H() <= 1080) {
                this.f4707O = 10.0f;
            }
            this.f4784bi = this.f4776ba.mo2734l();
        } else if (this.f4776ba.mo2692H() >= 1440) {
            this.f4707O = 15.0f;
            this.f4784bi = this.f4776ba.mo2734l();
        } else if (this.f4776ba.mo2692H() >= 1080 && this.f4776ba.mo2692H() < 1440) {
            this.f4707O = 12.5f;
            this.f4784bi = this.f4776ba.mo2734l();
        } else if (this.f4776ba.mo2692H() <= 1080) {
            this.f4707O = 10.0f;
            this.f4784bi = this.f4776ba.mo2734l();
        }
        this.f4776ba.mo2715b((float) (this.f4776ba.mo2693I() / 8));
        this.f4776ba.mo2717c(((float) (this.f4776ba.mo2692H() / 2)) - (this.f4707O * 2.0f));
        this.f4776ba.mo2721d(((float) (this.f4776ba.mo2692H() / 2)) - this.f4707O);
        this.f4776ba.mo2724e((float) ((this.f4776ba.mo2692H() * 10) / 34));
        this.f4776ba.mo2727f((float) (((this.f4776ba.mo2692H() - 35) * 10) / 34));
        this.f4776ba.mo2729g((float) ((this.f4776ba.mo2693I() * 3) / 80));
        this.f4776ba.mo2730h(((float) (this.f4776ba.mo2692H() / 2)) - this.f4707O);
    }

    /* renamed from: a */
    private void m3814a(Context context, String str) {
        int i;
        this.f4797bv = new C1266kr(context, str);
        this.f4791bp = this.f4797bv.mo3454b();
        this.f4792bq = this.f4797bv.mo3453a();
        this.f4793br = this.f4797bv.mo3455c();
        this.f4794bs = this.f4797bv.mo3456d();
        this.f4750ai = this.f4797bv.mo3459g();
        f4691R = this.f4797bv.mo3458f();
        String h = this.f4797bv.mo3460h();
        this.f4758aq = h;
        this.f4759ar = h;
        this.f4718aB = (int) this.f4797bv.mo3457e();
        int length = this.f4791bp.length;
        this.f4796bu = length;
        int[] iArr = this.f4792bq;
        int i2 = OLPlayRoom.diao;
        for (i = 0; i < length; i++) {
            iArr[i] = iArr[i] + i2;
        }
        this.f4749ah.setColor(-1);
        this.f4749ah.setAntiAlias(true);
        int i3 = 0;
        if (this.f4718aB <= 0) {
            this.f4718aB = this.f4722aF + this.f4718aB;
        }
        if (f4691R <= 0) {
            f4691R = this.f4722aF + f4691R;
        }
        if (this.f4791bp[0] < 0) {
            this.f4795bt = this.f4722aF + this.f4791bp[0];
        }
        if (this.f4791bp[0] == 0) {
            this.f4795bt = 3;
        }
        length = 0;
        while (true) {
            int i4 = length;
            if (i4 < this.f4796bu) {
                this.f4795bt += this.f4791bp[i4];
                float w = this.f4776ba.mo2748w();
                this.f4719aC = ((((float) 0) - (((((float) (this.f4795bt * this.f4718aB)) / this.f4776ba.mo2732j()) * ((float) this.f4776ba.mo2713b())) / (((float) this.f4776ba.mo2713b()) * this.f4784bi))) / ((float) this.f4776ba.mo2713b())) * ((float) this.f4776ba.mo2713b());
                f4692aP = (double) Math.abs(this.f4719aC);
                if (this.f4793br[i4] != this.f4789bn) {
                    this.f4798bw = new C1030by(this.f4776ba, this, this.f4792bq[i4], this.f4793br[i4], (float) this.f4794bs[i4], this.f4719aC, i3, this.f4711T, false, this.f4716a, this.f4789bn);
                    this.f4755an.add(this.f4798bw);
                    this.f4711T = true;
                } else if (this.f4720aD < this.f4719aC) {
                    this.f4798bw = new C1030by(this.f4776ba, this, this.f4792bq[i4], this.f4793br[i4], (float) this.f4794bs[i4], this.f4719aC, i3, this.f4711T, false, this.f4716a, this.f4789bn);
                    this.f4755an.add(this.f4798bw);
                    this.f4711T = true;
                } else {
                    if ((88.0f - this.f4719aC) * this.f4784bi >= 150.0f) {
                        this.f4711T = false;
                    }
                    length = this.f4795bt;
                    this.f4720aD = this.f4719aC;
                    this.f4715Z++;
                    if (this.f4792bq[i4] < i3 * 12 || this.f4792bq[i4] > (i3 * 12) + 12) {
                        i3 = this.f4792bq[i4] / 12;
                    }
                    JPApplication jPApplication = this.f4776ba;
                    i = this.f4792bq[i4];
                    int i5 = this.f4793br[i4];
                    float f = (float) this.f4794bs[i4];
                    float f2 = this.f4719aC;
                    boolean z = this.f4711T;
                    i2 = this.f4718aB;
                    this.f4776ba.mo2732j();
                    this.f4798bw = new C1030by(jPApplication, this, i, i5, f, f2, i3, z, this.f4723aG, this.f4716a, this.f4789bn);
                    this.f4723aG = false;
                    length = this.f4795bt;
                    this.f4755an.add(this.f4798bw);
                    this.f4711T = true;
                }
                length = i4 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m3815a(JPApplication jPApplication, byte[] bArr) {
        this.f4797bv = new C1266kr(bArr);
        this.f4791bp = this.f4797bv.mo3454b();
        this.f4792bq = this.f4797bv.mo3453a();
        this.f4793br = this.f4797bv.mo3455c();
        this.f4794bs = this.f4797bv.mo3456d();
        this.f4750ai = this.f4797bv.mo3459g();
        f4691R = this.f4797bv.mo3458f();
        this.f4758aq = this.f4797bv.mo3460h();
        this.f4718aB = (int) this.f4797bv.mo3457e();
        this.f4796bu = this.f4791bp.length;
        this.f4749ah.setColor(-1);
        this.f4749ah.setAntiAlias(true);
        int i = 0;
        if (this.f4718aB <= 0) {
            this.f4718aB = this.f4722aF + this.f4718aB;
        }
        if (f4691R <= 0) {
            f4691R = this.f4722aF + f4691R;
        }
        if (this.f4791bp[0] < 0) {
            this.f4795bt = this.f4722aF + this.f4791bp[0];
        }
        if (this.f4791bp[0] == 0) {
            this.f4795bt = 3;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.f4796bu) {
                this.f4795bt += this.f4791bp[i3];
                float w = jPApplication.mo2748w();
                this.f4719aC = ((((float) 0) - (((((float) (this.f4795bt * this.f4718aB)) / jPApplication.mo2732j()) * ((float) jPApplication.mo2713b())) / (((float) jPApplication.mo2713b()) * this.f4784bi))) / ((float) jPApplication.mo2713b())) * ((float) jPApplication.mo2713b());
                f4692aP = (double) Math.abs(this.f4719aC);
                if (this.f4793br[i3] != this.f4789bn) {
                    this.f4798bw = new C1030by(jPApplication, this, this.f4792bq[i3], this.f4793br[i3], (float) this.f4794bs[i3], this.f4719aC, i, this.f4711T, false, this.f4716a, this.f4789bn);
                    this.f4755an.add(this.f4798bw);
                    this.f4711T = true;
                } else if (this.f4720aD < this.f4719aC) {
                    this.f4798bw = new C1030by(jPApplication, this, this.f4792bq[i3], this.f4793br[i3], (float) this.f4794bs[i3], this.f4719aC, i, this.f4711T, false, this.f4716a, this.f4789bn);
                    this.f4755an.add(this.f4798bw);
                    this.f4711T = true;
                } else {
                    if ((88.0f - this.f4719aC) * this.f4784bi >= 150.0f) {
                        this.f4711T = false;
                    }
                    i2 = this.f4795bt;
                    this.f4720aD = this.f4719aC;
                    this.f4715Z++;
                    if (this.f4792bq[i3] < i * 12 || this.f4792bq[i3] > (i * 12) + 12) {
                        i = this.f4792bq[i3] / 12;
                    }
                    int i4 = this.f4792bq[i3];
                    int i5 = this.f4793br[i3];
                    float f = (float) this.f4794bs[i3];
                    float f2 = this.f4719aC;
                    boolean z = this.f4711T;
                    int i6 = this.f4718aB;
                    jPApplication.mo2732j();
                    this.f4798bw = new C1030by(jPApplication, this, i4, i5, f, f2, i, z, this.f4723aG, this.f4716a, this.f4789bn);
                    this.f4723aG = false;
                    i2 = this.f4795bt;
                    this.f4755an.add(this.f4798bw);
                    this.f4711T = true;
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m3816b() {
        this.f4762au = this.f4776ba.mo2693I();
        this.f4763av = this.f4776ba.mo2692H();
        this.f4805f = (float) (this.f4776ba.mo2693I() / 8);
        this.f4806g = (float) ((this.f4776ba.mo2693I() * 2) / 8);
        this.f4807h = (float) ((this.f4776ba.mo2693I() * 4) / 8);
        this.f4808i = (float) ((this.f4776ba.mo2693I() * 5) / 8);
        this.f4809j = (float) ((this.f4776ba.mo2693I() * 6) / 8);
        this.f4810k = (float) this.f4776ba.mo2693I();
        this.f4782bg = ((float) this.f4776ba.mo2713b()) * this.f4784bi;
        int H = this.f4776ba.mo2692H();
        this.f4720aD = (float) 0;
        this.f4730aN = this.f4702J.getHeight();
        this.f4731aO = this.f4702J.getWidth();
        this.f4783bh = this.f4776ba.mo2751z();
        //"playBar_Y" + this.f4783bh;
        this.f4714W = getHolder();
        this.f4714W.addCallback(this);
        this.f4714W.setKeepScreenOn(true);
        this.f4799bx = new Paint();
        this.f4799bx.setColor(-1);
        this.f4748ag = new Paint();
        this.f4748ag.setARGB(150, 244, 178, 64);
        this.f4748ag.setAntiAlias(true);
        this.f4748ag.setTextAlign(Align.CENTER);
        this.f4748ag.setTypeface(Typeface.DEFAULT_BOLD);
        this.f4748ag.setTextSize(20.0f);
        this.f4801bz = new Rect();
        this.f4769bA = new Rect();
        this.f4772bD = new RectF();
        this.f4773bE = new Rect();
        this.f4774bF = new RectF();
        this.f4770bB = new Rect();
        this.f4771bC = new RectF();
        this.f4779bd = new byte[this.f4775bG];
        this.f4777bb = new ArrayList();
    }

    /* renamed from: b */
    private void m3817b(int i) {
        int i2;
        int i3;
        if (i == this.f4812m) {
            boolean z;
            int i4;
            this.f4778bc = true;
            double abs = Math.abs((((double) this.f4811l) + (((double) this.f4716a) * 0.5d)) - (((double) this.f4732aQ) - (((double) this.f4707O) * 0.5d)));
            int E = this.f4776ba.mo2689E();
            JPApplication jPApplication = this.f4776ba;
            if (E == 1 && ((C1030by) this.f4755an.get(this.f4717aA)).f5215h <= this.f4776ba.mo2747v()) {
                this.f4776ba.mo2705a((float) ((int) (this.f4776ba.mo2747v() - ((C1030by) this.f4755an.get(this.f4717aA)).f5217j)));
            }
            if (this.f4728aL) {
                this.f4740aY = 0;
                this.f4747af++;
                z = true;
                i4 = -5;
            } else if (abs < ((double) this.f4736aU)) {
                this.f4740aY++;
                this.f4742aa++;
                i4 = 10;
                z = true;
            } else if (abs <= ((double) this.f4737aV) && abs >= ((double) this.f4736aU)) {
                this.f4740aY = 0;
                this.f4743ab++;
                i4 = 8;
                z = true;
            } else if (abs <= ((double) this.f4738aW) && abs > ((double) this.f4737aV)) {
                z = true;
                this.f4740aY = 0;
                i4 = 5;
                this.f4744ac++;
            } else if (abs <= ((double) this.f4738aW) || abs > ((double) this.f4739aX)) {
                this.f4740aY = 0;
                this.f4747af++;
                z = true;
                i4 = -5;
            } else {
                this.f4740aY = 0;
                z = true;
                this.f4746ae++;
                i4 = 2;
            }
            this.f4728aL = true;
            if(z!=true)
                i2=0;
            else
                i2=1;
            i3 = i4;
        } else {
            this.f4740aY = 0;
            this.f4747af++;
            i2 = -1;
            i3 = -5;
        }
        this.f4768b++;
        if (this.f4740aY - 1 > this.f4741aZ) {
            this.f4741aZ = this.f4740aY - 1;
        }
        this.f4757ap.mo3461a(new C1265kq(i2, this, this.f4740aY, this.f4762au, this.f4763av), i3, this.f4740aY);
        byte b = (byte) (i2 + 1);
        this.f4777bb.add(Byte.valueOf(b));
        if (this.f4701I == 2) {
            this.f4779bd[this.f4780be] = b;
            if (this.f4780be < this.f4775bG - 1) {
                this.f4780be++;
                return;
            }
            this.f4721aE.mo2904a((byte) 25, this.f4721aE.f4586E, "", this.f4779bd);
            this.f4780be = 0;
        }
    }

    /* renamed from: a */
    public final int mo2927a(float f, float f2) {
        int i = 1;
        float w = this.f4776ba.mo2748w() + this.f4776ba.mo2749x();
        if (f2 >= this.f4776ba.mo2748w()) {
            if (f2 <= w) {
                if (Math.abs(this.f4805f - f) < this.f4776ba.mo2750y()) {
                    return 1;
                }
                if (Math.abs(this.f4806g - f) < this.f4776ba.mo2750y()) {
                    return 3;
                }
                if (Math.abs(this.f4807h - f) < this.f4776ba.mo2750y()) {
                    return 6;
                }
                if (Math.abs(this.f4808i - f) < this.f4776ba.mo2750y()) {
                    return 8;
                }
                if (Math.abs(this.f4809j - f) < this.f4776ba.mo2750y()) {
                    return 10;
                }
                if (Math.abs(this.f4810k - f) < this.f4776ba.mo2750y()) {
                    return 12;
                }
            }
            if (f2 >= this.f4776ba.mo2748w()) {
                while (i < 9) {
                    if (f >= ((float) (i - 1)) * this.f4776ba.mo2746u() && f < ((float) i) * this.f4776ba.mo2746u()) {
                        switch (i) {
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
                    i++;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo2928a(int i) {
        int i2 = i + (this.f4704L * 12);
        if (i > -2) {
            int a;
            int q = i + ((this.f4704L + this.f4776ba.mo2742q()) * 12);
            if (this.f4776ba.mo2735m()) {
                float f = this.f4705M;
                if (i > 6) {
                    f = (f * ((float) (12 - i))) / 6.0f;
                }
                float f2 = this.f4705M;
                if (i < 6) {
                    f2 = (f2 * ((float) i)) / 6.0f;
                }
                JPApplication jPApplication = this.f4776ba;
                a = JPApplication.m3518a(q, f, f2);
            } else {
                a = this.f4776ba.mo2703a(q, this.f4705M);
            }
            m3817b(i2);
            return a;
        }
        m3817b(i2);
        return -i;
    }

    /* renamed from: a */
    public final void mo2929a(Canvas canvas) {
        int size = ((this.f4800by - this.f4755an.size()) * (this.f4776ba.mo2693I() - 2)) / this.f4800by;
        if (canvas != null) {
            if (this.f4776ba.mo2736n()) {
                this.f4773bE.set(0, 0, this.f4731aO, this.f4730aN);
                this.f4774bF.set(0.0f, 30.0f, (float) size, 35.0f);
                canvas.drawBitmap(this.f4702J, this.f4773bE, this.f4774bF, this.f4748ag);
            } else {
                this.f4773bE.set(0, 0, this.f4731aO, this.f4730aN);
                this.f4774bF.set(0.0f, 0.0f, (float) this.f4776ba.mo2693I(), (float) this.f4730aN);
                canvas.drawBitmap(this.f4703K, null, this.f4774bF, this.f4767az);
                this.f4774bF.set(0.0f, 0.0f, (float) size, (float) this.f4730aN);
                canvas.drawBitmap(this.f4702J, this.f4773bE, this.f4774bF, this.f4748ag);
            }
        }
        if (this.f4755an.size() == 0) {
            this.f4721aE.f4617h = false;
            this.f4710S = false;
            JSONObject jSONObject = new JSONObject();
            this.f4721aE.f4620k = true;
            int size2;
            byte[] bArr;
            Message message;
            if (this.f4701I == 3) {
                size2 = this.f4777bb.size();
                bArr = new byte[size2];
                for (size = 0; size < size2; size++) {
                    bArr[size] = ((Byte) this.f4777bb.get(size)).byteValue();
                }
                try {
                    jSONObject.put("S", C1340nk.m4154a(new String(bArr, "UTF-8")));
                    jSONObject.put("N", this.f4759ar);
                    String str = this.f4759ar;
                    jSONObject.put("T", 2);
                    this.f4721aE.mo2904a((byte) 40, (byte) 0, jSONObject.toString(), null);
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } else if (this.f4701I == 2) {
                message = new Message();
                message.what = 8;
                this.f4721aE.f4590I.handleMessage(message);
                size2 = this.f4777bb.size();
                bArr = new byte[size2];
                for (size = 0; size < size2; size++) {
                    bArr[size] = ((Byte) this.f4777bb.get(size)).byteValue();
                }
                try {
                    jSONObject.put("S", C1340nk.m4154a(new String(bArr, "UTF-8")));
                    this.f4721aE.mo2904a((byte) 5, (byte) 0, jSONObject.toString(), null);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            } else {
                if (this.f4721aE.f4588G) {
                    message = new Message();
                    message.what = 22;
                    this.f4721aE.f4590I.handleMessage(message);
                }
                Intent intent = new Intent();
                intent.setClass(this.f4764aw, PlayFinish.class);
                intent.putExtra("head", this.f4701I);
                intent.putExtra("topScore", this.f4706N);
                intent.putExtra("perf", this.f4742aa);
                size2 = this.f4777bb.size();
                bArr = new byte[size2];
                for (size = 0; size < size2; size++) {
                    bArr[size] = ((Byte) this.f4777bb.get(size)).byteValue();
                }
                intent.putExtra("scoreArray", bArr);
                intent.putExtra("totalScore", this.f4757ap.f5844b);
                intent.putExtra("combo_scr", this.f4757ap.f5845c);
                intent.putExtra("cool", this.f4743ab);
                intent.putExtra("great", this.f4744ac);
                intent.putExtra("bad", this.f4746ae);
                intent.putExtra("miss", this.f4747af);
                intent.putExtra("name", this.f4758aq);
                intent.putExtra("songID", this.f4734aS);
                intent.putExtra("path", this.f4765ax);
                intent.putExtra("nandu", this.f4760as);
                intent.putExtra("top_combo", this.f4741aZ);
                this.f4721aE.startActivityForResult(intent, size2);
            }
        }
    }

    /* renamed from: b */
    public final void mo2930b(Canvas canvas) {
        int E;
        int i;
        int i2;
        int i3;
        this.f4781bf.clear();
        this.f4712U = true;
        this.f4713V = true;
        Iterator it = this.f4755an.iterator();
        while (it.hasNext()) {
            C1030by c1030by = (C1030by) it.next();
            if (c1030by.f5215h <= this.f4783bh) {
                if (c1030by.f5209b == c1030by.f5221n && c1030by.f5215h < this.f4776ba.mo2748w() && this.f4712U) {
                    if (c1030by.f5199C) {
                        this.f4735aT = c1030by;
                        this.f4728aL = false;
                        c1030by.f5199C = false;
                    }
                    if (c1030by.f5215h + c1030by.mo3104a() > 0.0f) {
                        if (this.f4776ba.mo2737o() && canvas != null) {
                            canvas.drawLine(c1030by.mo3106b() + c1030by.f5214g, this.f4776ba.mo2747v(), c1030by.mo3106b() + c1030by.f5214g, c1030by.f5220m + c1030by.f5215h, this.f4804e);
                        }
                        if (this.f4776ba.f4078l) {
                            c1030by.f5211d = this.f4693A;
                        } else if (c1030by.f5215h >= this.f4776ba.mo2747v()) {
                            c1030by.f5211d = this.f4693A;
                        }
                    }
                    E = this.f4776ba.mo2689E();
                    JPApplication jPApplication = this.f4776ba;
                    if (E == 2 && c1030by.f5215h < this.f4776ba.mo2751z() && c1030by.f5215h >= this.f4776ba.mo2747v() && !this.f4728aL && !c1030by.f5198B) {
                        this.f4778bc = false;
                    }
                    this.f4717aA = this.f4755an.indexOf(c1030by);
                    this.f4812m = c1030by.f5208a;
                    if (!c1030by.f5198B) {
                        this.f4704L = c1030by.f5218k;
                    }
                    this.f4705M = c1030by.f5210c * 0.01f;
                    this.f4712U = false;
                }
                if (this.f4776ba.mo2736n() && c1030by.f5215h < this.f4776ba.mo2748w() && this.f4713V) {
                    this.f4813n = c1030by.f5208a;
                    this.f4713V = false;
                }
                if (this.f4701I > 0) {
                    if (c1030by.mo3107b(canvas) < 0.0f) {
                        break;
                    }
                } else if (c1030by.mo3108c(canvas) < 0.0f) {
                    break;
                }
            } else {
                this.f4781bf.add(c1030by);
            }
        }
        this.f4755an.removeAll(this.f4781bf);
        if (!(canvas == null || this.f4756ao == null || !this.f4776ba.mo2741p())) {
            try {
                Iterator it2 = this.f4756ao.iterator();
                while (it2.hasNext()) {
                    C1265kq c1265kq = (C1265kq) it2.next();
                    Rect rect = this.f4770bB;
                    RectF rectF = this.f4771bC;
                    if (c1265kq.f5825g != null) {
                        canvas.drawBitmap(c1265kq.f5825g, (float) (c1265kq.f5821c - (c1265kq.f5824f.f4817r.getWidth() / 2)), (float) c1265kq.f5822d, null);
                    }
                    if (c1265kq.f5823e > 1 && c1265kq.f5823e <= 9) {
                        canvas.drawBitmap(c1265kq.f5824f.f4818s, (float) (c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)), (float) c1265kq.f5822d, null);
                        rect.set((c1265kq.f5823e * c1265kq.f5824f.f4815p.getWidth()) / 10, 0, ((c1265kq.f5823e + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) ((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + (c1265kq.f5824f.f4815p.getWidth() / 10)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                    } else if (c1265kq.f5823e > 9 && c1265kq.f5823e <= 99) {
                        i = c1265kq.f5823e % 10;
                        i2 = c1265kq.f5823e / 10;
                        canvas.drawBitmap(c1265kq.f5824f.f4818s, (float) (c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)), (float) c1265kq.f5822d, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i2) / 10, 0, ((i2 + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) ((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + (c1265kq.f5824f.f4815p.getWidth() / 10)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i) / 10, 0, ((i + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + (c1265kq.f5824f.f4815p.getWidth() / 10)), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 2)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                    } else if (c1265kq.f5823e > 99 && c1265kq.f5823e <= 999) {
                        i = c1265kq.f5823e / 100;
                        i2 = (c1265kq.f5823e - (i * 100)) / 10;
                        i3 = c1265kq.f5823e % 10;
                        canvas.drawBitmap(c1265kq.f5824f.f4818s, (float) (c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)), (float) c1265kq.f5822d, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i) / 10, 0, ((i + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) ((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + (c1265kq.f5824f.f4815p.getWidth() / 10)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i2) / 10, 0, ((i2 + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + (c1265kq.f5824f.f4815p.getWidth() / 10)), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 2)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i3) / 10, 0, ((i3 + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 2)), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 3)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                    } else if (c1265kq.f5823e > 999 && c1265kq.f5823e <= 9999) {
                        i = c1265kq.f5823e / 1000;
                        i2 = (c1265kq.f5823e - (i * 1000)) / 100;
                        i3 = ((c1265kq.f5823e - (i * 1000)) - (i2 * 100)) / 10;
                        int i4 = c1265kq.f5823e % 10;
                        canvas.drawBitmap(c1265kq.f5824f.f4818s, (float) (c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)), (float) c1265kq.f5822d, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i) / 10, 0, ((i + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) ((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + (c1265kq.f5824f.f4815p.getWidth() / 10)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i2) / 10, 0, ((i2 + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + (c1265kq.f5824f.f4815p.getWidth() / 10)), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 2)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i3) / 10, 0, ((i3 + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 2)), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 3)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                        rect.set((c1265kq.f5824f.f4815p.getWidth() * i4) / 10, 0, ((i4 + 1) * c1265kq.f5824f.f4815p.getWidth()) / 10, c1265kq.f5824f.f4815p.getHeight());
                        rectF.set((float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 3)), (float) c1265kq.f5822d, (float) (((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()) + ((c1265kq.f5824f.f4815p.getWidth() / 10) * 4)), (float) (c1265kq.f5822d + c1265kq.f5824f.f4815p.getHeight()));
                        canvas.drawBitmap(c1265kq.f5824f.f4815p, rect, rectF, null);
                    } else if (c1265kq.f5823e > 9999) {
                        canvas.drawBitmap(c1265kq.f5824f.f4818s, (float) (c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)), (float) c1265kq.f5822d, null);
                        canvas.drawBitmap(c1265kq.f5824f.f4819t, (float) ((c1265kq.f5821c + (c1265kq.f5824f.f4817r.getWidth() / 2)) + c1265kq.f5824f.f4818s.getWidth()), (float) c1265kq.f5822d, null);
                    }
                }
            } catch (Exception e) {
            }
        }
        int i5 = this.f4757ap.f5844b;
        int i6 = 0;
        i = this.f4814o.getWidth();
        i2 = this.f4815p.getWidth() / 10;
        i3 = this.f4815p.getHeight();
        int i7 = this.f4776ba.mo2736n() ? 30 : 0;
        this.f4788bm.clear();
        E = i5 < 0 ? 0 : i5;
        for (i5 = 0; i5 < 5; i5++) {
            this.f4788bm.add(i5, Integer.valueOf((int) ((((double) E) % Math.pow(10.0d, (double) (i5 + 1))) / Math.pow(10.0d, (double) i5))));
        }
        E = 0;
        while (true) {
            i5 = E;
            if (i5 >= 5) {
                this.f4772bD.set((float) ((this.f4776ba.mo2693I() - (i2 * 5)) - i), (float) i7, (float) (this.f4776ba.mo2693I() - (i2 * 5)), (float) (i7 + this.f4814o.getHeight()));
                canvas.drawBitmap(this.f4814o, null, this.f4772bD, null);
                return;
            }
            E = ((Integer) this.f4788bm.get(i5)).intValue();
            this.f4801bz.set(E * i2, 0, (E + 1) * i2, i3);
            this.f4769bA.set(this.f4776ba.mo2693I() - ((i6 + 1) * i2), i7, this.f4776ba.mo2693I() - (i2 * i6), i7 + i3);
            canvas.drawBitmap(this.f4815p, this.f4801bz, this.f4769bA, null);
            i6++;
            E = i5 + 1;
        }
    }

    /* renamed from: c */
    public final void mo2931c(Canvas canvas) {
        this.f4712U = true;
        this.f4713V = true;
        this.f4781bf.clear();
        Iterator it = this.f4755an.iterator();
        while (it.hasNext()) {
            C1030by c1030by = (C1030by) it.next();
            if (c1030by.f5215h <= this.f4783bh) {
                if (c1030by.f5209b == c1030by.f5221n && c1030by.f5215h < this.f4776ba.mo2748w() && this.f4712U) {
                    if (c1030by.f5215h < this.f4776ba.mo2747v()) {
                        this.f4728aL = false;
                    }
                    if (c1030by.f5215h + (c1030by.f5220m / 2.0f) > 0.0f) {
                        this.f4717aA = this.f4755an.indexOf(c1030by);
                    }
                    if (!c1030by.f5198B) {
                        this.f4704L = c1030by.f5218k;
                    }
                    this.f4705M = c1030by.f5210c / 100.0f;
                    this.f4712U = false;
                }
                if (this.f4776ba.mo2736n() && c1030by.f5215h < this.f4776ba.mo2748w() && this.f4713V) {
                    this.f4813n = c1030by.f5208a;
                    this.f4713V = false;
                }
                c1030by.mo3105a(canvas);
            } else {
                this.f4781bf.add(c1030by);
            }
        }
        this.f4755an.removeAll(this.f4781bf);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f4708P = new C1031bz(this.f4776ba, (int) this.f4782bg, this.f4721aE);
        this.f4708P.start();
        this.f4709Q = new C1343q(this.f4776ba, this, this.f4721aE);
        this.f4709Q.start();
        this.f4757ap = new C1267ks(this.f4756ao, this.f4721aE);
        this.f4757ap.start();
        int E = this.f4776ba.mo2689E();
        JPApplication jPApplication = this.f4776ba;
        if (E != 3) {
            setOnTouchListener(new C1244jw(this));
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f4721aE.f4619j) {
            if (this.f4708P != null) {
                while (this.f4708P.isAlive()) {
                    this.f4721aE.f4617h = false;
                    this.f4710S = false;
                }
            }
            if (this.f4709Q != null) {
                while (this.f4709Q.isAlive()) {
                    this.f4721aE.f4617h = false;
                }
            }
            if (this.f4757ap != null) {
                while (this.f4757ap.isAlive()) {
                    this.f4721aE.f4617h = false;
                }
            }
            this.f4803d.recycle();
            this.f4803d = null;
            this.f4802c.recycle();
            this.f4802c = null;
            this.f4817r.recycle();
            this.f4817r = null;
            this.f4820u.recycle();
            this.f4820u = null;
            this.f4821v.recycle();
            this.f4821v = null;
            this.f4822w.recycle();
            this.f4822w = null;
            this.f4816q.recycle();
            this.f4816q = null;
            this.f4815p.recycle();
            this.f4815p = null;
            this.f4814o.recycle();
            this.f4814o = null;
            this.f4710S = false;
            this.f4824y.recycle();
            this.f4824y = null;
            this.f4825z.recycle();
            this.f4825z = null;
            this.f4693A.recycle();
            this.f4693A = null;
            this.f4694B.recycle();
            this.f4694B = null;
            this.f4695C.recycle();
            this.f4695C = null;
            this.f4696D.recycle();
            this.f4696D = null;
            this.f4697E.recycle();
            this.f4697E = null;
            this.f4698F.recycle();
            this.f4698F = null;
            this.f4699G.recycle();
            this.f4699G = null;
            this.f4700H.recycle();
            this.f4700H = null;
        }
    }
}
