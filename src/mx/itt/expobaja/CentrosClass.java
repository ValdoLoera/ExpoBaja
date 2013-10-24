package mx.itt.expobaja;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class CentrosClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.centrocomercial);
	}
	
	public void cerrar(View view) {
    	finish();
    }  
	
}
