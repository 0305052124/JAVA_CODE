package operations;
import book.Book;
import book.BookList;
import java.util.Scanner;
public class SearchOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书！");
        System.out.println("请输入你要查找的图书的名字：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        //找书
        int currentSize=bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getPos(i);
            if(name.equals(book.getName())){
                System.out.println("找到"+name+"了");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}