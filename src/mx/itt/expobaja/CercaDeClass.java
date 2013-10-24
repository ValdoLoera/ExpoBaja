package mx.itt.expobaja;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class CercaDeClass extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cercademi);
	}
	
	public void cerrar(View view) {
    	finish();
    }  

}
