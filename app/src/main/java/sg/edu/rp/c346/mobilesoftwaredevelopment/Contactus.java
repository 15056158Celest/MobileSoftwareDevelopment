package sg.edu.rp.c346.mobilesoftwaredevelopment;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import static sg.edu.rp.c346.mobilesoftwaredevelopment.R.id.textView;

public class Contactus extends AppCompatActivity {

    TextView textView;
    TextView Text1, Text2, Text3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        textView = (TextView) findViewById(R.id.textViewContact);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        Text1 = (TextView) findViewById(R.id.textView9);

        Text1.setText(
                Html.fromHtml(
                        "<a href=\"https://www.facebook.com/groups/292126534186988\">Facebook Page</a> "));
        Text1.setMovementMethod(LinkMovementMethod.getInstance());

        Text2 = (TextView) findViewById(R.id.textView11);

        Text2.setText(
                Html.fromHtml(
                        "<a href=\"http://www.rp.edu.sg/Diploma_in_Mobile_Software_Development_(R47).aspx\">Website Page</a> "));
        Text2.setMovementMethod(LinkMovementMethod.getInstance());

        Text3 = (TextView) findViewById(R.id.textView13);

        Text3.setText(
                Html.fromHtml(
                        "<a href=\"http:/thelp-SOI@rp.edu.sg \">Email Us</a> "));
        Text3.setMovementMethod(LinkMovementMethod.getInstance());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.mnu1){
            Intent i = new Intent(Contactus.this, MainActivity.class);
            startActivity(i);
        } else if (item.getItemId() == R.id.mnu2) {
            Intent i = new Intent(Contactus.this, CourseInformation.class);
            startActivity(i);
        }
        else if (item.getItemId() == R.id.mnu3) {
            Intent i = new Intent(Contactus.this, CourseStructure.class);
            startActivity(i);

        } else {
            Intent i = new Intent(Contactus.this, Contactus.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
