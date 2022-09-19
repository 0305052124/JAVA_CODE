package user;
import operations.*;
import java.util.Scanner;
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.iOperations=new IOperation[]{
                new ExitOperation(),
                new SearchOperation(),
                new BorrowedOperation(),
                new ReturnOperation(),
                new DisplayOperation()
        };
    }
    public int menu(){
        System.out.println("*********************************");
        System.out.println( "hello !   "+name+"欢迎登入图书管理系统!");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("*********************************");

        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}