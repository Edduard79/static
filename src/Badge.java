import java.util.Random;

public class Badge {

    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees = ++totalNumberOfEmployees;
    }

    private String generateBadgeIdCode() {
        int length = 3;
        final int start = 'A';
        final int end = 'Z';
        final Random random = new Random();
        final String generated = random.ints(start, end + 1).filter(i -> Character.isLetter(i) || Character.isDigit(i)).limit(length).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        return generated + this.employee.name + this.employee.surname + generated;
    }

    public void showBadgeDetails(){
        System.out.println("Total number tracked by badges: " + totalNumberOfEmployees);
        System.out.println(this.employee.getEmployeeDetails());
        System.out.println("Badge ID code: " + this.badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = this.generateBadgeIdCode();
    }





}
