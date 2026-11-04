package week6;

import java.util.Scanner;

public class Task2AssistantSelection21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is student active? (yes/no): ");
        boolean active = sc.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Is student under academic sanction? (yes/no): ");
        boolean sanction = sc.nextLine().trim().equalsIgnoreCase("yes");

        // Level 1: Check active status and sanction
        if (active && !sanction) {
            System.out.print("Enter Basic Programming grade: ");
            double grade = sc.nextDouble();

            System.out.print("Does student have a programming competency certificate? (true/false): ");
            boolean hasCertificate = sc.nextBoolean();

            // Level 2: Check academic qualification
            if (grade >= 80 || hasCertificate) {
                System.out.print("Enter interview score: ");
                double interviewScore = sc.nextDouble();

                // Level 3: Check interview score
                if (interviewScore >= 75) {
                    System.out.println("Accepted as a Lab Assistant!");
                } else {
                    System.out.println("Failed! Interview score is below 75.");
                }

            } else {
                System.out.println("Failed! Basic Programming grade is below 80 and no certificate provided.");
            }

        } else {
            if (!active) {
                System.out.println("Failed! Student status is not active.");
            } else {
                System.out.println("Failed! Student is currently under academic sanction.");
            }
        }

        sc.close();
    }
}