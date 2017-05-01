package com.appleking.newplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

public class MainActivity extends AppCompatActivity {

    private JCVideoPlayer jc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jc = (JCVideoPlayer) findViewById(R.id.jc_player);

        jc.setUpForFullscreen("http://live.hkstv.hk.lxdns.com/live/hks/playlist.m3u8","香港卫视");
    }

    @Override
    protected void onPause() {
        super.onPause();
//        jc.re
        jc.release();
    }
}
