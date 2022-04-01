package InnerInterface;

class Button {
    OnClickListner ocl;
    void setOnClickListener(OnClickListner ocl) {
        this.ocl = ocl;
    }

    interface OnClickListner {
        public abstract void onClick();
    }

    void click() {
        ocl.onClick();
    }
}

public class ButtonApi1 {
    public static void main(String[] args) {
        Button button1 = new Button();
        button1.setOnClickListener(new Button.OnClickListner() {
            @Override
            public void onClick() {
                System.out.println("개발자 1. 음악 재생");
            }
        });
        button1.click();
    }
}
