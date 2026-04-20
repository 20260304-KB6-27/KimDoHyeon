package basic.lecture.exam01;

/*
* 인터페이스
* 1. 기본적으로 추상메소드와 상수필드만 가질 수 있는 클래스의 변형체
*   => 필드 작성시 묵시적으로 public static final
*   => 메소드 작성시 묵시적으로 public abstract
* 2. 클래스에서 인터페이스 구현시 implements 키워드 사용
* */
public interface Behavior {

    // 일반 필드는 불가능.
//    private int num;

    // 상수 필드는 가능.
    /*public static final*/ int OPENING_TIME = 9;
    /*public static final*/ int CLOSING_TIME = 18;

//    일반 메소드 불가능.
//    public void basicMethod(){}

    // 추상 메소드 가능.
    public abstract void eat();
    /*public abstract*/ void live(); // 생략도 가능.

//    void die();
    // default 메소드로 구현부가 정의되어 있는 메소드 정의 가능 - 구현 클래스에서 선택적으로 오버라이딩 가능
    // 기본값이 있는 것이기 때문에 override 하지 않아도 에러가 나지 않는 것.(선택적 재정의 가능.)
    default void die() {
        System.out.println("우리는 언젠가 죽게 되어있습니다.");
    }

    // static 메소드로 공통 메소드 정의 가능.(오버라이딩 필요 없는 메소드)
    // - 구현 클래스에서 오버라이딩 불가능!
    //
    static void born() {
        System.out.println("우리는 모두 엄마 뱃속에서 태어납니다.");
    }
}
