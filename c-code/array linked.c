/* DS Linked list*/
#include <stdio.h>
#include <stdlib.h>
struct node   
{
    int data;
    struct node *next;
};


struct node* insert_beg(struct node* head, int x)
{
  struct node* temp =  (struct node*)malloc(sizeof (struct node));
  temp -> next  = NULL;
  temp -> data = x;
  
  if(head == NULL)
  {
      head = temp;
      return head;
  }
  else
  {
    temp -> next = head;
    head = temp;
    return head;
  }
  
}


int print(struct node* head)
{
    struct node* p = head;
    // while(head != NULL)  // if head is use to then  no acces while loop in linked list element
    while(p!=NULL)
    {
        printf("%d\n",p -> data);
        p = p -> next;
        // head = head -> next;
    }
}


int main()
{
    printf("begining liked list ");
    struct node *head = NULL;
    head = insert_beg(head, 5);
    head = insert_beg(head, 6);
    head = insert_beg(head, 7);
    head = insert_beg(head, 8);
    head = insert_beg(head, 9);
    head = insert_beg(head, 10);
    print(head);
    // struct node *temp = (struct node*)(malloc(size of(struct node))); // type casting structure
    // temp -> data = 5;
    // //(temp).data = 6;
    // temp -> next = NULL;
    
    // head = temp; // one element is insert 
    // struct node * temp2  = (struct node*)(malloc(size of(struct node)));
    // temp2 -> data = 7;
    // temp2 -> next = NULL;
    
    // temp -> next = temp2;
    printf("\n===================Program is end====================");
}
