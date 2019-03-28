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



/* renamed from: ly.pp.addsongs.dc */
public final class C1062dc extends AsyncTask {
    /* renamed from: a */
    String f5313a = "";
    /* renamed from: b */
    String f5314b = "";
    /* renamed from: c */
    String f5315c = "";
    /* renamed from: d */
    String f5316d = "";
    /* renamed from: e */
    final /* synthetic */ OLMainMode f5317e;

    public C1062dc(OLMainMode oLMainMode) {
        this.f5317e = oLMainMode;
    }

    /* renamed from: a */
    protected String doInBackground(String... strArr) {
        if (!(strArr[0].equals("") || strArr[1].equals(""))) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/FindPassServlet");
            this.f5317e.mo2670a();
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("versionName", this.f5317e.f3998d));
            arrayList.add(new BasicNameValuePair("packageNames", this.f5317e.f3999e));
            arrayList.add(new BasicNameValuePair("versionCode", String.valueOf(this.f5317e.f4000f)));
            arrayList.add(new BasicNameValuePair("password", strArr[0]));
            arrayList.add(new BasicNameValuePair("mail", strArr[1]));
            arrayList.add(new BasicNameValuePair("type", strArr[2]));
            arrayList.add(new BasicNameValuePair("username", this.f5317e.f4292r.mo2701P()));
            try {
                ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(20000));
                defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(20000));
                HttpResponse execute = defaultHttpClient.execute(httpPost);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    this.f5313a = EntityUtils.toString(execute.getEntity());
                    Log.e("服务器返回信息：", this.f5313a);
                    return this.f5314b;
                }
            } catch (Exception e) {
                this.f5314b = "3";
                e.printStackTrace();
            }
        }
        return this.f5314b;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final /* synthetic */ void onPostExecute(Object obj) {
        int i;
        JSONException e;
        super.onPostExecute((String) obj);
        try {
            JSONObject jSONObject = new JSONObject(this.f5313a);
            i = jSONObject.getInt("is");
            try {
                this.f5315c = jSONObject.getString("msg");
                this.f5316d = jSONObject.getString("title");
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                this.f5317e.f3997c.dismiss();
                switch (i) {
                    case 0:
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
        } catch (JSONException e3) {
            JSONException jSONException = e3;
            i = 0;
            e = jSONException;
        }
        this.f5317e.f3997c.dismiss();
        switch (i) {
            case 0:
                this.f5317e.mo2671a("提示", "确定", "网络错误！");
                return;
            case 1:
                this.f5317e.mo2671a(this.f5316d, "确定", this.f5315c);
                return;
            default:
                return;
        }
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5317e.f3997c.setCancelable(true);
        this.f5317e.f3997c.setOnCancelListener(new C1063dd(this));
        this.f5317e.f3997c.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
