package advanced.ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
        // HttpServlet servlet; 은 가능 // = new HttpServlet(); 은 불가능

        method(new LoginServlet());
        method(new FileDownloadService());
    }

    public static void method(HttpServlet servlet){ // 매개변수의 다형성
        servlet.service(); // 동적바인딩
    }
}
