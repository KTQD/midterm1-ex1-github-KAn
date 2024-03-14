public class MP3 extends Item {
    private float duration;
    public MP3(String name, String description,String ID,float duration){
        super(name,description,ID);
        this.duration=duration;

    }
    @Override
    void showInfo() {
        System.out.printf("name: %s description: %s Id:%s duration:%f",this.name,this.getDescription(),this.ID,this.duration);
    }
}
