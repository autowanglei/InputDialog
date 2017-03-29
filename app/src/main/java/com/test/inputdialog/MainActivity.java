package com.test.inputdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Context context = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final InputDialog.Builder builder = new InputDialog.Builder(context,
                        R.style.input_dialog_style);
                builder.setTitle("InputDialog")
                        .setInputHint("Please input")
                        .setButtonText("get input text")
                        .setCanceledOnTouchOutside(false)
                        .setOnDialogButtonClickListener(
                                new InputDialog.OnDialogButtonClickListener() {
                                    @Override
                                    public void onDialogButtonClick(String inputText) {
                                        Toast.makeText(context, "Input text:" + inputText,
                                                Toast.LENGTH_LONG).show();
                                        builder.dismiss();
                                    }
                                }).show();
            }
        });
    }
}
