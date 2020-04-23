import java.util.Collections;
import java.util.LinkedList;

public class LinkedListManager {
    private final int DEFAULT_CAPACITY = 10;
    protected LinkedList linkedListProduct = new LinkedList();


    public LinkedListManager() {
    }

    public void addProduct(String name, int ID, int price) {
        Product newProduct = new Product(name, ID, price);
        linkedListProduct.add(newProduct);
    }

    public void changeProductbyID(int ID, String newName,int newPrice ) {
        boolean changed = false;
        for (int i = 0; i < linkedListProduct.size(); i++) {
            Product changeProduct = (Product) linkedListProduct.get(i);
            if (changeProduct.getID() == ID) {
                changeProduct.setName(newName);
                changeProduct.setPrice(newPrice);
                linkedListProduct.set(i, changeProduct);
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
        for (int i = 0; i < linkedListProduct.size(); i++) {
            Product changeProduct = (Product) linkedListProduct.get(i);
            if (changeProduct.getID() == ID) {
                linkedListProduct.remove(i);
                search = true;
                break;
            }
        }
        if (!search) {
            System.out.println("Ko tìm thấy ID");
        }
    }

    public void showProductbyID(int ID) {
        boolean search = false;
        for (int i = 0; i < linkedListProduct.size(); i++) {
            Product changeProduct = (Product) linkedListProduct.get(i);
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
        for (int i = 0; i < linkedListProduct.size(); i++) {
            Product show = (Product) linkedListProduct.get(i) ;
            System.out.println(show.toString());
            search = true;
        }
        if (! search) {
            System.out.println("Ko tìm thấy ID");
        }
    }
}
