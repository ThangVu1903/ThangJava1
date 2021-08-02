package pasokon;

import java.util.Scanner;

public class pasokon_tesuto {
    public static void main(String[] args) {
        int area, primeter, surroundingArea, volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai : ");
        int length = scanner.nextInt();
        System.out.println("nhập chiều rộng : ");
        int width = scanner.nextInt();
        System.out.println("nhap chieu cao : ");
        int height = scanner.nextInt();
        // bài 1 :
        area = areaRectangle(length,width);
        System.out.println("dien tich hình chữ nhật là : " + area);
        primeter = primeterRectangle(length,width);
        System.out.println("chu vi hình chữ nhật là : " + primeter );

        // bài 2 :
        surroundingArea = surroundingAreaRectangular(length,width,height);
        System.out.println("diện tích xung quanh hình chữ nhật là : " + surroundingArea);
        volume = volumeRectangular(length,width,height);
        System.out.println("thể tích hình chữ nhật là : " + volume);

    }

    public static int areaRectangle(int length,int width) {
        return length * width ;
    }

    public static int primeterRectangle(int length , int width) {
        return (length+width)*2;
    }
    public static int surroundingAreaRectangular(int length, int width, int height){
        return 2*height*(length+width);
    }
    public static int volumeRectangular( int length, int width, int height){
        return height*length*width;
    }
}