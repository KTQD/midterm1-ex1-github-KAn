public class Book extends Item {
    String author;
    int numberOfPages;
    String genre;
    public Book(String name, String description,String ID,String author, int numberOfPages,String genre){
        super(name,description,ID);
        this.author=author;
        this.numberOfPages=numberOfPages;
        this.genre=genre;
    }
    @Override
    void showInfo() {
        System.out.printf("name: %s description: %s Id:%s \n author:%s number of pages:%d genre:%s",
                this.name,this.getDescription(),this.ID,this.author,this.numberOfPages,this.genre);
    }
}
