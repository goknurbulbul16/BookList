public class Book {
    private String bookName;
    private int numberPage;
    private String writerName;
    private int date;

    public Book(String bookName, int numberPage, String writerName, int date) {
        this.bookName = bookName;
        this.numberPage = numberPage;
        this.writerName = writerName;
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


}
