package sg.edu.rp.c346.mobilesoftwaredevelopment;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class CourseInformation extends AppCompatActivity {

    TextView textView;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_infomation);

        textView = (TextView) findViewById(R.id.textView);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


        textView2 = (TextView) findViewById(R.id.textView6);
        textView2.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.mnu1){
            Intent i = new Intent(CourseInformation.this, MainActivity.class);
            startActivity(i);
        } else if (item.getItemId() == R.id.mnu2) {
            Intent i = new Intent(CourseInformation.this, CourseStructure.class);
            startActivity(i);
        }
        else if (item.getItemId() == R.id.mnu3) {
            Intent i = new Intent(CourseInformation.this, CourseStructure.class);
            startActivity(i);

        } else {
            Intent i = new Intent(CourseInformation.this, Contactus.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}