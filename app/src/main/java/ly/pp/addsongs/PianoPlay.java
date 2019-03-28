package ly.pp.addsongs;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioRecord;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;



/* renamed from: ly.pp.addsongs.PianoPlay */
public class PianoPlay extends BaseActivity {
    /* renamed from: ab */
    private static int f4579ab = 44100;
    /* renamed from: A */
    ImageButton f4582A;
    /* renamed from: B */
    public ListView f4583B;
    /* renamed from: C */
    public TextView f4584C;
    /* renamed from: D */
    PowerManager f4585D;
    /* renamed from: E */
    public byte f4586E;
    /* renamed from: F */
    HashMap f4587F = null;
    /* renamed from: G */
    boolean f4588G = false;
    /* renamed from: H */
    boolean f4589H = false;
    /* renamed from: I */
    public C1227jf f4590I = new C1227jf(this);
    /* renamed from: J */
    public View f4591J;
    /* renamed from: K */
    private View f4592K;
    /* renamed from: L */
    private LayoutParams f4593L;
    /* renamed from: M */
    public String f4594M;
    /* renamed from: N */
    public TextView f4595N;
    /* renamed from: O */
    public TextView f4596O;
    /* renamed from: P */
    public TextView f4597P;
    /* renamed from: Q */
    public ListView f4598Q;
    /* renamed from: R */
    private ConnectionService f4599R;
    /* renamed from: S */
    public List f4600S = new ArrayList();
    /* renamed from: T */
    private LayoutInflater f4601T;
    /* renamed from: U */
    private ProgressBar f4602U;
    /* renamed from: W */
    public KeyBoardView f4604W;
    /* renamed from: X */
    public boolean f4605X = false;
    /* renamed from: Y */
    public Bundle f4606Y;
    /* renamed from: Z */
    private Bundle f4607Z;
    /* renamed from: ae */
    private int f4609ae = 0;
    /* renamed from: af */
    private AudioRecord f4610af;
    /* renamed from: ag */
    private boolean f4611ag = false;
    /* renamed from: ah */
    public String f4612ah;
    /* renamed from: ai */
    public String f4613ai;
    /* renamed from: aj */
    private int f4614aj = 0;
    /* renamed from: ak */
    private int f4615ak = 0;
    /* renamed from: al */
    private int f4616al = 10;
    /* renamed from: h */
    boolean f4617h = false;
    /* renamed from: i */
    boolean f4618i = false;
    /* renamed from: j */
    boolean f4619j = false;
    /* renamed from: k */
    boolean f4620k = false;
    /* renamed from: l */
    C1253ke f4621l;
    /* renamed from: m */
    String f4622m = "";
    /* renamed from: n */
    ImageButton f4623n;
    /* renamed from: o */
    LayoutParams f4624o;
    /* renamed from: p */
    String f4625p = "";
    /* renamed from: q */
    PlayView f4626q;
    /* renamed from: r */
    String f4627r;
    /* renamed from: s */
    double f4628s;
    /* renamed from: t */
    float f4629t;
    /* renamed from: u */
    int f4630u;
    /* renamed from: v */
    int f4631v = 0;
    /* renamed from: w */
    C1302m f4632w = null;
    /* renamed from: x */
    JPApplication f4633x;
    /* renamed from: y */
    View f4634y;
    /* renamed from: z */
    Button f4635z = null;

    /* renamed from: a */
    private List m3783a(List list, String str) {
        if (!(list == null || list.isEmpty())) {
            Collections.sort(list, new C1214it(this, str));
        }
        return list;
    }

    /* renamed from: a */
    private void m3785a(int i, boolean z) {
        if (z) {
            this.f4596O.setVisibility(View.VISIBLE);
            this.f4597P.setVisibility(View.VISIBLE);
            this.f4623n.setVisibility(View.VISIBLE);
            this.f4595N.setText(this.f4594M);
            return;
        }
        this.f4605X = true;
        addContentView(this.f4591J, this.f4593L);
        this.f4595N = (TextView) findViewById(R.id.m_name);
        this.f4602U = (ProgressBar) findViewById(R.id.m_progress);
        this.f4596O = (TextView) findViewById(R.id.m_nandu);
        if (i == 0) {
            this.f4596O.setText("难度：" + this.f4629t);
        } else {
            this.f4596O.setText("难度：" + this.f4628s);
        }
        this.f4597P = (TextView) findViewById(R.id.m_score);
        this.f4597P.setText(String.valueOf("最高：" + this.f4630u));
        this.f4623n = (ImageButton) findViewById(R.id.p_start);
        this.f4595N.setText(this.f4594M);
        switch (i) {
            case 0:
                this.f4623n.setOnClickListener(new C1224jc(this));
                return;
            case 1:
                this.f4623n.setOnClickListener(new C1225jd(this));
                return;
            case 2:
                this.f4595N.setText("请稍后...");
                this.f4602U.setVisibility(View.VISIBLE);
                this.f4596O.setVisibility(View.GONE);
                this.f4597P.setVisibility(View.GONE);
                this.f4623n.setVisibility(View.GONE);
                addContentView(this.f4592K, this.f4624o);
                this.f4592K.setVisibility(View.VISIBLE);
                addContentView(this.f4634y, this.f4593L);
                this.f4582A = (ImageButton) this.f4634y.findViewById(R.id.ol_ok);
                ((Button) this.f4634y.findViewById(R.id.share_score)).setOnClickListener(new C1215iu(this));
                this.f4582A.setOnClickListener(new C1216iv(this));
                this.f4634y.setVisibility(View.GONE);
                mo2904a((byte) 23, (byte) 0, "", null);
                return;
            case 3:
                this.f4595N.setText("请稍后...");
                this.f4602U.setVisibility(View.VISIBLE);
                this.f4596O.setVisibility(View.GONE);
                this.f4597P.setVisibility(View.GONE);
                this.f4623n.setVisibility(View.GONE);
                addContentView(this.f4592K, this.f4624o);
                this.f4592K.setVisibility(View.VISIBLE);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("T", 1);
                    mo2904a((byte) 40, (byte) 0, jSONObject.toString(), null);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            default:
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m3786a(PianoPlay pianoPlay, String str, String str2) {
        FileNotFoundException e2;
        FileInputStream fileInputStream;
        long j = (long) f4579ab;
        long j2 = (long) (((f4579ab * 16) * 2) / 8);
        byte[] bArr = new byte[pianoPlay.f4609ae];
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream;
        try {
            fileInputStream2 = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    long size = 36 + fileInputStream2.getChannel().size();
                    fileOutputStream.write(new byte[]{(byte) 82, (byte) 73, (byte) 70, (byte) 70, (byte) ((int) (255 & size)), (byte) ((int) ((size >> 8) & 255)), (byte) ((int) ((size >> 16) & 255)), (byte) ((int) ((size >> 24) & 255)), (byte) 87, (byte) 65, (byte) 86, (byte) 69, (byte) 102, (byte) 109, (byte) 116, (byte) 32, (byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 2, (byte) 0, (byte) ((int) (255 & j)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 24) & 255)), (byte) ((int) (255 & j2)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 24) & 255)), (byte) 4, (byte) 0, (byte) 16, (byte) 0, (byte) 100, (byte) 97, (byte) 116, (byte) 97, (byte) ((int) (255 & (fileInputStream2.getChannel().size()+36))), (byte) ((int) (((fileInputStream2.getChannel().size()+36) >> 8) & 255)), (byte) ((int) (((fileInputStream2.getChannel().size()+36) >> 16) & 255)), (byte) ((int) ((fileInputStream2.getChannel().size() >> 24) & 255))}, 0, 44);
                    while (fileInputStream2.read(bArr) != -1) {
                        fileOutputStream.write(bArr);
                    }
                    try {
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                } catch (FileNotFoundException e4) {
                    e2 = e4;
                    fileInputStream = fileInputStream2;
                } catch (IOException e5) {
                    //IOException e3 = e5;
                }
            } catch (FileNotFoundException e6) {
                e2 = e6;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                try {
                    e2.printStackTrace();
                    try {
                        fileInputStream.close();
                        //fileOutputStream.close();
                    } catch (IOException e32) {
                        e32.printStackTrace();
                    }
                } catch (Throwable th2) {
                    //th = th2;
                    fileInputStream2 = fileInputStream;
                    try {
                        fileInputStream2.close();
                        //fileOutputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    //throw th2;
                }
            } /*catch (IOException e8) {
                IOException e32 = e8;
                fileOutputStream = null;
                try {
                    e32.printStackTrace();
                    try {
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (IOException e322) {
                        e322.printStackTrace();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2.close();
                    fileOutputStream.close();
                    throw th;
                }
            } */catch (Throwable th4) {
                //th = th4;
                fileOutputStream = null;
                fileInputStream2.close();
                //fileOutputStream.close();
                //throw th;
            }
        } catch (FileNotFoundException e9) {
            //e2 = e9;
            fileInputStream = null;
            fileOutputStream = null;
            e9.printStackTrace();
            //fileInputStream.close();
            //fileOutputStream.close();
        } catch (IOException e10) {
            //IOException e322 = e10;
            fileInputStream2 = null;
            fileOutputStream = null;
            e10.printStackTrace();
            //fileInputStream2.close();
            //fileOutputStream.close();
        } /*catch (Throwable th5) {
            fileInputStream2 = null;
            fileOutputStream = null;
            //fileInputStream2.close();
            //fileOutputStream.close();
            throw th5;
        }*/
    }

    /* renamed from: a */
    private boolean m3787a(String str) {
        try {
            this.f4612ah = Environment.getExternalStorageDirectory() + "/JustPiano/Record/buf.raw";
            this.f4613ai = Environment.getExternalStorageDirectory() + "/JustPiano/Record/" + str + ".wav";
            this.f4609ae = AudioRecord.getMinBufferSize(f4579ab, 12, 2);
            /* renamed from: aa */
            int f4608aa = 1;
            this.f4610af = new AudioRecord(f4608aa, f4579ab, 12, 2, this.f4609ae);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public boolean m3792e() {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[this.f4609ae];
        boolean z = true;
        try {
            File file = new File(Environment.getExternalStorageDirectory() + "/JustPiano/Record");
            file.mkdirs();
            File file2 = new File(file, "buf.raw");
            if (file2.exists()) {
                file2.delete();
            }
            fileOutputStream = new FileOutputStream(file2);
        } catch (Exception e) {
            e.printStackTrace();
            this.f4611ag = false;
            Toast.makeText(this, "无效的储存路径,请检查SD卡是否插入！", Toast.LENGTH_SHORT).show();
            z = false;
            fileOutputStream = null;
        }
        while (this.f4611ag) {
            if (-3 != this.f4610af.read(bArr, 0, this.f4609ae)) {
                try {
                    fileOutputStream.write(bArr);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        try {
            fileOutputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return z;
    }

    /* renamed from: f */
    public void m3794f() {
        this.f4632w = new C1302m(this);
        this.f4591J = LayoutInflater.from(this).inflate(R.layout.pusedplay, null);
        this.f4593L = new LayoutParams(-2, -2);
        this.f4593L.gravity = 17;
        this.f4624o = new LayoutParams(-2, -2);
        this.f4624o.topMargin = 0;
        this.f4624o.leftMargin = 0;
        Bundle extras = getIntent().getExtras();
        this.f4631v = extras.getInt("head");
        JPApplication jPApplication;
        String str;
        String str2;
        switch (this.f4631v) {
            case 0:
                this.f4627r = extras.getString("path");
                this.f4594M = extras.getString("name");
                this.f4629t = extras.getFloat("nandu");
                this.f4630u = extras.getInt("score");
                this.f4588G = extras.getBoolean("isrecord");
                this.f4614aj = extras.getInt("hand");
                jPApplication = this.f4633x;
                str = this.f4627r;
                str2 = this.f4594M;
                this.f4626q = new PlayView(jPApplication, this, str, this, this.f4628s, this.f4630u, this.f4631v, this.f4614aj, this.f4616al);
                //this.f4594M + ":" + this.f4627r;
                break;
            case 1:
                this.f4594M = extras.getString("songName").trim();
                this.f4628s = extras.getDouble("degree");
                this.f4630u = extras.getInt("topScore");
                String valueOf = String.valueOf(extras.getLong("songID"));
                jPApplication = this.f4633x;
                byte[] byteArray = extras.getByteArray("songBytes");
                str = this.f4594M;
                this.f4626q = new PlayView(jPApplication, byteArray, this, this, this.f4628s, this.f4630u, valueOf);
                break;
            case 2:
                m3796g();
                this.f4606Y = extras.getBundle("bundle");
                this.f4607Z = extras.getBundle("bundleHall");
                this.f4586E = this.f4607Z.getByte("hallID");
                this.f4616al = extras.getInt("uploadTimes");
                this.f4587F = this.f4633x.mo2700O();
                this.f4627r = extras.getString("path");
                this.f4594M = extras.getString("name");
                this.f4614aj = extras.getInt("hand");
                this.f4615ak = extras.getInt("roomMode");
                this.f4592K = this.f4601T.inflate(R.layout.ol_score_view, null);
                this.f4583B = (ListView) this.f4592K.findViewById(R.id.ol_score_list);
                this.f4583B.setCacheColorHint(0);
                this.f4583B.setVisibility(View.GONE);
                this.f4584C = (TextView) this.f4592K.findViewById(R.id.ol_score_button);
                int visibility = this.f4583B.getVisibility();
                if (visibility == 0) {
                    this.f4584C.setText("点击隐藏");
                } else if (visibility == 8) {
                    this.f4584C.setText("显示成绩");
                }
                this.f4584C.setOnClickListener(new C1217iw(this));
                this.f4600S.clear();
                this.f4634y = this.f4601T.inflate(R.layout.ol_finish_view, null);
                this.f4598Q = (ListView) this.f4634y.findViewById(R.id.ol_finish_list);
                this.f4598Q.setCacheColorHint(0);
                jPApplication = this.f4633x;
                str = this.f4627r;
                str2 = this.f4594M;
                this.f4626q = new PlayView(jPApplication, this, str, this, this.f4628s, this.f4630u, this.f4631v, this.f4614aj, this.f4616al);
                break;
            case 3:
                m3796g();
                this.f4606Y = extras.getBundle("bundle");
                this.f4607Z = extras.getBundle("bundleHall");
                this.f4586E = this.f4607Z.getByte("hallID");
                this.f4587F = this.f4633x.mo2700O();
                this.f4627r = extras.getString("path");
                this.f4594M = extras.getString("name");
                this.f4592K = this.f4601T.inflate(R.layout.ol_score_view, null);
                this.f4583B = (ListView) this.f4592K.findViewById(R.id.ol_score_list);
                this.f4583B.setCacheColorHint(0);
                this.f4583B.setVisibility(View.GONE);
                this.f4584C = (TextView) this.f4592K.findViewById(R.id.ol_score_button);
                this.f4583B.setVisibility(View.GONE);
                this.f4584C.setText("");
                this.f4600S.clear();
                jPApplication = this.f4633x;
                str = this.f4627r;
                str2 = this.f4594M;
                this.f4626q = new PlayView(jPApplication, this, str, this, this.f4628s, this.f4630u, this.f4631v, this.f4614aj, this.f4616al);
                break;
        }
        if (this.f4588G) {
            this.f4588G = m3787a(this.f4594M);
            if (!this.f4588G) {
                Toast.makeText(this, "初始化录音失败，无法录音！请检查内存卡剩余容量！", Toast.LENGTH_SHORT).show();
            }
        }
        setContentView(this.f4626q);
        this.f4604W = new KeyBoardView(this, this.f4626q, this.f4633x);
        addContentView(this.f4604W, this.f4593L);
        m3785a(this.f4631v, false);
        this.f4617h = true;
    }

    /* renamed from: g */
    private void m3796g() {
        this.f4599R = this.f4633x.mo2697M();
    }

    /* renamed from: m */
    static /* synthetic */ void m3802m(PianoPlay pianoPlay) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        pianoPlay.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        pianoPlay.f4633x.mo2722d(displayMetrics.heightPixels);
        pianoPlay.f4633x.mo2725e(displayMetrics.widthPixels);
        pianoPlay.f4633x.mo2728f(1);
        JPApplication.m3523f();
        for (int i = 32; i <= 108; i++) {
            JPApplication.m3521b(i);
        }
        JPApplication.m3525h();
    }

    /* renamed from: o */
    static /* synthetic */ Bitmap m3804o(PianoPlay pianoPlay) {
        View decorView = pianoPlay.getWindow().getDecorView();
        decorView.layout(0, 0, pianoPlay.f4633x.mo2693I(), pianoPlay.f4633x.mo2692H());
        decorView.setDrawingCacheEnabled(true);
        return Bitmap.createBitmap(decorView.getDrawingCache());
    }

    /* renamed from: a */
    public final void mo2904a(byte b, byte b2, String str, byte[] bArr) {
        if (this.f4599R != null) {
            this.f4599R.mo2676a(b, (byte) 0, b2, str, bArr);
        } else {
            Toast.makeText(this, "连接已断开", Toast.LENGTH_SHORT).show();
        }
    }

    /* renamed from: a */
    public final void mo2905a(ListView listView, List list) {
        C1209io c1209io = (C1209io) listView.getAdapter();
        List a = m3783a(list, "M");
        if (c1209io == null) {
            ListAdapter c1209io2 = new C1209io(a, this.f4601T, this.f4615ak);
            if (listView != null) {
                listView.setAdapter(c1209io2);
                return;
            }
            return;
        }
        c1209io.mo3332a(a);
        c1209io.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo2906a(boolean z) {
        this.f4602U.setVisibility(View.GONE);
        Message obtainMessage = this.f4590I.obtainMessage();
        if (z) {
            obtainMessage.what = 7;
            Timer timer = new Timer();
            timer.schedule(new C1223jb(this, obtainMessage, timer), 0, 1000);
        } else {
            obtainMessage.what = 7;
            obtainMessage.arg1 = 0;
            this.f4590I.handleMessage(obtainMessage);
        }
        if (this.f4588G && !this.f4611ag) {
            try {
                this.f4610af.startRecording();
                this.f4611ag = true;
                new Thread(new C1226je(this)).start();
                Toast.makeText(this, "开始录音...", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                Toast.makeText(this, "录音出错...", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
                this.f4611ag = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo2907b(ListView listView, List list) {
        String str = "SC";
        if (this.f4615ak > 0) {
            str = "E";
        }
        listView.setAdapter(new C1035cc(m3783a(list, str), this.f4601T, this.f4615ak));
    }

    /* renamed from: c */
    final void mo2908c() {
        if (this.f4611ag) {
            this.f4588G = false;
            Toast.makeText(this, "录音完毕...，录音文件储存为SD卡中的Justpiano/Record/" + this.f4594M + ".wav", Toast.LENGTH_SHORT).show();
            if (this.f4610af != null && this.f4611ag) {
                this.f4611ag = false;
                this.f4610af.stop();
            }
        }
        if (this.f4610af != null) {
            this.f4610af.release();
            this.f4610af = null;
        }
    }

    /* renamed from: d */
    public final void mo2909d() {
        ConnectionService connectionService = this.f4599R;
        getClass().toString();
        ConnectionService.m3500b();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            finish();
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        switch (this.f4631v) {
            case 0:
                m3785a(this.f4631v, true);
                if (!this.f4605X) {
                    this.f4626q.f4710S = false;
                    this.f4605X = true;
                    this.f4591J.setVisibility(View.VISIBLE);
                    return;
                } else if (this.f4605X) {
                    this.f4605X = false;
                    this.f4591J.setVisibility(View.GONE);
                    this.f4626q.f4710S = false;
                    this.f4617h = false;
                    this.f4619j = true;
                    finish();
                    return;
                } else {
                    return;
                }
            case 1:
                m3785a(this.f4631v, true);
                if (!this.f4605X) {
                    this.f4626q.f4710S = false;
                    this.f4605X = true;
                    this.f4591J.setVisibility(View.VISIBLE);
                    return;
                } else if (this.f4605X) {
                    this.f4605X = false;
                    this.f4591J.setVisibility(View.GONE);
                    this.f4626q.f4710S = false;
                    this.f4617h = false;
                    this.f4619j = true;
                    finish();
                    return;
                } else {
                    return;
                }
            case 2:
                this.f4632w.mo3539b("提示");
                this.f4632w.mo3535a("退出弹奏并返回大厅？");
                this.f4632w.mo3536a("确定", new C1218ix(this));
                this.f4632w.mo3540b("取消", new C1219iy(this));
                this.f4632w.mo3541c();
                return;
            case 3:
                this.f4632w.mo3539b("提示");
                this.f4632w.mo3535a("退出考级并返回大厅？");
                this.f4632w.mo3536a("确定", new C1220iz(this));
                this.f4632w.mo3540b("取消", new C1222ja(this));
                this.f4632w.mo3541c();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3996b = 5;
        this.f4585D = (PowerManager) getSystemService("power");
        this.f4601T = LayoutInflater.from(this);
        this.f4605X = false;
        this.f4619j = false;
        setVolumeControlStream(3);
        this.f4622m = "";
        this.f4633x = (JPApplication) getApplication();
        if (this.f4633x.mo2692H() == 0) {
            this.f4621l = new C1253ke(this);
            new C1240js(this).execute();
        } else {
            m3794f();
        }
        /* renamed from: V */
        C1268kt.m4110b(this);
    }

    protected void onDestroy() {
        C1268kt.m4107a();
        C1268kt.m4108a(this);
        if (this.f4588G) {
            mo2908c();
        }
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();

        Bundle bundle = new Bundle();
        Intent intent;
        switch (this.f4631v) {
            case 0:
                this.f4605X = false;
                if (this.f4626q != null) {
                    this.f4626q.f4710S = false;
                }
                this.f4617h = false;
                if (!this.f4620k) {
                    finish();
                    return;
                }
                return;
            case 1:
                this.f4605X = false;
                if (this.f4626q != null) {
                    this.f4626q.f4710S = false;
                }
                this.f4617h = false;
                if (!this.f4620k) {
                    finish();
                    return;
                }
                return;
            case 2:
                if (!this.f4620k) {
                    this.f4605X = false;
                    if (this.f4626q != null) {
                        this.f4626q.f4710S = false;
                    }
                    this.f4617h = false;
                    this.f4619j = true;
                    mo2904a((byte) 8, (byte) 0, "", null);
                    if (!this.f3995a) {
                        intent = new Intent(this, OLPlayHall.class);
                        bundle.putString("hallName", this.f4607Z.getString("hallName"));
                        bundle.putByte("hallID", this.f4607Z.getByte("hallID"));
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.f4605X = false;
                if (this.f4626q != null) {
                    this.f4626q.f4710S = false;
                }
                this.f4617h = false;
                this.f4619j = true;
                if (!this.f3995a) {
                    intent = new Intent(this, OLPlayHall.class);
                    bundle.putString("hallName", this.f4607Z.getString("hallName"));
                    bundle.putByte("hallID", this.f4607Z.getByte("hallID"));
                    intent.putExtras(bundle);
                    startActivity(intent);
                    return;
                }
                return;
            default:
        }
    }

    protected void onResume() {
        if (this.f4619j) {
            finish();
            this.f4619j = false;
        }
        super.onResume();
    }

    protected void onStop() {
        super.onStop();
        if (this.f4619j) {
            this.f4619j = false;
            this.f4604W.mo2768a();
            this.f4617h = false;
            this.f4618i = false;
            this.f4620k = false;
            finish();
        }
    }
}
