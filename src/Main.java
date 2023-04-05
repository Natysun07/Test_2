public class Main {
    public static void main(String[] args) {

        int sumAccount = 300;
        int payment = 1500;
        int sub = payment - 1000;
        int bonus;

        if (payment > 1000){bonus = sub / 100;} else {bonus = 0;}
        int sum = sumAccount + payment + bonus;
        System.out.println("Ваш боус равен: " + bonus);
        System.out.println("Итоговая сумма счёта составляет: " + sum);
    }
}