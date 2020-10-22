public class MaindeepCopy {
    public static void main(String[] args) {
        MaindeepCopy abibogeng = new MaindeepCopy();

    }

    public void MaindeepCopy_produkCategories() {
        Produk Produk = new Produk("9282726", "300000", "Baju", "50%");
        Categories Baju = new Categories("7292", "gamis");
        Categories MaindeepCopy = (Categories) SerializationUtils.clone(Baju);

        Categories Baju1 = new Categories(
                Baju.getCodeBarang(), Baju.getJenisBarang());
        Produk Baju2 = new Produk(
                Produk.getCodeBarang(), Produk.getHargaBarang(), Produk.getJenisBarang(), Produk.getDiskon());
        Baju1.setCodeBarang("7292");
        Baju2.setJenisBarang("gamis");

        System.out.println(Baju);
        System.out.println(MaindeepCopy);
        System.out.println(Baju1);
        System.out.println(Baju2);
    }
}
