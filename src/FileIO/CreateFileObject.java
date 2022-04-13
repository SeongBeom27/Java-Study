package FileIO;
import java.io.File;
import java.io.IOException;

public class CreateFileObject {
    public static void main(String args[]) throws IOException {
        String Path = "/Users/lgh12/Study/Java/basic" + File.separator + "temp";

        // 폴더 생성
        File tempDir = new File(Path);
        if(!tempDir.exists()) {
            tempDir.mkdir();
        }
        System.out.println(tempDir.exists());

        // 파일 생성
        File newFile = new File(Path + File.separator + "test.txt");
        if(!newFile.exists()) {
            newFile.createNewFile();
        }
        System.out.println(newFile.exists());
    }
}
