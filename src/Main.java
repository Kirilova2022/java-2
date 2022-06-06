public class Main {
    public static void main(String[] args) {
        int score =100;
        int addAccount =1100;
        int bounce;

        if (addAccount > 1000) {
            bounce = addAccount / 100;
        }
        else {
            bounce = 0;
        }

        int balance = score + addAccount + bounce;
        System.out.println("Здравствуйте, Ваш баланс пополнен. Сумма вашего баланса: " + balance + " руб. Бонус: " + bounce + " руб.");
    }
}