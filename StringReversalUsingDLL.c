#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Structure required for doubly linked list
struct Node{
    char string[20];
    struct Node *next;
    struct Node *prev;
};

    struct Node *front,*rear;

//Function to Create the string
void createString(){
    char choice='y';
    char ch;
    struct Node *temp;
    printf("\nCreating a String...");

    //Creates the string with doubly linked list taking one word at each iteration
    while(choice=='y'){
    temp = (struct Node*)malloc(sizeof(struct Node));
    if(temp!=NULL){
    printf("\nEnter the string : ");
    //Input word
    scanf("%s",temp->string);
    ch = getchar();
    temp->next = NULL;
    if(front==NULL){
        front = temp;
        rear = temp;
    }
    else{
        rear->next = temp;
        temp->prev = rear;
        rear = temp;
    }

    //Takes user's choice to continue
    printf("\nWant to continue?(y/n) : ");
    scanf("%c",&choice);
    ch = getchar();


    }

    else
        printf("\nCannot allocate memmory");
    }
}

//Function to Reverse the strings
void reverseString(){
    char temp[20];
    struct Node *start,*end;
    start = front;
    end = rear;
    //Reverses the doubly linked list first
    while(start != end && start->next!=end){
    strcpy(temp,start->string);
    strcpy(start->string,end->string);
    strcpy(end->string,temp);
    start = start->next;
    end = end->prev;
    }
    //Reverses each string in the doubly linked list
    start = front;
    while(start != NULL){
        strrev(start->string);
        start = start->next;
    }
}

//Function to Display the string
void displayString(){
    struct Node *temp;
    temp = front;
    printf("\n");
    while(temp != NULL){
        printf("%s ",temp->string);
        temp = temp->next;
    }
}

//Main function from where Execution starts
int main()
{
    //Allocate the memory to both the structure variables
   front = (struct Node*)malloc(sizeof(struct Node));
   rear = (struct Node*)malloc(sizeof(struct Node));
   //Initialize both the variables to NULL
   front = NULL;
   rear = NULL;
   //Create string with doubly linked list
   createString();
   printf("\nOriginal String is : ");
   displayString();
   printf("\n");
   //Reverse the doubly linked list first then reverse each string from each node
   reverseString();
   printf("\nReversed String is : ");
   displayString();
   printf("\n\n");
    return 0;
}
