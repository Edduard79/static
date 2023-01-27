public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        Employee emp1 = new Employee("Federico","Rossi","Via Bella45");
        Employee emp2 = new Employee("Marzia","Random", "Piazza della vittoria 54");

        Badge badge1 = new Badge(emp1);
        Badge badge2 = new Badge(emp2);

        badge1.showBadgeDetails();
        System.out.println("====================================");
        badge2.showBadgeDetails();


    }
}
