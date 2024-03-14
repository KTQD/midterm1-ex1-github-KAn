public class MP3 extends Item {
    private float duration;
    public MP3(String name, String description,String ID,float duration,float price){
        super(name,description,ID,price);
        this.duration=duration;

    }
    @Override
    void showInfo() {
        System.out.printf("name: %s description: %s Id:%s price:%f duration:%f",this.name,this.getDescription(),this.ID,this.price,this.duration);
    }
}
