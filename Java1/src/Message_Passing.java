import java.util.Scanner;

class poem{
	private String title, author;
	
	public poem(String title, String author) {
		this.title = title;	
		this.author = author;
	}
	

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}
	void show() {
		System.out.println("[" + title + "," + author + "]");
	}
	
	
	
}



public class Message_Passing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poem [] book = new poem[100];
		
		Scanner sc = new Scanner(System.in);
		String title, author;
		int cnt = 0;
		
		while(true) {
			System.out.print("力格>> ");
			title = sc.nextLine();
			if(title.equals("场"))
				break;
			System.out.print("历磊>> ");
			author = sc.nextLine();
			book[cnt++] = new poem(title, author);
		}
		sc.close();
		
		for(int i=0; i<cnt; i++) {
			book[i].show();
		}
	}

}
