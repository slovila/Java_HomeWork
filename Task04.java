import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
//import java.util.Collection;


public class Task04 {
    public static void main(String[] args) {

            System.out.println(getTimeMsOfInsert(new ArrayList()));
            System.out.println(getTimeMsOfInsert(new LinkedList()));
            System.out.println(getTimeMsOfGet(new ArrayList()));
            System.out.println(getTimeMsOfGet(new LinkedList()));
        }

        public static long getTimeMsOfInsert (List list)
        {

            Date beginTime = new Date();
            insert10000(list);
            Date finishTime = new Date();
            long msDelay = finishTime.getTime() - beginTime.getTime();

            return msDelay;
        }
        public static long getTimeMsOfGet (List list){

            Date dateAfter = new Date();
            get10000(list);


            Date dateBefore = new Date();
            return dateBefore.getTime() - dateAfter.getTime();
        }

        public static void get10000 (List list){
            if (list.isEmpty()) return;
            int x = list.size() / 2;

            for (int i = 0; i < 10000; i++) {
                list.get(x);
            }
        }

        public static void insert10000 (List list)
        {
            for (int i = 0; i < 10000; i++) {
                list.add(0, new Object());
            }
        }
    }


