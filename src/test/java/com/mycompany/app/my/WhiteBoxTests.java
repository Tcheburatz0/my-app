package com.mycompany.app.my;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class WhiteBoxTests {

    private StrHelper strHelper = new StrHelper();

    @org.junit.Test
    public void SplitTest() throws Exception {
        String[] strs = {
                "a b c d i f g h i j k",
                "1 2 3 4 5 6 7 8 9 ",
                "� ������� �������, ��� ���� ��������� 10 ����� �� ������� ���������� ������. � ����� ����� ����."
        };
        String[][] expected = {
                {"a", "b", "c", "d", "i", "f", "g", "h", "i", "j", "k"},
                {"1", "2", "3", "4", "5", "6", "7", "8", "9"},
                {"�", "�������", "�������", "���", "����", "���������", "10", "�����", "��", "�������", "����������", "������", "�", "�����", "�����", "����"}
        };
        for (int i = 0; i < strs.length; i++) {
            assertEquals(expected[i], strHelper.Split(strs[i]));
        }
    }

    @org.junit.Test
    public void FrequencyTest() throws Exception {
        String message = "� ������� �������, ��� ���� ��������� 10 ����� �� ������� ���������� ������. � ����� ����� ����.";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("�", 2);
        expected.put("�������", 1);
        expected.put("�������", 1);
        expected.put("���", 1);
        expected.put("����", 1);
        expected.put("���������", 1);
        expected.put("10", 1);
        expected.put("�����", 1);
        expected.put("��", 1);
        expected.put("�������", 1);
        expected.put("������", 1);
        expected.put("�����", 1);
        expected.put("�����", 1);
        expected.put("����", 1);
        expected.put("����������", 1);
        assertEquals(expected, strHelper.GetFrquency(message));
    }
}
