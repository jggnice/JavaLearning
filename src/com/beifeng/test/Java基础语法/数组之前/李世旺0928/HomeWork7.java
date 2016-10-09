import java.util.Scanner;

public class HomeWork7
{
	public static void main(String[] args) {
		System.out.println("请输入存款数：");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		if(nextInt >= 5000000)
		System.out.println("我可以买凯迪拉克");
		else if(nextInt >= 1000000)
		System.out.println("我可以买帕萨特");	
		else if(nextInt >= 500000)
		System.out.println("我可以买伊兰特");
		else if(nextInt >= 100000)
		System.out.println("我可以买奥拓");	
		else
		System.out.println("我可以买捷安特");	
		scanner.close();
	}
}