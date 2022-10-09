package com.onurerdem.week_3_assignment.data

import android.os.Parcelable
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class BookModel(
    val id: String,
    val bookName: String,
    val author: String,
    val description: String
) : Parcelable {
    fun toJson(): String {
        return Gson().toJson(this)
    }
    companion object {
        fun fromJson(jsonValue: String): BookModel {
            return Gson().fromJson(jsonValue, BookModel::class.java)
        }
    }
}

val mockBookData = mutableListOf<BookModel>(
    BookModel(
        "1",
        "Yüzüklerin Efendisi",
        "John Ronald Reuel Tolkien",
        "Yüzüklerin Efendisi (İng. The Lord of the Rings), İngiliz filolojist ve Oxford Üniversitesi profesörü J. R. R. Tolkien'in yazdığı epik fantezi türündeki romandır. Hikâye, Tolkien'in çocuklar için yazdığı 1937 tarihli Hobbit'in devamı olarak başlamıştı ancak sonunda ondan çok daha büyük bir eser haline geldi. Çoğu II. Dünya Savaşı'nda olmak üzere 1937 ve 1949 yılları arasında aşamalar halinde yazıldı. 150 milyonun üstündeki satış sayısıyla tüm zamanların en çok satan ikinci romanıdır.\n" +
                "\n" +
                "Romanın ismi bütün Orta Dünya'yı fethedip hakimiyetine almakta kullandığı diğer Güç yüzükleri'ne hükmeden Tek Yüzük'ü ilk çağlarda yaratan, hikâyenin kötü karakterlerinden biri olan Lord Sauron'u kasteder. İngiliz kırsalından pek de farklı olmayan Hobbit diyarı Shire'da sakince başlayan hikâye, Orta Dünya'nın kuzeybatısına kadar uzanırken Hobbitler; Frodo, Sam, Merry ve Pippin'in yanı sıra Hobbitlerin müttefikleri ve yol arkadaşları olan Kuzey Kolcusu Aragorn, Gondor kumandanı Boromir, savaşçı Cüce Gimli, Elf prensi Legolas ve büyücü Gandalf'ın gözünden Yüzük Savaşı'nın gidişatı takip edilir."
    ),
    BookModel(
        "2",
        "Hobbit",
        "John Ronald Reuel Tolkien",
        "Hobbit (The Hobbit, 1937), İngiliz filolog ve yazar J. R. R. Tolkien'ın mitopya ve epik fantazya türlerinde yazdığı bir çocuk romanıdır. İlk baskısı 21 Eylül 1937 yılında yapıldı ve dönem eleştirmenlerinden büyük övgü aldı. İngiltere'nin önemli edebiyat ödülü Carnegie Madalyası'na aday gösterildi ve New York Herald Tribune'dan en iyi kurmaca çocuk eseri ödülünü kazandı. Günümüzde popülerliğini hâlâ sürdürmekte ve çocuk edebiyatının klasikleri arasında gösterilmektedir.\n" +
                "\n" +
                "Roman, Tolkien'ın âdeta bir külliyat oluşturduğu Orta Dünya evreninde, evcimen bir hobbit olan Bilbo Baggins'in Smaug adındaki ejderhanın Erebor'da sahiplendiği hazineden bir pay alma çabasıyla çıktığı yolculuğa ve sonrasında gelişen olaylara odaklanır. Gandalf ve on üç cücenin beklenmedik ziyareti sonrasında başlayan Bilbo'nun yolculuğu onu tasasız yaşadığı kırsaldan çıkararak, uğursuz denebilecek bölgelere götürür. Olay örgüsü bölümler halinde anlatılır ve çoğu bölüm Tolkien'in coğrafyasındaki yaratıkları tanımlama çabasıyla ilerler. Tolkien'ın daha sonra yazacağı Yüzüklerin Efendisi üçlemesinde Orta Dünya'nın kaderini değiştirecek ve yıllardır kayıp olan Tek Yüzük'ün yeniden bulunuşunu da içerir. Daha sonra yine üçleme içerisinde yer alacak elf kılıcı Sting, cüce zırhı Mithril gibi Orta Dünya'ya özgü nesneler de bu roman içerisinde anlatılır."
    ),
    BookModel(
        "3",
        "Buz ve Ateşin Şarkısı",
        "George Raymond Richard Martin",
        "Buz ve Ateşin Şarkısı (İngilizce: A Song of Ice and Fire), Amerikalı yazar George R. R. Martin'in halen devam etmekte olan epik fantezi türündeki roman serisinin adıdır. Martin serinin ilk kitabını 1991 yılında yazmaya başladı ve sonra Taht Oyunları adıyla ilk kez 1996 yılında yayınlandı. İlk üç kitabı art arda yazarak yayımladı. Martin seriyi yedi kitap halinde yayınlamayı planladı ve bunların beş tanesi yayımlandı. Serinin en son yayımlanan kitabı Ejderhaların Dansı (2011) oldu. Martin'in kitabı yazması beş yılını aldı. Altıncı kitabı Kış Rüzgârları hala yazım aşamasındadır.\n" +
                "\n" +
                "Kitapta anlatılan hikâye kurgusal iki kıta olan Westeros ve Essos'ta binlerce yıl öncesinde geçmektedir. Hikâye üçüncü bir şahsın ağzından farklı karakterlerin bakış açısıyla anlatılır. Hikâye üç ana konuda beraber işlenir: Westeros'u kontrol etmek isteyen farklı hanedanların mücadelesi; Westeros'un kuzeyindeki duvarın arkasında yaşadıklarına inanılan doğaüstü varlıklar olan \"Ötekiler\"'in yükselen tehdidi; ve 15 yıl önce öldürülen kralın sürgündeki kızı Daenerys Targaryen'in Westeros'a ateş saçan ejderhalarıyla dönüp tahtı geri alma hırsı."
    ),
    BookModel(
        "4",
        "Don Kişot",
        "Miguel de Cervantes Saavedra",
        "Don Kişot ya da Don Kihote (İspanyolca: Don Quijote), İspanyol şair ve romancı Miguel de Cervantes'in kendi dilinde yazdığı roman ve bu romandaki asıl şahsiyetin adıdır.\n" +
                "\n" +
                "1605'te \"La Mancha'lı Yaratıcı Asilzade Don Quijote\" ve 1615’te \"Marifetli Şövalye La Mancha'lı Don Kişot'un İkinci Bölümü\" olmak üzere iki bölüm halinde yayımlanan roman, en akıcı İspanyol edebi eserlerden biridir ve İspanyol edebiyatına ciddi bir giriş olarak kabul edilir. Modern Batı edebiyatının kurucu eserleri olarak ilk modern roman sıfatıyla anılır."
    ),
    BookModel(
        "5",
        "İntibah",
        "Namık Kemal (Osmanlıca: نامق كمال)",
        "İntibah ya da diğer adıyla Sergüzeşt-i Ali Bey, Namık Kemal'in, ilk kez 1876'da yayımlanan bir romanı. Romanda iyi yetişmiş Ali Bey'in, uygunsuz bir kadın olan Mahpeyker'e aşık olması ve bu aşkın Ali Bey'e maddi ve manevi olarak yıkım şeklinde sonuçlanması anlatılır. Ali Bey olayın farkına varana kadar iş işten çoktan geçmiştir.\n" +
                "\n" +
                "Namık Kemal, İntibah romanını 1873-1876 yılları arasında sürgünde bulunduğu Kıbrıs'taki Mağusa Kalesi'nde kaleme almıştır. Amacı, Osmanlıca'nın roman yazımına uygun olduğunu göstermektir. Namık Kemal bunu yapmak istemiş ama; özellikle de psikolojik tahliller kısmında dili iyi kullanamamıştır. Yazar, romana \"Son Pişmanlık\" adını koymuştur. Dönemde yapılan yayınları denetleyen Maarif Vekâleti, romanın başlığını yazara danışmaksızın \"İntibah: Sergüzeşt-i Ali Bey\" (Uyanış: Ali Bey'in Macerası) olarak değiştirmiş, bazı kısımları sansürlemiştir. Romanın özgün metni bu nedenle günümüze ulaşmamıştır. Sosyal içerikli bir romandır."
    ),
    BookModel(
        "6",
        "Cezmi",
        "Namık Kemal (Osmanlıca: نامق كمال)",
        "Cezmi, Tanzimat Edebiyatı yazarlarından Namık Kemal tarafından yazılan roman. İlk basımı 1880'de yapılan roman, Türk edebiyatının ilk tarihi romanı olma özelliği taşır. Kitapta II. Selim döneminde İranlılarla yapılan savaşta yer alan vatansever asker Cezmi'nin başından geçenler anlatılmaktadır.\n" +
                "\n" +
                "Olay döngüsü 16. yüzyılda geçmektedir. Roman karakterlerinden Cezmi, yiğit bir Osmanlı sipahisi olarak anlatılmaktadır. Cezmi aynı zamanda şair ve bilgili bir insandır. Cezmi cirit oynamada usta bir askerdir. Roman ilk olarak İstanbul'da başlar, Azerbaycan ve İran'da devam edip Tebriz Sarayı'nda sona erer. İran ile Osmanlı İmparatorluğu arasında savaş başlamıştır. Cezmi ise bu savaşa gönüllü asker olarak katılmıştır. Cezmi ile Adil Giray bu savaş vesilesiyle tanışmışlardır. Savaşta Osmanlı orduları üstün gelmektedir fakat Adil Giray ve kardeşi Gazi Giray esir düşmüştür, bu noktadan sonra romanın büyük ve önemli bir kısmı Tebriz Sarayı'nda, Adil Giray, Perihan ve Şehriyar arasında geçmektedir."
    ),
    BookModel(
        "7",
        "Harry Potter",
        "Joanne Kathleen \"Jo\" Rowling",
        "Harry Potter, İngiliz yazar J. K. Rowling tarafından yazılmış yedi fantastik romandan oluşan bir seridir. Romanlar, Hogwarts Cadılık ve Büyücülük Okulu'nda eğitim gören genç büyücü Harry Potter ile arkadaşları Hermione Granger ve Ron Weasley'nin yaşamlarını konu alır. Ana hikâye Harry'nin karanlık bir büyücü olan Lord Voldemort'un ölümsüz olmayı, Sihir Bakanlığı olarak bilinen büyücü yönetim kurulunu devirmeyi ve tüm büyücüleri ve Muggle'ları (büyülü olmayan insanlar) boyun eğdirmeye çalışması ve buna karşı bir hayat mücadelesi vermesidir.\n" +
                "\n" +
                "Serinin ilk romanı Harry Potter ve Felsefe Taşı'nın 26 Haziran 1997'de yayımlanmasından bu yana kitaplar dünya çapında büyük bir popülerlik ve ticari başarı elde etti. Eleştirmenlerden olumlu eleştiriler alan kitaplar, çocukların yanı sıra geniş bir yetişkin kitlenin de ilgisini çekti ve genç yetişkin edebiyatının temel taşlarından biri olarak kabul gördü. Şubat 2018 itibarıyla 80 dile çevrilerek dünya genelinde 500 milyondan fazla satan seri, tarihin en çok satan kitap serisi hâline geldi. Serinin son dört kitabı arka arkaya tarihin en hızlı satan kitabı rekorunu kırdı. Son kitap, piyasaya çıktığı ilk 24 saat içinde ABD'de yaklaşık 11 milyon kopya sattı."
    ),
    BookModel(
        "8",
        "Dune",
        "Frank Patrick Herbert",
        "Frank Patrick Herbert (8 Ekim 1920 - 11 Şubat 1986), Amerikalı bilimkurgu kitapları yazarı. Romanlarıyla ünlü olmasına rağmen, kısa öyküler de yazdı. Gazeteci, fotoğrafçı, kitap eleştirmeni, ekolojik danışman ve öğretim görevlisi olarak çalıştı.\n" +
                "\n" +
                "Herbert, Tacoma Washington'da 8 Ekim 1920'de dünyaya geldi. Küçüklüğünden beri yazar olmak istedi. 1938'de üniversiteden mezun oldu ve 1939'da Glendale Star adlı gazetede yazarlık kariyerine başladı. II. Dünya Savaşı sırasında yazarlığa altı ay kadar ara verdi ve Amerikan Donanması'nda fotoğrafçı olarak çalıştı, ancak bu görevden sağlık sebepleri ile ayrılmak zorunda kaldı."
    ),
    BookModel(
        "9",
        "The Witcher",
        "Andrzej Sapkowski",
        "The Witcher (Lehçe: Wiedźmin), Leh yazar Andrzej Sapkowski tarafından yazılmış Geralt of Rivia (Rivyalı Geralt) adındaki bir canavar avcısı hakkında fantezi tarzında kısa hikâye ve roman serisidir. Sapkowski'nin kitaplarında \"Witcher\", yaratıklarla savaşmak için genç yaştan itibaren usta bir şekilde kılıç eğitimi alan ve büyük mutasyonlar geçiren (çalışma ve bedensel modifikasyonlar ile) yaratık avcılarıdır. En belirgin özellikleri kediye benzer gözleri, sırtlarında taşıdıkları 2 uzun kılıç (biri canavarlar biri insanlar için) ve eğitildikleri okulun bir kolyesidir (Geralt'ın okulu kurt okuludur). Kitaplar bir filme, iki televizyon dizisine, video oyun üçlemesine (The Witcher, The Witcher 2: Assassins of Kings, The Witcher 3: Wild Hunt) ve bir görsel romana uyarlandı. Kısa hikâyeler ve romanlar İngilizce de dahil birçok dile çevrildi.\n" +
                "\n" +
                "Kitaplar Polonya'da, Orta ve Doğu Avrupa ülkelerinde kült olarak tanımlandı. Kitapların video oyunları ise oldukça başarılı oldu, Mart 2018 itibarıyla dünya çapında 33 milyondan fazla kopya sattı. Ülkemizde ise 4 Şubat 2020'de serinin yedinci kitabı Gölün Hanımı yayınlandı."
    ),
    BookModel(
        "10",
        "Açlık Oyunları",
        "Suzanne Collins",
        "Açlık Oyunları, Amerikalı yazar Suzanne Collins'in kaleme aldığı bir seridir. Bu seriyi oluşturan kitaplar Açlık Oyunları, Ateşi Yakalamak ve Alaycı Kuş'tur. Serideki kitaplar beyazperdeye de uyarlanmıştır.\n"
    ),
    BookModel(
        "11",
        "Robinson Crusoe",
        "Daniel Defoe",
        "Robinson Crusoe, Daniel Defoe'nun 1719 yılında ilk basımı yapılan ve bazılarınca ilk İngilizce roman olarak nitelendirilen kitabıdır. Kitap İngiltere'de yaşayan Alman asıllı orta hâlli bir ailenin en küçük oğlu olan Robinson Crusoe'nun babasının tüm itirazlarına rağmen, dünyayı gezme hayalleri ile çıktığı yolculukları ve bu sırada karşılaştığı olayları anlatır. Bu yolculuklar içinde ıssız bir adada 28 senesini son üç yılı hariç yalnız geçirir.\n" +
                "\n" +
                "Kitabın orijinal adı bir başlığa göre oldukça uzun sayılabilecek şekilde basılmıştır: York'lu Bir Denizcinin, Kendi Kaleminden, Deniz Kazası ile Düştüğü Amerika Sahillerindeki Oroonoque Nehri Ağzındaki Issız Bir Adada 28 Yılını Geçirirken Yaşadığı Serüvenler ve Korsanlar Tarafından Kurtarılması."
    ),
)
