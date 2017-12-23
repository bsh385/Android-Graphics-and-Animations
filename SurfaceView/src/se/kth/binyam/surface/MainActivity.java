package se.kth.binyam.surface;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }  
        
    public void onStartClick(View view) {
    	Intent intent = new Intent(MainActivity.this, SurfaceActivity.class);
    	startActivity(intent);
    }
    
    public void onExitClick(View view) {
    	finish();
    }
}