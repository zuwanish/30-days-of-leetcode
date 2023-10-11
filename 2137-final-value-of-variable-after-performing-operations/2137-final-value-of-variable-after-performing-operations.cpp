class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int x = 0;
        int size = operations.size();
        for(int i = 0;i<size;i++){
         if(operations.at(i)=="X++" || operations.at(i)=="++X"){
             x++;
         }
         else{
             x--;
         }   
        }
        return x;

    }
};