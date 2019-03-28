package ly.pp.addsongs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;



/* renamed from: ly.pp.addsongs.OLPlayRoom */
public class OLPlayRoom extends BaseActivity implements Callback, OnClickListener {
    public static int diao;
    /* renamed from: A */
    public int f4476A = 0;
    /* renamed from: B */
    protected byte f4477B;
    /* renamed from: C */
    protected String f4478C;
    /* renamed from: D */
    List f4479D = new ArrayList();
    /* renamed from: E */
    protected String f4480E = "";
    /* renamed from: F */
    protected boolean f4481F;
    /* renamed from: G */
    C1164gx f4482G;
    /* renamed from: H */
    private Button f4483H;
    /* renamed from: I */
    private Button f4484I;
    /* renamed from: J */
    private Button f4485J;
    /* renamed from: K */
    public ScrollText f4486K;
    /* renamed from: L */
    public TextView f4487L;
    /* renamed from: M */
    private TextView f4488M;
    /* renamed from: N */
    private ImageView f4489N;
    /* renamed from: O */
    public ListView f4490O;
    /* renamed from: P */
    private LayoutInflater f4491P;
    /* renamed from: Q */
    public List f4492Q = new ArrayList();
    /* renamed from: R */
    public int f4493R = 100;
    /* renamed from: S */
    public GridView f4494S;
    /* renamed from: T */
    private List f4495T = new ArrayList();
    /* renamed from: U */
    public List f4496U = new ArrayList();
    /* renamed from: V */
    private PopupWindow f4497V = null;
    /* renamed from: W */
    private PopupWindow f4498W = null;
    /* renamed from: X */
    private PopupWindow f4499X = null;
    /* renamed from: Y */
    private PopupWindow f4500Y = null;
    /* renamed from: Z */
    private PopupWindow f4501Z = null;
    /* renamed from: aa */
    public TabHost f4502aa;
    /* renamed from: ab */
    private C1191hx f4503ab;
    /* renamed from: ac */
    private C1213is f4504ac;
    /* renamed from: ad */
    public SQLiteDatabase f4505ad;
    /* renamed from: ae */
    private Cursor f4506ae;
    /* renamed from: af */
    private TextView f4507af;
    /* renamed from: ag */
    public boolean f4508ag = true;
    /* renamed from: ah */
    public String f4509ah = "";
    /* renamed from: ai */
    private String f4510ai = "online = 1";
    /* renamed from: aj */
    private String[] f4511aj = new String[]{"_id", "name", "item", "path", "diff", "isfavo"};
    /* renamed from: ak */
    private C1268kt f4512ak;
    /* renamed from: al */
    public ListView f4513al;
    /* renamed from: am */
    public ListView f4514am;
    /* renamed from: an */
    private String f4515an = "";
    /* renamed from: ao */
    public int f4516ao = 0;
    /* renamed from: ap */
    private int f4517ap;
    /* renamed from: aq */
    private int[] f4518aq;
    /* renamed from: ar */
    private Button f4519ar;
    /* renamed from: as */
    private Button f4520as;
    /* renamed from: at */
    private Button f4521at;
    /* renamed from: au */
    public int f4522au;
    /* renamed from: av */
    private C1195ia f4523av;
    /* renamed from: h */
    String f4524h = "H";
    /* renamed from: i */
    String f4525i = "G";
    /* renamed from: j */
    String f4526j = "O";
    /* renamed from: k */
    String f4527k = "C";
    /* renamed from: l */
    C1245jx f4528l;
    /* renamed from: m */
    byte f4529m;
    /* renamed from: n */
    String f4530n;
    /* renamed from: o */
    JPApplication f4531o = null;
    /* renamed from: p */
    TextView f4532p;
    /* renamed from: q */
    String f4533q = "";
    /* renamed from: r */
    Button f4534r;
    /* renamed from: s */
    Button f4535s;
    /* renamed from: t */
    C1243jv f4536t;
    /* renamed from: u */
    public ConnectionService f4537u;
    /* renamed from: v */
    Bundle f4538v;
    /* renamed from: w */
    Bundle f4539w;
    /* renamed from: x */
    public Handler f4540x;
    /* renamed from: y */
    public ListView f4541y = null;
    /* renamed from: z */
    public boolean f4542z;
    public int zuoyou;

    public OLPlayRoom() {
        diao = 0;
        this.zuoyou = 0;
        this.f4517ap = 0;
        this.f4518aq = new int[]{R.drawable._none, R.drawable.couple_1, R.drawable.couple_2, R.drawable.couple_3};
        this.f4481F = false;
        this.f4522au = 0;
        this.f4482G = new C1164gx(this);
        this.f4523av = null;
    }

    /* renamed from: a */
    private void m3744a(int i, int i2) {
        String str = "";
        String str2 = "";
        if (!this.f4510ai.equals("")) {
            str = " AND " + this.f4510ai;
        }
        this.f4515an = "diff >= " + i + " AND diff < " + i2 + str;
        Cursor query = this.f4505ad.query("jp_data", this.f4511aj, this.f4515an, null, null, null, null);
        str = query.moveToPosition((int) (Math.random() * ((double) query.getCount()))) ? query.getString(query.getColumnIndex("path")) : str2;
        mo2857a((byte) 15, this.f4529m, this.f4477B, str.substring(6, str.length() - 3));
        query.close();
        this.f4498W.dismiss();
    }

    /* renamed from: a */
    private void m3745a(int i, PopupWindow popupWindow) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("G", i);
            mo2857a((byte) 44, this.f4529m, this.f4477B, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: a */
    private void m3746a(String str, String str2) {
        View inflate = getLayoutInflater().inflate(R.layout.ol_couple_dialog, (ViewGroup) findViewById(R.id.dialog));
        try {
            JSONObject jSONObject = new JSONObject(C1340nk.m4156b(str2));
            JSONObject jSONObject2 = jSONObject.getJSONObject("P");
            C1245jx c1245jx = new C1245jx(jSONObject2.getString("N"), jSONObject2.getJSONObject("D"), jSONObject2.getString("S"), jSONObject2.getInt("L"), jSONObject2.getInt("C"));
            JSONObject jSONObject3 = jSONObject.getJSONObject("C");
            C1245jx c1245jx2 = new C1245jx(jSONObject3.getString("N"), jSONObject3.getJSONObject("D"), jSONObject3.getString("S"), jSONObject3.getInt("L"), jSONObject3.getInt("C"));
            JSONObject jSONObject4 = jSONObject.getJSONObject("I");
            TextView textView = (TextView) inflate.findViewById(R.id.ol_player_level);
            TextView textView2 = (TextView) inflate.findViewById(R.id.ol_player_class);
            TextView textView3 = (TextView) inflate.findViewById(R.id.ol_player_clname);
            TextView textView4 = (TextView) inflate.findViewById(R.id.ol_couple_name);
            TextView textView5 = (TextView) inflate.findViewById(R.id.ol_couple_level);
            TextView textView6 = (TextView) inflate.findViewById(R.id.ol_couple_class);
            TextView textView7 = (TextView) inflate.findViewById(R.id.ol_couple_clname);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.ol_player_mod);
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.ol_player_trousers);
            ImageView imageView3 = (ImageView) inflate.findViewById(R.id.ol_player_jacket);
            ImageView imageView4 = (ImageView) inflate.findViewById(R.id.ol_player_hair);
            ImageView imageView5 = (ImageView) inflate.findViewById(R.id.ol_player_shoes);
            ImageView imageView6 = (ImageView) inflate.findViewById(R.id.ol_couple_mod);
            ImageView imageView7 = (ImageView) inflate.findViewById(R.id.ol_couple_trousers);
            ImageView imageView8 = (ImageView) inflate.findViewById(R.id.ol_couple_jacket);
            ImageView imageView9 = (ImageView) inflate.findViewById(R.id.ol_couple_hair);
            ImageView imageView10 = (ImageView) inflate.findViewById(R.id.ol_couple_shoes);
            TextView textView8 = (TextView) inflate.findViewById(R.id.couple_bless);
            TextView textView9 = (TextView) inflate.findViewById(R.id.couple_pionts);
            ImageView imageView11 = (ImageView) inflate.findViewById(R.id.couple_type);
            ((TextView) inflate.findViewById(R.id.ol_player_name)).setText(c1245jx.mo3385a());
            textView.setText("LV." + c1245jx.mo3397h());
            textView2.setText("CL." + c1245jx.mo3401l());
            textView3.setText(C1194i.f5602f[c1245jx.mo3401l()]);
            textView4.setText(c1245jx2.mo3385a());
            textView5.setText("LV." + c1245jx2.mo3397h());
            textView6.setText("CL." + c1245jx2.mo3401l());
            textView7.setText(C1194i.f5602f[c1245jx2.mo3401l()]);
            textView8.setText(jSONObject4.getString("B"));
            TextView textView10 = textView9;
            textView10.setText(String.valueOf(jSONObject4.getInt("P")));
            ImageView imageView12 = imageView11;
            imageView12.setImageResource(this.f4518aq[jSONObject4.getInt("T")]);
            imageView.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx.mo3388b() + "_m0.png")));
            if (c1245jx.mo3398i() <= 0) {
                imageView2.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView2.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx.mo3388b() + "_t" + (c1245jx.mo3398i() - 1) + ".png")));
            }
            if (c1245jx.mo3399j() <= 0) {
                imageView3.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView3.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx.mo3388b() + "_j" + (c1245jx.mo3399j() - 1) + ".png")));
            }
            if (c1245jx.mo3400k() <= 0) {
                imageView4.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView4.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx.mo3388b() + "_h" + (c1245jx.mo3400k() - 1) + ".png")));
            }
            if (c1245jx.mo3404o() <= 0) {
                imageView5.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView5.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx.mo3388b() + "_s" + (c1245jx.mo3404o() - 1) + ".png")));
            }
            imageView6.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx2.mo3388b() + "_m0.png")));
            if (c1245jx2.mo3398i() <= 0) {
                imageView7.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView7.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx2.mo3388b() + "_t" + (c1245jx2.mo3398i() - 1) + ".png")));
            }
            if (c1245jx2.mo3399j() <= 0) {
                imageView8.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView8.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx2.mo3388b() + "_j" + (c1245jx2.mo3399j() - 1) + ".png")));
            }
            if (c1245jx2.mo3400k() <= 0) {
                imageView9.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView9.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx2.mo3388b() + "_h" + (c1245jx2.mo3400k() - 1) + ".png")));
            }
            if (c1245jx2.mo3404o() <= 0) {
                imageView10.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/_none.png")));
            } else {
                imageView10.setImageBitmap(BitmapFactory.decodeStream(getResources().getAssets().open("mod/" + c1245jx2.mo3388b() + "_s" + (c1245jx2.mo3404o() - 1) + ".png")));
            }
            new C1302m(this).mo3539b(str).mo3534a(inflate).mo3536a("祝福", new C1156gp(this, jSONObject4)).mo3540b("取消", new C1157gq(this)).mo3541c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m3749b(int i) {
        this.f4502aa.setCurrentTab(2);
        String str = "";
        if (!this.f4510ai.equals("")) {
            str = " AND " + this.f4510ai;
        }
        switch (i) {
            case 0:
                this.f4515an = "item = '" + C1194i.f5598b[0] + "'" + str;
                break;
            case 1:
                this.f4515an = "item = '" + C1194i.f5598b[1] + "' OR item = '" + C1194i.f5598b[3] + "'" + str;
                break;
            case 2:
                this.f4515an = "item = '" + C1194i.f5598b[4] + "' OR item = '" + C1194i.f5598b[5] + "'" + str;
                break;
            case 3:
                this.f4515an = "item = '" + C1194i.f5598b[2] + "'" + str;
                break;
            case 4:
                this.f4515an = "item = '" + C1194i.f5598b[6] + "'" + str;
                break;
            case 5:
                this.f4515an = "item = '" + C1194i.f5598b[7] + "'" + str;
                break;
        }
        if (!this.f4515an.equals("")) {
            this.f4506ae = this.f4505ad.query("jp_data", this.f4511aj, this.f4515an, null, null, null, null);
            this.f4503ab.changeCursor(this.f4506ae);
            this.f4503ab.notifyDataSetChanged();
        }
        this.f4498W.dismiss();
    }

    /* renamed from: h */
    public void m3756h() {
        if (!this.f4515an.equals("")) {
            this.f4506ae = this.f4505ad.query("jp_data", this.f4511aj, this.f4515an, null, null, null, null);
            this.f4503ab.changeCursor(this.f4506ae);
            this.f4503ab.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo2857a(byte b, byte b2, byte b3, String str) {
        if (this.f4537u != null) {
            this.f4537u.mo2676a(b, b2, b3, str, null);
        } else {
            Toast.makeText(this, "连接已断开", Toast.LENGTH_SHORT).show();
        }
    }

    /* renamed from: a */
    public final void mo2858a(byte b, C1245jx c1245jx) {
        this.f4531o.mo2700O().put(Byte.valueOf(b), c1245jx);
    }

    /* renamed from: a */
    public final void mo2859a(int i) {
        this.f4517ap = i;
    }

    /* renamed from: a */
    protected final void mo2860a(int i, String str, int i2, byte b) {
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "情侣";
        switch (i2) {
            case 0:
                return;
            case 1:
                str5 = "情意绵绵的情侣";
                break;
            case 2:
                str5 = "基情四射的基友";
                break;
            case 3:
                str5 = "百年好合的百合";
                break;
        }
        if (i == 1) {
            str3 = "搭档请求";
            str4 = "邀请";
            str = "您与" + str + "双人模式中最高连击总和超过200,是否邀请对方结为一对" + str5 + "?";
        } else if (i == 2) {
            str3 = "搭档请求";
            str4 = "同意";
            str = new StringBuilder(String.valueOf(str)).append("请求与您结为一对").append(str5).append(",是否同意?").toString();
        } else if (i == 3) {
            str3 = "喜告";
            str4 = "确定";
            str = "祝贺" + str + "成为一对" + str5 + "!";
        } else if (i == 4) {
            m3746a(str5.substring(str5.length() - 2) + "证书", str);
            return;
        } else if (i == 5) {
            str3 = "提示";
            str4 = "确定";
        } else {
            str = str4;
            str4 = str3;
            str3 = str2;
        }
        C1302m c1302m = new C1302m(this);
        c1302m.mo3537a();
        c1302m.mo3539b(str3).mo3535a(str).mo3536a(str4, new C1158gr(this, i, b, i2)).mo3540b("取消", new C1159gs(this)).mo3541c();
    }

    /* renamed from: a */
    public final void mo2861a(GridView gridView, Bundle bundle) {
        this.f4495T.clear();
        if (bundle != null) {
            int size = bundle.size() - 2;
            for (int i = 0; i < size; i++) {
                this.f4495T.add(bundle.getBundle(String.valueOf(i)));
            }
            List list = this.f4495T;
            String str = "PI";
            if (!(list == null || list.isEmpty())) {
                Collections.sort(list, new C1160gt(this, str));
            }
            gridView.setAdapter(new C1196ib(list, this));
        }
    }

    /* renamed from: a */
    public final void mo2862a(ListView listView, List list) {
        listView.setAdapter(new C1081dv(list, this.f4491P));
        listView.setSelection(this.f4493R - 1);
    }

    /* renamed from: a */
    public final void mo2863a(ListView listView, List list, int i) {
        if (!(list == null || list.isEmpty())) {
            Collections.sort(list, new C1153gm(this));
        }
        listView.setAdapter(new C1036cd(list, (JPApplication) getApplicationContext(), i, this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final String[] mo2864a(String str) {
        Throwable th;
        Cursor cursor = null;
        String[] strArr = new String[2];
        Cursor query;
        try {
            query = this.f4505ad.query("jp_data", this.f4511aj, "path = '" + str + "'" + (!this.f4510ai.equals("") ? " AND " + this.f4510ai : ""), null, null, null, null);
            try {
                if (query.moveToNext()) {
                    strArr[0] = query.getString(query.getColumnIndex("name"));
                    strArr[1] = query.getString(query.getColumnIndex("diff"));
                }
                if (query != null) {
                    query.close();
                }
            } catch (Exception e) {
                if (query != null) {
                    query.close();
                }
                return strArr;
            } catch (Throwable th2) {
                cursor = query;
                th = th2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (Exception e2) {
            query = null;
        } catch (Throwable th3) {
            if (cursor != null) {
                cursor.close();
            }
        }
        return strArr;
    }

    /* renamed from: b */
    final void mo2865b(String str) {
        View inflate = getLayoutInflater().inflate(R.layout.message_send, (ViewGroup) findViewById(R.id.dialog));
        TextView textView = (TextView) inflate.findViewById(R.id.text_1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.title_1);
        TextView textView3 = (TextView) inflate.findViewById(R.id.title_2);
        ((TextView) inflate.findViewById(R.id.text_2)).setVisibility(View.GONE);
        textView3.setVisibility(View.GONE);
        textView2.setText("内容");
        new C1302m(this).mo3539b("发送私信给:" + str).mo3534a(inflate).mo3536a("发送", new C1154gn(this, textView, str)).mo3540b("取消", new C1155go(this)).mo3541c();
    }

    /* renamed from: c */
    public final int mo2866c() {
        return this.f4517ap;
    }

    /* renamed from: c */
    public final void mo2867c(String str) {
        this.f4509ah = "@" + str + ":";
        if (!(str.equals("") || str.equals(this.f4531o.mo2702Q()))) {
            this.f4487L.setText(this.f4509ah);
        }
        CharSequence text = this.f4487L.getText();
        if (text instanceof Spannable) {
            Selection.setSelection((Spannable) text, text.length());
        }
    }

    /* renamed from: d */
    public final Handler mo2868d() {
        return this.f4540x;
    }

    /* renamed from: e */
    public final String mo2869e() {
        return this.f4533q;
    }

    /* renamed from: f */
    public final void mo2870f() {
        ConnectionService connectionService = this.f4537u;
        getClass().toString();
        ConnectionService.m3500b();
    }

    /* renamed from: g */
    public final int mo2871g() {
        return this.f4516ao;
    }

    public final int getdiao() {
        return diao;
    }

    public boolean handleMessage(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                mo2857a((byte) 15, this.f4529m, this.f4477B, data.getString("S"));
                break;
            case 3:
                CharSequence format = SimpleDateFormat.getTimeInstance(3, Locale.ENGLISH).format(new Date());
                if (this.f4507af != null) {
                    this.f4507af.setText(format);
                    break;
                }
                break;
        }
        return false;
    }

    public void onBackPressed() {
        C1302m c1302m = new C1302m(this);
        c1302m.mo3539b("提示");
        c1302m.mo3535a("退出房间并返回大厅？");
        c1302m.mo3536a("确定", new C1162gv(this));
        c1302m.mo3540b("取消", new C1163gw(this));
        try {
            c1302m.mo3541c();
        } catch (Exception e) {
        }
    }

    public void onClick(View view) {
        String str;
        PopupWindow popupWindow;
        JSONObject jSONObject;
        TextView textView;
        int i;
        switch (view.getId()) {
            case R.id.favor:
                this.f4502aa.setCurrentTab(2);
                str = "";
                if (!this.f4510ai.equals("")) {
                    str = " AND " + this.f4510ai;
                }
                this.f4515an = "isfavo = 1" + str;
                if (!this.f4515an.equals("")) {
                    this.f4506ae = this.f4505ad.query("jp_data", this.f4511aj, this.f4515an, null, null, null, null);
                    this.f4503ab.changeCursor(this.f4506ae);
                    this.f4503ab.notifyDataSetChanged();
                }
                this.f4498W.dismiss();
                return;
            case R.id.couple_1:
                m3745a(1, this.f4500Y);
                return;
            case R.id.couple_2:
                m3745a(2, this.f4500Y);
                return;
            case R.id.couple_6:
                m3745a(6, this.f4500Y);
                return;
            case R.id.couple_4:
                m3745a(4, this.f4500Y);
                return;
            case R.id.couple_5:
                m3745a(5, this.f4500Y);
                return;
            case R.id.couple_3:
                m3745a(3, this.f4500Y);
                return;
            case R.id.group_1:
                m3745a(1, this.f4499X);
                return;
            case R.id.group_2:
                m3745a(2, this.f4499X);
                return;
            case R.id.group_3:
                m3745a(3, this.f4499X);
                return;
            case R.id.left_hand:
                popupWindow = this.f4501Z;
                this.zuoyou = 1;
                m3745a(1, popupWindow);
                return;
            case R.id.right_hand:
                popupWindow = this.f4501Z;
                this.zuoyou = 0;
                m3745a(0, popupWindow);
                return;
            case R.id.rand_0:
                m3744a(0, 3);
                return;
            case R.id.rand_all:
                m3744a(0, 20);
                return;
            case R.id.rand_5:
                m3744a(5, 7);
                return;
            case R.id.rand_3:
                m3744a(3, 5);
                return;
            case R.id.rand_7:
                m3749b(5);
                return;
            case R.id.add_favor:
                ContentValues contentValues = new ContentValues();
                contentValues.put("isfavo", Integer.valueOf(1));
                this.f4505ad.update("jp_data", contentValues, "path = '" + this.f4480E + "'", null);
                contentValues.clear();
                this.f4498W.dismiss();
                m3756h();
                return;
            case R.id.type_l:
                m3749b(1);
                return;
            case R.id.type_j:
                m3749b(0);
                return;
            case R.id.type_e:
                m3749b(3);
                return;
            case R.id.type_d:
                m3749b(2);
                return;
            case R.id.type_h:
                m3749b(4);
                return;
            case R.id.ol_search_b:
                String valueOf = String.valueOf(this.f4488M.getText());
                if (valueOf.contains("'")) {
                    Toast.makeText(this, "关键词中请勿输入单引号！", Toast.LENGTH_SHORT).show();
                    this.f4488M.setText("");
                    return;
                }
                this.f4488M.setText("");
                this.f4506ae = this.f4505ad.query("jp_data", this.f4511aj, "name like '%" + valueOf + "%'" + (!this.f4510ai.equals("") ? " AND " + this.f4510ai : ""), null, null, null, null);
                int count = this.f4506ae.getCount();
                if (valueOf.equals("")) {
                    this.f4503ab.changeCursor(this.f4506ae);
                    this.f4503ab.notifyDataSetChanged();
                    return;
                } else if (this.f4506ae.getCount() == 0) {
                    Toast.makeText(this, "未搜索到与 " + valueOf + " 有关的曲目！", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    Toast.makeText(this, "搜索到" + count + "首与 " + valueOf + " 有关的曲目！", Toast.LENGTH_SHORT).show();
                    this.f4503ab.changeCursor(this.f4506ae);
                    this.f4503ab.notifyDataSetChanged();
                    return;
                }
            case R.id.pre_button:
                this.f4522au -= 20;
                if (this.f4522au < 0) {
                    this.f4522au = 0;
                    return;
                }
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("T", "L");
                    jSONObject.put("B", this.f4522au);
                    mo2857a((byte) 34, (byte) 0, (byte) 0, jSONObject.toString());
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
                    mo2857a((byte) 34, (byte) 0, (byte) 0, jSONObject.toString());
                    return;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            case R.id.next_button:
                if (!this.f4481F) {
                    this.f4522au += 20;
                    if (this.f4522au >= 0) {
                        try {
                            jSONObject = new JSONObject();
                            jSONObject.put("T", "L");
                            jSONObject.put("B", this.f4522au);
                            mo2857a((byte) 34, (byte) 0, (byte) 0, jSONObject.toString());
                            return;
                        } catch (JSONException e22) {
                            e22.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                return;
            case R.id.ol_send_b:
                JSONObject jSONObject2 = new JSONObject();
                try {
                    str = String.valueOf(this.f4487L.getText());
                    if (!str.startsWith(this.f4509ah) || str.length() <= this.f4509ah.length()) {
                        jSONObject2.put("@", "");
                        jSONObject2.put("M", str);
                    } else {
                        jSONObject2.put("@", this.f4509ah);
                        str = str.substring(this.f4509ah.length());
                        jSONObject2.put("M", str);
                    }
                    this.f4487L.setText("");
                    this.f4509ah = "";
                    if (!str.equals("")) {
                        mo2857a((byte) 13, this.f4529m, this.f4477B, jSONObject2.toString());
                        return;
                    }
                    return;
                } catch (JSONException e222) {
                    e222.printStackTrace();
                    return;
                }
            case R.id.ol_express_b:
                this.f4497V.showAtLocation(this.f4489N, 17, 0, 0);
                return;
            case R.id.ol_ready_b:
                if (this.f4533q.equals(this.f4525i)) {
                    mo2857a((byte) 4, this.f4529m, this.f4477B, "");
                    return;
                } else {
                    mo2857a((byte) 3, this.f4529m, this.f4477B, "");
                    return;
                }
            case R.id.ol_songlist_b:
                this.f4498W.showAtLocation(this.f4486K, 17, 0, 0);
                return;
            case R.id.ol_group_b:
                if (this.f4516ao == 0) {
                    if (this.f4501Z != null) {
                        this.f4501Z.showAtLocation(this.f4534r, 17, 0, 0);
                        return;
                    }
                    return;
                } else if (this.f4516ao == 1) {
                    if (this.f4499X != null) {
                        this.f4499X.showAtLocation(this.f4534r, 17, 0, 0);
                        return;
                    }
                    return;
                } else if (this.f4516ao == 2 && this.f4500Y != null) {
                    this.f4500Y.showAtLocation(this.f4534r, 17, 0, 0);
                    return;
                } else {
                    return;
                }
            case R.id.ol_more_b:
                this.f4498W.showAtLocation(this.f4485J, 17, 0, 0);
                return;
            case R.id.shengdiao:
                textView = (TextView) LayoutInflater.from(this).inflate(R.layout.ol_hand_list, null).findViewById(R.id.yidiao0);
                i = diao;
                if (i < 6) {
                    diao = i + 1;
                } else {
                    diao = 6;
                }
                m3745a(0 + this.zuoyou, this.f4501Z);
                return;
            case R.id.jiangdiao:
                textView = (TextView) LayoutInflater.from(this).inflate(R.layout.ol_hand_list, null).findViewById(R.id.yidiao0);
                i = diao;
                if (i > -6) {
                    diao = i - 1;
                } else {
                    diao = -6;
                }
                m3745a(0 + this.zuoyou, this.f4501Z);
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3996b = 4;
        this.f4512ak = C1268kt.m4107a();
        C1268kt c1268kt = this.f4512ak;
        C1268kt.m4110b(this);
        setVolumeControlStream(3);
        this.f4491P = LayoutInflater.from(this);
        this.f4531o = (JPApplication) getApplication();
        this.f4531o.mo2700O().clear();
        this.f4537u = this.f4531o.mo2697M();
        setContentView(R.layout.olplayroom);
        this.f4531o.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4532p = (TextView) findViewById(R.id.room_title);
        this.f4538v = getIntent().getExtras();
        this.f4539w = this.f4538v.getBundle("bundle");
        this.f4477B = this.f4539w.getByte("hallID");
        this.f4478C = this.f4539w.getString("hallName");
        String string = this.f4538v.getString("ID");
        int intValue = Integer.valueOf(string).intValue();
        this.f4510ai = this.f4538v.getString("D");
        this.f4529m = (byte) intValue;
        this.f4530n = this.f4538v.getString("R");
        this.f4516ao = this.f4538v.getInt("mode");
        this.f4533q = this.f4538v.getString("isHost");
        this.f4532p.setText("[" + string + "]" + this.f4530n);
        this.f4494S = (GridView) findViewById(R.id.ol_player_grid);
        this.f4494S.setCacheColorHint(0);
        this.f4495T.clear();
        this.f4483H = (Button) findViewById(R.id.ol_send_b);
        this.f4483H.setOnClickListener(this);
        this.f4507af = (TextView) findViewById(R.id.time_text);
        this.f4484I = (Button) findViewById(R.id.ol_search_b);
        this.f4484I.setOnClickListener(this);
        this.f4535s = (Button) findViewById(R.id.ol_ready_b);
        this.f4535s.setOnClickListener(this);
        this.f4485J = (Button) findViewById(R.id.ol_more_b);
        this.f4485J.setOnClickListener(this);
        this.f4534r = (Button) findViewById(R.id.ol_group_b);
        this.f4534r.setOnClickListener(this);
        this.f4519ar = (Button) findViewById(R.id.pre_button);
        this.f4520as = (Button) findViewById(R.id.next_button);
        this.f4521at = (Button) findViewById(R.id.online_button);
        this.f4519ar.setOnClickListener(this);
        this.f4520as.setOnClickListener(this);
        this.f4521at.setOnClickListener(this);
        if (this.f4533q.equals(this.f4524h)) {
            this.f4535s.setText("开始");
        } else {
            this.f4535s.setText("准备");
        }
        this.f4486K = (ScrollText) findViewById(R.id.ol_songlist_b);
        this.f4486K.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f4486K.setMarqueeRepeatLimit(-1);
        this.f4486K.setText("点此随机选择歌曲");
        this.f4486K.setOnClickListener(this);
        this.f4514am = (ListView) findViewById(R.id.ol_friend_list);
        this.f4514am.setCacheColorHint(0);
        this.f4487L = (TextView) findViewById(R.id.ol_send_text);
        this.f4488M = (TextView) findViewById(R.id.ol_search_text);
        this.f4489N = (ImageView) findViewById(R.id.ol_express_b);
        this.f4513al = (ListView) findViewById(R.id.ol_player_list);
        this.f4513al.setCacheColorHint(0);
        this.f4489N.setOnClickListener(this);
        this.f4490O = (ListView) findViewById(R.id.ol_msg_list);
        this.f4490O.setCacheColorHint(0);
        this.f4541y = (ListView) findViewById(R.id.ol_song_list);
        this.f4541y.setCacheColorHint(0);
        this.f4540x = new Handler(this);
        this.f4504ac = new C1213is(this, "data", null);
        this.f4505ad = this.f4504ac.getWritableDatabase();
        this.f4506ae = this.f4505ad.query("jp_data", this.f4511aj, this.f4510ai, null, null, null, null);
        this.f4503ab = new C1191hx(this, this, this.f4506ae);
        this.f4541y.setAdapter(this.f4503ab);
        mo2857a((byte) 21, this.f4529m, this.f4477B, "");
        this.f4492Q.clear();
        PopupWindow popupWindow = new PopupWindow(this);
        View inflate = LayoutInflater.from(this).inflate(R.layout.ol_express_list, null);
        popupWindow.setContentView(inflate);
        ((GridView) inflate.findViewById(R.id.ol_express_grid)).setAdapter(new C1344s(this.f4531o, this.f4537u, C1194i.f5605i, popupWindow, (byte) 13, this.f4529m, this.f4477B));
        popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.filled_box));
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        this.f4497V = popupWindow;
        PopupWindow popupWindow2 = new PopupWindow(this);
        View inflate2 = LayoutInflater.from(this).inflate(R.layout.ol_songpop_list, null);
        popupWindow2.setContentView(inflate2);
        ((Button) inflate2.findViewById(R.id.rand_all)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.add_favor)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.favor)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.rand_0)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.rand_3)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.rand_5)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.rand_7)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.type_j)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.type_l)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.type_d)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.type_e)).setOnClickListener(this);
        ((Button) inflate2.findViewById(R.id.type_h)).setOnClickListener(this);
        popupWindow2.setBackgroundDrawable(getResources().getDrawable(R.drawable.filled_box));
        popupWindow2.setWidth(-2);
        popupWindow2.setHeight(-2);
        popupWindow2.setFocusable(true);
        popupWindow2.setTouchable(true);
        popupWindow2.setOutsideTouchable(true);
        this.f4498W = popupWindow2;
        switch (this.f4516ao) {
            case 0:
                this.f4534r.setText("右0");
                popupWindow2 = new PopupWindow(this);
                inflate2 = LayoutInflater.from(this).inflate(R.layout.ol_hand_list, null);
                popupWindow2.setContentView(inflate2);
                popupWindow2.setBackgroundDrawable(getResources().getDrawable(R.drawable.filled_box));
                popupWindow2.setWidth(-2);
                popupWindow2.setHeight(-2);
                ((TextView) inflate2.findViewById(R.id.left_hand)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.right_hand)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.shengdiao)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.jiangdiao)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.yidiao0)).setText("" + diao);
                popupWindow2.setFocusable(true);
                popupWindow2.setTouchable(true);
                popupWindow2.setOutsideTouchable(true);
                this.f4501Z = popupWindow2;
                break;
            case 1:
                popupWindow2 = new PopupWindow(this);
                inflate2 = LayoutInflater.from(this).inflate(R.layout.ol_group_list, null);
                popupWindow2.setContentView(inflate2);
                popupWindow2.setBackgroundDrawable(getResources().getDrawable(R.drawable.filled_box));
                popupWindow2.setWidth(-2);
                popupWindow2.setHeight(-2);
                ((TextView) inflate2.findViewById(R.id.group_1)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.group_2)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.group_3)).setOnClickListener(this);
                popupWindow2.setFocusable(true);
                popupWindow2.setTouchable(true);
                popupWindow2.setOutsideTouchable(true);
                this.f4499X = popupWindow2;
                break;
            case 2:
                popupWindow2 = new PopupWindow(this);
                inflate2 = LayoutInflater.from(this).inflate(R.layout.ol_couple_list, null);
                popupWindow2.setContentView(inflate2);
                popupWindow2.setBackgroundDrawable(getResources().getDrawable(R.drawable.filled_box));
                popupWindow2.setWidth(-2);
                popupWindow2.setHeight(-2);
                ((TextView) inflate2.findViewById(R.id.couple_1)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.couple_2)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.couple_3)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.couple_4)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.couple_5)).setOnClickListener(this);
                ((TextView) inflate2.findViewById(R.id.couple_6)).setOnClickListener(this);
                popupWindow2.setFocusable(true);
                popupWindow2.setTouchable(true);
                popupWindow2.setOutsideTouchable(true);
                this.f4500Y = popupWindow2;
                break;
        }
        this.f4502aa = (TabHost) findViewById(R.id.tabhost);
        this.f4502aa.setup();
        TabSpec newTabSpec = this.f4502aa.newTabSpec("tab1");
        newTabSpec.setContent(R.id.friend_tab);
        newTabSpec.setIndicator("好友");
        this.f4502aa.addTab(newTabSpec);
        newTabSpec = this.f4502aa.newTabSpec("tab2");
        newTabSpec.setContent(R.id.msg_tab);
        newTabSpec.setIndicator("聊天");
        this.f4502aa.addTab(newTabSpec);
        newTabSpec = this.f4502aa.newTabSpec("tab3");
        newTabSpec.setContent(R.id.songs_tab);
        newTabSpec.setIndicator("曲目");
        this.f4502aa.addTab(newTabSpec);
        newTabSpec = this.f4502aa.newTabSpec("tab4");
        newTabSpec.setContent(R.id.players_tab);
        newTabSpec.setIndicator("邀请");
        this.f4502aa.addTab(newTabSpec);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = 0;
        while (true) {
            intValue = i;
            if (intValue >= 4) {
                this.f4502aa.setOnTabChangedListener(new C1161gu(this));
                this.f4502aa.setCurrentTab(1);
                this.f4542z = true;
                this.f4523av = new C1195ia(this);
                this.f4523av.start();
                return;
            }
            this.f4502aa.getTabWidget().getChildTabViewAt(intValue).getLayoutParams().height = (displayMetrics.heightPixels * 45) / 480;
            //((TextView) this.f4502aa.getTabWidget().getChildAt(intValue).findViewById(16908310)).setTextColor(-1);
            i = intValue + 1;
        }
    }

    protected void onDestroy() {
        this.f4542z = false;
        try {
            this.f4523av.interrupt();
        } catch (Exception e) {
        }
        //"runTimeThread:" + this.f4542z;
        this.f4492Q.clear();
        this.f4495T.clear();
        this.f4496U.clear();
        this.f4479D.clear();
        C1268kt.m4107a();
        C1268kt.m4108a(this);
        if (!(this.f4503ab == null || this.f4503ab.getCursor() == null)) {
            this.f4503ab.getCursor().close();
        }
        if (this.f4506ae != null) {
            this.f4506ae.close();
            this.f4506ae = null;
        }
        if (this.f4504ac != null) {
            this.f4504ac.close();
            this.f4504ac = null;
            this.f4505ad.close();
            this.f4505ad = null;
        }
        super.onDestroy();
    }

    public void onPause() {

        super.onPause();
    }

    protected void onResume() {

        super.onResume();
    }

    protected void onStart() {
        super.onStart();
        this.f4508ag = true;
    }

    protected void onStop() {
        super.onStop();
        this.f4508ag = false;
    }
}
