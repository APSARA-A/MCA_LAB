#include <stdio.h>
#define SIZE 5   

int queue[SIZE];
int front = -1, rear = -1;

//check if queue is full
int isFull() {
    return (front == (rear + 1) % SIZE);
}

// Check if queue is empty
int isEmpty() {
    return (front == -1);
}


void enqueue(int value) {
    if (isFull()) {
        printf("Queue is Full\n");
        return;
    }

    if (isEmpty()) {
        front = rear = 0;
    } else {
        rear = (rear + 1) % SIZE;
    }

    queue[rear] = value;
    printf("%d inserted\n", value);
}


void dequeue() {
    if (isEmpty()) {
        printf("Queue is Empty\n");
        return;
    }

    int value = queue[front];

    if (front == rear) {   
        front = rear = -1;
    } else {
        front = (front + 1) % SIZE;
    }

    printf("%d deleted\n", value);
}


void peek() {
    if (isEmpty()) {
        printf("Queue is Empty\n");
    } else {
        printf("Front element = %d\n", queue[front]);
    }
}


void display() {
    if (isEmpty()) {
        printf("Queue is Empty\n");
        return;
    }

    printf("Circular Queue: ");
    int i = front;

    while (1) {
        printf("%d ", queue[i]);
        if (i == rear)
            break;
        i = (i + 1) % SIZE;
    }
    printf("\n");
}


int main() {
    int choice, value;

    while (1) {
        printf("\n--- CIRCULAR QUEUE MENU ---\n");
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value: ");
                scanf("%d", &value);
                enqueue(value);
                break;

            case 2:
                dequeue();
                break;

            case 3:
                peek();
                break;

            case 4:
                display();
                break;

            case 5:
                return 0;

            default:
                printf("Invalid choice!\n");
        }
    }
    return 0;
}
