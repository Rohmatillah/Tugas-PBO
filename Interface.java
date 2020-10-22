public class Interface {
    public static void main(String[] args){
        Interface main = new Interface();
        main.testeCase();
    }

    public void testeCase(){
        Produk produk = new Produk("12322", "300000", "Baju", "30%");
        Categories baju = new Categories("12322", "gamis");
        Categories jualan = new Categories("827265", "gamis");

        System.out.println(jualan);
        System.out.println(baju);
    }
}

