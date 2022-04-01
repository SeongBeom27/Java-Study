package InnerInterface;

public class ButtonApi2 {
    public static void main(String[] args) {
        Button button1 = new Button();
        button1.setOnClickListener(new Button.OnClickListner() {
            @Override
            public void onClick() {
                System.out.println("개발자 2. 네이버 접속");
            }
        });
        button1.click();
    }
}
