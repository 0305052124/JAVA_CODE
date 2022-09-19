package user;
import book.BookList;
import operations.IOperation;

//抽象类
public abstract class User {
    protected String name;
    public User(String name){
        this.name=name;
    }
    //使用者都有选择菜单
    public abstract int menu();

    protected IOperation[] iOperations;//接口数组
    public void doOperation(int choice, BookList bookList){
        iOperations[choice].work(bookList);
    }
}