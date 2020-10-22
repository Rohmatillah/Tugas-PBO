public class Categories {
    public String CodeBarang;
    public String JenisBarang;

    public Categories(String codeBarang, String jenisBarang) {
        CodeBarang = codeBarang;
        JenisBarang = jenisBarang;
    }

    public String getCodeBarang() {
        return CodeBarang;
    }

    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setCodeBarang(String codeBarang) {
        CodeBarang = codeBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }
}