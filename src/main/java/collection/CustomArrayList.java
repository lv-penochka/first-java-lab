package collection;

public class CustomArrayList <T>{
    private Object[] array=new Object[1];
    private int capacity = 0;

    /**
     * Добавляет элемент в массив. Если массив заполнен,то его размер увеличивает.
     *
     * @param s Элемент, который нужно добавить в массив.
     */
    public void add(T s){
        if (capacity == array.length)
            growArray();
        array[capacity] = s;
        capacity++;
    }
    /**
     * Переписывает исходный массив в новый массив, параметр capacity которого
     * теперь удвоеному исходному. Размерность нового массива обусловлена,
     * уменьшением операций полного копирования исходного
     * массива при последующих добавлениях элементов.
     **/
    private void growArray() {
        Object[] tempArray = new Object[array.length * 2];
        for (int i = 0 ;i < capacity; i++){
            tempArray[i]=array[i];
        }
        array=tempArray;
    }

    /**
     * Удаляет существующий элемент из массива.
     *
     * @param s значение эллемента массива
     * @throws Exception в случае если указаного элемента не существует в массиве
     */
    public void remove(T s) throws Exception {
        int index = -1;
        for(int i =0; i<capacity; i++){
            if(s.equals(array[i])){
                index=i;
                break;
            }
        }
        if (index != -1) {
            removeByIndex(index);
        }
        else throw new Exception("Element not found in current array");
    }

    /**
     *Удаляет элемент массива по заданому индексу.
     *
     * @param index Индекс элемента, который нужно удалить.
     *@throws IndexOutOfBoundsException если заданый индекс находится вне
     * допустимого диапазона (меньше нуля или больше размера списка).
     */
    public void  removeByIndex(int index)
    {
        if (index >= 0 && index < capacity)
        //сохраняем элементы до индекса, передвигаем все элементы
        // стоящие после индекса на одну позицию вперед
        { for (int i =index; i<capacity -1;i++){
            array[i] = array[i+1];
        }
            capacity--;
        }
        else throw new ArrayIndexOutOfBoundsException(index);
    }

    /**
     * Возвращает текущий размер массива.
     *
     * @return capacity - размер масива
     */
    public int getcapacity(){
        return capacity;
    }
    /**
     * Возвращает значение масива, хранящееся под заданым индексом.
     *
     * @param index индекс элемента, содержимое которого необходимо показать
     * @return значение и-того элемента массива
     * @throws IndexOutOfBoundsException если заданый индекс находится вне
     * допустимого диапазона (меньше нуля или больше размера списка).
     */
    public T get(int index) {
        if (index >= 0 && index < capacity)
            return (T) array[index];
        else throw new ArrayIndexOutOfBoundsException(index);
    }

}