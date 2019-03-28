package ly.pp.addsongs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;



/* renamed from: ly.pp.addsongs.Login */
public class Login extends BaseActivity implements OnClickListener {
    /* renamed from: A */
    public JPApplication f4178A;
    /* renamed from: B */
    private String f4179B = "360SDK";
    /* renamed from: D */
    public String f4181D = "";
    /* renamed from: h */
    String f4182h = "";
    /* renamed from: i */
    String f4183i = "";
    /* renamed from: j */
    String f4184j = "";
    /* renamed from: k */
    C1302m f4185k = null;
    /* renamed from: l */
    protected String f4186l = "";
    /* renamed from: m */
    SharedPreferences f4187m;
    /* renamed from: n */
    String f4188n = "account";
    /* renamed from: s */
    public TextView f4193s;
    /* renamed from: t */
    public TextView f4194t;
    /* renamed from: u */
    public C1253ke f4195u;
    /* renamed from: v */
    private CheckBox f4196v;
    /* renamed from: w */
    private CheckBox f4197w;
    /* renamed from: x */
    private CheckBox f4198x;
    /* renamed from: y */
    private String f4199y;
    /* renamed from: z */
    public String f4200z;

    /* renamed from: c */
    public JSONObject m3599c() {
        JSONObject jSONObject = new JSONObject();
        SharedPreferences sharedPreferences = this.f4178A.f4070d;
        try {
            int i = sharedPreferences.getInt("local_x", -1);
            int i2 = sharedPreferences.getInt("local_y", -1);
            String string = sharedPreferences.getString("local_addr", "");
            jSONObject.put("X", i);
            jSONObject.put("Y", i2);
            jSONObject.put("A", string);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: d */
    private void m3601d() {
        String string = this.f4187m.getString("accountList", "");
        ArrayList arrayList = new ArrayList();
        try {
            if (!string.equals("")) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    string = (String) keys.next();
                    //"key:" + string + "  account:" + jSONObject.getString(string);
                   arrayList.add(string);
                }
                View inflate = getLayoutInflater().inflate(R.layout.account_list, (ViewGroup) findViewById(R.id.dialog));
                ListView listView = inflate.findViewById(R.id.account_list);
                listView.setAdapter(new ArrayAdapter(this, R.layout.account_name, arrayList));
                C1275l b = new C1302m(this).mo3539b("更换账号").mo3534a(inflate).mo3536a("确定", new C0995aq(this)).mo3540b("取消", new C0996ar(this)).mo3538b();
                b.show();
                listView.setOnItemClickListener(new C0997as(this, jSONObject, arrayList, b));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo2771a(int i, String str, String str2) {
        Intent intent = new Intent();
        intent.setClass(this, OLMainMode.class);
        String string = this.f4187m.getString("accountList", "");
        String str3 = "account";
        try {
            JSONObject jSONObject;
            if (string.equals("")) {
                jSONObject = new JSONObject();
                jSONObject.put(this.f4183i, str3);
            } else {
                jSONObject = new JSONObject(string);
                if (jSONObject.has(this.f4183i)) {
                    str3 = jSONObject.getString(this.f4183i);
                } else {
                    str3 = "account" + jSONObject.length();
                    jSONObject.put(this.f4183i, str3);
                    this.f4178A.mo2708a(str3);
                }
            }
            Editor edit = this.f4187m.edit();
            edit.putString("accountList", jSONObject.toString());
            edit.putString("current", str3);
            //"login" + str3;
            edit.commit();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Editor edit2 = this.f4178A.f4070d.edit();
        if (this.f4196v.isChecked()) {
            edit2.putBoolean("chec_name", true);
        } else {
            edit2.putBoolean("chec_name", false);
        }
        if (this.f4197w.isChecked()) {
            edit2.putBoolean("chec_psw", true);
        } else {
            edit2.putBoolean("chec_psw", false);
        }
        if (this.f4198x.isChecked()) {
            edit2.putBoolean("chec_autologin", true);
        } else {
            edit2.putBoolean("chec_autologin", false);
        }
        edit2.putString("name", this.f4183i);
        edit2.putString("userKitiName", this.f4182h);
        edit2.putString("sex", this.f4184j);
        edit2.putString("password", this.f4200z);
        edit2.commit();
        this.f4178A.mo2726e(this.f4182h);
        this.f4178A.mo2723d(this.f4184j);
        this.f4178A.mo2719c(this.f4183i);
        switch (i) {
            case 0:
                Toast.makeText(this, "登陆成功,欢迎您回来!" + this.f4182h + "!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                return;
            case 4:
                this.f4185k.mo3539b(str2).mo3535a(str).mo3536a("知道了", new C0998at(this)).mo3540b("忽略", new C0999au(this)).mo3541c();
                return;
            case 5:
                this.f4185k.mo3539b(str2).mo3535a(str).mo3536a("确定", new C1000av(this)).mo3541c();
                return;
            default:
        }
    }

    /* renamed from: a */
    public final void mo2772a(String str) {
        this.f4178A.mo2708a(str);
        this.f4196v.setChecked(this.f4178A.f4070d.getBoolean("chec_name", false));
        this.f4198x.setChecked(this.f4178A.f4070d.getBoolean("chec_autologin", false));
        this.f4197w.setChecked(this.f4178A.f4070d.getBoolean("chec_psw", false));
        if (this.f4196v.isChecked()) {
            this.f4193s.setText(this.f4178A.f4070d.getString("name", ""));
        }
        if (this.f4197w.isChecked()) {
            this.f4194t.setText(this.f4178A.f4070d.getString("password", ""));
        }
        if (this.f4198x.isChecked()) {
            this.f4199y = this.f4193s.getText().toString();
        }
    }

    public void onBackPressed() {
        this.f4195u.dismiss();
        Intent intent = new Intent();
        intent.setClass(this, MainMode.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ol_login:
                this.f4199y = this.f4193s.getText().toString();
                this.f4200z = this.f4194t.getText().toString();
                if (this.f4199y.equals("") || this.f4200z.equals("")) {
                    Log.i("INFO", "用户名或密码为空");
                    Toast.makeText(this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                Log.i("INFO", "开始联网");
                new C1003ay(this).execute(null, null, null);
                return;
            case R.id.ol_register:
                Intent intent = new Intent();
                intent.putExtra("result", "");
                intent.setClass(this, Register.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_change_account:
                m3601d();
                return;
            case R.id.ol_find_pass:
                View inflate = getLayoutInflater().inflate(R.layout.ol_findpass_dialog, (ViewGroup) findViewById(R.id.dialog));
                EditText editText = inflate.findViewById(R.id.text_1);
                EditText editText2 = inflate.findViewById(R.id.text_2);
                TextView textView = inflate.findViewById(R.id.title_3);
                inflate.findViewById(R.id.text_3).setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                new C1302m(this).mo3539b("找回密码").mo3534a(inflate).mo3536a("确定", new C0993ao(this, editText, editText2)).mo3540b("取消", new C0994ap(this)).mo3541c();
                return;
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4178A = (JPApplication) getApplication();
        this.f4187m = getSharedPreferences("account_list", 0);
        this.f4188n = this.f4187m.getString("current", "account");
        //"loginstart" + this.f4188n;
        this.f4178A.mo2708a(this.f4188n);
        mo2670a();
        C1268kt.m4107a();
        C1268kt.m4111c();
        setContentView(R.layout.login);
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("result");
        if (!string.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                /* renamed from: C */
                String f4180C = jSONObject.getString("name");
                this.f4181D = jSONObject.getString("id");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.f4178A.mo2706a(this, "ground", (LinearLayout) findViewById(R.id.layout));
        /* renamed from: o */
        Button f4189o = findViewById(R.id.ol_login);
        f4189o.setOnClickListener(this);
        /* renamed from: r */
        Button f4192r = findViewById(R.id.ol_find_pass);
        f4192r.setOnClickListener(this);
        /* renamed from: p */
        Button f4190p = findViewById(R.id.ol_register);
        f4190p.setOnClickListener(this);
        /* renamed from: q */
        Button f4191q = findViewById(R.id.ol_change_account);
        f4191q.setOnClickListener(this);
        this.f4193s = findViewById(R.id.username);
        this.f4194t = findViewById(R.id.password);
        this.f4196v = findViewById(R.id.chec_name);
        this.f4196v.setChecked(this.f4178A.f4070d.getBoolean("chec_name", false));
        this.f4198x = findViewById(R.id.chec_autologin);
        this.f4198x.setChecked(this.f4178A.f4070d.getBoolean("chec_autologin", false));
        this.f4197w = findViewById(R.id.chec_psw);
        this.f4197w.setChecked(this.f4178A.f4070d.getBoolean("chec_psw", false));
        if (this.f4196v.isChecked()) {
            this.f4193s.setText(this.f4178A.f4070d.getString("name", ""));
        }
        if (this.f4197w.isChecked()) {
            this.f4194t.setText(this.f4178A.f4070d.getString("password", ""));
        }
        this.f4195u = new C1253ke(this);
        this.f4185k = new C1302m(this);
        if (extras != null) {
            this.f4199y = extras.getString("name");
            this.f4200z = extras.getString("password");
            if (!(this.f4199y == null || this.f4199y.equals("") || this.f4200z == null || this.f4200z.equals(""))) {
                this.f4193s.setText(this.f4199y);
                this.f4194t.setText(this.f4200z);
                this.f4196v.setChecked(true);
                this.f4197w.setChecked(true);
            }
        }
        if (this.f4198x.isChecked()) {
            this.f4199y = this.f4193s.getText().toString();
            this.f4200z = this.f4194t.getText().toString();
            if (this.f4199y.equals("") || this.f4200z.equals("")) {
                mo2671a("提示", "确定", "用户名或密码不能为空");
                return;
            }
            Log.i("INFO", "开始联网");
            new C1003ay(this).execute(null, null, null);
        }
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();

    }

    protected void onRestart() {
        super.onRestart();
    }

    public void onResume() {
        super.onResume();

    }
}
