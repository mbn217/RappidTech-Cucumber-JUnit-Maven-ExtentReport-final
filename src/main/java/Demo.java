import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        String[] names = {"John", "Jane", "Adam", "Tom", "Jerry"}; // static array

        //convert it, transform it into a list (collection)

        List<String> namesList = Arrays.asList(names);

        for(String name: namesList){
            System.out.println(" ========     >>>>>>   "+name);
        }



    }
}
