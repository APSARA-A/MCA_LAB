#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *left;
    struct node *right;
};

struct node *root = NULL;


struct node* createNode(int value) {
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = value;
    newnode->left = newnode->right = NULL;
    return newnode;
}

// Insert node based on user direction
void insert() {
    int value;
    printf("Enter value to insert: ");
    scanf("%d", &value);

    struct node *newnode = createNode(value);

    if (root == NULL) {
        root = newnode;
        printf("Root created with value %d\n", value);
        return;
    }

    struct node *temp = root;
    char dir;

    // Keep asking user for left/right direction until a NULL position is found
    while (1) {
        printf("Insert %d at Left or Right of %d? (L/R): ", value, temp->data);
        scanf(" %c", &dir);

        if (dir == 'L' || dir == 'l') {
            if (temp->left == NULL) {
                temp->left = newnode;
                printf("Inserted %d to LEFT of %d\n", value, temp->data);
                return;
            } else {
                temp = temp->left;
            }
        }
        else if (dir == 'R' || dir == 'r') {
            if (temp->right == NULL) {
                temp->right = newnode;
                printf("Inserted %d to RIGHT of %d\n", value, temp->data);
                return;
            } else {
                temp = temp->right;
            }
        }
        else {
            printf("Invalid choice! Enter L or R.\n");
        }
    }
}

// Find deepest-rightmost node
struct node* findDeepest(struct node *root) {
    if (root == NULL) return NULL;

    struct node *deep = NULL;
    struct node *queue[100];
    int front = 0, rear = 0;

    queue[rear++] = root;

    while (front < rear) {
        deep = queue[front++];
        if (deep->left)
            queue[rear++] = deep->left;
        if (deep->right)
            queue[rear++] = deep->right;
    }
    return deep;
}

// Delete deepest node
void deleteDeepest(struct node *root, struct node *deep) {
    if (root == NULL || deep == NULL) return;

    struct node *queue[100];
    int front = 0, rear = 0;
    queue[rear++] = root;

    while (front < rear) {
        struct node *temp = queue[front++];

        if (temp->left) {
            if (temp->left == deep) {
                temp->left = NULL;
                free(deep);
                return;
            }
            queue[rear++] = temp->left;
        }

        if (temp->right) {
            if (temp->right == deep) {
                temp->right = NULL;
                free(deep);
                return;
            }
            queue[rear++] = temp->right;
        }
    }
}

// Delete ANY node (not BST delete)
void deleteNode(int value) {
    if (root == NULL) {
        printf("Tree is empty!\n");
        return;
    }

    struct node *queue[100];
    int front = 0, rear = 0;
    queue[rear++] = root;

    struct node *temp, *target = NULL;

    // Find node to delete
    while (front < rear) {
        temp = queue[front++];
        if (temp->data == value)
            target = temp;

        if (temp->left)
            queue[rear++] = temp->left;
        if (temp->right)
            queue[rear++] = temp->right;
    }

    if (target == NULL) {
        printf("Node %d not found!\n", value);
        return;
    }

    // Find deepest node
    struct node *deep = findDeepest(root);

    // Replace target->data with deepest->data
    target->data = deep->data;

    // Delete deepest node
    deleteDeepest(root, deep);

    printf("Node %d deleted successfully.\n", value);
}

// Traversals
void inorder(struct node *root) {
    if (root != NULL) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

void preorder(struct node *root) {
    if (root != NULL) {
        printf("%d ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(struct node *root) {
    if (root != NULL) {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->data);
    }
}

// Menu
int main() {
    int choice, value;

    while (1) {
        printf("\n--- BINARY TREE MENU ---\n");
        printf("1. Insert Node\n");
        printf("2. Delete Node (delete ANY node)\n");
        printf("3. Inorder Traversal\n");
        printf("4. Preorder Traversal\n");
        printf("5. Postorder Traversal\n");
        printf("6. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                insert();
                break;

            case 2:
                printf("Enter value to delete: ");
                scanf("%d", &value);
                deleteNode(value);
                break;

            case 3:
                printf("Inorder: ");
                inorder(root);
                printf("\n");
                break;

            case 4:
                printf("Preorder: ");
                preorder(root);
                printf("\n");
                break;

            case 5:
                printf("Postorder: ");
                postorder(root);
                printf("\n");
                break;

            case 6:
                exit(0);

            default:
                printf("Invalid choice!\n");
        }
    }
}
