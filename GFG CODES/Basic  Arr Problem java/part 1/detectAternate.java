#include <stdio.h>
#include <stdlib.h>

// Define the structure for a node in the linked list
struct Node {
    int data;
    struct Node* next;
};

// Function to create a new node with the given data
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to insert a node at the beginning of the linked list
struct Node* insertAtBeginning(struct Node* head, int data) {
    struct Node* newNode = createNode(data);
    newNode->next = head;
    return newNode;
}

// Function to display the elements of the linked list
void displayList(struct Node* head) {
    struct Node* current = head;
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

void detectAternate(struct Node* head){
    if(head==NULL || head->next==NULL) return;
    
    struct Node* temp = head;
    while(temp != NULL && temp->next != NULL){
        temp->next = temp->next->next;
        temp = temp->next;
    }
}

int main() {
    // Initialize an empty linked list
    struct Node* head = NULL;

    // Insert elements into the linked list
     head = insertAtBeginning(head, 7);
      head = insertAtBeginning(head, 6);
     head = insertAtBeginning(head, 5);
    head = insertAtBeginning(head, 4);
     head = insertAtBeginning(head, 3);
    head = insertAtBeginning(head, 2);
    head = insertAtBeginning(head, 1);

    // Display the linked list
    printf("Linked List: ");
    displayList(head);
    
    detectAternate(head);
    printf("After detect Aternate list: ");
    displayList(head);

    return 0;
}


// Program output:
//   Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> NULL
// After detect Aternate list: 1 -> 3 -> 5 -> 7 -> NULL
