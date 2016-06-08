package com.example.hnk_1031.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Word apple;
    Word banana;
    Word orange;
    Word strawberry;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (LinearLayout) findViewById(R.id.container);

        Word apple = new Word(R.drawable.apple_icon, "りんご");
        Word banana = new Word(R.drawable.banana_icon, "バナナ");
        Word orange = new Word(R.drawable.orange_icon, "オレンジ");
        Word strawberry = new Word(R.drawable.strawberry_icon, "いちご");

        addWord(apple);
        addWord(banana);
        addWord(orange);
        addWord(strawberry);

    }

    public void addWord(Word word) {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameTextView = new TextView(this);
        nameTextView.setText(word.name);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(word.resId);

        layout.addView(imageView);
        layout.addView(nameTextView);

        container.addView(layout);
    }

}
