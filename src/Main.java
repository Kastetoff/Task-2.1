public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{23, 28, 35, 15, 0, 6, 13, 38, 15, 41});

        System.out.println("Максимальное значение = " + salesManager.max());
    }
}
