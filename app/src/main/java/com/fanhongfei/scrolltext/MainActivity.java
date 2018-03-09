package com.fanhongfei.scrolltext;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    String text1 = "桑之未落，其叶沃若。于嗟鸠兮，无食桑葚；\n" +
            "于嗟女兮，无与士耽。士之耽兮，犹可说也；\n" +
            "女之耽兮，不可说也。";

    String text2 = "桑之落矣，其黄而陨。自我徂尔，三岁食贫。\n" +
            "淇水汤汤，渐车帷裳。女也不爽，士贰其行。\n" +
            "士也罔极，二三其德。";

    String text3 = "三岁为妇，靡室劳矣；夙兴夜寐，靡有朝矣。\n" +
            "言既遂矣，至于暴矣。兄弟不知，咥其笑矣。\n" +
            "静言思之，躬自悼矣。";

    String text4 = "及尔偕老，老使我怨。淇则有岸，隰则有泮。\n" +
            "总角之宴，言笑晏晏。信誓旦旦，不思其反。\n" +
            "反是不思，亦已焉哉！";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollTextView textView1 = findViewById(R.id.scrollTextView1);
        textView1.setText(text1);
        textView1.setSpeed(-5);

        ScrollTextView textView2 = findViewById(R.id.scrollTextView2);
        textView2.setText(text2);
        textView2.setSpeed(10);

        ScrollTextView textView3 = findViewById(R.id.scrollTextView3);
        textView3.setText(text3);
        textView3.setSpeed(-15);

        ScrollTextView textView4 = findViewById(R.id.scrollTextView4);
        textView4.setText(text4);
        textView4.setSpeed(20);
    }
}
