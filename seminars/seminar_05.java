// Структура данных для хранения узла бинарного дерева
class Node {
	int data;
	Node left, right;

	// Функция для создания нового узла бинарного дерева с заданным ключом
	public Node(int key) {
		data = key;
		left = right = null;
	}
}

class Main {
	// Рекурсивная функция для обхода дерева в обратном порядке
	public static void postorder(Node root) {
		// возврат, если текущий узел пуст
		if (root == null) {
			return;
		
		}

		// Обходим левое поддерево
		postorder(root.left);

		// Обходим правое поддерево
		postorder(root.right);

		// Отображение части данных корня (или текущего узла)
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		/*
		 * Построим следующее дерево
		 *         1
		 *        / \
		 *       /   \
		 *      2     3
		 *     /     / \
		 *    /     /   \
		 *   4     5     6
		 *        / \
		 *       /   \
		 *      7     8
		 */

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);

		postorder(root);
	}
}
