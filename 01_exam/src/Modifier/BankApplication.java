package Modifier;

import java.util.Scanner;

public class BankApplication {
	
	private static Account1[] accountArr = new Account1[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		int selectNo = 0;
		
		while(run)
		{
			System.out.println("-----------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("-----------------------------");
			System.out.println("선택 > ");
			selectNo = sc.nextInt();
			
			if(selectNo == 1)
				createAccount();
			
			else if(selectNo == 2)
				accountList();
			
			else if(selectNo == 3)
				deposit();
			
			else if(selectNo == 4)
				withdraw();
			
			else if(selectNo == 5)
				run = false;
					
			else	System.out.println("번호를 다시 입력해주십시오.");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	private static void createAccount()
	{
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
		System.out.println("계좌주 : ");
		String name = sc.next();
		
		System.out.println("초기입금금액 : ");
		int balance = sc.nextInt();
		
		for(int i = 0; i< accountArr.length; i++) {
			if(accountArr[i] == null)
			{	
				accountArr[i] = new Account1(ano, name, balance);	
				break;
			}
		}
		
		System.out.println("계좌가 생성되었습니다.");
	}
	
	private static void accountList()
	{
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for(int i = 0; i < accountArr.length; i++)
		{
			if(accountArr[i] != null)
			{
				System.out.println(accountArr[i].getAno() + "    " + accountArr[i].getOwner() + "    " +  accountArr[i].getBalance());
			}
			else{	break;	}
		}
	}
	
	private static void deposit()
	{
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
		System.out.println("예금액 : ");
		int balance = sc.nextInt();
		
		if(findAccount(ano) == null)
		{
			System.out.println("잘못된 계좌번호입니다.");
		}
		else
		{
			findAccount(ano).setBalance(findAccount(ano).getBalance() +balance);
			System.out.println("예금이 성공되었습니다.");
		}
	}
	
	private static void withdraw()
	{
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
		System.out.println("출금액 : ");
		int balance = sc.nextInt();
		
		if(findAccount(ano) == null)
		{
			System.out.println("잘못된 계좌번호입니다.");
		}
		
		else
		{
			if(findAccount(ano).getBalance() < balance)
			{
				System.out.println("잔액이 부족합니다.");
			}
			
			else
			{
				findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
				System.out.println("출금이 성공되었습니다.");
			}
		}
		
	}
	
	private static Account1 findAccount(String ano)
	{
		for(int i = 0; i< accountArr.length; i++)
		{
			if(accountArr[i] != null)
			{
				if(accountArr[i].getAno().equals(ano))
				{
					return accountArr[i];
				}				
			}
		}
		return null;
	}
}
