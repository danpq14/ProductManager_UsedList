public class Product {
    private String name;
    private int ID;
    private int price;

    public Product(String name, int ID, int price){
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm : " +name+" , Mã sản phẩm : "+ID+" , Giá sản phẩm : "+price;
    }
}
