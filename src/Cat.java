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
            System.out.printf("��� %s �������� � �������� ���������� �������� ������ %d �: ", name, distance);
            return true;
        }
        else if(cDistance < 0){
            System.out.printf("\n��� %s �������� � �������� ���������� �������� ������ %d �: ", name, distance);
            System.out.printf("���������� �������� %d � ��������� ������������� ������������ ��� ���� %s: ", distance, name);
            return false;
        }
        return false;
    }

    public boolean jump(int height){
        if (cHeight >= height) {
            System.out.printf("\n��� %s �������� � ����� ������� %d �: ", name, height);
            return true;
        }
        else if(cHeight < height){
            System.out.printf("\n��� %s �������� � ����� ������� %d �: ", name, height);
            System.out.printf("����� ������� %d � ��������� ������������� ������������ ��� ���� %s: ", height, name);
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
