public class Main {

    public static void main(String[] args) {
        int Balance = 1300;
        int replenishment = 8000;

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        int finalBalance = Balance + replenishment + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус:" + bonus);
    }
}