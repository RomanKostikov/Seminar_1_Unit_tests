package classwork.task007;

public class Task007 {
    /*
    ��������� ������� ��� ��� ����� ��������, ������������ ������������ ����������.
��������� ����� �������� ���� ����� ���, ����� ��� ������������ ���������� �������������
��������������.
     */
    public static void main(String[] args) {
        sum(1234567890, 1000000000);
    }

    public static int sum(int a, int b) {
        long result = (long) a + b;
        System.out.println(result);
        assert result < Integer.MAX_VALUE : "������������ ����������";
        return a + b;
    }

}
