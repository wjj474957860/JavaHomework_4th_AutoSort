//�Զ����������㷨��
//��ɲ���������Ĺ���

//���ߣ��⽨��
//ѧ�ţ�20102100035

import spy.MySort.Bubble_Sort;    //����MySort��Bubble_Sort;
import spy.MySort.Insert_Sort;    //����MySort��Insert_Sort;
import spy.MySort.Select_Sort;    //����MySort��Select_Sort;

import java.util.Scanner;    //����ɨ����

class AutoTestSort{
    //���������
	public static void main(String agrs[]){
		
		int [] number = new int[10];
		AutoTestSort ats = new AutoTestSort();
		Bubble_Sort bubble = new Bubble_Sort();
		Insert_Sort insert = new Insert_Sort();
		Select_Sort select = new Select_Sort();
		
		while(true){
			System.out.println("=============================================================");
			ats.input(number);      //����10������ 
			Scanner scan = new Scanner(System.in);
			System.out.print("��ѡ�������㷨�����:1.Bubble  2.Insert  3.Select :  ");
			int choice = scan.nextInt();
			switch(choice){
				case 1:
					bubble.sort(number);
					System.out.println("\n10�����������:\n" + bubble.toString(number));
					break;
				case 2:
					insert.sort(number);
					System.out.println("\n10�����������:\n" + insert.toString(number));
					break;
				case 3:
					select.sort(number);
					System.out.println("\n10�����������:\n" + select.toString(number));
					break;
					
			}
		}
	}
	
	//���������10������
	public void input(int number[]){
		System.out.println("������10�������������:");
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i < 10;i++){
			number[i] = scan.nextInt();
		}
	
	}
}