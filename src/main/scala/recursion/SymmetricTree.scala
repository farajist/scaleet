package recursion

object SymmetricTree {
  def isSymmetric(root: TreeNode): Boolean = {
    def isMirror(p: TreeNode, q: TreeNode): Boolean =
      if (p == null && q == null) true
      else if (p == null || q == null) false
      else (p.value == q.value) && isMirror(p.left, q.right) && isMirror(p.right, q.left)

    if (root.left == null && root.right == null) return true
    isMirror(root.left, root.right)
  }


  def main(args: Array[String]): Unit = {
    print(isSymmetric(TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(2, TreeNode(3), TreeNode(3)))))
  }
}
