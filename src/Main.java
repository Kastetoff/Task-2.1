public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{23, 28, 35, 15, 0, 6, 13, 38, 15, 41});

        System.out.println("Максимальное значение = " + salesManager.max());
        System.out.println("Минимальное значение = " + salesManager.min());
        System.out.println("Среднее значение (обрезанное) = " + salesManager.avg());
    }
}