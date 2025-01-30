# Unexpected removeIf behavior with Kotlin Maps

This example demonstrates unexpected behavior when using the `removeIf` function on a Kotlin `MutableMap`. Unlike `MutableList` and `MutableSet`, `removeIf` on `MutableMap` modifies the collection in an unexpected manner. This may lead to subtle bugs and can be difficult to debug.

The file `bug.kt` shows the unexpected behavior. The solution is to use the more standard remove operation rather than `removeIf` in the case of Maps.

The file `bugSolution.kt` provides a corrected version demonstrating the safer approach.