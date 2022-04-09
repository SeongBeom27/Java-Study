package ThreadEx;

class SMFileThread extends Thread {
    @Override
    public void run() {
        // 자막 번호 하나 ~ 다섯
        String[] strArray = {"하나","둘","셋","넷","다섯"};
        try {Thread.sleep(10);} catch(InterruptedException e) {}

        // 자막 번호 출력
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(" - (자막 번호) " + strArray[i]);
            try {Thread.sleep(200);} catch (InterruptedException e){}
        }
    }
}   

class VideoFileThread extends Thread {
    @Override
    public void run() {
        // 비디오 프레임 번호 1 ~ 5
        int[] intArray = {1,2,3,4,5};
    
        // 비디오 프레임 번호 출력
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("(SM 비디오 프레임) " + intArray[i]);
            try {Thread.sleep(200);} catch(InterruptedException e){}
        }
    }
}

class JYPFileRunnable implements Runnable {
    @Override
    public void run() {
        // 자막 번호 하나 ~ 다섯
        String[] strArray = {"하나","둘","셋","넷","다섯"};
        try {Thread.sleep(10);} catch(InterruptedException e) {}

        // 자막 번호 출력
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(" - (자막 번호) " + strArray[i]);
            try {Thread.sleep(200);} catch (InterruptedException e){}
        }
    }
}

class VideoFileRunnable implements Runnable {
    @Override
    public void run() {
        // 비디오 프레임 번호 1 ~ 5
        int[] intArray = {1,2,3,4,5};
    
        // 비디오 프레임 번호 출력
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("(JYP 비디오 프레임) " + intArray[i]);
            try {Thread.sleep(200);} catch(InterruptedException e){}
        }
    }
}

public class CreateAndStartThread {
    public static void main(String[] args) {
        
        // // 방법 1 : Thread 클래스를 상속받아 run() 메서드를 오버라이딩
        // Thread smiFileThread = new SMFileThread();
        // smiFileThread.start();

        // Thread videoFileThread = new VideoFileThread();
        // videoFileThread.start();

        // 방법 2 : ## Runnable 인터페이스 구현 객체를 생성한 후 Thread 생성자로 Runnable 객체 전달
        Runnable jypFileRunnable = new JYPFileRunnable();
        
        Thread thread1 = new Thread(jypFileRunnable);
        thread1.start();

        Runnable videoFileRunnable = new VideoFileRunnable();

        Thread thread2 = new Thread(videoFileRunnable);
        thread2.start();
    }
}
