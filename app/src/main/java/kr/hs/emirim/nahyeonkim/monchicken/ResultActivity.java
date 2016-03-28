package kr.hs.emirim.nahyeonkim.monchicken;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by 나현 on 2016-03-28.
 */
public class ResultActivity extends AppCompatActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResult=(TextView)findViewById(R.id.result);
        mResult.setText("결과");
    }
}
