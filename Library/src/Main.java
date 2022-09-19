import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;
import java.util.Scanner;

public class Main {
    //登入
    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner=new Scanner(System.in);
        String userName=scanner.nextLine();

        System.out.println("请输入你的身份：1-管理员，0-普通用户");
        int choice= scanner.nextInt();
        if(choice==1){
            return new AdminUser(userName);
        }else{
            return new NormalUser(userName);
        }

    }
    public static void main(String[] args) {
        //1、准备数据
        BookList bookList=new BookList();
        //2、登录，
        User user= login();//向上转型

        while(true){
            int choice =  user.menu();//多态，动态绑定
            user.doOperation(choice,bookList);
        }
    }
}