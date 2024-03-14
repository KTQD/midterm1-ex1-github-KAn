public class Book extends Item {
    String author;
    int numberOfPages;
    String genre;
    public Book(String name, String description,String ID,float price,String author, int numberOfPages,String genre){
        super(name,description,ID,price);
        this.author=author;
        this.numberOfPages=numberOfPages;
        this.genre=genre;
    }
    @Override
    void showInfo() {
        System.out.printf("name: %s description: %s Id:%s price:%f \n author:%s number of pages:%d genre:%s",
                this.name,this.getDescription(),this.ID,this.price,this.author,this.numberOfPages,this.genre);
    }
}
