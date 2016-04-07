package kr.hs.emirim.nahyeonkim.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by 나현 on 2016-03-28.
 */
public class ResultActivity extends AppCompatActivity {
    static String TAG="뭔치킨:ResultActivity";
    TextView mResult;
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작.");

        mResult=(TextView)findViewById(R.id.result);
        mImageView = (ImageView) findViewById(R.id.imageView);
        Log.d(TAG,"텍스트뷰, 이미지뷰 연결 성공.");

        Random r = new Random();
        int result = r.nextInt(3);
        Log.d(TAG,"랜덤값 생성 :"+result);

        mImageView.setImageResource(R.drawable.icon1+result);

       /* //if
        if(result==0)
        {
            mImageView.setImageResource(R.drawable.icon1);
        }else if(result==1){
            mImageView.setImageResource(R.drawable.icon2);
        }else if(result==2)
        {
            mImageView.setImageResource(R.drawable.icon3);
        }*/
        //switch
        /*switch (result)
        {
            case 0: mImageView.setImageResource(R.drawable.icon1); break;
            case 1: mImageView.setImageResource(R.drawable.icon2); break;
            case 2: mImageView.setImageResource(R.drawable.icon3); break;
        }*/
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG,"인텐트값 읽기<name>. :"+name);

        int age = intent.getIntExtra("age",-1);
        Log.d(TAG,"인텐트값 읽기<age>. :"+age);
        mResult.setText(name + " 드루왔냐?");
    }
}
