/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 
 void Postorder(struct TreeNode* root,int *arr,int *index){
    if(root==NULL)
    return;

    Postorder(root->left,arr,index);
    Postorder(root->right,arr,index);
    arr[(*index)++]=root->val;
 }

int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize=0;
    int *arr=malloc(100*sizeof(int));
    int index=0;

    Postorder(root,arr,&index);
    *returnSize=index;
    
    return arr;
}