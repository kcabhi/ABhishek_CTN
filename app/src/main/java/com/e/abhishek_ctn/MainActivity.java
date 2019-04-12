package com.e.abhishek_ctn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number, result;
    Button con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number= findViewById(R.id.number);
        result= findViewById(R.id.result);
        con= findViewById(R.id.con);


        final String[] teen={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
                "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        final String[] ten={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};


        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num;
                num= Integer.parseInt(number.getText().toString());


                if (num<20){
                    result.setText(teen[num]);
                }
                else if ((num/10)<10){
                    int a,b;
                    a= num/10;
                    b= num%10;

                    result.setText(ten[a]+teen[b]);

                }
                else if ((num/10)>10){
                    int a,b,c;
                    String hundreds,tens,ones;
                    a=num/100;
                    num = num%100;
                    b=num/10;
                    c=num%10;

                    hundreds= teen[a]+" Hundred ";
                    tens= ten[b];
                    ones= teen[c];
                    result.setText(hundreds+tens+ones);
                }


            }
        });
    }
}
