import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        var firstName = "Ivan";
        var middleName = "Ivanov";
        var lastName = "Ivanovich";
        var fullName = middleName + " " + firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}
