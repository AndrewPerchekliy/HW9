public class Warehouse {

    public <T> void handlingOfProduct(T product){
        System.out.println("На склад поступил новый товар:\n" + product);
    }

    public void seasonOfReceiptProduct(Month month){
        if (month.compareTo(Month.FEBRUARY) < 1) {
            System.out.println("Товар пришел зимой");
        } else if (month.compareTo(Month.MAY) < 1) {
            System.out.println("Товар пришел весной");
        } else if (month.compareTo(Month.AUGUST) < 1){
            System.out.println("Товар пришел летом");
        } else if (month.compareTo(Month.NOVEMBER) < 1) {
            System.out.println("Товар пришел осенью");
        } else{
            System.out.println("Товар пришел зимой ");
        }
    }
}