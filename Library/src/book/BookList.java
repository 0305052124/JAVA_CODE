package book;
public class BookList {
    public Book[] books = new Book[10];
    private int usedSize;
    //通过构造方法初始化三本书
    public BookList(){
        books[0] = new Book("三国演义","罗贯中",100,"小说");
        books[1] = new Book("西游记","吴承恩",200,"小说");
        books[2] = new Book("红楼梦","曹雪芹",300,"小说");
        this.usedSize = 3 ;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    //通过下标 获取书
    public Book getPos(int pos){
        return books[pos];
    }
    //存书的位置
    public void setBooks(Book book,int pos){
        books[pos]=book;
    }
}
