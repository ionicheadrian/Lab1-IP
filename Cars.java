abstract class Cars {
    String Brand;
    String Type;
    public Car(String Brand, String Type)
    {
        this.Brand = Brand;
        this.Type = Type;
    }
    abstract void getBrand();
    abstract void getType();
}
