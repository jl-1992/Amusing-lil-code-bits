#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int my_atoi(const char *str){
	int factor = 1;
	int val=0;
	int len = strlen(str);

	for(int i=0; i<len-1; ++i){
		++str;
	}

	while(len>=1){
		char c = *str;
		if((int) c < 48 || (int) c > 57){
			return 0;
		}
		val += factor * (c-'0');
		factor*=10;
		--str;
		--len;
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

   strcpy(str, "tutorialspoint.com");
   val = my_atoi(str);
   printf("String value = %s, Int value = %d\n", str, val);

   return(0);
}