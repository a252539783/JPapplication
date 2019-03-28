package ly.pp.addsongs;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;

/* renamed from: ly.pp.addsongs.ke */
public final class C1253ke extends ProgressDialog {
    /* renamed from: a */
    private boolean f5781a;
    /* renamed from: b */
    private JPApplication f5782b;
    /* renamed from: c */
    private ConnectionService f5783c;

    public C1253ke(Context context) {
        super(context);
        this.f5781a = false;
    }

    public C1253ke(Context context, JPApplication jPApplication) {
        super(context);
        this.f5781a = false;
        this.f5781a = true;
        this.f5782b = jPApplication;
        this.f5783c = jPApplication.mo2697M();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f5781a) {
            try {
                if (this.f5783c != null) {
                    this.f5783c.mo2675a();
                }
                if (this.f5782b.mo2698N()) {
                    this.f5782b.unbindService(this.f5782b.mo2696L());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void onStart() {
        super.onStart();
    }

    public final void show() {
        super.show();
        setContentView(R.layout.prgdialog);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.5f;
        window.setAttributes(attributes);
        ImageView imageView =  findViewById(R.id.loading_img);
        imageView.setImageResource(R.drawable.animation);
        imageView.post(new C1254kf(this, imageView));
    }
}
