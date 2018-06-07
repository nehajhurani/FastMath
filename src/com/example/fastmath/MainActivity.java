package com.example.fastmath;

import android .support.v7.app.ActionBarActivity;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends Activity {

	 Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
     button7 , button8 , button9 , buttonadd , buttonsub , buttondiv ,
     buttonmul , buttondot , buttonc , buttonequal ;
	 
	 
	 EditText editText1;
	 
	 float mValueOne , mValueTwo ;
	 
	 boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttondot = (Button) findViewById(R.id.buttondot);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttonc = (Button) findViewById(R.id.buttonc);
        buttonequal = (Button) findViewById(R.id.buttonequal);
        editText1 = (EditText) findViewById(R.id.editText1);
        
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"1");
            }
        });
 
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"2");
            }
        });
 
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"3");
            }
        });
 
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"4");
            }
        });
 
        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"5");
            }
        });
 
        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"6");
            }
        });
 
        button7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"7");
            }
        });
 
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"8");
            }
        });
 
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"9");
            }
        });
 
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+"0");
            }
        });
 
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                if (editText1 == null){
                    editText1.setText("");
                }else {
                    mValueOne = Float.parseFloat(editText1.getText() + "");
                    mAddition = true;
                    editText1.setText(null);
                }
            }
        });
 
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText1.getText() + "");
                mSubtract = true ;
                editText1.setText(null);
            }
        });
 
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText1.getText() + "");
                mMultiplication = true ;
                editText1.setText(null);
            }
        });
 
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText1.getText()+"");
                mDivision = true ;
                editText1.setText(null);
            }
        });
 
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float mValueTwo = Float.parseFloat(editText1.getText() + "");
 
                if (mAddition == true){
 
                    editText1.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }
 
 
                if (mSubtract == true){
                    editText1.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }
 
                if (mMultiplication == true){
                    editText1.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }
 
                if (mDivision == true){
                    editText1.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });
 
        buttonc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
            }
        });
 
        buttondot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(editText1.getText()+".");
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
