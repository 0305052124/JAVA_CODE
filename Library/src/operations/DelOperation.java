package operations;
import book.Book;
import book.BookList;
import java.util.Scanner;
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("删除图书!");
        System.out.println("请输入你要删除的图书的名字：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

        int index=-1;//是否有书的标志
        //遍历数组，看是否有你要删除的图书的下标
        int currentSize=bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getPos(i);
            if(name.equals(book.getName())){
                index=i;
                break;
            }
        }

        //没有要删除的书
        if(index==-1){
            System.out.println("没有你要删除的这本书！");
            return;
        }
        //有这本书，后一项覆盖前一项
        for (int i = index; i <currentSize-1 ; i++) {
            //找到要删除的书的后一本
            Book book=bookList.getPos(i+1);
            //把这本书放到前一个位置上
            bookList.setBooks(book,i);
        }

        //把数组最后一项指向null
        bookList.setBooks(null,currentSize-1);
        //书架上书的数量 -1
        bookList.setUsedSize(currentSize-1);

        System.out.println("删除成功！");
    }
}
