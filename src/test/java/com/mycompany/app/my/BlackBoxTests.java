package com.mycompany.app.my;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andie
 */
public class BlackBoxTests {


    /**
     * Test of GetFrquency method, of class StrHelper.
     */


    /**
     * Test of GetFrquency method, of class StrHelper.
     */
    @Test
    public void IONullTest() throws Exception {
        String message = "";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("",null);

        StrHelper strHelper = new StrHelper();
        assertEquals(expected, strHelper.GetFrquency(message));


    }

    /**
     * Test of toString method, of class StrHelper.
     */
    @Test
    public void IOTest() throws Exception {
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
        StrHelper strHelper = new StrHelper();
        assertEquals(expected, strHelper.GetFrquency(message));
    }
}

    

