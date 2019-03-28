package ly.pp.addsongs;

import android.os.AsyncTask;
import android.widget.ListAdapter;
import android.widget.Toast;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


/* renamed from: ly.pp.addsongs.bw */
public final class C1028bw extends AsyncTask {
    /* renamed from: a */
    String f5194a = "";
    /* renamed from: b */
    final /* synthetic */ MoreAppActivity f5195b;

    public C1028bw(MoreAppActivity moreAppActivity) {
        this.f5195b = moreAppActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a4 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x007d} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a4 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x007d} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:16:0x009f, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:?, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:19:0x00a4, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x00a5, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:21:0x00a9, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        if (this.f5195b.f4280j.equals("")) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/GetAppList");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("head", String.valueOf(this.f5195b.f4281k)));
            arrayList.add(new BasicNameValuePair("version", this.f5195b.f4273c.mo2695K()));
            arrayList.add(new BasicNameValuePair("keywords", this.f5195b.f4280j));
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
                    this.f5194a = EntityUtils.toString(execute.getEntity());
                }
            } catch (ClientProtocolException e2) {
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return this.f5194a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5194a.length() > 3) {
            JSONObject jSONObject = new JSONObject();
            try {
                this.f5195b.f4272b = this.f5195b.m3629b(C1340nk.m4156b(new JSONObject(this.f5194a).getString("L")));
                ListAdapter c1026bu = new C1026bu(this.f5195b, this.f5195b.f4279i, this.f5195b.f4272b);
                if (this.f5195b.f4271a != null) {
                    this.f5195b.f4271a.setAdapter(c1026bu);
                }
                this.f5195b.f4271a.setCacheColorHint(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f5195b.f4277g.cancel();
        } else if (this.f5194a.equals("[]")) {
            this.f5195b.f4277g.cancel();
            Toast.makeText(this.f5195b, "数据出错！", Toast.LENGTH_SHORT).show();
        } else {
            this.f5195b.f4277g.cancel();
            Toast.makeText(this.f5195b, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
        }
    }


    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5195b.f4277g.setMessage("正在载入,请稍后...");
        this.f5195b.f4277g.setCancelable(true);
        this.f5195b.f4277g.setOnCancelListener(new C1029bx(this));
        this.f5195b.f4277g.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
