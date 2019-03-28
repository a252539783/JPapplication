package ly.pp.addsongs;

import android.os.AsyncTask;
import android.widget.ListAdapter;
import android.widget.Toast;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.lo */
public final class C1290lo extends AsyncTask {
    /* renamed from: a */
    String f5897a = "";
    /* renamed from: b */
    final /* synthetic */ ShowTopInfo f5898b;

    public C1290lo(ShowTopInfo showTopInfo) {
        this.f5898b = showTopInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0132 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:8:0x010b} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0132 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:8:0x010b} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:21:0x0132, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:22:0x0133, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:26:0x013c, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:27:0x013d, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        if (!this.f5898b.f4988d.equals("")) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/GetTopListByKeywords");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("head", String.valueOf(this.f5898b.f4991g)));
            arrayList.add(new BasicNameValuePair("version", this.f5898b.f5000p.mo2695K()));
            arrayList.add(new BasicNameValuePair("keywords", this.f5898b.f4988d));
            arrayList.add(new BasicNameValuePair("page", String.valueOf(this.f5898b.f4996l)));
            arrayList.add(new BasicNameValuePair("P", this.f5898b.f4999o));
            arrayList.add(new BasicNameValuePair("K", this.f5898b.f5000p.mo2702Q()));
            arrayList.add(new BasicNameValuePair("N", this.f5898b.f5000p.mo2701P()));
            if (this.f5898b.f4991g == 5) {
                arrayList.add(new BasicNameValuePair("X", String.valueOf(this.f5898b.f5000p.f4070d.getInt("local_x", 0))));
                arrayList.add(new BasicNameValuePair("Y", String.valueOf(this.f5898b.f5000p.f4070d.getInt("local_y", 0))));
            }
            try {
                ((HttpPost) httpPost).setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(10000));
            defaultHttpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));
            try {
                HttpResponse execute = defaultHttpClient.execute(httpPost);
                if (execute.getStatusLine().getStatusCode() == 200) {
                    this.f5897a = EntityUtils.toString(execute.getEntity());
                }
            } catch (ParseException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return this.f5897a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5897a.length() > 3) {
            JSONObject jSONObject = new JSONObject();
            try {
                this.f5898b.f4985a = this.f5898b.m3877a(C1340nk.m4156b(new JSONObject(this.f5897a).getString("L")));
                ListAdapter c1292lq = new C1292lq(this.f5898b, this.f5898b.f4987c, this.f5898b.f4985a);
                if (this.f5898b.f4989e != null) {
                    this.f5898b.f4989e.setAdapter(c1292lq);
                }
                this.f5898b.f4989e.setCacheColorHint(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f5898b.f4990f.cancel();
        } else if (this.f5897a.equals("[]")) {
            this.f5898b.f4990f.cancel();
            Toast.makeText(this.f5898b, "数据出错！", Toast.LENGTH_SHORT).show();
        } else {
            this.f5898b.f4990f.cancel();
            Toast.makeText(this.f5898b, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
        }
    }


    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5898b.f4990f.setMessage("正在查询,请稍后...");
        this.f5898b.f4990f.setCancelable(true);
        this.f5898b.f4990f.setOnCancelListener(new C1291lp(this));
        this.f5898b.f4990f.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
