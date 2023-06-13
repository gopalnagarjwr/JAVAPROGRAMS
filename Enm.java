import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
    sunday,monday ,teusday,wednesday,thursday,friday,saturday
}

public class Enm{
    public static void main(String[] args) {
        //particular element access  ->
        Set<days> set= EnumSet.of(days.monday,days.saturday);
        Iterator itr =set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        //all element access  ->

        Set<days> set1=EnumSet.allOf(days.class);
         itr =set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        // range of element  ->

        Set<days> set2=EnumSet.range(days.monday,days.saturday);
         itr =set2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}





//    String file="serialization.txt";
//        try {
//            Serialization s=new Serialization(1001,"ram");
//            FileOutputStream fos=new FileOutputStream(file);
//            ObjectOutputStream oos=new ObjectOutputStream(fos);
//            oos.writeObject(s);
//            oos.flush();
//            oos.close();
//            System.out.println("sucessfully done");
//        }catch (IOException e){
//            e.printStackTrace();
//        }