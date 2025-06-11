package lab;

/**
 * @author Unish Rajak
 */

public class CountryFilterDemo {
    public static void main(String[] args) {
        String[] countries = {
                "India", "Australia", "America", "Nepal",
                "Albania", "Angola", "Argentina", "Aruba",
                "Austria", "Algeria"
        };

        System.out.println("Countries starting and ending with 'a':");
        for (String country : countries) {
            if (country.toLowerCase().startsWith("a") && country.toLowerCase().endsWith("a")) {
                System.out.println(country);
            }
        }
    }
}

