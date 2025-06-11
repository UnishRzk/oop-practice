package lab;

/**
 * @author Unish Rajak
 */

public class PhoneNumberFilterDemo {
    public static void main(String[] args) {
        String[] phonelist = {
                "9841555555", "97719849333333",
                "+977-9818777777", "+9771-9803000000"
        };

        System.out.println("Last 10-digit phone numbers:");
        for (String phone : phonelist) {
            phone = phone.replaceAll("[^0-9]", "");
            if (phone.length() > 10) {
                phone = phone.substring(phone.length() - 10);
            }
            System.out.println(phone);
        }
    }
}

