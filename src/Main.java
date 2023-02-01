public class Main {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age=20;
        if (age >= 18) {
            System.out.println("Если возрат человека равен " + age + ", он совршеннолетний");
        } else {
            System.out.println("Если возрат человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int OutsideTemperature = 5;
        if (OutsideTemperature>=5){
        System.out.println("Сегодня тепло, можно идти без шапки");
    }
        else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }}
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed <= 60) {
            System.out.println("Если скорость равна " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость равна " + speed + ", то придется заплатить штраф");
    }}
    public static void task4() {
        System.out.println("Задача 4");
        int age = 18;
        if ( age>=2 && age<=6 ) {
            System.out.println("Если возрат человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age>=7 && age<18){
            System.out.println("Если возрат человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age>=18&&age<24){
            System.out.println("Если возрат человека равен " + age + ", то его место в университете.");
        }
        if (age>= 24){
            System.out.println("Если возрат человека равен " + age + ", то ему пора ходить на работу.");
        }}
    public static void task5() {
        System.out.println("Задача 5");
        int age = 18;
        if (  age<=5 ) {
            System.out.println("Если возрат ребенка равен " + age + ", то он не может кататься на аттракционе.");
        }
        if (age>5 && age<=14){
            System.out.println("Если возрат ребенка равен " + age + ", то он модет кататься на аттракционе только в сопровждении взрослого.");
        }
        if (age>14){
            System.out.println("Если возрат ребенка равен " + age + ", то он может кататься на аттракционе без сопровождения взрослого.");
        }}

    public static void task6() {
        System.out.println("Задача 6");
        int NumberOfPersons = 102;
        if (NumberOfPersons<60){
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        else if (NumberOfPersons>=60 &&NumberOfPersons<102) {
            System.out.println("В вагоне есть только стоячие места");
        }else {
            System.out.println("Вагон полон");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
       int one=4;
       int two=7;
       int three=1;
       if (one >two && one >three) {
           System.out.println("Число " + one + " болшее из трех чисел");
       }
       if (two > one && two > three){
               System.out.println("Число " +two+ " болшее из трех чисел");
           }
       if (three > one && three > two){
           System.out.println("Число " +three+ " болшее из трех чисел");
       }
    }



}