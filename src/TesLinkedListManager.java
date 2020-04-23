public class TesLinkedListManager {
    public static void main(String[] args) {
        LinkedListManager manager = new LinkedListManager();
        manager.addProduct("IPhone 8", 100111, 10000);
        manager.addProduct("IPhone 8 Plus", 100112, 15000);
        manager.addProduct("IPhone 7", 100113, 20000);
        manager.addProduct("IPhone 6", 100114, 17000);
        manager.addProduct("IPhone 6 Plus", 100115, 12000);
        manager.addProduct("IPhone X", 100116, 25000);

        manager.showAllProduct();
        manager.removeProductbyID(100111);
        System.out.println("--------------------------");
        manager.showAllProduct();
        System.out.println("--------------------------");
        manager.changeProductbyID(100113,"Iphone 7", 16000);
        manager.showProductbyID(100113);
    }
}
