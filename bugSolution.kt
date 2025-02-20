fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list) 
}

This solution avoids in-place modification during iteration by first identifying all the even numbers using `filter` and storing them in a separate list, then removing them entirely from the original list using `removeAll`. This approach avoids skipping elements and ensures correct list modification.