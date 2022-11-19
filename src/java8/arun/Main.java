package java8.arun;
import java8.announcoment.Announcoment;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Car;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Announcoment announcoment = new Announcoment("Super info", "img", 10, "for news");
        Announcoment announcoment2 = new Announcoment("for work", "img", 5, "for work!");

        Laptop laptop2 = new Laptop("MacBook", "❤️", 900, "new", "Mac OC");
        Laptop laptop3 = new Laptop("MacBook", "❤️", 900, "new", "Mac OC");


        Phone phone = new Phone("Samsung Galaxy A50", "📱", 800, "new phone", "Made in  USA", 64);
        Phone phone1 = new Phone("Iphone 11 pro ", "📱", 1.200, "new phone", "Made in California", 256);


        Home home = new Home("Ihlas", "🏠", 2000.23, "for leving", "floor", 4);
        Home home1 = new Home("Peaksoft", "🚒", 2232.23, "for teaching", "just home", 6);

        Car car = new Car("Lexus", "🏎", 25000, "for driver", "white", LocalDate.of(2023, 11, 1));
        Car car1 = new Car("BMW", "🏎", 30000, "for driver", "black", LocalDate.of(2020, 10, 5));


        Announcoment[]announcements= new Announcoment[]{laptop2, laptop3, phone, phone1, home1, home, announcoment, announcoment2, car, car1};
        method(announcements);
        magaz();
        aplata();
        latarei();
        priz();


    }
    public static  void method(Announcoment[]announcoments) {
        int[] price = new int[announcoments.length];
        int index = 0;
        for (Announcoment announcomentb : announcoments) {
            price[index] = (int) announcomentb.getPrice();
            index++;
        }
        Arrays.sort(price);
        for (int i = 0; i < announcoments.length; i++) {
            for (int j = 0; j < announcoments.length; j++) {
                if (announcoments[j].getPrice() == price[i])
                    System.out.println(announcoments[j].getName() + " " + announcoments[j].getPrice());
            }
        }
    }
    public static void magaz(){

        System.out.println("что вы хотите купит");
        Scanner scanner =new Scanner(System.in);
        String s= scanner.next();
        switch (s){
            case "telefon":
                System.out.println("эсть токо " +
                        "Samsung Galaxy A50 сума 800.0");
                System.out.println("вы хотите купит");
                String s3= scanner.next();
                if (s3=="нет"){
                 break;
                }
                break;
            case "macboock":
                System.out.println("эсть 4 macboock 900.0");
                System.out.println("вы хотите купит");
                String s2= scanner.next();
                if (s2=="нет"){
                    break;
                }
                break;
            case "mashyny":
                System.out.println("Lexus 25000.0" +
                        "BMW 30000.0");
                System.out.println("вы хотите купит");
                String s1= scanner.next();
                if (s1=="нет"){
                    break;
                }
                break;
            default:
                System.out.println("таких таварав нету " +
                        "или прадана");
        }
      }
      public static void aplata(){
          System.out.println("аплптите тавар");
          Scanner scanner = new Scanner(System.in);
          int a= scanner.nextInt();
          if (a==800){
              System.out.println("аплата завиршына");
              System.out.println("забирайти тавар Samsung Galaxy A50");
          }else if (a==900){
              System.out.println("аплата завиршына");
              System.out.println("забирайти свой тавар macboock");
          } else if (a==2500) {
              System.out.println("аплата завиршына");
              System.out.println("забирайти свой тавар Lexus");
          }else if (a==30000){
              System.out.println("аплата завиршына");
              System.out.println("забирайти свой тавар BMW");
          }else
          {
              System.out.println("нехватаит денег");
          }


      }
      public static void latarei(){
          System.out.println("хатите поиграт латарею стоит один билет 100");
          System.out.println("возмите мешке рандомне число");
          Random random=new Random();
          int a= random.nextInt(1,20);

          int a1= random.nextInt(1,20);
          int a2= random.nextInt(1,20);
          int a3= random.nextInt(1,20);
          System.out.println(a);
          System.out.println("ваш номер");
          System.out.println(a1);
          System.out.println(a2);
          System.out.println(a3);
          if (a==a1||a==a2||a==a3){
              System.out.println("сиз уттуз");
              System.out.println("можите приходть за машынай завтра");
          }else {
              System.out.println("следуший раз повизеть");
          }





      }
      public static void priz(){
          System.out.println("вы выгрвли машыну " +
                  "сена машыны 40000 BMW");
          System.out.println("пожалыста покашыте пасторт мы зделаем регистратцию");
          Scanner scanner =new Scanner(System.in);
          String a= scanner.next();
          System.out.print("видите имя фамилия:"+a);
          String a1= scanner.next();
          System.out.println("витите номер паспорта:"+a1);
          System.out.println("вы успешна зделали регестратсию на машыну тепер ана ваша");




      }
    }

