#include<iostream>
using namespace std;

void deleteElement(int arr[], int size, int position) {
    if(position < 0 || position >= size) {
        return;
    }
    for(int i = position;i<size-1;i++) {
        arr[i] = arr[i+1];
    }
}

void Print(int arr[], int size) {
    for(int i=0;i<size;i++) {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main() {
    int arr[] = {2,3,4,5,6};
    int size = sizeof(arr)/sizeof(arr[0]);

    int position = 2;

    deleteElement(arr,size,position);

    Print(arr,size);
}