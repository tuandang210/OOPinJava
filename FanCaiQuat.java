public class FanCaiQuat {
    final int Slow = 1, Medium = 2, Fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    FanCaiQuat() {
        this.speed = Slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        switch (speed){
            case 1:
                this.speed=Slow;
            case 2:
                this.speed=Medium;
            case 3:
                this.speed=Fast;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return ("Tốc độ quạt: " + speed + "; " + "màu: "
                    + color + "; " + "bán kính quat: " + radius);
        } else {
            return ("Fan is off");
        }
    }

    public static void main(String[] args) {
        FanCaiQuat fan1= new FanCaiQuat();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        FanCaiQuat fan2= new FanCaiQuat();
        fan2.setSpeed(3);
        fan2.setRadius(10);
        fan2.setColor("yellow");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
