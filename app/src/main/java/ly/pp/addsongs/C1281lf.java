package ly.pp.addsongs;

import android.os.AsyncTask;
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



/* renamed from: ly.pp.addsongs.lf */
public final class C1281lf extends AsyncTask {
    /* renamed from: a */
    String f5875a = "";
    /* renamed from: b */
    final /* synthetic */ ShowSongsInfo f5876b;

    public C1281lf(ShowSongsInfo showSongsInfo) {
        this.f5876b = showSongsInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c8 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x00a1} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c8 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x00a1} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:16:0x00c3, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:?, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:19:0x00c8, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x00c9, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:21:0x00cd, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        if (!this.f5876b.f4967c.equals("")) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/GetListByKeywords");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", this.f5876b.f4981q.mo2695K()));
            arrayList.add(new BasicNameValuePair("head", this.f5876b.f4978n));
            arrayList.add(new BasicNameValuePair("keywords", this.f5876b.f4967c));
            arrayList.add(new BasicNameValuePair("user", this.f5876b.f4981q.mo2701P()));
            arrayList.add(new BasicNameValuePair("page", String.valueOf(this.f5876b.f4979o)));
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
                    this.f5875a = EntityUtils.toString(execute.getEntity());
                }
            } catch (ClientProtocolException e2) {
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return this.f5875a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5875a.length() > 3) {
            this.f5876b.mo2977a(this.f5875a, this.f5876b.f4970f);
            this.f5876b.f4970f.setCacheColorHint(0);
            this.f5876b.f4971g.cancel();
        } else if (this.f5875a.equals("[]")) {
            this.f5876b.f4971g.cancel();
            Toast.makeText(this.f5876b, "获取列表出错！", Toast.LENGTH_SHORT).show();
        } else {
            this.f5876b.f4971g.cancel();
            Toast.makeText(this.f5876b, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
        }
    }


    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5876b.f4971g.setMessage("正在搜索曲库,请稍后...");
        this.f5876b.f4971g.setCancelable(true);
        this.f5876b.f4971g.setOnCancelListener(new C1282lg(this));
        this.f5876b.f4971g.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
