package collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    
    @Test
    public void testRemoveElementFound() throws Exception {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
    }

    @Test
    public void testRemoveElementNotFound() {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertThrows(Exception.class, () -> {
            list.remove(4);});
    }

    @Test
    public void testRemoveFirstElement() throws Exception{
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        assertEquals(2, list.getcapacity());
        assertEquals(Integer.valueOf(2), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
    }

    @Test
    public void testRemoveLastElement() throws Exception {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(3);
        assertEquals(2, list.getcapacity());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
    }
    @Test
    public void testRemoveFromEmptyArray()throws Exception {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.remove(1);
        assertThrows(Exception.class, () -> {
            list.remove(4);});
        assertEquals(0, list.getcapacity());
    }

    @Test
    public void testAddToEmptyArray() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("apple");
        assertEquals(1, list.getcapacity());
        assertEquals("apple", list.get(0));
    }
    @Test
    public void testAddSeveralElements() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("banana");
        list.add("orange");
        assertEquals(2, list.getcapacity());
        assertEquals("banana", list.get(0));
        assertEquals("orange", list.get(1));
    }
    @Test
    public void testAddLastElement() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("banana");
        list.add("orange");
        list.add("kiwi");
        assertEquals(3, list.getcapacity());
        assertEquals("kiwi", list.get(2));
    }
    @Test
    public void testRemoveByIndex() {
        CustomArrayList <Integer> list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeByIndex(1);
        assertEquals(2, list.getcapacity());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            list.removeByIndex(2);});
    }
    @Test
    public void testRemoveIndexFound()  {
        CustomArrayList <Integer> list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeByIndex(1);
        assertEquals(2, list.getcapacity());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
    }

    @Test
    public void testRemoveIndexNotFound() {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            list.removeByIndex(4);});
    }

    @Test
    public void testRemoveZero() throws Exception{
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeByIndex(0);
        assertEquals(2, list.getcapacity());
        assertEquals(Integer.valueOf(2), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
    }

    @Test
    public void testRemoveLastIndex() throws Exception {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeByIndex(2);
        assertEquals(2, list.getcapacity());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
    }
    @Test
    public void testGetException(){
        CustomArrayList<Integer> list = new CustomArrayList<Integer>();
        list.add(1);
        list.add(2);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            list.get(4);});
    }


}