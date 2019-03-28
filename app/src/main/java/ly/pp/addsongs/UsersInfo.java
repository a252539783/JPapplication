package ly.pp.addsongs;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;


/* renamed from: ly.pp.addsongs.UsersInfo */
public class UsersInfo extends Activity implements Callback, OnClickListener {
    /* renamed from: A */
    private C0978a f5055A;
    /* renamed from: B */
    private Handler f5056B;
    /* renamed from: a */
    int f5057a = 0;
    /* renamed from: b */
    public boolean f5058b = false;
    /* renamed from: c */
    public boolean f5059c = false;
    /* renamed from: d */
    public C1253ke f5060d;
    /* renamed from: e */
    private String f5061e = "";
    /* renamed from: f */
    private String f5062f = "";
    /* renamed from: g */
    private String f5063g = "";
    /* renamed from: h */
    private String f5064h;
    /* renamed from: i */
    private String f5065i;
    /* renamed from: j */
    public String f5066j;
    /* renamed from: k */
    public int f5067k = 0;
    /* renamed from: l */
    private TextView f5068l;
    /* renamed from: m */
    private TextView f5069m;
    /* renamed from: n */
    private TextView f5070n;
    /* renamed from: o */
    private TextView f5071o;
    /* renamed from: p */
    private TextView f5072p;
    /* renamed from: q */
    private TextView f5073q;
    /* renamed from: r */
    private TextView f5074r;
    /* renamed from: s */
    private ImageView f5075s;
    /* renamed from: t */
    private Button f5076t;
    /* renamed from: u */
    private Button f5077u;
    /* renamed from: v */
    public JPApplication f5078v;
    /* renamed from: w */
    private final int f5079w = 0;
    /* renamed from: x */
    private final int f5080x = 1;
    /* renamed from: y */
    private final int f5081y = 2;
    /* renamed from: z */
    private String f5082z = "";

    /* renamed from: a */
    public Uri m3926a() {
        return Uri.fromFile(new File(Environment.getExternalStorageDirectory() + "/JustPiano", this.f5082z));
    }

    /* renamed from: a */
    private void m3929a(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 240);
        intent.putExtra("outputY", 240);
        intent.putExtra("return-data", true);
        startActivityForResult(intent, 2);
    }

    /* renamed from: a */
    static /* synthetic */ void m3930a(UsersInfo usersInfo, String str) {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        usersInfo.f5057a = jSONArray.length();
        for (int i = 0; i < usersInfo.f5057a; i++) {
            try {
                usersInfo.f5068l.setText(usersInfo.f5078v.mo2701P());
                usersInfo.f5082z = new StringBuilder(String.valueOf(usersInfo.f5078v.mo2701P())).append(".jpg").toString();
                usersInfo.f5061e = jSONArray.getJSONObject(i).getString("uk");
                usersInfo.f5069m.setText(usersInfo.f5061e);
                usersInfo.f5062f = jSONArray.getJSONObject(i).getString("fi");
                usersInfo.f5075s.setTag(usersInfo.f5062f);
                usersInfo.f5055A.mo3027a(usersInfo.f5075s, null);
                usersInfo.f5063g = jSONArray.getJSONObject(i).getString("sx");
                if (usersInfo.f5063g.equals("m")) {
                    usersInfo.f5070n.setText("男");
                } else {
                    usersInfo.f5070n.setText("女");
                }
                usersInfo.f5067k = jSONArray.getJSONObject(i).getInt("age");
                if (usersInfo.f5067k < 1960) {
                    usersInfo.f5067k = 1990;
                }
                usersInfo.f5071o.setText(String.valueOf(usersInfo.f5067k));
                usersInfo.f5064h = jSONArray.getJSONObject(i).get("nu").toString();
                usersInfo.f5072p.setText(usersInfo.f5064h);
                usersInfo.f5065i = jSONArray.getJSONObject(i).get("sc").toString();
                usersInfo.f5073q.setText(usersInfo.f5065i);
                usersInfo.f5066j = jSONArray.getJSONObject(i).get("ms").toString();
                if (usersInfo.f5066j.equals("")) {
                    usersInfo.f5074r.setText("未设置签名！");
                } else {
                    usersInfo.f5074r.setText(usersInfo.f5066j);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static String m3931b(String str, String str2, String str3) {
        String str4 = "\r\n";
        String str5 = "--";
        String str6 = "*****";
        String str7 = "0";
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + str6);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(new StringBuilder(String.valueOf(str5)).append(str6).append(str4).toString());
            dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"file1\";filename=\"" + str3 + "\"" + str4);
            dataOutputStream.writeBytes(str4);
            FileInputStream fileInputStream = new FileInputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                dataOutputStream.write(bArr, 0, read);
            }
            dataOutputStream.writeBytes(str4);
            dataOutputStream.writeBytes(new StringBuilder(String.valueOf(str5)).append(str6).append(str5).append(str4).toString());
            fileInputStream.close();
            dataOutputStream.flush();
            InputStream inputStream = httpURLConnection.getInputStream();
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int read2 = inputStream.read();
                if (read2 == -1) {
                    dataOutputStream.close();
                    return str7;
                }
                stringBuffer.append((char) read2);
            }
        } catch (Exception e) {
            return "1";
        }
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1 A:{SYNTHETIC, Splitter: B:28:0x00c1} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0 A:{SYNTHETIC, Splitter: B:35:0x00d0} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int i, int i2, Intent intent) {
        Exception e;
        Throwable th;
        int i3 = 0;
        if (i2 == -1) {
            switch (i) {
                case 0:
                    m3929a(intent.getData());
                    break;
                case 1:
                    if (Environment.getExternalStorageState().equals("mounted")) {
                        i3 = 1;
                    }
                    if (i3 == 0) {
                        Toast.makeText(this, "未找到存储卡，无法存储照片！", Toast.LENGTH_LONG).show();
                        break;
                    } else {
                        m3929a(m3926a());
                        break;
                    }
                case 2:
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            Bitmap bitmap = (Bitmap) extras.getParcelable("data");
                            this.f5075s.setImageDrawable(new BitmapDrawable(bitmap));
                            FileOutputStream fileOutputStream;
                            try {
                                fileOutputStream = new FileOutputStream(Environment.getExternalStorageDirectory() + "/JustPiano/" + this.f5082z);
                                try {
                                    bitmap.compress(CompressFormat.JPEG, 80, fileOutputStream);
                                    new C1335nf(this).execute("http://121.199.31.116:8910/JustPianoServer/server/UpLoadFace", Environment.getExternalStorageDirectory() + "/JustPiano/" + this.f5082z, this.f5082z);
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    try {
                                        e.printStackTrace();
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e22) {
                                                e22.printStackTrace();
                                            }
                                        }
                                        super.onActivityResult(i, i2, intent);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e4) {
                                                e4.printStackTrace();
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                fileOutputStream = null;
                                e.printStackTrace();
                                if (fileOutputStream != null) {
                                }
                                super.onActivityResult(i, i2, intent);
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                                if (fileOutputStream != null) {
                                }
                            }
                        }
                    }
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.f5060d.isShowing()) {
            this.f5060d.dismiss();
        }
        Intent intent = new Intent();
        intent.setClass(this, OLUsersPage.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.user_face:
                C1302m c1302m = new C1302m(this);
                c1302m.mo3539b("选择方式");
                c1302m.mo3535a("选择上传头像的方式");
                c1302m.mo3536a("打开相机", new C1328mz(this));
                c1302m.mo3540b("打开图库", new C1330na(this));
                try {
                    c1302m.mo3541c();
                    return;
                } catch (Exception e) {
                    return;
                }
            case R.id.password_button:
                View inflate = getLayoutInflater().inflate(R.layout.password_change, (ViewGroup) findViewById(R.id.dialog));
                TextView textView = (TextView) inflate.findViewById(R.id.text_1);
                TextView textView2 = (TextView) inflate.findViewById(R.id.text_2);
                TextView textView3 = (TextView) inflate.findViewById(R.id.text_3);
                CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.auto_login);
                checkBox.setChecked(this.f5078v.f4070d.getBoolean("chec_autologin", false));
                CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.re_password);
                checkBox2.setChecked(this.f5078v.f4070d.getBoolean("chec_psw", false));
                new C1302m(this).mo3539b("修改密码").mo3534a(inflate).mo3536a("确定", new C1331nb(this, textView, textView2, textView3, checkBox, checkBox2)).mo3540b("取消", new C1332nc(this)).mo3541c();
                return;
            case R.id.modify_button:
                String charSequence = this.f5071o.getText().toString();
                this.f5066j = this.f5074r.getText().toString();
                if (charSequence.startsWith("0")) {
                    Toast.makeText(this, "请输入正确的生年格式:1960-2010", Toast.LENGTH_LONG).show();
                    return;
                }
                this.f5067k = Integer.valueOf(charSequence).intValue();
                if (this.f5067k < 1960 || this.f5067k > 2010) {
                    Toast.makeText(this, "请输入正确的生年格式:1960-2010", Toast.LENGTH_LONG).show();
                    return;
                } else if (this.f5066j.length() >= 100) {
                    Toast.makeText(this, "确定字数在一百个字之内！", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    new C1337nh(this).execute("M", null, null);
                    return;
                }
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5078v = (JPApplication) getApplication();
        setContentView(R.layout.user_info);
        this.f5068l = (TextView) findViewById(R.id.user_name);
        this.f5076t = (Button) findViewById(R.id.modify_button);
        this.f5076t.setOnClickListener(this);
        this.f5077u = (Button) findViewById(R.id.password_button);
        this.f5077u.setOnClickListener(this);
        this.f5069m = (TextView) findViewById(R.id.user_kitiname);
        this.f5070n = (TextView) findViewById(R.id.user_sex);
        this.f5072p = (TextView) findViewById(R.id.user_num);
        this.f5073q = (TextView) findViewById(R.id.user_score);
        this.f5074r = (TextView) findViewById(R.id.users_info_msg);
        this.f5075s = (ImageView) findViewById(R.id.user_face);
        this.f5071o = (TextView) findViewById(R.id.user_age);
        this.f5075s.setOnClickListener(this);
        this.f5060d = new C1253ke(this);
        this.f5056B = new Handler(this);
        this.f5055A = new C0978a(this.f5056B, 1);
        new C1333nd(this).execute(null, null, null);
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
