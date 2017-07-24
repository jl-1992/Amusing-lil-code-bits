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

int maxValue(Node * n)
{
	int max= n->data;

	if(n->left)
	{
		int newmax = maxValue(n->left);
		if(newmax>max)
			max=newmax;
	}

	if(n->right)
	{
		int newmax = maxValue(n->right);
		if(newmax>max)
			max=newmax;
	}

	return max;

}

int main()
{
	Node * a = new Node(nullptr,nullptr,39);
	Node * b = new Node(nullptr,nullptr,9);
	Node * c = new Node(nullptr,nullptr,4);
	Node * d = new Node(nullptr,nullptr,23);
	Node * e = new Node(a,nullptr,14);
	Node * f = new Node(nullptr,nullptr,102);
	Node * g = new Node(b,c,103);
	Node * h = new Node(nullptr,nullptr,-3);
	Node * i = new Node(d,e,6);
	Node * j = new Node(nullptr,h,71);
	Node * l = new Node(f,g,11);
	Node * m = new Node(i,j,3);
	Node * n = new Node(j,l,5);
	Node * o = new Node(m,n,2);
	cout << maxValue(o) << endl;
}
