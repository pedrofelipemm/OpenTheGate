package br.com.discover;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import android.os.AsyncTask;

public class AsyncREST extends AsyncTask<Void, Void, Void>{


	private static final String PUSH_URL = "http://10.10.51.2/abrirPortao.py?q=w";
	
    protected Void doInBackground(Void... noParameters) {
    
    	try {
			
			DefaultHttpClient httpclient = new DefaultHttpClient();
			
			HttpPost httpost = new HttpPost(PUSH_URL);
			
			httpost.addHeader("Content-Type", "application/json");
			
			StringEntity reqEntity = new StringEntity(new JSONObject().toString());
			
			httpost.setEntity(reqEntity);
			
			httpclient.execute(httpost);	
						
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	this.cancel(true);
    	
    	return null;
    }
    
}