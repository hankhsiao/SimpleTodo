package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends ActionBarActivity {
    EditText etItemText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etItemText = (EditText)findViewById(R.id.etItemText);
        etItemText.setText(getIntent().getStringExtra("text"));
    }

    public void onSave(View v) {
        Intent data = new Intent();
        data.putExtra("text", etItemText.getText().toString());
        data.putExtra("position", getIntent().getIntExtra("position", 0));
        setResult(RESULT_OK, data);
        finish();
    }
}
