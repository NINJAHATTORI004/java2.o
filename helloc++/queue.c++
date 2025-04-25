#include<bits/stdc++.h>
using namespace std;
int main(){

    freopen("output.txt","w",stdout);
    deque<int>dq(10);

    cout<<"Size of deque: "<<dq.size()<<endl;
    for(int i=0;i<10;i++){
        dq[i]=i;
    }
    dq.push_back(120);
    dq.push_front(125); 
    for(int i<0;i<10;i++){
        cout<<dq[i]<<" ";
    }
    cout<<endl; 
    for(auto x:dq){
        cout<<x<<" ";
    }
}