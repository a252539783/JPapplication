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


/* renamed from: ly.pp.addsongs.jt */
public final class C1241jt extends AsyncTask {
    /* renamed from: a */
    String f5734a = "";
    /* renamed from: b */
    final /* synthetic */ PlayFinish f5735b;

    public C1241jt(PlayFinish playFinish) {
        this.f5735b = playFinish;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d2 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x00ab} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d2 A:{ExcHandler: org.apache.http.client.ClientProtocolException (r0_11 'e' org.apache.http.client.ClientProtocolException), Splitter: B:6:0x00ab} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:19:0x00d2, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x00d3, code:
            r0.printStackTrace();
     */
    /* JADX WARNING: Missing block: B:24:0x00dc, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x00dd, code:
            r0.printStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected String doInBackground(Object[] objects){
        if (this.f5735b.f4656U.mo2701P() != "") {
            HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/ScoreUpload");
            List arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", this.f5735b.f4656U.mo2695K()));
            arrayList.add(new BasicNameValuePair("songID", this.f5735b.f4670n));
            arrayList.add(new BasicNameValuePair("songName", this.f5735b.f4668l));
            arrayList.add(new BasicNameValuePair("userName", this.f5735b.f4656U.mo2701P()));
            arrayList.add(new BasicNameValuePair("userKitiName", this.f5735b.f4656U.mo2702Q()));
            arrayList.add(new BasicNameValuePair("scoreArray", this.f5735b.f4653Q));
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
                    this.f5734a = EntityUtils.toString(execute.getEntity());
                }
            } catch (ParseException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            } //catch (ClientProtocolException e4) { }
        }
        return this.f5734a;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((String) obj);
        if (this.f5734a.equals("0")) {
            this.f5735b.f4657a.dismiss();
        } else if (this.f5734a.equals("1")) {
            this.f5735b.f4657a.dismiss();
            Toast.makeText(this.f5735b, "连接出错！", Toast.LENGTH_SHORT).show();
        } else if (this.f5734a.equals("2")) {
            this.f5735b.f4657a.dismiss();
            Toast.makeText(this.f5735b, "该版本无法上传成绩，请更新版本！", Toast.LENGTH_SHORT).show();
        }
    }



    protected final void onPreExecute() {
        super.onPreExecute();
        this.f5735b.f4657a.setMessage("正在上传您的成绩,请稍后...");
        this.f5735b.f4657a.setCancelable(true);
        this.f5735b.f4657a.setOnCancelListener(new C1242ju(this));
        this.f5735b.f4657a.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate(objArr[0]);
    }
}
