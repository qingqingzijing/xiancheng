#include <iostream.h>
#include <malloc.h>
#include <stdlib.h>
#define LS(a,b) ((a)<(b))
#define LL(a,b) ((a)>(b))
#define MAXSIZE 1000
typedef int KeyType;
typedef struct 
{
    int key;
}RedType;
typedef struct
{
    RedType r[MAXSIZE+1];
    int length;
}SqList;
typedef SqList HeapType;
int compare=0;
int change=0;
int Create_Sq(SqList &L)
{
    int i,k;
    cout<<"���������������ĸ���:";
    cin>>k;
    L.length=k;
    for(i=1;i<=k;++i)
    {
        
        L.r[i].key=rand();
    }
    return 1;
}
void Bubble_sort(SqList &L)
{//ð������
    int i,j,l,k=L.length;
    for(i=1;i<=L.length-1;++i)
    {
          for(j=1;j<=k-1;++j)
          {
               ++compare;
               if(LL(L.r[j].key,L.r[j+1].key))
               {
                    l=L.r[j].key;
                    L.r[j].key=L.r[j+1].key;
                    L.r[j+1].key=l;
                    ++change;
                }
          }
          --k;
    }
    cout<<endl<<"-----ð������������-----"<<endl;
    for(i=1;i<=L.length;i++)
      cout<<" "<<L.r[i].key;
    cout<<endl;
    cout<<"ð������ıȽϴ���:";
    cout<<compare<<endl;
    cout<<"ð������Ľ�������:";
    cout<<change<<endl;
        compare=0;
    change=0; 
} 
void InsertSort(SqList &L)
{//ֱ�Ӳ�������
    int i,j;
    cout<<endl;
    for(i=2;i<=L.length;++i)
      if(LS(L.r[i].key,L.r[i-1].key))
      {
           ++compare;
           ++change;
           L.r[0]=L.r[i];
           L.r[i]=L.r[i-1];
           for(j=i-2;LS(L.r[0].key,L.r[j].key);--j)
           {
                ++compare;
                L.r[j+1]=L.r[j];
           }
           L.r[j+1]=L.r[0];
      }
    cout<<"-----ֱ�Ӳ�������������-----"<<endl;
    for(i=1;i<=L.length;i++)
      cout<<" "<<L.r[i].key;
    cout<<endl;
    cout<<"ֱ�Ӳ�������ıȽϴ���:";
    cout<<compare<<endl;
    cout<<"ֱ�Ӳ�������Ľ�������:";
    cout<<change<<endl;
    compare=0;
    change=0; 
} 
void SelectSort(SqList &L)
{//��ѡ������
    int l,i,j;
    cout<<endl;
    for(i=1;i<L.length;++i)
    {
          L.r[0]=L.r[i];
          j=i+1;
          l=i;
          for(j;j<=L.length;++j)
          {
               ++compare;
               if(LL(L.r[0].key,L.r[j].key))
               {
                    l=j;
                    L.r[0]=L.r[j];
               }
          }
           if(l!=i)
          {
                ++change;
                L.r[l]=L.r[i];
                L.r[i]=L.r[0];
          }
    }

