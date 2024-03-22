package com.example.project1;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

//    private String[] contents={
//      "数据结构",
//      "离散数学",
//      "微积分","哈哈哈","好困啊","想睡觉"
//    };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);//隐藏标题栏
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main, (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


        //设置字体
        TextView tex=findViewById(R.id.textView2);
        tex.setText("你好");
        tex.setTypeface(Typeface.createFromAsset(getAssets(),"STXINGKA.TTF"));


        //跑马灯获取焦点
        TextView tex1=findViewById(R.id.textView);
        tex1.setSelected(true);
//        tex1.requestFocus();


        //输入框
        EditText ed=findViewById(R.id.ediText1);
//        ed.setText("这是一个输入框");
        String name=ed.getText().toString();
        ed.setSelection(name.length());//光标
        ed.requestFocus();


        ImageView pic=findViewById(R.id.imageView);
//        pic.setBackground();
//        pic.setImageResource(R.drawable.ic_launcher_foreground);
//        Drawable drawable= ContextCompat.getDrawable(this,R.drawable.ic_launcher_background)
//        pic.setImageDrawable(drawable);


        //点击时弹出toast并切换txetView2文字
        Button btnToast=findViewById(R.id.button1);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你点击了我",Toast.LENGTH_SHORT).show();
                String[] contents=getResources().getStringArray(R.array.myStrArray);
                TextView text=findViewById(R.id.textView2);
                Random random=new Random();
                int i= random.nextInt(contents.length);
                text.setText(contents[i]);
            }
        });

}

        //点击时切换文字
//        public void changeText(View view){
//            TextView text=findViewById(R.id.textView2);
//            text.setText("哈哈哈哈");
//        }

}