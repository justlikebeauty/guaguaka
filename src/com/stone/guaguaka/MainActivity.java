package com.stone.guaguaka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.stone.guaguaka.view.RipClothes;

public class MainActivity extends Activity {

    RipClothes mRipClothes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mGuaGuaKaView = (GuaView) findViewById(R.id.st_guaguaka);
//        mGuaGuaKaView.setOnGuaGuaKaCompletedListener(new GuaView.onGuaGuaKaCompletedListener() {
//            @Override
//            public void complete(String message) {
//                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
//            }
//        });
//
//        mGuaGuaKaView2 = (GuaView) findViewById(R.id.st_guaguaka2);
//        mGuaGuaKaView2.setOnGuaGuaKaCompletedListener(new GuaView.onGuaGuaKaCompletedListener() {
//            @Override
//            public void complete(String message) {
//                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
//            }
//        });

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int upImageId = bundle.getInt("up");
        int backImageId = bundle.getInt("back");

        mRipClothes = (RipClothes) findViewById(R.id.rc_rip);
        mRipClothes.setImages(upImageId, backImageId);
        //startActivity(new Intent(this, StartActivity.class));
    }


}
