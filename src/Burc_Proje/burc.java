package Burc_Proje;

import java.util.Scanner;

public class burc {
    /*
     Oğlak Burcu : 22 Aralık - 21 Ocak
     Kova Burcu : 22 Ocak - 19 Şubat
     Balık Burcu : 20 Şubat - 20 Mart
     Koç Burcu : 21 Mart - 20 Nisan
     Boğa Burcu : 21 Nisan - 21 Mayıs
     İkizler Burcu : 22 Mayıs - 22 Haziran
     Yengeç Burcu : 23 Haziran - 22 Temmuz
     Aslan Burcu : 23 Temmuz - 22 Ağustos
     Başak Burcu : 23 Ağustos - 22 Eylül
     Terazi Burcu : 23 Eylül - 22 Ekim
     Akrep Burcu : 23 Ekim - 21 Kasım
     Yay Burcu : 22 Kasım - 21 Aralık

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Ne çıkarsa bahtına, Burç yorumlarına hosgeldiniz----------- ");
        System.out.println("Ayların sayı olarak gösterimi");
        System.out.println("Lutfen dogdunuz ayı seciniz...");
        System.out.println("1.) Ocak ayı \n 2.) Şubat Ayı \n 3.) Mart Ayı \n 4.) Nisan \n " +
                "5.) Mayıs \n 6.) Haziran \n 7.) Temmuz \n 8.) Ağustos \n 9.) Eylül Ayı \n 10.) Ekim \n 11.) Kasım Ayı \n 12.) Aralık");
        int ay = scanner.nextInt();

        System.out.println("Lutfen dogum tarihinizin gününü giriniz...");
        int gun = scanner.nextInt();

        if (ay > 0 && ay < 13) {

            switch (ay) {

                case 1:
                    System.out.println("Sectiginiz ay Ocaktır...");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 20) {
                            System.out.println("Burcunuz oğlaktır...");
                            System.out.println("Pozitif kaliteleri: Zorluklara dayanan, güvenilir, sabırlı, kararlı, düzenli"+
                            "Olumsuz ve zayıf yanları: İnatçılık, kötümser, cimri, materyalist, mevki düşkünü");
                        } else {
                            System.out.println("Burcunuz Kovadır...");
                            System.out.println("Pozitif kaliteleri: Hümanist, ileri görüşlü, yenilikçi, objektif, akılcı ve bilimsel, sosyalleşmelte yetenekli.\n" +
                                    "Olumsuz ve zayıf yanları: Geleneklere karşı gelen, farklı olmaya çalışan, huzursuz ve asi.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;

                case 2:
                    System.out.println("Sectiginiz ay Şubattır");
                    if (gun >= 1 && gun <= 29) {

                        if (gun <= 19) {
                            System.out.println("Burcunuz kovadır...");
                            System.out.println("Pozitif kaliteleri: Hümanist, ileri görüşlü, yenilikçi, objektif, akılcı ve bilimsel, sosyalleşmelte yetenekli.\n" +
                                    "Olumsuz ve zayıf yanları: Geleneklere karşı gelen, farklı olmaya çalışan, huzursuz ve asi.");
                        } else {
                            System.out.println("Burcunuz balıktır...");
                            System.out.println("Pozitif kaliteleri: Duyarlı, merhametli, hayal gücü kuvvetli, sanatsal ilham ve yaratıcılık sahibi,iyi kalpli, güçlü inanç sahibi.\n" +
                                    "Olumsuz ve zayıf yanları: İradesiz, kararsız, özgüveni düşük. Aşırı hayalperest, gerçeklerden kaçan ve kendine acıyan.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;

                case 3:
                    System.out.println("Sectiginiz ay Marttır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 20) {
                            System.out.println("Burcunuz Balıktır...");
                            System.out.println("Pozitif kaliteleri: Duyarlı, merhametli, hayal gücü kuvvetli, sanatsal ilham ve yaratıcılık sahibi,iyi kalpli, güçlü inanç sahibi.\n" +
                                    "Olumsuz ve zayıf yanları: İradesiz, kararsız, özgüveni düşük. Aşırı hayalperest, gerçeklerden kaçan ve kendine acıyan.");
                        } else {
                            System.out.println("Burcunuz Koctur...");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;

                case 4:
                    System.out.println("Sectiginiz ay Nisandır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 20) {
                            System.out.println("Burcunuz Koctur...");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        } else {
                            System.out.println("Burcunuz Bogadır...");
                            System.out.println("Pozitif kaliteleri: Arkadaş canlısı, dayanma gücü yüksek, iradeli, estetik zevkleri gelişmiş, sezgileri güçlü, sabırlı.\n" +
                                    "Olumsuz ve zayıf yanları: İnatçı, zevk düşkünü, tembel, açgözlülük, esneklikten yoksunluk, aşırı sahiplenicilik.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;


                case 5:
                    System.out.println("Sectiginiz ay Mayıs ayıdır.");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 20) {
                            System.out.println("Burcunuz Bogadır...");
                            System.out.println("Pozitif kaliteleri: Arkadaş canlısı, dayanma gücü yüksek, iradeli, estetik zevkleri gelişmiş, sezgileri güçlü, sabırlı.\n" +
                                    "Olumsuz ve zayıf yanları: İnatçı, zevk düşkünü, tembel, açgözlülük, esneklikten yoksunluk, aşırı sahiplenicilik.");
                        } else {
                            System.out.println("Burcunuz İkizler...");
                            System.out.println("Pozitif kaliteleri: Entellektüel, mantıklı, çabuk kavrayan, yazı yazmaya ve iletişime yetenekli, konuşkan , eğlenceli, bilgi dolu.\n" +
                                    "Olumsuz ve zayıf yanları: Değişken, kararsız, ikiyüzlü, yüzeysel, maymun iştahlı, duygusal olarak yetersiz, dedikodu, eleştirici.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;

                case 6:
                    System.out.println("Sectiginiz ay Hazirandır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 21) {
                            System.out.println("Burcunuz İkizlerdir...");
                            System.out.println("Pozitif kaliteleri: Entellektüel, mantıklı, çabuk kavrayan, yazı yazmaya ve iletişime yetenekli, konuşkan , eğlenceli, bilgi dolu.\n" +
                                    "Olumsuz ve zayıf yanları: Değişken, kararsız, ikiyüzlü, yüzeysel, maymun iştahlı, duygusal olarak yetersiz, dedikodu, eleştirici.");
                        } else {
                            System.out.println("Burcunuz Yengeçtir...");
                            System.out.println("Pozitif kaliteleri: Empatik, gelişmiş annelik duygusu, koruyucu, fedakar ve başkalarının ihtiyaçlarına duyarlı, güçlü sezgi yeteneği\n" +
                                    "Olumsuz ve zayıf yanları: Aşırı duygusallık, alıngan, değişken ve endişelenen, huzursuz.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;

                case 7:
                    System.out.println("Sectiginiz ay Temmuzdur.");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 22) {
                            System.out.println("Burcunuz Yengectir...");
                            System.out.println("Pozitif kaliteleri: Empatik, gelişmiş annelik duygusu, koruyucu, fedakar ve başkalarının ihtiyaçlarına duyarlı, güçlü sezgi yeteneği\n" +
                                    "Olumsuz ve zayıf yanları: Aşırı duygusallık, alıngan, değişken ve endişelenen, huzursuz.");
                        } else {
                            System.out.println("Burcunuz Aslandır...");
                            System.out.println("Pozitif kaliteleri: Yüce gönüllü, geniş düşünceli, cömert, kendine güvenen, ilham veren, artistik.\n" +
                                    "Olumsuz ve zayıf yanları: Egoist, hoşgörüsüz, kibirli,");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;
                case 8:
                    System.out.println("Sectiginiz ay Ağustostur.");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 23) {
                            System.out.println("Burcunuz Aslandır...");
                            System.out.println("Pozitif kaliteleri: Yüce gönüllü, geniş düşünceli, cömert, kendine güvenen, ilham veren, artistik.\n" +
                                    "Olumsuz ve zayıf yanları: Egoist, hoşgörüsüz, kibirli,");
                        } else {
                            System.out.println("Burcunuz Başaktır...");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;
                case 9:
                    System.out.println("Sectiginiz ay Eylüldür.");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 23) {
                            System.out.println("Burcunuz Başaktır...");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        } else {
                            System.out.println("Burcunuz Terazidir...");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: Acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;
                case 10:
                    System.out.println("Sectiginiz ay Ekimdir");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 23) {
                            System.out.println("Burcunuz Terazidir...");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: Acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        } else {
                            System.out.println("Burcunuz Akreptir...");
                            System.out.println("Pozitif kaliteleri: Kendini dönüştürebileme gücü, derin kavrayış, sezgi gücü, dayanıklı ve kararlı, başkalarını etkileme gücü.\n" +
                                    "Olumsuz ve zayıf yanları: Kıskançlık, sahiplenicilik, kincilik, kuşkuculuk, güce düşkünlük.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;
                case 11:
                    System.out.println("Sectiginiz ay Kasımdır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 22) {
                            System.out.println("Burcunuz Akreptir...");
                            System.out.println("Pozitif kaliteleri: Kendini dönüştürebileme gücü, derin kavrayış, sezgi gücü, dayanıklı ve kararlı, başkalarını etkileme gücü.\n" +
                                    "Olumsuz ve zayıf yanları: Kıskançlık, sahiplenicilik, kincilik, kuşkuculuk, güce düşkünlük.");
                        } else {
                            System.out.println("Burcunuz Yaydır...");
                            System.out.println("Pozitif kaliteleri: Yeniliğe açık, hoşgörülü, cömert, felsefi, iyimser, inançlı, özgürlüğe düşkün ve coşkulu.\n" +
                                    "Olumsuz ve zayıf yanları: Dogmatik, fanatik, patavatsız ve abartıya açık.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;
                case 12:
                    System.out.println("Sectiginiz ay Aralıktır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 21) {
                            System.out.println("Burcunuz Yaydır...");
                            System.out.println("Pozitif kaliteleri: Yeniliğe açık, hoşgörülü, cömert, felsefi, iyimser, inançlı, özgürlüğe düşkün ve coşkulu.\n" +
                                    "Olumsuz ve zayıf yanları: Dogmatik, fanatik, patavatsız ve abartıya açık.");
                        } else {
                            System.out.println("Burcunuz Oğlaktır...");
                            System.out.println("Pozitif kaliteleri: Zorluklara dayanan, güvenilir, sabırlı, kararlı, düzenli\n" +
                                    "Olumsuz ve zayıf yanları: İnatçılık, kötümser, cimri, materyalist, mevki düşkünü.");

                        }
                    } else {
                        System.out.println("Hatalı giriş yaptınız. Lutfen tekrardan dogru sayı giriniz...");
                    }
                    break;
            }
            System.out.println("Hazırlayanlar: Oğuzhan Mert Güclü ve Ahmet Furkan Bahceci. 2025 yılında iyi şanslar dileriz. :))");
        } else System.out.println("Hatalı ay girişi yaptınız...");

        }
    }
