#include <stdio.h>
#include <stdlib.h>

int main(){
    int m[3][4];
    int **m2;
    int i,j;
    m2 = (int **) malloc (3* sizeof (int *));
    for(i=0;i<3;i++){
        printf("%p",m2[i]);
    }
    for(i=0; i<3; i++){
        m2[i] = (int *) malloc(4* sizeof(int));
    }
    return 0;
}