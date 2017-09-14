package fortech.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,begal,bclear;
    TextView ans;
    Integer  var1,var2;
    boolean plus,minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.button20);
        b1 = (Button) findViewById(R.id.button23);
        b2 = (Button) findViewById(R.id.button24);
        b3 = (Button) findViewById(R.id.button25);
        b4 = (Button) findViewById(R.id.button26);
        b5 = (Button) findViewById(R.id.button27);
        b6 = (Button) findViewById(R.id.button28);
        b7 = (Button) findViewById(R.id.button29);
        b8 = (Button) findViewById(R.id.button30);
        b9 = (Button) findViewById(R.id.button31);

        bplus = (Button) findViewById(R.id.button22);
        bminus = (Button) findViewById(R.id.button21);
        begal = (Button) findViewById(R.id.button33) ;
        bclear = (Button) findViewById(R.id.button32);

        ans = (TextView) findViewById(R.id.textView);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Integer.parseInt(ans.getText()+"");
                plus=true;
                ans.setText(null);

            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Integer.parseInt(ans.getText()+"");
                minus=true;
                ans.setText(null);
            }
        });
        begal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 =  Integer.parseInt(ans.getText()+"");
                if(plus==true)
                {
                    ans.setText(var1+var2+"");
                    plus=false;
                }
                if(minus==true)
                {
                    ans.setText(var1-var2+"");
                    minus=false;
                }
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ans.setText(null);
            }
        });
    }
}
