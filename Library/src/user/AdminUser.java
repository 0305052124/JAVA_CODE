package user;
import operations.*;
import java.util.Scanner;
public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
        //接口数组
        this.iOperations=new IOperation[]{
                new ExitOperation(),
                new SearchOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }
    public int menu(){
        System.out.println("*********************************");
        System.out.println( "hello !   "+name+"欢迎登入图书管理系统!");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("*********************************");
        System.out.println("请输入你的操作：");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}