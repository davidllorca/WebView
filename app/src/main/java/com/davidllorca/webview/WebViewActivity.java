package com.davidllorca.webview;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebViewActivity extends Activity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView) findViewById(R.id.webview);

        // Uncomment block to load website

        /*WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);

        // Fit web content in browser
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        // Don't launch web client (Chrome, ...)
        webView.setWebViewClient(new Callback());

        webView.loadUrl("http://www.elmundotoday.com");*/

        // Comment/Uncomment to load html plain text

    }

    public void loadHtml(View view){
        String mineType = "text/html";
        String encoding = "UTF-8";
        String html ="<h1>A simple HTML page</h1><body>" +
                "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum at ex at odio molestie malesuada. Sed hendrerit vel enim sit amet congue. Fusce pulvinar, dolor ut posuere sodales, leo turpis ultrices elit, at interdum orci arcu eu tortor. Nulla iaculis odio ut sodales auctor. Aliquam vulputate nec mauris ut mollis. Praesent imperdiet augue a vehicula posuere. Sed ac porttitor metus. Praesent lobortis diam ut lacus eleifend blandit. Donec in molestie leo, eget ullamcorper turpis. Duis non sapien augue. Quisque id fermentum odio. Suspendisse rutrum odio vel lorem blandit imperdiet. </p>" +
                "</body>";
        webView.loadDataWithBaseURL("",html, mineType, encoding,"");
    }

    public void loadHtmlFromAssets(View view){
        webView.loadUrl("file:///android_asset/index.html");
    }


    private class Callback extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
            //return false;
        }
    }
}
