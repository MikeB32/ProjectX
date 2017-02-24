package com.example.mike.projectx;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MiniDetails extends AppCompatActivity {
    ImageView img;
    TextView nameTxt,posTxt;
    Button dwn,pkg ;
   // File file = new File(Environment.getExternalStorageDirectory()
        //    + "/Mike/Summer.mp3");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_details);
        dwn = (Button) findViewById(R.id.DwnSingle);
        pkg = (Button) findViewById(R.id.DwnAll);
      /*  if(file.exists()){
            dwn.setEnabled(false);
        }*/
        Intent i = getIntent();

        final String name = i.getExtras().getString("Name");
        //  final String pos=i.getExtras().getString("Position");
        final int image = i.getExtras().getInt("Image");


        img = (ImageView) findViewById(R.id.playerImage);
        nameTxt = (TextView) findViewById(R.id.nameTxt);

        img.setImageResource(image);
        nameTxt.setText("NAME :   " + name);
        //posTxt.setText("POSITION : "+pos);

        dwn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                file_download("http://mp3fb.com/static/Hudnj1H6WljQcJQeKxcdCpWB8lcE4PxZMIZ-wU7wHTc/Metallica%2B-%2BNothing%2BElse%2BMatter.mp3");
                    Toast.makeText(getApplicationContext(),"Downloading",Toast.LENGTH_SHORT).show();


            }
        });
    }
        public void file_download(String url) {
            String  fileName = url.substring(url.lastIndexOf('/') + 1);

            File direct = new File(Environment.getExternalStorageDirectory()
                    + "/Mike");

            if (!direct.exists()) {
                direct.mkdirs();
            }


            DownloadManager mgr = (DownloadManager) this.getSystemService(Context.DOWNLOAD_SERVICE);

            Uri downloadUri = Uri.parse(url);
            DownloadManager.Request request = new DownloadManager.Request(
                    downloadUri);

            request.setAllowedNetworkTypes(
                    DownloadManager.Request.NETWORK_WIFI
                            | DownloadManager.Request.NETWORK_MOBILE)
                    .setAllowedOverRoaming(false).setTitle("Downloading")
                    .setDescription("Please Wait")
                    .setDestinationInExternalPublicDir("/Mike", fileName);

            mgr.enqueue(request);

        }

    }


