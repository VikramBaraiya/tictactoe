package yadu.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Boolean Clicked=false;
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
    }
    public void setValue(View V){
        if(!Clicked)
        {
            String b1text=b1.getText().toString();
            if(b1text=="X")
            {
                b1.setText("O");
                Clicked=false;
                b1.setEnabled(false);

            }
            else
            {
                b1.setText("X");
                b1.setEnabled(false);
                Clicked=false;
            }
        }


    }
}
