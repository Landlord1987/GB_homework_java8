public class Robot implements Participants {

    private String name;
    int rDistance, rHeight;

    public Robot(String name, int rDistance, int rHeight){
        this.name = name;
        this.rDistance = rDistance;
        this.rHeight = rHeight;
    }

    public boolean run(int distance){
        rDistance -= distance;
        if (rDistance >= 0) {
            System.out.printf("Робот %s подъехал на своих ржавых колесах к космической трассе длиной %d м:", name, distance);
            return true;
        }
        else if(rDistance < 0){
            System.out.printf("\nРобот %s подъехал на своих ржавых колесах к космической трассе длиной %d м:", name, distance);
            System.out.printf("Трасса %d м оказалась непреодолимым препятствием для робота %s:", distance, name);
            return false;
        }
        return false;
    }

    public boolean jump(int height){
        if (rHeight >= height) {
            System.out.printf("\nРобот %s проскрипел к стене высотой %d м:", name, height);
            return true;
        }
        else if(rHeight < height){
            System.out.printf("\nРобот %s проскрипел к стене высотой %d м:", name, height);
            System.out.printf("Стена высотой %d м оказалась непреодолимым препятствием для робота %s:", height, name);
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
