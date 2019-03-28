package ly.pp.addsongs;

import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
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



/* renamed from: ly.pp.addsongs.nh */
public final class C1337nh extends AsyncTask {
    /* renamed from: a */
    final /* synthetic */ UsersInfo f6009a;
    /* renamed from: b */
    private String f6010b = "";

    public C1337nh(UsersInfo usersInfo) {
        this.f6009a = usersInfo;
    }

    /* renamed from: a */
    protected String doInBackground(String... strArr) {
        String str = "";
        HttpUriRequest httpPost = new HttpPost("http://121.199.31.116:8910/JustPianoServer/server/ChangeUserMsg");
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("head", "0"));
        arrayList.add(new BasicNameValuePair("version", this.f6009a.f5078v.mo2695K()));
        arrayList.add(new BasicNameValuePair("keywords", strArr[0]));
        if (strArr[1] == null || strArr[2] == null) {
            arrayList.add(new BasicNameValuePair("msg", this.f6009a.f5066j));
            arrayList.add(new BasicNameValuePair("age", String.valueOf(this.f6009a.f5067k)));
        } else {
            arrayList.add(new BasicNameValuePair("oldPass", strArr[1]));
            arrayList.add(new BasicNameValuePair("newPass", strArr[2]));
            this.f6010b = strArr[2];
        }
        arrayList.add(new BasicNameValuePair("userName", this.f6009a.f5078v.mo2701P()));
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
            return execute.getStatusLine().getStatusCode() == 200 ? String.valueOf(new DataInputStream(new ByteArrayInputStream(EntityUtils.toByteArray(execute.getEntity()))).read()) : str;
        } catch (ClientProtocolException e2) {
            e2.printStackTrace();
            return str;
        } catch (IOException e3) {
            e3.printStackTrace();
            return str;
        }
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        super.onPostExecute(str);
        if (str.equals("0")) {
            this.f6009a.f5060d.cancel();
            Toast.makeText(this.f6009a, "资料修改成功！", Toast.LENGTH_LONG).show();
        } else if (str.equals("5")) {
            this.f6009a.f5060d.cancel();
            Toast.makeText(this.f6009a, "原密码有错！请再试一遍", Toast.LENGTH_SHORT).show();
        } else if (str.equals("6")) {
            this.f6009a.f5060d.cancel();
            Toast.makeText(this.f6009a, "密码修改成功！", Toast.LENGTH_LONG).show();
            Editor edit = this.f6009a.f5078v.f4070d.edit();
            if (this.f6009a.f5059c) {
                edit.putString("name", this.f6009a.f5078v.mo2701P());
                edit.putString("password", this.f6010b);
                edit.putBoolean("chec_psw", this.f6009a.f5059c);
                edit.putBoolean("chec_autologin", this.f6009a.f5058b);
            } else {
                edit.putString("password", "");
                edit.putBoolean("chec_psw", this.f6009a.f5059c);
                edit.putBoolean("chec_autologin", this.f6009a.f5059c);
            }
            edit.commit();
        } else {
            this.f6009a.f5060d.cancel();
            Toast.makeText(this.f6009a, "连接有错！请再试一遍", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f6009a.f5060d.setCancelable(true);
        this.f6009a.f5060d.setOnCancelListener(new C1338ni(this));
        this.f6009a.f5060d.show();
    }

    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object... objArr) {
        super.onProgressUpdate( objArr[0]);
    }
}
