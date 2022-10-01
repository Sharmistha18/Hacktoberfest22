#include<stdio.h>
int main()
{
    char result[50];
    float num = 50.69;
    sprintf(result, "%f", num);
    printf("\n The string for the num is %s", result);
    getchar();
}
