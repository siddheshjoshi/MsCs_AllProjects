import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class NodeTraversal {

	public static void main(String[] args) {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		// System.out.println("Inorder"); InorderTraversal(rootNode);

		// System.out.println("Pre-Order"); PreorderTraversal(rootNode);

		// System.out.println("Post-Order"); PostorderTraversal(rootNode);

		// System.out.println("Inorder_Iterative"); InorderIter(rootNode);

		// System.out.println("Pre-order_Iterative"); PreorderIter(rootNode);

		System.out.println("Post-order_Iterative");
		PostorderIter(rootNode);

	}

	private static void PostorderIter(TreeNode rootNode) { // left...right...root
		Stack<TreeNode> st = new Stack<TreeNode>();
		while (rootNode != null) {
			
			if(!st.empty()){
				TreeNode tn = st.pop();
				System.out.println(tn.val);
				rootNode = null;
			}

			if (rootNode.right != null) {
				st.push(rootNode.right);
				st.push(rootNode);
				rootNode = rootNode.left;
			}
			if (rootNode.right == null) {
				st.push(rootNode);
				rootNode = rootNode.left;
			}

		}

	}

	private static void PreorderIter(TreeNode rootNode) { // root...left...right

		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode tn = null;
		while (rootNode != null) {
			System.out.println(rootNode.val);

			if (rootNode.left == null && !st.empty()) {

				tn = st.pop();
				rootNode = tn.right;

			} else if (rootNode.left != null && rootNode.right != null) {
				st.push(rootNode);
				rootNode = rootNode.left;
			} else {
				rootNode = null;
			}
		}
	}

	private static void InorderIter(TreeNode rootNode) { // left..root...right

		if (rootNode == null)
			return;

		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode currentNode = rootNode;

		// Pop by doing: 1) Push Left child, 2) Print 3) Push Right Child
		while (!st.empty() || currentNode != null) {
			if (currentNode != null) {
				st.push(currentNode);
				currentNode = currentNode.left;
			} else {
				TreeNode t = st.pop();

				System.out.println(t.val);
				currentNode = t.right;
			}

		}
	}

	private static void PostorderTraversal(TreeNode rootNode) { // left, right,
																// root
		if (rootNode.left != null) {
			PostorderTraversal(rootNode.left);
		}
		if (rootNode.right != null) {
			PostorderTraversal(rootNode.right);
		}
		System.out.println(rootNode.val);

	}

	private static void PreorderTraversal(TreeNode rootNode) { // root, left,
																// right

		System.out.println(rootNode.val);
		if (rootNode.left != null) {
			PreorderTraversal(rootNode.left);
		}
		if (rootNode.right != null) {
			PreorderTraversal(rootNode.right);
		}

	}

	private static void InorderTraversal(TreeNode rootNode) { // left child ->
																// parent ->
																// right child

		if (rootNode.left != null) {
			InorderTraversal(rootNode.left);
		}
		System.out.println(rootNode.val);
		if (rootNode.right != null) {
			InorderTraversal(rootNode.right);
		}
	}

}