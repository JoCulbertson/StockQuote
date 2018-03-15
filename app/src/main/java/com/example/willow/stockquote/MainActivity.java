package com.example.willow.stockquote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openConnection("https://api.iextrading.com/1.0/stock/aapl/book");
    }

    public String openConnection(String url2) {
        TextView textView = findViewById(R.id.textView);

        MyAsyncTask asyncTask = new MyAsyncTask(textView);

        asyncTask.execute(url2);

        Log.i("StockQuote.onCreate()", "read line");

        return url2;

    }
}


//Need to figure out what I'm doing with Stock.java
//Need to figure out how to take user input and use it (onKeyListener; edit text)
//Need to figure out reformatting to display stock quote properly
//Need to set up save state