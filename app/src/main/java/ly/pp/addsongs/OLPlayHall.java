package ly.pp.addsongs;

import android.content.Context;
import android.content.Intent;
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
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import ly.pp.addsongs.R;

/* renamed from: ly.pp.addsongs.OLPlayHall */
public class OLPlayHall extends BaseActivity implements Callback, OnClickListener {
    /* renamed from: A */
    private ImageView f4368A;
    /* renamed from: B */
    public ListView f4369B;
    /* renamed from: C */
    private LayoutInflater f4370C;
    /* renamed from: D */
    public ListView f4371D;
    /* renamed from: E */
    private LayoutInflater f4372E;
    /* renamed from: F */
    public List f4373F = new ArrayList();
    /* renamed from: G */
    public int f4374G = 100;
    /* renamed from: H */
    private Context f4375H = null;
    /* renamed from: I */
    public ConnectionService f4376I;
    /* renamed from: J */
    private PopupWindow f4377J = null;
    /* renamed from: K */
    public TabHost f4378K;
    /* renamed from: L */
    public String f4379L = "";
    /* renamed from: M */
    private C1268kt f4380M;
    /* renamed from: N */
    public Bundle f4381N;
    /* renamed from: O */
    public ListView f4382O;
    /* renamed from: P */
    private TextView f4383P;
    /* renamed from: Q */
    private ScrollText f4384Q;
    /* renamed from: R */
    public boolean f4385R;
    /* renamed from: S */
    private C1124fk f4386S;
    /* renamed from: T */
    public int f4387T = 0;
    /* renamed from: U */
    public boolean f4388U = false;
    /* renamed from: V */
    private Button f4389V;
    /* renamed from: W */
    private Button f4390W;
    /* renamed from: X */
    private Button f4391X;
    /* renamed from: h */
    public HashMap f4392h = new HashMap();
    /* renamed from: i */
    public List f4393i = new ArrayList();
    /* renamed from: j */
    public C1253ke f4394j;
    /* renamed from: k */
    ListView f4395k;
    /* renamed from: l */
    List f4396l = new ArrayList();
    /* renamed from: m */
    public String f4397m = "";
    /* renamed from: n */
    public byte f4398n = (byte) 0;
    /* renamed from: o */
    List f4399o = new ArrayList();
    /* renamed from: p */
    public Handler f4400p;
    /* renamed from: q */
    protected int f4401q = 0;
    /* renamed from: r */
    protected boolean f4402r = false;
    /* renamed from: s */
    public C1101eo f4403s = new C1101eo(this);
    /* renamed from: t */
    public JPApplication f4404t;
    /* renamed from: u */
    private Button f4405u;
    /* renamed from: v */
    private Button f4406v;
    /* renamed from: w */
    private Button f4407w;
    /* renamed from: x */
    public TextView f4408x;
    /* renamed from: y */
    private TextView f4409y;
    /* renamed from: z */
    private TextView f4410z;

    /* renamed from: a */
    public final void mo2823a(byte b) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ID", b);
            this.f4376I.mo2676a((byte) 43, (byte) 0, (byte) 0, jSONObject.toString(), null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo2824a(byte b, byte b2, byte b3, String str) {
        if (this.f4376I != null) {
            this.f4376I.mo2676a(b, b2, b3, str, null);
        } else {
            Toast.makeText(this, "连接已断开", Toast.LENGTH_SHORT).show();
        }
    }

    /* renamed from: a */
    public final void mo2825a(byte b, C1264kp c1264kp) {
        this.f4392h.put(Byte.valueOf(b), c1264kp);
    }

    /* renamed from: a */
    public final void mo2826a(int i, byte b) {
        JSONObject jSONObject = new JSONObject();
        switch (i) {
            case 0:
                try {
                    jSONObject.put("I", b);
                    jSONObject.put("P", "");
                    mo2824a((byte) 7, b, (byte) 0, jSONObject.toString());
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            case 1:
                View inflate = getLayoutInflater().inflate(R.layout.message_send, (ViewGroup) findViewById(R.id.dialog));
                TextView textView = (TextView) inflate.findViewById(R.id.text_2);
                TextView textView2 = (TextView) inflate.findViewById(R.id.title_1);
                ((TextView) inflate.findViewById(R.id.text_1)).setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
                textView.setSingleLine(true);
                new C1302m(this).mo3539b("输入密码").mo3534a(inflate).mo3536a("确定", new C1095ei(this, textView, b)).mo3540b("取消", new C1096ej(this)).mo3541c();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    final void mo2827a(Bundle bundle) {
        View inflate = getLayoutInflater().inflate(R.layout.room_info, (ViewGroup) findViewById(R.id.dialog));
        ListView listView = (ListView) inflate.findViewById(R.id.playerlist);
        Bundle bundle2 = bundle.getBundle("L");
        int size = bundle2.size();
        List arrayList = new ArrayList();
        if (size >= 0) {
            for (int i = 0; i < size; i++) {
                arrayList.add(bundle2.getBundle(String.valueOf(i)));
            }
            mo2829a(listView, arrayList, 3, false);
        }
        listView.setBackgroundColor(-16777216);
        int i2 = bundle.getInt("R");
        new C1302m(this).mo3539b("房间玩家信息").mo3534a(inflate).mo3536a("进入房间", new C1099em(this, bundle.getInt("P"), i2)).mo3540b("取消", new C1100en(this)).mo3541c();
    }

    /* renamed from: a */
    public final void mo2828a(ListView listView, List list) {
        listView.setAdapter(new C1081dv(list, this.f4370C));
        listView.setSelection(this.f4374G - 1);
    }

    /* renamed from: a */
    public final void mo2829a(ListView listView, List list, int i, boolean z) {
        if (!(!z || list == null || list.isEmpty())) {
            Collections.sort(list, new C1090ed(this));
        }
        listView.setAdapter(new C1036cd(list, (JPApplication) getApplicationContext(), i, this));
    }

    /* renamed from: a */
    final void mo2830a(String str) {
        View inflate = getLayoutInflater().inflate(R.layout.message_send, (ViewGroup) findViewById(R.id.dialog));
        TextView textView = (TextView) inflate.findViewById(R.id.text_1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.title_1);
        TextView textView3 = (TextView) inflate.findViewById(R.id.title_2);
        ((TextView) inflate.findViewById(R.id.text_2)).setVisibility(View.GONE);
        textView3.setVisibility(View.GONE);
        textView2.setText("内容");
        new C1302m(this).mo3539b("发送私信给:" + str).mo3534a(inflate).mo3536a("发送", new C1091ee(this, textView, str)).mo3540b("取消", new C1092ef(this)).mo3541c();
    }

    /* renamed from: b */
    public final void mo2831b(ListView listView, List list) {
        String str = "I";
        if (!(list == null || list.isEmpty())) {
            Collections.sort(list, new C1093eg(this, str));
        }
        C1205ik c1205ik = (C1205ik) listView.getAdapter();
        if (c1205ik == null) {
            listView.setAdapter(new C1205ik(list, this.f4372E, this));
            return;
        }
        c1205ik.mo3324a(list);
        c1205ik.notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo2832b(String str) {
        this.f4379L = "@" + str + ":";
        if (!(str.equals("") || str.equals(this.f4404t.mo2702Q()))) {
            this.f4408x.setText(this.f4379L);
        }
        CharSequence text = this.f4408x.getText();
        if (text instanceof Spannable) {
            Selection.setSelection((Spannable) text, text.length());
        }
    }

    /* renamed from: c */
    public final void mo2833c() {
        ConnectionService connectionService = this.f4376I;
        getClass().toString();
        ConnectionService.m3500b();
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 3:
                CharSequence format = SimpleDateFormat.getTimeInstance(3, Locale.ENGLISH).format(new Date());
                if (this.f4409y != null) {
                    this.f4409y.setText(format);
                    break;
                }
                break;
        }
        return false;
    }

    public void onBackPressed() {
        if (this.f4394j != null && this.f4394j.isShowing()) {
            this.f4394j.dismiss();
        }
        mo2824a((byte) 30, (byte) 0, this.f4398n, "");
        startActivity(new Intent(this, OLPlayHallRoom.class));
        finish();
    }

    public void onClick(View view) {
        JSONObject jSONObject = new JSONObject();
        switch (view.getId()) {
            case R.id.ol_createroom_b:
                View inflate = getLayoutInflater().inflate(R.layout.create_room, (ViewGroup) findViewById(R.id.dialog));
                TextView textView = (TextView) inflate.findViewById(R.id.text_1);
                TextView textView2 = (TextView) inflate.findViewById(R.id.text_2);
                RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.room_mode);
                CharSequence stringBuilder = new StringBuilder(String.valueOf(this.f4404t.mo2702Q())).append("").toString();
                if (stringBuilder.length() > 8) {
                }
                textView.setText(stringBuilder);
                textView.setSingleLine(true);
                textView2.setSingleLine(true);
                new C1302m(this).mo3539b("创建房间").mo3534a(inflate).mo3536a("确定", new C1097ek(this, textView, textView2, radioGroup)).mo3540b("取消", new C1098el(this)).mo3541c();
                return;
            case R.id.ol_testroom_b:
                try {
                    jSONObject.put("T", 0);
                    this.f4394j.show();
                    this.f4376I.mo2676a((byte) 40, (byte) 0, (byte) 0, jSONObject.toString(), null);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            case R.id.pre_button:
                this.f4401q -= 20;
                if (this.f4401q < 0) {
                    this.f4401q = 0;
                    return;
                }
                try {
                    jSONObject.put("T", "L");
                    jSONObject.put("B", this.f4401q);
                    mo2824a((byte) 34, (byte) 0, (byte) 0, jSONObject.toString());
                    return;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            case R.id.online_button:
                try {
                    jSONObject.put("T", "L");
                    jSONObject.put("B", -1);
                    mo2824a((byte) 34, (byte) 0, (byte) 0, jSONObject.toString());
                    return;
                } catch (JSONException e22) {
                    e22.printStackTrace();
                    return;
                }
            case R.id.next_button:
                if (!this.f4388U) {
                    this.f4401q += 20;
                    if (this.f4401q >= 0) {
                        try {
                            jSONObject.put("T", "L");
                            jSONObject.put("B", this.f4401q);
                            mo2824a((byte) 34, (byte) 0, (byte) 0, jSONObject.toString());
                            return;
                        } catch (JSONException e222) {
                            e222.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                return;
            case R.id.ol_send_b:
                String valueOf = String.valueOf(this.f4408x.getText());
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!valueOf.startsWith(this.f4379L) || valueOf.length() <= this.f4379L.length()) {
                        jSONObject2.put("@", "");
                        jSONObject2.put("M", valueOf);
                    } else {
                        jSONObject2.put("@", this.f4379L);
                        valueOf = valueOf.substring(this.f4379L.length());
                        jSONObject2.put("M", valueOf);
                    }
                    this.f4408x.setText("");
                    this.f4379L = "";
                    if (!valueOf.equals("")) {
                        mo2824a((byte) 12, (byte) 0, this.f4398n, jSONObject2.toString());
                    }
                } catch (JSONException e2222) {
                    e2222.printStackTrace();
                }
                this.f4408x.setText("");
                this.f4379L = "";
                return;
            case R.id.ol_express_b:
                this.f4377J.showAtLocation(this.f4368A, 17, 0, 0);
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3996b = 3;
        this.f4394j = new C1253ke(this);
        this.f4380M = C1268kt.m4107a();
        C1268kt c1268kt = this.f4380M;
        C1268kt.m4110b(this);
        this.f4392h.clear();
        this.f4375H = this;
        this.f4381N = getIntent().getExtras();
        this.f4397m = this.f4381N.getString("hallName");
        this.f4398n = this.f4381N.getByte("hallID");
        this.f4370C = LayoutInflater.from(this);
        this.f4372E = LayoutInflater.from(this);
        this.f4404t = (JPApplication) getApplication();
        this.f4404t.mo2728f(1);
        setContentView(R.layout.olplayhall);
        this.f4404t.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        JPApplication jPApplication = this.f4404t;
        JPApplication jPApplication2 = this.f4404t;
        jPApplication.mo2718c(0);
        this.f4405u = (Button) findViewById(R.id.ol_send_b);
        this.f4405u.setOnClickListener(this);
        this.f4406v = (Button) findViewById(R.id.ol_createroom_b);
        this.f4406v.setOnClickListener(this);
        this.f4407w = (Button) findViewById(R.id.ol_testroom_b);
        this.f4407w.setOnClickListener(this);
        this.f4408x = (TextView) findViewById(R.id.ol_send_text);
        this.f4410z = (TextView) findViewById(R.id.ol_playhall_tittle);
        this.f4410z.setText(this.f4397m);
        this.f4400p = new Handler(this);
        this.f4409y = (TextView) findViewById(R.id.time_text);
        this.f4369B = (ListView) findViewById(R.id.ol_msg_list);
        this.f4369B.setCacheColorHint(0);
        this.f4389V = (Button) findViewById(R.id.pre_button);
        this.f4390W = (Button) findViewById(R.id.next_button);
        this.f4391X = (Button) findViewById(R.id.online_button);
        this.f4389V.setOnClickListener(this);
        this.f4390W.setOnClickListener(this);
        this.f4391X.setOnClickListener(this);
        this.f4393i.clear();
        this.f4371D = (ListView) findViewById(R.id.ol_room_list);
        this.f4371D.setCacheColorHint(0);
        this.f4395k = (ListView) findViewById(R.id.ol_player_list);
        this.f4395k.setCacheColorHint(0);
        this.f4368A = (ImageView) findViewById(R.id.ol_express_b);
        this.f4368A.setOnClickListener(this);
        this.f4382O = (ListView) findViewById(R.id.ol_friend_list);
        this.f4382O.setCacheColorHint(0);
        this.f4383P = (TextView) findViewById(R.id.systemText);
        this.f4384Q = (ScrollText) findViewById(R.id.broadCastText);
        this.f4384Q.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f4373F.clear();
        this.f4376I = this.f4404t.mo2697M();
        PopupWindow popupWindow = new PopupWindow(this);
        View inflate = LayoutInflater.from(this).inflate(R.layout.ol_express_list, null);
        popupWindow.setContentView(inflate);
        ((GridView) inflate.findViewById(R.id.ol_express_grid)).setAdapter(new C1344s(this.f4404t, this.f4376I, C1194i.f5605i, popupWindow, (byte) 12, (byte) 0, this.f4398n));
        popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.filled_bar));
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        this.f4377J = popupWindow;
        this.f4378K = (TabHost) findViewById(R.id.tabhost);
        this.f4378K.setup();
        TabSpec newTabSpec = this.f4378K.newTabSpec("tab1");
        newTabSpec.setContent(R.id.friend_tab);
        newTabSpec.setIndicator("好友");
        this.f4378K.addTab(newTabSpec);
        newTabSpec = this.f4378K.newTabSpec("tab2");
        newTabSpec.setContent(R.id.msg_tab);
        newTabSpec.setIndicator("聊天");
        this.f4378K.addTab(newTabSpec);
        newTabSpec = this.f4378K.newTabSpec("tab3");
        newTabSpec.setContent(R.id.players_tab);
        newTabSpec.setIndicator("玩家");
        this.f4378K.addTab(newTabSpec);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        for (int i = 0; i < 3; i++) {
            this.f4378K.getTabWidget().getChildTabViewAt(i).getLayoutParams().height = (displayMetrics.heightPixels * 45) / 480;
            ((TextView) this.f4378K.getTabWidget().getChildAt(i).findViewById(16908310)).setTextColor(-1);
        }
        this.f4378K.setOnTabChangedListener(new C1094eh(this));
        this.f4378K.setCurrentTab(1);
        mo2824a((byte) 19, (byte) 0, this.f4398n, "");
        this.f4385R = true;
        this.f4386S = new C1124fk(this, (byte) 0);
        this.f4386S.start();
    }

    protected void onDestroy() {
        this.f4385R = false;
        try {
            this.f4386S.interrupt();
        } catch (Exception e) {
        }
        C1268kt.m4107a();
        C1268kt.m4108a(this);
        this.f4392h.clear();
        this.f4393i.clear();
        this.f4373F.clear();
        this.f4396l.clear();
        super.onDestroy();
    }

    public void onPause() {

        super.onPause();
    }

    protected void onResume() {

        super.onResume();
    }
}
