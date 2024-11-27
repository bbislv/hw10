import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //task 2
        System.out.println("task 2");

        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperCaseFullName);

        //task 3
        System.out.println("task 3");

        fullName = "Иванов Семён Семёнович";
        String replacedFullName = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника - " + replacedFullName);
    }
}

