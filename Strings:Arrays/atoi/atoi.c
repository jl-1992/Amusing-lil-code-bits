#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int my_atoi(const char *str){
	int len = strlen(str);
	int factor = pow(10,len-1);
	int val=0;

	for(int i=0; i<len; ++i){
		char c = *str;
		if(c < 48 || c > 57){
			return 0;
		}
		val += factor * (c-'0');
		factor/=10;
		++str;
	}

	return val;
}

int main()
{
   int val;
   char str[20];
   
   strcpy(str, "98993489");
   val = my_atoi(str);
   printf("String value = %s, Int value = %d\n", str, val);

   strcpy(str, "Not a number");
   val = my_atoi(str);
   printf("String value = %s, Int value = %d\n", str, val);

   return(0);
}