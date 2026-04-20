package basic.ch04.sec11.exam02;

import java.util.Scanner;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        // Vehicle 구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        /*
        * 사용자에게 메뉴 제시
        * 운전할 차를 선택하세요. 1) Taxi 2) Bus
        * 운전자의 선택에 따라 실제 운전
        * */
        System.out.println("운전할 차를 선택하세요. 1)Taxi 2)Bus 3)Truck");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        if( scanner.nextInt() == 1 ) {
//            driver.drive( taxi );
//        }else if ( scanner.nextInt() == 2 ) {
//            driver.drive( bus );
//        }

        Vehicle cars[] = {
                new Taxi(),
                new Bus(),
                new Truck()
        };
        cars[num-1].run();
    }
}
