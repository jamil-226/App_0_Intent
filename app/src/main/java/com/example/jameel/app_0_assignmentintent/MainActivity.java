package com.example.jameel.app_0_assignmentintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button moveButton, btnThird ,btnForPizza, btnForList;
        btnForList = (Button)(findViewById(R.id.BtnList)) ;
        btnForList.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(intent);
            }
        });



//        btnForPizza = (Button)(findViewById(R.id.btnPizza));
//
//        btnForPizza.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v)
//            {
//                Intent intent1 = new Intent(getApplicationContext(), Main3Activity.class);
//                startActivity(intent1);
//            }
//
//        });
//
//        final EditText editText = (EditText)(findViewById(R.id.EditTxtOne));

        moveButton = (Button)findViewById(R.id.btnAnother);

// tarting button listener
        moveButton.setOnClickListener(new View.OnClickListener()
                                      {
                                          @Override
                                          public void onClick(View v)
                                          {
                                              //String name = editText.getText().toString();
                                              Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
//                                              intent.putExtra("myName", name);
                                              startActivity(intent);
                                          }
                                      }
        );

        btnThird = (Button)(findViewById(R.id.btnForThirdAct));
        btnThird.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class) ;
                startActivity(intent);
            }
        });
    }
}
