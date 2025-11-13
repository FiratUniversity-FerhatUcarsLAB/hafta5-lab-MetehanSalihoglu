/*
 * Ad Soyad: Metehan Salihoğlu
 * Ogrenci No: 250542025
 * Tarih: 13 Kasım 2025
 * Aciklama: Görev 1 - Geometrik Şekil Hesaplayıcı
 */

import java.util.Scanner;

public class GeometriHesap {
    
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");

        System.out.print("\nKARE:\nKenar uzunlugu (cm): ");
        double side = input.nextDouble();

        System.out.print("\nDIKDORTGEN:\nKisa kenar (cm): ");
        double shortSide = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double longSide = input.nextDouble();

        System.out.print("\nDAIRE:\nYaricap (cm): ");
        double radius = input.nextDouble();

        System.out.print("\nUCGEN:\nTaban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double a = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double b = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double c = input.nextDouble();

        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.2f cm):\n", side);
        System.out.printf("  Alan      : %.2f cm²\n", calculateSquareArea(side));
        System.out.printf("  Cevre     : %.2f cm\n", calculateSquarePerimeter(side));

        System.out.printf("\nDIKDORTGEN (%.2f x %.2f cm):\n", shortSide, longSide);
        System.out.printf("  Alan      : %.2f cm²\n", calculateRectangleArea(shortSide, longSide));
        System.out.printf("  Cevre     : %.2f cm\n", calculateRectanglePerimeter(shortSide, longSide));

        System.out.printf("\nDAIRE (yaricap: %.2f cm):\n", radius);
        System.out.printf("  Alan      : %.2f cm²\n", calculateCircleArea(radius));
        System.out.printf("  Cevre     : %.2f cm\n", calculateCircleCircumference(radius));

        System.out.printf("\nUCGEN (taban: %.2f, yukseklik: %.2f cm):\n", base, height);
        System.out.printf("  Alan      : %.2f cm²\n", calculateTriangleArea(base, height));
        System.out.printf("  Cevre     : %.2f cm\n", calculateTrianglePerimeter(a, b, c));

        System.out.println("========================================");
    }
}
