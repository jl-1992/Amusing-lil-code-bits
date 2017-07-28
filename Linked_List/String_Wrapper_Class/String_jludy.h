#include <iostream>
using namespace std;
class String
  {
  public:
    String( const char * s = "")
      :head(nullptr)
    {
      head = Node::stringToList(s);
    }
    String( const String & s ){
      head = Node::copy(s.head);
    }
    String operator = ( const String & s ){
      Node::deleteList(head);
      head = Node::copy(s.head);

      return *this;
    }
    char & operator [] ( const int index ){
      Node *p=head;
      if(inBounds(index)){
        for(int i=0;i<index;++i){
          p=p->next;}
        }
        else{
          cout << "Out of Bounds";
          static char c = '\0';
          return c;}

      return p->info;
    }
    int length() const {
      return Node::length(head);
    }
    int indexOf( char c ) const{
      int i=0;
      for(Node *p =head;p!=nullptr;p=p->next){
        if(p->info==c)
          return i;
        else
          ++i;
      }
      return -1;
    }
    bool operator == ( const String & s ) const{
      return Node::equal(head,s.head);
    }
    bool operator < ( const String & s ) const{
      int a = Node::compare(head,s.head);
      if(a==0)
        return false;
      else
        return true;
    }
    String operator + ( const String & s ) const{
      String t;
      t.head = Node::concat(head,s.head);

      return t;
    }
    String operator += ( const String & s ){
      Node * a = Node::copy(head);
      Node::deleteList(head);
      head = Node::concat(a,s.head);
      Node::deleteList(a);

      return *this;
    }
    void print( ostream & out ){
      for(Node *p =head;p!=nullptr;p=p->next){
        out << p->info;
      }
    }
    void read(istream & in){
      char * a = new char[50];
      in>>a;
      Node::deleteList(head);
      head = Node::stringToList(a);
      delete [] a;
    }

    String reverse(){
      head=Node::reverse(head);
      return *this;
    }
    ~String(){
      Node::deleteList(head);
    }
  private:
    bool inBounds( int i )
    {
      return i >= 0 && i < length();
    }
    struct Node
    {
      char info;
      Node * next;
      Node(char newInfo, Node * newNext)
        : info(newInfo), next(newNext)
      {
      }
      static Node * stringToList(const char *s){
        return *s=='\0' ? nullptr : new Node(*s, stringToList(s+1));
      }
      static Node * copy(Node * L){
        return !L ? nullptr : new Node(L->info,copy(L->next));
      }
      static bool equal(Node * L1, Node * L2){
        return !L1 && !L2 ? true : (!L1 && L2!=nullptr) || (!L2 && L1!=nullptr) ? false : L1->info == L2->info ? equal(L1->next,L2->next) : false;
      }
      static Node * concat(Node * L1, Node * L2){
        return !L1 ? copy(L2) : new Node(L1->info, concat(L1->next,L2));
      }
      static int compare(Node * L1, Node * L2){
        if(equal(L1,L2))
          return 0;
        return (!L1 && L2!=nullptr) ? -1 : (!L2 && L1!=nullptr) ? 0 : L1->info>L2->info ? 0 : L1->info < L2->info ? -1 : compare(L1->next,L2->next);
      }
      static int length(Node * L){
        return !L ? 0 : 1 + length(L->next);
      }
      static Node * reverse(Node * L){
          Node * next;
           Node * cursor=nullptr;
            while(L){
              next=L->next;
              L->next = cursor;
              cursor=L;
              L=next;
    }
    
      return cursor;
      }
      static void deleteList(Node * L){
        Node *temp=L;
      while(temp!=nullptr){
        L=L->next;
        delete temp;
        temp =L;
       }
      }
    };
    Node * head;
  };
  ostream & operator << ( ostream & out, String str ){
    str.print(out);
    return out;
  }
  istream & operator >> ( istream & in, String & str ){
    str.read(in);
    return in;
  }