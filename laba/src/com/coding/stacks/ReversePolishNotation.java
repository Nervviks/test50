package com.coding.stacks;
import java.util.Deque;
import java.util.LinkedList;
public class ReversePolishNotation {

	 public static Integer evaluate(String s) {
		    Integer result = null;
		    Deque<Integer> stack = new LinkedList<>();

		    if (s != null && s.length() > 0) { // якщо вираз не = 0 і довжина виразу більша за 0
		      Integer num = null;	// номер =0

		      for (char c : s.toCharArray()) { // фор ичом гортаєм по черзи символи

		        if (c == ' ') { // якщо є пропуск
		          if (num != null) {// і якщо номер не = 0
		            stack.push(num); // то ставимо його в стеку на 1 місце
		            num = null;// і обнуляєм
		          }
		        } else if (isDigit(c)) { //провіряєм чи це число 
		          int digit = c - '0';  //переводи число з чар до инта

		          if (num == null) { //якщо номер не = 0
		            num = digit;	// то номеру присвоюєм число
		          } else {	//в іншому випадку
		            num = num * 10 + digit;// номер множем на 10 і додаєм число
		          }
		        } else {// якщо с не число 
		          Integer num1 = stack.pop();// то з стеку берем 1 елемент и удаляем його
		          Integer num2 = stack.pop();// то з стеку берем 1 елемент и удаляем його


		          if (c == '+') {	//якщо с = +
		            stack.push(num1 + num2);//то номер1 + номер2 і добавляєм в елемен в масив
		          } else if (c == '-') {//якщо с = -
		            stack.push(num1 - num2);//то номер1 - номер2 і добавляєм в елемен в масив
		          } else if (c == '*') {//якщо с = *
		            stack.push(num1 * num2);//то номер1 * номер2 і добавляєм в елемен в масив
		          } else if (c == '/') {//якщо с = /
		            stack.push(num1 / num2);//то номер1 / номер2 і добавляєм в елемен в масив
		          }
		        }
		      }
		      result = stack.pop();// дістаєм результат
		    }
		    return result; //вертаєм результат
		  }

		  private static boolean isDigit(char c) { // провірка чи символ є числом
		    int digit = c - '0';
		    return 0 <= digit && digit <= 9;
		}
}
