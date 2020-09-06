#include<stdio.h>
#include<string.h>
int isPalindrome(char str[]) 
{ 
    int l = 0; 
    int h = strlen(str) - 1; 
    while (h > l) 
    { 
        if (str[l++] != str[h--]) 
        {
		return 0; 
        } 
    } 
    return 1;
}
int main() 
{ 
   char str[50];
   scanf("%s",str);
   printf("%d", isPalindrome(str)); 
   return 0; 
}