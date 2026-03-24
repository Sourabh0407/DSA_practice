class ListNode
{
    private int data;
    private ListNode next;
    public ListNode()
    {
        data = 0;
        next = null;
    }

    public ListNode(int data)
    {
        this.data = data;
        next = null;
    }

    public ListNode(int data, ListNode next)
    {
        this.data = data;
        this.next = next;
    }
    public ListNode(final ListNode node)
    {
        this.data = node.getData();
        this.next = node.getNext();
    }
    public int getData()
    {
        return data;
    }
    public void setData(final int newData)
    {
        this.data = newData;
    }
    public ListNode getNext()
    {
        return next;
    }
    public void setNext(final ListNode nextNode)
    {
        this.next = nextNode;
    }
}

public class LinkedList
{
    private ListNode head;
    private ListNode tail;
    private int length;

    public LinkedList()
    {
        head = null;
        tail = null;
        length = 0;
    }

    public boolean insertAtHead(final int data)
    {
        ListNode newNode = new ListNode(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
            length+=1;
            return true;
        }

        newNode.setNext(head);
        head = newNode;
        length+=1;
        return true;
    }
    public boolean insertAtEnd(final int data)
    {
        ListNode newNode = new ListNode(data);
        if(tail == null && head == null)
        {
            head = newNode;
            tail = newNode;
            length+=1;
            return true;
        }

        tail.setNext(newNode);
        tail = newNode;
        length+=1;
        return true;
    }
    public boolean insertAtIndex(final int index, int data)
    {
        if(index < 0 || index > length)
        return false;

        if(index == 0)
        {
            insertAtHead(data);
            return true;
        }
        else if(index == length)
        {
            insertAtEnd(data);
            return true;
        }

        ListNode prevNode = getNodeAtIndex(index-1);
        if(prevNode != null)
        {
            ListNode newNode = new ListNode(data, prevNode.getNext());
            prevNode.setNext(newNode);
            length+=1;
            return true;
        }

        return false;
    }
    public ListNode getNodeAtIndex(final int index)
    {
        if(index < 0 || index > length)
        return null;

        ListNode nodeIterator = head;
        int currIndex = 0;

        while(nodeIterator != null)
        {
            if(currIndex == index)
                break;

            nodeIterator = nodeIterator.getNext();
            currIndex+=1;
        }

        return nodeIterator;
    }

    public String toString()
    {
        ListNode itr = head;

        StringBuilder str = new StringBuilder("List :");
       // System.out.println("\nList : ");
        while(itr != null)
        {
           // System.out.println(" -> "+itr.getData());
           str.append(itr.getData()+" -> ");
        }

        //System.out.println("null\n");
        str.append("null");

        return str.toString();
    }
    public static void main(String args[])
    {
        System.out.println("Hello");

        LinkedList list = new LinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(1);


        System.out.println(list);
    }
}