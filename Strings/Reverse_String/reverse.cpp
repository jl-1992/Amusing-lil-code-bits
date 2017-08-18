#include <iostream>
using namespace std;


void string_reverse(char *string){
	char *start = string;
	char *end = string;
	char temp;
		while(*end){
			++end;
		}
		--end;
		while(start < end){
			temp = *start;
			*start = *end;
			*end=temp;
			++start;
			--end;
		}
}

int main(){
	char c[] = "Hello";
	cout << c << endl;
	string_reverse(c);
	cout << c << endl;

	return 0;
}