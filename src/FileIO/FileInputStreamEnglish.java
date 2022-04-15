package FileIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEnglish {
    public static void main(String[] args) throws IOException {
        String Path = "/Users/lgh12/Study/Java/basic" + File.separator + "temp";

        // 입력 파일 생성
        File inFile = new File(Path + File.separator + "test.txt");

        // InputStream 객체 생성
        InputStream is = new FileInputStream(inFile);

        // 매개변수를 포함하지 않는 read 메서드를 이용한 데이터 읽기 및 출력 방법
        int data;
        while((data = is.read()) != -1) {
            System.out.println("읽은 데이터: " + (char)data + " 남은 바이트 수 : " + is.available());
        }

        System.out.println();
        System.out.println();

        // byte[] 배열을 매개변수로 포함하고 있는 read 메서드를 이용한 데이터 읽기 및 출력 방법

        InputStream is2 = new FileInputStream(inFile);

        byte[] byteArray = new byte[9];
        int count;
        while((count = is2.read(byteArray)) != -1) {
            for (int i = 0; i < count; i++) {
                System.out.print((char)byteArray[i]);
            }

            System.out.println(" : count = " + count);
        }
        is2.close();

        System.out.println();
        System.out.println();

        // offset과 길이 정보를 지니고 있는 read(byte[] b, int off, int len); 메서드의 활용법
        InputStream is3 = new FileInputStream(inFile);

        int offset = 3;
        int length = 6;
        byte[] byteArray2 = new byte[9];    // offset + length
        int count2 = is3.read(byteArray2, offset, length);   // offset : 3, length : 6
        for(int i = 0; i < offset + count2; i++)
            System.out.print((char) byteArray2[i]);         // ___FileIn

        // InputStream 자원 반납
        is3.close();
    }
}
