package basic.lecture.exam01;

public class Worker extends Person implements Behavior{ // + name, age
    // 추가적인 필드
    String companyName;
    String position;

    // 먹고, 생활하는
    @Override
    public void eat() {
        System.out.println("구내식당에서 점심을 먹습니다.");
    }

    // 기본적으로 this임. 본인, 상속, 인터페이스에서 찾음.
    @Override
    public void live() {
        System.out.println(/*Behavior.*/OPENING_TIME+"시부터 "+/*Behavior.*/this.CLOSING_TIME+"시까지 근무합니다.");
    }

    @Override
    public void die() {
        System.out.println("일을 제대로 안 하면 대표님이 죽일 거 같아요.");
    }
}
