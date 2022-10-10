// Сортировка вставками
fun <T> Array<T>.swap(first: Int, second: Int) {
    val buf: T = this[first]
    this[first] = this[second]
    this[second] = buf
    // print("this[$first] = ${this[first]}, this[$second] = ${this[second]}")
    //println()
}

fun insertionSort(mas: Array<Int>): Array<Int> {
    for (i in mas.indices) {
        var curI: Int = i
        if (curI > 0) {
            while (mas[curI] < mas[curI - 1]) {
                mas.swap(curI, curI - 1)
                --curI
                if (curI == 0) break
            }
        }
    }
    return mas
}
