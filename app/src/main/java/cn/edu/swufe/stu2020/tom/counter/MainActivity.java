package cn.edu.swufe.stu2020.tom.counter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {

	private TabHost tabHost;
	private StopWatchView stopWatchView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();


		tabHost.addTab(tabHost.newTabSpec("tabTime").setIndicator("时间")
				.setContent(R.id.tabTime));
		tabHost.addTab(tabHost.newTabSpec("tabAlarm").setIndicator("闹钟")
				.setContent(R.id.tabAlarm));
		tabHost.addTab(tabHost.newTabSpec("tabTimer").setIndicator("计时器")
				.setContent(R.id.tabTimer));
		tabHost.addTab(tabHost.newTabSpec("tabStopWatch").setIndicator("秒表")
				.setContent(R.id.tabStopWatch));
		
		stopWatchView = (StopWatchView) findViewById(R.id.tabStopWatch);
	}
	
	@Override
	protected void onDestroy() {
		stopWatchView.onDestroy();
		super.onDestroy();
	}
}