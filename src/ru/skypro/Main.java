package ru.skypro;
import java.util.Arrays;
import java.util.Random;
        public class Main {

            // ������� 1
            public static void main(String[] args) {
                Random rand = new Random();
                int[] arr = new int[30];
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(100_000) + 100_000;
                    sum += arr[i];
                }
                {
                    System.out.println("����� ���� �� ����� ��������� " + sum + " ������");
                    System.out.println();
                }
                // ������� 2

                int min = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(100_000) + 100_000;
                    if (min > arr[i]) {
                        min = arr[i];
                }}
                    {
                       System.out.println("����������� ����� ���� �� ���� ��������� " + min + " ������");
                       System.out.println();
                    }
                int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(100_000) + 100_000;
                    if (max <arr[i]) {
                        max = arr[i];
                    }
                }
                {
                    System.out.println("������������ ����� ���� �� ���� ��������� " + max + " ������");
                    System.out.println();
                }
                // ������� 3
                double average = 0;
                for (int i=0; i<arr.length; i++){
                    average += arr[i]/arr.length;
                }
                    System.out.println("������� ����� ���� �� ����� ��������� " + average + " ������");
                    System.out.println();
                // ������� 4
                char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int i = reverseFullName.length-1; i >=0; i--)
                    System.out.print(reverseFullName[i]);
                    System.out.println();

                }
           }

