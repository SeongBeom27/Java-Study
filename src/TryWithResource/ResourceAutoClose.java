package TryWithResource;

class A implements AutoCloseable {
    String resource;

    // constructor
    A(String resource) {
        this.resource = resource;
    }

    @Override
    public void close() throws Exception {
        if(resource != null) {
            resource = null;
            System.out.println("리소스가 해제됐습니다.");
        }
    }
}

public class ResourceAutoClose {
    public static void main(String args[]) {
        // 수동 해제
        A a1 = null;
        try {
            a1 = new A("특정 파일");
        } catch (Exception e) {
            System.out.println("예외 처리");
        } finally{
            if(a1 != null) {
                try {
                    a1.close();
                } catch ( Exception e){

                }
            }
        }


        // 자동 해제
        try (A a2 = new A("특정 파일2");) {
        } catch(Exception e) {
            System.out.println("예외 처리");
        }
    }
}
