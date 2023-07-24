public class immutable {
    public static void main(String[] args) {
        String name = "Arima"; // IN heap memory name is poiting towards "Arima".
        name = "Light"; // Now a new Object is created in string pool and name is now pointing "Light"
                        // and "Arima" will get removed by garbage collection.
        System.out.println(name);
    }
}
