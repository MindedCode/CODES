class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode currentNode = new ListNode(0);// create a node to store current result;
        ListNode dummyNode = currentNode;// use this node as dummy node, we will use this node to point to the head of the result linkedlist.
        int carry = 0;// this is to store the carry when we add two number together
        
        while(l1!=null || l2!=null){ // when the list is not empty
            int res =0;
            if(l1==null){ // 
                res = l2.val+carry;
                l2 = l2.next;
            }
            else if(l2==null){
                res = l1.val+carry;
                l1 = l1.next;
            }else{
                res = l1.val+l2.val+carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(res<10){
                ListNode node = new ListNode(res);
                currentNode.next = node;
                currentNode = node;
                carry = 0;
            }else{
                ListNode node = new ListNode(res%10);
                currentNode.next = node;
                currentNode = node;
                carry = res/10;
            }
            
        }
        
        if(carry>0){
            ListNode node = new ListNode(1);
            currentNode.next=node;
        }
        return dummyNode.next;
    }
    
}
