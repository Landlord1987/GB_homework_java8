public class Truck implements Barrier {
    int height, distance;

    @Override
    public void truck(int distance) {
        this.distance = distance;
    }

    @Override
    public void wall(int height) {
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public int getDistance(){
        return distance;
    }
}
