package linked_list.single;

import linked_list.List;

public class SingleLinkedList<T extends Comparable<T>> implements List<T> {

  private Node<T> frontNode;
  private Node<T> lastNode;
  private int size=0;

    // O(1) SingleLinkedList is good, but Array is not good
    @Override
    public void addBeginning(T data) {

        if (frontNode==null){
            frontNode = new Node<>(data);
            lastNode=frontNode;

            size++;

        }else {
            Node<T> newNode = new Node<>(data);
            newNode.setNextNode(frontNode);
            frontNode = newNode;
            size++;
        }

    }

    // O(1) both are good
    @Override
    public void addLast(T data) {

        if(frontNode==null){
            addBeginning(data);
            return;
        }

        Node<T> newNode=new Node<>(data,null);
        lastNode.setNextNode(newNode);
        lastNode=newNode;
        size++;

    }

    // O(N)+O(1) == O(N)  both are equal
    @Override
    public void addAtPosition(int index, T data) {

        if(index>size() || index<0){
            throw new ArrayIndexOutOfBoundsException("invalid Index value  ...");
        }

        if(index==0){
            addBeginning(data);
        }else if(index==size()){
            addLast(data);
        }else {

            Node<T> temp=frontNode;
            for (int i=0;i<index-1;i++){
                temp=temp.getNextNode();
            }
            Node<T> newNode=new Node<>(data);
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);
            size++;
        }


    }

    // O(1) SingleLinkedList is good,but array is not good
    @Override
    public void removeBeginning() {

        if(frontNode==null){
            System.out.println("the list is empty! ");
        }
        frontNode=frontNode.getNextNode();
        size--;
    }

    // O(N) SingleLinkedList is not good, but array is good
    @Override
    public void removeLast() {

        if(frontNode==null){
            System.out.println("the list is empty! ");
        }
        Node<T> temp=frontNode;
        for(int i=0;i<size()-1;i++){
            temp=temp.getNextNode();
        }
        lastNode=temp;
        size--;
    }

    // O(N)+O(1) == O(N) both are equal
    @Override
    public void remove(T data) {

        if(frontNode==null){
            System.out.println("the list is empty: ");
        }else  if (frontNode.getData().compareTo(data)==0){
            removeBeginning();
        }else {
            Node<T> temp=frontNode.getNextNode();
            Node<T> tempMinusOne=frontNode;
            while(temp!=null){
                if (temp.getData().compareTo(data)==0){
                    break;
                }
                tempMinusOne=temp;
                temp=temp.getNextNode();
            }
            if(temp==null){
                System.out.println("the date have not here: ");
            }else if (temp.getData().compareTo(lastNode.getData())==0){
                lastNode=tempMinusOne;
                temp=null;
                tempMinusOne=null;
                size--;
            }else {
                tempMinusOne.setNextNode(temp.getNextNode());
                temp=null;
                size--;
            }
        }

    }

    // O(N) this is not good, but array is good
    @Override
    public T get(int index) {

        if(index<0 || index>size()){
            throw new ArrayIndexOutOfBoundsException("the index is out of bound: ");
        }
        Node<T> temp=frontNode;
        for (int i=0;i<size();i++){
            if (i==index){break;}
            temp=temp.getNextNode();
        }
        return temp.getData();
    }

    // O(N) both are equal
    @Override
    public boolean find(T data) {
        if (findIndex(data)==-1) {
            return false;
        }
        return true;
    }

    // O(N) both are equal
    @Override
    public int findIndex(T data) {
        if (frontNode==null){
            return -1;
        }

        int index=0;
        Node<T> temp=frontNode;
        for (int i=0;i<size();i++){
            if (temp.getData().compareTo(data)==0){
                return index;

            }
            index++;
            temp=temp.getNextNode();
        }

        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    // O(N) both are equal
    @Override
    public void getAll() {

        if(frontNode==null){
            System.out.println("The Linked List is Empty");
        }

        Node<T> temp=frontNode;
        System.out.print("all Data :-   ");
        for (int i=0;i<size();i++){

            System.out.print(temp.toString()+"-->");
            temp=temp.getNextNode();
        }

        System.out.println();
    }


    //Interview Question #1:
    //Suppose we have a standard linked list. Construct an in-place (without extra memory)
    // algorithm thats able to find the middle node !
    @Override
    public T middleNode() {

        if (frontNode==null || frontNode.getNextNode()==null){
            return null;
        }


        Node<T> temp=frontNode;
        for(int i=0;i<(size()-1)/2;i++){
            temp=temp.getNextNode();
        }

        return temp.getData();

        //////////////////////////////// lecture answer is below

        /*Node<T> fastes=frontNode;
        Node<T> slow=frontNode;

        while (fastes.getNextNode()!=null && fastes.getNextNode().getNextNode() != null){
            fastes=fastes.getNextNode().getNextNode();
            slow=slow.getNextNode();
        }
        return slow.getData();*/
    }


    //Interview Question #2:
    //Construct an in-place algorithm to reverse a linked list!
    @Override
    public void reverse() {
        lastNode=frontNode;
        Node<T> bolt=frontNode.getNextNode();
        Node<T> headFollower=null;
        while (bolt !=null){
            headFollower=frontNode;
            frontNode=bolt;
            bolt=bolt.getNextNode();
            frontNode.setNextNode(headFollower);
        }

        //////////////////////////////////////// lecture answer is below

        /*Node<T> currentNode=frontNode;
        Node<T> priviousNode = null;
        Node<T> nextNode=null;
        while (currentNode!=null){
            nextNode=currentNode.getNextNode();
            currentNode.setNextNode(priviousNode);
            priviousNode=currentNode;
            currentNode=nextNode;
        }
        frontNode=priviousNode;*/

    }


}
