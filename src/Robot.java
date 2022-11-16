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
            System.out.printf("����� %s �������� �� ����� ������ ������� � ����������� ������ ������ %d �:", name, distance);
            return true;
        }
        else if(rDistance < 0){
            System.out.printf("\n����� %s �������� �� ����� ������ ������� � ����������� ������ ������ %d �:", name, distance);
            System.out.printf("������ %d � ��������� ������������� ������������ ��� ������ %s:", distance, name);
            return false;
        }
        return false;
    }

    public boolean jump(int height){
        if (rHeight >= height) {
            System.out.printf("\n����� %s ���������� � ����� ������� %d �:", name, height);
            return true;
        }
        else if(rHeight < height){
            System.out.printf("\n����� %s ���������� � ����� ������� %d �:", name, height);
            System.out.printf("����� ������� %d � ��������� ������������� ������������ ��� ������ %s:", height, name);
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
