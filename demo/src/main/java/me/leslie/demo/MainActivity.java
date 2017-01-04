package me.leslie.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import me.leslie.toast.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private int shortCount;
    private int longCount;
    private Button shortBtn;
    private Button longBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shortBtn = (Button) findViewById(R.id.btn);
        setText(shortBtn, "(短时间)点击显示仅有文字的Toast");
        longBtn = (Button) findViewById(R.id.btn_long);
        setText(longBtn, "(长时间)点击显示仅有文字的Toast");
        shortBtn.setOnClickListener(this);
        longBtn.setOnClickListener(this);

        Toast.init(this);


    }

    void setText(Button btn, String s){
        if (null != btn && null != s){
            btn.setText(s);
        }
    }

    @Override
    public void onClick(View v) {
        if (v == shortBtn) {
            int num = shortCount % 5;
            shortCount++;
            switch (num){
                case 0:
                    show1();
                    break;
                case 1:
                    show2();
                    break;
                case 2:
                    show3();
                    break;
                case 3:
                    show4();
                    break;
                case 4:
                    show5();
                    break;
            }
        }else if (v == longBtn){
            int num = longCount % 5;
            longCount++;
            switch (num){
                case 0:
                    show1Long();
                    break;
                case 1:
                    show2Long();
                    break;
                case 2:
                    show3Long();
                    break;
                case 3:
                    show4Long();
                    break;
                case 4:
                    show5Long();
                    break;
            }
        }
    }

    private void show1(){
        Toast.show("(短时间)只是文字~~~");
        setText(shortBtn, "(短时间)点击显示仅有图片的Toast");
    }

    private void show2(){
        Toast.show(R.drawable.img);
        setText(shortBtn, "(短时间)点击显示上文字，下图片图片的Toast");
    }

    private void show3(){
        Toast.showUpImgDownText(R.drawable.img, "(短时间)上图片，下文字");
        setText(shortBtn, "(短时间)点击显示左图片右文字的Toast");
    }

    private void show4(){
        Toast.show(R.drawable.img, "(短时间)上图片，下文字");
        setText(shortBtn, "(短时间)点击显示图加文下方文字的Toast");
    }

    private void show5(){
        Toast.show(R.drawable.img, "(短时间)图片同排文字", "下面的文字");
        setText(shortBtn, "(短时间)点击显示仅有文字的Toast");
    }


    private void show1Long(){
        Toast.showLong("(长时间)只是文字~~~");
        setText(longBtn, "(长时间)点击显示仅有图片的Toast");
    }

    private void show2Long(){
        Toast.showLong(R.drawable.img);
        setText(longBtn, "(长时间)点击显示上文字，下图片图片的Toast");
    }

    private void show3Long(){
        Toast.showUpImgDownTextLong(R.drawable.img, "(长时间)上图片，下文字");
        setText(longBtn, "(长时间)点击显示左图片右文字的Toast");
    }

    private void show4Long(){
        Toast.showLong(R.drawable.img, "(长时间)上图片，下文字");
        setText(longBtn, "(长时间)点击显示图加文下方文字的Toast");
    }

    private void show5Long(){
        Toast.showLong(R.drawable.img, "(长时间)图片同排文字", "下面的文字");
        setText(longBtn, "(长时间)点击显示仅有文字的Toast");
    }
}
