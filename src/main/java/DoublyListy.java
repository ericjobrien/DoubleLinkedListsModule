public class DoublyListy {


    public Noders head;
    public Noders tail;

    public DoublyListy() {
        this.head = null;
        this.head = null;
    }

    public void addToHead(String data) {
        Noders newHead = new Noders(data);
        Noders currentHead = this.head;

        if(currentHead != null) {
            currentHead.setPreviousNoder(newHead);
            newHead.setNextNoder(currentHead);
        }

        this.head = newHead;

        if(this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        Noders newTail= new Noders(data);
        Noders currentTail = this.tail;

        if(currentTail != null) {
            currentTail.setNextNoder(newTail);
            newTail.setPreviousNoder(currentTail);
        }

        this.tail = newTail;

        if(this.head == null) {
            this.head = newTail;
        }
    }

    public String removeHead() {
        Noders removedHead = this.head;

        if(removedHead == null) {
            return null;
        }

        this.head = removedHead.getNextNoder();

        if(this.head != null) {
            this.head.setPreviousNoder(null);
        }

        if (removedHead == this.tail) {
            this.removeTail();
        }

        return removedHead.data;
    }

    public String removeTail() {
        Noders removedTail = this.tail;

        if(removedTail == null) {
            return null;
        }
        this.tail = removedTail.getPreviousNoder();

        if(this.tail != null) {
            this.tail.setNextNoder(null);
        }

        if(removedTail == this.head) {
            this.removeHead();
        }

        return removedTail.data;
    }

    public Noders removeByData(String data) {
        Noders nodeToRemove = null;
        Noders currentNode = this.head;

        while(currentNode != null) {
            if(currentNode.data == data) {
                nodeToRemove = currentNode;
                break;
            }
            currentNode = currentNode.getNextNoder();
        }

        if(nodeToRemove == null) {
            return null;
        }
        if(nodeToRemove == this.head) {
            this.removeHead();
        } else if(nodeToRemove == this.tail) {
            this.removeTail();
        } else {
            Noders nextNode = nodeToRemove.getNextNoder();
            Noders previousNode = nodeToRemove.getPreviousNoder();
            nextNode.setPreviousNoder(previousNode);
            previousNode.setNextNoder(nextNode);
        }

        return nodeToRemove;
    }

    public String printList() {
        Noders currentNode = this.head;
        String output = "<head> ";
        while(currentNode !=null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNoder();
        }

        output += "<tail>";
        System.out.println(output);
        return output;
    }

}
