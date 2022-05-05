package com.example.multiplefilter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    // 각 MBTI Button
    private Button inTjButton, inTpButton, inFjButton, inFpButton, isTjButton, isTpButton, isFjButton, isFpButton,
            enTjButton, enTpButton, enFjButton, enFpButton, esTjButton, esTpButton, esFjButton, esFpButton, allButton;

    private String selectedFilter = "all";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //빈 데이터 리스트 생성성
//        final ArrayList<String> items = new ArrayList<String>();
//        //ArrayAdapter 생성. 아이템 View를 선택(multiple choice)가능하도록 만듬.
//        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, items);
//
//        //listView 생성 및 adapter 생성
//        final ListView listView = (ListView) findViewById(R.id.listView);
//        listView.setAdapter(adapter);

        initWidget();
    }

    private void initWidget()
    {

        inTjButton = (Button) findViewById(R.id.inTj);
        inTpButton = (Button) findViewById(R.id.inTp);
        inFjButton = (Button) findViewById(R.id.inFj);
        inFpButton = (Button) findViewById(R.id.inFp);

        isTjButton = (Button) findViewById(R.id.isTj);
        isTpButton = (Button) findViewById(R.id.isTp);
        isFjButton = (Button) findViewById(R.id.isFj);
        isFpButton = (Button) findViewById(R.id.isFp);

        enTjButton = (Button) findViewById(R.id.enTj);
        enTpButton = (Button) findViewById(R.id.enTp);
        enFjButton = (Button) findViewById(R.id.enFj);
        enFpButton = (Button) findViewById(R.id.enFp);

        esTjButton = (Button) findViewById(R.id.esTj);
        esTpButton = (Button) findViewById(R.id.esTp);
        esFjButton = (Button) findViewById(R.id.esFj);
        esFpButton = (Button) findViewById(R.id.esFp);

        allButton = (Button) findViewById(R.id.allButton);
    }

    // allButton
    public void allFilterTapped(View view) {

    }

    // FilterButton
    public void showFilterTapped(View view) {
    }
}