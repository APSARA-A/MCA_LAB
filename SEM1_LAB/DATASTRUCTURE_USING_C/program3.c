#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *prev;
    struct node *next;
};

struct node *head = NULL;


struct node* createNode(int value) {
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = value;
    newnode->prev = NULL;
    newnode->next = NULL;
    return newnode;
}


void insert_begin(int value) {
    struct node *newnode = createNode(value);

    if (head == NULL) {
        head = newnode;
    } else {
        newnode->next = head;
        head->prev = newnode;
        head = newnode;
    }
    printf("Inserted %d at beginning\n", value);
}


void insert_end(int value) {
    struct node *newnode = createNode(value);

    if (head == NULL) {
        head = newnode;
        return;
    }

    struct node *temp = head;
    while (temp->next != NULL)
        temp = temp->next;

    temp->next = newnode;
    newnode->prev = temp;

    printf("Inserted %d at end\n", value);
}


void delete_value(int value) {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }

    struct node *temp = head;

    // Search for the node
    while (temp != NULL && temp->data != value)
        temp = temp->next;

    if (temp == NULL) {
        printf("Value %d not found\n", value);
        return;
    }

    // If node is head
    if (temp == head) {
        head = temp->next;
        if (head != NULL)
            head->prev = NULL;
    }
    // If node is last
    else if (temp->next == NULL) {
        temp->prev->next = NULL;
    }
    // Middle node
    else {
        temp->prev->next = temp->next;
        temp->next->prev = temp->prev;
    }

    free(temp);
    printf("Deleted %d\n", value);
}


void traverse() {
    struct node *temp = head;

    if (temp == NULL) {
        printf("List is empty\n");
        return;
    }

    printf("List elements: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}


void count() {
    int c = 0;
    struct node *temp = head;

    while (temp != NULL) {
        c++;
        temp = temp->next;
    }

    printf("Total nodes = %d\n", c);
}


int main() {
    int choice, value;

    while (1) {
        printf("\n--- DOUBLY LINKED LIST MENU ---\n");
        printf("1. Insert at Beginning\n");
        printf("2. Insert at End\n");
        printf("3. Delete a Value\n");
        printf("4. Traverse\n");
        printf("5. Count Nodes\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value: ");
                scanf("%d", &value);
                insert_begin(value);
                break;

            case 2:
                printf("Enter value: ");
                scanf("%d", &value);
                insert_end(value);
                break;

            case 3:
                printf("Enter value to delete: ");
                scanf("%d", &value);
                delete_value(value);
                break;

            case 4:
                traverse();
                break;

            case 5:
                count();
                break;

            case 6:
                exit(0);

            default:
                printf("Invalid choice!\n");
        }
    }
    return 0;
}
