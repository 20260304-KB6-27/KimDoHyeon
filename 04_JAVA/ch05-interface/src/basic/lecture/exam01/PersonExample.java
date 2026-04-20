package basic.lecture.exam01;

public class PersonExample {
    public static void main(String[] args) {
        // 행동할 수 있는 사람.
        // 인터페이스를 타입으로는 쓸 수 있음.
        Behavior behaviorPerson; // = new Behavior();

        // 부모인 인터페이스에 자식을 받으면 인스턴스 생성 가능.
        // 업캐스팅이라서 형변환 자동으로 해줌. (Behavior)
        behaviorPerson = /*(Behavior)*/ new Student();
        behaviorPerson.eat();
        behaviorPerson.live();
        behaviorPerson.die();

        behaviorPerson = new Worker(); // 교체

        behaviorPerson.eat();
        behaviorPerson.live();
        behaviorPerson.die();

        // static이라서 상수 필드 접근하듯이 해야함.
        Behavior.born();
    }
}
