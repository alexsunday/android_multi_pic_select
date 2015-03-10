package org.ccgzs.picbackup;

import com.nostra13.universalimageloader.core.ImageLoader;

import android.app.Activity;

public class BaseActivity extends Activity {
	protected ImageLoader imageLoader = ImageLoader.getInstance();
}
