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
	Node * d = new Node(nullptr,a,23);
	Node * e = new Node(nullptr,nullptr,14);
	Node * f = new Node(b,c,103);
	Node * g = new Node(nullptr,nullptr,-3);
	Node * h = new Node(d,e,6);
	Node * i = new Node(nullptr,nullptr,71);
	Node * j = new Node(g,f,11);
	Node * k = new Node(h,i,3);
	Node * l = new Node(nullptr,j,5);
	Node * m = new Node(k,l,2);
	cout << maxValue(m) << endl;
}
