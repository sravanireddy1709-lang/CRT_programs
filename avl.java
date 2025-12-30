class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("Inorder traversal before deletion:");
        tree.inorder(tree.root);

        tree.root = tree.delete(tree.root, 40);
        tree.root = tree.delete(tree.root, 50);


        System.out.println("\nInorder traversal after deletion of 40:");
        tree.inorder(tree.root);
    }
}

class Node {
    int data;
    int height;
    Node llink, rlink;

    Node(int data) {
        this.data = data;
        this.height = 1;
    }
}

class AVL {
    Node root;

    int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    int balanceFactor(Node node) {
        if (node == null)
            return 0;
        return height(node.llink) - height(node.rlink);
    }

    Node minvalue(Node node) {
        Node current = node;
        while (current.llink != null)
            current = current.llink;
        return current;
    }

    // Right Rotation (LL case)
    Node rlinkrotation(Node y) {
        Node x = y.llink;
        Node t = x.rlink;

        x.rlink = y;
        y.llink = t;

        y.height = Math.max(height(y.llink), height(y.rlink)) + 1;
        x.height = Math.max(height(x.llink), height(x.rlink)) + 1;

        return x;
    }

    // Left Rotation (RR case)
    Node llinkrotation(Node x) {
        Node y = x.rlink;
        Node t = y.llink;

        y.llink = x;
        x.rlink = t;

        x.height = Math.max(height(x.llink), height(x.rlink)) + 1;
        y.height = Math.max(height(y.llink), height(y.rlink)) + 1;

        return y;
    }

    Node insert(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (data < node.data)
            node.llink = insert(node.llink, data);
        else if (data > node.data)
            node.rlink = insert(node.rlink, data);
        else
            return node; // duplicates not allowed

        node.height = Math.max(height(node.llink), height(node.rlink)) + 1;

        int balance = balanceFactor(node);

        // LL Case
        if (balance > 1 && data < node.llink.data)
            return rlinkrotation(node);

        // RR Case
        if (balance < -1 && data > node.rlink.data)
            return llinkrotation(node);

        // LR Case
        if (balance > 1 && data > node.llink.data) {
            node.llink = llinkrotation(node.llink);
            return rlinkrotation(node);
        }

        // RL Case
        if (balance < -1 && data < node.rlink.data) {
            node.rlink = rlinkrotation(node.rlink);
            return llinkrotation(node);
        }

        return node;
    }

    Node delete(Node root, int key) {

        if (root == null)
            return root;

        if (key < root.data)
            root.llink = delete(root.llink, key);
        else if (key > root.data)
            root.rlink = delete(root.rlink, key);
        else {
            // Node with one or no child
            if (root.llink == null || root.rlink == null) {
                Node temp = (root.llink != null) ? root.llink : root.rlink;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } 
            // Node with two children
            else {
                Node temp = minvalue(root.rlink);
                root.data = temp.data;
                root.rlink = delete(root.rlink, temp.data);
            }
        }

        if (root == null)
            return root;

        root.height = Math.max(height(root.llink), height(root.rlink)) + 1;

        int balance = balanceFactor(root);

        // LL Case
        if (balance > 1 && balanceFactor(root.llink) >= 0)
            return rlinkrotation(root);

        // LR Case
        if (balance > 1 && balanceFactor(root.llink) < 0) {
            root.llink = llinkrotation(root.llink);
            return rlinkrotation(root);
        }

        // RR Case
        if (balance < -1 && balanceFactor(root.rlink) <= 0)
            return llinkrotation(root);

        // RL Case
        if (balance < -1 && balanceFactor(root.rlink) > 0) {
            root.rlink = rlinkrotation(root.rlink);
            return llinkrotation(root);
        }

        return root;
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.llink);
            System.out.print(node.data + " ");
            inorder(node.rlink);
        }
    }
}
