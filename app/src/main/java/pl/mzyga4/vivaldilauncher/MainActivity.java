package pl.mzyga4.vivaldilauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startApp("com.vivaldi.browser");
    }

    public void startApp(String packageName){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntent != null) { //null pointer check in case package name was not found
            finish();
            startActivity(launchIntent);
        }
    }

}