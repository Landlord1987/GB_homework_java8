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
            System.out.printf("\n������� %s �������� � ������ �������� ������ %d �: ", name, distance);
            return true;
        }
        else if(hDistance < 0){
            System.out.printf("\n������� %s �������� � ������ �������� ������ %d �: ", name, distance);
            System.out.printf("������ ����� %d � ��������� ������������� ������������ ��� �������� %s: ", distance, name);
            return false;
        }
        return false;
    }

    public boolean jump(int height){
        if (hHeight >= height) {
            System.out.printf("\n������� %s �������� � ����� ������� %d �: ", name, height);
            return true;
        }
        else if(hHeight < height){
            System.out.printf("\n������� %s �������� � ����� ������� %d �: ", name, height);
            System.out.printf("����� ������� %d ��������� ������������� ������������ ��� �������� %s: ", height, name);
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
