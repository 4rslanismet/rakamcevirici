import java.util.Scanner ;

  public class rakam_cevir {
    public static void main (String args [] ){
      int sayi,bas1,bas2,bas3  ;
      String bir,on,yuz;
      Scanner Scan = new Scanner (System.in);
      sayi=Scan.nextInt();
//sayi al
      System.out.println("üç basamaklı bir sayı giriniz :");
// sayiyi basamaklarina ayir
      bas3=sayi%10;//birler
      bas2=(sayi/10)%10;//onlar
      bas1=sayi/100;//yüzler
//basamak degerine gore string atamasi yap
    if(bas1==1){yuz="yüz";}
        else if(bas1==2){yuz="iki yüz";}
        else if(bas1==3){yuz="üç yüz";}
        else if(bas1==4){yuz="dört yüz";}
        else if(bas1==5){yuz="beş yüz";}
        else if(bas1==6){yuz="altı yüz";}
        else if(bas1==7){yuz="yedi yüz";}
        else if(bas1==8){yuz="sekiz yüz";}
        else if(bas1==9){yuz="dokuz yüz";}
        else{System.out.pritnln("lütfen üç basamaklı bir sayi giriniz!!")
                return 0 ;}

      if(bas2==1){on="on";}
        else if(bas2==2){on="yirmi";}
        else if(bas2==3){on="otuz";}
        else if(bas2==4){on="kırk";}
        else if(bas2==5){on="elli";}
        else if(bas2==6){on="altmış";}
        else if(bas2==7){on="yetmiş";}
        else if(bas2==8){on="seksen";}
        else if(bas2==9){on="doksan";}

      if(bas3==1){bir="bir";}
        else if(bas3==2){bir="iki";}
        else if(bas3==3){bir="üç";}
        else if(bas3==4){bir="dört";}
        else if(bas3==5){bir="beş";}
        else if(bas3==6){bir="altı";}
        else if(bas3==7){bir="yedi";}
        else if(bas3==8){bir="sekiz";}
        else if(bas3==9){bir="dokuz";}
//sayiyinin metin olarak yazilisini ekrana cikti olarak bas
      System.out.println("girdiğiniz sayı :"+yuz+on+bir);

        }
  }
