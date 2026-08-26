# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSymmetric(self, root):
        if root is None:
            return True
        return self.isMirror(root.left, root.right)
    def isMirror(self,p,q):
        if p is None and q is None:
            return True
        if p is None or q is None:
            return False
        return (p.val == q.val and
                self.isMirror(p.left, q.right) and
                self.isMirror(p.right, q.left))  