package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Edittext tanımlanır
    EditText hesapEkrani ;

    //Butonlar tanımlanır
    Button sifir , virgul , esittir ;
    Button toplam ,cikarma , carpim , bolme  , sil ;
    Button btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 ,btn8 , btn9 ;


    //4 islemde kullanılacak degerler tanımlanır.

    Float sayi1 , sayi2;
    Boolean carpma=false , bol=false , toplama=false ,cikar=false ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tanımlanan button ve edittext onCreatede idleri ile eşleştirilir

        sifir = (Button) findViewById(R.id.sifir);
        virgul = (Button) findViewById(R.id.virgul);
        esittir = (Button) findViewById(R.id.esittir);
        toplam = (Button) findViewById(R.id.toplam);
        cikarma = (Button) findViewById(R.id.cikarma);
        carpim = (Button) findViewById(R.id.carpim);
        bolme = (Button) findViewById(R.id.bolme);
        sil = (Button) findViewById(R.id.sil);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        hesapEkrani = (EditText) findViewById(R.id.hesapEkrani);


        //İdleri ile eşledikten sonra onClick olayları eklenir

        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               hesapEkrani.setText(hesapEkrani.getText() +" 0"); ;
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 1") ;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 2") ;
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 3") ;
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 4") ;
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 5") ;
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 6") ;
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 7") ;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 8") ;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" 9") ;
            }
        });


        virgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText(hesapEkrani.getText() +" ,") ;
            }
        });

        //Silme ve 4 islem tuslarınada onClick ekleyip işlemle ilgili kodlar yazılır

        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapEkrani.setText("  ");
            }
        });

        carpim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               sayi1 = Float.parseFloat(hesapEkrani.getText()+" ");
               carpma=true;
               hesapEkrani.setText(null);
            }
        });

        bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1 = Float.parseFloat(hesapEkrani.getText()+" ");
                bol=true;
                hesapEkrani.setText(null);
            }
        });


        cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi1 = Float.parseFloat(hesapEkrani.getText()+" ");
                cikar=true;
                hesapEkrani.setText(null);
            }
        });

        toplam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (hesapEkrani==null){
                    hesapEkrani.setText("");
                }

                else{
                    sayi1 = Float.parseFloat(hesapEkrani.getText() +" ") ;
                    toplama=true;
                    hesapEkrani.setText(null);
                }
            }
        });

        //esittir butonu için her tıklanan işlem için if yazılır

        esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi2 =Float.parseFloat(hesapEkrani.getText() + " ");

                if(toplama ==true) {
                    hesapEkrani.setText(sayi1 + sayi2 + " ");
                    toplama=false;
                }

                if(cikar ==true) {
                    hesapEkrani.setText(sayi1 - sayi2 + " ");
                    cikar=false;
                }

                if(carpma ==true) {
                    hesapEkrani.setText(sayi1 * sayi2 + " ");
                    carpma =false;
                }

                if(bol ==true) {
                    hesapEkrani.setText(sayi1 /sayi2 + " ");
                    bol=false;
                }



            }
        });






    }

}