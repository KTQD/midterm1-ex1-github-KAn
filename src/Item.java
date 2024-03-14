public abstract class Item {
    public String name;
    private String description;
    protected String ID;
    float price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    abstract void showInfo();
    Item(String name, String description,String ID,float price){
        this.name=name;
        setDescription(description);
        this.ID=ID;
        this.price=price;
    }
}
