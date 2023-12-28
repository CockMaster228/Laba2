import java.util.Scanner;
import java.util.regex.*;
import java.io.*;

public class laba2 {
  static public void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите пароль: ");
    String s = in.nextLine(); // Метод, отвечающий за ввод пароля
    String[] passw = s.split(",");
    for (String i: passw)
      passchecker(i); // Вызов метода проверки пароля
    }
    public static void passchecker(String s) { // Метод проверки пароля
      String str = s.trim(); // Метод, которая убирает пробелы в начале и конце пароля
      String p = "(?=.+[0-9])(?=.+[a-z])(?=.+[A-Z])[\\w]{8,}"; // Cтрока, являющаяся шаблоном для пароля
      System.out.println((str.matches(p)) ? "Пароль подходит" : "Пароль не подходит");
      }
    }