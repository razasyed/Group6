package de.hfu.online_shop_v60;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;

public class UserInformationViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information_view);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.user_information_view, menu);
        return true;
    }
    
// // Code for External Web-link
//    Button button;
//    public void addListenerOnButton() {
//    	button = (Button) findViewById(R.id.HFU_Button);
//    	button.setOnCLickListener(new OnClickListener() {
//    	@Override
//    	public void onClick(View arg0) {
//    	Intent browserIntent =
//    			new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hs-furtwangen.de"));
//    	            startActivity(browserInternet);
//    	            }
//    	});
//       }
} // class ends


