#include <stdio.h>
#include <stdlib.h>
int main(){
    // int *v = (int *) malloc(2000000 * sizeof(int));
    int i, v[10];
    for(i = 0; i<10; i++){
        printf("%d", v[i]);
    }
    printf("foi\n");
    return 0;
}