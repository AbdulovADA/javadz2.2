public class Main {
    public static void main(String[] args) {
        int originAccount = 200;
        int deposit = 900;
        int account = originAccount + deposit;
        int bonus1 = 100;
        int bonus = 0;
        if (deposit > 1000) ;
        {
            bonus = deposit / bonus1;
        }
        int finalAccount = originAccount + deposit + bonus;

        System.out.println("Ваш баланс:" + finalAccount);
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}
