public class Produk {
    public String CodeBarang;
    public String HargaBarang;
    public String JenisBarang;
    public String Diskon;

    public Produk(String codeBarang, String hargaBarang, String jenisBarang, String diskon) {
        CodeBarang = codeBarang;
        HargaBarang = hargaBarang;
        JenisBarang = jenisBarang;
        Diskon = diskon;
    }

    public String getCodeBarang() {
        return CodeBarang; }

    public void setCodeBarang(String codeBarang) {
        CodeBarang = codeBarang;
    }

    public String getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        HargaBarang = hargaBarang;
    }
    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }

    public String getDiskon() {
        return Diskon;
    }

    public void setDiskon(String diskon) {
        Diskon = diskon;
    }
}