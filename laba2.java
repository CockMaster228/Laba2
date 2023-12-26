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