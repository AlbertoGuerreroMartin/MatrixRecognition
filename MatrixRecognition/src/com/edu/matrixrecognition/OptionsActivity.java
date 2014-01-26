package com.edu.matrixrecognition;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.view.Menu;
import android.widget.TextView;

public class OptionsActivity extends Activity {
	
	private TextView testTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
		
		this.testTextView = (TextView) findViewById(R.id.test_textView);
		
		Intent intent = getIntent();
		String matrixData = intent.getStringExtra("matrix_data");

		
		Matrix matrix = new Matrix();
		//matrix.mapPoints();
		
		this.testTextView.setText(matrixData);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options, menu);
		return true;
	}

}
