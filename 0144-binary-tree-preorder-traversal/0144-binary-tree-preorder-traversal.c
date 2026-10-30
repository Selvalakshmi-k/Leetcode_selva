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

void preorder(struct TreeNode* root,int *arr,int *index){
    if(root==NULL)
    return;

    arr[(*index)++]=root->val;
    preorder(root->left,arr,index);
    preorder(root->right,arr,index);
}

int* preorderTraversal(struct TreeNode* root, int* returnSize) {

    *returnSize=0;
    int index=0;
    int *arr=malloc(100*sizeof(int));

    preorder(root,arr,&index);
    *returnSize=index;
    return arr;
}