package JavaDoc;
// Point adinda bir pojo class olusturduk ve burada o class uzerinden islemlerimizi yapalim

// import statement: import alanlari sayfamin en basinda !CLASS'LARIN EN USTUNDE! yer alir

// javadoc block'lari command block'lara benzer ancak ilk satirinda bir yerine iki * vardir
// bu onemli cunku javadoc dokumantasyonu olusturulurken sistem iki * ile baslayan satir baslangicini arar
// ve javadoc block'unda sonraki her satir bir * ve bir bosluk ile baslar, boylece sistem * 'lar bitip / ile karsilasincaya
// kadar okumaya devam eder ve okudugu satirlari javadoc belgesine ekler
// peki javadoc nedir:
// javadoc is a tool for generating documentation from your source code : kaynak kodumuzdan dokumantasyon olusturmak icin kullanilan bir aractir
// a bunch of html files that together create a website: birlikte bir web sitesi olusturan bir grup html dosyasidir

// javadoc is like javac for your comments : javac= java compiler. yani diyor ki commandlerini okuyan compiler gibidir
// javac command satirlarini ignore ederek diger code'larin syntax olarak dogru olup olmadigina, java kodlama mantıgına uyup uymadigina
// bakar ve makina diline cevirir. javadoc ise yalnizca command satirlarina bakar ve bunlardan javadoc syntax'ina uygun olanlari alip
// html dosyasina donusturur. bildigimiz gibi html web sayfasi olusturmak icin kullanilan bir isaretleme dilidir
// simdi javadoc ile olusturulmus html dosyalarinin nasil gorundugune bir bakalim.
// google'a 'oracle java api' yazalim --> ilk satirda oracle documentation gelecek --> icine girelim
// burasi java icin inanilmaz buyuklukte bir kutuphanedir, index kisminda javada bulunan her sey alfabetik olarak aciklanmistir
// yalnizca A ile baslayanlar bbile oldukca uzun :)
// burada yer alan bilgiler aslinda birer javadoc'tur ve herhangi birine tiklayarak nasil gorundugune bakabilirsin
// tamamen bir web sayfasidir, ve isin guzel yani biz de bu sekilde gorunen javadoc olusturabiliriz
// bunu yapmak icin html bilmemiz ve html komutlariyla kodlama yapmamiz gerekmiyor
// olusturdugumuz javadoc dosyasi tamamen bu sekilde gorunecektir,
// artik gorunumunu bildigimize gore nasil yapilandirilacagi ve nasil calisacagi hakkinda konusabiliriz
// oncelikle javadoc'un artik kodlarimizdaki /**n ile baslayan command'leri aradigini biliyoruz
// bu yuzden javadoc yorumu iki bolumden olusur ve bu iki kisim birbirinden bos bir ssatirla ayrilmistir
// javadoc comment has two parts seperated by a newline
// part 1: description : freeform --> istedigini yazmakta serbestsin
// part 2: tag list : ozel bir bolumdur, burada javadoc'ta gecerli tag'leri kullanmalisin, aksi halde error alirsin
// simdi Point tester icin bir javadoc olusturalim, javadoc jangi yapi ile ilgili ise, onun hemen ustunde yer almali
// arada bosluk veya herhangi baska bir sey olmamali --> this is  best practice

// @author : yazar demektir, buraya class'i methodu veya her neyin dokumaniysa onu olustura kisinin adi yazilabilir,
//           dosya veya class duzeyindeki javadoc alanlarinda kullanilir
// @version : hangi versiyonda oldugunu ekleyebilirsin
// @see :  bu kisim ayni paket icindeki diger class'lari referans gostermek ve onlarin da incelenmesi gerektigini soylemek icin kullanilir

// how to run javadoc
// 1. terminalden: javadoc -d doc src/*  :
// src icindeki tum dosyalarin javadoc'ini yap demek, tabiki de terminalde uygun path icinde bulunuyor olmalisin
// javadoc ile kullanabilecegin birkac bayrak var ancak urada hepsini goremeyecegiz, ilgili dokumanlara yonlendirme yapilacak
// 2. IntelliJ IDEA IDE: Tools --> Generate JavaDoc
// burada karsimiza cikan pencere aslinda terminalde yaptigimiz isleri gosteren ve yapabilmemize imkan taniyan bir kullanici arayuzudur
// output directory mutlaka belirtilmeli, aksi halde javadoc olusturamayiz
//

/**
 * PointTester tests the Point class in Point.java. This is second sentence.
 *
 * @author gsprint
 * @version 1.0
 * @see Point
 */
public class PointTester // yesil alan acıklamak istedigim kodumun hemen uzerinde olmalidir, arada bosluk dahil baska hicbir sey olmamalidir
{
    /**
     * this is the main() method for the driver program.
     * @param args stores the incoming command line arguments for the program.
     */
    public static void main(String[] args)
    {
        // yukaridaki javadoc yorumunda biz /** ile actiktan sonra @param etiketini kendisi otomatik koydu ve parametrenin args
        // oldugunu kendisi otomatik olarak algilayip yazdi
        Point origin = new Point(); // point class'indan parammetresiz constructor ile bir obje olusturuldu
        System.out.println(origin); //

        // dosyalarim icin bir javadoc olusturdum ve daha sonra bu javadoc command alanlarinda degisiklikler yaptim
        // yeniden terminale giderek javadoc -d doc src/JavaDoc/* kodunu calistirmam gerekir
        // calistirdigimda 1 warning goruyorum, hangi satirda olduguna bakip hataya gidip kontrol edelim, yukari kaydirdiginda
        // hatayi ve kacinci satirda yazdigini gosteren bir alanla karsilasacaksin
        // tahmin ettigin gibi console hatasina benzemiyor, farkli bir gorunumu var ve kodlardan ayirt edemeyebilirsin ilk baslarda
        // ama dikkatli bakarsan ve zamanla da alisirsan kolayca bulabilirsin
        // hata icin no description for @param diyor. hadi gidip bakalim
        // bu spesifik tag'lerden biriydi ve freeform degildi, dolayisiyla bazi syntax kurallari mevcut
        // uzerine geldiginde zaten highligth oldugunu goreceksin ve ayni hata yonetiminde oldugu gibi otomatik fix edebilir
        // veya more action diyerek diger fix onerilerine bakabilirsin
        // aciklamamizi yazdik, hatayi duzelttigimizi dusunuyoruz ve simdi gidip yeniden  javadoc -d doc src/JavaDoc/*
        // komutunu terminalde calistiracagiz
        // hatasiz calisti tebriks
        // browser'daki javadoc sayfasini yeniledigimizde degisiklikleri gorecegiz
        // burada dikkat edersek @author ve @version tagleri ile yazdigim seyleri browser'da goremiyorum
        // ancak @see tag'ini goruyorum ve hatat yonlendirdigi class'a tiklayabiliyorum ki bu harika bir sey
        // aslinda burada soylememiz gereken sey su:
        // javadoc varsayilan olarak ozel olarak belirtmedigimiz surece her seyi icermez.
        // bu belirtmeleri de terminal komutlarina bayrak ekleyerek yapabiliriz
        // javadoc -d doc src/JavaDoc/* -author -version
        // kodunu calistirarak bunu yapalim ve degisiklikleri gorelim

        // simdi gidip Point class'i icin de javadoc command'leri olusturalim
        // class seviyesinde description, author ve version ekledikten sonra
        // constructor icin de aciklama yapmak isitiyorum ve belirtilen x degiskeninin (x,y) 2D koordinat duzlemindeki
        // x eksenine denk geldigini javadoc command block  icerisine yaziyorum
        // ardindan javadoc -d doc src/JavaDoc/* -author -version komutumu yeniden calistiriyorum ve
        // browser'a gidip sayfami yeniliyorum
        // ancak bu constructor aciklamasina dair hicbir sey goremiyorum
        // cunku varsayilan olarak javadoc; bizim public fields veya public access modifier'ina sahip alanlarima bakar
        // bu yuzden olusturuken hangi erisim belirtecini okuyup javadoc belgesine eklemesini istiyorsak bunu belirtmeliyiz
        // simdi bunu nasil yapavagimizi gorelim
        // javadoc -d doc src/JavaDoc/* -author -version -private
        // ornegimizde bahsettigimiz degiskenimiz private oldugu icin ve ona dair olana aciklamayi gormek istedigim icin
        // su anda yalnizca private access modifier'ini ekliyorum
        // bu kodu terminale yazarak calistiralim ve ardindan browser'a gidip neler olduguna bakalim.
        // artik field Summary ve field Detail diye iki alan olustugunu goruyoruz ve burada private degiskenlerimiz de yer aliyor,
        // cunku javadoc'a bunlari okuyup isleyebilmesi icin izin verdigimizi soyledik
        // simdi bu iki alan arasinda nasil bir fark oldugunu gorelim
        // daha once PointTester class'i icin yaptigimiz gibi Point class'inin javadoc command block'undaki description
        // kismina bir cumle daha ekleyelim. Ardindan bunun javadoc'a kaydedilebilmesi icin terminalde komutumuzu calistiralim ve
        // browsder'da nelerin degistine bakalim
        // goruyoruz ki field summary (ozet) alaninda ekledigimiz bu cumle yer almiyor
        // ancak field details'e geldigimizde ise ekledigimiz cumlenin karsimizda durdugunu goruyoruz
        // yani yalnizca ilk cumle javadoc tarafindan ozet olarak kabul ediliyor

        // Point class adi yazan herhangi bir yerde uzerine gelip f1'e tiklarsan (tiklasmasan da cikiyor)
        // o class icin olusturulmus quick documantation'i gorursun, peki burada yer alan bilgiler summary mi yoksa details mi
        // bunu anlamak icin Point class'i icin class level'de olusturdugumuz javadoc command block descriptionuna
        // bir cumle daha ekleyelim ve her zaman yaptigimiz gibi terminalde komutumuzu calistirelim
        // hatta daha da kolayi main method parametresi icindeki String class uzerine gelerek quick documantation'a bakalim
        // burada yalnizca ilk cumle olan 'The String class represents character strings' cumlesiini degil, bir paragraf goruyoruz
        // yani buradan anliyoruz ki quick doc details bilgileri iceriyor, summary degil

        // simdi de constructor icin javadoc nasil olustururz ona bakalim. Bu oldukca kolay ve onceki yaptiklarimiza benzer olacak
        // constructor'un hemen uzerinde javadoc command block acarsan zaten otomatik olarak @param tag'i ile birlikte
        // parametrelerin yazili oldugunu gorecegiz, intelliJ zaten 2 trane parametremiz oldugunu biliyor
        // bu yuzden yalnizca description yazmak simdilik bizim icin yeterli olacak
        // ve ardindan terminal komutumuzu calistiralim
        // 2 warnings verdi, daha onceden ogrendigimiz gibi yukari cikip hatamizin nerede olduguna bakalim
        // param x ve param y icin description yazmamisiz, daha onceki warning'de yaptigimiz hatanin birebir aynisi
        // bu bir sikinti degil aslinda, yani browser'a gidip baktigimizda her seyin yolunda oldugunu ve
        // degisikliklerimizin yansitildigini goruruz

        // javadoc command'lerimize html tag'leri ekleyebildigimizden bahsetmistik ancak bunun nasil yapilacagini henuz konusmadik
        // gelin simdi de buna bir goz atalim
        //  urada kullanilabilecek minyonlarca tag var ama biz hizlica birkacina bakacagiz
        // vurgulamak, highlight etmek istedim bir yere sunu yazabilirim: <code> blablabla <code/> bu tag arasina ayzdigim sey
        // bir code oldugu icin bu sekilde kullandim. mesela Point class'indaki constructor descripption'indsaki
        // (2 ints). kismi iicn sunu yazalim: 2 <code>int<code/>s
        // ve ardindan terminalde komutumuzu run edip browse'a baktigimizfa bu kismin farkli bir font ile yazilmis oldugunu goruruz
        // bu sadece basit bir ornek
        // bu sekilde yapilabilecek tonlarca sey var, bu sadece bir baslangic
        // kendinizi gelistirmek icin siklikla oracle'in javadoc doyalarina goz atmanizi oneririm
        // google'a oracle javadoc how to write  yazarak cikan dokumani okuyabilirsiniz


    }
}

