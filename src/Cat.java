public class Cat implements Participants {

    private String name;
    int cDistance, cHeight;

    public Cat(String name, int cDistance, int cHeight) {
        this.name = name;
        this.cDistance = cDistance;
        this.cHeight =cHeight;
    }

    public boolean run(int distance){
        cDistance -= distance;
        if (cDistance >= 0) {
            System.out.printf("Кот %s подбежал к кошачьей спортивной площадке длиной %d м: ", name, distance);
            return true;
        }
        else if(cDistance < 0){
            System.out.printf("\nКот %s подбежал к кошачьей спортивной площадке длиной %d м: ", name, distance);
            System.out.printf("Спортивная площадка %d м оказалась непреодолимым препятствием для кота %s: ", distance, name);
            return false;
        }
        return false;
    }

    public boolean jump(int height){
        if (cHeight >= height) {
            System.out.printf("\nКот %s подбежал к стене высотой %d м: ", name, height);
            return true;
        }
        else if(cHeight < height){
            System.out.printf("\nКот %s подбежал к стене высотой %d м: ", name, height);
            System.out.printf("Стена высотой %d м оказалась непреодолимым препятствием для кота %s: ", height, name);
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
