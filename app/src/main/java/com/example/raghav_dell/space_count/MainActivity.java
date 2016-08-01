package com.example.raghav_dell.space_count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e,e1,e2;
    Button b;
    int count1,count2,space=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showp();
    }
    void showp()
    {
        e=(EditText)findViewById(R.id.editText);
        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText3);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= String.valueOf(e.getText());
                char a[]=s.toCharArray();
                count1=s.length();
                for(int i=0;i<s.length();++i)
                {
                    if(a[i]== ' ')
                        ++space;

                }
                count2=count1-space;
                e1.setText(Integer.valueOf(count1).toString() );
                e2.setText(Integer.valueOf(count2).toString());


            }
        });
    }
}
