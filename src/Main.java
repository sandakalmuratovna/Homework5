public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    }

    public static void task1(){
        System.out.println("Task 1.");
        char clientOS = 1;
        if(clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if(clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2(){
        System.out.println("Task 2.");
        char clientOS = 1;
        int clientDeviceYear = 2013;
        if(clientOS==1){
            if(clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }else if(clientOS==0){
            if(clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    public static void task3(){
        System.out.println("Task 3.");
        int year = 2100;
        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println("год является високосным");
        }else{
            System.out.println("год не является високосным");
        }

    }

    public static void task4(){
        System.out.println("Task 4.");
        int deliveryDistance = 95;
        if(deliveryDistance<20){
            System.out.println("Потребуется дней 1");
        } else if(deliveryDistance>=20 && deliveryDistance<60){
            System.out.println("Потребуется дней 2");
        } else if(deliveryDistance>=60 && deliveryDistance<100){
            System.out.println("Потребуется дней 3");
        } else{
            System.out.println("There is no delivery.");
        }
    }

    public static void task5(){
        System.out.println("Task 5.");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:System.out.println("Winter"); break;
            case 2:System.out.println("Winter"); break;
            case 3:System.out.println("Spring"); break;
            case 4:System.out.println("Spring"); break;
            case 5:System.out.println("Spring"); break;
            case 6:System.out.println("Summer"); break;
            case 7:System.out.println("Summer"); break;
            case 8:System.out.println("Summer"); break;
            case 9:System.out.println("Autumn"); break;
            case 10:System.out.println("Autumn"); break;
            case 11:System.out.println("Autumn"); break;
            case 12:System.out.println("Winter"); break;
            default: System.out.println("Something is getting wrong...");
        }
    }
}