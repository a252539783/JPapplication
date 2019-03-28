package ly.pp.addsongs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ly.pp.addsongs.OLPlayHallRoom */
public class OLPlayHallRoom extends BaseActivity implements OnClickListener {
    /* renamed from: A */
    public TabHost f4411A;
    /* renamed from: B */
    public TextView f4412B;
    /* renamed from: C */
    public TextView f4413C;
    /* renamed from: D */
    public TextView f4414D;
    /* renamed from: E */
    public TextView f4415E;
    /* renamed from: F */
    public TextView f4416F;
    /* renamed from: G */
    public TextView f4417G;
    /* renamed from: H */
    private Button f4418H;
    /* renamed from: I */
    private Button f4419I;
    /* renamed from: J */
    private Button f4420J;
    /* renamed from: K */
    private ImageView f4421K;
    /* renamed from: L */
    private ImageView f4422L;
    /* renamed from: M */
    private ImageView f4423M;
    /* renamed from: N */
    private ImageView f4424N;
    /* renamed from: O */
    private ImageView f4425O;
    /* renamed from: P */
    public C1253ke f4426P;
    /* renamed from: Q */
    private int f4427Q;
    /* renamed from: R */
    private int f4428R;
    /* renamed from: S */
    private int f4429S;
    /* renamed from: T */
    private int f4430T;
    /* renamed from: U */
    private String f4431U = "f";
    /* renamed from: V */
    public SharedPreferences f4432V = null;
    /* renamed from: W */
    private Editor f4433W = null;
    /* renamed from: X */
    private C1036cd f4434X = null;
    /* renamed from: Y */
    private C1036cd f4435Y = null;
    /* renamed from: Z */
    private C1036cd f4436Z = null;
    /* renamed from: aa */
    public ImageView f4437aa;
    /* renamed from: ab */
    public TextView f4438ab;
    /* renamed from: ac */
    private Button f4439ac;
    /* renamed from: ad */
    private Button f4440ad;
    /* renamed from: ae */
    public TextView f4441ae;
    /* renamed from: af */
    public TextView f4442af;
    /* renamed from: ag */
    public TextView f4443ag;
    /* renamed from: ah */
    public TextView f4444ah;
    /* renamed from: ai */
    private ImageView f4445ai;
    /* renamed from: aj */
    private ImageView f4446aj;
    /* renamed from: ak */
    private ImageView f4447ak;
    /* renamed from: al */
    private ImageView f4448al;
    /* renamed from: am */
    private ImageView f4449am;
    /* renamed from: an */
    private String f4450an;
    /* renamed from: ao */
    private int f4451ao;
    /* renamed from: ap */
    private int f4452ap;
    /* renamed from: aq */
    private int f4453aq;
    /* renamed from: ar */
    private int f4454ar;
    /* renamed from: as */
    public int[] f4455as = new int[]{R.drawable._none, R.drawable.couple_1, R.drawable.couple_2, R.drawable.couple_3};
    /* renamed from: at */
    public TextView f4456at;
    /* renamed from: h */
    public HashMap f4457h = new HashMap();
    /* renamed from: i */
    List f4458i = new ArrayList();
    /* renamed from: j */
    ListView f4459j;
    /* renamed from: k */
    public TextView f4460k;
    /* renamed from: l */
    public ScrollText f4461l;
    /* renamed from: m */
    public String f4462m = "";
    /* renamed from: n */
    public String f4463n = "";
    /* renamed from: o */
    public Button f4464o;
    /* renamed from: p */
    protected int f4465p = 1;
    /* renamed from: q */
    protected int f4466q;
    /* renamed from: r */
    protected boolean f4467r = false;
    /* renamed from: s */
    C1137fx f4468s = new C1137fx(this);
    /* renamed from: t */
    protected int f4469t = 0;
    /* renamed from: u */
    public JPApplication f4470u;
    /* renamed from: v */
    public ListView f4471v;
    /* renamed from: w */
    public List f4472w = new ArrayList();
    /* renamed from: x */
    public List f4473x = new ArrayList();
    /* renamed from: y */
    public ListView f4474y;
    /* renamed from: z */
    public ConnectionService f4475z;

    /* renamed from: a */
    private static Bitmap m3706a(Context context, String str, String str2, int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            try {
                return BitmapFactory.decodeStream(context.getResources().getAssets().open("mod/" + str + "_" + str2 + i2 + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            return BitmapFactory.decodeStream(context.getResources().getAssets().open("mod/_none.png"));
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo2839a(byte b, byte b2, String str) {
        if (this.f4475z != null) {
            this.f4475z.mo2676a(b, (byte) 0, b2, str, null);
        } else {
            Toast.makeText(this, "连接已断开", Toast.LENGTH_SHORT).show();
        }
    }

    /* renamed from: a */
    public final void mo2840a(int i) {
        this.f4473x.remove(i);
        this.f4434X.mo3119a(this.f4473x);
        this.f4434X.notifyDataSetChanged();
        mo2848c();
    }

    /* renamed from: a */
    protected final void mo2841a(int i, String str, String str2) {
        if (i == 3) {
            this.f4411A.setCurrentTab(1);
        }
        C1302m c1302m = new C1302m(this);
        c1302m.mo3539b(str);
        c1302m.mo3535a(str2);
        c1302m.mo3536a("确定", new C1125fl(this));
        try {
            c1302m.mo3541c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo2842a(Bundle bundle) {
        this.f4462m = bundle.getString("U");
        this.f4463n = bundle.getString("M");
        int i = bundle.getInt("C");
        int i2 = bundle.getInt("D");
        this.f4460k.setText(this.f4462m);
        this.f4460k.setTextColor(getResources().getColor(i));
        this.f4461l.setText(this.f4463n);
        this.f4460k.setTextColor(getResources().getColor(i2));
    }

    /* renamed from: a */
    public final void mo2843a(ListView listView, List list) {
        if (!(list == null || list.isEmpty())) {
            Collections.sort(list, new C1130fq(this));
        }
        if (this.f4435Y == null) {
            this.f4435Y = new C1036cd(list, (JPApplication) getApplicationContext(), 0, this);
            listView.setAdapter(this.f4435Y);
            return;
        }
        this.f4435Y.mo3119a(list);
        this.f4435Y.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo2844a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4431U = jSONObject.getString("S");
            this.f4427Q = jSONObject.getInt("T");
            this.f4428R = jSONObject.getInt("J");
            this.f4429S = jSONObject.getInt("H");
            this.f4430T = jSONObject.getInt("O");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f4421K.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "m", 1));
        this.f4422L.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "t", this.f4427Q));
        this.f4423M.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "j", this.f4428R));
        this.f4424N.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "h", this.f4429S));
        this.f4425O.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "s", this.f4430T));
    }

    /* renamed from: a */
    public final void mo2845a(String str, int i) {
        String str2;
        String str3;
        View inflate = getLayoutInflater().inflate(R.layout.message_send, (ViewGroup) findViewById(R.id.dialog));
        TextView textView = (TextView) inflate.findViewById(R.id.text_1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.title_1);
        TextView textView3 = (TextView) inflate.findViewById(R.id.title_2);
        ((TextView) inflate.findViewById(R.id.text_2)).setVisibility(View.GONE);
        textView3.setVisibility(View.GONE);
        textView2.setText("内容");
        if (i == 0) {
            str2 = "发送";
            str3 = "发送私信给:" + str;
        } else if (i == 1) {
            str3 = "设置祝语";
            str2 = "修改";
        } else {
            return;
        }
        new C1302m(this).mo3539b(str3).mo3534a(inflate).mo3536a(str2, new C1132fs(this, textView, i, str)).mo3540b("取消", new C1133ft(this)).mo3541c();
    }

    /* renamed from: b */
    public final void mo2846b(ListView listView, List list) {
        if (!(list == null || list.isEmpty())) {
            Collections.sort(list, new C1131fr(this));
        }
        if (this.f4436Z == null) {
            this.f4436Z = new C1036cd(list, (JPApplication) getApplicationContext(), 1, this);
            listView.setAdapter(this.f4436Z);
            return;
        }
        this.f4436Z.mo3119a(list);
        this.f4436Z.notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo2847b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4450an = jSONObject.getString("S");
            this.f4451ao = jSONObject.getInt("T");
            this.f4452ap = jSONObject.getInt("J");
            this.f4453aq = jSONObject.getInt("H");
            this.f4454ar = jSONObject.getInt("O");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f4445ai.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4450an, "m", 1));
        this.f4446aj.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4450an, "t", this.f4451ao));
        this.f4447ak.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4450an, "j", this.f4452ap));
        this.f4448al.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4450an, "h", this.f4453aq));
        this.f4449am.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4450an, "s", this.f4454ar));
    }

    /* renamed from: c */
    public final void mo2848c() {
        int size = this.f4473x.size();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("F", ((Bundle) this.f4473x.get(i)).getString("F"));
                jSONObject.put("M", ((Bundle) this.f4473x.get(i)).getString("M"));
                jSONObject.put("T", ((Bundle) this.f4473x.get(i)).getString("T"));
                if (((Bundle) this.f4473x.get(i)).containsKey("type")) {
                    jSONObject.put("type", ((Bundle) this.f4473x.get(i)).getInt("type"));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONArray.toString();
        this.f4433W.putString("mailsString", jSONArray.toString());
        this.f4433W.commit();
    }

    /* renamed from: c */
    public final void mo2849c(ListView listView, List list) {
        if (this.f4434X == null) {
            this.f4434X = new C1036cd(list, (JPApplication) getApplicationContext(), 2, this);
            listView.setAdapter(this.f4434X);
            return;
        }
        this.f4434X.mo3119a(list);
        this.f4434X.notifyDataSetChanged();
    }

    /* renamed from: c */
    public final void mo2850c(String str) {
        if (!str.equals("")) {
            C1302m c1302m = new C1302m(this);
            c1302m.mo3539b("好友请求");
            c1302m.mo3535a("[" + str + "]请求加您为好友,同意吗?");
            c1302m.mo3536a("同意", new C1128fo(this, str));
            c1302m.mo3540b("拒绝", new C1129fp(this));
            try {
                c1302m.mo3541c();
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: d */
    public final void mo2851d() {
        ConnectionService connectionService = this.f4475z;
        getClass().toString();
        ConnectionService.m3500b();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            Bundle extras = intent.getExtras();
            this.f4431U = extras.getString("S");
            this.f4427Q = extras.getInt("T");
            this.f4428R = extras.getInt("J");
            this.f4429S = extras.getInt("H");
            this.f4430T = extras.getInt("O");
            this.f4421K.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "m", 1));
            this.f4422L.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "t", this.f4427Q));
            this.f4423M.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "j", this.f4428R));
            this.f4424N.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "h", this.f4429S));
            this.f4425O.setImageBitmap(OLPlayHallRoom.m3706a(this, this.f4431U, "s", this.f4430T));
        }
    }

    public void onBackPressed() {
        try {
            C1268kt.m4107a();
            C1268kt.m4111c();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mo2839a((byte) 11, (byte) 0, "");
        startActivity(new Intent(this, OLMainMode.class));
        finish();
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        JSONObject jSONObject;
        switch (view.getId()) {
            case R.id.ol_player_mod:
                if (this.f4465p < 0) {
                    Toast.makeText(this, "您级别小于8级,无权使用换装功能!", Toast.LENGTH_SHORT).show();
                    return;
                }
                intent.setClass(this, OLPlayDressRoom.class);
                intent.putExtra("T", this.f4427Q - 1);
                intent.putExtra("J", this.f4428R - 1);
                intent.putExtra("H", this.f4429S - 1);
                intent.putExtra("S", this.f4431U);
                intent.putExtra("Lv", this.f4465p);
                intent.putExtra("O", this.f4430T - 1);
                startActivityForResult(intent, 0);
                return;
            case R.id.pre_button:
                this.f4469t -= 20;
                if (this.f4469t < 0) {
                    this.f4469t = 0;
                    return;
                }
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("T", "L");
                    jSONObject.put("B", this.f4469t);
                    mo2839a((byte) 34, (byte) 0, jSONObject.toString());
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            case R.id.online_button:
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("T", "L");
                    jSONObject.put("B", -1);
                    mo2839a((byte) 34, (byte) 0, jSONObject.toString());
                    return;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            case R.id.next_button:
                if (!this.f4467r) {
                    this.f4469t += 20;
                    if (this.f4469t >= 0) {
                        try {
                            jSONObject = new JSONObject();
                            jSONObject.put("T", "L");
                            jSONObject.put("B", this.f4469t);
                            mo2839a((byte) 34, (byte) 0, jSONObject.toString());
                            return;
                        } catch (JSONException e22) {
                            e22.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                return;
            case R.id.ol_breakup_button:
                if (this.f4466q > 0) {
                    C1302m c1302m = new C1302m(this);
                    c1302m.mo3539b("确定解除");
                    c1302m.mo3535a("当初你们搭档的时候，需要两个人的同意，但是解搭，只是你不同意而已，你搭档同意没？");
                    c1302m.mo3536a("同意", new C1134fu(this)).mo3540b("没同意", new C1126fm(this));
                    try {
                        c1302m.mo3541c();
                        return;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        return;
                    }
                }
                return;
            case R.id.ol_setblessing_button:
                if (this.f4466q > 0) {
                    mo2845a("", 1);
                    return;
                }
                return;
            case R.id.ol_dress_button:
                if (this.f4465p < 0) {
                    Toast.makeText(this, "您级别小于8级,无权使用换装功能!", Toast.LENGTH_SHORT).show();
                    return;
                }
                intent.setClass(this, OLPlayDressRoom.class);
                intent.putExtra("T", this.f4427Q - 1);
                intent.putExtra("J", this.f4428R - 1);
                intent.putExtra("H", this.f4429S - 1);
                intent.putExtra("S", this.f4431U);
                intent.putExtra("Lv", this.f4465p);
                intent.putExtra("O", this.f4430T - 1);
                startActivityForResult(intent, 0);
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3996b = 1;
        C1268kt.m4107a();
        C1268kt.m4110b(this);
        this.f4426P = new C1253ke(this);
        this.f4457h.clear();
        switch (getIntent().getIntExtra("HEAD", 0)) {
            case 1:
                Toast.makeText(this, "登陆成功！本版由梦魂☆梦回出品", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "您的账号重复登录,可能无法正常游戏！", Toast.LENGTH_SHORT).show();
                break;
        }
        this.f4470u = (JPApplication) getApplication();
        this.f4432V = getSharedPreferences("mails_" + this.f4470u.mo2701P(), 0);
        this.f4433W = this.f4432V.edit();
        this.f4470u.mo2728f(1);
        setContentView(R.layout.olplayhallroom);
        this.f4470u.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        JPApplication jPApplication = this.f4470u;
        JPApplication jPApplication2 = this.f4470u;
        jPApplication.mo2718c(0);
        this.f4471v = (ListView) findViewById(R.id.ol_hall_list);
        this.f4471v.setCacheColorHint(0);
        this.f4472w.clear();
        this.f4459j = (ListView) findViewById(R.id.ol_friend_list);
        this.f4459j.setCacheColorHint(0);
        this.f4474y = (ListView) findViewById(R.id.ol_mail_list);
        this.f4474y.setCacheColorHint(0);
        this.f4458i.clear();
        this.f4475z = this.f4470u.mo2697M();
        this.f4411A = (TabHost) findViewById(R.id.tabhost);
        this.f4411A.setup();
        TabSpec newTabSpec = this.f4411A.newTabSpec("tab1");
        newTabSpec.setContent(R.id.friend_tab);
        newTabSpec.setIndicator("好友");
        this.f4411A.addTab(newTabSpec);
        newTabSpec = this.f4411A.newTabSpec("tab2");
        newTabSpec.setContent(R.id.infor_tab);
        newTabSpec.setIndicator("资料");
        this.f4411A.addTab(newTabSpec);
        this.f4412B = (TextView) findViewById(R.id.ol_player_name);
        this.f4412B.setText("");
        this.f4464o = (Button) findViewById(R.id.ol_dress_button);
        this.f4464o.setText("换衣间");
        this.f4464o.setOnClickListener(this);
        this.f4414D = (TextView) findViewById(R.id.ol_player_level);
        this.f4417G = (TextView) findViewById(R.id.user_exp);
        this.f4414D.setText("");
        this.f4415E = (TextView) findViewById(R.id.ol_player_class);
        this.f4415E.setText("");
        this.f4416F = (TextView) findViewById(R.id.user_classname);
        this.f4416F.setText("");
        this.f4417G.setText("");
        this.f4413C = (TextView) findViewById(R.id.user_mailcount);
        this.f4413C.setText("");
        this.f4421K = (ImageView) findViewById(R.id.ol_player_mod);
        this.f4421K.setOnClickListener(this);
        this.f4422L = (ImageView) findViewById(R.id.ol_player_trousers);
        this.f4423M = (ImageView) findViewById(R.id.ol_player_jacket);
        this.f4424N = (ImageView) findViewById(R.id.ol_player_hair);
        this.f4425O = (ImageView) findViewById(R.id.ol_player_shoes);
        this.f4461l = (ScrollText) findViewById(R.id.broadCastText);
        this.f4460k = (TextView) findViewById(R.id.systemText);
        this.f4460k.setText(this.f4462m);
        this.f4461l.setText(this.f4463n);
        this.f4461l.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f4437aa = (ImageView) findViewById(R.id.ol_player_couple);
        this.f4418H = (Button) findViewById(R.id.pre_button);
        this.f4419I = (Button) findViewById(R.id.next_button);
        this.f4420J = (Button) findViewById(R.id.online_button);
        this.f4418H.setOnClickListener(this);
        this.f4419I.setOnClickListener(this);
        this.f4420J.setOnClickListener(this);
        newTabSpec = this.f4411A.newTabSpec("tab3");
        newTabSpec.setContent(R.id.couple_tab);
        newTabSpec.setIndicator("搭档");
        this.f4411A.addTab(newTabSpec);
        newTabSpec = this.f4411A.newTabSpec("tab4");
        newTabSpec.setContent(R.id.msg_tab);
        newTabSpec.setIndicator("信箱");
        this.f4411A.addTab(newTabSpec);
        this.f4438ab = (TextView) findViewById(R.id.ol_couple_name);
        this.f4438ab.setText("");
        this.f4440ad = (Button) findViewById(R.id.ol_breakup_button);
        this.f4440ad.setText("解除搭档");
        this.f4439ac = (Button) findViewById(R.id.ol_setblessing_button);
        this.f4439ac.setText("设置祝语");
        this.f4440ad.setOnClickListener(this);
        this.f4439ac.setOnClickListener(this);
        this.f4441ae = (TextView) findViewById(R.id.ol_couple_level);
        this.f4441ae.setText("");
        this.f4442af = (TextView) findViewById(R.id.couple_points);
        this.f4443ag = (TextView) findViewById(R.id.ol_couple_class);
        this.f4443ag.setText("");
        this.f4456at = (TextView) findViewById(R.id.ol_couple_blessing);
        this.f4444ah = (TextView) findViewById(R.id.couple_classname);
        this.f4444ah.setText("");
        this.f4445ai = (ImageView) findViewById(R.id.ol_couple_mod);
        this.f4445ai.setOnClickListener(this);
        this.f4446aj = (ImageView) findViewById(R.id.ol_couple_trousers);
        this.f4447ak = (ImageView) findViewById(R.id.ol_couple_jacket);
        this.f4448al = (ImageView) findViewById(R.id.ol_couple_hair);
        this.f4449am = (ImageView) findViewById(R.id.ol_couple_shoes);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int childCount = this.f4411A.getTabWidget().getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f4411A.getTabWidget().getChildTabViewAt(i).getLayoutParams().height = (displayMetrics.heightPixels * 45) / 480;
            //((TextView) this.f4411A.getTabWidget().getChildAt(i).findViewById(16908310)).setTextColor(-1);
        }
        this.f4411A.setOnTabChangedListener(new C1127fn(this));
        this.f4411A.setCurrentTab(1);
        mo2839a((byte) 28, (byte) 0, "");
    }

    protected void onDestroy() {
        this.f4472w.clear();
        this.f4458i.clear();
        this.f4473x.clear();
        C1268kt.m4107a();
        C1268kt.m4108a(this);
        super.onDestroy();
    }

    public void onPause() {

        super.onPause();
    }

    protected void onResume() {

        super.onResume();
    }
}
