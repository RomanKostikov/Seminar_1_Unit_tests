package classwork.task005;

public class Task005 {
    public static void main(String[] args) {
        assertConditionA();
    }

    /*
    ������� ����������, ��� �� ��������� ��� ����������� ����������� � ��� ����� ���������, ���
    ���������� �������� � ������ ��������� �����������.
    ��������� ��������� ��� ���, ����� ����������� ���� ����� � ��� �� ���������� ������
     */
    public static void assertConditionA() {
        String[] weekends = {"�������", "�����������"};
        assert weekends.length == 2;
        System.out.println("� ������ " + weekends.length + " ��� ��������");
    }
}
