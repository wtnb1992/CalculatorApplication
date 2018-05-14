package com.example.repens.calculatorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Double.NaN;

public class MainActivity extends AppCompatActivity {


    String a="0";     //入力数字
    double b = 0;    //一時保存
    String c="null";         //四則演算保持
    double d = 0;    //一時保存2
    int e=0;
    double f=0;      //パーセント用
    int g=0;         //パーセントフラグ
    int h=0;         //パーセントフラグ2
    double i=0;
    int j=0;
    int k=0;         //画像表示用フラグ

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.button0:
                if (e==1){
                    allClear();
                }
                if (a.equals("0")) {
                    a="0";
                }else{
                a =a + "0";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button1:
                if (e==1){
                    allClear();
                }
                if (a.equals("0")){
                    a = "1";
                }else{
                    a =a + "1";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button2:
                if (e==1){
                    allClear();
                }

                if (a.equals("0")){
                    a = "2";
                }else{
                    a =a + "2";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button3:
                if (e==1){
                    allClear();
                }

                if (a.equals("0")){
                    e=0;
                    d=0;
                    a = "3";
                }else{
                    a =a + "3";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button4:
                if (e==1){
                    allClear();
                }

                if (a.equals("0")){
                    a = "4";
                    e=0;
                }else{
                    a =a + "4";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button5:
                if (e==1){
                    allClear();
                }

                if (a.equals("0")){
                    a = "5";
                    e=0;
                }else{
                    a =a + "5";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button6:
                if (e==1){
                    allClear();
                }

                if (a.equals("0")){
                    a = "6";
                    e=0;
                }else{
                    a =a + "6";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button7:
                if (e==1){
                    allClear();
                }

                if (a.equals("0")){
                    a = "7";
                    e=0;
                }else{
                    a =a + "7";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button8:
                if (e==1){
                    allClear();
                }

                if (a.equals("0")){
                    a = "8";
                    e=0;
                }else{
                    a =a + "8";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.button9:
                if (e==1){
                    allClear();
                }

                if (a.equals("0")){
                    a = "9";
                    e=0;
                }else{
                    a =a + "9";
                }
                displayNumber();
                chooseImage();
                break;

            case R.id.buttonAC:
                allClear();
                displayNumber();
                chooseImage();
                break;

            case R.id.buttonC:
                a="0";
                h=0;
                displayNumber();
                chooseImage();
                break;

            case R.id.buttonplus:
                if (b==0) {
                    b =Double.valueOf(a);
                    c = "+";
                    a = "0";
                }else if(a.equals("0")) {
                    c = "+";
                    e=0;
                }else{
                    eqNumber();
                    c = "+";
                    a = "0";
                }
                break;

            case R.id.buttonminus:
                if (b==0) {
                    b =Double.valueOf(a);
                    c = "-";
                    a = "0";
                }else if(a.equals("0")) {
                    c = "-";
                    e=0;
                }else{
                    eqNumber();
                    c = "-";
                    a = "0";
                }
                break;

            //掛け算
            case R.id.buttonmultiplied:
                if (b==0) {
                    b =Double.valueOf(a);
                    c = "*";
                    a = "0";
                }else if(a.equals("0")) {
                    c = "*";
                    e=0;
                }else{
                    eqNumber();
                    c = "*";
                    a = "0";
                }
                break;

            //割り算
            case R.id.buttondivided:
                if (b==0) {
                    b =Double.valueOf(a);
                    c = "/";
                    a = "0";
                }else if(a.equals("0")) {
                    c = "/";
                    e=0;
                }else{
                    eqNumber();
                    c = "/";
                    a = "0";
                }
                break;

            case R.id.buttonequal:
                if(c==null){

                }else {
                    eqNumber();
                    e=1;
                    a = "0";
//                    b = 0;
//                    c = null;
                }
                h=0;

                break;

            //反転
            case R.id.buttonplusminus:
                b = Integer.valueOf(a);

                if (b==0) {

                }else if(b>0) {
                    a="-"+ a;
                }else if(b<0){
                a=String.valueOf(-b);
                }
                displayNumber();
                chooseImage();
                break;

            //小数点
            case R.id.button_:
                if(a.indexOf(".") !=-1){

                }else{
                    a =a + ".";
                    displayNumber();
                }
                break;

            case R.id.buttonpercent:
                if(e==0){
                    if(!(c.equals(null))){
                        if(h==0){
                    f=Integer.valueOf(a);
                    f= f / 100 * b;
                    a=String.valueOf(f);
                    h=1;
                        }
                    }
                }else if (g==0){
                    f=Integer.valueOf(a);
                    f= f / 100;
                    a=String.valueOf(f);
                    g=1;
                }else if(g==1){
                    f=Integer.valueOf(a);
                    f= f / 100;
                    a=String.valueOf(f);
                    g=0;
                }
                if(f == (int) f) {
                    a= String.format("%d", (int) f);
                }else{
                    a= String.format("%s",f);
                }

                displayNumber();
                break;
        }
    }

    public void displayNumber(){


        TextView textview =(TextView)findViewById(R.id.textView);
        textview.setText(a);
    }

    public void eqNumber() {
        if (c.equals("+")) {
            if(d==0){
                d = Double.valueOf(a);
                b = b + d;
                a = String.valueOf(b);

            }else{
//            d = Double.valueOf(a);
            b = b + d;
            a = String.valueOf(b);
//            d=b;
            }
        }else if(c.equals("-")){
            if(d==0){
                d = Double.valueOf(a);
                b = b - d;
                a = String.valueOf(b);

            }else{
//            d = Double.valueOf(a);
                b = b - d;
                a = String.valueOf(b);
//            d=b;
            }
        }else if(c.equals("*")){
            if(d==0){
                d = Double.valueOf(a);
                b = b * d;
                a = String.valueOf(b);

            }else{
//            d = Double.valueOf(a);
                b = b * d;
                a = String.valueOf(b);
//            d=b;
            }
        }else if(c.equals("/")){
            if(d==0){
                d = Double.valueOf(a);
                if(b==0&&d==0){
                    a="0";
                }else{
                b = b / d;
                }
                a = String.valueOf(b);

                if(Double.isNaN(d)){
                    a="0";
                }

            }else{
//            d = Double.valueOf(a);
                b = b / d;
                a = String.valueOf(b);
//            d=b;
            }
        }

        //整数なら小数点以下非表示
        if(b == (int) b) {
            a= String.format("%d", (int) b);
        }else{
            a= String.format("%s",b);
        }

        displayNumber();

    }
    public void allClear(){
        a="0";
        b=0;
        c="null";
        d=0;
        e=0;
        f=0;
        g=0;
        h=0;
        k=0;
    }

    public void chooseImage(){

        if (c.equals("+")) {
            i=Integer.valueOf(a)+b;
            createImage();
        }else if(c.equals("-")){
            i=b - Integer.valueOf(a);
            createImage();
        }else if(c.equals("*")){
            i=0;
            createImage();
        }else if(c.equals("/")){
            i=0;
            createImage();
        }else{
//            i=Integer.valueOf(a);
            //整数なら小数点以下非表示
            if(b == (int) b) {
                i=Integer.valueOf(a);
                j=(int)i;
            }else{
                a= String.format("%s",b);
            }

            createImage();
        }


    }

    public void createImage(){

        j=(int)i;
        if( k==1){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image0);

    }else if (j==0) {
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image0);

        }else if(j==1){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image1);


        }else if(j==2){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image2);

        }else if(j==3){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image3);

        }else if(j==4){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image4);

        }else if(j==5){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image5);

        }else if(j==6){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image6);

        }else if(j==7){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image7);

        }else if(j==8){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image8);

        }else if(j==9){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image9);

        }else if(j==10){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image10);

        }else if(j>10){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.imagemore);

        }else if(j<0 || k==1){
            ImageView imageView =(ImageView)findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.image0);

        }


    }


}
