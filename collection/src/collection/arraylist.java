
package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<String>();
	//adding elements in list
    list.add("Geeks");
    list.add("for");
    list.add("Geeks");
    list.add("1");
    list.add("7.5");
    list.add("hi");
    list.add("kill");
    list.add("null");
    list.add("0");
    list.add("q");
    System.out.println(list);
int i=0;
while(list.size()>i) {
	System.out.println(list.get(i));
	i++;
}
//add elements using index
	list.add("5.0");
	list.add(3,"null");
	list.add(2,"");
	list.add(1,"5");
	System.out.println(list);
	//removing elements
	list.remove("hi");
	list.remove("1");
	list.remove("q");
	System.out.println(list);
	//adding
	list.add(11,"*");
	list.add(12,"9");
	list.add("sam");
	System.out.println(list);
	//removing
	list.remove("0");
	list.remove("kill");
	Iterator<String>Iterator=list.iterator();
	while(Iterator.hasNext()) {
		System.out.println(Iterator.next());
	}
}}

 



