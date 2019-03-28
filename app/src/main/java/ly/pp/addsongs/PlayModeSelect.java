package ly.pp.addsongs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

/* renamed from: ly.pp.addsongs.PlayModeSelect */
public class PlayModeSelect extends Activity implements OnClickListener {
    /* renamed from: a */
    Intent f4683a;
    /* renamed from: b */
    Context f4684b;
    /* renamed from: c */
    Button f4685c;
    /* renamed from: d */
    Button f4686d;
    /* renamed from: e */
    Button f4687e;
    /* renamed from: f */
    Button f4688f;
    /* renamed from: g */
    Button f4689g;
    /* renamed from: h */
    private JPApplication f4690h;

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, MainMode.class);
        startActivity(intent);
        finish();
    }

    public void onClick(View view) {
        JPApplication jPApplication;
        JPApplication jPApplication2;
        Intent intent;
        switch (view.getId()) {
            case R.id.game_mode:
                this.f4683a = new Intent();
                this.f4683a.setClass(this.f4684b, MelodySelect.class);
                jPApplication = this.f4690h;
                jPApplication.mo2718c(0);
                startActivity(this.f4683a);
                finish();
                return;
            case R.id.practice_mode:
                intent = new Intent();
                intent.setClass(this.f4684b, MelodySelect.class);
                jPApplication2 = this.f4690h;
                jPApplication2.mo2718c(2);
                startActivity(intent);
                finish();
                return;
            case R.id.free_mode:
                this.f4683a = new Intent();
                this.f4683a.setClass(this.f4684b, MelodySelect.class);
                jPApplication = this.f4690h;
                jPApplication.mo2718c(1);
                startActivity(this.f4683a);
                finish();
                return;
            case R.id.listen_mode:
                intent = new Intent();
                intent.setClass(this.f4684b, MelodySelect.class);
                jPApplication2 = this.f4690h;
                jPApplication2.mo2718c(3);
                startActivity(intent);
                finish();
                return;
            case R.id.keyboard:
                intent = new Intent();
                intent.setClass(this.f4684b, KeyBoard.class);
                startActivity(intent);
                finish();
                return;
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4690h = (JPApplication) getApplication();
        setContentView(R.layout.play_select);
        this.f4690h.mo2706a(this, "ground", (LinearLayout) findViewById(R.id.layout));
        this.f4685c = findViewById(R.id.game_mode);
        this.f4685c.setOnClickListener(this);
        this.f4686d = findViewById(R.id.free_mode);
        this.f4686d.setOnClickListener(this);
        this.f4687e = findViewById(R.id.keyboard);
        this.f4687e.setOnClickListener(this);
        this.f4688f = findViewById(R.id.practice_mode);
        this.f4688f.setOnClickListener(this);
        this.f4689g = findViewById(R.id.listen_mode);
        this.f4689g.setOnClickListener(this);
        this.f4684b = this;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();

    }

    public void onResume() {
        super.onResume();

    }
}
