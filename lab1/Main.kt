fun testSorting() {
    val mas = arrayOf(8, 6, 9, 1, 45, 7, 3, 76)
    print("Original massive: ")
    for (i in mas) {
        print("$i ")
    }
    println()
    print("Sorted massive: ")
    for (i in insertionSort(mas)) {
        print("$i ")
    }
    println()
}

fun testBinaryTree() {
    val mas = arrayOf(8, 6, 7, 8, 12, 5, 5, 69, 7, 7, 13, 12)
    print("Original massive: ")
    for (i in mas) {
        print("$i ")
    }
    println()

    val bt = BinaryTree()
    for (i in mas) {
        bt.add(i)
    }
    println("Binary Tree: ")
    bt.showdata()
}

fun main(args: Array<String>) {
    // Задание на алгоритмы - 4
    // Задание на структуры - 16

    testSorting()
    // testBinaryTree()
}