package com.coolweather.app.util;

public interface HttpCallbackListener {
	
	void onFinish(final String response);
	
	void onError(Exception e);

}
