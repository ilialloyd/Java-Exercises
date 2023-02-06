package org.example.product_computer;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/26/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Product {

    private String model;
    private String manufacturer;
    private String width;
    private String height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}


class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format
                ("Draw pixel at %d,%d in color %s", x, y, color)
        );
    }
}



class MotherBoard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void loadProgram(String programName) {
        System.out.printf("Program %s is now loading...\n",programName);
    }
}



class ComputerCase extends Product {
    private String powerSupply;

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}