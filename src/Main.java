public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int refill = 2000;

        int bonusPrice = 100;
        int bonus = (refill > 1000) ? refill / bonusPrice : 0;
        int finalBalance = startBalance + refill + bonus;

        System.out.println("Баланс на счете - " + finalBalance + " руб.");
        System.out.println("Бонусы - " + bonus + ("  руб."));
    }
}
