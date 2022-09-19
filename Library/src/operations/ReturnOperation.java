package operations;
import book.Book;
import book.BookList;
import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("归还图书!");
        System.out.println("请输入你要归还的图书的名字：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        //历遍数组，找书
        int currentSize=bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getPos(i);
            if(name.equals(book.getName())){
                book.setBorrowed(false);//设置为：未被借出状态
                System.out.println("归还图书成功！");
                return;
            }
        }
        System.out.println("没有你要归还的书！");
    }
}