package com.example.appqrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConteudoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mostrar_valor);
		
		 TextView c = (TextView) findViewById(R.id.textViewValorLido);

	        Intent intent = getIntent();

	        c.setText(("Conteúdo: "+ (String) intent.getSerializableExtra("c")));
	}

}
