package com.example.javaa;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button1; //BUTONA BUTON1 DİYE DEĞER ATADIM.
    ImageView resim; //ImageView e RESİM DİYE BİR DEĞER ATADIM.
    EditText metinDzl; //EditText e metinDzl  me DİYE DEĞER ATADIM.

    @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    //KOD ÇALIŞTIĞINDA OLUŞTURULAN İLK METOD.
    setContentView(R.layout.activity_main);


        resim=(ImageView) findViewById(R.id.resim1); /*RESİM OLARAK ATADIĞIM DEĞERİ
 RES DOSYASINDAN İD Sİ resim OLARAK KOLAYCA KODDA BULMAMI SAĞLADI*/
        button1=(Button) findViewById(R.id.button); /*BUTTON1 OLARAK ATADIĞIM DEĞERİ
 RES DOSYASINDAN İD Sİ button OLARAK KOLAYCA KODDA BULMAMI SAĞLADI*/
        metinDzl=findViewById(R.id.input1); /*metinDzl OLARAK ATADIĞIM DEĞERİ
 RES DOSYASINDAN İD Sİ input1 OLARAK KOLAYCA KODDA BULMAMI SAĞLADI*/


button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {//onClick BUTONU TIKLANMAYI SAĞLAR.

        String input = metinDzl.getText().toString(); //STRİNG DEĞERİNDE BİR İNPUT GİR  DEDİM.
        if (input.equals("gandalf")){  //EĞER GİRİLEN DEĞER GANDALF A EŞİTSE
            //Equals() methodu nesnenin içerdiği string'i karşılaştırır (equals=eşit).
            resim.setImageResource(R.drawable.gandalf);/* RESİM DOSYASINDAN GİR DRAWABLE KISMINDAN
            GANDALF RESMİNİ GETİR DEDİM.*/

    }
        else if (input.equals("legolas")){ // İLK İF BLOĞU DOĞRULANMADIYSA ELSE İF BLOĞUNA GİR
            //GİRİLEN STRİNG DEĞERİ LEGOLAS İSE RES DOSYASINDAN DRAWABLE KISMINDAN LEGOLAS RESMİNİ GETİR.
            resim.setImageResource(R.drawable.legolas);

        }
        else if (input.equals("frodo")){  // İLK İF BLOĞU DOĞRULANMADIYSA VE DİĞER ELSE İF BLOĞU DOĞRULANMADIYSA
            // ELSE İF BLOĞUNA GİR GİRİLEN STRİNG DEĞERİ FRODO İSE RES DOSYASINDAN DRAWABLE KISMINDAN FRODO RESMİNİ GETİR.
            resim.setImageResource(R.drawable.frodo);

        }
      else  {/* İLK İF BLOĞU DOĞRULANMADIYSA VE DİĞER ELSE İF BLOKLARI DOĞRULANMADIYSA ELSE  BLOĞUNA
             GİR GİRİLEN STRİNG DEĞERİ YUKARIDAKİ BLOKLARDAN FARKLI İSE
             RES DOSYASINDAN DRAWABLE KISMINDAN HATA RESMİNİ GETİR.*/
            resim.setImageResource(R.drawable.hata);

        }

        }
    });
   }
}


