import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class day3
{
    public static String serialize(TreeNode root) {
        return serializer(root,"");
    }
    
    private static String serializer(TreeNode root, String str){
        if (root == null){
            str +="null,";
            return str;
        }
        // preorder add node
        str += root.val + ",";
        str = serializer(root.left, str);
        str = serializer(root.right, str);
        
        return str;
        
        
    }

    public static TreeNode deserialize(String data) {
        String[] data_ = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(data_));
        return deserializer(list);
    }
    
    private static TreeNode deserializer(List<String> list){
        if (list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        
        int val = Integer.valueOf(list.get(0));
        TreeNode root = new TreeNode(val);
        list.remove(0);
        
        root.left = deserializer(list);
        root.right = deserializer(list);
        
        return root; 
    }
    private static void inOrder(TreeNode node) {
        if (node == null) {
          return;
        }
    
        inOrder(node.left);
        System.out.printf("%s -> ", node.val);
        inOrder(node.right);
    }


	public static void main(String[] args) {
		TreeNode tree = new TreeNode(20);
		tree.left = new TreeNode(15);
		tree.right = new TreeNode(30);
		tree.left.left = new TreeNode(12);
		tree.left.right = new TreeNode(18);
		tree.right.left =new TreeNode(25);
		tree.right.right = new TreeNode(38);
		tree.right.right.left= new TreeNode(34);
		String srlstr = serialize(tree);
		System.out.println(srlstr);
		TreeNode destree = deserialize(srlstr);
		System.out.println("Inorder traversal of deserialised tree:");
		inOrder(destree);
	}
}
