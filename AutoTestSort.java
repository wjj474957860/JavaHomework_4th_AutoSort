//自动测试排序算法类
//完成测试与排序的工作

//作者：吴建杰
//学号：20102100035

import spy.MySort.Bubble_Sort;    //导入MySort中Bubble_Sort;
import spy.MySort.Insert_Sort;    //导入MySort中Insert_Sort;
import spy.MySort.Select_Sort;    //导入MySort中Select_Sort;

import java.util.Scanner;    //导入扫描器

class AutoTestSort{
    //主函数入口
	public static void main(String agrs[]){
		
		int [] number = new int[10];
		AutoTestSort ats = new AutoTestSort();
		Bubble_Sort bubble = new Bubble_Sort();
		Insert_Sort insert = new Insert_Sort();
		Select_Sort select = new Select_Sort();
		
		while(true){
			System.out.println("=============================================================");
			ats.input(number);      //输入10个整数 
			Scanner scan = new Scanner(System.in);
			System.out.print("请选择排序算法的序号:1.Bubble  2.Insert  3.Select :  ");
			int choice = scan.nextInt();
			switch(choice){
				case 1:
					bubble.sort(number);
					System.out.println("\n10个整数排序后:\n" + bubble.toString(number));
					break;
				case 2:
					insert.sort(number);
					System.out.println("\n10个整数排序后:\n" + insert.toString(number));
					break;
				case 3:
					select.sort(number);
					System.out.println("\n10个整数排序后:\n" + select.toString(number));
					break;
					
			}
		}
	}
	
	//处理输入的10个整数
	public void input(int number[]){
		System.out.println("请输入10个待排序的整数:");
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i < 10;i++){
			number[i] = scan.nextInt();
		}
	
	}
}