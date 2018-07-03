package com.sumadireja.quizmp.Student;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sumadireja.quizmp.DataHelper;
import com.sumadireja.quizmp.R;

public class BuatStudent extends AppCompatActivity {

    protected Cursor cursor;
    DataHelper dbHelper;
    Button bton1, bton2;
    EditText text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_student);

        dbHelper = new DataHelper(this);
        text1 = (EditText) findViewById(R.id.et1);
        text2 = (EditText) findViewById(R.id.et2);
        text3 = (EditText) findViewById(R.id.et3);
        bton1 = (Button) findViewById(R.id.button1);
        bton2 = (Button) findViewById(R.id.button2);

        bton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into student(studentid, nama, majorid) values('" +
                        text1.getText().toString() + "','" +
                        text2.getText().toString() + "','" +
                        text3.getText().toString() + "')");

                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();

                Student.su.RefreshList();
                finish();
            }
        });
        bton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                finish();
            }
        });
    }
}
