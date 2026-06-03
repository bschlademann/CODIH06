package _1;

public class Main {
    private int x;

    static void main() {

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
}
