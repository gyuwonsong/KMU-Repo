#include <iostream>
using namespace std;

struct node{
    char left;
    char right;
};
node tree[26];

void preorder(char rt){
        if(rt == '.') return;

        cout << rt;
        preorder(tree[rt].left);
        preorder(tree[rt].right);
}

void inorder(char rt){
        if(rt == '.') return;

        inorder(tree[rt].left);
        cout << rt;
        inorder(tree[rt].right);
}

void postorder(char rt){
        if(rt == '.') return;

        postorder(tree[rt].left);
        postorder(tree[rt].right);
        cout << rt;
}

int main(){
    int TestCase;
    cin >> TestCase;

   for(int i=0; i<TestCase; i++){
        char p, l, r;
        cin >> p >> l >> r;

        tree[p].left = l;
        tree[p].right = r;
   }

   preorder('A');
   cout << endl;
   inorder('A');
   cout << endl;
   postorder('A');
   cout << endl;
}