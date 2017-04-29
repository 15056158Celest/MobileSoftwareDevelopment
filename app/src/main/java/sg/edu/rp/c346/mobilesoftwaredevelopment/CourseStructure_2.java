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
import android.widget.TextView;

import java.util.ArrayList;

public class CourseStructure_2 extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> module;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_structure_2);

        lv = (ListView) this.findViewById(R.id.lvYear);
        tvYear = (TextView) findViewById(R.id.tvModules);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        module = new ArrayList<Module>();
        if(year.equalsIgnoreCase("Year 1, Semester 1")){
            module.add(new Module("G107 Cognitive and Problem Solving", false));
            module.add(new Module("C105 Programming", true));
            module.add(new Module("A113 Mathematics", false));
            module.add(new Module("B102 Organisational Behaviour", false));
            module.add(new Module("C111 New Media", false));

        }else if(year.equalsIgnoreCase("Year 1, Semester 2")) {
            module.add(new Module("C207 Database System", true));
            module.add(new Module("C208 Object-Oriented Programming", true));
            module.add(new Module("C227 Computer System Technologies", false));
            module.add(new Module("C294 Mobile User Interface Design", false));
            module.add(new Module("G107 Effective Communication", false));

        } else if(year.equalsIgnoreCase("Year 2, Semester 1")) {
            module.add(new Module("C202 System Analysis and Design", false));
            module.add(new Module("C203 Web Application Development", true));
            module.add(new Module("C235 IT Security", false));
            module.add(new Module("C346 Android Programming", false));
            module.add(new Module("Any Elective Module", false));

        }else if(year.equalsIgnoreCase("Year 2, Semester 2")) {
            module.add(new Module("C273 Advance Web Application", true));
            module.add(new Module("C308 Web Framework", true));
            module.add(new Module("C348 Iphone Programming", true));
            module.add(new Module("G913 PortFolio Development", true));
            module.add(new Module("Any Elective Module", false));

        }else if(year.equalsIgnoreCase("Year 3, Semester 1")) {
            module.add(new Module("C300 Final Year Project", true));
            module.add(new Module("C302 Web Services", true));
            module.add(new Module("C347 Android Programming 2", true));
            module.add(new Module("C349 Ipad Programming", true));
            module.add(new Module("G913 Portfolio Development", true));

        }else if(year.equalsIgnoreCase("Year 3, Semester 2")) {
            module.add(new Module("Internship", true));


        }


        aa = new ModuleAdapter(this, R.layout.module, module);
        lv.setAdapter(aa);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.mnu1){
            Intent i = new Intent(CourseStructure_2.this, MainActivity.class);
            startActivity(i);
        } else if (item.getItemId() == R.id.mnu2) {
            Intent i = new Intent(CourseStructure_2.this, CourseInformation.class);
            startActivity(i);
        }
        else if (item.getItemId() == R.id.mnu3) {
            Intent i = new Intent(CourseStructure_2.this, CourseStructure.class);
            startActivity(i);

        } else {
            Intent i = new Intent(CourseStructure_2.this, Contactus.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }


}
