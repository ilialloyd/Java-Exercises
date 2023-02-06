package org.example.product_computer;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/26/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class PersonalComputer extends Product {

    private Monitor monitor;
    private MotherBoard motherBoard;
    private ComputerCase computerCase;


    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor, MotherBoard motherBoard,
                            ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.computerCase = computerCase;
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Windows OS");
    }

    private void drawLogo(){
        monitor.drawPixelAt(20,20,"yellow");
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
}
