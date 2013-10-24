package mx.itt.expobaja;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		setContentView(R.layout.principal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		//return true;
		
		//Codigo v.2.0
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuapp, menu);		
        return true;
				
	}
	
	//Abrir actividad Restaurantes
		public void lanzar(View view) {
	        Intent i = new Intent(this, RestaurantesClass.class );
	        startActivity(i);
	  }  
	
				//Abrir actividad Centros Comerciales
				public void lanzar1(View view) {
			        Intent i = new Intent(this, CentrosClass.class );
			        startActivity(i);
			  } 
				
				//Abrir actividad Bares
				public void lanzar2(View view) {
			        Intent i = new Intent(this, BaresClass.class );
			        startActivity(i);
			  }
				
				//Abrir actividad Locales
				public void lanzar3(View view) {
			        Intent i = new Intent(this, LocalesClass.class );
			        startActivity(i);
			  }
		
				//Abrir actividad Cerca de mi
				public void lanzar4(View view) {
			        Intent i = new Intent(this, CercaDeClass.class );
			        startActivity(i);
			  }
				
	public void cerrar(View view) {
    	finish();
	}
	

}
