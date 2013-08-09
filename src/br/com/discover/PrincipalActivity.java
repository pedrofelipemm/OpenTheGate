package br.com.discover;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PrincipalActivity extends Activity {

	private Button btnAbrir;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		btnAbrir =  (Button) findViewById(R.id.btnAdd);
		 
		btnAbrir.setOnClickListener(cliqueBtnAbrir);
		
	}
	
	private OnClickListener cliqueBtnAbrir = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			new AsyncREST().execute();						
		}
	};
	
}
