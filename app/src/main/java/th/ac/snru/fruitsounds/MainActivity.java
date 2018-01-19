package th.ac.snru.fruitsounds;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    // อาร์เรย์ที่เก็บ reference ของ ImageView (รูปภาพผลไม้) ทั้งเก้า
    private final ImageView imgFruits[] = new ImageView[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ค้นหา ImageView ต่างๆจาก Layout File แล้วเก็บการอ้างอิงลงในอาร์เรย์
        imgFruits[0] = (ImageView) findViewById(R.id.apple);
        imgFruits[1] = (ImageView) findViewById(R.id.avocado);
        imgFruits[2] = (ImageView) findViewById(R.id.corn);
        imgFruits[3] = (ImageView) findViewById(R.id.grape);
        imgFruits[4] = (ImageView) findViewById(R.id.lemon);
        imgFruits[5] = (ImageView) findViewById(R.id.mangosteen);
        imgFruits[6] = (ImageView) findViewById(R.id.orange);
        imgFruits[7] = (ImageView) findViewById(R.id.pumpkin);
        imgFruits[8] = (ImageView) findViewById(R.id.strawberry);

        // กำหนดให้การคลิก ImageView ทุกอันเรียกมาที่ onClick ในออบเจ็คปัจจุบัน
        for (int i = 0; i < imgFruits.length; i++) {
            imgFruits[i].setOnClickListener(this);
        }
    } // End oncreate

    @Override
    public void onClick(View v) {
        int strId = 0;

        switch (v.getId()) {
            case R.id.apple:
                strId = R.string.apple;
                break;
            case R.id.avocado:
                strId = R.string.avocado;
                break;
            case R.id.corn:
                strId = R.string.corn;
                break;
            case R.id.grape:
                strId = R.string.grape;
                break;
            case R.id.lemon:
                strId = R.string.lemon;
                break;

            case R.id.mangosteen:
                 strId = R.string.mangosteen;
                break;
            case R.id.orange:
                strId = R.string.orange;
                break;
            case R.id.pumpkin:
                strId = R.string.pumpkin;
                break;
            case R.id.strawberry:
                strId = R.string.strawberry;
                break;
        }// End switch
// show toast
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, strId, duration);
        // set toast position - show in the middle of the screen
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    } // End onClick
} // End MainActivity
