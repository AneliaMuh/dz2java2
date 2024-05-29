public class Main {
    public static void main(String[] args) {
        int startingAmount = 100;// начальный счет
        int replenishmentAmount = 1800; // сумма пополнения

        int bonus;
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Баланс на счету: " + (startingAmount + replenishmentAmount ));
        System.out.println("Количество бонусных рублей: " + bonus );
        System.out.println("Итоговый счет: " + (startingAmount + replenishmentAmount + bonus));

    }
}