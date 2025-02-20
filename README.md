# Kotlin removeIf Bug

This repository demonstrates a subtle bug related to the use of the `removeIf` function with a `MutableList` in Kotlin.  The `removeIf` function modifies the list in place while iterating over it. This can lead to unexpected behavior and skipped elements if the removal process alters the list's indices.