package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

	ListView listv;
	ArrayAdapter aa;
	ArrayList<Note> note;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//TODO implement the Custom ListView
		listv = findViewById(R.id.lv);
		note = new ArrayList<Note>();
		aa = new RevisionNotesArrayAdapter(this, R.layout.row, note);
		DBHelper db = new DBHelper(SecondActivity.this);
		ArrayList<Note> data = db.getAllNotes();
		aa = new RevisionNotesArrayAdapter(this,R.layout.row,data);
		listv.setAdapter(aa);
	}


}
