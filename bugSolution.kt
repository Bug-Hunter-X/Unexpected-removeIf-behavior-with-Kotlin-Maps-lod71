fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map.keys.removeIf { it > 2 }
    println(map) // Output: {1=one, 2=two}
    //Alternative:
    val map2 = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val keysToRemove = map2.filter { it.key > 2 }.keys
    keysToRemove.forEach{ map2.remove(it) }
    println(map2) // Output: {1=one, 2=two}
}