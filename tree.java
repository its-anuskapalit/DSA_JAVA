/* a child can have a single parent*/
//class TreeNode{
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int val){
//        this.val=val;
//        this.left=null;
//        this.right=null;
//    }
//}
//class Tree{
//    public static void inorder(TreeNode root){
//        if(root==null) return;
//        inorder(root.left);
//        System.out.print(root.val+"->");
//        inorder(root.right);
//    }
//    public static void preorder(TreeNode root){
//        if(root==null) return;
//        System.out.print(root.val+"->");
//        preorder(root.left);
//        preorder(root.right);
//    }
//    public static void postorder(TreeNode root){
//        if(root==null) return;
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.val+"->");
//    }
//    public static void main(String args[]){
//        TreeNode root = new TreeNode(1);
//        TreeNode l = new TreeNode(2);
//        TreeNode l1 = new TreeNode(4);
//        TreeNode l2 = new TreeNode(5);
//        TreeNode r = new TreeNode(3);
//        TreeNode r1 = new TreeNode(6);
//        TreeNode r2 = new TreeNode(7);
//        root.left = l;
//        root.right = r;
//        l.left=l1;
//        l.right=l2;
//        r.left=r1;
//        r.right=r2;
//        System.out.println("INORDER");
//        inorder(root);
//        System.out.println("PREORDER");
//        preorder(root);
//        System.out.println("PostORDER");
//        postorder(root);
//    }
//}
//========================================================================
//class TreeNode{
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int val){
//        this.val=val;
//        this.left=null;
//        this.right=null;
//    }
//}
//class Tree{
//    public static int countnodes(TreeNode root){
//        if(root==null) return 0;
//        return 1+countnodes(root.right)+ countnodes(root.left);
//    }
//    public static int max(TreeNode root){
//        if(root==null) return Integer.MIN_VALUE;
//        int leftmax=max(root.left);
//        int rightmax=max(root.right);
//        return Math.max(root.val, Math.max(leftmax,rightmax));
//    }
//    public static int min(TreeNode  root){
//        if(root==null) return Integer.MAX_VALUE;
//        int leftmin=min(root.left);
//        int rightmin=min(root.right);
//        return Math.min(root.val,Math.min(leftmin,rightmin));
//    }
//    public static int sum(TreeNode root){
//        if(root==null) return 0;
//        return root.val+sum(root.right)+sum(root.left);
//    }
//    public static int heightInNodes(TreeNode root){
//        if(root==null) return 0;
//        int leftH=heightInNodes(root.left);
//        int rightH=heightInNodes(root.right);
//        return 1+Math.max(leftH,rightH);
//    }
//    public static int heightInEdges(TreeNode root) {
//        if (root == null) return -1;
//        int leftHeight = heightInEdges(root.left);
//        int rightHeight = heightInEdges(root.right);
//        return 1 + Math.max(leftHeight, rightHeight);
//    }
//
//    public static void main(String args[]){
//        TreeNode root = new TreeNode(1);
//        TreeNode l = new TreeNode(2);
//        TreeNode l1 = new TreeNode(4);
//        TreeNode l2 = new TreeNode(15);
//        TreeNode r = new TreeNode(3);
//        TreeNode r1 = new TreeNode(6);
//        TreeNode r2 = new TreeNode(7);
//        root.left = l;
//        root.right = r;
//        l.left=l1;
//        l.right=l2;
//        r.left=r1;
//        r.right=r2;
//      System.out.println("count of nodes: "+countnodes(root));
//      System.out.println("max of nodes: "+max(root));
//      System.out.println("min of nodes: "+min(root));
//      System.out.println("sum of nodes: "+sum(root));
//      System.out.println("height of nodes: "+heightInNodes(root));
//      System.out.println("height of nodes: "+heightInEdges(root));
//    }
//}

////========================================================================
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int val) {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//class Tree {
//    public static boolean compare(TreeNode root, TreeNode root2) {
//        if (root == null && root2 == null) return true;
//        if (root == null || root2 == null) return false;
//        if (root.val != root2.val) return false;
//        return compare(root.left, root2.left) && compare(root.right, root2.right);
//    }
//
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        TreeNode l = new TreeNode(2);
//        TreeNode r = new TreeNode(3);
//        root.left = l;
//        root.right = r;
//
//        TreeNode root2 = new TreeNode(1);
//        TreeNode l2 = new TreeNode(2);
//        TreeNode r2 = new TreeNode(3);  // Different value from r (3)
//        root2.left = l2;
//        root2.right = r2;
//        System.out.println(compare(root, root2));  // Output: false
//    }
//}


////========================LEVEL ORDER TRAVESAL(BFS)================================================
////queue
//class TreeNode{
//    int val;
//    TreeNode left,right;
//    TreeNode(int val){
//        this.val=val;
//        this.left=this.right=null;
//    }
//}
//class Tree{
//    public static void bfs(TreeNode root){
//        if(root==null) return;
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            TreeNode curr=queue.poll();
//            System.out.print(curr.val+" ");
//            if(curr.left!=null)
//                queue.add(curr.left);
//            if(curr.right!=null)
//                queue.add(curr.right);
//
//        }
//    }
//    public static void main(String[] args){
//        TreeNode root=new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//
//        System.out.print("BFS (Level Order): ");
//        bfs(root);
//    }
//}

////========================(DFS)================================================

//class TreeNode {
//    int val;
//    TreeNode left, right;
//    TreeNode(int val) {
//        this.val = val;
//        this.left = this.right = null;
//    }
//}
//class Tree {
//    public static void dfs(TreeNode root) {
//        if (root == null) return;
//
//        Stack<TreeNode> s = new Stack<>();
//        s.push(root);
//
//        while (!s.isEmpty()) {
//            TreeNode curr = s.pop();
//            System.out.println(curr.val); 
//
//            // Push right first so left gets processed first (LIFO)
//            if (curr.right != null) s.push(curr.right);
//            if (curr.left != null) s.push(curr.left);
//        }
//    }
//
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//
//        System.out.println("DFS (Preorder): ");
//        dfs(root);
//    }
//}
