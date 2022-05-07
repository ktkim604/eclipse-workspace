package insert;

public class ArrayList<E> {
	 private int size;
	  private E a[];

	  public ArrayList() {
	    a = (E[]) new Object[1];
	    size = 0;
	  }

	  public void push(E element) {
	    if (getSize() == a.length) {
	      resize(2 * a.length);
	    }
	    a[size++] = element;
	  }

	  private void resize(int newSize) {
	    Object[] k = new Object[newSize];
	    for (int i = 0; i < a.length; i++) {
	      k[i] = a[i];
	    }
	    a = (E[]) k;
	  }

	  public int getSize() {
	    return size;
	  }
	public void setItem(E element, int index){
	    a[index] = element;
	}
	  public E pop() {
	    E poped = a[size];
	    a[size--] = null;
	    return poped;
	  }

	  public String toString() {
	    String output = "";
	    for (int i = 0; i < size; i++) {
	      output += (a[i] + " ");
	    }
	    return output;
	  }

	  public E getItem(int index) {
	    return a[index];
	  }

}
