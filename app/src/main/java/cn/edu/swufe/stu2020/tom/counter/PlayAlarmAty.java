package cn.edu.swufe.stu2020.tom.counter;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class PlayAlarmAty extends Activity {

	private MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alarm_player_aty);
//		mp = MediaPlayer.create(this, R.raw.music);
//		mp.start();
}
	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		mp.stop();
		mp.release();
	}
}
