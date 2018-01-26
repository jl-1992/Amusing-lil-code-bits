#include <iostream>
#include <map>
#include <cmath>
using namespace std;

void pairAdd(int arr[], int target){
	map<int, int> m;

	for(int i=0; i<8; i++){
		if(m[arr[i]]==0){
			m[arr[i]]=1;
		}
		else
			++m[arr[i]];
	}

	for(auto it=m.begin(); it!=m.end(); it++){
		int diff = target-(it->first);
		if(m[diff]>0 && it->second>0){
			cout << it->first << "," << diff << endl;
			--m[diff];
			--m[it->first];
		}
	}
}

int main(){
	int arr[] = {0,0,5,2,11,5,7,7};
	pairAdd(arr,7);
}