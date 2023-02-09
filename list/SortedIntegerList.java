package lab_4.list;
import java.util.ArrayList;
import java.util.ListIterator;

public class SortedIntegerList{

	public ArrayList <Integer> sortList;
	boolean flag;	

	public SortedIntegerList (boolean flag){

		this.flag = flag;
		sortList = new ArrayList <Integer> ();

	}

	public void add (int element){

		ListIterator <Integer> iterator = sortList.listIterator();
		
		if(!iterator.hasNext()){
			sortList.add(element);
			return;
		}
		
		int el = 0;
		while(iterator.hasNext()){
			el = iterator.next();
			if(element <= el){
				if(flag == false)
					if(element == el)
						break;
											
				iterator.previous();
				iterator.add(element);
				break;
			}
		}
		
		if (element > el)
			sortList.add(element);
	}
		
	public void remove (int element){
		ListIterator <Integer> iterator = sortList.listIterator();
		while(iterator.hasNext()){
			int el = iterator.next();
			if(element == el){
				iterator.previous();
				iterator.remove();
				break;
			}
		}
	}

	public int find(int element){
		int l = 0;
		int r = this.sortList.size();
		int ind = -100;
		ListIterator <Integer> it1 = this.sortList.listIterator();
		int el = 0;
		while(l <= r){
			int m = (l + r) / 2;
			if(element == this.sortList.get(m)) {
				for(int i = 0; i < m; i++)
					it1.next();
				ind = it1.nextIndex();
				break;
			}	
			if (element < this.sortList.get(m))     
      				r = m - 1;  
   			else                  
      				l = m + 1;
		}
		return ind;
				
	}
	public boolean equals (SortedIntegerList l){

		if(this.sortList.size() != l.sortList.size()) 
			return false;

		ListIterator <Integer> it1 = this.sortList.listIterator();
		ListIterator <Integer> it2 = l.sortList.listIterator();

		while(it1.hasNext()){
			if(it1.next() != it2.next())
				return false;
		}
    
		return true;

		
	}

	public String toString(){

		StringBuilder sb = new StringBuilder();
		ListIterator<Integer> iterator = sortList.listIterator();

		while(iterator.hasNext()){
			sb.append(iterator.next() + " ");
		}

		String text = sb.toString();

		return text;
	}
	
}
