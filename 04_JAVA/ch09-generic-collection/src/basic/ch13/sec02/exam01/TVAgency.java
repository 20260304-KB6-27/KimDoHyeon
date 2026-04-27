package basic.ch13.sec02.exam01;

public class TVAgency implements Rentable<TV> {

    @Override
    public TV rent() {
        System.out.println("티비 객체 생성");
        return new TV();
    }
}
