package id.ac.poliban.mi.atul.listmakanan;

import java.util.ArrayList;
import java.util.List;

public class FoodData {
    static List<Food> getAllFood(){
        List<Food> data = new ArrayList<>();
        {
            data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Nasi-Goreng-Masakan-Indonesia-yang-mendunia.jpg", "Nasi Goreng", "Pada ajang “World Expo Shanghai China 2010” masakan nasi goreng menjadi suguhan yang menarik. Ajang perlombaan masak bertaraf internasional ini mampu membawa nama nasi goreng semakin dikenal di mata dunia. Acara ini mendapat respon positif dari pengunjung pameran dari berbagai negara. Nyatanya dalam sehari, sedikitnya nasi goreng yang disajikan dengan telur dada dan sate ayam ini mampu terjual hingga 700 porsi. Nasi goreng ini menjadi salah satu makanan khas indonesia yang mendunia."));
            data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Gado-gado.jpg", "Gado-Gado", "Gado-gado adalah makanan khas Jawa berupa sayur sayuran yang direbus dan dicampur menjadi satu. Makanan ini mempunyai bumbu khas kacang tanah yang di haluskan. Tak ketinggalan juga irisan telur dan taburan bawang goreng diatasnya. Penyajiannya yang unik dan lezat ini akan lebih komplit jika ditambah dengan emping goreng atau kerupuk."));
            data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Soto-Ayam.jpg", "Soto Ayam", "Tak hanya terkenal karena rasanya yang lezat, Soto juga memiliki tampilan yang indah. Kuliner Khas Indonesia yang mudah dibuat ini paling nikmat jika di makan ketika musim hujan. Perpaduan udara yang dingin dan kuahnya yang panas adalah perpaduan yang pas bagi kita. Tak hanya di Indonesia saja, soto ayam juga ada di sebuah festival makanan di Jepang. Rupanya makanan soto ayam telah menjadi langganan di acara ini. acara ini sendiri diselenggarakan oleh pelajar Indonesia yang tergabung dalam PPIJ- Komsat Ibaraki. Terbukti dalam acara besar seperti ini soto ayam dapat menjadi makanan yang diterima dengan baik oleh masyarakat Jepang dan soto menjadi makanan khas indonesia yang mendunia."));
            data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Sate-ayam.jpg", "Sate Ayam", "Makanan yang dibakar ini merupakan makanan yang disukai oleh masyarakat Indonesia. Terkenal dengan sate khas Madura, ternyata sate ayam mampu menghipnotis masyarakat luar negeri. Sebuah bazar internasional yang diselenggarakan di China 2013 silam menjadi bukti sate ayam digemari oleh para pengunjung bazar. Kegiatan ini tidak hanya menyelenggarakan kuliner Indonesia saja tapi juga kuliner dari beberapa negara. Tapi menu makanan Indonesia menjadi daya tarik tersendiri."));
            data.add(new Food("https://www.asliindonesia.net/wp-content/uploads/2015/04/Tempe-Goreng.jpg", "Tempe ", "Berikutnya adalah tempe, ternyata tak hanya orang Indonesia saja yang menyukai tempe. Seorang juru masak asal Korea Eduard Quad adalah salah satu dari ribuan orang yang jatuh hati dengan tempe. Perhelatan Jakarta kuliner festival yang dihelat Oktober 2012 lalu menjadi perkumpulan koki dari berbagai mancanegara. Mereka datang untuk menikmati makanan khas Indonesia dan asal daerahnya. Salah satu makanan khas Indonesia adalah Tempe Goreng."));
        }
        return data;
    }
}
