package _1;

public class Assignment1 {
    private int x;
    private int y;

    static void main() {

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void a(int x) {
//        C1 -> 2 test cases:
//        (x > 0) -> true/false
        if (x > 0) {
//            C0 -> 1 test case: a(int x > 0)
            setX(x);
        }
    }

    public void b(int x, int y) {
        if (x > 0 && y > 0) {
            setX(1);
        } else {
            setX(0);
        }
    }

    public void c(int x) {
        setX(x);
    }
}
