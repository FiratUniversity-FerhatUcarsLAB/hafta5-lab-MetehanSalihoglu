/*
 * Ad Soyad: Metehan Salihoğlu
 * Ogrenci No: 250542025
 * Tarih: 13 Kasım 2025
 * Aciklama: Görev 2 - Fizik Formül Asistanı
 */

import java.util.Scanner;

public class FizikFormul {
    final static double GRAVITY = 9.8;

    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    public static double calculateAcceleration(double velocityChange, double time) {
        return velocityChange / time;
    }

    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    public static double calculatePower(double work, double time) {
        return work / time;
    }

    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height;
    }

    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===");

        System.out.print("\nTEMEL OLCUMLER:\nKutle (kg): ");
        double mass = input.nextDouble();
        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();
        System.out.print("Zaman (s): ");
        double time = input.nextDouble();
        System.out.print("Hiz degisimi (m/s): ");
        double velocityChange = input.nextDouble();
        System.out.print("Yukseklik (m): ");
        double height = input.nextDouble();

        double velocity = calculateVelocity(distance, time);
        double acceleration = calculateAcceleration(velocityChange, time);
        double force = calculateForce(mass, acceleration);
        double work = calculateWork(force, distance);
        double power = calculatePower(work, time);
        double kineticEnergy = calculateKineticEnergy(mass, velocity);
        double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height);
        double totalEnergy = kineticEnergy + potentialEnergy;
        double momentum = calculateMomentum(mass, velocity);

        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve IS:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n", power);

        System.out.println("\nENERJI:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        System.out.printf("  Toplam Enerji             : %.2f J\n", totalEnergy);

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("========================================");
    }
}
