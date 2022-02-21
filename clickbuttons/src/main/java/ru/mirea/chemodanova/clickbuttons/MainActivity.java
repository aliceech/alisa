package ru.mirea.chemodanova.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut=(TextView) findViewById(R.id.tvOut);
        buttonOk=(Button) findViewById(R.id.btnOk);
        buttonCancel= (Button) findViewById(R.id.btnCancel);

        View.OnClickListener onClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ок");
            }
        };

        buttonOk.setOnClickListener(onClickListener);

        View.OnClickListener onClickListener1= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };

        buttonCancel.setOnClickListener(onClickListener1);
    }
}