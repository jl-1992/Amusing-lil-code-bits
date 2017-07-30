#include <iostream>
using namespace std;

struct Node{
	Node * left;
	Node * right;
	int data;

	Node(Node*a, Node*b, int val){
		left=a;
		right=b;
		data=val;
	}
};

int minValue(Node * n)
{
	int min=n->data;

	if(n->left)
	{
		int newmin = minValue(n->left);
		if(newmin<min)
			min=newmin;
	}

	if(n->right)
	{
		int newmin= minValue(n->right);
		if(newmin<min)
			min=newmin;
	}

	return min;

}

int main()
{
	Node * a = new Node(nullptr,nullptr,39);
	Node * b = new Node(nullptr,nullptr,9);
	Node * c = new Node(nullptr,nullptr,4);
	Node * d = new Node(nullptr,nullptr,23);
	Node * e = new Node(a,nullptr,14);
	Node * g = new Node(b,c,103);
	Node * h = new Node(nullptr,nullptr,-3);
	Node * i = new Node(d,e,6);
	Node * j = new Node(nullptr,h,71);
	Node * l = new Node(h,g,11);
	Node * m = new Node(i,j,3);
	Node * n = new Node(j,l,5);
	Node * o = new Node(m,n,2);
	cout << minValue(o) << endl;
}
