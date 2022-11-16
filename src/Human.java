public class Human implements Participants {
    private String name;
    int hDistance, hHeight;

    public Human(String name, int hDistance, int hHeight) {
        this.name = name;
        this.hDistance = hDistance;
        this.hHeight = hHeight;
    }

    public boolean run(int distance){
        hDistance -= distance;
        if (hDistance >= 0) {
            System.out.printf("\nЧеловек %s подбежал к лесной тропинке длиной %d м: ", name, distance);
            return true;
        }
        else if(hDistance < 0){
            System.out.printf("\nЧеловек %s подбежал к лесной тропинке длиной %d м: ", name, distance);
            System.out.printf("Лесная тропа %d м оказалась непреодолимым препятствием для человека %s: ", distance, name);
            return false;
        }
        return false;
    }

    public boolean jump(int height){
        if (hHeight >= height) {
            System.out.printf("\nЧеловек %s подбежал к стене высотой %d м: ", name, height);
            return true;
        }
        else if(hHeight < height){
            System.out.printf("\nЧеловек %s подбежал к стене высотой %d м: ", name, height);
            System.out.printf("Стена высотой %d оказалась непреодолимым препятствием для человека %s: ", height, name);
            return false;
        }
        return false;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
