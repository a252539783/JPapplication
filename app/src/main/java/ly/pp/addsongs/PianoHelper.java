package ly.pp.addsongs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ViewFlipper;

/* renamed from: ly.pp.addsongs.PianoHelper */
public class PianoHelper extends Activity implements OnGestureListener {
    /* renamed from: a */
    private int[] f4575a = new int[]{R.drawable.help0, R.drawable.help1, R.drawable.help2};
    /* renamed from: b */
    private GestureDetector f4576b = null;
    /* renamed from: c */
    private ViewFlipper f4577c = null;
    /* renamed from: d */
    private Activity f4578d = null;

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, MainMode.class);
        startActivity(intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.piano_helper);
        this.f4578d = this;
        this.f4577c = (ViewFlipper) findViewById(R.id.viewflipper);
        this.f4576b = new GestureDetector(this, this);
        for (int imageResource : this.f4575a) {
            View imageView = new ImageView(this);
            ((ImageView) imageView).setImageResource(imageResource);
            ((ImageView) imageView).setScaleType(ScaleType.FIT_XY);
            this.f4577c.addView(imageView, new LayoutParams(-1, -1));
        }
        this.f4577c.setAutoStart(false);
        this.f4577c.setFlipInterval(30000);
        if (this.f4577c.isAutoStart() && !this.f4577c.isFlipping()) {
            this.f4577c.startFlipping();
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Animation loadAnimation;
        Animation loadAnimation2;
        if (motionEvent2.getX() - motionEvent.getX() > 120.0f) {
            loadAnimation = AnimationUtils.loadAnimation(this.f4578d, R.anim.push_right_in);
            loadAnimation2 = AnimationUtils.loadAnimation(this.f4578d, R.anim.push_right_out);
            this.f4577c.setInAnimation(loadAnimation);
            this.f4577c.setOutAnimation(loadAnimation2);
            this.f4577c.showPrevious();
        } else if (motionEvent2.getX() - motionEvent.getX() < -120.0f) {
            loadAnimation = AnimationUtils.loadAnimation(this.f4578d, R.anim.push_left_in);
            loadAnimation2 = AnimationUtils.loadAnimation(this.f4578d, R.anim.push_left_out);
            this.f4577c.setInAnimation(loadAnimation);
            this.f4577c.setOutAnimation(loadAnimation2);
            this.f4577c.showNext();
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f4577c.stopFlipping();
        this.f4577c.setAutoStart(false);
        return this.f4576b.onTouchEvent(motionEvent);
    }
}
