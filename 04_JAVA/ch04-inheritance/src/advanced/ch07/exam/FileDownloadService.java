package advanced.ch07.exam;

public class FileDownloadService extends HttpServlet{
    // 파일 다운로드 기능
//    public void fileDownLoadService(){
//        System.out.println("파일 다운로드합니다.");
//    }

    @Override
    public void service() {
        System.out.println("파일 다운로드합니다.");
    }
}
