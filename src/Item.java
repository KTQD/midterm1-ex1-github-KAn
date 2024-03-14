public abstract class Item {
    public String name;
    private String description;
    protected String ID;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    abstract void showInfo();
    Item(String name, String description,String ID){
        this.name=name;
        setDescription(description);
        this.ID=ID;
    }
}
