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


/* renamed from: ly.pp.addsongs.kc */
final class C1251kc extends AsyncTask {
    /* renamed from: a */
    String f5778a;
    /* renamed from: b */
    final /* synthetic */ PopUserInfo f5779b;

    private C1251kc(PopUserInfo popUserInfo) {
        this.f5779b = popUserInfo;
        this.f5778a = "";
    }

    /* synthetic */ C1251kc(PopUserInfo popUserInfo, byte b) {
        this(popUserInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bb A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_13 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x0094} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bb A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_13 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x0094} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:16:0x00b6, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:?, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:19:0x00bb, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x00bc, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:21:0x00c0, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(Object[] objects) {
        if (!this.f5779b.f4829c.equals("")) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/" + this.f5779b.f4839m);
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("head", String.valueOf(this.f5779b.f4828b)));
            arrayList.add(new BasicNameValuePair("version", this.f5779b.f4836j.mo2695K()));
            arrayList.add(new BasicNameValuePair("keywords", this.f5779b.f4830d));
            arrayList.add(new BasicNameValuePair("userName", this.f5779b.f4829c));
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
                    this.f5778a = EntityUtils.toString(execute.getEntity());
                }
            } catch (ClientProtocolException e2) {
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return this.f5778a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5779b.f4828b != 1) {
            this.f5779b.f4827a.cancel();
            Toast.makeText(this.f5779b, "发送成功!", Toast.LENGTH_SHORT).show();
        } else if (this.f5778a.length() > 3) {
            PopUserInfo.m3823a(this.f5779b, this.f5778a);
            this.f5779b.f4827a.cancel();
        } else if (this.f5778a.equals("[]")) {
            this.f5779b.f4827a.cancel();
            Toast.makeText(this.f5779b, "数据出错！", Toast.LENGTH_SHORT).show();
        } else {
            this.f5779b.f4827a.cancel();
            Toast.makeText(this.f5779b, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
        }
    }



    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5779b.f4827a.setMessage("正在查询,请稍后...");
        this.f5779b.f4827a.setCancelable(true);
        this.f5779b.f4827a.setOnCancelListener(new C1252kd(this));
        this.f5779b.f4827a.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{(Integer[]) objArr[0]});
    }
}
