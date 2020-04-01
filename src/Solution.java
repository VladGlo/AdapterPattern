import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("Ukraine", "UA");
        countries.put("Russia", "RU");
        countries.put("Canada", "CA");
    }

    public static void main(String[] args) {
        Customer customer = new CustomerImpl("JavaRush Ltd.", "Ukraine");
        Contact contact = new ContactImpl("Ivanov, Ivan", "+38(050)123-45-67");

        IncomeData incomeData = new IncomeDataAdapter(customer, contact);
        System.out.println(incomeData.getCountryCode());
        System.out.println(incomeData.getCompany());
        System.out.println(incomeData.getContactFirstName());
        System.out.println(incomeData.getContactLastName());
        System.out.println(incomeData.getCountryPhoneCode());
        System.out.println(incomeData.getPhoneNumber());
    }

    public interface IncomeData {
        String getCountryCode(); //For example: UA
        String getCompany(); //For example: JavaRush Ltd.
        String getContactFirstName(); //For example: Ivan
        String getContactLastName(); //For example: Ivanov
        int getCountryPhoneCode(); //For example: 38
        int getPhoneNumber(); //For example: 501234567
    }

    public interface Customer {
        String getCompanyName(); //For example: JavaRush Ltd.
        String getCountryName(); //For example: Ukraine
    }

    public interface Contact {
        String getName(); //For example: Ivanov, Ivan
        String getPhoneNumber(); //For example: +38(050)123-45-67

    }
}
