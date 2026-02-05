package az.edu.ada.modules.module02.lecture05;

public class Dragon {

    private String name;
    private int healthPoints;
    private byte[] texture;

    public Dragon(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void loadTexture() throws InterruptedException {
        System.out.println("Loading texture from DB... (takes a lot of time!)");
        Thread.sleep(5000);
        texture = new byte[] {};
    }
}
