/*
package com.mobile.teamc2tech.cmysore;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.InputDeviceCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.ui.PlaybackControlView;
import com.google.android.exoplayer2.ui.SimpleExoPlayerView;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.teamc2tech.cmysore.video.myapplication.R;

public class FullScreenActivity extends AppCompatActivity {
    private final String STATE_PLAYER_FULLSCREEN = "playerFullscreen";
    private final String STATE_RESUME_POSITION = "resumePosition";
    private final String STATE_RESUME_WINDOW = "resumeWindow";
    private ImageView imgAddress;
    private ImageView imgEmail;
    private ImageView imgMobile;
    private boolean mExoPlayerFullscreen = false;
    private SimpleExoPlayerView mExoPlayerView;
    private FrameLayout mFullScreenButton;
    private Dialog mFullScreenDialog;
    private ImageView mFullScreenIcon;
    private long mResumePosition;
    private int mResumeWindow;
    private Toolbar mToolbar;
    private MediaSource mVideoSource;
    private ProgressBar progressBar;
    private TextView txtEmail;

    */
/* renamed from: com.teamc2tech.cmysore.video.SingleScreen.FullScreenActivity$1 *//*

   */
/* class C04051 implements OnClickListener {
        C04051() {
        }

        public void onClick(View v) {
            Intent mapIntent = new Intent("android.intent.action.VIEW", Uri.parse("geo:12.292604,76.629392"));
            mapIntent.setPackage("com.google.android.apps.maps");
            if (mapIntent.resolveActivity(FullScreenActivity.this.getPackageManager()) != null) {
                FullScreenActivity.this.startActivity(mapIntent);
            }
        }
    }*//*


    */
/* renamed from: com.teamc2tech.cmysore.video.SingleScreen.FullScreenActivity$2 *//*

    class C04062 implements OnClickListener {
        C04062() {
        }

        public void onClick(View v) {
            if (FullScreenActivity.this.isPermissionGranted()) {
                try {
                    FullScreenActivity.this.startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:7204086662")));
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    */
/* renamed from: com.teamc2tech.cmysore.video.SingleScreen.FullScreenActivity$3 *//*

    class C04073 implements OnClickListener {
        C04073() {
        }

        public void onClick(View v) {
            Intent emailIntent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "cmysorechannel@gmail.com", null));
            emailIntent.putExtra("android.intent.extra.SUBJECT", "Subject");
            emailIntent.putExtra("android.intent.extra.TEXT", "Body");
            FullScreenActivity.this.startActivity(Intent.createChooser(emailIntent, "Send email..."));
        }
    }

    */
/* renamed from: com.teamc2tech.cmysore.video.SingleScreen.FullScreenActivity$4 *//*

    class C04084 implements OnClickListener {
        C04084() {
        }

        public void onClick(View view) {
            Intent emailIntent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "cmysorechannel@gmail.com", null));
            emailIntent.putExtra("android.intent.extra.SUBJECT", "Subject");
            emailIntent.putExtra("android.intent.extra.TEXT", "Body");
            FullScreenActivity.this.startActivity(Intent.createChooser(emailIntent, "Send email..."));
        }
    }

    */
/* renamed from: com.teamc2tech.cmysore.video.SingleScreen.FullScreenActivity$6 *//*

    class C04106 implements OnClickListener {
        C04106() {
        }

        public void onClick(View v) {
            if (FullScreenActivity.this.mExoPlayerFullscreen) {
                FullScreenActivity.this.closeFullscreenDialog();
            } else {
                FullScreenActivity.this.openFullscreenDialog();
            }
        }
    }

    */
/* renamed from: com.teamc2tech.cmysore.video.SingleScreen.FullScreenActivity$7 *//*

    class C05247 implements EventListener {
        C05247() {
        }

        public void onTimelineChanged(Timeline timeline, Object manifest) {
        }

        public void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {
        }

        public void onLoadingChanged(boolean isLoading) {
        }

        public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
            if (playbackState == 2) {
                FullScreenActivity.this.progressBar.setVisibility(0);
            } else {
                FullScreenActivity.this.progressBar.setVisibility(4);
            }
        }

        public void onRepeatModeChanged(int repeatMode) {
        }

        public void onPlayerError(ExoPlaybackException error) {
        }

        public void onPositionDiscontinuity() {
        }

        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_full_screen);
        getWindow().addFlags(128);
        this.progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.imgAddress = (ImageView) findViewById(R.id.imgAddress);
        this.imgMobile = (ImageView) findViewById(R.id.imgCall);
        this.imgEmail = (ImageView) findViewById(R.id.imgMail);
        this.txtEmail = (TextView) findViewById(R.id.txtEmail);
        this.imgAddress.setOnClickListener(new C04051());
        this.imgMobile.setOnClickListener(new C04062());
        this.imgEmail.setOnClickListener(new C04073());
        this.txtEmail.setOnClickListener(new C04084());
        this.mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.mToolbar.setTitleTextColor(InputDeviceCompat.SOURCE_ANY);
        if (savedInstanceState != null) {
            this.mResumeWindow = savedInstanceState.getInt("resumeWindow");
            this.mResumePosition = savedInstanceState.getLong("resumePosition");
            this.mExoPlayerFullscreen = savedInstanceState.getBoolean("playerFullscreen");
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("resumeWindow", this.mResumeWindow);
        outState.putLong("resumePosition", this.mResumePosition);
        outState.putBoolean("playerFullscreen", this.mExoPlayerFullscreen);
        super.onSaveInstanceState(outState);
    }





 */
/*   public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_exit) {
            finish();
            return true;
        }
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean isPermissionGranted() {
        if (VERSION.SDK_INT < 23 || checkSelfPermission("android.permission.CALL_PHONE") == 0) {
            return true;
        }
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.CALL_PHONE"}, 1);
        return false;
    }*//*

}
*/
