package ly.pp.addsongs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;


/* renamed from: ly.pp.addsongs.SettingsMode */
public class SettingsMode extends Activity {//implements OnPreferenceChangeListener {
    /* renamed from: a */
    boolean f4963a = false;
    /* renamed from: b */
    //private C1253ke f4964b;

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(this, MainMode.class);
        startActivity(intent);
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        //this.f4964b = new C1253ke(this);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
        //addPreferencesFromResource(R.xml.settings);
    }
    public static class SettingsFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings);
        }
    }

    public void onPause() {
        super.onPause();
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        return false;
    }

    public void onResume() {
        super.onResume();

    }
}
