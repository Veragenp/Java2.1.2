public class Main {
    public static void main(String[] args) {

        int start_balance = 100;
        int refill = 2000;

        int bonus_price = 100;
        int bonus = (refill > 1000) ? refill / bonus_price : 0;
        int final_balance = start_balance + refill + bonus;

        System.out.println("Баланс на счете - " + final_balance + " руб.");
        System.out.println("Бонусы - " + bonus + ("  руб."));
    }
}
