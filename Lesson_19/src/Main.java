import java.util.*;

public class Main {
    public static void main(String[] args) {
//       ArrayList<String>a1=new ArrayList<>();
//       a1.add("Argentina");
//       a1.add("Bulgaria");
//       a1.add("Canada");
//       a1.add("Denmark");
//       a1.add("France");
//       System.out.println("Colection: "+a1);
//       System.out.println("Colection's size: "+a1.size());
//       System.out.println(a1.get(1));
//       if(!a1.contains("England")){
//           System.out.println("Engalnd is not in Collection");
//           a1.add(4,"England");
//       }
//       System.out.println("Collection: "+a1);
//       System.out.println("Colection's size: "+a1.size());
//       System.out.println(a1.indexOf("Engalnd"));
//       int ie=a1.indexOf("England");
//       a1.set(ie,"united Kingdom");
//       System.out.println("Collection: "+a1);
//       System.out.println("Colection's size: "+a1.size());
//       System.out.println("\n Collection Using While Loop: ");
//       int i=0;
//       while (i<a1.size()){
//          System.out.println(a1.get(i));
//       i++;
//       }
//       System.out.println("\n Collection Using While Loop: ");
//       for(Object a:a1){
//          System.out.println(a);
//       }
//       System.out.println("\n Collection Using While Loop: ");
//       Iterator<String> iter=a1.iterator();
//       while (iter.hasNext()){
//          System.out.println(iter.next());
//       }
//       a1.trimToSize();
//       a1.ensureCapacity(100);
//       String []ar= (String[]) a1.toArray();

       LinkedList<String>ll=new LinkedList<String>();
       ll.add("one");
       ll.add("two");
       ll.add("three");
       ll.add("four");
       ll.add("five");
       System.out.println("List: "+ll);
       ll.addLast("six");
       ll.add(3,"three");
       ll.addFirst("zero");
       System.out.println("List: "+ll);
       ll.remove("three");
       System.out.println("List: "+ll);
       System.out.println("loop forward: ");

       for(int i=0;i<ll.size();i++){
          System.out.println(ll.get(i));
       }
       ListIterator<String>it_beg= ll.listIterator();
       System.out.println("loop forward: ");
       while (it_beg.hasNext()){
          System.out.println(it_beg.next());
       }
       System.out.println("Loop bacWard");
       while (it_beg.hasPrevious()) {
          System.out.println(it_beg.previous());
       }
       ListIterator<String>it_ind= ll.listIterator(4);
       System.out.println("Loop from index");
       while (it_ind.hasNext()){
          System.out.println(it_ind.next());
       }
       it_ind.set("6");
       it_ind.set("7");

       Collections.sort(ll);


    }
}