package ly.pp.addsongs;

import android.os.AsyncTask;
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


/* renamed from: ly.pp.addsongs.nd */
public final class C1333nd extends AsyncTask {
    /* renamed from: a */
    String f6004a = "";
    /* renamed from: b */
    final /* synthetic */ UsersInfo f6005b;

    public C1333nd(UsersInfo usersInfo) {
        this.f6005b = usersInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b0 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_12 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x0089} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b0 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_12 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x0089} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:19:0x00b0, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x00b1, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:24:0x00ba, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x00bb, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(Object[] objects){
        if (!this.f6005b.f5078v.mo2701P().equals("")) {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/GetUserInfo");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("head", "0"));
            arrayList.add(new BasicNameValuePair("version", this.f6005b.f5078v.mo2695K()));
            arrayList.add(new BasicNameValuePair("keywords", "0"));
            arrayList.add(new BasicNameValuePair("userName", this.f6005b.f5078v.mo2701P()));
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
                    this.f6004a = EntityUtils.toString(execute.getEntity());
                }
            } catch (ParseException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return this.f6004a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f6004a.length() > 3) {
            UsersInfo.m3930a(this.f6005b, this.f6004a);
            this.f6005b.f5060d.cancel();
        } else if (this.f6004a.equals("[]")) {
            this.f6005b.f5060d.cancel();
            Toast.makeText(this.f6005b, "数据出错！", Toast.LENGTH_SHORT).show();
        } else {
            this.f6005b.f5060d.cancel();
            Toast.makeText(this.f6005b, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
        }
    }



    protected final void onPreExecute() {
        super.onPreExecute();
        this.f6005b.f5060d.setMessage("正在查询,请稍后...");
        this.f6005b.f5060d.setCancelable(true);
        this.f6005b.f5060d.setOnCancelListener(new C1334ne(this));
        this.f6005b.f5060d.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(new Object[]{(Integer[]) objArr[0]});
    }
}
