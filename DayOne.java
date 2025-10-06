package Java_Practice_DSA;

import java.util.Scanner;

public class DayOne {
   public DayOne() {
   }

   public static void PrintHallowRect(int var0) {
      for(int var1 = 0; var1 <= var0; ++var1) {
         for(int var2 = 0; var2 <= var0; ++var2) {
            if (var1 != 1 && var1 != var0 && var2 != 1 && var2 != var0) {
               System.out.print("  ");
            } else {
               System.out.print("* ");
            }
         }

         System.out.println();
      }

   }

   public static void PrintSolid(int var0) {
      for(int var1 = 0; var1 < var0; ++var1) {
         for(int var2 = 0; var2 < var0; ++var2) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      PrintHallowRect(var2);
   }
}

