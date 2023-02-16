package Bloque3;

public class MyQueue {
	char[] queue = new char[5];
	//char[] queue = {'a','b','c','d'};
	int MAX = queue.length;
	int tail = 0;
	//int head = 0;
	
	public void insert(char data) {
		if(tail == MAX) {
			System.out.println("Queue is full");
		}
		else {
			queue[tail] = data;  
			tail = tail+1;
		}
	}
	
	public char delete() {
		if (tail == 0) {
			System.out.println("Queue is empty");
			return('#');
		}
		
		else {
			char head = queue[0];
		
			for(int i = 0; i < tail; i++) {
				
				queue[i] = queue[i+1];
			}
			queue[tail] = ' ';
			
			tail = tail-1;
		
			System.out.println(queue);
			
			return(head);
		}
		
	}
}