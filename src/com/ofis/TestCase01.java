package com.ofis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class TestCase01 {

    /* 1. driver create
    2java class a crome driver tanit
    3driver tum ekran
    4.driver a sayfa yuklemesini 10.000(10 saniye) beklesin, eger oncesinde sayfa yuklenirse beklemeyi biraksin
    5.sahibinden.com adresine gidek
    6.bu web adresinin sayfa basligini(title) ve ve adres(url) sini alalim
    7.title ve url "kiralik" kelimesi iceriyor mu
    8."gittigidiyor.com" a gidelim
    9.basligini alalim ve "alisveris " kelimesi iceriyor mu?
    10. Bir onceki web sayfamiza geri donelim
    11. sayfayi yenileyelim$
    12.web sayfamiza donelim, oldugumuz sayfayi kapatalim
    13.en son adim olarak tum sayfalarimizi kapatalim

     */
    public static void main(String[] args) {
   //1
        System.setProperty("webdriver.chrome.driver", "chromedriver 2");
        WebDriver driver= new ChromeDriver();
        //2

      //3
        driver.manage().window().maximize();
        //4
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //5
        driver.get("https://www.sahibinden.com");
        //6
        String sahibindenBaslik=driver.getTitle();
        String sahibindenUrl=driver.getCurrentUrl();
        //7
      /*  boolean isTrue= driver.getTitle().contains("Kiralik");
        if(isTrue){
            System.out.println("Iceriyor");
        }else{
            System.out.println("Icermiyor");
        }
        */

        if(sahibindenBaslik.contains("Kiralik")|| sahibindenUrl.contains("Kiralik")){
            System.out.println("Kiralik kelimesi iceriyor");
        }else{
            System.out.println("Kiralik kelimesi icermiyor");
        }
        //8
        driver.navigate().to("https://gittigidiyor");

    }
}
