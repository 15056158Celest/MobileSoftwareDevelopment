package sg.edu.rp.c346.mobilesoftwaredevelopment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CourseStructure extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_structure);

        lv = (ListView) this.findViewById(R.id.lvYear);

        al = new ArrayList<String>();
        al.add("Year 1, Semester 1");
        al.add("Year 1, Semester 2");
        al.add("Year 2, Semester 1");
        al.add("Year 2, Semester 2");
        al.add("Year 3, Semester 1");
        al.add("Year 3, Semester 2");


        aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, al);

        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                String selectedYear = al.get(position);

                Intent newActivity = new Intent(CourseStructure.this, CourseStructure_2.class);
                newActivity.putExtra("year", selectedYear);
                startActivity(newActivity);

            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.mnu1){
            Intent i = new Intent(CourseStructure.this, MainActivity.class);
            startActivity(i);
        } else if (item.getItemId() == R.id.mnu2) {
            Intent i = new Intent(CourseStructure.this, CourseInformation.class);
            startActivity(i);
        }
        else if (item.getItemId() == R.id.mnu3) {
            Intent i = new Intent(CourseStructure.this, CourseStructure.class);
            startActivity(i);

        } else {
            Intent i = new Intent(CourseStructure.this, Contactus.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}

