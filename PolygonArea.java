import java.util.Scanner;
//import java.util.Math;

//doesnt account for non-numeric types yet

class RegPoly {
    int n;
    double l;
    
    RegPoly(int n, double l) {
        this.n = n;
        this.l = l;
    }
    double area() {
        return (n*l*l)/(4*Math.tan(Math.PI/n));
    }
    boolean isValid() {
        return n>0 && l>0;
    }
}

public class PolygonArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double l = s.nextDouble();

        RegPoly r = new RegPoly(n, l);

        if(r.isValid()) {
            System.out.println("area: " + r.area());
        } else {
            System.out.println("invalid polygon");
        }
    }
}
