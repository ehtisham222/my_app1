package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class imageCapt extends AppCompatActivity {
    private Button btnCamera;
    private ImageView ivCamera;
    private int req_code=14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_capt);
        btnCamera =findViewById(R.id.button6);
        ivCamera=findViewById(R.id.imageView);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkselfPermission()){
                    requestPermission();
                }
                else {
                    Intent explicite = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(explicite, req_code);
                }
            }
        });
    }
    public boolean checkselfPermission(){
        if(ContextCompat.checkSelfPermission(imageCapt.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            return true;
        }
        else {
            return false;
        }
    }
    private void requestPermission(){
        ActivityCompat.requestPermissions(imageCapt.this,new String[]{Manifest.permission.CAMERA},req_code);
    }
    protected void onActivityResult(int requestcode,int resultcode, Intent data){
        super.onActivityResult(req_code,resultcode,data);
        if(requestcode==req_code){
            if(resultcode==RESULT_OK){
                Bundle bundle=data.getExtras();
                Bitmap bitmap=(Bitmap)bundle.get("data");
                ivCamera.setImageBitmap(bitmap);
            }
        }
    }
}