package vaibhav.com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int sa,sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add3a(View view)
    {
        sa = sa+3;
        dispa(sa);
    }

    public void add2a(View view)
    {
        sa = sa+2;
        dispa(sa);
    }

    public void add1a(View view)
    {
        sa = sa+1;
        dispa(sa);
    }
    public void add3b(View view)
    {
        sb = sb+3;
        dispb(sb);
    }
    public void add2b(View view)
    {
        sb = sb+2;
        dispb(sb);
    }
    public void add1b(View view)
    {
        sb = sb+1;
        dispb(sb);
    }
    private void dispa(int s) {
        TextView tv = (TextView) findViewById(R.id.scorea);
        tv.setText("" + s);
    }
    private void dispb(int s)
    {
        TextView tv = (TextView) findViewById(R.id.scoreb);
        tv.setText(""+s);
    }
    public void resetf(View view)
    {
        TextView tv1 = (TextView) findViewById(R.id.scorea);
        TextView tv2 = (TextView) findViewById(R.id.scoreb);
        sa=0;
        sb=0;
        tv1.setText(" "+0);
        tv2.setText(" "+0);
    }
}