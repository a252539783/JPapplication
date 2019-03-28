package ly.pp.addsongs;

import android.content.Context;
import android.util.AttributeSet;
import android.support.v7.widget.*;

/* renamed from: ly.pp.addsongs.ScrollText */
public class ScrollText extends AppCompatTextView {
    public ScrollText(Context context) {
        super(context);
    }

    public ScrollText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean isFocused() {
        return true;
    }
}
