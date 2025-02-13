import java.util.Stack;

class Queue{
    Stack<Integer> enqueue = new Stack<>();
    Stack<Integer> dequeue = new Stack<>();

    public void add(int item){
        if(!enqueue.isEmpty()){
            while(!enqueue.isEmpty()){
                dequeue.push(enqueue.pop());
            }
            dequeue.push(item);
        }
        else{
            while(!dequeue.isEmpty()){
                enqueue.push(dequeue.pop());
            }
            enqueue.push(item);
        }
    }

    public int remove(){
        if(!enqueue.isEmpty()){
            return enqueue.pop();
        }
        return dequeue.pop();
    }

    public int peek(){
        if(!enqueue.isEmpty()){
            return enqueue.peek();
        }
        return dequeue.peek();
    }

    public boolean isEmpty(){
        return enqueue.isEmpty() && dequeue.isEmpty();
    }

    public int size(){
        if(!enqueue.isEmpty()){
            return enqueue.size();
        }
        return dequeue.size();
    }

    public static void main(String []args){
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("Peek : " + queue.peek());
        System.out.println("Remove : " + queue.remove());
        System.out.println("Is Empty : " + queue.isEmpty());
        System.out.println("Size : " + queue.size());
    }
}