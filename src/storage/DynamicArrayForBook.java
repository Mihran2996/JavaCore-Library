package storage;

//import library.model.Book;
import model.Book;

public class DynamicArrayForBook {
private Book array[]=new Book[10];
   private  int size;
    public void add(Book value) {
        if (size == array.length) {

            extend();
        }
        array[size++] = value;

    }
    private void extend() {
        Book array1[] = new Book[array.length + 10];
//        int indexOf = 0;
//        for (int i = 0; i < array.length; i++) {
//            array1[indexOf++] = array[i];
//        }
        System.arraycopy(array,0,array1,0,array.length);//mi toxov nuyn gorcoxutyunna anum
        array = array1;
    }
public Book getBookByTitle(String title){
    for (int i = 0; i <size; i++) {
       if(array[i].getTitle().equals(title)){
           return array[i];
       }
    }
    return null;
}

}
