package Burc_Proje;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ornek2 {
    static String OgretmenKulNo = "123456789";
    static String OgretmenSifre = "123456";
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> OgrenciHavuzu =new ArrayList<>();

    public static void main(String[] args) {
        giris();

    }
    public static void giris() {

        System.out.println("Boğazici  Universitesi ogrenci bilgi sistemine hosgeldiniz...");
        System.out.println("Lütfen öğretmen kullanıcı numaranızı giriniz...");
        String ogretmenNo = scanner.nextLine();
        System.out.println("Lutfen sifrenizi giriniz...");
        String Kullanıcısifre = scanner.nextLine();

        if (ogretmenNo.equals(ogretmenNo) && Kullanıcısifre.equals(OgretmenSifre)) {
            menu();
        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }


    }
    public static void menu() {
        System.out.println("Bogazici uni OBS menüsüne hoşgeldiniz...");
        System.out.println("Lutfen yapmak istediginiz islemin numarasını seciniz...");
        System.out.println("1.Ogrenci Ekle \n 2.Ogrenci Listele \n 3.Ogrenci Guncelle \n 4. Ogrenci Sil \n 5.Cıkıs yap");

        int secim = scanner.nextInt();

        if (secim >= 1 && secim <= 5) {
            switch (secim) {

                case 1: {
                    String girilenIsım= scanner.nextLine();
                    ogrenciEkle(girilenIsım);
                    break;
                }
                case 2: {
                    ogrenciListele();
                    break;
                }
                case 3: {
                    String degistirilmekIstenen= scanner.nextLine();
                    ogrenciGuncelle(degistirilmekIstenen);
                    break;
                }
                case 4: {
                    String Guncellenenİsim= scanner.nextLine();
                    ogrenciSil(Guncellenenİsim);
                    break;
                }
                case 5: {
                    System.out.println("Cıkıs yapılıyor...");


            }
        }


    } else {
            System.out.println("Hatalı secim yaptınız, Lutfen tekrar deneyiniz...");
            menu();
        }
    }
public static void ogrenciEkle(String Ogrenciİsmi) {


    while (true) {

        System.out.println("Eklemek istediginiz ogrenci bilgilerini giriniz..., bitirmek icin q ya basınız...");
        Ogrenciİsmi= scanner.nextLine();

        if (Ogrenciİsmi.equalsIgnoreCase("q")) {
            System.out.println("Cıkıs yapılıyor");
            menu();
            break;
        }
        OgrenciHavuzu.add(Ogrenciİsmi) ;
    }
    }
public static void ogrenciListele () {
    System.out.println("---Guncel Ogrenci Listesi---");

    if (OgrenciHavuzu.isEmpty()) {
        System.out.println("Henüz ögrenci listesinde bir isim bulunmamaktadır...");
        
        menu();
    } else {
        int sayac=0; // Ogrencilerin sırayla gitmesi icin
        for (int i = 0; i <OgrenciHavuzu.size() ; i++) {
            sayac++;
            System.out.println(sayac+"."+ "Ogrenci İsmi=" + OgrenciHavuzu.get(i));

        }
        menu();
    }

}
public static void ogrenciGuncelle (String listeno) {
    if (OgrenciHavuzu.isEmpty()) {
        System.out.println("Henüz ögrenci listesinde bir isim bulunmamaktadır...");
        menu();

    } else {
        System.out.println("Degistirmek istediniz ogrenci listesini giriniz...");
        listeno = scanner.nextLine();
        int listeno1 = Integer.parseInt(listeno);
        System.out.println("Degistirmek istediginiz öğrencinin yeni ismini giriniz...");
        String yeniİsim = scanner.nextLine();

        OgrenciHavuzu.set(listeno1 - 1, yeniİsim);
        int sayac = 0;
        for (int i = 0; i < OgrenciHavuzu.size(); i++) {
            sayac++;
            System.out.println(sayac + "." + " Ogrenciİsmi " + OgrenciHavuzu.get(i));
        }
        System.out.println("Guncellemeye devam etmek icin 1 e basın, menüye dönmek icin 2 ye basınız, yanlıs bir tusa basarsanız girise yonlendiriliyorsunuz...");
        String secim= scanner.nextLine();
        if (secim.equals("1")) {
            ogrenciGuncelle(listeno);
        }else if (secim.equals("2")) {
            menu();
        } else {
            giris();
        }
    }
}
public static void ogrenciSil (String SilinecekNo) {
        if (OgrenciHavuzu.isEmpty()) {
            System.out.println("Henuz ogrenci listesine isim girilmemistir...");
            menu();
        }else {
            System.out.println("Silinecek ogrencin listesindeki numarasını giriniz...");
            SilinecekNo= scanner.nextLine();

            int SilinecekNo1=Integer.parseInt(SilinecekNo);

            OgrenciHavuzu.remove(SilinecekNo1-1);
            int sayac=0;
            for (int i = 0; i < OgrenciHavuzu.size(); i++) {
                sayac++;
                System.out.println(sayac+" . " + "Ogrenci İsmi " + OgrenciHavuzu.get(i));
            }
            menu();
        }
    }
}// method baslama kısmı
