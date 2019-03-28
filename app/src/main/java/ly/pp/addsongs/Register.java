package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;



/* renamed from: ly.pp.addsongs.Register */
public class Register extends Activity implements OnClickListener {
    /* renamed from: a */
    protected String f4927a;
    /* renamed from: b */
    protected String f4928b;
    /* renamed from: c */
    protected String f4929c;
    /* renamed from: d */
    protected String f4930d;
    /* renamed from: e */
    protected String f4931e;
    /* renamed from: f */
    protected C1253ke f4932f;
    /* renamed from: g */
    private TextView f4933g;
    /* renamed from: h */
    private TextView f4934h;
    /* renamed from: i */
    private TextView f4935i;
    /* renamed from: j */
    private TextView f4936j;
    /* renamed from: k */
    private RadioGroup f4937k;
    /* renamed from: l */
    public RadioButton f4938l;
    /* renamed from: m */
    public RadioButton f4939m;
    /* renamed from: n */
    private Button f4940n;
    /* renamed from: o */
    private Button f4941o;
    /* renamed from: p */
    public String f4942p = "";
    /* renamed from: q */
    private String f4943q = "";
    /* renamed from: r */
    private TextView f4944r;
    /* renamed from: s */
    private JPApplication f4945s;

    public void onBackPressed() {
        this.f4932f.dismiss();
        Intent intent = new Intent();
        intent.putExtra("result", "");
        intent.setClass(this, Login.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        if (view == this.f4940n) {
            Intent intent = new Intent();
            intent.putExtra("result", "");
            intent.setClass(this, Login.class);
            startActivity(intent);
            finish();
        } else if (view == this.f4941o) {
            this.f4928b = this.f4933g.getText().toString();
            this.f4930d = this.f4934h.getText().toString();
            this.f4931e = this.f4935i.getText().toString();
            this.f4929c = this.f4936j.getText().toString();
            if (this.f4928b.equals("") || this.f4930d.equals("") || this.f4931e.equals("") || this.f4929c.equals("") || this.f4927a.equals("")) {
                Toast.makeText(this, "请将资料填写完整！", Toast.LENGTH_SHORT).show();
            } else if (this.f4928b.length() < 3 || this.f4928b.length() > 12) {
                Toast.makeText(this, "账号应在3到12个字符之间", Toast.LENGTH_SHORT).show();
            } else if (this.f4929c.length() < 1 || this.f4929c.length() > 8) {
                Toast.makeText(this, "昵称应在2到8个字符之间", Toast.LENGTH_SHORT).show();
            } else if (this.f4930d.length() < 5) {
                Toast.makeText(this, "密码应大于5个字符", Toast.LENGTH_SHORT).show();
            } else if (this.f4930d.equals(this.f4931e)) {
                if ((this.f4928b.replaceAll("[a-z]*[A-Z]*\\d*-*_*\\s*", "").length() == 0 ? 1 : 0) == 0) {
                    Toast.makeText(this, "账号只能由字母，数字和下滑线组成！", Toast.LENGTH_SHORT).show();
                    return;
                }
                if ((Pattern.compile("['{}/\"\t]").matcher(this.f4929c).find() ? 1 : 0) != 0) {
                    Toast.makeText(this, "昵称请不要使用['@{}/\"]这些字符", Toast.LENGTH_SHORT).show();
                } else {
                    new C1262kn(this).execute(null, null, null);
                }
            } else {
                Toast.makeText(this, "两次输入密码不一致", Toast.LENGTH_SHORT).show();
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.register);
        String string = getIntent().getExtras().getString("result");
        this.f4945s = (JPApplication) getApplication();
        this.f4945s.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4927a = "";
        this.f4928b = "";
        this.f4929c = "";
        this.f4933g = (TextView) findViewById(R.id.rg_name);
        this.f4936j = (TextView) findViewById(R.id.rg_kiti);
        this.f4934h = (TextView) findViewById(R.id.rg_psw_1);
        this.f4935i = (TextView) findViewById(R.id.rg_psw_2);
        this.f4944r = (TextView) findViewById(R.id.register_title);
        this.f4938l = (RadioButton) findViewById(R.id.f_radio);
        this.f4939m = (RadioButton) findViewById(R.id.m_radio);
        this.f4937k = (RadioGroup) findViewById(R.id.rg_sex);
        this.f4937k.setOnCheckedChangeListener(new C1261km(this));
        this.f4940n = (Button) findViewById(R.id.rg_back);
        this.f4940n.setOnClickListener(this);
        this.f4941o = (Button) findViewById(R.id.rg_register);
        this.f4941o.setOnClickListener(this);
        if (!string.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.f4943q = jSONObject.getString("name");
                this.f4942p = jSONObject.getString("id");
                this.f4944r.setText("填写资料");
                this.f4941o.setText("确定");
                Toast.makeText(this, "360用户:" + this.f4942p + " 登陆成功!", Toast.LENGTH_SHORT).show();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.f4932f = new C1253ke(this);
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
