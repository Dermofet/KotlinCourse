import kotlin.Exception

data class Node(val value: Int) {
    var left: Node? = null
    var right: Node? = null
    var count = 1
        set(value) {
            if (value < 0) throw Exception("NegativeCountException")
            field = value
        }

    fun setChild(child: Node) {
        if (child.value > value) {
            right = child
        } else {
            left = child
        }
    }
}

class BinaryTree(var root: Node? = null) {
    fun add(new: Node?) {
        if (new == null) return // check new

        if (root == null) { // check root
            root = new
            return
        }

        var isRepeat = false
        var curNode: Node? = root
        var parentNode: Node? = null
        while (curNode != null) { // search place for new node
            parentNode = curNode

            if (new.value > curNode.value) { // if value is more than current curNode
                curNode = curNode.right
                continue
            }

            // if value is less than current curNode
            if (new.value == curNode.value) { // if value equals current curNode
                curNode.count++
                isRepeat = true
                break
            }
            curNode = curNode.left
        }

        if (!isRepeat) parentNode?.setChild(new) // insert new node if node's value doesn't repeat
    }

    fun add(newValue: Int) {
        val node = Node(newValue)
        add(node)
    }

    fun showdata(node: Node? = root) {
        if (node != null) {
            showdata(node.right)
            println("Value = ${node.value}, count = ${node.count}")
            showdata(node.left)
        }
    }
}