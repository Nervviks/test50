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
//UserNumber-����� �����
//DrobNumber-������� ������� �����
//Precision-������� �� ��� ����� ��������� � 2 �������
//WholePart-���� �������
//
//Masive-����� � ��������� Precision
//i=0
//
//Precision2=Precision+1