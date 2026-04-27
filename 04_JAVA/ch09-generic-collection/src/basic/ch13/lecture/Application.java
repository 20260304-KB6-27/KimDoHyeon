package basic.ch13.lecture;

public class Application {
    public static void main(String[] args) {
        // 요청이 들어온 상태
        // 서비스로직
        User user = new User("kim",20);
        System.out.println(user);
        
        // controller
        APIResponse<User> response = APIResponse.ok(user);
        APIResponse<String> response2 = APIResponse.ok("문자열 응답데이터");

        System.out.println(response); // api 요청시 응답받는 객체
        System.out.println(response2); // api 요청시 응답받는 객체
    }

//    @GetMapping("/user/1")
//    public APIResponse<User> getUser() {
//        User user = new User("kim", 20);
//
//        return APIResponse.ok(user);
//    }
}
