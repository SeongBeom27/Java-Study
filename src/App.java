// option + shift + o -> 파일 전체에서 import 할 클래스를 모두 찾아서 자동 import
// 
import java.util.Arrays;
import package2.*;
import InnerClass.*;

public class App {
    public void printArr(int[] a) {
		System.out.println(Arrays.toString(a));
	}

    public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        
        LocalInnerClass.test();

        // int[] a = new int[]{1,2,3};
        // printArray(a);
        // colabo oColabo = new colabo();
        // oColabo.print();
    }
}
 