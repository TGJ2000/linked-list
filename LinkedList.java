class LinkedList {
	static class node {
		int data;
		node next;
	}

	static node front;

	static node newNode(int num) {
		node newNode = new node();
		newNode.data = num;
		return newNode;
	}

	void newFront(int num) {
		node newNode = newNode(num);
		newNode.next = front;
		front = newNode;
	}

	node findTail() {
		node curr, tail;
		curr = front;
		tail = front;
		if (front == null) {
			return null;
		} else {
			while (curr.next != null) {
				curr = curr.next;
			}
			tail = curr;
			return tail;
		}
	}

	void add(int num) {
		node temp, tail;
		tail = findTail();
		temp = newNode(num);
		if (front != null) {
			tail.next = temp;
		} else if (tail == null) {
			newFront(num);
		}
	}

	void addBetween(int numToAdd, int num) {
		node curr, temp, after;
		curr = front;
		after = null;
		temp = newNode(numToAdd);
		while (curr.data != num) {
			curr = curr.next;
		}
		if (curr.next != null) {
			after = curr.next;
			curr.next = temp;
			temp.next = after;
		} else {
			System.out.println("There is not a node after that one!");
			return;
		}
	}

	void getTail() {
		System.out.println(findTail().data);
	}

	void deleteNode(int num) {
		node curr, prev;
		curr = front;
		prev = front;
		if (front.data == num) {
			front = curr.next;
			curr = null;
			return;
		} else {
			while (curr.next != null) {
				prev = curr;
				curr = curr.next;
				if (curr.data == num) {
					prev.next = curr.next;
					curr = null;
					curr = prev.next;
					return;
				}
			}
		}
		System.out.println("The number provided could not be found.");
	}

	void showList() {
		node temp = front;
		if (front == null) {
			System.out.println("Your list is empty.");
		} else {
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	void deleteList() {
		node temp = front;
		node after = temp;
		if (front == null) {
			System.out.println("Your list is empty.");
		} else {
			while (temp != null) {
				after = temp.next;
				front = after;
				temp = null;
				temp = after;
			}
			temp = null;
		}
	}
}
