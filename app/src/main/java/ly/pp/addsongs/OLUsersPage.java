package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;


/* renamed from: ly.pp.addsongs.OLUsersPage */
public class OLUsersPage extends Activity implements OnClickListener {
    /* renamed from: a */
    private JPApplication f4569a;
    /* renamed from: b */
    private Button f4570b;
    /* renamed from: c */
    private View f4571c;
    /* renamed from: d */
    private Button f4572d;
    /* renamed from: e */
    private Button f4573e;
    /* renamed from: f */
    private Button f4574f;

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, OLMainMode.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.ol_search_b:
                intent.putExtra("head", 6);
                intent.setClass(this, SearchSongs.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_userInfo_b:
                intent.putExtra("head", 0);
                intent.setClass(this, UsersInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_friends_b:
                intent.setClass(this, FriendMailPage.class);
                intent.putExtra("head", 5);
                intent.putExtra("type", "F");
                startActivity(intent);
                finish();
                return;
            case R.id.ol_mail_b:
                intent.setClass(this, FriendMailPage.class);
                intent.putExtra("head", 5);
                intent.putExtra("type", "M");
                startActivity(intent);
                finish();
                return;
            case R.id.ol_local_b:
                intent.setClass(this, ShowTopInfo.class);
                intent.putExtra("head", 5);
                intent.putExtra("keywords", "F");
                startActivity(intent);
                finish();
                return;
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4569a = (JPApplication) getApplication();
        setContentView(R.layout.ol_users_page);
        this.f4569a.mo2706a((Context) this, "ground", (LinearLayout) findViewById(R.id.layout));
        JPApplication jPApplication = this.f4569a;
        JPApplication jPApplication2 = this.f4569a;
        jPApplication.mo2718c(0);
        this.f4570b = (Button) findViewById(R.id.ol_userInfo_b);
        this.f4570b.setOnClickListener(this);
        this.f4571c = (Button) findViewById(R.id.ol_search_b);
        this.f4571c.setOnClickListener(this);
        this.f4572d = (Button) findViewById(R.id.ol_mail_b);
        this.f4572d.setOnClickListener(this);
        this.f4573e = (Button) findViewById(R.id.ol_friends_b);
        this.f4573e.setOnClickListener(this);
        this.f4574f = (Button) findViewById(R.id.ol_local_b);
        this.f4574f.setOnClickListener(this);
    }

    public void onPause() {

        super.onPause();
    }

    protected void onResume() {

        super.onResume();
    }
}
