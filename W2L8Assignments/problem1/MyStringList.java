package W2L8Assignments.problem1;



public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	
	//Binary Search
	boolean search(String val) {
		
		boolean b = recurse(0,strArray.length-1, val);
		return b;
	}


	boolean recurse(int a, int b, String val) {
		int mid = (a+b)/2;
		if(strArray[mid] == val) return true;
		if(a > b) return false;
		if(val.compareTo(strArray[mid])> 0 ) 
			return recurse(mid+1, b, val);
		return recurse(a,mid-1,val);
	}
	
	//sort
	void sort() {
		String temp = "";
		for(int i = 0 ; i < strArray.length; ++i) {
			for (int k = i + 1; k < strArray.length; k++) {
				if(strArray[i]!=null && (strArray[k]) != null ) {
					if(strArray[i].compareTo(strArray[k]) > 1) {
						temp = strArray[k];
						strArray[k] = strArray[i];
						strArray[i] = temp;
					}
				}
			}
		}
	}
	

	public static void main(String[] args){
		MyStringList list = new MyStringList();
		list.add("big");
		list.add("small");
		list.add("round");
		list.add("enourmos");
		list.add("square");
		list.add("htiny");
		list.add("gargantuan");
		list.add("lilliputian");
		list.add("numberless");
		list.add("none");
		
		list.add("vast");
		list.add("minicules");
		list.sort();
		System.out.println(list);
	
}}

