package pasokon;

import java.util.Scanner;

public class solve_the_equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ nhất : ");
        int a = scanner.nextInt();
        System.out.println("nhập số thứ 2: ");
        int b = scanner.nextInt();
        System.out.println("nhâp số thứ 3 : ");
        int c = scanner.nextInt();
        if (a==0){
            if(b==0){
                System.out.println("phương trình vô nghiệm ");
            }
            else{
                if(c==0)
                    System.out.println("phương trình có vô số nghiệm");
                else {
                    float x3=(float) (-c/b);
                    System.out.println("nghiệm của phương trình là X= " + x3);
                };
            };
        }
        else {
            float delta = b*b-4*a*c;
            if (delta<0){
                System.out.println("phương trình vô nghiệm");
            }
            else{
                if (delta==0){
                    float x = -b/(2*a);
                    System.out.println("nghiệm kép của phương trình là x1=x2=: " + x);
                }
                else {
                    float x1=(float) ((-b + Math.sqrt(delta))/(2*a));
                    float x2=(float) ((-b - Math.sqrt(delta))/(2*a));
                    System.out.println("nghiệm thứ nhất là x1=: "+ x1 + "\nnghiệm thứ 2 là x2=: " + x2);
                };
            };


        };
    }
}
