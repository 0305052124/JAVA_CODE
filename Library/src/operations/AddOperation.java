package operations;
import book.Book;
import book.BookList;
import java.util.Scanner;
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书！");
        System.out.println("请输入你要添加的图书的名字：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

        System.out.println("请输入你要添加的图书的作者：");
        String author=scanner.nextLine();

        System.out.println("请输入你要添加的图书的价格：");
        int price=scanner.nextInt();
        scanner.nextLine();//读取回车

        System.out.println("请输入你要添加的图书的类型：");
        String type=scanner.nextLine();
        //通过构造方法，实例化一本书
        Book book=new Book(name,author,price,type);

        //currentSize当前书架上书的数量
        int currentSize=bookList.getUsedSize();

        //把书放到下标为currentSize的位置处
        bookList.setBooks(book,currentSize);
        //书的数量加1
        bookList.setUsedSize(currentSize+1);

        System.out.println("添加成功！");
    }
}
