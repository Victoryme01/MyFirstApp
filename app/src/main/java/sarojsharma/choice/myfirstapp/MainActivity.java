package sarojsharma.choice.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import static java.sql.DriverManager.println;

public class MainActivity extends AppCompatActivity {
WebView web;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = findViewById(R.id.myweb);
        web.loadUrl("https://sharesansar.com/");
        println("testing new things");

    }
}
