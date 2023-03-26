public class GamingDesktop extends Desktop {
    private String graphicsCard;

    public GamingDesktop(int screenSize, int memory, String graphicsCard) {
        super(screenSize, memory, true);
        this.graphicsCard = graphicsCard;
    }

    public void updateDrivers() {
        System.out.println("graphics card drivers updated");
    }
}
