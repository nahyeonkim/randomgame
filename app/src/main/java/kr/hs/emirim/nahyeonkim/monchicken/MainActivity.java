package kr.hs.emirim.nahyeonkim.monchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_showmethechicken);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        String name=mName.getText().toString();
//        if(name==null)
//        {
//            Toast.makeText(this,"이름 입력 안하냐?",Toast.LENGTH_LONG ).show();
//        }else{
//            Toast.makeText(this, name + " 드루와, 드루와",Toast.LENGTH_LONG ).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent); }

        try{
            Toast.makeText(this, name + " 드루와, 드루와",Toast.LENGTH_LONG ).show();
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("age",18);
            startActivity(intent);
        }catch (NullPointerException e){
            Toast.makeText(this,"이름 입력 안하냐?",Toast.LENGTH_LONG ).show();
        }catch (Exception e){
            Toast.makeText(this,"뭐야? 잘 안되네, 다시 해봐.",Toast.LENGTH_LONG ).show();
        }
    }
}
