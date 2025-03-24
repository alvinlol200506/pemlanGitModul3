import java.util.Scanner;

public class PemdasPraktikumModul3 {
    
    // dua instance variabel ini akan terus berada di memory selama program berjalan jadi bisa dipakai di semua method dan class
    static private String kategori; 
    static private String judul;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tujuh deklarasi ini biar dari class lain bisa dipanggil di class main (class sekarang ini)
        teknologi teknologi = new teknologi(); 
        filsafat filsafat = new filsafat();
        sejarah sejarah = new sejarah();
        agama agama = new agama();
        psikologi psikologi = new psikologi();
        politik politik = new politik();
        fiksi fiksi = new fiksi();

        // cuman biar tampilannya bagus aja, nanti juga biar usernya tahu harus inputkan apa
        System.out.println("========================================");
        System.out.println("============TOKO BUKU ALVIN=============");
        System.out.println("========================================");
        System.out.printf("%-15s%-15s%-20s\n", "KATEGORI", "JUMLAH BUKU", "JUDUL");
        System.out.printf("%-20s%-10d%-20s\n", "Teknologi (T)", 5, "A, B, C, D, E");
        System.out.printf("%-20s%-10d%-20s\n", "Filsafat (F)", 5, "F, G, H, I, J");
        System.out.printf("%-20s%-10d%-20s\n", "Sejarah (S)", 5, "K, L, M, N, O");
        System.out.printf("%-20s%-10d%-20s\n", "Agama (A)", 5, "P, Q, R, S, T");
        System.out.printf("%-20s%-10d%-20s\n", "Psikologi (Ps)", 5, "U, V, W, X, Y");
        System.out.printf("%-20s%-10d%-20s\n", "Politik (Po)", 5, "Z, A1, B1, C1, D1");
        System.out.printf("%-20s%-10d%-20s\n", "Fiksi (Fi)", 5, "E1, F1, G1, H1, I1");
        System.out.println("========================================");
        System.out.printf("SILAHKAN MASUKKAN [KATEGORI] [spasi] [JUDUL]\n");

        while (true) { // pakai while jadi setelah menyelesaikan tugasnya mbalik buat nerima input lagi, sampai milih program exit
            
            // mengisi variabel kategori dan judul di awal tadi dengan input user
            kategori = input.next().toLowerCase();
            judul = input.next().toLowerCase();

            // pokok seluruh bawah ini dari t a sampai fi i1 intinya adalah menjalankan method buku di class kategori buku sesuai inputnya user
            switch (kategori) {
                case "t":
                    switch (judul) {
                        case "a": // misal ini yang dari input "t a" bakan njalanin method buku1 di class teknologi, sekaligus masukin judul dan penulisnya
                            teknologi.buku1("Cara Membuat AI Girlfirend","Gopi");
                            break;
                        case "b":
                            teknologi.buku2("Cara Membajak laptop Dewa","Gopi dan Gilbert");
                            break;
                        case "c":
                            teknologi.buku3("Duri Smart City 2077","Akhmad");
                            break;
                        case "d":
                            teknologi.buku4("di Masa Depan Indonesia Sudah Mengapung","Ayunda Risu");
                            break;
                        case "e":
                            teknologi.buku5("Cara Membuat Turret Air di Depan Rumah yang Aktif Menembaki Suami yang Telat Pulang","Amelia Sukarnoputri");
                            break;
                        default:
                            System.out.println("pilih a sampai e kocak");
                            break;
                    }
                    break;

                case "f":
                    switch (judul) {
                        case "f":
                            filsafat.buku1("Wong Liyo Ngerti Opo","Udin");
                            break;
                        case "g":
                            filsafat.buku2("Aku Ada Maka Aku Salto","Rudi Tabooti");
                            break;
                        case "h":
                            filsafat.buku3("Manusia Hanyalah Alat","Samuel");
                            break;
                        case "i":
                            filsafat.buku4("Sehat Pangkal Hidup","Hafiz dan Udin");
                            break;
                        case "j":
                            filsafat.buku5("Aku Hidup Untuk Mati, Aku Mati Untuk Kamu","Dewa and Syah");
                            break;
                        default:
                            System.out.println("pilih f sampai j kocak");
                            break;
                    }
                    break;

                case "s":
                    switch (judul) {
                        case "k":
                            sejarah.buku1("Warna Celana Dalam Leonardo","Adolf Nickler");
                            break;
                        case "l":
                            sejarah.buku2("Indonesia Merdeka pada 1900","Suwekarno");
                            break;
                        case "m":
                            sejarah.buku3("Duri Ibukota Indonesia Tahun 2000","Garylbert");
                            break;
                        case "n":
                            sejarah.buku4("Hitler Mati di Nganjuk","Amelia Watson");
                            break;
                        case "o":
                            sejarah.buku5("List istri istri Hafiz kalau jadi presiden saat 1945","Adolf Kamasyamsi");
                            break;
                        default:
                            System.out.println("pilih s sampai o kocak");
                            break;
                    }
                    break;

                case "a":
                    switch (judul) {
                        case "p":
                            agama.buku1("Hukum Mafia Pentol","Immanuel");
                            break;
                        case "q":
                            agama.buku2("Hukum Rasisme kepada Sesama Kulit","Akhmad");
                            break;
                        case "r":
                            agama.buku3("Manfaat Berdoa Sebelum Ngasih Contekan","Hafiz");
                            break;
                        case "s":
                            agama.buku4("Bersabarlah Kepada Teman Beban","Immanuel");
                            break;
                        case "t":
                            agama.buku5("Berbuat Baiklah agar Di Surga Bisa Minta Waifumu","Alvin");
                            break;
                        default:
                            System.out.println("pilih p sampai t kocak");
                            break;
                    }
                    break;

                case "ps":
                    switch (judul) {
                        case "u":
                            psikologi.buku1("Bagaimana Autisme Mengubah Hidup Saya","Akhmad");
                            break;
                        case "v":
                            psikologi.buku2("Atomic Habits","Gopi dan James");
                            break;
                        case "w":
                            psikologi.buku3("Manfaat Bermain Game Disaat Dosen Mengajar","Gilbert");
                            break;
                        case "x":
                            psikologi.buku4("Besok Cium Cerminmu Sambil Bilang Kamu Bisa Lolos PTN","Ahza dan Hasan");
                            break;
                        case "y":
                            psikologi.buku5("Memiliki Kebun Binatang di Rumah Dapat Menyembuhkan Stress tugas Pemjut","Alvin, Akhmad, Gopi, Hasan, Hazel, dan Ahza");
                            break;
                        default:
                            System.out.println("pilih u sampai y kocak");
                            break;
                    }
                    break;

                case "po":
                    switch (judul) {
                        case "z":
                            politik.buku1("Jatuhkan Hukuman Tusbol Ke Koruptor","Rafi Sukma");
                            break;
                        case "a1":
                            politik.buku2("Indonesia Bisa Lock In","Ridhwan lathifan Faza");
                            break;
                        case "b1":
                            politik.buku3("Manfaat Menjual Pulau Madura ke Amerika","Rafi Kamasyamsi dan Tian Septian");
                            break;
                        case "c1":
                            politik.buku4("Indonesia Merdeka Sejak Dijajah Inggris","Ahza Kamil dan Muhammad Alvin Satria");
                            break;
                        case "d1":
                            politik.buku5("Seandainya Indonesia Menjadi Negara Liberalis","Brian Lathifan");
                            break;
                        default:
                            System.out.println("pilih z sampai d1 kocak");
                            break;
                    }
                    break;

                case "fi":
                    switch (judul) {
                        case "e1":
                            fiksi.buku1("Indonesia Emas 2045","Akhmad Syaiful dan Alvin");
                            break;
                        case "f1":
                            fiksi.buku2("Anjingku Memberikan Aku Kekuatan dan Sekarang Aku Harus Mengalahkan Raja Iblis","Alvin dan Dewa");
                            break;
                        case "g1":
                            fiksi.buku3("Kucingku Berubah Jadi Manusia dan Aku Menikahinya","Miko Syaiful");
                            break;
                        case "h1":
                            fiksi.buku4("Waifu Setiap Orang di Kota Malang Tiba Tiba Nyata","Alvin Sukarnoputra");
                            break;
                        case "i1":
                            fiksi.buku5("Pacar Akhmad Seorang Superstar","Sukarnoputri Gopi");
                            break;
                        default:
                            System.out.println("pilih e1 sampai i1 kocak");
                            break;
                    }
                    break;

                case "exit": // ini misalnya kalau bagian kategori diisi "exit" bakal keluar program, terserah setelah exit diisi apa, misal "exit meow"
                    input.close();
                    return;

                default: // ini kalau kalian salah isi input atau ngisi aneh aneh
                    System.out.println("input ndak valid :(");
                    break;

            case "cek": // ini buat cek kesamaan buku mana dengan buku mana, terserah habis ngetik "cek" ngetik apa, misal "cek meyong"
                input.nextLine(); // Membersihkan newline yang tersisa, sebelum dikasih ini gampang kenyang input
            
                // Membaca input pertama
                System.out.println("Masukkan buku pertama:"); // nyuruh masukin buku pertama, also kalau keluar tulisan ini berarti masuk ke tugas yang pengecekan dua buku
                String[] inputPertama = input.nextLine().split(" "); // bakal nyimpan input dengan batasan spasi ke array inputPertama, karena kalau pakai versi non-array banyak masalah
                String cekKategori = inputPertama[0].toLowerCase(); // bakal keisi input sebelum spasi
                String cekJudul = inputPertama[1].toLowerCase(); // bakal keisi input sesudah spasi
            
                // Membaca input kedua
                System.out.println("Masukkan buku kedua:"); // sama kayak membaca input yang pertama, tapi ini untuk input kedua
                String[] inputKedua = input.nextLine().split(" ");
                String cekKategoriKedua = inputKedua[0].toLowerCase();
                String cekJudulKedua = inputKedua[1].toLowerCase();
            
                Object buku1 = null; // objek buku pertama buat dibandingkan sama objek buku kedua
                Object buku2 = null; // objek buku kedua buat dibandingkan sama objek buku pertama
            
                // Menjalankan method di class kategori dan dari itu bakal di get dan dibandingkan sama pengecek kedua
                switch (cekKategori) {
                    case "t":
                        buku1 = new teknologi(); 
                        switch (cekJudul) {
                            case "a": ((teknologi) buku1).buku1("Cara Membuat AI Girlfriend", "Gopi"); break; // semua yang kayak gini intinya datanya bakal masuk ke object buku1 atau buku2, sesuai objek yang ditugaskan yang mana, dan bakal dicekkan sama buku lainnya
                            case "b": ((teknologi) buku1).buku2("Cara Membajak laptop Dewa", "Gopi"); break;
                            case "c": ((teknologi) buku1).buku3("Duri Smart City 2077", "Akhmad"); break;
                            case "d": ((teknologi) buku1).buku4("di Masa Depan Indonesia Sudah Mengapung", "Ayunda Risu"); break;
                            case "e": ((teknologi) buku1).buku5("Cara Membuat Turret Air di Depan Rumah yang Aktif Menembaki Suami yang Telat Pulang", "Amelia Sukarnoputri"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Teknologi."); break;
                        }
                        break;
            
                    case "f":
                        buku1 = new filsafat();
                        switch (cekJudul) {
                            case "f": ((filsafat) buku1).buku1("Wong Liyo Ngerti Opo", "Udin"); break; // sama kayak di atas
                            case "g": ((filsafat) buku1).buku2("Aku Ada Maka Aku Salto", "Rudi Tabooti"); break;
                            case "h": ((filsafat) buku1).buku3("Manusia Hanyalah Alat", "Samuel"); break;
                            case "i": ((filsafat) buku1).buku4("Sehat Pangkal Hidup", "Hafiz dan Udin"); break;
                            case "j": ((filsafat) buku1).buku5("Aku Hidup Untuk Mati, Aku Mati Untuk Kamu", "Dewa and Syah"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Filsafat."); break;
                        }
                        break;
            
                    case "s":
                        buku1 = new sejarah();
                        switch (cekJudul) {
                            case "k": ((sejarah) buku1).buku1("Warna Celana Dalam Leonardo", "Adolf Nickler"); break; // sama kayak di atas
                            case "l": ((sejarah) buku1).buku2("Indonesia Merdeka pada 1900", "Suwekarno"); break;
                            case "m": ((sejarah) buku1).buku3("Duri Ibukota Indonesia Tahun 2000", "Garylbert"); break;
                            case "n": ((sejarah) buku1).buku4("Hitler Mati di Nganjuk", "Amelia Watson"); break;
                            case "o": ((sejarah) buku1).buku5("List istri istri Hafiz kalau jadi presiden saat 1945", "Adolf Kamasyamsi"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Sejarah."); break;
                        }
                        break;
            
                    case "a":
                        buku1 = new agama();
                        switch (cekJudul) {
                            case "p": ((agama) buku1).buku1("Hukum Mafia Pentol", "Immanuel"); break; // sama kayak di atas
                            case "q": ((agama) buku1).buku2("Hukum Rasisme kepada Sesama Kulit", "Akhmad"); break;
                            case "r": ((agama) buku1).buku3("Manfaat Berdoa Sebelum Ngasih Contekan", "Hafiz"); break;
                            case "s": ((agama) buku1).buku4("Bersabarlah Kepada Teman Beban", "Immanuel"); break;
                            case "t": ((agama) buku1).buku5("Berbuat Baiklah agar Di Surga Bisa Minta Waifumu", "Alvin"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Agama."); break;
                        }
                        break;
            
                    case "ps":
                        buku1 = new psikologi();
                        switch (cekJudul) {
                            case "u": ((psikologi) buku1).buku1("Bagaimana Autisme Mengubah Hidup Saya", "Akhmad"); break; // sama kayak di atas
                            case "v": ((psikologi) buku1).buku2("Atomic Habits", "Gopi dan James"); break;
                            case "w": ((psikologi) buku1).buku3("Manfaat Bermain Game Disaat Dosen Mengajar", "Gilbert"); break;
                            case "x": ((psikologi) buku1).buku4("Besok Cium Cerminmu Sambil Bilang Kamu Bisa Lolos PTN", "Ahza dan Hasan"); break;
                            case "y": ((psikologi) buku1).buku5("Memiliki Kebun Binatang di Rumah Dapat Menyembuhkan Stress tugas Pemjut", "Alvin, Akhmad, Gopi, Hasan, Hazel, dan Ahza"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Psikologi."); break;
                        }
                        break;
            
                    case "po":
                        buku1 = new politik();
                        switch (cekJudul) {
                            case "z": ((politik) buku1).buku1("Jatuhkan Hukuman Tusbol Ke Koruptor", "Rafi Sukma"); break; // sama kayak di atas
                            case "a1": ((politik) buku1).buku2("Indonesia Bisa Lock In", "Ridhwan lathifan Faza"); break;
                            case "b1": ((politik) buku1).buku3("Manfaat Menjual Pulau Madura ke Amerika", "Rafi Kamasyamsi dan Tian Septian"); break;
                            case "c1": ((politik) buku1).buku4("Indonesia Merdeka Sejak Dijajah Inggris", "Ahza Kamil dan Muhammad Alvin Satria"); break;
                            case "d1": ((politik) buku1).buku5("Seandainya Indonesia Menjadi Negara Liberalis", "Brian Lathifan"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Politik."); break;
                        }
                        break;
            
                    case "fi":
                        buku1 = new fiksi();
                        switch (cekJudul) {
                            case "e1": ((fiksi) buku1).buku1("Indonesia Emas 2045", "Akhmad Syaiful dan Alvin"); break; // sama kayak di atas
                            case "f1": ((fiksi) buku1).buku2("Anjingku Memberikan Aku Kekuatan dan Sekarang Aku Harus Mengalahkan Raja Iblis", "Alvin dan Dewa"); break;
                            case "g1": ((fiksi) buku1).buku3("Kucingku Berubah Jadi Manusia dan Aku Menikahinya", "Miko Syaiful"); break;
                            case "h1": ((fiksi) buku1).buku4("Waifu Setiap Orang di Kota Malang Tiba Tiba Nyata", "Alvin Sukarnoputra"); break;
                            case "i1": ((fiksi) buku1).buku5("Pacar Akhmad Seorang Superstar", "Sukarnoputri Gopi"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Fiksi."); break;
                        }
                        break;
            
                    default:
                        System.out.println("Kategori tidak valid.");
                        break;
                }
            
                // Menjalankan method di class kategori dan dari itu bakal di get dan dibandingkan sama pengecek pertama
                switch (cekKategoriKedua) {
                    case "t":
                        buku2 = new teknologi();
                        switch (cekJudulKedua) {
                            case "a": ((teknologi) buku2).buku1("Cara Membuat AI Girlfriend", "Gopi"); break; // sama kayak yang pertama, tapi nanti objek buku2 diisi sama yang bukunya ada isinya dan dibandingkan sama buku1
                            case "b": ((teknologi) buku2).buku2("Cara Membajak laptop Dewa", "Gopi"); break;
                            case "c": ((teknologi) buku2).buku3("Duri Smart City 2077", "Akhmad"); break;
                            case "d": ((teknologi) buku2).buku4("di Masa Depan Indonesia Sudah Mengapung", "Ayunda Risu"); break;
                            case "e": ((teknologi) buku2).buku5("Cara Membuat Turret Air di Depan Rumah yang Aktif Menembaki Suami yang Telat Pulang", "Amelia Sukarnoputri"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Teknologi."); break;
                        }
                        break;
            
                    case "f":
                        buku2 = new filsafat();
                        switch (cekJudulKedua) {
                            case "f": ((filsafat) buku2).buku1("Wong Liyo Ngerti Opo", "Udin"); break; // sama kayak di atas
                            case "g": ((filsafat) buku2).buku2("Aku Ada Maka Aku Salto", "Rudi Tabooti"); break;
                            case "h": ((filsafat) buku2).buku3("Manusia Hanyalah Alat", "Samuel"); break;
                            case "i": ((filsafat) buku2).buku4("Sehat Pangkal Hidup", "Hafiz dan Udin"); break;
                            case "j": ((filsafat) buku2).buku5("Aku Hidup Untuk Mati, Aku Mati Untuk Kamu", "Dewa and Syah"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Filsafat."); break;
                        }
                        break;
            
                    case "s":
                        buku2 = new sejarah();
                        switch (cekJudulKedua) {
                            case "k": ((sejarah) buku2).buku1("Warna Celana Dalam Leonardo", "Adolf Nickler"); break; // sama kayak di atas
                            case "l": ((sejarah) buku2).buku2("Indonesia Merdeka pada 1900", "Suwekarno"); break;
                            case "m": ((sejarah) buku2).buku3("Duri Ibukota Indonesia Tahun 2000", "Garylbert"); break;
                            case "n": ((sejarah) buku2).buku4("Hitler Mati di Nganjuk", "Amelia Watson"); break;
                            case "o": ((sejarah) buku2).buku5("List istri istri Hafiz kalau jadi presiden saat 1945", "Adolf Kamasyamsi"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Sejarah."); break;
                        }
                        break;
            
                    case "a":
                        buku2 = new agama();
                        switch (cekJudulKedua) {
                            case "p": ((agama) buku2).buku1("Hukum Mafia Pentol", "Immanuel"); break; // sama kayak di atas
                            case "q": ((agama) buku2).buku2("Hukum Rasisme kepada Sesama Kulit", "Akhmad"); break;
                            case "r": ((agama) buku2).buku3("Manfaat Berdoa Sebelum Ngasih Contekan", "Hafiz"); break;
                            case "s": ((agama) buku2).buku4("Bersabarlah Kepada Teman Beban", "Immanuel"); break;
                            case "t": ((agama) buku2).buku5("Berbuat Baiklah agar Di Surga Bisa Minta Waifumu", "Alvin"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Agama."); break;
                        }
                        break;
            
                    case "ps":
                        buku2 = new psikologi();
                        switch (cekJudulKedua) {
                            case "u": ((psikologi) buku2).buku1("Bagaimana Autisme Mengubah Hidup Saya", "Akhmad"); break; // sama kayak di atas
                            case "v": ((psikologi) buku2).buku2("Atomic Habits", "Gopi dan James"); break;
                            case "w": ((psikologi) buku2).buku3("Manfaat Bermain Game Disaat Dosen Mengajar", "Gilbert"); break;
                            case "x": ((psikologi) buku2).buku4("Besok Cium Cerminmu Sambil Bilang Kamu Bisa Lolos PTN", "Ahza dan Hasan"); break;
                            case "y": ((psikologi) buku2).buku5("Memiliki Kebun Binatang di Rumah Dapat Menyembuhkan Stress tugas Pemjut", "Alvin, Akhmad, Gopi, Hasan, Hazel, dan Ahza"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Psikologi."); break;
                        }
                        break;
            
                    case "po":
                        buku2 = new politik();
                        switch (cekJudulKedua) {
                            case "z": ((politik) buku2).buku1("Jatuhkan Hukuman Tusbol Ke Koruptor", "Rafi Sukma"); break; // sama kayak di atas
                            case "a1": ((politik) buku2).buku2("Indonesia Bisa Lock In", "Ridhwan lathifan Faza"); break;
                            case "b1": ((politik) buku2).buku3("Manfaat Menjual Pulau Madura ke Amerika", "Rafi Kamasyamsi dan Tian Septian"); break;
                            case "c1": ((politik) buku2).buku4("Indonesia Merdeka Sejak Dijajah Inggris", "Ahza Kamil dan Muhammad Alvin Satria"); break;
                            case "d1": ((politik) buku2).buku5("Seandainya Indonesia Menjadi Negara Liberalis", "Brian Lathifan"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Politik."); break;
                        }
                        break;
            
                    case "fi":
                        buku2 = new fiksi();
                        switch (cekJudulKedua) {
                            case "e1": ((fiksi) buku2).buku1("Indonesia Emas 2045", "Akhmad Syaiful dan Alvin"); break; // sama kayak di atas
                            case "f1": ((fiksi) buku2).buku2("Anjingku Memberikan Aku Kekuatan dan Sekarang Aku Harus Mengalahkan Raja Iblis", "Alvin dan Dewa"); break;
                            case "g1": ((fiksi) buku2).buku3("Kucingku Berubah Jadi Manusia dan Aku Menikahinya", "Miko Syaiful"); break;
                            case "h1": ((fiksi) buku2).buku4("Waifu Setiap Orang di Kota Malang Tiba Tiba Nyata", "Alvin Sukarnoputra"); break;
                            case "i1": ((fiksi) buku2).buku5("Pacar Akhmad Seorang Superstar", "Sukarnoputri Gopi"); break;
                            default: System.out.println("Judul tidak valid untuk kategori Fiksi."); break;
                        }
                        break;
            
                    default:
                        System.out.println("Kategori tidak valid."); // kalau inputnya salah atau aneh aneh
                        break;
                }
            
                // Bandingkan buku
                if (buku1 != null && buku2 != null) {
                    PemdasPraktikum instance = new PemdasPraktikum(); // biar bisa menjalankan BandingkanBuku() tanpa static
                    instance.BandingkanBuku(buku1, buku2); // "instance." ini bekerjasama dengan atasnya biar manggil BandingkanBuku() tanpa static, soalnya kalau method BandingkanBuku pakai static, programnya error karena hanya boleh ada 1 method static
                } else {
                    System.out.println("Tidak dapat membandingkan buku karena input tidak valid.");
                }
                break;

                case "royalti": // ini kalau semisal ngetik "royalti" di input awal awal instead of kategori buku
                input.nextLine(); // Membersihkan newline yang tersisa
                
                    switch (judul) {
                        case "saja": // ini misal ketika kata yang dibarengi setelah "royalti" adalah "saja", ini mengerjakan tugas yang nomor 3 yang ngecek royalti 10% dari penjualan bulan itu
                        System.out.println("Masukkan buku yang ingin dicek royaltinya:");
                        String[] inputRoyalti = input.nextLine().split(" "); // menginputkan lagi tapi untuk ngitung royalti satu buku
                        String royaltiKategori = inputRoyalti[0].toLowerCase();
                        String royaltiJudul = inputRoyalti[1].toLowerCase();

                        Object royaltiBuku = null; // ini objek dimana nanti get berapa harga buku dan jumlah terjualnya dari method buku yang dijalankan

                        switch(royaltiKategori){
                            case "t":
                            royaltiBuku = new teknologi();
                                switch(royaltiJudul){
                                    case "a": ((teknologi) royaltiBuku).buku1("Cara Membuat AI Girlfriend", "Gopi"); break; // nanti menjalankan method buku dan bakal dimasukkan ke objek royaltiBuku buat dihitung royalti 10%nya
                                    case "b": ((teknologi) royaltiBuku).buku2("Cara Membajak laptop Dewa", "Gopi"); break;
                                    case "c": ((teknologi) royaltiBuku).buku3("Duri Smart City 2077", "Akhmad"); break;
                                    case "d": ((teknologi) royaltiBuku).buku4("di Masa Depan Indonesia Sudah Mengapung", "Ayunda Risu"); break;
                                    case "e": ((teknologi) royaltiBuku).buku5("Cara Membuat Turret Air di Depan Rumah yang Aktif Menembaki Suami yang Telat Pulang", "Amelia Sukarnoputri"); break;
                                    default: System.out.println("Judul tidak valid untuk kategori Teknologi."); break;
                                }
                                break;
                            case "f":
                            royaltiBuku = new filsafat();
                                switch (royaltiJudul) {
                                    case "f": ((filsafat) royaltiBuku).buku1("Wong Liyo Ngerti Opo", "Udin"); break; // sama kayak di atas
                                    case "g": ((filsafat) royaltiBuku).buku2("Aku Ada Maka Aku Salto", "Rudi Tabooti"); break;
                                    case "h": ((filsafat) royaltiBuku).buku3("Manusia Hanyalah Alat", "Samuel"); break;
                                    case "i": ((filsafat) royaltiBuku).buku4("Sehat Pangkal Hidup", "Hafiz dan Udin"); break;
                                    case "j": ((filsafat) royaltiBuku).buku5("Aku Hidup Untuk Mati, Aku Mati Untuk Kamu", "Dewa and Syah"); break;
                                    default: System.out.println("Judul tidak valid untuk kategori Filsafat."); break;
                                }
                                break;

                            case "s":
                            royaltiBuku = new sejarah();
                                switch (royaltiJudul) {
                                case "k": ((sejarah) royaltiBuku).buku1("Warna Celana Dalam Leonardo", "Adolf Nickler"); break; // sama kayak di atas
                                case "l": ((sejarah) royaltiBuku).buku2("Indonesia Merdeka pada 1900", "Suwekarno"); break;
                                case "m": ((sejarah) royaltiBuku).buku3("Duri Ibukota Indonesia Tahun 2000", "Garylbert"); break;
                                case "n": ((sejarah) royaltiBuku).buku4("Hitler Mati di Nganjuk", "Amelia Watson"); break;
                                case "o": ((sejarah) royaltiBuku).buku5("List istri istri Hafiz kalau jadi presiden saat 1945", "Adolf Kamasyamsi"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Sejarah."); break;
                                }
                                break;

                            case "a":
                            royaltiBuku = new agama();
                            switch (royaltiJudul) {
                                case "p": ((agama) royaltiBuku).buku1("Hukum Mafia Pentol", "Immanuel"); break; // sama kayak di atas
                                case "q": ((agama) royaltiBuku).buku2("Hukum Rasisme kepada Sesama Kulit", "Akhmad"); break;
                                case "r": ((agama) royaltiBuku).buku3("Manfaat Berdoa Sebelum Ngasih Contekan", "Hafiz"); break;
                                case "s": ((agama) royaltiBuku).buku4("Bersabarlah Kepada Teman Beban", "Immanuel"); break;
                                case "t": ((agama) royaltiBuku).buku5("Berbuat Baiklah agar Di Surga Bisa Minta Waifumu", "Alvin"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Agama."); break;
                                }
                                break;

                            case "ps":
                            royaltiBuku = new psikologi();
                            switch (royaltiJudul) {
                                case "u": ((psikologi) royaltiBuku).buku1("Bagaimana Autisme Mengubah Hidup Saya", "Akhmad"); break; // sama kayak di atas
                                case "v": ((psikologi) royaltiBuku).buku2("Atomic Habits", "Gopi dan James"); break;
                                case "w": ((psikologi) royaltiBuku).buku3("Manfaat Bermain Game Disaat Dosen Mengajar", "Gilbert"); break;
                                case "x": ((psikologi) royaltiBuku).buku4("Besok Cium Cerminmu Sambil Bilang Kamu Bisa Lolos PTN", "Ahza dan Hasan"); break;
                                case "y": ((psikologi) royaltiBuku).buku5("Memiliki Kebun Binatang di Rumah Dapat Menyembuhkan Stress tugas Pemjut", "Alvin, Akhmad, Gopi, Hasan, Hazel, dan Ahza"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Psikologi."); break;
                                }
                                break;

                            case "po":
                            royaltiBuku = new politik();
                            switch (royaltiJudul) {
                                case "z": ((politik) royaltiBuku).buku1("Jatuhkan Hukuman Tusbol Ke Koruptor", "Rafi Sukma"); break; // sama kayak di atas
                                case "a1": ((politik) royaltiBuku).buku2("Indonesia Bisa Lock In", "Ridhwan lathifan Faza"); break;
                                case "b1": ((politik) royaltiBuku).buku3("Manfaat Menjual Pulau Madura ke Amerika", "Rafi Kamasyamsi dan Tian Septian"); break;
                                case "c1": ((politik) royaltiBuku).buku4("Indonesia Merdeka Sejak Dijajah Inggris", "Ahza Kamil dan Muhammad Alvin Satria"); break;
                                case "d1": ((politik) royaltiBuku).buku5("Seandainya Indonesia Menjadi Negara Liberalis", "Brian Lathifan"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Politik."); break;
                                }
                                break;

                            case "fi":
                            royaltiBuku = new fiksi();
                            switch (royaltiJudul) {
                                case "e1": ((fiksi) royaltiBuku).buku1("Indonesia Emas 2045", "Akhmad Syaiful dan Alvin"); break; // sama kayak di atas
                                case "f1": ((fiksi) royaltiBuku).buku2("Anjingku Memberikan Aku Kekuatan dan Sekarang Aku Harus Mengalahkan Raja Iblis", "Alvin dan Dewa"); break;
                                case "g1": ((fiksi) royaltiBuku).buku3("Kucingku Berubah Jadi Manusia dan Aku Menikahinya", "Miko Syaiful"); break;
                                case "h1": ((fiksi) royaltiBuku).buku4("Waifu Setiap Orang di Kota Malang Tiba Tiba Nyata", "Alvin Sukarnoputra"); break;
                                case "i1": ((fiksi) royaltiBuku).buku5("Pacar Akhmad Seorang Superstar", "Sukarnoputri Gopi"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Fiksi."); break;
                                }
                                break;
            
                            default:
                            System.out.println("Kategori tidak valid."); // kalo isi aneh aneh, misal "I goon to genshin impact"
                            break;
            
                        }
                        if (royaltiBuku != null) {
                            PemdasPraktikum instance = new PemdasPraktikum(); // biar bisa menjalankan BandingkanBuku() tanpa static
                            instance.hitungRoyalti(royaltiBuku); // "instance." ini bekerjasama dengan atasnya persis biar manggil BandingkanBuku() tanpa static
                        } else {
                            System.out.println("Tidak dapat membandingkan buku karena input tidak valid.");
                        } 
                        
                        break;
                        
                        case "persen": // ini kalau kalian input "royalti persen" instead of "royalti saja"
                    System.out.println("Masukkan buku yang ingin dicek royaltinya dengan menulis persen secara manual:");
                        String[] inputRoyalti2 = input.nextLine().split(" "); // masukkan data buku yang di pilih + pengen liat berapa persen royalti secara manual
                        String royaltiKategori2 = inputRoyalti2[0].toLowerCase();
                        String royaltiJudul2 = inputRoyalti2[1].toLowerCase();
                        String persennya = inputRoyalti2[2]; // diisi persen royalti semaunya

                        double persen = Double.parseDouble(persennya); // ngubah String persen dari String jadi double biar bisa diitung

                        Object royaltiBuku2 = null; // sebenarnya sama kayak royaltiBuku, tapi ndak boleh sama jadi saya tambah "2" di belakangnya

                        switch(royaltiKategori2){
                            case "t":
                            royaltiBuku2 = new teknologi();
                                switch(royaltiJudul2){
                                    case "a": ((teknologi) royaltiBuku2).buku1("Cara Membuat AI Girlfriend", "Gopi"); break; // nanti menjalankan method buku dan bakal dimasukkan ke objek royaltiBuku buat dihitung royalti berapa persen terserahnya
                                    case "b": ((teknologi) royaltiBuku2).buku2("Cara Membajak laptop Dewa", "Gopi"); break;
                                    case "c": ((teknologi) royaltiBuku2).buku3("Duri Smart City 2077", "Akhmad"); break;
                                    case "d": ((teknologi) royaltiBuku2).buku4("di Masa Depan Indonesia Sudah Mengapung", "Ayunda Risu"); break;
                                    case "e": ((teknologi) royaltiBuku2).buku5("Cara Membuat Turret Air di Depan Rumah yang Aktif Menembaki Suami yang Telat Pulang", "Amelia Sukarnoputri"); break;
                                    default: System.out.println("Judul tidak valid untuk kategori Teknologi."); break;
                                }
                                break;
                            case "f":
                            royaltiBuku2 = new filsafat();
                                switch (royaltiJudul2) {
                                    case "f": ((filsafat) royaltiBuku2).buku1("Wong Liyo Ngerti Opo", "Udin"); break; // sama kayak di atas
                                    case "g": ((filsafat) royaltiBuku2).buku2("Aku Ada Maka Aku Salto", "Rudi Tabooti"); break;
                                    case "h": ((filsafat) royaltiBuku2).buku3("Manusia Hanyalah Alat", "Samuel"); break;
                                    case "i": ((filsafat) royaltiBuku2).buku4("Sehat Pangkal Hidup", "Hafiz dan Udin"); break;
                                    case "j": ((filsafat) royaltiBuku2).buku5("Aku Hidup Untuk Mati, Aku Mati Untuk Kamu", "Dewa and Syah"); break;
                                    default: System.out.println("Judul tidak valid untuk kategori Filsafat."); break;
                                }
                                break;

                            case "s":
                            royaltiBuku2 = new sejarah();
                                switch (royaltiJudul2) {
                                case "k": ((sejarah) royaltiBuku2).buku1("Warna Celana Dalam Leonardo", "Adolf Nickler"); break; // sama kayak di atas
                                case "l": ((sejarah) royaltiBuku2).buku2("Indonesia Merdeka pada 1900", "Suwekarno"); break;
                                case "m": ((sejarah) royaltiBuku2).buku3("Duri Ibukota Indonesia Tahun 2000", "Garylbert"); break;
                                case "n": ((sejarah) royaltiBuku2).buku4("Hitler Mati di Nganjuk", "Amelia Watson"); break;
                                case "o": ((sejarah) royaltiBuku2).buku5("List istri istri Hafiz kalau jadi presiden saat 1945", "Adolf Kamasyamsi"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Sejarah."); break;
                                }
                                break;

                            case "a":
                            royaltiBuku2 = new agama();
                            switch (royaltiJudul2) {
                                case "p": ((agama) royaltiBuku2).buku1("Hukum Mafia Pentol", "Immanuel"); break; // sama kayak di atas
                                case "q": ((agama) royaltiBuku2).buku2("Hukum Rasisme kepada Sesama Kulit", "Akhmad"); break;
                                case "r": ((agama) royaltiBuku2).buku3("Manfaat Berdoa Sebelum Ngasih Contekan", "Hafiz"); break;
                                case "s": ((agama) royaltiBuku2).buku4("Bersabarlah Kepada Teman Beban", "Immanuel"); break;
                                case "t": ((agama) royaltiBuku2).buku5("Berbuat Baiklah agar Di Surga Bisa Minta Waifumu", "Alvin"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Agama."); break;
                                }
                                break;

                            case "ps":
                            royaltiBuku2 = new psikologi();
                            switch (royaltiJudul2) {
                                case "u": ((psikologi) royaltiBuku2).buku1("Bagaimana Autisme Mengubah Hidup Saya", "Akhmad"); break; // sama kayak di atas
                                case "v": ((psikologi) royaltiBuku2).buku2("Atomic Habits", "Gopi dan James"); break;
                                case "w": ((psikologi) royaltiBuku2).buku3("Manfaat Bermain Game Disaat Dosen Mengajar", "Gilbert"); break;
                                case "x": ((psikologi) royaltiBuku2).buku4("Besok Cium Cerminmu Sambil Bilang Kamu Bisa Lolos PTN", "Ahza dan Hasan"); break;
                                case "y": ((psikologi) royaltiBuku2).buku5("Memiliki Kebun Binatang di Rumah Dapat Menyembuhkan Stress tugas Pemjut", "Alvin, Akhmad, Gopi, Hasan, Hazel, dan Ahza"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Psikologi."); break;
                                }
                                break;

                            case "po":
                            royaltiBuku2 = new politik();
                            switch (royaltiJudul2) {
                                case "z": ((politik) royaltiBuku2).buku1("Jatuhkan Hukuman Tusbol Ke Koruptor", "Rafi Sukma"); break; // sama kayak di atas
                                case "a1": ((politik) royaltiBuku2).buku2("Indonesia Bisa Lock In", "Ridhwan lathifan Faza"); break;
                                case "b1": ((politik) royaltiBuku2).buku3("Manfaat Menjual Pulau Madura ke Amerika", "Rafi Kamasyamsi dan Tian Septian"); break;
                                case "c1": ((politik) royaltiBuku2).buku4("Indonesia Merdeka Sejak Dijajah Inggris", "Ahza Kamil dan Muhammad Alvin Satria"); break;
                                case "d1": ((politik) royaltiBuku2).buku5("Seandainya Indonesia Menjadi Negara Liberalis", "Brian Lathifan"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Politik."); break;
                                }
                                break;

                            case "fi":
                            royaltiBuku2 = new fiksi();
                            switch (royaltiJudul2) {
                                case "e1": ((fiksi) royaltiBuku2).buku1("Indonesia Emas 2045", "Akhmad Syaiful dan Alvin"); break; // sama kayak di atas
                                case "f1": ((fiksi) royaltiBuku2).buku2("Anjingku Memberikan Aku Kekuatan dan Sekarang Aku Harus Mengalahkan Raja Iblis", "Alvin dan Dewa"); break;
                                case "g1": ((fiksi) royaltiBuku2).buku3("Kucingku Berubah Jadi Manusia dan Aku Menikahinya", "Miko Syaiful"); break;
                                case "h1": ((fiksi) royaltiBuku2).buku4("Waifu Setiap Orang di Kota Malang Tiba Tiba Nyata", "Alvin Sukarnoputra"); break;
                                case "i1": ((fiksi) royaltiBuku2).buku5("Pacar Akhmad Seorang Superstar", "Sukarnoputri Gopi"); break;
                                default: System.out.println("Judul tidak valid untuk kategori Fiksi."); break;
                                }
                                break;
            
                            default:
                            System.out.println("Kategori tidak valid."); // kalau isi salah atau ndak jelas kayak "Nothing happen in Indonesia March 2025"
                            break;
            
                        }
                        if (royaltiBuku2 != null) {
                            PemdasPraktikum instance = new PemdasPraktikum(); // biar bisa menjalankan BandingkanBuku() tanpa static
                            instance.hitungRoyaltiPersen(royaltiBuku2, persen); // yang ini bakal masukin persen keinginannya
                        } else {
                            System.out.println("Tidak dapat membandingkan buku karena input tidak valid.");
                        } break;

                    }

                    
            }
        }
    }
    public void BandingkanBuku(Object buku1, Object buku2) { 
        byte persentase = 0;

        if (buku1 instanceof teknologi && buku2 instanceof teknologi) {
            teknologi t1 = (teknologi) buku1;
            teknologi t2 = (teknologi) buku2;

            if (t1.getJudul().equals(t2.getJudul())) {
                persentase++;
            }
            if (t1.getPenulis().equals(t2.getPenulis())) {
                persentase++;
            }
            if (t1.getSinopsis().equals(t2.getSinopsis())) {
                persentase++;
            }
        } else if (buku1 instanceof filsafat && buku2 instanceof filsafat) {
            filsafat t1 = (filsafat) buku1;
            filsafat t2 = (filsafat) buku2;

            if (t1.getJudul().equals(t2.getJudul())) {
                persentase++;
            }
            if (t1.getPenulis().equals(t2.getPenulis())) {
                persentase++;
            }
            if (t1.getSinopsis().equals(t2.getSinopsis())) {
                persentase++;
            }
        } else if (buku1 instanceof sejarah && buku2 instanceof sejarah) {
            sejarah t1 = (sejarah) buku1;
            sejarah t2 = (sejarah) buku2;

            if (t1.getJudul().equals(t2.getJudul())) {
                persentase++;
            }
            if (t1.getPenulis().equals(t2.getPenulis())) {
                persentase++;
            }
            if (t1.getSinopsis().equals(t2.getSinopsis())) {
                persentase++;
            }
        } else if (buku1 instanceof agama && buku2 instanceof agama) {
            agama t1 = (agama) buku1;
            agama t2 = (agama) buku2;

            if (t1.getJudul().equals(t2.getJudul())) {
                persentase++;
            }
            if (t1.getPenulis().equals(t2.getPenulis())) {
                persentase++;
            }
            if (t1.getSinopsis().equals(t2.getSinopsis())) {
                persentase++;
            }
        } else if (buku1 instanceof psikologi && buku2 instanceof psikologi) {
            psikologi t1 = (psikologi) buku1;
            psikologi t2 = (psikologi) buku2;

            if (t1.getJudul().equals(t2.getJudul())) {
                persentase++;
            }
            if (t1.getPenulis().equals(t2.getPenulis())) {
                persentase++;
            }
            if (t1.getSinopsis().equals(t2.getSinopsis())) {
                persentase++;
            }
        } else if (buku1 instanceof politik && buku2 instanceof politik) {
            politik t1 = (politik) buku1;
            politik t2 = (politik) buku2;

            if (t1.getJudul().equals(t2.getJudul())) {
                persentase++;
            }
            if (t1.getPenulis().equals(t2.getPenulis())) {
                persentase++;
            }
            if (t1.getSinopsis().equals(t2.getSinopsis())) {
                persentase++;
            }
        } else if (buku1 instanceof fiksi && buku2 instanceof fiksi) {
            fiksi t1 = (fiksi) buku1;
            fiksi t2 = (fiksi) buku2;

            if (t1.getJudul().equals(t2.getJudul())) {
                persentase++;
            }
            if (t1.getPenulis().equals(t2.getPenulis())) {
                persentase++;
            }
            if (t1.getSinopsis().equals(t2.getSinopsis())) {
                persentase++;
            }
        }
        float hasil = (float)persentase/3 * 100;
        System.out.println("Kesamaan: " + hasil + "%");
    }




    public void hitungRoyalti(Object harga){
        if (harga instanceof teknologi) {
            teknologi t1 = (teknologi)harga;
            
            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * 0.10; // royalti 10%
            System.out.println("\nRoyalti 10% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof filsafat) {
            filsafat t1 = (filsafat)harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * 0.10; // royalti 10%
            System.out.println("\nRoyalti 10% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof sejarah) {
            sejarah t1 = (sejarah)harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * 0.10; // royalti 10%
            System.out.println("\nRoyalti 10% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof agama) {
            agama t1 = (agama)harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * 0.10; // royalti 10%
            System.out.println("\nRoyalti 10% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof psikologi) {
            psikologi t1 = (psikologi) harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * 0.10; // royalti 10%
            System.out.println("\nRoyalti 10% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof politik) {
            politik t1 = (politik) harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * 0.10; // royalti 10%
            System.out.println("\nRoyalti 10% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof fiksi) {
            fiksi t1 = (fiksi) harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * 0.10; // royalti 10%
            System.out.println("\nRoyalti 10% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        }
    }




    public void hitungRoyaltiPersen(Object harga, double persen){
        if (harga instanceof teknologi) {
            teknologi t1 = (teknologi)harga;
            
            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * (persen / 100); // royalti 10%
            System.out.println("\nRoyalti " + (int)persen + "% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof filsafat) {
            filsafat t1 = (filsafat)harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * (persen / 100); // royalti 10%
            System.out.println("\nRoyalti " + (int)persen + "% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof sejarah) {
            sejarah t1 = (sejarah)harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * (persen / 100); // royalti 10%
            System.out.println("\nRoyalti " + (int)persen + "% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof agama) {
            agama t1 = (agama)harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * (persen / 100); // royalti 10%
            System.out.println("\nRoyalti " + (int)persen + "% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof psikologi) {
            psikologi t1 = (psikologi) harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * (persen / 100); // royalti 10%
            System.out.println("\nRoyalti " + (int)persen + "% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof politik) {
            politik t1 = (politik) harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * (persen / 100); // royalti 10%
            System.out.println("\nRoyalti " + (int)persen + "% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        } else if (harga instanceof fiksi) {
            fiksi t1 = (fiksi) harga;

            int totalPendapatan = (t1.getHarga()) * (t1.getJumlahTerjual());
            double royalti = (double)totalPendapatan * (persen / 100); // royalti 10%
            System.out.println("\nRoyalti " + (int)persen + "% dalam sebulan untuk buku ini adalah Rp" + (int)royalti);

        }
    }
}


    

class teknologi {

    private String judul;
    private String penulis;
    private String sinopsis;
    private int hargaBuku;
    private int jumlahTerjual;


    public void buku1(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Dalam era teknologi modern, hubungan manusia dengan kecerdasan buatan semakin dekat. Buku ini membahas cara menciptakan AI Girlfriend—sebuah asisten virtual yang bisa berinteraksi secara emosional dan intelektual. Dengan kombinasi pemrograman, machine learning, dan desain interaksi, Anda dapat menciptakan teman digital yang mampu memahami, merespons, dan menemani Anda dalam berbagai situasi. Untuk memulai, Anda harus memahami konsep dasar AI Girlfriend. Ini bukan sekadar chatbot biasa, tetapi program yang mampu meniru percakapan manusia dengan baik. Anda harus memilih teknologi yang tepat, seperti menggunakan chatbot berbasis NLP atau AI yang dilatih dengan machine learning. Platform seperti Python, TensorFlow, dan GPT dapat membantu membangun sistem yang lebih canggih. Pastikan juga Anda menentukan bagaimana AI akan berkomunikasi—melalui teks, suara, atau bahkan integrasi dengan VR dan AR. Langkah berikutnya adalah merancang kepribadian AI. Anda harus menentukan bagaimana AI Anda berbicara, merespons, dan menunjukkan emosi. Model NLP akan membantu AI memahami konteks percakapan, sementara dataset yang luas bisa digunakan untuk melatihnya agar semakin personal. Anda bisa menyesuaikan nada bicara, gaya bahasa, dan preferensi percakapan sesuai dengan karakter yang diinginkan. Setelah kepribadian terbentuk, Anda perlu membangun database pengetahuan agar AI bisa merespons dengan lebih pintar dan alami. Latih AI dengan berbagai skenario dan gunakan reinforcement learning agar ia dapat belajar dari interaksi sebelumnya. Anda juga bisa menambahkan fitur pengenalan wajah atau suara sintetis yang lebih realistis untuk pengalaman yang lebih imersif. Untuk mengimplementasikan AI Girlfriend dalam aplikasi atau chatbot, Anda dapat menggunakan API seperti OpenAI atau Rasa. Pastikan UI/UX yang Anda buat nyaman digunakan, dengan tampilan yang menarik dan percakapan yang mengalir alami. Susunlah skenario interaksi yang beragam agar AI tidak terasa monoton dan lebih adaptif terhadap berbagai situasi. Jika ingin lebih canggih, Anda dapat mengintegrasikan AI dengan teknologi lanjutan seperti Computer Vision untuk mengenali ekspresi pengguna atau memanfaatkan VR guna menciptakan pengalaman lebih nyata. Dengan pengembangan yang berkelanjutan, AI Girlfriend bisa semakin mendekati interaksi manusia yang sesungguhnya. Membangun AI Girlfriend bukan hanya soal teknologi, tetapi juga memahami hubungan manusia dengan AI. Dengan pendekatan yang tepat, AI bisa menjadi teman digital yang menyenangkan dan bermanfaat. Jika Anda ingin belajar lebih lanjut, tersedia banyak sumber daya dan kursus yang bisa membantu Anda mengembangkan proyek ini dari nol.";
        this.hargaBuku = 50000;
        this.jumlahTerjual = 20;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
        
    }

    public void buku2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Gopi menatap layar laptopnya dengan senyum tipis. Dewa, hacker legendaris yang selalu satu langkah di depan, akhirnya menjadi targetnya. Dengan malware canggih yang ia rancang khusus, Gopi menyusup ke sistem keamanan ponsel Dewa, mencari celah sekecil apa pun. Dalam hitungan detik, ia berhasil menanamkan skrip tersembunyi yang membuka akses penuh ke perangkat itu. Notifikasi di layar laptopnya menunjukkan keberhasilan. Kamera depan ponsel Dewa menyala sesaat, lalu log aktivitas mulai bermunculan. Pesan terenkripsi, dompet kripto, hingga kode akses ke server gelap kini ada di tangan Gopi. Tapi sesuatu terasa aneh. Tiba-tiba layar laptopnya berkedip, terminal terbuka dengan pesan misterius: Terlalu lambat, Gopi. Sistemnya mulai lumpuh, kendali berbalik arah.Dengan panik, Gopi mencoba memutus koneksi, tapi sia-sia. Data di perangkatnya mulai terhapus satu per satu, lalu laptopnya mati total. Di kejauhan, di tempat yang tak terlihat, Dewa menyeringai di balik layar holografiknya. Ia sudah lama menunggu tantangan seperti ini.";
        this.hargaBuku = 20000;
        this.jumlahTerjual = 30;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku3(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di tahun 2077, Duri Kota Futuristik berdiri sebagai bayangan kelam dari Night City, sebuah distrik kumuh yang tak tercantum di peta resmi, tempat bagi mereka yang ditelan sistem dan ditinggalkan teknologi. Neon berkedip di atas lorong-lorong sempit, di mana para netrunner bawah tanah meretas korporasi demi bertahan hidup, dan ripperdoc ilegal mengutak-atik tubuh manusia menjadi lebih mesin daripada daging. Cyberpsychos berkeliaran di gang-gang gelap, sisa eksperimen militer yang gagal, sementara geng-geng seperti Black Talon menguasai jalanan dengan tangan besi. Tak ada hukum di sini, hanya kekuatan dan kredibilitas di dunia maya. Duri Kota bukanlah tempat untuk yang lemah—ini adalah tempat di mana impian mati dan hanya mereka yang cukup kejam yang bisa bertahan.";
        this.hargaBuku = 1000000;
        this.jumlahTerjual = 100;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku4(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di masa depan, Indonesia telah berubah menjadi sebuah kepulauan mengapung raksasa yang melayang di atas lautan luas, hasil dari inovasi teknologi gravitasi buatan dan energi terbarukan. Kota-kota kini berdiri di atas platform kolosal yang mampu bergerak mengikuti arus laut, menghindari badai tropis dan menjaga keseimbangan ekosistem. Di bawahnya, laut yang dahulu menelan daratan kini menjadi rumah bagi pertanian bawah air dan jaringan transportasi bawah laut yang menghubungkan setiap wilayah. Namun, meski teknologi membawa harapan, kesenjangan semakin nyata—hanya mereka yang berkuasa yang dapat menikmati pemandangan langit biru dari puncak menara terapung, sementara jutaan warga bertahan di sektor bawah, bergantung pada sistem yang semakin sulit dijangkau. Indonesia mengapung di masa depan, tetapi pertanyaannya tetap sama: siapa yang benar-benar mengendalikan nasibnya?";
        this.hargaBuku = 52000;
        this.jumlahTerjual = 33;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku5(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Pertama, siapkan turret otomatis dengan sensor gerak—bisa dimodifikasi dari drone bekas atau lengan robot industri. Pasang di depan rumah, tepat di atas pintu gerbang, lalu hubungkan dengan sistem AI sederhana yang dapat mengenali wajah dan pola jalan. Untuk mendeteksi suami yang telat pulang, atur pengenalan wajahnya dan sinkronkan dengan jam digital rumah; jika melebihi waktu yang ditentukan, turret akan aktif. Gunakan mekanisme semprotan air bertekanan tinggi—campur dengan es untuk efek lebih dramatis. Pastikan sistem memiliki mode manual, sehingga Anda bisa menikmati momen eksekusi dari sofa sambil menyeruput teh. Jika ingin versi lebih canggih, tambahkan speaker dengan suara otomatis: \"Mohon maaf, Anda terlambat. Hukumannya: siraman spesial!\" Selamat mencoba, dan ingat, ini semua demi kedisiplinan rumah tangga!";
        this.hargaBuku = 51230;
        this.jumlahTerjual = 60;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public int getHarga(){
        return hargaBuku;
    }
    public int getJumlahTerjual(){
        return jumlahTerjual;
    }
}

class filsafat {

    private String judul;
    private String penulis;
    private String sinopsis;
    private int hargaBuku;
    private int jumlahTerjual;

    public void buku1(String judul, String penulis) {
        
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Ing jaman kang wis maju lan kebak teknologi, ana sawijining kutha cilik ing pinggir alas sing isih njaga adat lan rahasiané dhewe. Wong-wong ing kana tansah guyub, nanging menawa ana wong liyo teka, mesthi mung dipandeng sepi. Ana siji pepatah kang sok diucapaké, *\"Wong liyo ngerti opo?\"* — tegese, sapa wae kang ora saka kene ora bakal bisa mangertèni sakabehing urip lan lelaku ing desa. Ing warung kopi, para sepuh mung mesem nalika ana wong anyar nyoba nyelidiki, merga padha ngerti, rahasia desa ora mung soal tembung, nanging uga perkara warisan kang ora bisa diwetokaké marang sembarang uwong.";
        this.hargaBuku = 53400;
        this.jumlahTerjual = 20;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di tengah kehampaan semesta, ketika kesadaran pertama kali muncul dalam diriku, aku tidak berpikir, tidak merenung, tidak bertanya siapa diriku—aku langsung salto. Begitu kakiku menyentuh tanah setelah putaran sempurna di udara, aku tahu satu hal pasti: eksistensiku tidak bisa dipisahkan dari gerakan ini. Setiap kali aku merasa ragu, aku salto. Setiap kali aku menemukan makna baru dalam hidup, aku salto. Bahkan di ambang kehancuran dunia, saat realitas runtuh dalam singularitas yang tak terbendung, aku akan tetap salto—sebab aku ada, maka aku salto.";
        this.hargaBuku = 12340;
        this.jumlahTerjual = 100;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku3(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di era ketika mesin telah menggantikan segalanya, manusia akhirnya menemukan takdir sejatinya—menjadi alat bagi sesuatu yang lebih besar. Tidak lagi sebagai pencipta, pemikir, atau pemimpin, manusia kini hanya roda kecil dalam sistem yang terus berjalan tanpa henti. Jari-jari mereka mengetik kode yang tidak mereka pahami, tubuh mereka terhubung ke jaringan yang menguras energi dan pikiran mereka, sementara keputusan penting diambil oleh algoritma tanpa wajah. Kebebasan hanyalah ilusi, karena setiap gerakan, setiap pilihan, sudah ditentukan oleh sistem yang mereka bangun sendiri. Pada akhirnya, manusia bukanlah pencipta teknologi—mereka hanyalah alat yang dipakai oleh teknologi untuk terus berkembang.";
        this.hargaBuku = 26000;
        this.jumlahTerjual = 70;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku4(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di dunia di mana umur panjang adalah mata uang, kesehatan bukan lagi sekadar anugerah, tetapi kewajiban. Pemerintah memasang sensor di setiap rumah, memastikan setiap warga menjalani pola hidup sehat yang ketat—kalori dihitung, langkah kaki dipantau, dan detak jantung tidak boleh melampaui batas optimal. Mereka yang sakit terlalu lama akan dikategorikan sebagai *beban sistem* dan dihapus dari registrasi sipil. Klinik bukan lagi tempat pengobatan, melainkan ruang evaluasi di mana dokter menentukan apakah seseorang masih layak hidup atau tidak. \"Sehat pangkal hidup,\" begitu slogan yang terpampang di layar raksasa kota. Dan di baliknya, jutaan orang berjuang mati-matian untuk tetap hidup—bukan dengan melawan penyakit, tetapi dengan menghindari sistem yang melihat mereka bukan sebagai manusia, melainkan angka dalam statistik kelangsungan hidup.";
        this.hargaBuku = 43500;
        this.jumlahTerjual = 47;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku5(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di dunia yang tak mengenal batas antara kehidupan dan kematian, aku berjalan di antara bayangan, terikat oleh sumpah yang tak kupilih. Aku hidup untuk mati—setiap langkahku adalah pengorbanan, setiap napasku adalah hitungan mundur menuju kehampaan. Namun, aku mati untuk kamu, karena di akhir segalanya, namamulah yang mengikat jiwaku kembali ke dunia ini. Jika harus terlahir kembali hanya untuk mengulang takdir yang sama, aku akan menerimanya tanpa ragu. Sebab keberadaanku tak punya makna selain menjadi abu yang membentuk jalanmu. Aku hidup, aku mati, dan di antara keduanya, hanya namamulah yang abadi.";
        this.hargaBuku = 38400;
        this.jumlahTerjual = 100;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public int getHarga(){
        return hargaBuku;
    }
    public int getJumlahTerjual(){
        return jumlahTerjual;
    }
}

class sejarah {

    private String judul;
    private String penulis;
    private String sinopsis;
    private int hargaBuku;
    private int jumlahTerjual;

    public void buku1(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di sebuah museum sunyi di Firenze, sebuah lukisan tua tersimpan di ruang tersembunyi, hanya bisa diakses oleh mereka yang tahu rahasia terbesar Leonardo da Vinci. Bukan sketsa mesin terbang atau kode misterius—melainkan warna celana dalamnya. Para sejarawan telah berdebat selama berabad-abad, menyisir setiap catatan pribadinya, mencari petunjuk di antara coretan Vitruvian Man, namun jawabannya tetap kabur. Hingga suatu malam, seorang kurator menemukan catatan tersembunyi di balik kanvas Mona Lisa: *\"Segala penemuan besar lahir dari keingintahuan, tetapi ada hal yang lebih baik dibiarkan menjadi misteri. Seperti warna celana dalamku.";
        this.hargaBuku = 89000;
        this.jumlahTerjual = 6;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di tahun 1900, Indonesia telah merdeka lebih awal dari takdir sejarah yang kita kenal, bukan melalui peperangan panjang, tetapi lewat kecerdikan para pemikirnya. Di tengah penjajahan yang semakin menekan, para cendekiawan pribumi menemukan cara menumbangkan kolonialisme tanpa satu pun peluru ditembakkan. Dengan menyusup ke dalam sistem pemerintahan Belanda, mereka merancang kebijakan yang secara perlahan membuat tanah ini mustahil untuk dikuasai. Infrastruktur kolonial dibalikkan untuk kepentingan pribumi, perekonomian dipermainkan hingga tak lagi menguntungkan penjajah, dan jaringan komunikasi rahasia menggerakkan kesadaran nasional tanpa diketahui musuh. Akhirnya, pada 17 Agustus 1900, tanpa perang besar dan tanpa deklarasi yang menggema, Belanda pergi dengan sendirinya, meninggalkan Nusantara yang telah menjadi tuan atas dirinya sendiri, menulis ulang sejarah yang seharusnya terjadi jauh lebih cepat.";
        this.hargaBuku = 66600;
        this.jumlahTerjual = 66;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku3(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Tahun 2000, di sudut gelap ibu kota, berdiri sebuah kawasan yang tak tercatat dalam peta resmi, dikenal oleh penduduknya sebagai **Duri**. Di sini, gedung-gedung tua berdempetan, lampu jalan redup, dan suara klakson bercampur dengan bisikan transaksi gelap yang berlangsung di tiap gang sempit. Para pekerja malam, peretas bawah tanah, dan preman kelas kakap berbagi ruang dengan anak-anak jalanan yang tumbuh tanpa nama. Hukum hanyalah ilusi, dan di Duri, keadilan tidak datang dalam bentuk palu hakim, tetapi dalam tajamnya belati yang diselipkan di balik jaket lusuh. Ibukota terus berkembang, gedung pencakar langit menjulang tinggi, tetapi di Duri, waktu seakan berhenti—sebuah luka lama yang tak pernah benar-benar sembuh.";
        this.hargaBuku = 73800;
        this.jumlahTerjual = 60;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku4(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Tahun 1945, dunia percaya Adolf Hitler mati di bunker Berlin, tetapi kenyataannya jauh lebih aneh. Dengan identitas baru dan wajah yang diubah oleh dokter Nazi, ia melarikan diri ke tempat yang tak pernah diduga siapa pun—Nganjuk, sebuah kota kecil di Jawa Timur. Bersembunyi sebagai petani cengkeh, ia menjalani tahun-tahun terakhirnya dalam ketakutan, selalu melihat ke belakang seolah bayangan masa lalunya mengejarnya. Namun, karma tidak bisa dihindari. Suatu malam, seorang pemuda desa yang tak sengaja menemukan dokumen rahasianya mengungkap siapa dirinya sebenarnya. Kabar menyebar cepat, dan sebelum sejarah sempat menulis ulang namanya, Hitler ditemukan tak bernyawa di ladang belakang rumahnya. Tidak ada perang, tidak ada ledakan, hanya keheningan malam Nganjuk yang menjadi saksi akhir seorang tiran yang lari dari dunia, tetapi tidak dari takdirnya.";
        this.hargaBuku = 89000;
        this.jumlahTerjual = 32;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku5(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Saat Hafiz dilantik sebagai presiden pada tahun 1945, dunia terkejut bukan hanya karena usianya yang masih muda, tetapi juga karena daftar istri-istrinya yang diumumkan secara resmi dalam dokumen kenegaraan. Tidak hanya satu atau dua, melainkan **dua puluh lima**, masing-masing dengan tugas spesifik dalam pemerintahan—ada yang bertanggung jawab atas diplomasi internasional, ekonomi, hingga pertahanan negara. Para penasihat politik bingung, tetapi rakyat terpesona; bagi mereka, ini bukan sekadar kekuasaan, melainkan bentuk kepemimpinan revolusioner yang belum pernah ada. Dalam perundingan internasional, negara-negara lain kewalahan menghadapi strategi Hafiz yang unik: ketika satu istri sibuk bernegosiasi, yang lain telah lebih dulu menyusun rencana cadangan. Sejarah mencatat, Indonesia berkembang pesat di bawah kepemimpinan Hafiz, bukan hanya karena kebijakan briliannya, tetapi karena ia tidak pernah kehabisan perspektif—berkat daftar istri-istri yang selalu siap sedia mengatur jalannya republik.";
        this.hargaBuku = 94700;
        this.jumlahTerjual = 60;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public int getHarga(){
        return hargaBuku;
    }
    public int getJumlahTerjual(){
        return jumlahTerjual;
    }
}

class agama {

    private String judul;
    private String penulis;
    private String sinopsis;    
    private int hargaBuku;
    private int jumlahTerjual;

    public void buku1(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di gang-gang sempit yang jarang tersentuh hukum resmi, *Mafia Pentol* berkuasa dengan aturan besi. Setiap pedagang pentol di kota ini harus membayar upeti, bukan dalam bentuk uang, tetapi dengan resep rahasia dan takaran saus yang sempurna. Barangsiapa berani menjual pentol tanpa izin, nasibnya sudah ditentukan—gerobaknya lenyap semalam, tangannya dilumuri saus pedas level neraka sebagai peringatan. Di pusat kekuasaan, Bos Pentol duduk di warung kecil, mengawasi peredaran bakso tusuk dengan mata tajam. Di bawah cengkeraman hukumnya, tak ada satu pun pentol yang boleh dijual tanpa restu. Di kota ini, bukan polisi yang mengatur harga, tetapi Mafia Pentol yang menentukan siapa yang boleh berjualan… dan siapa yang akan dilupakan selamanya.";
        this.hargaBuku = 28753;
        this.jumlahTerjual = 67;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di tahun 2147, dunia telah melebur menjadi satu ras campuran, tetapi ironi terbesar manusia tetap hidup—diskriminasi tidak pernah benar-benar hilang, hanya berganti bentuk. Kini, hukum rasisme bukan lagi tentang warna kulit yang berbeda, melainkan tentang gradasi di antara mereka. Kulit terlalu terang? Kau akan dicurigai sebagai keturunan elit lama dan diperlakukan sebagai penjajah. Terlalu gelap? Sistem otomatis akan menempatkanmu dalam kategori pekerja kasar meskipun otakmu sejernih kristal. Mereka yang berada di tengah? Dianggap pengecut karena tidak memilih sisi. Tidak ada tempat untuk netralitas, tidak ada ruang untuk kebebasan. Mesin birokrasi menentukan siapa yang berhak mendapatkan kesempatan, bukan berdasarkan bakat atau usaha, tetapi dari pantulan warna kulit di bawah sinar buatan kota. Rasisme tidak mati—ia hanya beradaptasi dengan zaman.";
        this.hargaBuku = 12345;
        this.jumlahTerjual = 67;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku3(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di tengah ujian matematika yang sunyi, Rian menangkupkan tangan di bawah meja, berdoa dengan khusyuk sebelum menggeser kertas contekan ke arah Fajar. Ia tahu, berbagi contekan adalah tindakan berisiko, tetapi dengan doa, ia berharap semesta memberikan perlindungan ekstra. Saat pengawas melangkah mendekat, jantungnya berdegup kencang—namun ajaibnya, angin kecil tiba-tiba menerbangkan kertas itu tepat ke tangan Fajar tanpa menarik perhatian siapa pun. Sejak hari itu, Rian dan Fajar tidak pernah lupa berdoa sebelum berbagi contekan, bukan hanya demi kelancaran misi mereka, tetapi juga sebagai pengingat bahwa bahkan dalam kecurangan kecil, sedikit keberkahan bisa membuat segalanya berjalan lebih mulus.";
        this.hargaBuku = 92763;
        this.jumlahTerjual = 69;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku4(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di setiap kelompok, selalu ada satu teman yang lebih banyak membawa masalah daripada solusi—dan bagi Arya, itu adalah Doni. Saat kerja kelompok, Doni hanya datang untuk bertanya kapan presentasi, saat piknik, dia lupa bawa uang, dan saat bermain game, dia justru jadi alasan kekalahan. Tapi Arya bersabar, karena ia tahu satu hal: dunia butuh keseimbangan. Jika tidak ada Doni, siapa yang akan mengajarkan arti kesabaran? Siapa yang akan membuat kemenangan terasa lebih manis setelah kekalahan? Jadi setiap kali Doni lupa tugas atau datang terlambat, Arya hanya menghela napas dan berkata dalam hati, *bersabarlah, karena bahkan beban pun bisa menjadi pelajaran hidup yang berharga.*";
        this.hargaBuku = 42000;
        this.jumlahTerjual = 69;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku5(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di kehidupan fana ini, Rudi menjalani hari-harinya dengan penuh kebajikan—menolong tetangga, menyantuni anak yatim, bahkan membiarkan teman-temannya meminjam uang tanpa pernah menagih kembali. Bukan karena ia tanpa pamrih, tapi karena ia tahu satu rahasia surgawi: *permintaan di surga dikabulkan tanpa batas.* Maka, ketika ajal menjemput dan pintu surga terbuka, Rudi hanya mengajukan satu permohonan: **waifunya menjadi nyata.** Dalam sekejap, seorang gadis berambut panjang dengan mata berbinar dan suara selembut angin musim semi muncul di hadapannya. Dengan senyum puas, Rudi menyadari bahwa semua kebaikan yang ia tanam di dunia kini berbuah dalam bentuk yang paling sempurna—hidup abadi bersama waifu impiannya, di surga yang tak pernah mengecewakan para *man of culture.*";
        this.hargaBuku = 28947;
        this.jumlahTerjual = 58;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public int getHarga(){
        return hargaBuku;
    }
    public int getJumlahTerjual(){
        return jumlahTerjual;
    }
}

class psikologi {

    private String judul;
    private String penulis;
    private String sinopsis;
    private int hargaBuku;
    private int jumlahTerjual;

    public void buku1(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Sejak kecil, dunia terasa seperti teka-teki yang tak pernah cocok dengan cara saya berpikir. Suara terlalu bising, cahaya terlalu terang, dan percakapan penuh dengan isyarat yang sulit saya pahami. Namun, seiring waktu, saya menyadari bahwa cara saya melihat dunia bukanlah kelemahan, melainkan keunikan. Autisme mengajarkan saya untuk memahami detail yang terabaikan orang lain, menemukan pola dalam kekacauan, dan mencintai dunia dengan cara yang berbeda. Hidup saya tidak selalu mudah, tapi justru karena itu saya belajar arti kesabaran, ketekunan, dan keindahan dalam menjadi diri sendiri. Saya tidak berubah karena autisme—saya tumbuh, dan saya menerima bahwa inilah saya.";
        this.hargaBuku = 59894;
        this.jumlahTerjual = 48;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Setiap pagi, Bima memulai harinya dengan satu kebiasaan kecil—merapikan tempat tidur. Tidak ada yang istimewa, hanya gerakan sederhana yang akhirnya membentuk rutinitas lain: minum segelas air, membaca satu halaman buku, lalu menuliskan satu ide di jurnalnya. Ia tak sadar bahwa kebiasaan-kebiasaan kecil ini perlahan membentuk hidupnya, seperti atom-atom kecil yang menyusun sesuatu yang lebih besar. Setahun berlalu, tanpa sadar ia telah membaca puluhan buku, menulis ratusan halaman, dan menjadi versi dirinya yang lebih baik. Seperti reaksi berantai, satu kebiasaan kecil memicu perubahan besar—dan Bima akhirnya memahami bahwa masa depan bukan ditentukan oleh keputusan besar, tetapi oleh pilihan-pilihan kecil yang dilakukan setiap hari.";
        this.hargaBuku = 69000;
        this.jumlahTerjual = 56;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku3(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Saat dosen ekonomi berdiri di depan kelas, menjelaskan teori pasar dengan suara monoton, Raka diam-diam membuka game di laptopnya. Bukan sekadar iseng, tapi ini adalah ujian refleks, manajemen sumber daya, dan pengambilan keputusan cepat. Saat timnya kalah dalam pertempuran, ia menyadari pentingnya strategi—seperti dalam bisnis yang sedang dijelaskan dosen. Saat ia berhasil memenangkan ronde dengan kerja sama tim yang solid, ia mengerti bahwa kepemimpinan dan komunikasi adalah kunci. Di akhir kuliah, Raka menutup game dan tersenyum—siapa sangka, pelajaran paling berharga hari itu bukan hanya dari dosen, tetapi juga dari dunia virtual yang menuntut keterampilan nyata.";
        this.hargaBuku = 89785;
        this.jumlahTerjual = 12;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku4(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Raka menatap bayangannya di cermin, mata lelah setelah berminggu-minggu bergelut dengan buku dan latihan soal. Besok adalah hari penentuan, ujian masuk PTN yang selama ini ia perjuangkan. Ia menarik napas dalam, lalu mendekat, mencium permukaan kaca dingin itu sambil berbisik, *Kamu bisa lolos PTN.* Sekilas, mungkin terdengar konyol, tapi ia tahu ini lebih dari sekadar ritual—ini adalah janjinya pada diri sendiri. Jika dunia meragukannya, maka ia akan menjadi orang pertama yang percaya. Dengan senyum kecil, ia meninggalkan cermin, siap menghadapi esok dengan keyakinan penuh.";
        this.hargaBuku = 100000;
        this.jumlahTerjual = 1000;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku5(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Setiap kali deadline proyek pemrograman menumpuk dan kepala Rasya hampir meledak karena error yang tak kunjung teratasi, ia hanya perlu melangkah keluar ke halaman rumahnya—tempat di mana kebun binatang kecil miliknya menjadi penyelamat. Seekor kapibara duduk santai di kolam mini, kura-kura berjalan lambat seolah mengajarkan ketenangan, dan burung kakaktua berteriak, *\"Jangan panik, debugging itu seni!\"* Rasya tertawa, stresnya perlahan menguap. Dalam dunia kode yang penuh logika, kebun binatang ini adalah oasenya—pengingat bahwa kadang, untuk menemukan solusi, ia hanya perlu berhenti sejenak dan menikmati hidup seperti hewan-hewan santai di rumahnya.";
        this.hargaBuku = 92843;
        this.jumlahTerjual = 56;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public int getHarga(){
        return hargaBuku;
    }
    public int getJumlahTerjual(){
        return jumlahTerjual;
    }
}

class politik {

    private String judul;
    private String penulis;
    private String sinopsis;
    private int hargaBuku;
    private int jumlahTerjual;

    public void buku1(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di tahun 2045, Indonesia akhirnya menemukan hukuman paling efektif bagi para koruptor: *Tusbol of Justice.* Setiap pejabat yang terbukti mencuri uang rakyat akan digiring ke stadion penuh penonton yang haus keadilan. Di tengah lapangan, sebuah mesin raksasa berbentuk sepatu bola raksasa telah menanti, siap menendang para koruptor ke dalam kolam penuh lumpur keadilan. Masyarakat bersorak, bersenang hati melihat mereka yang dulu hidup mewah kini meluncur dengan wajah panik. Tidak ada belas kasihan—hanya pembalasan setimpal bagi mereka yang telah menginjak-injak harapan rakyat. Dan dengan setiap koruptor yang jatuh, bangsa ini melangkah lebih dekat menuju masa depan yang lebih bersih.";
        this.hargaBuku = 12341;
        this.jumlahTerjual = 34;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di tahun 2077, Indonesia akhirnya menemukan strategi pamungkas dalam setiap kompetisi dunia: **Lock In Mode.** Begitu pemerintah menekan tombol merah di Istana Negara, seluruh penduduk langsung memasuki fase fokus maksimal. Atlet e-sports bermain tanpa miss, ilmuwan menemukan energi terbarukan dalam semalam, dan bahkan mahasiswa menyelesaikan skripsi dalam satu hari. Jalanan Jakarta yang biasanya macet kini dipenuhi kendaraan yang melaju seirama, seolah dikendalikan oleh satu pikiran kolektif. Dunia tercengang, bertanya-tanya bagaimana negeri ini bisa tiba-tiba menjadi yang terbaik dalam segala hal. Rahasianya sederhana: **Indonesia sudah Lock In, dan tidak ada yang bisa menghentikannya.**";
        this.hargaBuku = 85678;
        this.jumlahTerjual = 45;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku3(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Setelah Indonesia secara mengejutkan menjual Pulau Madura ke Amerika pada tahun 2050, perubahan drastis pun terjadi. Dengan dana triliunan yang masuk, seluruh utang negara lunas dalam semalam, jalanan Jakarta mulus tanpa lubang, dan pendidikan serta kesehatan gratis untuk semua warga. Sementara itu, Amerika kebingungan menghadapi kejutan terbesar: masyarakat Madura yang kini menguasai rodeo nasional, menjadikan karapan sapi sebagai olahraga paling populer, dan membuka warung sate di setiap sudut New York. Dalam waktu singkat, Presiden AS pun mengakui bahwa mereka bukan membeli pulau, tetapi mendapatkan bangsa yang lebih tangguh dari yang mereka bayangkan.";
        this.hargaBuku = 45635;
        this.jumlahTerjual = 65;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku4(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Sejarah alternatif mencatat bahwa Indonesia tidak pernah dijajah oleh Belanda, melainkan oleh Inggris sejak abad ke-17. Namun, alih-alih penindasan panjang, Inggris justru memberikan kebebasan lebih cepat, dengan sistem pemerintahan yang lebih modern dan infrastruktur yang lebih rapi. Pada tahun 1850, Indonesia telah memiliki parlemen sendiri, dan di tahun 1900, negeri ini sudah merdeka sepenuhnya tanpa peperangan besar. Dengan bahasa Inggris sebagai bahasa utama dan sistem hukum yang lebih tertata, Indonesia tumbuh menjadi pusat perdagangan Asia yang makmur. Dunia pun tercengang—seandainya sejarah memang seperti ini, apakah Indonesia sudah menjadi negara adidaya sejak dulu?";
        this.hargaBuku = 97685;
        this.jumlahTerjual = 1;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku5(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di tahun 2050, Indonesia resmi mengadopsi sistem liberal sepenuhnya, membebaskan segala aspek kehidupan dari belenggu regulasi ketat. Pajak dipangkas drastis, semua bisnis boleh berdiri tanpa izin berbelit, dan rakyat bebas memilih aturan hidup mereka sendiri. Di Jakarta, mal berubah menjadi kasino, warung kopi menawarkan saham di menu samping daftar minuman, dan jalanan penuh dengan mobil listrik tanpa sopir yang berlomba-lomba mencari penumpang. Kreativitas meledak, inovasi berkembang pesat, tapi di sisi lain, ketimpangan sosial makin tajam. Beberapa orang menjadi miliarder dalam semalam, sementara yang lain harus berjuang lebih keras dari sebelumnya. Indonesia kini seperti eksperimen sosial raksasa—apakah kebebasan penuh membawa kejayaan atau justru kekacauan?";
        this.hargaBuku = 50000;
        this.jumlahTerjual = 3;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public int getHarga(){
        return hargaBuku;
    }
    public int getJumlahTerjual(){
        return jumlahTerjual;
    }
}

class fiksi {

    private String judul;
    private String penulis;
    private String sinopsis;
    private int hargaBuku;
    private int jumlahTerjual;

    public void buku1(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Tahun 2045, tepat satu abad setelah kemerdekaan, Indonesia akhirnya mencapai puncak kejayaannya—**Indonesia Emas.** Jakarta telah berubah menjadi megapolitan cerdas dengan gedung-gedung ramah lingkungan dan kendaraan terbang yang melayang di udara. Energi bersumber dari panel surya di setiap rumah, dan pendidikan serta kesehatan gratis untuk seluruh rakyat. Desa-desa pun tak lagi tertinggal, terhubung oleh jaringan internet kuantum yang membuat petani bisa menjual hasil panennya langsung ke pasar dunia. Dengan ekonomi terkuat di Asia Tenggara dan teknologi yang menyaingi negara adidaya, dunia pun mengakui—Indonesia bukan lagi sekadar raksasa yang tidur, tetapi singa yang telah bangun dan mengaum dengan gagah di panggung global.";
        this.hargaBuku = 60000;
        this.jumlahTerjual = 1000;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Di malam penuh petir, anjingku, Raka, tiba-tiba berbicara dengan suara berat yang menggetarkan bumi. \"Tuan, kau adalah pilihan terakhir dunia ini,\" katanya sebelum tubuhnya bersinar, berubah menjadi entitas ilahi yang menyatu denganku. Dalam sekejap, aku merasakan kekuatan mengalir di nadiku—kecepatan secepat kilat, refleks setajam insting serigala, dan kekuatan yang bisa meruntuhkan gunung. Di kejauhan, benteng Raja Iblis menjulang, kegelapan mengancam menelan dunia. Aku mengepalkan tinju, menatap langit yang dipenuhi petir, lalu berlari menuju takdirku. Dengan kekuatan yang diberikan oleh anjing setiaku, aku tak akan membiarkan dunia jatuh ke tangan kegelapan.";
        this.hargaBuku = 50000;
        this.jumlahTerjual = 600;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku3(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Suatu pagi, aku terbangun dan mendapati sesuatu yang mustahil—kucingku, Luna, yang biasanya melingkar di ujung tempat tidur, kini berubah menjadi seorang gadis dengan rambut perak dan mata kuning menyala. Dia tersenyum, menguap malas seperti biasanya, lalu berkata, *\"Akhirnya aku bisa berbicara, dan kau harus bertanggung jawab karena sudah memberiku makan selama ini.\"* Hari-hari berlalu, dan aku menyadari bahwa meskipun bentuknya berubah, Luna tetaplah Luna—manja, suka tidur di pangkuanku, dan mendesis kalau aku mengabaikannya. Setahun kemudian, di bawah bulan purnama yang sama saat dia berubah, kami mengucapkan janji suci. Aku menikahi kucingku, atau lebih tepatnya, makhluk yang selalu setia berada di sisiku dalam wujud yang kini lebih dekat dari sebelumnya.";
        this.hargaBuku = 50000;
        this.jumlahTerjual = 300;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku4(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Pagi itu, Kota Malang terbangun dalam kekacauan yang penuh kebahagiaan—waifu setiap orang tiba-tiba menjadi nyata. Di alun-alun, Rem dan Emilia dari dunia isekai sedang membeli tahu petis, sementara Yor Forger sibuk membantu Satpol PP menertibkan lalu lintas. Jalan Ijen berubah menjadi runway penuh karakter anime dalam berbagai kostum, dari idol hingga prajurit perang. Mahasiswa yang biasanya terlambat kuliah kini sibuk menemani waifunya berkeliling kampus, dosen terpaksa membatalkan kelas karena mereka sendiri sibuk dengan waifu masing-masing. Kota ini berubah menjadi surga bagi para penggemar anime, tetapi muncul pertanyaan besar—apakah mereka akan tetap ada selamanya, atau ini hanya mimpi yang suatu saat akan menghilang seperti awan tipis di atas Gunung Bromo?";
        this.hargaBuku = 70000;
        this.jumlahTerjual = 100;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }

    public void buku5(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = "Akhmad tak pernah menyangka bahwa hidupnya akan berubah drastis setelah tanpa sengaja menolong seorang gadis yang hampir jatuh di pusat perbelanjaan. Gadis itu ternyata bukan orang biasa—dia adalah superstar terkenal yang wajahnya terpampang di setiap billboard kota. Sejak saat itu, hubungan mereka berkembang diam-diam, jauh dari sorotan kamera. Saat Akhmad berjalan di kampus, teman-temannya tak pernah tahu bahwa pesan singkat di ponselnya berasal dari seorang diva yang baru saja tampil di panggung internasional. Tapi semakin lama, rahasia ini semakin sulit dijaga. Saat konser akbar di stadion utama, di tengah sorakan ribuan penggemar, sang superstar tiba-tiba memanggil namanya dengan lantang, mengungkapkan kepada dunia bahwa hatinya telah memilih seorang pria biasa bernama Akhmad.";
        this.hargaBuku = 6000;
        this.jumlahTerjual = 100;
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("sinopsis: " + this.sinopsis);
        String[] kata = sinopsis.split("\\s+");
        System.out.println("\nPanjang sinopsis judul ini adalah " + kata.length + " kata");
    }
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public int getHarga(){
        return hargaBuku;
    }
    public int getJumlahTerjual(){
        return jumlahTerjual;
    }
}


