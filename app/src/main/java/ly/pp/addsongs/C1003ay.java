package ly.pp.addsongs;

import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;



/* renamed from: ly.pp.addsongs.ay */
public final class C1003ay extends AsyncTask {
    /* renamed from: a */
    String f5139a = "";
    /* renamed from: b */
    String f5140b = "";
    /* renamed from: c */
    String f5141c = "";
    /* renamed from: d */
    String f5142d = "";
    /* renamed from: e */
    final /* synthetic */ Login f5143e;

    public C1003ay(Login login) {
        this.f5143e = login;
    }

    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        this.f5143e.f4183i = this.f5143e.f4193s.getText().toString();
        this.f5143e.f4200z = this.f5143e.f4194t.getText().toString();
        if (!(this.f5143e.f4183i.equals("") || this.f5143e.f4200z.equals(""))) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/LoginServlet");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("versionName", this.f5143e.f3998d));
            arrayList.add(new BasicNameValuePair("packageNames", this.f5143e.f3999e));
            arrayList.add(new BasicNameValuePair("versionCode", String.valueOf(this.f5143e.f4000f)));
            arrayList.add(new BasicNameValuePair("username", this.f5143e.f4183i));
            arrayList.add(new BasicNameValuePair("password", this.f5143e.f4200z));
            arrayList.add(new BasicNameValuePair("id", this.f5143e.f4181D));
            arrayList.add(new BasicNameValuePair("local", this.f5143e.m3599c().toString()));
            try {
                ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(20000));
                defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(20000));
                HttpResponse execute = defaultHttpClient.execute(httpPost);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    this.f5139a = EntityUtils.toString(execute.getEntity());
                    Log.i("服务器返回信息：", this.f5139a);
                    return this.f5140b;
                }
            } catch (Exception e) {
                this.f5140b = "3";
                e.printStackTrace();
            }
        }
        return this.f5140b;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final /* synthetic */ void onPostExecute(Object obj) {
        int i;
        JSONException e;
        super.onPostExecute((String) obj);
        try {
            JSONObject jSONObject = new JSONObject(this.f5139a);
            i = jSONObject.getInt("is");
            try {
                this.f5141c = jSONObject.getString("msg");
                this.f5143e.f4182h = jSONObject.getString("ukn");
                this.f5143e.f4184j = jSONObject.getString("sex");
                this.f5142d = jSONObject.getString("title");
                this.f5143e.f4178A.f4073g = jSONObject.getString("T1");
                this.f5143e.f4178A.f4074h = jSONObject.getString("M1");
                this.f5143e.f4178A.f4075i = jSONObject.getString("T2");
                this.f5143e.f4178A.f4076j = jSONObject.getString("M2");
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                this.f5143e.f4195u.dismiss();
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        break;
                }
            }
        } catch (JSONException e3) {
            JSONException jSONException = e3;
            i = 3;
            e = jSONException;
        }
        this.f5143e.f4195u.dismiss();
        switch (i) {
            case 0:
                this.f5143e.mo2771a(i, this.f5141c, this.f5142d);
                return;
            case 1:
                this.f5143e.mo2671a("提示", "确定", this.f5141c);
                return;
            case 2:
                this.f5143e.mo2671a("提示", "确定", this.f5141c);
                return;
            case 3:
                this.f5143e.mo2671a("提示", "确定", "网络错误！");
                return;
            case 4:
                this.f5143e.mo2771a(i, this.f5141c, this.f5142d);
                return;
            case 5:
                this.f5143e.mo2771a(i, this.f5141c, this.f5142d);
                return;
            default:
        }
    }


    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5143e.f4195u.setCancelable(true);
        this.f5143e.f4195u.setOnCancelListener(new C1004az(this));
        this.f5143e.f4195u.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(objArr[0]);
    }
}
