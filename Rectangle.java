

public class Rectangle {
    int height;
    int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public int area() {
        return this.height * this.width;
    }

    public int chuVi() {
        return 2 * (this.width + this.height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle);

        Rectangle hinhChuNhat = new Rectangle(20, 10);
        System.out.println("Chiều dài là: " + hinhChuNhat.height);

        System.out.println("Chu vi là: " + hinhChuNhat.chuVi());
        System.out.println("Diện tích là: " + hinhChuNhat.area());
    }
}
