package swati.agarwal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ch1;
    CheckBox ch2;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    TextView txt4;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = findViewById(R.id.chkbox1);
        ch2 = findViewById(R.id.chkbox2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        txt4 = findViewById(R.id.txt4);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                value = value + 1;
                txt4.setText("" + value);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value<=0)
                {
                    value = 0;
                    txt4.setText(value + "");
                }
                else
                {
                    value = value - 1;
                    txt4.setText("" + value);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Integer s = Integer.valueOf(txt4.getText().toString());
                Integer n;

                if ((s==0)&&((ch1.isChecked())||(ch2.isChecked())))
                {
                    Toast.makeText(MainActivity.this, "Please place Order first", Toast.LENGTH_SHORT).show();
                }
                else if ((ch1.isChecked())&&(ch2.isChecked()))
                {
                    n = (s * 10) + (s * 5) + (s * 5);
                    Toast.makeText(MainActivity.this, "Your payment is Rs. "+n, Toast.LENGTH_SHORT).show();
                }
                else if (ch1.isChecked())
                {
                    n = (s * 10) + (s * 5);
                    Toast.makeText(MainActivity.this, "Your payment is Rs. "+n, Toast.LENGTH_SHORT).show();

                }
                else if (ch2.isChecked())
                {
                    n = (s * 10) + (s * 5);
                    Toast.makeText(MainActivity.this, "Your payment is Rs. "+n, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    n = (s * 10);
                    Toast.makeText(MainActivity.this, "Your payment is Rs. "+n, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                txt4.setText("0");
                value = 0;
                if (ch1.isChecked())
                {
                    ch1.setChecked(false);
                }
                if (ch2.isChecked())
                {
                    ch2.setChecked(false);
                }
            }
        });
    }

    }

