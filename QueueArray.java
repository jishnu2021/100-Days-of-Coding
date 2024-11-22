class QueueArray {
    private int[] queue;
    private int capacity, front, rare , size;

   public QueueArray(int capacity){
    this.capacity = capacity;
    queue = new int[capacity];
    front = 0;
    rare = -1;
    int size = 0;
    
   }

   public void enqueue(int val){
    if(isFull()){
        System.out.println("The Queue is full, we can't add the value " + val);
        return;
    }

    rare = (rare + 1)%capacity;
    queue[rare] = val;
    size++;
    System.out.println("Enqueued: " + val);
   }

   public int dequeue(){
    if(isEmpty()){
        System.out.println("The Queue is empty , so we can't delete values");
        return -1;
    }

    int data = queue[front];
    front = (front+1)%capacity;
    size--;
    System.out.println("Dequeued: " + data);
    return data;
   }
   public int peek() {
    if (isEmpty()) {
        System.out.println("Queue is empty. Nothing to peek.");
        return -1;
    }
    return queue[front];
}

// Method to check if the queue is empty
public boolean isEmpty() {
    return size == 0;
}

// Method to check if the queue is full
public boolean isFull() {
    return size == capacity;
}

// Method to get the size of the queue
public int size() {
    return size;
}
public static void main(String[] args) {
    QueueArray queue = new QueueArray(5);
    queue.enqueue(5);
    queue.enqueue(3);
    queue.enqueue(8);
    queue.enqueue(2);
    queue.enqueue(4);


    System.out.println("Front element: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(60);

        while (!queue.isEmpty()) {
            queue.dequeue();
        }

        queue.dequeue(); 

}
}
