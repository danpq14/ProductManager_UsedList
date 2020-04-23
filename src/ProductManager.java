import java.util.ArrayList;

public class ProductManager {
    private final int DEFAULT_CAPACITY = 10;
    protected ArrayList productArray = new ArrayList(DEFAULT_CAPACITY);


    public ProductManager() {
    }

    public void addProduct(String name, int ID, int price) {
        Product newProduct = new Product(name, ID, price);
        productArray.add(newProduct);
    }

    public void changeProductbyID(int ID, String newName,int newPrice ) {
        boolean changed = false;
        for (int i = 0; i < productArray.size(); i++) {
            Product changeProduct = (Product) productArray.get(i);
            if (changeProduct.getID() == ID) {
                changeProduct.setName(newName);
                changeProduct.setPrice(newPrice);
                productArray.set(i, changeProduct);
                changed = true;
                break;
            }
        }
        if (! changed) {
            System.out.println("Ko tìm thấy ID");
        }
    }

    public void removeProductbyID(int ID) {
        boolean search = false;
        for (int i = 0; i < productArray.size(); i++) {
            Product changeProduct = (Product) productArray.get(i);
            if (changeProduct.getID() == ID) {
                productArray.remove(i);
                search = true;
                break;
            }
        }
        if (! search) {
            System.out.println("Ko tìm thấy ID");
        }
    }

    public void showProductbyID(int ID) {
        boolean search = false;
        for (int i = 0; i < productArray.size(); i++) {
            Product changeProduct = (Product) productArray.get(i);
            if (changeProduct.getID() == ID) {
                System.out.println(changeProduct.toString());
                search = true;
                break;
            }
        }
        if (!search) {
            System.out.println("Ko tìm thấy ID");
        }
    }

    public void showAllProduct(){
        boolean search = false;
        for (int i = 0; i < productArray.size(); i++) {
            Product show = (Product) productArray.get(i) ;
            System.out.println(show.toString());
            search = true;
        }
        if (! search) {
            System.out.println("Ko tìm thấy ID");
        }
    }
}
