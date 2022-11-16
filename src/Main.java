public class Main {
    public static void main(String[] args) {
        Participants human1 = new Human("Василий", 2000,2);
        Participants cat1 = new Cat("Барсик", 600, 1);
        Participants robot1 = new Robot("j72", 400, 2);

        Participants[] participants = {human1, cat1, robot1};

        Barrier wall1 = new Wall();
        wall1.wall(1);
        Barrier truck1 = new Truck();
        truck1.truck(1100);
        Barrier wall2 = new Wall();
        wall2.wall(2);
        Barrier truck2 = new Truck();
        truck2.truck(500);

        Barrier[] barriers = {wall1, wall2, truck1, truck2};

        for (int i = 0; i < participants.length; i++){
            System.out.printf("\nНаш герой %s собирается преодолеть полосу препятсвия:",participants[i]);
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j] instanceof Wall){
                    int wallHeight = barriers[j].getHeight();
                    if(participants[i].jump(wallHeight)){
                        System.out.printf("Наш герой %s смог перепрыгнуть стену", participants[i]);
                    } else {
                        System.out.printf("Для %s приключение подошло к концу", participants[i].getName());
                        break;}
                }
                if (barriers[j] instanceof Truck){
                    int truckDistance = barriers[j].getDistance();
                    if(participants[i].run(truckDistance)){
                        System.out.printf("Нашему герою %s хватило сил пробежать всю трассу", participants[i]);
                    } else {
                        System.out.printf("Для %s приключение подошло к концу", participants[i].getName());
                        break;}
                }

            }

            System.out.println();

        }
    }
}