package id.ac.astra.polman.nim03202100079.helloworld_0320210079;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Date;
import java.text.SimpleDateFormat;


public class MainActivity extends AppCompatActivity {

    private Button mNimButton;
    private Button mNamaButton;
    private Button mTanggalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNimButton = (Button) findViewById(R.id.nim);
        mNimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.nim_toast,
                        Toast.LENGTH_SHORT).show();

            }
        });
        mNamaButton = (Button) findViewById(R.id.nama);
        mNamaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        R.string.nama_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
        mTanggalButton = (Button) findViewById(R.id.tanggal);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");

        // Get the current date and time
        Date currentDate = new Date();

        // Convert the date to a string using the SimpleDateFormat object
        String dateString = dateFormat.format(currentDate);
        String toast = "Hello the Date is " +dateString;

        mTanggalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}