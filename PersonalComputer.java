public class PersonalComputer extends Product {
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computercase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard, ComputerCase computercase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computercase = computercase;
    }

    public void pressUp() {
        computercase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        monitor.drawPixelAt(1200, 50, "Green");
    }


}