import java.util.Scanner;

class A {
    int a, b;

    void setA(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println(a + " " + b);
    }
}

class B extends A {
    int c;

    B(int x, int y, int z) {
        super.setA(x, y);
        c = z;
    }

    void display() {
        System.out.println(super.a + " " + super.b + " " + c);
    }
}

public class Oops1 {
    public static void main(String args[]) {
        int p, q;
        Scanner scn = new Scanner(System.in);
        p = scn.nextInt();
        q = scn.nextInt();
        A a1 = new A();
        a1.setA(p, q);
        a1.display();

        int l = scn.nextInt();
        int m = scn.nextInt();
        int n = scn.nextInt();
        B b1 = new B(l, m, n);

        b1.display();
        scn.close();

    }
}
