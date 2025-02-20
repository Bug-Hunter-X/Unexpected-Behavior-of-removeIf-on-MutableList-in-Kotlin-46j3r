fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code intends to remove even numbers from a list, but it has a subtle issue. The `removeIf` function modifies the list while iterating over it. This can cause unexpected behavior if the elements are not removed in order and can lead to skipping some elements in the list.