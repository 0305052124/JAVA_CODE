package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowedOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书!");
        System.out.println("请输入你要借阅的图书的名字：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

        int currentSize=bookList.getUsedSize();
        //历遍书架上的每一本书
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getPos(i);
            if(name.equals(book.getName())){
                book.setBorrowed(true);//设置为借出状态
                System.out.println("借阅成功！");
                return;
            }
        }
    }
}
