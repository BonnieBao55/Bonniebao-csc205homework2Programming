//BonnieBao 
//define electronicDeviceType enum
enum ElectronicDeviceType{
    Laptop,
    Tablet,
    Smartphone,
    Smartwatch
}
//define ElectronicDeviceBrand enum
enum ElectronicDeviceBrand{
    Apple,
    HP,
    Sony
}
//public class named ElecDevice
public class ElecDevice{
    //add private instance variables to the class
    private ElectronicDeviceType type;
    private ElectronicDeviceBrand brand;
    private double price; 
    private boolean isWaterproof;

    //initialize elecDevice object
public ElecDevice(ElectronicDeviceType type, ElectronicDeviceBrand brand, double price, boolean isWaterproof){
    this.type = type;
    this.brand = brand;
    this.price = price;
    this.isWaterproof = isWaterproof;
}
//getter methods
public ElectronicDeviceType getType(){
    return type;
}
public ElectronicDeviceBrand getBrand(){
    return brand;
}
public double getPrice(){
    return price;
}
public boolean isWaterproof(){
    return isWaterproof;
}
//setter methods
public void setType(ElectronicDeviceType type){
    this.type = type;
}
public void setBrand(ElectronicDeviceBrand brand){
    this.brand = brand;
}
public void setPrice(double price){
    this.price = price;
}
public void setIsWaterproof(boolean isWaterproof){
    this.isWaterproof = isWaterproof;
}
}