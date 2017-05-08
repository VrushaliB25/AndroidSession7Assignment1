package example.com.invokegooglesearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.SearchManager;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText searchtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchtext = (EditText) findViewById(R.id.searchtext);
    }
    public void onSearchClick(View v)
    {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);   //declaring the intent & use of ACTION_WEB_SEARCH for invoking search
            String term = searchtext.getText().toString();
            intent.putExtra(SearchManager.QUERY, term);           //"term" contains the user input text which is to be searched
            startActivity(intent);
    }

}
