package com.stone.guaguaka;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.stone.guaguaka.view.OverlayImageView;

public class StartActivity extends Activity implements View.OnClickListener {

    private int[] imageViewIds = {R.id.image1, R.id.image2, R.id.image3, R.id.image4, R.id.image5, R.id.image6,};
    private int[] upImageIds = {R.drawable.g1_up, R.drawable.g2_up, R.drawable.g3_up, R.drawable.g4_up, R.drawable.g5_up, R.drawable.g6_up,};
    private int[] backImageIds = {R.drawable.g1_back, R.drawable.g2_back, R.drawable.g3_back, R.drawable.g4_back, R.drawable.g5_back, R.drawable.g6_back,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);

        for (int i = 0; i < imageViewIds.length; ++i) {
            ImageView imageView = (ImageView) findViewById(imageViewIds[i]);
            imageView.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        int matchedIdx = -1;
        for (int i = 0; i < imageViewIds.length; ++i) {
            if (id == imageViewIds[i]) {
                matchedIdx = i;
                break;
            }
        }

        if (matchedIdx >= 0) {
            Intent intent = new Intent(this, MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("up", upImageIds[matchedIdx]);
            bundle.putInt("back", backImageIds[matchedIdx]);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
