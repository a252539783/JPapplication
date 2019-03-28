package ly.pp.addsongs;

import android.app.Application;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.SoundPool;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.SparseIntArray;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;



/* renamed from: ly.pp.addsongs.JPApplication */
public class JPApplication extends Application  {
    /* renamed from: b */
    static SparseIntArray f4029b = new SparseIntArray();
    /* renamed from: p */
    static Context f4030p;
    /* renamed from: t */
    private static SoundPool f4031t;
    /* renamed from: A */
    private float f4032A;
    /* renamed from: B */
    private float f4033B;
    /* renamed from: C */
    private float f4034C;
    /* renamed from: D */
    private float f4035D;
    /* renamed from: E */
    private float f4036E;
    /* renamed from: F */
    private final int f4037F = 0;
    /* renamed from: G */
    private final int f4038G = 1;
    /* renamed from: H */
    private final int f4039H = 2;
    /* renamed from: I */
    private final int f4040I = 3;
    /* renamed from: J */
    private float f4041J = 0.5f;
    /* renamed from: K */
    private float f4042K = 10.0f;
    /* renamed from: L */
    private boolean f4043L = false;
    /* renamed from: M */
    private int f4044M;
    /* renamed from: N */
    private int f4045N = 0;
    /* renamed from: O */
    private boolean f4046O = false;
    /* renamed from: P */
    private boolean f4047P = false;
    /* renamed from: Q */
    private boolean f4048Q = true;
    /* renamed from: R */
    private boolean f4049R = true;
    /* renamed from: S */
    private boolean f4050S = true;
    /* renamed from: T */
    private boolean f4051T = true;
    /* renamed from: U */
    private boolean f4052U = false;
    /* renamed from: V */
    private boolean f4053V = false;
    /* renamed from: W */
    private boolean f4054W = false;
    /* renamed from: X */
    private boolean f4055X = false;
    /* renamed from: Y */
    private int f4056Y = 5;
    /* renamed from: YZA */
    private float f4057YZA = 10.0f;
    /* renamed from: Z */
    private byte f4058Z = (byte) 0;
    /* renamed from: a */
    int f4059a = 0;
    /* renamed from: aa */
    private HashMap f4060aa = new HashMap();
    /* renamed from: ab */
    private ConnectionService f4061ab;
    /* renamed from: ac */
    private String f4062ac = "";
    /* renamed from: ad */
    private String f4063ad = "";
    /* renamed from: ae */
    private String f4064ae = "";
    /* renamed from: af */
    private boolean f4065af = true;
    /* renamed from: ag */
    private boolean f4066ag;
    /* renamed from: ah */
    private boolean f4067ah = true;
    /* renamed from: ai */
    private ServiceConnection f4068ai = new C0988aj(this);
    /* renamed from: c */
    /* renamed from: d */
    SharedPreferences f4070d;
    /* renamed from: e */
    String f4071e = "";
    /* renamed from: f */
    String f4072f = "";
    /* renamed from: g */
    String f4073g = "";
    /* renamed from: h */
    String f4074h = "";
    /* renamed from: i */
    String f4075i = "赞助玩家";
    /* renamed from: j */
    String f4076j = "下载任意一款应用来支持极品钢琴，您将会获得:\n1.特殊人物颜色框框.\n2.特殊房名颜色。\n提示:下载完成后软件会自动安装，请不要做其他的动作，以免激活失败.";
    /* renamed from: l */
    public boolean f4078l = true;
    /* renamed from: m */
    public int f4079m = 0;
    /* renamed from: n */
    /* renamed from: o */
    boolean f4081o = false;
    /* renamed from: q */
    public boolean f4082q = true;
    /* renamed from: r */
    private int f4083r;
    /* renamed from: s */
    private int f4084s;
    /* renamed from: u */
    private float f4085u;
    /* renamed from: v */
    private int f4086v = 1;
    /* renamed from: w */
    private float f4087w = 1.0f;
    /* renamed from: x */
    private float f4088x;
    /* renamed from: y */
    private int f4089y = 5;
    /* renamed from: z */
    private float f4090z;

    /* renamed from: ly.pp.addsongs.JPApplication$1 */
    class C09731 implements Runnable {
        C09731() {
        }
        /* renamed from: run */
        public void run() {
            while (true)
                try {
                    Thread.sleep(1);
                    Looper.loop();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }



    /* renamed from: a */
    public static int m3518a(int i, float f, float f2) {
        int i2 = f4029b.get(i);
        return i2 == 0 ? 0 : f4031t.play(i2, f, f2, 1, 0, 1.0f);
    }

    /* renamed from: a */
    public static void m3519a(int i) {
        f4031t.stop(i);
    }

    /* renamed from: a */
    public static void m3520a(Canvas canvas, Rect rect, Rect rect2, PlayView playView, int i) {
        switch (i) {
            case 0:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4695C, null, rect2, null);
                return;
            case 1:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4698F, null, rect2, null);
                return;
            case 2:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4696D, null, rect2, null);
                return;
            case 3:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4698F, null, rect2, null);
                return;
            case 4:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4697E, null, rect2, null);
                return;
            case 5:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4695C, null, rect2, null);
                return;
            case 6:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4698F, null, rect2, null);
                return;
            case 7:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4696D, null, rect2, null);
                return;
            case 8:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4698F, null, rect2, null);
                return;
            case 9:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4696D, null, rect2, null);
                return;
            case 10:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4698F, null, rect2, null);
                return;
            case 11:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4697E, null, rect2, null);
                return;
            case 12:
                canvas.drawBitmap(playView.f4699G, null, rect, null);
                canvas.drawBitmap(playView.f4695C, null, rect2, null);
                return;
            default:
        }
    }

    /* renamed from: b */
    public static void m3521b(int i) {
        if (PreferenceManager.getDefaultSharedPreferences(f4030p).getString("sound_list", "original").equals("original")) {
            try {
                f4029b.put(i - 1, f4031t.load(f4030p.getResources().getAssets().openFd("sound/" + String.valueOf(i) + ".ogg"), 1));
                return;
            } catch (IOException e) {
                return;
            }
        }
        f4029b.put(i - 1, f4031t.load(Environment.getExternalStorageDirectory() + "/JustPiano/Sounds/sound/" + String.valueOf(i) + ".ogg", 1));
    }

    /* renamed from: e */
    public static void m3522e() {
        if (f4031t != null) {
            f4029b.clear();
            f4029b = null;
            f4031t.release();
            f4031t = null;
        }
    }

    /* renamed from: f */
    public static void m3523f() {
        //f4031t.release();
        f4031t = null;
        f4031t = new SoundPool(5, 3, 0);
    }

    /* renamed from: g */
    public static void m3524g() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(f4030p).edit();
        edit.putString("sound_list", "original");
        edit.commit();
        for (int i = 32; i < 109; i++) {
            try {
                f4029b.put(i - 1, f4031t.load(f4030p.getResources().getAssets().openFd("sound/" + String.valueOf(i) + ".ogg"), 1));
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: h */
    public static boolean m3525h() {
        if (f4029b.get(60) != 0) {
            return true;
        }
        JPApplication.m3524g();
        return false;
    }

    /* renamed from: E */
    public final int mo2689E() {
        return this.f4044M;
    }

    /* renamed from: G */
    public final ArrayList mo2691G() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Rect(0, (int) this.f4032A, (int) this.f4088x, this.f4084s));
        arrayList.add(new Rect((int) (this.f4088x - this.f4036E), (int) this.f4032A, (int) (this.f4088x + this.f4036E), (int) ((this.f4032A + this.f4034C) + 5.0f)));
        arrayList.add(new Rect((int) this.f4088x, (int) this.f4032A, ((int) this.f4088x) * 2, this.f4084s));
        arrayList.add(new Rect((int) ((this.f4088x * 2.0f) - this.f4036E), (int) this.f4032A, (int) ((this.f4088x * 2.0f) + this.f4036E), (int) ((this.f4032A + this.f4034C) + 5.0f)));
        arrayList.add(new Rect(((int) this.f4088x) * 2, (int) this.f4032A, ((int) this.f4088x) * 3, this.f4084s));
        arrayList.add(new Rect(((int) this.f4088x) * 3, (int) this.f4032A, ((int) this.f4088x) * 4, this.f4084s));
        arrayList.add(new Rect((int) ((this.f4088x * 4.0f) - this.f4036E), (int) this.f4032A, (int) ((this.f4088x * 4.0f) + this.f4036E), (int) ((this.f4032A + this.f4034C) + 5.0f)));
        arrayList.add(new Rect(((int) this.f4088x) * 4, (int) this.f4032A, ((int) this.f4088x) * 5, this.f4084s));
        arrayList.add(new Rect((int) ((this.f4088x * 5.0f) - this.f4036E), (int) this.f4032A, (int) ((this.f4088x * 5.0f) + this.f4036E), (int) ((this.f4032A + this.f4034C) + 5.0f)));
        arrayList.add(new Rect(((int) this.f4088x) * 5, (int) this.f4032A, ((int) this.f4088x) * 6, this.f4084s));
        arrayList.add(new Rect((int) ((this.f4088x * 6.0f) - this.f4036E), (int) this.f4032A, (int) ((this.f4088x * 6.0f) + this.f4036E), (int) ((this.f4032A + this.f4034C) + 5.0f)));
        arrayList.add(new Rect(((int) this.f4088x) * 6, (int) this.f4032A, ((int) this.f4088x) * 7, this.f4084s));
        arrayList.add(new Rect(((int) this.f4088x) * 7, (int) this.f4032A, ((int) this.f4088x) * 8, this.f4084s));
        return arrayList;
    }

    /* renamed from: H */
    public final int mo2692H() {
        return this.f4084s;
    }

    /* renamed from: I */
    public final int mo2693I() {
        return this.f4083r;
    }

    /* renamed from: J */
    public final boolean mo2694J() {
        return this.f4066ag;
    }

    /* renamed from: K */
    public final String mo2695K() {
        String str = "3.5";
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: L */
    public final ServiceConnection mo2696L() {
        return this.f4068ai;
    }

    /* renamed from: M */
    public final ConnectionService mo2697M() {
        return this.f4061ab;
    }

    /* renamed from: N */
    public final boolean mo2698N() {
        return this.f4043L;
    }

    public final float NOTESIZE() {
        return this.f4057YZA;
    }

    /* renamed from: O */
    public final HashMap mo2700O() {
        return this.f4060aa;
    }

    /* renamed from: P */
    public final String mo2701P() {
        if (this.f4062ac.equals("")) {
            this.f4062ac = this.f4070d.getString("name", "");
        }
        return this.f4062ac;
    }

    /* renamed from: Q */
    public final String mo2702Q() {
        if (this.f4064ae.equals("")) {
            this.f4064ae = this.f4070d.getString("userKitiName", "");
        }
        return this.f4064ae;
    }

    /* renamed from: a */
    public final int mo2703a(int i, float f) {
        float f2 = f > 1.0f ? (this.f4041J * f) / 100.0f : f;
        int i2 = f4029b.get(i);
        return i2 == 0 ? 0 : f4031t.play(i2, f2, f2, 1, 0, 1.0f);
    }

    /* renamed from: a */
    public final ArrayList mo2704a(PlayView playView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Rect(0, (int) (this.f4090z - ((float) playView.f4699G.getHeight())), (int) this.f4088x, (int) this.f4090z));
        arrayList.add(new Rect((int) (this.f4088x - this.f4036E), (int) (this.f4090z - ((float) playView.f4699G.getHeight())), (int) (this.f4088x + this.f4036E), (int) this.f4090z));
        arrayList.add(new Rect((int) this.f4088x, (int) (this.f4090z - ((float) playView.f4699G.getHeight())), ((int) this.f4088x) * 2, (int) this.f4090z));
        arrayList.add(new Rect((int) ((this.f4088x * 2.0f) - this.f4036E), (int) (this.f4090z - ((float) playView.f4699G.getHeight())), (int) ((this.f4088x * 2.0f) + this.f4036E), (int) this.f4090z));
        arrayList.add(new Rect(((int) this.f4088x) * 2, ((int) this.f4090z) - playView.f4699G.getHeight(), ((int) this.f4088x) * 3, (int) this.f4090z));
        arrayList.add(new Rect(((int) this.f4088x) * 3, ((int) this.f4090z) - playView.f4699G.getHeight(), ((int) this.f4088x) * 4, (int) this.f4090z));
        arrayList.add(new Rect((int) ((this.f4088x * 4.0f) - this.f4036E), (int) (this.f4090z - ((float) playView.f4699G.getHeight())), (int) ((this.f4088x * 4.0f) + this.f4036E), (int) this.f4090z));
        arrayList.add(new Rect(((int) this.f4088x) * 4, ((int) this.f4090z) - playView.f4699G.getHeight(), ((int) this.f4088x) * 5, (int) this.f4090z));
        arrayList.add(new Rect((int) ((this.f4088x * 5.0f) - this.f4036E), (int) (this.f4090z - ((float) playView.f4699G.getHeight())), (int) ((this.f4088x * 5.0f) + this.f4036E), (int) this.f4090z));
        arrayList.add(new Rect(((int) this.f4088x) * 5, ((int) this.f4090z) - playView.f4699G.getHeight(), ((int) this.f4088x) * 6, (int) this.f4090z));
        arrayList.add(new Rect((int) ((this.f4088x * 6.0f) - this.f4036E), (int) (this.f4090z - ((float) playView.f4699G.getHeight())), (int) ((this.f4088x * 6.0f) + this.f4036E), (int) this.f4090z));
        arrayList.add(new Rect(((int) this.f4088x) * 6, ((int) this.f4090z) - playView.f4699G.getHeight(), ((int) this.f4088x) * 7, (int) this.f4090z));
        arrayList.add(new Rect(((int) this.f4088x) * 7, ((int) this.f4090z) - playView.f4699G.getHeight(), ((int) this.f4088x) * 8, (int) this.f4090z));
        return arrayList;
    }

    /* renamed from: a */
    public final void mo2705a(float f) {
        this.f4085u = f;
    }

    /* renamed from: a */
    public final void mo2706a(Context context, String str, LinearLayout linearLayout) {
        System.gc();
        Bitmap bitmap = null;
        if (!PreferenceManager.getDefaultSharedPreferences(context).getString("skin_list", "original").equals("original")) {
            try {
                bitmap = BitmapFactory.decodeFile(context.getDir("Skin", 0) + "/" + str + ".jpg");
            } catch (Exception e) {
            }
            if (bitmap == null) {
                try {
                    bitmap = BitmapFactory.decodeFile(context.getDir("Skin", 0) + "/" + str + ".png");
                } catch (Exception e2) {
                }
            }
            if (bitmap != null && linearLayout != null) {
                linearLayout.setBackgroundDrawable(new BitmapDrawable(getResources(), bitmap));
            }
        }
    }

    /* renamed from: a */
    public final void mo2707a(Context context, String str, RelativeLayout relativeLayout) {
        System.gc();
        Bitmap bitmap = null;
        if (!PreferenceManager.getDefaultSharedPreferences(context).getString("skin_list", "original").equals("original")) {
            try {
                bitmap = BitmapFactory.decodeFile(context.getDir("Skin", 0) + "/" + str + ".jpg");
            } catch (Exception e) {
            }
            if (bitmap == null) {
                try {
                    bitmap = BitmapFactory.decodeFile(context.getDir("Skin", 0) + "/" + str + ".png");
                } catch (Exception e2) {
                }
            }
            if (bitmap != null && relativeLayout != null) {
                relativeLayout.setBackgroundDrawable(new BitmapDrawable(getResources(), bitmap));
            }
        }
    }

    /* renamed from: a */


    /* renamed from: a */
    public final void mo2708a(String str) {
        this.f4070d = getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public final void mo2709a(ConnectionService connectionService) {
        this.f4061ab = connectionService;
    }

    /* renamed from: a */
    public final void mo2710a(PlayView playView, Canvas canvas, int i) {
        switch (i) {
            case 0:
                canvas.drawBitmap(playView.f4699G, null, new RectF(0.0f, this.f4090z - ((float) playView.f4699G.getHeight()), (float) ((int) this.f4088x), this.f4090z), null);
                canvas.drawBitmap(playView.f4695C, null, new RectF(0.0f, this.f4032A, (float) ((int) this.f4088x), (float) this.f4084s), null);
                return;
            case 1:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) ((int) (this.f4088x - this.f4036E)), this.f4090z - ((float) playView.f4699G.getHeight()), (float) ((int) (this.f4088x + this.f4036E)), this.f4090z), null);
                canvas.drawBitmap(playView.f4698F, null, new RectF((float) ((int) (this.f4088x - this.f4036E)), this.f4032A, (float) ((int) (this.f4088x + this.f4036E)), (float) ((int) ((this.f4032A + this.f4034C) + 5.0f))), null);
                return;
            case 2:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) ((int) this.f4088x), this.f4090z - ((float) playView.f4699G.getHeight()), (float) (((int) this.f4088x) * 2), this.f4090z), null);
                canvas.drawBitmap(playView.f4696D, null, new RectF((float) ((int) this.f4088x), this.f4032A, (float) (((int) this.f4088x) * 2), (float) this.f4084s), null);
                return;
            case 3:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) ((int) ((this.f4088x * 2.0f) - this.f4036E)), this.f4090z - ((float) playView.f4699G.getHeight()), (float) ((int) ((this.f4088x * 2.0f) + this.f4036E)), this.f4090z), null);
                canvas.drawBitmap(playView.f4698F, null, new RectF((float) ((int) ((this.f4088x * 2.0f) - this.f4036E)), this.f4032A, (float) ((int) ((this.f4088x * 2.0f) + this.f4036E)), (float) ((int) ((this.f4032A + this.f4034C) + 5.0f))), null);
                return;
            case 4:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) (((int) this.f4088x) * 2), this.f4090z - ((float) playView.f4699G.getHeight()), (float) (((int) this.f4088x) * 3), this.f4090z), null);
                canvas.drawBitmap(playView.f4697E, null, new RectF((float) (((int) this.f4088x) * 2), this.f4032A, (float) (((int) this.f4088x) * 3), (float) this.f4084s), null);
                return;
            case 5:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) (((int) this.f4088x) * 3), this.f4090z - ((float) playView.f4699G.getHeight()), (float) (((int) this.f4088x) * 4), this.f4090z), null);
                canvas.drawBitmap(playView.f4695C, null, new RectF((float) (((int) this.f4088x) * 3), this.f4032A, (float) (((int) this.f4088x) * 4), (float) this.f4084s), null);
                return;
            case 6:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) ((int) ((this.f4088x * 4.0f) - this.f4036E)), this.f4090z - ((float) playView.f4699G.getHeight()), (float) ((int) ((this.f4088x * 4.0f) + this.f4036E)), this.f4090z), null);
                canvas.drawBitmap(playView.f4698F, null, new RectF((float) ((int) ((this.f4088x * 4.0f) - this.f4036E)), this.f4032A, (float) ((int) ((this.f4088x * 4.0f) + this.f4036E)), (float) ((int) ((this.f4032A + this.f4034C) + 5.0f))), null);
                return;
            case 7:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) (((int) this.f4088x) * 4), this.f4090z - ((float) playView.f4699G.getHeight()), (float) (((int) this.f4088x) * 5), this.f4090z), null);
                canvas.drawBitmap(playView.f4696D, null, new RectF((float) (((int) this.f4088x) * 4), this.f4032A, (float) (((int) this.f4088x) * 5), (float) this.f4084s), null);
                return;
            case 8:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) ((int) ((this.f4088x * 5.0f) - this.f4036E)), this.f4090z - ((float) playView.f4699G.getHeight()), (float) ((int) ((this.f4088x * 5.0f) + this.f4036E)), this.f4090z), null);
                canvas.drawBitmap(playView.f4698F, null, new RectF((float) ((int) ((this.f4088x * 5.0f) - this.f4036E)), this.f4032A, (float) ((int) ((this.f4088x * 5.0f) + this.f4036E)), (float) ((int) ((this.f4032A + this.f4034C) + 5.0f))), null);
                return;
            case 9:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) (((int) this.f4088x) * 5), this.f4090z - ((float) playView.f4699G.getHeight()), (float) (((int) this.f4088x) * 6), this.f4090z), null);
                canvas.drawBitmap(playView.f4696D, null, new RectF((float) (((int) this.f4088x) * 5), this.f4032A, (float) (((int) this.f4088x) * 6), (float) this.f4084s), null);
                return;
            case 10:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) ((int) ((this.f4088x * 6.0f) - this.f4036E)), this.f4090z - ((float) playView.f4699G.getHeight()), (float) ((int) ((this.f4088x * 6.0f) + this.f4036E)), this.f4090z), null);
                canvas.drawBitmap(playView.f4698F, null, new RectF((float) ((int) ((this.f4088x * 6.0f) - this.f4036E)), this.f4032A, (float) ((int) ((this.f4088x * 6.0f) + this.f4036E)), (float) ((int) ((this.f4032A + this.f4034C) + 5.0f))), null);
                return;
            case 11:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) (((int) this.f4088x) * 6), this.f4090z - ((float) playView.f4699G.getHeight()), (float) (((int) this.f4088x) * 7), this.f4090z), null);
                canvas.drawBitmap(playView.f4697E, null, new RectF((float) (((int) this.f4088x) * 6), this.f4032A, (float) (((int) this.f4088x) * 7), (float) this.f4084s), null);
                return;
            case 12:
                canvas.drawBitmap(playView.f4699G, null, new RectF((float) (((int) this.f4088x) * 7), this.f4090z - ((float) playView.f4699G.getHeight()), (float) (((int) this.f4088x) * 8), this.f4090z), null);
                canvas.drawBitmap(playView.f4695C, null, new RectF((float) (((int) this.f4088x) * 7), this.f4032A, (float) (((int) this.f4088x) * 8), (float) this.f4084s), null);
                return;
            default:
        }
    }

    /* renamed from: a */
    public final void mo2711a(boolean z) {
        this.f4043L = z;
    }

    /* renamed from: a */
    public final boolean mo2712a() {
        return this.f4067ah;
    }

    /* renamed from: b */
    public final int mo2713b() {
        return this.f4086v;
    }

    /* renamed from: b */
    public final Bitmap mo2714b(String str) {
        Bitmap bitmap = null;
        if (!PreferenceManager.getDefaultSharedPreferences(this).getString("skin_list", "original").equals("original")) {
            try {
                bitmap = BitmapFactory.decodeFile(getDir("Skin", 0) + "/" + str + ".png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            return BitmapFactory.decodeStream(getResources().getAssets().open("drawable/" + str + ".png"));
        } catch (IOException e2) {
            e2.toString();
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void mo2715b(float f) {
        this.f4088x = f;
    }
    public final float mo2716c() {
        return this.f4085u;
    }

    /* renamed from: c */
    public final void mo2717c(float f) {
        this.f4090z = f;
    }

    /* renamed from: c */
    public final void mo2718c(int i) {
        this.f4044M = i;
    }

    /* renamed from: c */
    public final void mo2719c(String str) {
        this.f4062ac = str;
    }

    /* renamed from: d */
    public final void mo2720d() {
        this.f4085u += (float) this.f4086v;
    }

    /* renamed from: d */
    public final void mo2721d(float f) {
        this.f4032A = f;
    }

    /* renamed from: d */
    public final void mo2722d(int i) {
        this.f4084s = i;
    }

    /* renamed from: d */
    public final void mo2723d(String str) {
        this.f4063ad = str;
    }

    /* renamed from: e */
    public final void mo2724e(float f) {
        this.f4034C = f;
    }

    /* renamed from: e */
    public final void mo2725e(int i) {
        this.f4083r = i;
    }

    /* renamed from: e */
    public final void mo2726e(String str) {
        this.f4064ae = str;
    }

    /* renamed from: f */
    public final void mo2727f(float f) {
        this.f4035D = f;
    }

    /* renamed from: f */
    public final void mo2728f(int i) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        switch (i) {
            case 0:
                this.f4050S = defaultSharedPreferences.getBoolean("auto_play", true);
                this.f4087w = Float.valueOf(defaultSharedPreferences.getString("temp_speed", "1")).floatValue();
                break;
            case 1:
                this.f4087w = 1.0f;
                this.f4050S = true;
                break;
        }
        this.f4048Q = defaultSharedPreferences.getBoolean("sound_check_box", true);
        this.f4041J = Float.valueOf(defaultSharedPreferences.getString("b_s_vol", "0.8")).floatValue();
        this.f4085u = (float) Integer.valueOf(defaultSharedPreferences.getString("anim_grade", "1")).intValue();
        this.f4066ag = defaultSharedPreferences.getBoolean("keyboard_perfer", true);
        this.f4067ah = defaultSharedPreferences.getBoolean("overlap", false);
        this.f4045N = Integer.valueOf(defaultSharedPreferences.getString("badu", "0")).intValue();
        this.f4049R = defaultSharedPreferences.getBoolean("tishi_cj", true);
        this.f4051T = defaultSharedPreferences.getBoolean("show_line", true);
        this.f4052U = defaultSharedPreferences.getBoolean("open_long_key", false);
        this.f4053V = defaultSharedPreferences.getBoolean("is3d", false);
        this.f4042K = (float) (Integer.valueOf(defaultSharedPreferences.getString("down_speed", "30")) / 10);
        this.f4057YZA = ((float) Integer.valueOf(defaultSharedPreferences.getString("note_size", "10"))) / 10.0f;
        this.f4054W = defaultSharedPreferences.getBoolean("keyboard_press", true);
        this.f4055X = defaultSharedPreferences.getBoolean("vib_ison", false);
        this.f4056Y = Integer.valueOf(defaultSharedPreferences.getString("vib_len", "5"));
        this.f4078l = defaultSharedPreferences.getBoolean("changecolor", true);
    }

    /* renamed from: g */
    public final void mo2729g(float f) {
        this.f4036E = f;
    }

    /* renamed from: h */
    public final void mo2730h(float f) {
        this.f4033B = f;
    }

    /* renamed from: i */
    public final void mo2731i() {
        this.f4087w = 1.0f;
    }

    /* renamed from: j */
    public final float mo2732j() {
        return this.f4087w;
    }

    /* renamed from: k */
    public final boolean mo2733k() {
        return this.f4054W;
    }

    /* renamed from: l */
    public final float mo2734l() {
        return this.f4042K;
    }

    /* renamed from: m */
    public final boolean mo2735m() {
        return this.f4053V;
    }

    /* renamed from: n */
    public final boolean mo2736n() {
        return this.f4052U;
    }

    /* renamed from: o */
    public final boolean mo2737o() {
        return this.f4051T;
    }

    public void onCreate() {
        super.onCreate();
        new Handler(Looper.getMainLooper()).post(new C09731());
        f4030p = getApplicationContext();
        this.f4070d = getSharedPreferences(getSharedPreferences("account_list", 0).getString("accountList", "account"), 0);
        C1221j.m4041a().mo3352a(getApplicationContext());
    }

    public void onLowMemory() {
        super.onLowMemory();
    }

    public void onTerminate() {
        super.onTerminate();
    }

    /* renamed from: p */
    public final boolean mo2741p() {
        return this.f4049R;
    }

    /* renamed from: q */
    public final int mo2742q() {
        return this.f4045N;
    }

    /* renamed from: r */
    public final boolean mo2743r() {
        return this.f4050S;
    }

    /* renamed from: s */
    public final float mo2744s() {
        return this.f4041J;
    }

    /* renamed from: t */
    public final boolean mo2745t() {
        return this.f4048Q;
    }

    /* renamed from: u */
    public final float mo2746u() {
        return this.f4088x;
    }

    /* renamed from: v */
    public final float mo2747v() {
        return this.f4090z;
    }

    /* renamed from: w */
    public final float mo2748w() {
        return this.f4032A;
    }

    /* renamed from: x */
    public final float mo2749x() {
        return this.f4034C;
    }

    /* renamed from: y */
    public final float mo2750y() {
        return this.f4036E;
    }

    /* renamed from: z */
    public final float mo2751z() {
        return this.f4033B;
    }
}
