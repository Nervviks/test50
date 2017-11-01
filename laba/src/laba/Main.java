package laba;

import java.util.Scanner;

import com.coding.stacks.ReversePolishNotation;

public class Main {

	public static void main(String[] args) {
		ReversePolishNotation rpn=new ReversePolishNotation();
		Scanner sc=new Scanner(System.in);
		rpn.evaluate(sc.nextLine());
	}

}
//UserNumber-число юзера
//DrobNumber-дробова частина числа
//Precision-точність до якої треба перевести в 2 систему
//WholePart-ціла частина
//
//Masive-масив з величиною Precision
//i=0
//
//Precision2=Precision+1