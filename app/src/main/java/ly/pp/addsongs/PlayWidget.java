package ly.pp.addsongs;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

/* renamed from: ly.pp.addsongs.PlayWidget */
public class PlayWidget extends AppWidgetProvider {
    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        //for (int i : iArr) {
            //"this is [" + i + "] onUpdate!";
       // }
    }

    public void onDisabled(Context context) {
        super.onDisabled(context);
    }

    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
       // for (int i : iArr) {
            //"this is [" + i + "] onUpdate!";
        //}
    }
}
